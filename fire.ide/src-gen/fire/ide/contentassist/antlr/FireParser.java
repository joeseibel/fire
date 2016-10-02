/*
 * generated by Xtext 2.10.0
 */
package fire.ide.contentassist.antlr;

import com.google.inject.Inject;
import fire.ide.contentassist.antlr.internal.InternalFireParser;
import fire.services.FireGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FireParser extends AbstractContentAssistParser {

	@Inject
	private FireGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFireParser createParser() {
		InternalFireParser result = new InternalFireParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1(), "rule__TerminalExpression__Alternatives_1_1");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getWritelnStatementAccess().getGroup(), "rule__WritelnStatement__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_0(), "rule__Expression__Group_1_0__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_0_0(), "rule__Expression__Group_1_0_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0(), "rule__MultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__MultiplicativeExpression__Group_1_0_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_5(), "rule__TerminalExpression__Group_5__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_6(), "rule__TerminalExpression__Group_6__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getProgramAccess().getStatementsAssignment_2(), "rule__Program__StatementsAssignment_2");
					put(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2(), "rule__WritelnStatement__ArgumentAssignment_2");
					put(grammarAccess.getExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__Expression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_1(), "rule__Expression__RightAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1(), "rule__MultiplicativeExpression__RightAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0(), "rule__TerminalExpression__ValueAssignment_1_1_0");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1(), "rule__TerminalExpression__ValueAssignment_3_1");
					put(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2(), "rule__TerminalExpression__OperandAssignment_4_2");
					put(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2(), "rule__TerminalExpression__OperandAssignment_5_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFireParser typedParser = (InternalFireParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FireGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FireGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
