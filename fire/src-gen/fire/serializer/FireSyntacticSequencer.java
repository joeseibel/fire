/*
 * generated by Xtext 2.10.0
 */
package fire.serializer;

import com.google.inject.Inject;
import fire.services.FireGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FireSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FireGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TerminalExpression_LeftParenthesisKeyword_6_0_a;
	protected AbstractElementAlias match_TerminalExpression_LeftParenthesisKeyword_6_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FireGrammarAccess) access;
		match_TerminalExpression_LeftParenthesisKeyword_6_0_a = new TokenAlias(true, true, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0());
		match_TerminalExpression_LeftParenthesisKeyword_6_0_p = new TokenAlias(true, false, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_TerminalExpression_LeftParenthesisKeyword_6_0_a.equals(syntax))
				emit_TerminalExpression_LeftParenthesisKeyword_6_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TerminalExpression_LeftParenthesisKeyword_6_0_p.equals(syntax))
				emit_TerminalExpression_LeftParenthesisKeyword_6_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' operand=TerminalExpression
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'not' operand=TerminalExpression
	 *     (rule start) (ambiguity) value=Double
	 *     (rule start) (ambiguity) value=Long
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {AdditiveExpression.left=}
	 *     (rule start) (ambiguity) {AndExpression.left=}
	 *     (rule start) (ambiguity) {ComparisonExpression.left=}
	 *     (rule start) (ambiguity) {EqualityExpression.left=}
	 *     (rule start) (ambiguity) {MultiplicativeExpression.left=}
	 *     (rule start) (ambiguity) {OrExpression.left=}
	 *     (rule start) (ambiguity) {XorExpression.left=}
	 */
	protected void emit_TerminalExpression_LeftParenthesisKeyword_6_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {AdditiveExpression.left=}
	 *     (rule start) (ambiguity) {AndExpression.left=}
	 *     (rule start) (ambiguity) {ComparisonExpression.left=}
	 *     (rule start) (ambiguity) {EqualityExpression.left=}
	 *     (rule start) (ambiguity) {MultiplicativeExpression.left=}
	 *     (rule start) (ambiguity) {OrExpression.left=}
	 *     (rule start) (ambiguity) {XorExpression.left=}
	 */
	protected void emit_TerminalExpression_LeftParenthesisKeyword_6_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
