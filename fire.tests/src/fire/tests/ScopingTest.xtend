package fire.tests

import com.google.inject.Inject
import fire.fire.AdditiveExpression
import fire.fire.AssignmentStatement
import fire.fire.ComparisonExpression
import fire.fire.FirePackage
import fire.fire.Program
import fire.fire.WhileLoop
import fire.fire.WritelnStatement
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
	def void testScope_AssignmentStatement_variable() {
		'''
			program
				const c1: Integer := 1
				var v1: Integer := 2
				v1 := 3
				while v1 < 4 do
					const c2: Integer := 5
					v1 := v1 + c2
					while v1 < 6 do
						const c3: Integer := 7
						v1 := v1 + c3
						while v1 < 8 do
							const c4: Integer := 9
							v1 := v1 + c4
						end
					end
				end
				var v2: Integer := 10
				writeln(c1 + v1 + v2)
			end
		'''.parse => [
			assertNoIssues;
			(statements.get(2) as AssignmentStatement).assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["c1", "v1", "v2"])
			statements.get(3) as WhileLoop => [
				(statements.get(1) as AssignmentStatement).assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["c1", "v1", "c2", "v2"])
				statements.get(2) as WhileLoop => [
					(statements.get(1) as AssignmentStatement).assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["c1", "v1", "c2", "c3", "v2"])
					((statements.get(2) as WhileLoop).statements.get(1) as AssignmentStatement).assertScope(FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE, #["c1", "v1", "c2", "c3", "c4", "v2"])
				]
			]
		]
	}
	
	@Test
	def void testScope_IdExpression_value() {
		'''
			program
				var v1: Integer := 1
				while v1 < 2 do
					const c1: Integer := 3
					v1 := v1 + c1
					while v1 < 4 do
						const c2: Integer := 5
						v1 := v1 + c2
						while v1 < 6 do
							const c3: Integer := 7
							v1 := v1 + c3
						end
					end
				end
				const c4: Integer := 8
				const c5: Integer := 9
				writeln(v1 + c4 + c5)
			end
		'''.parse => [
			assertNoIssues;
			statements.get(1) as WhileLoop => [
				(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c4", "c5"])
				(statements.get(1) as AssignmentStatement).value as AdditiveExpression => [
					left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c4", "c5"])
					right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c4", "c5"])
				]
				statements.get(2) as WhileLoop => [
					(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c4", "c5"])
					(statements.get(1) as AssignmentStatement).value as AdditiveExpression => [
						left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c2", "c4", "c5"])
						right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c2", "c4", "c5"])
					]
					statements.get(2) as WhileLoop => [
						(condition as ComparisonExpression).left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c2", "c4", "c5"])
						(statements.get(1) as AssignmentStatement).value as AdditiveExpression => [
							left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c2", "c3", "c4", "c5"])
							right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c1", "c2", "c3", "c4", "c5"])
						]
					]
				]
			]
			(statements.get(4) as WritelnStatement).argument as AdditiveExpression => [
				left as AdditiveExpression => [
					left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c4", "c5"])
					right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c4", "c5"])
				]
				right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["v1", "c4", "c5"])
			]
		]
	}
	
	def private assertScope(EObject context, EReference reference, Iterable<String> expected) {
		expected.sort.join(", ").assertEquals(context.getScope(reference).allElements.map[name].sort.join(", "))
	}
}