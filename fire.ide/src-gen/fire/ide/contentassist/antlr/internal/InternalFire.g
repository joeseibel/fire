/*
 * generated by Xtext 2.10.0
 */
grammar InternalFire;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fire.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fire.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fire.services.FireGrammarAccess;

}
@parser::members {
	private FireGrammarAccess grammarAccess;

	public void setGrammarAccess(FireGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleProgram
entryRuleProgram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWritelnStatement
entryRuleWritelnStatement
:
{ before(grammarAccess.getWritelnStatementRule()); }
	 ruleWritelnStatement
{ after(grammarAccess.getWritelnStatementRule()); } 
	 EOF 
;

// Rule WritelnStatement
ruleWritelnStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWritelnStatementAccess().getGroup()); }
		(rule__WritelnStatement__Group__0)
		{ after(grammarAccess.getWritelnStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLong
entryRuleLong
:
{ before(grammarAccess.getLongRule()); }
	 ruleLong
{ after(grammarAccess.getLongRule()); } 
	 EOF 
;

// Rule Long
ruleLong 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLongAccess().getINTTerminalRuleCall()); }
		RULE_INT
		{ after(grammarAccess.getLongAccess().getINTTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDouble
entryRuleDouble
:
{ before(grammarAccess.getDoubleRule()); }
	 ruleDouble
{ after(grammarAccess.getDoubleRule()); } 
	 EOF 
;

// Rule Double
ruleDouble 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDoubleAccess().getGroup()); }
		(rule__Double__Group__0)
		{ after(grammarAccess.getDoubleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_0()); }
		(rule__Expression__Group_0__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
		(rule__Expression__Group_1__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_2()); }
		(rule__Expression__Group_2__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_3()); }
		(rule__Expression__Group_3__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_4()); }
		(rule__Expression__Group_4__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_5()); }
		(rule__Expression__Group_5__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueAssignment_1_1_0()); }
		(rule__Expression__ValueAssignment_1_1_0)
		{ after(grammarAccess.getExpressionAccess().getValueAssignment_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getFalseKeyword_1_1_1()); }
		'false'
		{ after(grammarAccess.getExpressionAccess().getFalseKeyword_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramAction_0()); }
	()
	{ after(grammarAccess.getProgramAccess().getProgramAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramKeyword_1()); }
	'program'
	{ after(grammarAccess.getProgramAccess().getProgramKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
	rule__Program__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); }
	(rule__Program__StatementsAssignment_2)*
	{ after(grammarAccess.getProgramAccess().getStatementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getEndKeyword_3()); }
	'end'
	{ after(grammarAccess.getProgramAccess().getEndKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WritelnStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WritelnStatement__Group__0__Impl
	rule__WritelnStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0()); }
	'writeln'
	{ after(grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WritelnStatement__Group__1__Impl
	rule__WritelnStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WritelnStatement__Group__2__Impl
	rule__WritelnStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); }
	(rule__WritelnStatement__ArgumentAssignment_2)
	{ after(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WritelnStatement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__0__Impl
	rule__Expression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getStringLiteralAction_0_0()); }
	()
	{ after(grammarAccess.getExpressionAccess().getStringLiteralAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); }
	(rule__Expression__ValueAssignment_0_1)
	{ after(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getBooleanLiteralAction_1_0()); }
	()
	{ after(grammarAccess.getExpressionAccess().getBooleanLiteralAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getAlternatives_1_1()); }
	(rule__Expression__Alternatives_1_1)
	{ after(grammarAccess.getExpressionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_2__0__Impl
	rule__Expression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getIntegerLiteralAction_2_0()); }
	()
	{ after(grammarAccess.getExpressionAccess().getIntegerLiteralAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); }
	(rule__Expression__ValueAssignment_2_1)
	{ after(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__0__Impl
	rule__Expression__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRealLiteralAction_3_0()); }
	()
	{ after(grammarAccess.getExpressionAccess().getRealLiteralAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getValueAssignment_3_1()); }
	(rule__Expression__ValueAssignment_3_1)
	{ after(grammarAccess.getExpressionAccess().getValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_4__0__Impl
	rule__Expression__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getNotExpressionAction_4_0()); }
	()
	{ after(grammarAccess.getExpressionAccess().getNotExpressionAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_4__1__Impl
	rule__Expression__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getNotKeyword_4_1()); }
	'not'
	{ after(grammarAccess.getExpressionAccess().getNotKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getOperandAssignment_4_2()); }
	(rule__Expression__OperandAssignment_4_2)
	{ after(grammarAccess.getExpressionAccess().getOperandAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_5__0__Impl
	rule__Expression__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_5_0()); }
	'('
	{ after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_5__1__Impl
	rule__Expression__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_5_1()); }
	ruleExpression
	{ after(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_5_2()); }
	')'
	{ after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Double__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Double__Group__0__Impl
	rule__Double__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Double__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Double__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Double__Group__1__Impl
	rule__Double__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Double__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Double__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Double__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Double__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__StatementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0()); }
		ruleWritelnStatement
		{ after(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WritelnStatement__ArgumentAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueTrueKeyword_1_1_0_0()); }
		(
			{ before(grammarAccess.getExpressionAccess().getValueTrueKeyword_1_1_0_0()); }
			'true'
			{ after(grammarAccess.getExpressionAccess().getValueTrueKeyword_1_1_0_0()); }
		)
		{ after(grammarAccess.getExpressionAccess().getValueTrueKeyword_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueLongParserRuleCall_2_1_0()); }
		ruleLong
		{ after(grammarAccess.getExpressionAccess().getValueLongParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueDoubleParserRuleCall_3_1_0()); }
		ruleDouble
		{ after(grammarAccess.getExpressionAccess().getValueDoubleParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__OperandAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getOperandExpressionParserRuleCall_4_2_0()); }
		ruleExpression
		{ after(grammarAccess.getExpressionAccess().getOperandExpressionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
