package fire.tests

import com.google.inject.Inject
import fire.fire.FirePackage
import fire.fire.Program
import fire.fire.VariableDeclaration
import fire.fire.WritelnStatement
import fire.validation.FireValidator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(FireInjectorProvider)
class ValidatorTest {
	@Inject
	extension ParseHelper<Program>
	@Inject
	extension ValidationTestHelper
	@Inject
	ValidatorTester<FireValidator> tester
	
	@Test
	def void checkDuplicateNames() {
		'''
			program
				const c1: Integer := 1
				const c1: Integer := 2
				var c1: Integer := 3
			end
		'''.parse => [
			5.assertEquals(validate.size)
			statements.get(0).assertWarning(FirePackage.Literals.VARIABLE_DECLARATION, null, "c1 is not used")
			statements.get(1).assertError(FirePackage.Literals.VARIABLE_DECLARATION, null, "c1 is already declared")
			statements.get(1).assertWarning(FirePackage.Literals.VARIABLE_DECLARATION, null, "c1 is not used")
			statements.get(2).assertError(FirePackage.Literals.VARIABLE_DECLARATION, null, "c1 is already declared")
			statements.get(2).assertWarning(FirePackage.Literals.VARIABLE_DECLARATION, null, "c1 is not used")
		]
	}
	
	@Test
	def void testTypeCheckVariableDeclaration() {
		'''
			program
				const c1: String := "string1"
				var v1: String := 1
				const c2: Integer := c1
				writeln(c1)
				writeln(v1)
				writeln(c2)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(1)
				assertError(null, "Expected String, found Integer")
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "Expected Integer, found String")
			]
		]
	}
	
	@Test
	def void testCheckUnusedVariable() {
		'''
			program
				const c1: Integer := 1
				writeln(c1)
				const c2: Integer := 2
				var v1: Integer := 3
				var v2: Integer := 4
				v2 := 5
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertWarning(null, "c2 is not used")
			]
			tester.validate(statements.get(3)) => [
				assertDiagnosticsCount(1)
				assertWarning(null, "v1 is not read")
			]
			tester.validate(statements.get(4)) => [
				assertDiagnosticsCount(1)
				assertWarning(null, "v2 is not read")
			]
		]
	}
	
	@Test
	def void testCheckAssignmentToConstant() {
		'''
			program
				var v1: Integer := 1
				const c1: Integer := 2
				v1 := 3
				c1 := 4
			end
		'''.parse => [
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(3)) => [
				assertDiagnosticsCount(1)
				assertError(null, "Cannot assign a value to a constant")
			]
		]
	}
	
	@Test
	def void testTypeCheckAssignmentStatement() {
		'''
			program
				var v1: Integer := 1
				v1 := 2
				v1 := true
			end
		'''.parse => [
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "Expected Integer, found Boolean")
			]
		]
	}
	
	@Test
	def void testCheckDeclarationBeforeAssignmentStatement() {
		'''
			program
				var v1: Integer := 1
				v1 := 2
				v2 := 3
				var v2: Integer := 4
			end
		'''.parse => [
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "Cannot refer to v2 before it is declared")
			]
		]
	}
	
	@Test
	def void testTypeCheckOrExpression() {
		'''
			program
				writeln(true or false)
				writeln("string1" or 1.1)
				writeln(2 or 3)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(1)
				assertError(null, "or operator cannot be applied to types String and Real")
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "or operator cannot be applied to types Integer and Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckAndExpression() {
		'''
			program
				writeln(true and false)
				writeln("string1" and 1.1)
				writeln(2 and 3)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(1)
				assertError(null, "and operator cannot be applied to types String and Real")
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "and operator cannot be applied to types Integer and Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckXorExpression() {
		'''
			program
				writeln(true xor false)
				writeln("string1" xor 1.1)
				writeln(2 xor 3)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(1)
				assertError(null, "xor operator cannot be applied to types String and Real")
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "xor operator cannot be applied to types Integer and Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckEqualityExpression() {
		'''
			program
				writeln(true = false)
				writeln(true <> false)
				writeln(1 = 2)
				writeln(3 <> 4)
				writeln(5.5 = 6.6)
				writeln(7.7 <> 8.8)
				writeln(9.9 = 10)
				writeln(11.11 <> 11)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(3)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(4)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(5)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(6)) => [
				assertDiagnosticsCount(1)
				assertError(null, "= operator cannot be applied to types Real and Integer")
			]
			tester.validate(statements.get(7)) => [
				assertDiagnosticsCount(1)
				assertError(null, "<> operator cannot be applied to types Real and Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckComparisonExpression() {
		'''
			program
				writeln(1 < 2)
				writeln(3 <= 4)
				writeln(5 > 6)
				writeln(7 >= 8)
				writeln(9.9 < 10.10)
				writeln(11.11 <= 12.12)
				writeln(13.13 > 14.14)
				writeln(15.15 >= 15.15)
				writeln("string1" < 16)
				writeln("string2" <= 17)
				writeln("string3" > 18)
				writeln("string4" >= 19)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(3)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(4)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(5)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(6)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(7)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(8)) => [
				assertDiagnosticsCount(1)
				assertError(null, "< operator cannot be applied to types String and Integer")
			]
			tester.validate(statements.get(9)) => [
				assertDiagnosticsCount(1)
				assertError(null, "<= operator cannot be applied to types String and Integer")
			]
			tester.validate(statements.get(10)) => [
				assertDiagnosticsCount(1)
				assertError(null, "> operator cannot be applied to types String and Integer")
			]
			tester.validate(statements.get(11)) => [
				assertDiagnosticsCount(1)
				assertError(null, ">= operator cannot be applied to types String and Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckAdditiveExpression() {
		'''
			program
				writeln(1 + 2)
				writeln(3 - 4)
				writeln(5.5 + 6.6)
				writeln(7.7 - 8.8)
				writeln("string1" + true)
				writeln(9.9 - 10)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(3)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(4)) => [
				assertDiagnosticsCount(1)
				assertError(null, "+ operator cannot be applied to types String and Boolean")
			]
			tester.validate(statements.get(5)) => [
				assertDiagnosticsCount(1)
				assertError(null, "- operator cannot be applied to types Real and Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckMultiplicativeExpression() {
		'''
			program
				writeln(1 * 2)
				writeln(3 div 4)
				writeln(5 mod 6)
				writeln(7.7 * 8.8)
				writeln(9.9 / 10.10)
				writeln(11 * 12.12)
				writeln("string1" div true)
				writeln(13.13 mod 14.14)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(3)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(4)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(5)) => [
				assertDiagnosticsCount(1)
				assertError(null, "* operator cannot be applied to types Integer and Real")
			]
			tester.validate(statements.get(6)) => [
				assertDiagnosticsCount(1)
				assertError(null, "div operator cannot be applied to types String and Boolean")
			]
			tester.validate(statements.get(7)) => [
				assertDiagnosticsCount(1)
				assertError(null, "mod operator cannot be applied to types Real and Real")
			]
		]
	}
	
	@Test
	def void testCheckDeclarationBeforeIdExpression() {
		'''
			program
				const c1: Integer := 1
				writeln(c1)
				writeln(c2)
				const c2: Integer := 2
				const c3: Integer := c3
			end
		'''.parse => [
			tester.validate((statements.get(1) as WritelnStatement).argument) => [
				assertDiagnosticsCount(0)
			]
			tester.validate((statements.get(2) as WritelnStatement).argument) => [
				assertDiagnosticsCount(1)
				assertError(null, "Cannot refer to c2 before it is declared")
			]
			tester.validate((statements.get(4) as VariableDeclaration).value) => [
				assertDiagnosticsCount(1)
				assertError(null, "Cannot refer to c3 before it is declared")
			]
		]
	}
	
	@Test
	def void testTypeCheckNotExpression() {
		'''
			program
				writeln(not true)
				writeln(not 1)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(1)
				assertError(null, "not operator cannot be applied to type Integer")
			]
		]
	}
	
	@Test
	def void testTypeCheckNegationExpression() {
		'''
			program
				writeln(-1)
				writeln(-2.2)
				writeln(-true)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(2)) => [
				assertDiagnosticsCount(1)
				assertError(null, "- operator cannot be applied to type Boolean")
			]
		]
	}
}