package fire

import fire.fire.AdditiveExpression
import fire.fire.AndExpression
import fire.fire.BooleanLiteral
import fire.fire.ComparisonExpression
import fire.fire.EqualityExpression
import fire.fire.IntegerLiteral
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.RealLiteral
import fire.fire.StringLiteral
import fire.fire.XorExpression

class FireUtil {
	def static dispatch FireType getType(AndExpression expression) {
		FireType.BOOLEAN
	}
	
	def static dispatch FireType getType(XorExpression expression) {
		FireType.BOOLEAN
	}
	
	def static dispatch FireType getType(EqualityExpression expression) {
		FireType.BOOLEAN
	}
	
	def static dispatch FireType getType(ComparisonExpression expression) {
		FireType.BOOLEAN
	}
	
	def static dispatch FireType getType(AdditiveExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType == FireType.INTEGER && rightType == FireType.INTEGER) {
			FireType.INTEGER
		} else if (leftType == FireType.REAL && rightType == FireType.REAL) {
			FireType.REAL
		}
	}
	
	def static dispatch FireType getType(MultiplicativeExpression expression) {
		switch expression.operator {
			case MULTIPLY: {
				val leftType = expression.left?.type
				val rightType = expression.right?.type
				if (leftType == FireType.INTEGER && rightType == FireType.INTEGER) {
					FireType.INTEGER
				} else if (leftType == FireType.REAL && rightType == FireType.REAL) {
					FireType.REAL
				}
			}
			case REAL_DIVIDE: FireType.REAL
			case INTEGER_DIVIDE: FireType.INTEGER
			case MODULUS: FireType.INTEGER
		}
	}
	
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
		val operandType = expression.operand?.type
		if (operandType == FireType.INTEGER || operandType == FireType.REAL) {
			operandType
		}
	}
}