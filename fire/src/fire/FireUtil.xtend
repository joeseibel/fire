package fire

import fire.fire.BooleanLiteral
import fire.fire.IntegerLiteral
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.RealLiteral
import fire.fire.StringLiteral

class FireUtil {
	def static dispatch FireType getType(StringLiteral literal) {
		FireType.STRING
	}
	
	def static dispatch FireType getType(BooleanLiteral literal) {
		FireType.BOOLEAN
	}
	
	def static dispatch FireType getType(IntegerLiteral literal) {
		FireType.INTEGER
	}
	
	def static dispatch FireType getType(RealLiteral literal) {
		FireType.REAL
	}
	
	def static dispatch FireType getType(NotExpression expression) {
		FireType.BOOLEAN
	}
	
	def static dispatch FireType getType(NegationExpression expression) {
		val operandType = expression.operand.type
		if (operandType == FireType.INTEGER || operandType == FireType.REAL) {
			operandType
		}
	}
}