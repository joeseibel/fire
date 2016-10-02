package fire.validation

import fire.FireType
import fire.fire.NegationExpression
import fire.fire.NotExpression
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.validation.Check

import static extension fire.FireUtil.getType
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode

class FireValidator extends AbstractFireValidator {
	@Check
	def void typeCheckNotExpression(NotExpression expression) {
		val operandType = expression.operand.type
		if (operandType != null && operandType != FireType.BOOLEAN) {
			val message = "not operator cannot be applied to type " + operandType
			val notKeyword = expression.node.leafNodes.findFirst[grammarElement instanceof Keyword]
			messageAcceptor.acceptError(message, expression, notKeyword.offset, notKeyword.length, null)
		}
	}
	
	@Check
	def void typeCheckNegationExpression(NegationExpression expression) {
		val operandType = expression.operand.type
		if (operandType != null && operandType != FireType.INTEGER && operandType != FireType.REAL) {
			val message = "- operator cannot be applied to type " + operandType
			val negationKeyword = expression.node.leafNodes.findFirst[grammarElement instanceof Keyword]
			messageAcceptor.acceptError(message, expression, negationKeyword.offset, negationKeyword.length, null)
		}
	}
}