package fire

import fire.fire.AdditiveExpression
import fire.fire.AndExpression
import fire.fire.BooleanLiteral
import fire.fire.BuiltInType
import fire.fire.ComparisonExpression
import fire.fire.EqualityExpression
import fire.fire.IdExpression
import fire.fire.IntegerLiteral
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.OrExpression
import fire.fire.RealLiteral
import fire.fire.StringLiteral
import fire.fire.XorExpression

class FireUtil {
	def static dispatch BuiltInType getType(OrExpression expression) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(AndExpression expression) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(XorExpression expression) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(EqualityExpression expression) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(ComparisonExpression expression) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(AdditiveExpression expression) {
		val leftType = expression.left?.type
		val rightType = expression.right?.type
		if (leftType == BuiltInType.INTEGER && rightType == BuiltInType.INTEGER) {
			BuiltInType.INTEGER
		} else if (leftType == BuiltInType.REAL && rightType == BuiltInType.REAL) {
			BuiltInType.REAL
		}
	}
	
	def static dispatch BuiltInType getType(MultiplicativeExpression expression) {
		switch expression.operator {
			case MULTIPLY: {
				val leftType = expression.left?.type
				val rightType = expression.right?.type
				if (leftType == BuiltInType.INTEGER && rightType == BuiltInType.INTEGER) {
					BuiltInType.INTEGER
				} else if (leftType == BuiltInType.REAL && rightType == BuiltInType.REAL) {
					BuiltInType.REAL
				}
			}
			case REAL_DIVIDE: BuiltInType.REAL
			case INTEGER_DIVIDE: BuiltInType.INTEGER
			case MODULUS: BuiltInType.INTEGER
		}
	}
	
	def static dispatch BuiltInType getType(IdExpression expression) {
		expression.value?.type
	}
	
	def static dispatch BuiltInType getType(StringLiteral literal) {
		BuiltInType.STRING
	}
	
	def static dispatch BuiltInType getType(BooleanLiteral literal) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(IntegerLiteral literal) {
		BuiltInType.INTEGER
	}
	
	def static dispatch BuiltInType getType(RealLiteral literal) {
		BuiltInType.REAL
	}
	
	def static dispatch BuiltInType getType(NotExpression expression) {
		BuiltInType.BOOLEAN
	}
	
	def static dispatch BuiltInType getType(NegationExpression expression) {
		val operandType = expression.operand?.type
		if (operandType == BuiltInType.INTEGER || operandType == BuiltInType.REAL) {
			operandType
		}
	}
}