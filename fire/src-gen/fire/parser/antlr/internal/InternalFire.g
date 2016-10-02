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
					newCompositeNode(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0());
				}
				lv_statements_2_0=ruleWritelnStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"statements",
						lv_statements_2_0,
						"fire.Fire.WritelnStatement");
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

// Entry rule entryRuleWritelnStatement
entryRuleWritelnStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWritelnStatementRule()); }
	iv_ruleWritelnStatement=ruleWritelnStatement
	{ $current=$iv_ruleWritelnStatement.current; }
	EOF;

// Rule WritelnStatement
ruleWritelnStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='writeln'
		{
			newLeafNode(otherlv_0, grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0());
				}
				lv_argument_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWritelnStatementRule());
					}
					set(
						$current,
						"argument",
						lv_argument_2_0,
						"fire.Fire.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3());
		}
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
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExpressionAccess().getStringLiteralAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_STRING
					{
						newLeafNode(lv_value_1_0, grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
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
						grammarAccess.getExpressionAccess().getBooleanLiteralAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_3_0='true'
						{
							newLeafNode(lv_value_3_0, grammarAccess.getExpressionAccess().getValueTrueKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExpressionRule());
							}
							setWithLastConsumed($current, "value", true, "true");
						}
					)
				)
				    |
				otherlv_4='false'
				{
					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getFalseKeyword_1_1_1());
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getExpressionAccess().getIntegerLiteralAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getValueLongParserRuleCall_2_1_0());
					}
					lv_value_6_0=ruleLong
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"value",
							lv_value_6_0,
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
						grammarAccess.getExpressionAccess().getRealLiteralAction_3_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getValueDoubleParserRuleCall_3_1_0());
					}
					lv_value_8_0=ruleDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"value",
							lv_value_8_0,
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
						grammarAccess.getExpressionAccess().getNotExpressionAction_4_0(),
						$current);
				}
			)
			otherlv_10='not'
			{
				newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getNotKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getOperandExpressionParserRuleCall_4_2_0());
					}
					lv_operand_11_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_11_0,
							"fire.Fire.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_12='('
			{
				newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_5_0());
			}
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_5_1());
			}
			this_Expression_13=ruleExpression
			{
				$current = $this_Expression_13.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_14=')'
			{
				newLeafNode(otherlv_14, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_5_2());
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
