package fire.validation

import fire.FireType
import fire.fire.AdditiveExpression
import fire.fire.ComparisonExpression
import fire.fire.FirePackage
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.validation.Check

import static extension fire.FireUtil.getType
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode

class FireValidator extends AbstractFireValidator {
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
			val message = "not operator cannot be applied to type " + operandType
			val notKeyword = expression.node.leafNodes.findFirst[grammarElement instanceof Keyword]
			messageAcceptor.acceptError(message, expression, notKeyword.offset, notKeyword.length, null)
		}
	}
	
	@Check
	def void typeCheckNegationExpression(NegationExpression expression) {
		val operandType = expression.operand?.type
		if (operandType != null && operandType != FireType.INTEGER && operandType != FireType.REAL) {
			val message = "- operator cannot be applied to type " + operandType
			val negationKeyword = expression.node.leafNodes.findFirst[grammarElement instanceof Keyword]
			messageAcceptor.acceptError(message, expression, negationKeyword.offset, negationKeyword.length, null)
		}
	}
}