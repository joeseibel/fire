/*
 * generated by Xtext 2.12.0
 */
package fire.ide.contentassist.antlr;

import com.google.inject.Inject;
import fire.ide.contentassist.antlr.internal.InternalFireParser;
import fire.services.FireGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

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
					put(grammarAccess.getCallableAccess().getAlternatives(), "rule__Callable__Alternatives");
					put(grammarAccess.getIdElementAccess().getAlternatives(), "rule__IdElement__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getVariableDeclarationAccess().getAlternatives_0(), "rule__VariableDeclaration__Alternatives_0");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives_2_1(), "rule__TerminalExpression__Alternatives_2_1");
					put(grammarAccess.getBuiltInTypeAccess().getAlternatives(), "rule__BuiltInType__Alternatives");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
					put(grammarAccess.getProcedureAccess().getGroup_3(), "rule__Procedure__Group_3__0");
					put(grammarAccess.getProcedureAccess().getGroup_3_1(), "rule__Procedure__Group_3_1__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
					put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup_4(), "rule__Statement__Group_4__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getElseIfStatementAccess().getGroup(), "rule__ElseIfStatement__Group__0");
					put(grammarAccess.getElseStatementAccess().getGroup(), "rule__ElseStatement__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getXorExpressionAccess().getGroup(), "rule__XorExpression__Group__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1(), "rule__XorExpression__Group_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0(), "rule__AdditiveExpression__Group_1_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0(), "rule__AdditiveExpression__Group_1_0_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_5(), "rule__TerminalExpression__Group_5__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_6(), "rule__TerminalExpression__Group_6__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_8(), "rule__TerminalExpression__Group_8__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getElseIfExpressionAccess().getGroup(), "rule__ElseIfExpression__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getProgramAccess().getCallablesAssignment_2(), "rule__Program__CallablesAssignment_2");
					put(grammarAccess.getProgramAccess().getStatementsAssignment_3(), "rule__Program__StatementsAssignment_3");
					put(grammarAccess.getProcedureAccess().getNameAssignment_1(), "rule__Procedure__NameAssignment_1");
					put(grammarAccess.getProcedureAccess().getParametersAssignment_3_0(), "rule__Procedure__ParametersAssignment_3_0");
					put(grammarAccess.getProcedureAccess().getParametersAssignment_3_1_1(), "rule__Procedure__ParametersAssignment_3_1_1");
					put(grammarAccess.getProcedureAccess().getStatementsAssignment_5(), "rule__Procedure__StatementsAssignment_5");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_3_0(), "rule__Function__ParametersAssignment_3_0");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1(), "rule__Function__ParametersAssignment_3_1_1");
					put(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6(), "rule__Function__ReturnTypeAssignment_6");
					put(grammarAccess.getFunctionAccess().getStatementsAssignment_7(), "rule__Function__StatementsAssignment_7");
					put(grammarAccess.getFunctionAccess().getValueAssignment_8(), "rule__Function__ValueAssignment_8");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getStatementAccess().getVariableAssignment_1_1(), "rule__Statement__VariableAssignment_1_1");
					put(grammarAccess.getStatementAccess().getValueAssignment_1_3(), "rule__Statement__ValueAssignment_1_3");
					put(grammarAccess.getStatementAccess().getArgumentAssignment_4_3(), "rule__Statement__ArgumentAssignment_4_3");
					put(grammarAccess.getVariableDeclarationAccess().getConstantAssignment_0_0(), "rule__VariableDeclaration__ConstantAssignment_0_0");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_3(), "rule__VariableDeclaration__TypeAssignment_3");
					put(grammarAccess.getVariableDeclarationAccess().getValueAssignment_5(), "rule__VariableDeclaration__ValueAssignment_5");
					put(grammarAccess.getWhileLoopAccess().getConditionAssignment_1(), "rule__WhileLoop__ConditionAssignment_1");
					put(grammarAccess.getWhileLoopAccess().getStatementsAssignment_3(), "rule__WhileLoop__StatementsAssignment_3");
					put(grammarAccess.getIfStatementAccess().getConditionAssignment_1(), "rule__IfStatement__ConditionAssignment_1");
					put(grammarAccess.getIfStatementAccess().getThenStatementsAssignment_3(), "rule__IfStatement__ThenStatementsAssignment_3");
					put(grammarAccess.getIfStatementAccess().getElseIfsAssignment_4(), "rule__IfStatement__ElseIfsAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseAssignment_5(), "rule__IfStatement__ElseAssignment_5");
					put(grammarAccess.getElseIfStatementAccess().getConditionAssignment_2(), "rule__ElseIfStatement__ConditionAssignment_2");
					put(grammarAccess.getElseIfStatementAccess().getThenStatementsAssignment_4(), "rule__ElseIfStatement__ThenStatementsAssignment_4");
					put(grammarAccess.getElseStatementAccess().getElseStatementsAssignment_3(), "rule__ElseStatement__ElseStatementsAssignment_3");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2(), "rule__XorExpression__RightAssignment_1_2");
					put(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1(), "rule__EqualityExpression__OperatorAssignment_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2(), "rule__EqualityExpression__RightAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2(), "rule__ComparisonExpression__RightAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__AdditiveExpression__OperatorAssignment_1_0_0_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1(), "rule__AdditiveExpression__RightAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1(), "rule__MultiplicativeExpression__OperatorAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__MultiplicativeExpression__RightAssignment_1_2");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1_0(), "rule__TerminalExpression__ValueAssignment_2_1_0");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1(), "rule__TerminalExpression__ValueAssignment_3_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1(), "rule__TerminalExpression__ValueAssignment_4_1");
					put(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2(), "rule__TerminalExpression__OperandAssignment_5_2");
					put(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_6_2(), "rule__TerminalExpression__OperandAssignment_6_2");
					put(grammarAccess.getIfExpressionAccess().getConditionAssignment_1(), "rule__IfExpression__ConditionAssignment_1");
					put(grammarAccess.getIfExpressionAccess().getThenStatementsAssignment_3(), "rule__IfExpression__ThenStatementsAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getThenValueAssignment_4(), "rule__IfExpression__ThenValueAssignment_4");
					put(grammarAccess.getIfExpressionAccess().getElseIfsAssignment_5(), "rule__IfExpression__ElseIfsAssignment_5");
					put(grammarAccess.getIfExpressionAccess().getElseStatementsAssignment_8(), "rule__IfExpression__ElseStatementsAssignment_8");
					put(grammarAccess.getIfExpressionAccess().getElseValueAssignment_9(), "rule__IfExpression__ElseValueAssignment_9");
					put(grammarAccess.getElseIfExpressionAccess().getConditionAssignment_2(), "rule__ElseIfExpression__ConditionAssignment_2");
					put(grammarAccess.getElseIfExpressionAccess().getThenStatementsAssignment_4(), "rule__ElseIfExpression__ThenStatementsAssignment_4");
					put(grammarAccess.getElseIfExpressionAccess().getThenValueAssignment_5(), "rule__ElseIfExpression__ThenValueAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
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
