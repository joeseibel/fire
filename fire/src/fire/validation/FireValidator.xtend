package fire.validation

import com.google.inject.Inject
import fire.fire.AdditiveExpression
import fire.fire.AndExpression
import fire.fire.BuiltInType
import fire.fire.ComparisonExpression
import fire.fire.ConstantDeclaration
import fire.fire.EqualityExpression
import fire.fire.FirePackage
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.OrExpression
import fire.fire.Program
import fire.fire.XorExpression
import fire.services.FireGrammarAccess
import org.eclipse.xtext.validation.Check

import static extension fire.FireUtil.getType
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode

class FireValidator extends AbstractFireValidator {
	@Inject
	FireGrammarAccess grammarAccess
	
	@Check
	def void checkDuplicateNames(Program program) {
		program.statements.filter(ConstantDeclaration).groupBy[name].filter[name, constants | constants.size > 1].forEach[name, constants | constants.tail.forEach[constant |
			error(name + " is already declared", constant, FirePackage.Literals.CONSTANT_DECLARATION__NAME)
		]]
	}
	
	@Check
	def void typeCheckConstantDeclaration(ConstantDeclaration constant) {
		val valueType = constant.value?.type
		if (valueType != null && constant.type != null && valueType != constant.type) {
			error('''Expected «constant.type», found «valueType»''', FirePackage.Literals.CONSTANT_DECLARATION__VALUE)
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
	def void typeCheckNotExpression(NotExpression expression) {
		val operandType = expression.operand?.type
		if (operandType != null && operandType != BuiltInType.BOOLEAN) {
			val notKeyword = grammarAccess.terminalExpressionAccess.notKeyword_4_1
			val message = notKeyword.value + " operator cannot be applied to type " + operandType
			val notKeywordNode = expression.node.children.findFirst[grammarElement == notKeyword]
			messageAcceptor.acceptError(message, expression, notKeywordNode.offset, notKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckNegationExpression(NegationExpression expression) {
		val operandType = expression.operand?.type
		if (operandType != null && operandType != BuiltInType.INTEGER && operandType != BuiltInType.REAL) {
			val negationKeyword = grammarAccess.terminalExpressionAccess.hyphenMinusKeyword_5_1
			val message = negationKeyword.value + " operator cannot be applied to type " + operandType
			val negationKeywordNode = expression.node.children.findFirst[grammarElement == negationKeyword]
			messageAcceptor.acceptError(message, expression, negationKeywordNode.offset, negationKeywordNode.length, null)
		}
	}
}