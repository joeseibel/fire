package fire.scoping

import fire.fire.FirePackage
import fire.fire.Program
import fire.fire.WhileLoop
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope

import static extension org.eclipse.emf.ecore.util.EcoreUtil.isAncestor
import static extension org.eclipse.xtext.scoping.Scopes.scopeFor

class FireScopeProvider extends AbstractFireScopeProvider {
	override getScope(EObject context, EReference reference) {
		switch reference {
			case FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE: scope_AssignmentStatement_variable(context)
			case FirePackage.Literals.ID_EXPRESSION__VALUE: scope_IdExpression_value(context, context)
			default: super.getScope(context, reference)
		}
	}
	
	def private static dispatch IScope scope_AssignmentStatement_variable(Program program) {
		program.statements.scopeFor
	}
	
	def private static dispatch IScope scope_AssignmentStatement_variable(WhileLoop whileLoop) {
		whileLoop.statements.scopeFor(scope_AssignmentStatement_variable(whileLoop.eContainer))
	}
	
	def private static dispatch IScope scope_AssignmentStatement_variable(EObject context) {
		scope_AssignmentStatement_variable(context.eContainer)
	}
	
	def private static dispatch IScope scope_IdExpression_value(Program program, EObject originalContext) {
		program.statements.scopeFor
	}
	
	def private static dispatch IScope scope_IdExpression_value(WhileLoop whileLoop, EObject originalContext) {
		val outer = scope_IdExpression_value(whileLoop.eContainer, originalContext)
		if (whileLoop.condition.isAncestor(originalContext)) {
			outer
		} else {
			whileLoop.statements.scopeFor(outer)
		}
	}
	
	def private static dispatch IScope scope_IdExpression_value(EObject context, EObject originalContext) {
		scope_IdExpression_value(context.eContainer, originalContext)
	}
}