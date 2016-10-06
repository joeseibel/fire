package fire.validation

import com.google.inject.Inject
import fire.FireType
import fire.fire.AdditiveExpression
import fire.fire.ComparisonExpression
import fire.fire.EqualityExpression
import fire.fire.FirePackage
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.XorExpression
import fire.services.FireGrammarAccess
import org.eclipse.xtext.validation.Check

import static extension fire.FireUtil.getType
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode

class FireValidator extends AbstractFireValidator {
	@Inject
	FireGrammarAccess grammarAccess
	
	@Check
	def void typeCheckXorExpression(XorExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType != null && rightType != null && (leftType != FireType.BOOLEAN || rightType != FireType.BOOLEAN)) {
			val xorKeyword = grammarAccess.expressionAccess.xorKeyword_1_1
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
			(leftType != FireType.BOOLEAN && leftType != FireType.INTEGER && leftType != FireType.REAL)
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
			(leftType != rightType || (leftType != FireType.INTEGER && leftType != FireType.REAL))
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
			(leftType != rightType || (leftType != FireType.INTEGER && leftType != FireType.REAL))
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
				case MULTIPLY: leftType != FireType.INTEGER && leftType != FireType.REAL
				case REAL_DIVIDE: leftType != FireType.REAL
				case INTEGER_DIVIDE: leftType != FireType.INTEGER
				case MODULUS: leftType != FireType.INTEGER
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
		if (operandType != null && operandType != FireType.BOOLEAN) {
			val notKeyword = grammarAccess.terminalExpressionAccess.notKeyword_4_1
			val message = notKeyword.value + " operator cannot be applied to type " + operandType
			val notKeywordNode = expression.node.children.findFirst[grammarElement == notKeyword]
			messageAcceptor.acceptError(message, expression, notKeywordNode.offset, notKeywordNode.length, null)
		}
	}
	
	@Check
	def void typeCheckNegationExpression(NegationExpression expression) {
		val operandType = expression.operand?.type
		if (operandType != null && operandType != FireType.INTEGER && operandType != FireType.REAL) {
			val negationKeyword = grammarAccess.terminalExpressionAccess.hyphenMinusKeyword_5_1
			val message = negationKeyword.value + " operator cannot be applied to type " + operandType
			val negationKeywordNode = expression.node.children.findFirst[grammarElement == negationKeyword]
			messageAcceptor.acceptError(message, expression, negationKeywordNode.offset, negationKeywordNode.length, null)
		}
	}
}