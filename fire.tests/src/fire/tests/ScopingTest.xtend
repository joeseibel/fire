package fire.tests

import com.google.inject.Inject
import fire.fire.AdditiveExpression
import fire.fire.FirePackage
import fire.fire.Program
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
	def void testIdExpressionValueReference() {
		'''
			program
				const c1: Integer := 1
				const c2: Integer := 2
				const c3: Integer := 3
				writeln(c1 + c2 + c3)
			end
		'''.parse => [
			assertNoIssues;
			(statements.get(3) as WritelnStatement).argument as AdditiveExpression => [
				left as AdditiveExpression => [
					left.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["c1", "c2", "c3"])
					right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["c1", "c2", "c3"])
				]
				right.assertScope(FirePackage.Literals.ID_EXPRESSION__VALUE, #["c1", "c2", "c3"])
			]
		]
	}
	
	def private assertScope(EObject context, EReference reference, Iterable<String> expected) {
		expected.sort.join(", ").assertEquals(context.getScope(reference).allElements.map[name].sort.join(", "))
	}
}