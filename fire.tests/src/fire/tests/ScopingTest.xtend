package fire.tests

import com.google.inject.Inject
import fire.fire.AdditiveExpression
import fire.fire.AssignmentStatement
import fire.fire.ComparisonExpression
import fire.fire.FirePackage
import fire.fire.IfExpression
import fire.fire.IfStatement
import fire.fire.Program
import fire.fire.VariableDeclaration
import fire.fire.WhileLoop
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(FireInjectorProvider)
class ScopingTest {
	@Inject
	extension ParseHelper<Program>
	@Inject
	extension ValidationTestHelper
	@Inject
	extension IScopeProvider
	
	@Test
	def void testScope_VariableDeclaration() {
		'''
			program
				var v1: Integer := 1
				while v1 < 2 do
					const c1: Integer := 3
					v1 := v1 + c1
				end
				if v1 < 4 then
					const c2: Integer := 5
					v1 := v1 + c2
				else if v1 < 6 then
					const c3: Integer := 7
					v1 := v1 + c3
				else begin
					const c4: Integer := 8
					v1 := v1 + c4
				end
				v1 := if v1 < 9 then
					const c5: Integer := v1
					v1 + c5
				else if v1 < 10 then
					const c6: Integer := v1
					v1 + c6
				else begin
					const c7: Integer := v1
					v1 + c7
				end
				const c8: Integer := 11
				v1 := v1 + c8
			end
		'''.parse => [
			assertNoIssues
			statements.get(1) as WhileLoop => [
				(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
				statements.get(1) as AssignmentStatement => [
					assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["v1", "c1", "c8"])
					value as AdditiveExpression => [
						left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c8"])
						right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c8"])
					]
				]
			]
			statements.get(2) as IfStatement => [
				(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
				thenStatements.get(1) as AssignmentStatement => [
					assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["v1", "c2", "c8"])
					value as AdditiveExpression => [
						left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c2", "c8"])
						right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c2", "c8"])
					]
				]
				elseIfs.head => [
					(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
					thenStatements.get(1) as AssignmentStatement => [
						assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["v1", "c3", "c8"])
						value as AdditiveExpression => [
							left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c3", "c8"])
							right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c3", "c8"])
						]
					]
				]
				^else.elseStatements.get(1) as AssignmentStatement => [
					assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["v1", "c4", "c8"])
					value as AdditiveExpression => [
						left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c4", "c8"])
						right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c4", "c8"])
					]
				]
			]
			statements.get(3) as AssignmentStatement => [
				assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["v1", "c8"])
				value as IfExpression => [
					(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
					(thenStatements.head as VariableDeclaration).value.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c5", "c8"])
					thenValue as AdditiveExpression => [
						left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c5", "c8"])
						right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c5", "c8"])
					]
					elseIfs.head => [
						(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
						(thenStatements.head as VariableDeclaration).value.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c6", "c8"])
						thenValue as AdditiveExpression => [
							left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c6", "c8"])
							right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c6", "c8"])
						]
					]
					(elseStatements.head as VariableDeclaration).value.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c7", "c8"])
					elseValue as AdditiveExpression => [
						left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c7", "c8"])
						right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c7", "c8"])
					]
				]
			]
			statements.get(5) as AssignmentStatement => [
				assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["v1", "c8"])
				value as AdditiveExpression => [
					left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
					right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c8"])
				]
			]
		]
	}
	
	def private assertScope(EObject context, EReference reference, Iterable<String> expected) {
		expected.sort.join(", ").assertEquals(context.getScope(reference).allElements.map[name].sort.join(", "))
	}
}