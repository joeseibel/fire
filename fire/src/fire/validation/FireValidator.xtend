package fire.validation

import com.google.inject.Inject
import fire.fire.AdditiveExpression
import fire.fire.AndExpression
import fire.fire.AssignmentStatement
import fire.fire.BuiltInType
import fire.fire.ComparisonExpression
import fire.fire.ElseIfExpression
import fire.fire.ElseIfStatement
import fire.fire.ElseStatement
import fire.fire.EqualityExpression
import fire.fire.FirePackage
import fire.fire.IdExpression
import fire.fire.IfExpression
import fire.fire.IfStatement
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.OrExpression
import fire.fire.Program
import fire.fire.VariableDeclaration
import fire.fire.WhileLoop
import fire.fire.XorExpression
import fire.services.FireGrammarAccess
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

import static extension fire.FireUtil.getType
import static extension org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer.find
import static extension org.eclipse.emf.ecore.util.EcoreUtil.isAncestor
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode

class FireValidator extends AbstractFireValidator {
	@Inject
	FireGrammarAccess grammarAccess
	
	@Check
	def void checkDuplicateNames(VariableDeclaration variable) {
		if (isDuplicateDeclaration(variable.eContainer, variable)) {
			error(variable.name + " is already declared", variable, FirePackage.Literals.VARIABLE_DECLARATION__NAME)
		}
	}
	
	def private static dispatch boolean isDuplicateDeclaration(Program parent, VariableDeclaration variable) {
		parent.statements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
	}
	
	def private static dispatch boolean isDuplicateDeclaration(WhileLoop whileLoop, VariableDeclaration variable) {
		val localDuplicate = whileLoop.statements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
		localDuplicate || isDuplicateDeclaration(whileLoop.eContainer, variable)
	}
	
	def private static dispatch boolean isDuplicateDeclaration(IfStatement ifStatement, VariableDeclaration variable) {
		if (ifStatement.thenStatements.exists[isAncestor(variable)]) {
			val localDuplicate = ifStatement.thenStatements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
			localDuplicate || isDuplicateDeclaration(ifStatement.eContainer, variable)
		} else {
			isDuplicateDeclaration(ifStatement.eContainer, variable)
		}
	}
	
	def private static dispatch boolean isDuplicateDeclaration(ElseIfStatement elseIfStatement, VariableDeclaration variable) {
		val localDuplicate = elseIfStatement.thenStatements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
		localDuplicate || isDuplicateDeclaration(elseIfStatement.eContainer, variable)
	}
	
	def private static dispatch boolean isDuplicateDeclaration(ElseStatement elseStatement, VariableDeclaration variable) {
		val localDuplicate = elseStatement.elseStatements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
		localDuplicate || isDuplicateDeclaration(elseStatement.eContainer, variable)
	}
	
	def private static dispatch boolean isDuplicateDeclaration(IfExpression ifExpression, VariableDeclaration variable) {
		if (ifExpression.thenStatements.exists[isAncestor(variable)]) {
			val localDuplicate = ifExpression.thenStatements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
			localDuplicate || isDuplicateDeclaration(ifExpression.eContainer, variable)
		} else if (ifExpression.elseStatements.exists[isAncestor(variable)]) {
			val localDuplicate = ifExpression.elseStatements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
			localDuplicate || isDuplicateDeclaration(ifExpression.eContainer, variable)
		} else {
			isDuplicateDeclaration(ifExpression.eContainer, variable)
		}
	}
	
	def private static dispatch boolean isDuplicateDeclaration(ElseIfExpression elseIfExpression, VariableDeclaration variable) {
		val localDuplicate = elseIfExpression.thenStatements.takeWhile[!isAncestor(variable)].filter(VariableDeclaration).exists[name == variable.name]
		localDuplicate || isDuplicateDeclaration(elseIfExpression.eContainer, variable)
	}
	
	def private static dispatch boolean isDuplicateDeclaration(EObject eObject, VariableDeclaration variable) {
		isDuplicateDeclaration(eObject.eContainer, variable)
	}
	
	@Check
	def void typeCheckVariableDeclaration(VariableDeclaration variable) {
		val valueType = variable.value?.type
		if (valueType != null && variable.type != null && valueType != variable.type) {
			error('''Expected «variable.type», found «valueType»''', FirePackage.Literals.VARIABLE_DECLARATION__VALUE)
		}
	}
	
	@Check
	def void checkUnusedVariable(VariableDeclaration variable) {
		val referencingObjects = variable.find(variable.eContainer).map[EObject]
		if (variable.constant) {
			if (referencingObjects.empty) {
				warning(variable.name + " is not used", FirePackage.Literals.VARIABLE_DECLARATION__NAME)
			}
		} else {
			if (referencingObjects.filter(IdExpression).empty) {
				warning(variable.name + " is not read", FirePackage.Literals.VARIABLE_DECLARATION__NAME)
			}
		}
	}
	
	@Check
	def void checkAssignmentToConstant(AssignmentStatement assignment) {
		if (!assignment.eIsProxy && assignment.variable.constant) {
			error("Cannot assign a value to a constant", FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE)
		}
	}
	
	@Check
	def void typeCheckAssignmentStatement(AssignmentStatement assignment) {
		val variableType = if (!assignment.variable.eIsProxy) {
			assignment.variable.type
		}
		val valueType = assignment.value?.type
		if (variableType != null && valueType != null && !assignment.variable.constant && variableType != valueType) {
			error('''Expected «variableType», found «valueType»''', FirePackage.Literals.ASSIGNMENT_STATEMENT__VALUE)
		}
	}
	
	@Check
	def void checkDeclarationBeforeAssignmentStatement(AssignmentStatement assignment) {
		if (!assignment.variable.eIsProxy && assignment.node.offset < assignment.variable.node.offset) {
			error('''Cannot refer to «assignment.variable.name» before it is declared''', FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE)
		}
	}
	
	@Check
	def void typeCheckWhileLoop(WhileLoop whileLoop) {
		val conditionType = whileLoop.condition?.type
		if (conditionType != null && conditionType != BuiltInType.BOOLEAN) {
			error("Expected Boolean, found " + conditionType, FirePackage.Literals.WHILE_LOOP__CONDITION)
		}
	}
	
	@Check
	def void typeCheckIfStatement(IfStatement ifStatement) {
		val conditionType = ifStatement.condition?.type
		if (conditionType != null && conditionType != BuiltInType.BOOLEAN) {
			error("Expected Boolean, found " + conditionType, FirePackage.Literals.IF_STATEMENT__CONDITION)
		}
	}
	
	@Check
	def void typeCheckElseIfStatement(ElseIfStatement elseIfStatement) {
		val conditionType = elseIfStatement.condition?.type
		if (conditionType != null && conditionType != BuiltInType.BOOLEAN) {
			error("Expected Boolean, found " + conditionType, FirePackage.Literals.ELSE_IF_STATEMENT__CONDITION)
		}
	}
	
	@Check
	def void typeCheckOrExpression(OrExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null && (leftType != BuiltInType.BOOLEAN || rightType != BuiltInType.BOOLEAN)) {
			val orKeyword = grammarAccess.expressionAccess.orKeyword_1_1
			val message = '''«orKeyword.value» operator cannot be applied to types «leftType» and «rightType»'''
			val orKeywordNode = expression.node.children.findFirst[grammarElement == orKeyword]
			messageAcceptor.acceptError(message, expression, orKeywordNode.offset, orKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckAndExpression(AndExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null && (leftType != BuiltInType.BOOLEAN || rightType != BuiltInType.BOOLEAN)) {
			val andKeyword = grammarAccess.andExpressionAccess.andKeyword_1_1
			val message = '''«andKeyword.value» operator cannot be applied to types «leftType» and «rightType»'''
			val andKeywordNode = expression.node.children.findFirst[grammarElement == andKeyword]
			messageAcceptor.acceptError(message, expression, andKeywordNode.offset, andKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckXorExpression(XorExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null && (leftType != BuiltInType.BOOLEAN || rightType != BuiltInType.BOOLEAN)) {
			val xorKeyword = grammarAccess.xorExpressionAccess.xorKeyword_1_1
			val message = '''«xorKeyword.value» operator cannot be applied to types «leftType» and «rightType»'''
			val xorKeywordNode = expression.node.children.findFirst[grammarElement == xorKeyword]
			messageAcceptor.acceptError(message, expression, xorKeywordNode.offset, xorKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckEqualityExpression(EqualityExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null && (leftType != rightType ||
			(leftType != BuiltInType.BOOLEAN && leftType != BuiltInType.INTEGER && leftType != BuiltInType.REAL)
		)) {
			val message = '''«expression.operator.literal» operator cannot be applied to types «leftType» and «rightType»'''
			error(message, FirePackage.Literals.EQUALITY_EXPRESSION__OPERATOR)
		}
	}
	
	@Check
	def void typeCheckComparisonExpression(ComparisonExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null &&
			(leftType != rightType || (leftType != BuiltInType.INTEGER && leftType != BuiltInType.REAL))
		) {
			val message = '''«expression.operator.literal» operator cannot be applied to types «leftType» and «rightType»'''
			error(message, FirePackage.Literals.COMPARISON_EXPRESSION__OPERATOR)
		}
	}
	
	@Check
	def void typeCheckAdditiveExpression(AdditiveExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null &&
			(leftType != rightType || (leftType != BuiltInType.INTEGER && leftType != BuiltInType.REAL))
		) {
			val message = '''«expression.operator.literal» operator cannot be applied to types «leftType» and «rightType»'''
			error(message, FirePackage.Literals.ADDITIVE_EXPRESSION__OPERATOR)
		}
	}
	
	@Check
	def void typeCheckMultiplicativeExpression(MultiplicativeExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null) {
			val reportError = leftType != rightType || switch expression.operator {
				case MULTIPLY: leftType != BuiltInType.INTEGER && leftType != BuiltInType.REAL
				case REAL_DIVIDE: leftType != BuiltInType.REAL
				case INTEGER_DIVIDE: leftType != BuiltInType.INTEGER
				case MODULUS: leftType != BuiltInType.INTEGER
			}
			if (reportError) {
				val message = '''«expression.operator.literal» operator cannot be applied to types «leftType» and «rightType»'''
				error(message, FirePackage.Literals.MULTIPLICATIVE_EXPRESSION__OPERATOR)
			}
		}
	}
	
	@Check
	def void checkDeclarationBeforeIdExpression(IdExpression expression) {
		if (!expression.eIsProxy && (expression.node.offset < expression.value.node.offset || expression.value.isAncestor(expression))) {
			error('''Cannot refer to «expression.value.name» before it is declared''', null)
		}
	}
	
	@Check
	def void typeCheckNotExpression(NotExpression expression) {
		val operandType = expression.operand?.type
		if (operandType != null && operandType != BuiltInType.BOOLEAN) {
			val notKeyword = grammarAccess.terminalExpressionAccess.notKeyword_5_1
			val message = notKeyword.value + " operator cannot be applied to type " + operandType
			val notKeywordNode = expression.node.children.findFirst[grammarElement == notKeyword]
			messageAcceptor.acceptError(message, expression, notKeywordNode.offset, notKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckNegationExpression(NegationExpression expression) {
		val operandType = expression.operand?.type
		if (operandType != null && operandType != BuiltInType.INTEGER && operandType != BuiltInType.REAL) {
			val negationKeyword = grammarAccess.terminalExpressionAccess.hyphenMinusKeyword_6_1
			val message = negationKeyword.value + " operator cannot be applied to type " + operandType
			val negationKeywordNode = expression.node.children.findFirst[grammarElement == negationKeyword]
			messageAcceptor.acceptError(message, expression, negationKeywordNode.offset, negationKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckIfExpressionCondition(IfExpression expression) {
		val conditionType = expression.condition?.type
		if (conditionType != null && conditionType != BuiltInType.BOOLEAN) {
			error("Expected Boolean, found " + conditionType, FirePackage.Literals.IF_EXPRESSION__CONDITION)
		}
	}
	
	@Check
	def void typeCheckIfExpressionValues(IfExpression expression) {
		val thenType = expression.thenValue?.type
		if (thenType != null) {
			expression.elseIfs.forEach[
				val elseIfThenType = thenValue?.type
				if (elseIfThenType != null && thenType != elseIfThenType) {
					error('''Expected «thenType», found «elseIfThenType»''', thenValue, null)
				}
			]
			val elseType = expression.elseValue?.type
			if (elseType != null && thenType != elseType) {
				error('''Expected «thenType», found «elseType»''', expression.elseValue, null)
			}
		}
	}
	
	@Check
	def void typeCheckElseIfExpressionCondition(ElseIfExpression expression) {
		val conditionType = expression.condition?.type
		if (conditionType != null && conditionType != BuiltInType.BOOLEAN) {
			error("Expected Boolean, found " + conditionType, FirePackage.Literals.ELSE_IF_EXPRESSION__CONDITION)
		}
	}
}