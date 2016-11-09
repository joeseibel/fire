package fire.scoping

import fire.fire.ElseIfExpression
import fire.fire.ElseIfStatement
import fire.fire.ElseStatement
import fire.fire.FirePackage
import fire.fire.IfExpression
import fire.fire.IfStatement
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
			case FirePackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE,
			case FirePackage.Literals.ID_EXPRESSION__VALUE: scope_VariableDeclaration(context, context)
			default: super.getScope(context, reference)
		}
	}
	
	def private static dispatch IScope scope_VariableDeclaration(Program program, EObject originalContext) {
		program.statements.scopeFor
	}
	
	def private static dispatch IScope scope_VariableDeclaration(WhileLoop whileLoop, EObject originalContext) {
		val outer = scope_VariableDeclaration(whileLoop.eContainer, originalContext)
		if (whileLoop.condition.isAncestor(originalContext)) {
			outer
		} else {
			whileLoop.statements.scopeFor(outer)
		}
	}
	
	def private static dispatch IScope scope_VariableDeclaration(IfStatement ifStatement, EObject originalContext) {
		val outer = scope_VariableDeclaration(ifStatement.eContainer, originalContext)
		if (ifStatement.thenStatements.exists[isAncestor(originalContext)]) {
			ifStatement.thenStatements.scopeFor(outer)
		} else {
			outer
		}
	}
	
	def private static dispatch IScope scope_VariableDeclaration(ElseIfStatement elseIfStatement, EObject originalContext) {
		val outer = scope_VariableDeclaration(elseIfStatement.eContainer, originalContext)
		if (elseIfStatement.condition.isAncestor(originalContext)) {
			outer
		} else {
			elseIfStatement.thenStatements.scopeFor(outer)
		}
	}
	
	def private static dispatch IScope scope_VariableDeclaration(ElseStatement elseStatement, EObject originalContext) {
		elseStatement.elseStatements.scopeFor(scope_VariableDeclaration(elseStatement.eContainer, originalContext))
	}
	
	def private static dispatch IScope scope_VariableDeclaration(IfExpression ifExpression, EObject originalContext) {
		val outer = scope_VariableDeclaration(ifExpression.eContainer, originalContext)
		if (ifExpression.thenStatements.exists[isAncestor(originalContext)] || ifExpression.thenValue.isAncestor(originalContext)) {
			ifExpression.thenStatements.scopeFor(outer)
		} else if (ifExpression.elseStatements.exists[isAncestor(originalContext)] || ifExpression.elseValue.isAncestor(originalContext)) {
			ifExpression.elseStatements.scopeFor(outer)
		} else {
			outer
		}
	}
	
	def private static dispatch IScope scope_VariableDeclaration(ElseIfExpression elseIfExpression, EObject originalContext) {
		val outer = scope_VariableDeclaration(elseIfExpression.eContainer, originalContext)
		if (elseIfExpression.condition.isAncestor(originalContext)) {
			outer
		} else {
			elseIfExpression.thenStatements.scopeFor(outer)
		}
	}
	
	def private static dispatch IScope scope_VariableDeclaration(EObject context, EObject originalContext) {
		scope_VariableDeclaration(context.eContainer, originalContext)
	}
}