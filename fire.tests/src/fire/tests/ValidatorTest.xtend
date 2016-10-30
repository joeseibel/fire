package fire.tests

import com.google.inject.Inject
import fire.fire.Program
import fire.fire.VariableDeclaration
import fire.fire.WhileLoop
import fire.fire.WritelnStatement
import fire.validation.FireValidator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.junit4.validation.AssertableDiagnostics.*

@RunWith(XtextRunner)
@InjectWith(FireInjectorProvider)
class ValidatorTest {
	@Inject
	extension ParseHelper<Program>
	@Inject
	ValidatorTester<FireValidator> tester
	
	@Test
	def void checkDuplicateNames() {
		'''
			program
				const c1: Integer := 1
				writeln(c1)
				const c1: Integer := 2
				while true do
					const c1: Integer := 3
					writeln(c1)
					const c2: Integer := 4
					writeln(c2)
					const c2: Integer := 5
					const c3: Integer := 6
					writeln(c3)
				end
				const c3: Integer := 7
				writeln(c3)
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
			]
			statements.get(3) as WhileLoop => [
				tester.validate(statements.get(0)) => [
					assertAll(error(null, "c1 is already declared"))
				]
				tester.validate(statements.get(2)) => [
					assertOK
				]
				tester.validate(statements.get(4)) => [
					assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
				]
				tester.validate(statements.get(5)) => [
					assertOK
				]
			]
			tester.validate(statements.get(4)) => [
				assertOK
			]
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertAll(error(null, "Expected String, found Integer"))
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "Expected Integer, found String"))
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
				while true do
					const c3: Integer := 6
				end
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertAll(warning(null, "c2 is not used"))
			]
			tester.validate(statements.get(3)) => [
				assertAll(warning(null, "v1 is not read"))
			]
			tester.validate(statements.get(4)) => [
				assertAll(warning(null, "v2 is not read"))
			]
			statements.get(6) as WhileLoop => [
				tester.validate(statements.head) => [
					assertAll(warning(null, "c3 is not used"))
				]
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
				assertOK
			]
			tester.validate(statements.get(3)) => [
				assertAll(error(null, "Cannot assign a value to a constant"))
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
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "Expected Integer, found Boolean"))
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
				while true do
					var v3: Integer := 5
					v3 := 6
					v4 := 7
					var v4: Integer := 8
					v5 := 9
				end
				var v5: Integer := 10
			end
		'''.parse => [
			tester.validate(statements.get(1)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "Cannot refer to v2 before it is declared"))
			]
			statements.get(4) as WhileLoop => [
				tester.validate(statements.get(1)) => [
					assertOK
				]
				tester.validate(statements.get(2)) => [
					assertAll(error(null, "Cannot refer to v4 before it is declared"))
				]
				tester.validate(statements.get(4)) => [
					assertAll(error(null, "Cannot refer to v5 before it is declared"))
				]
			]
		]
	}
	
	@Test
	def void testTypeCheckWhileLoop() {
		'''
			program
				while true do
				end
				while 1 do
				end
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertAll(error(null, "Expected Boolean, found Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertAll(error(null, "or operator cannot be applied to types String and Real"))
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "or operator cannot be applied to types Integer and Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertAll(error(null, "and operator cannot be applied to types String and Real"))
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "and operator cannot be applied to types Integer and Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertAll(error(null, "xor operator cannot be applied to types String and Real"))
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "xor operator cannot be applied to types Integer and Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertOK
			]
			tester.validate(statements.get(3)) => [
				assertOK
			]
			tester.validate(statements.get(4)) => [
				assertOK
			]
			tester.validate(statements.get(5)) => [
				assertOK
			]
			tester.validate(statements.get(6)) => [
				assertAll(error(null, "= operator cannot be applied to types Real and Integer"))
			]
			tester.validate(statements.get(7)) => [
				assertAll(error(null, "<> operator cannot be applied to types Real and Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertOK
			]
			tester.validate(statements.get(3)) => [
				assertOK
			]
			tester.validate(statements.get(4)) => [
				assertOK
			]
			tester.validate(statements.get(5)) => [
				assertOK
			]
			tester.validate(statements.get(6)) => [
				assertOK
			]
			tester.validate(statements.get(7)) => [
				assertOK
			]
			tester.validate(statements.get(8)) => [
				assertAll(error(null, "< operator cannot be applied to types String and Integer"))
			]
			tester.validate(statements.get(9)) => [
				assertAll(error(null, "<= operator cannot be applied to types String and Integer"))
			]
			tester.validate(statements.get(10)) => [
				assertAll(error(null, "> operator cannot be applied to types String and Integer"))
			]
			tester.validate(statements.get(11)) => [
				assertAll(error(null, ">= operator cannot be applied to types String and Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertOK
			]
			tester.validate(statements.get(3)) => [
				assertOK
			]
			tester.validate(statements.get(4)) => [
				assertAll(error(null, "+ operator cannot be applied to types String and Boolean"))
			]
			tester.validate(statements.get(5)) => [
				assertAll(error(null, "- operator cannot be applied to types Real and Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertOK
			]
			tester.validate(statements.get(3)) => [
				assertOK
			]
			tester.validate(statements.get(4)) => [
				assertOK
			]
			tester.validate(statements.get(5)) => [
				assertAll(error(null, "* operator cannot be applied to types Integer and Real"))
			]
			tester.validate(statements.get(6)) => [
				assertAll(error(null, "div operator cannot be applied to types String and Boolean"))
			]
			tester.validate(statements.get(7)) => [
				assertAll(error(null, "mod operator cannot be applied to types Real and Real"))
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
				while true do
					writeln(c3)
					writeln(c4)
					const c4: Integer := 3
				end
			end
		'''.parse => [
			tester.validate((statements.get(1) as WritelnStatement).argument) => [
				assertOK
			]
			tester.validate((statements.get(2) as WritelnStatement).argument) => [
				assertAll(error(null, "Cannot refer to c2 before it is declared"))
			]
			tester.validate((statements.get(4) as VariableDeclaration).value) => [
				assertAll(error(null, "Cannot refer to c3 before it is declared"))
			]
			statements.get(5) as WhileLoop => [
				tester.validate((statements.get(0) as WritelnStatement).argument) => [
					assertOK
				]
				tester.validate((statements.get(1) as WritelnStatement).argument) => [
					assertAll(error(null, "Cannot refer to c4 before it is declared"))
				]
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertAll(error(null, "not operator cannot be applied to type Integer"))
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
				assertOK
			]
			tester.validate(statements.get(1)) => [
				assertOK
			]
			tester.validate(statements.get(2)) => [
				assertAll(error(null, "- operator cannot be applied to type Boolean"))
			]
		]
	}
}