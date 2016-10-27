package fire.tests

import com.google.inject.Inject
import fire.fire.FirePackage
import fire.fire.Program
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
				const c1: Integer := 3
			end
		'''.parse => [
			2.assertEquals(validate.size)
			statements.get(1).assertError(FirePackage.Literals.CONSTANT_DECLARATION, null, "c1 is already declared")
			statements.get(2).assertError(FirePackage.Literals.CONSTANT_DECLARATION, null, "c1 is already declared")
		]
	}
	
	@Test
	def void testTypeCheckConstantDeclaration() {
		'''
			program
				const c1: String := "string1"
				const c2: String := 1
			end
		'''.parse => [
			tester.validate(statements.get(0)) => [
				assertDiagnosticsCount(0)
			]
			tester.validate(statements.get(1)) => [
				assertDiagnosticsCount(1)
				assertError(null, "Expected String, found Integer")
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