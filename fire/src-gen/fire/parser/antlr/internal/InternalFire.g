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
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getWritelnStatementAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWritelnStatementRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3());
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
