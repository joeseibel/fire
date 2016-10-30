/*
 * generated by Xtext 2.10.0
 */
grammar InternalFire;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fire.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fire.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fire.services.FireGrammarAccess;

}

@parser::members {

 	private FireGrammarAccess grammarAccess;

    public InternalFireParser(TokenStream input, FireGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected FireGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProgramAccess().getProgramAction_0(),
					$current);
			}
		)
		otherlv_1='program'
		{
			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0());
				}
				lv_statements_2_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"statements",
						lv_statements_2_0,
						"fire.Fire.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getEndKeyword_3());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStatementAccess().getVariableDeclarationAction_0_0(),
						$current);
				}
			)
			(
				(
					(
						lv_constant_1_0='const'
						{
							newLeafNode(lv_constant_1_0, grammarAccess.getStatementAccess().getConstantConstKeyword_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStatementRule());
							}
							setWithLastConsumed($current, "constant", true, "const");
						}
					)
				)
				    |
				otherlv_2='var'
				{
					newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getVarKeyword_0_1_1());
				}
			)
			(
				(
					lv_name_3_0=RULE_ID
					{
						newLeafNode(lv_name_3_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStatementRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getColonKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getTypeBuiltInTypeEnumRuleCall_0_4_0());
					}
					lv_type_5_0=ruleBuiltInType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"type",
							lv_type_5_0,
							"fire.Fire.BuiltInType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=':='
			{
				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_5());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_0_6_0());
					}
					lv_value_7_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"value",
							lv_value_7_0,
							"fire.Fire.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStatementAccess().getAssignmentStatementAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStatementRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getVariableVariableDeclarationCrossReference_1_1_0());
					}
				)
			)
			otherlv_10=':='
			{
				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_1_3_0());
					}
					lv_value_11_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"value",
							lv_value_11_0,
							"fire.Fire.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStatementAccess().getWhileLoopAction_2_0(),
						$current);
				}
			)
			otherlv_13='while'
			{
				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getWhileKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getConditionExpressionParserRuleCall_2_2_0());
					}
					lv_condition_14_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"condition",
							lv_condition_14_0,
							"fire.Fire.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_15='do'
			{
				newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getDoKeyword_2_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0());
					}
					lv_statements_16_0=ruleStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						add(
							$current,
							"statements",
							lv_statements_16_0,
							"fire.Fire.Statement");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_17='end'
			{
				newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getEndKeyword_2_5());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStatementAccess().getWritelnStatementAction_3_0(),
						$current);
				}
			)
			otherlv_19='writeln'
			{
				newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getWritelnKeyword_3_1());
			}
			otherlv_20='('
			{
				newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_3_3_0());
					}
					lv_argument_21_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatementRule());
						}
						set(
							$current,
							"argument",
							lv_argument_21_0,
							"fire.Fire.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_22=')'
			{
				newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_4());
			}
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='or'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOrKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0());
		}
		this_XorExpression_0=ruleXorExpression
		{
			$current = $this_XorExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleXorExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.XorExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleXorExpression
entryRuleXorExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXorExpressionRule()); }
	iv_ruleXorExpression=ruleXorExpression
	{ $current=$iv_ruleXorExpression.current; }
	EOF;

// Rule XorExpression
ruleXorExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0());
		}
		this_EqualityExpression_0=ruleEqualityExpression
		{
			$current = $this_EqualityExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='xor'
			{
				newLeafNode(otherlv_2, grammarAccess.getXorExpressionAccess().getXorKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleEqualityExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getXorExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.EqualityExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEqualityExpression
entryRuleEqualityExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualityExpressionRule()); }
	iv_ruleEqualityExpression=ruleEqualityExpression
	{ $current=$iv_ruleEqualityExpression.current; }
	EOF;

// Rule EqualityExpression
ruleEqualityExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0());
		}
		this_ComparisonExpression_0=ruleComparisonExpression
		{
			$current = $this_ComparisonExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleEqualityOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"fire.Fire.EqualityOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparisonExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.ComparisonExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparisonExpression
entryRuleComparisonExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonExpressionRule()); }
	iv_ruleComparisonExpression=ruleComparisonExpression
	{ $current=$iv_ruleComparisonExpression.current; }
	EOF;

// Rule ComparisonExpression
ruleComparisonExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
		}
		this_AdditiveExpression_0=ruleAdditiveExpression
		{
			$current = $this_AdditiveExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleComparisonOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"fire.Fire.ComparisonOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAdditiveExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.AdditiveExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAdditiveExpression
entryRuleAdditiveExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditiveExpressionRule()); }
	iv_ruleAdditiveExpression=ruleAdditiveExpression
	{ $current=$iv_ruleAdditiveExpression.current; }
	EOF;

// Rule AdditiveExpression
ruleAdditiveExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
		}
		this_MultiplicativeExpression_0=ruleMultiplicativeExpression
		{
			$current = $this_MultiplicativeExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleAdditiveOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"fire.Fire.AdditiveOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplicativeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.MultiplicativeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); }
	iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression
	{ $current=$iv_ruleMultiplicativeExpression.current; }
	EOF;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0());
		}
		this_TerminalExpression_0=ruleTerminalExpression
		{
			$current = $this_TerminalExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleMultiplicativeOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"fire.Fire.MultiplicativeOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleTerminalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fire.Fire.TerminalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminalExpression
entryRuleTerminalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalExpressionRule()); }
	iv_ruleTerminalExpression=ruleTerminalExpression
	{ $current=$iv_ruleTerminalExpression.current; }
	EOF;

// Rule TerminalExpression
ruleTerminalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getIdExpressionAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalExpressionRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getTerminalExpressionAccess().getValueVariableDeclarationCrossReference_0_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0=RULE_STRING
					{
						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_5_0='true'
						{
							newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalExpressionRule());
							}
							setWithLastConsumed($current, "value", true, "true");
						}
					)
				)
				    |
				otherlv_6='false'
				{
					newLeafNode(otherlv_6, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_2_1_1());
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_3_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_3_1_0());
					}
					lv_value_8_0=ruleLong
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
						}
						set(
							$current,
							"value",
							lv_value_8_0,
							"fire.Fire.Long");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_4_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_4_1_0());
					}
					lv_value_10_0=ruleDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
						}
						set(
							$current,
							"value",
							lv_value_10_0,
							"fire.Fire.Double");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_5_0(),
						$current);
				}
			)
			otherlv_12='not'
			{
				newLeafNode(otherlv_12, grammarAccess.getTerminalExpressionAccess().getNotKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0());
					}
					lv_operand_13_0=ruleTerminalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_13_0,
							"fire.Fire.TerminalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_6_0(),
						$current);
				}
			)
			otherlv_15='-'
			{
				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_6_2_0());
					}
					lv_operand_16_0=ruleTerminalExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_16_0,
							"fire.Fire.TerminalExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_17='('
			{
				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_0());
			}
			{
				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_7_1());
			}
			this_Expression_18=ruleExpression
			{
				$current = $this_Expression_18.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_19=')'
			{
				newLeafNode(otherlv_19, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_2());
			}
		)
	)
;

// Entry rule entryRuleLong
entryRuleLong returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLongRule()); }
	iv_ruleLong=ruleLong
	{ $current=$iv_ruleLong.current.getText(); }
	EOF;

// Rule Long
ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getLongAccess().getINTTerminalRuleCall());
	}
;

// Entry rule entryRuleDouble
entryRuleDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDoubleRule()); }
	iv_ruleDouble=ruleDouble
	{ $current=$iv_ruleDouble.current.getText(); }
	EOF;

// Rule Double
ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Rule BuiltInType
ruleBuiltInType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='String'
			{
				$current = grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Boolean'
			{
				$current = grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Integer'
			{
				$current = grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Real'
			{
				$current = grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule EqualityOperator
ruleEqualityOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='='
			{
				$current = grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='<>'
			{
				$current = grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ComparisonOperator
ruleComparisonOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='<'
			{
				$current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='<='
			{
				$current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='>'
			{
				$current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='>='
			{
				$current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule AdditiveOperator
ruleAdditiveOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='+'
			{
				$current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='-'
			{
				$current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule MultiplicativeOperator
ruleMultiplicativeOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='*'
			{
				$current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='/'
			{
				$current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='div'
			{
				$current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='mod'
			{
				$current = grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
