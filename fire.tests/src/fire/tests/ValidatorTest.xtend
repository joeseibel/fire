package fire.tests

import com.google.inject.Inject
import fire.fire.FirePackage
import fire.fire.IfExpression
import fire.fire.IfStatement
import fire.fire.Program
import fire.fire.VariableDeclaration
import fire.fire.WhileLoop
import fire.fire.WritelnStatement
import fire.validation.FireValidator
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.junit4.validation.AssertableDiagnostics.*

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
	def void testCheckDuplicateCallable() {
		'''
			program
				procedure callable1()
				end
				
				function callable1(): Integer
					1
				end
			end
		'''.parse => [
			tester.validate(callables.get(0)).assertOK
			tester.validate(callables.get(1)).assertAll(error(null, "callable1 is already declared"))
		]
	}
	
	@Test
	def void testTypeCheckFunction() {
		'''
			program
				function func1(): Integer
					1
				end
				
				function func2(): Real
					2
				end
			end
		'''.parse => [
			tester.validate(callables.get(0)).assertOK
			tester.validate(callables.get(1)).assertAll(error(null, "Expected Real, found Integer"))
		]
	}
	
	@Test
	def void testCheckDuplicateParameter() {
		'''
			program
				procedure proc1(param1: Integer, param1: Integer)
				end
			end
		'''.parse.callables.head => [
			"proc1".assertEquals(name)
			tester.validate(parameters.get(0)).assertAll(warning(null, "param1 is not used"))
			tester.validate(parameters.get(1)).assertAll(error(null, "param1 is already declared"), warning(null, "param1 is not used"))
		]
	}
	
	@Test
	def void testCheckUnusedParameter() {
		'''
			program
				function func1(param1: Integer, param2: Integer): Integer
					param1
				end
			end
		'''.parse.callables.head => [
			"func1".assertEquals(name)
			tester.validate(parameters.get(0)).assertOK
			tester.validate(parameters.get(1)).assertAll(warning(null, "param2 is not used"))
		]
	}
	
	@Test
	def void testCheckDuplicateVariableDeclaration() {
		'''
			program
				procedure proc1(param1: Integer)
					const c1: Integer := param1
					const c1: Integer := param1
					const param1: Integer := param1
				end
				
				const c1: Integer := 1
				const c1: Integer := 2
				while true do
					const c1: Integer := 3
					const c2: Integer := 4
					const c2: Integer := 5
					const c3: Integer := 6
				end
				if true then
					const c1: Integer := 7
					const c2: Integer := 8
					const c2: Integer := 8
					const c3: Integer := 9
				else if true then
					const c1: Integer := 10
					const c2: Integer := 11
					const c2: Integer := 12
					const c3: Integer := 13
				else begin
					const c1: Integer := 14
					const c2: Integer := 15
					const c2: Integer := 16
					const c3: Integer := 17
				end
				writeln(if true then
					const c1: Integer := 18
					const c2: Integer := 19
					const c2: Integer := 20
					const c3: Integer := 21
					22
				else if true then
					const c1: Integer := 22
					const c2: Integer := 23
					const c2: Integer := 24
					const c3: Integer := 25
					26
				else begin
					const c1: Integer := 26
					const c2: Integer := 27
					const c2: Integer := 28
					const c3: Integer := 29
					30
				end)
				const c3: Integer := 30
			end
		'''.parse => [
			callables.head => [
				"proc1".assertEquals(name)
				tester.validate(statements.get(0)).assertAll(warning(null, "c1 is not used"))
				tester.validate(statements.get(1)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
				tester.validate(statements.get(2)).assertAll(error(null, "param1 is already declared"), warning(null, "param1 is not used"))
			]
			tester.validate(statements.get(0)).assertAll(warning(null, "c1 is not used"))
			tester.validate(statements.get(1)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
			statements.get(2) as WhileLoop => [
				tester.validate(statements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
				tester.validate(statements.get(1)).assertAll(warning(null, "c2 is not used"))
				tester.validate(statements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
				tester.validate(statements.get(3)).assertAll(warning(null, "c3 is not used"))
			]
			statements.get(3) as IfStatement => [
				tester.validate(thenStatements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
				tester.validate(thenStatements.get(1)).assertAll(warning(null, "c2 is not used"))
				tester.validate(thenStatements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
				tester.validate(thenStatements.get(3)).assertAll(warning(null, "c3 is not used"))
				elseIfs.head => [
					tester.validate(thenStatements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
					tester.validate(thenStatements.get(1)).assertAll(warning(null, "c2 is not used"))
					tester.validate(thenStatements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
					tester.validate(thenStatements.get(3)).assertAll(warning(null, "c3 is not used"))
				]
				^else => [
					tester.validate(elseStatements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
					tester.validate(elseStatements.get(1)).assertAll(warning(null, "c2 is not used"))
					tester.validate(elseStatements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
					tester.validate(elseStatements.get(3)).assertAll(warning(null, "c3 is not used"))
				]
			]
			(statements.get(4) as WritelnStatement).argument as IfExpression => [
				tester.validate(thenStatements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
				tester.validate(thenStatements.get(1)).assertAll(warning(null, "c2 is not used"))
				tester.validate(thenStatements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
				tester.validate(thenStatements.get(3)).assertAll(warning(null, "c3 is not used"))
				elseIfs.head => [
					tester.validate(thenStatements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
					tester.validate(thenStatements.get(1)).assertAll(warning(null, "c2 is not used"))
					tester.validate(thenStatements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
					tester.validate(thenStatements.get(3)).assertAll(warning(null, "c3 is not used"))
				]
				tester.validate(elseStatements.get(0)).assertAll(error(null, "c1 is already declared"), warning(null, "c1 is not used"))
				tester.validate(elseStatements.get(1)).assertAll(warning(null, "c2 is not used"))
				tester.validate(elseStatements.get(2)).assertAll(error(null, "c2 is already declared"), warning(null, "c2 is not used"))
				tester.validate(elseStatements.get(3)).assertAll(warning(null, "c3 is not used"))
			]
			tester.validate(statements.get(5)).assertAll(warning(null, "c3 is not used"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "Expected String, found Integer"))
			tester.validate(statements.get(2)).assertAll(error(null, "Expected Integer, found String"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(2)).assertAll(warning(null, "c2 is not used"))
			tester.validate(statements.get(3)).assertAll(warning(null, "v1 is not read"))
			tester.validate(statements.get(4)).assertAll(warning(null, "v2 is not read"))
			tester.validate((statements.get(6) as WhileLoop).statements.head).assertAll(warning(null, "c3 is not used"))
		]
	}
	
	@Test
	def void testCheckAssignmentToConstant() {
		'''
			program
				procedure proc1(param1: Integer)
					param1 := 1
				end
				
				var v1: Integer := 2
				const c1: Integer := 3
				v1 := 4
				c1 := 5
			end
		'''.parse => [
			callables.head => [
				"proc1".assertEquals(name)
				tester.validate(statements.head).assertAll(error(null, "Cannot assign a value to a parameter"))
			]
			tester.validate(statements.get(2)).assertOK
			tester.validate(statements.get(3)).assertAll(error(null, "Cannot assign a value to a constant"))
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
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertAll(error(null, "Expected Integer, found Boolean"))
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
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertAll(error(null, "Cannot refer to v2 before it is declared"))
			statements.get(4) as WhileLoop => [
				tester.validate(statements.get(1)).assertOK
				tester.validate(statements.get(2)).assertAll(error(null, "Cannot refer to v4 before it is declared"))
				tester.validate(statements.get(4)).assertAll(error(null, "Cannot refer to v5 before it is declared"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "Expected Boolean, found Integer"))
		]
	}
	
	@Test
	def void testTypeCheckIfStatement() {
		'''
			program
				if true then
				end
				if 1 then
				end
			end
		'''.parse => [
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "Expected Boolean, found Integer"))
		]
	}
	
	@Test
	def void testTypeCheckElseIfStatement() {
		'''
			program
				if true then
				else if true then
				else if 1 then
				end
			end
		'''.parse => [
			statements.head as IfStatement => [
				tester.validate(elseIfs.get(0)).assertOK
				tester.validate(elseIfs.get(1)).assertAll(error(null, "Expected Boolean, found Integer"))
			]
		]
	}
	
	@Test
	def void testCheckCallStatementArguments() {
		'''
			program
				procedure proc1(param1: Integer, param2: String)
					writeln(param1)
					writeln(param2)
				end
				
				proc1(1, "string1")
				proc1(2, 3, 4)
				proc1(5, 6)
			end
		'''.parse => [
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "Incorrect argument count: expected 2, found 3"))
			tester.validate(statements.get(2)).assertAll(error(null, "Expected String, found Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "or operator cannot be applied to types String and Real"))
			tester.validate(statements.get(2)).assertAll(error(null, "or operator cannot be applied to types Integer and Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "and operator cannot be applied to types String and Real"))
			tester.validate(statements.get(2)).assertAll(error(null, "and operator cannot be applied to types Integer and Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "xor operator cannot be applied to types String and Real"))
			tester.validate(statements.get(2)).assertAll(error(null, "xor operator cannot be applied to types Integer and Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertOK
			tester.validate(statements.get(3)).assertOK
			tester.validate(statements.get(4)).assertOK
			tester.validate(statements.get(5)).assertOK
			tester.validate(statements.get(6)).assertAll(error(null, "= operator cannot be applied to types Real and Integer"))
			tester.validate(statements.get(7)).assertAll(error(null, "<> operator cannot be applied to types Real and Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertOK
			tester.validate(statements.get(3)).assertOK
			tester.validate(statements.get(4)).assertOK
			tester.validate(statements.get(5)).assertOK
			tester.validate(statements.get(6)).assertOK
			tester.validate(statements.get(7)).assertOK
			tester.validate(statements.get(8)).assertAll(error(null, "< operator cannot be applied to types String and Integer"))
			tester.validate(statements.get(9)).assertAll(error(null, "<= operator cannot be applied to types String and Integer"))
			tester.validate(statements.get(10)).assertAll(error(null, "> operator cannot be applied to types String and Integer"))
			tester.validate(statements.get(11)).assertAll(error(null, ">= operator cannot be applied to types String and Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertOK
			tester.validate(statements.get(3)).assertOK
			tester.validate(statements.get(4)).assertAll(error(null, "+ operator cannot be applied to types String and Boolean"))
			tester.validate(statements.get(5)).assertAll(error(null, "- operator cannot be applied to types Real and Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertOK
			tester.validate(statements.get(3)).assertOK
			tester.validate(statements.get(4)).assertOK
			tester.validate(statements.get(5)).assertAll(error(null, "* operator cannot be applied to types Integer and Real"))
			tester.validate(statements.get(6)).assertAll(error(null, "div operator cannot be applied to types String and Boolean"))
			tester.validate(statements.get(7)).assertAll(error(null, "mod operator cannot be applied to types Real and Real"))
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
			tester.validate((statements.get(1) as WritelnStatement).argument).assertOK
			tester.validate((statements.get(2) as WritelnStatement).argument).assertAll(error(null, "Cannot refer to c2 before it is declared"))
			tester.validate((statements.get(4) as VariableDeclaration).value).assertAll(error(null, "Cannot refer to c3 before it is declared"))
			statements.get(5) as WhileLoop => [
				tester.validate((statements.get(0) as WritelnStatement).argument).assertOK
				tester.validate((statements.get(1) as WritelnStatement).argument).assertAll(error(null, "Cannot refer to c4 before it is declared"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertAll(error(null, "not operator cannot be applied to type Integer"))
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
			tester.validate(statements.get(0)).assertOK
			tester.validate(statements.get(1)).assertOK
			tester.validate(statements.get(2)).assertAll(error(null, "- operator cannot be applied to type Boolean"))
		]
	}
	
	@Test
	def void testTypeCheckIfExpressionCondition() {
		'''
			program
				writeln(if true then
					0
				else begin
					1
				end)
				writeln(if 2 then
					3
				else begin
					4
				end)
			end
		'''.parse => [
			tester.validate((statements.get(0) as WritelnStatement).argument as IfExpression).assertOK
			tester.validate((statements.get(1) as WritelnStatement).argument as IfExpression).assertAll(error(null, "Expected Boolean, found Integer"))
		]
	}
	
	@Test
	def void testTypeCheckIfExpressionValues() {
		'''
			program
				writeln(if true then
					0
				else if true then
					1
				else begin
					2
				end)
				writeln(if true then
					3
				else if true then
					true or false
				else if true then
					4.4 + 5.5
				else begin
					"6"
				end)
			end
		'''.parse => [
			tester.validate((statements.get(0) as WritelnStatement).argument).assertOK;
			(statements.get(1) as WritelnStatement).argument as IfExpression => [
				3.assertEquals(validate.size)
				elseIfs.get(0).thenValue.assertError(FirePackage.Literals.OR_EXPRESSION, null, "Expected Integer, found Boolean")
				elseIfs.get(1).thenValue.assertError(FirePackage.Literals.ADDITIVE_EXPRESSION, null, "Expected Integer, found Real")
				elseValue.assertError(FirePackage.Literals.STRING_LITERAL, null, "Expected Integer, found String")
			]
		]
	}
	
	@Test
	def void testTypeCheckElseIfExpressionCondition() {
		'''
			program
				writeln(if true then
					0
				else if true then
					1
				else if 2 then
					3
				else begin
					4
				end)
			end
		'''.parse => [
			(statements.get(0) as WritelnStatement).argument as IfExpression => [
				tester.validate(elseIfs.get(0)).assertOK
				tester.validate(elseIfs.get(1)).assertAll(error(null, "Expected Boolean, found Integer"))
			]
		]
	}
}