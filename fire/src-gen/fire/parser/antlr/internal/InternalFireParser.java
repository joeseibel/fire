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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFireParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'writeln'", "'('", "')'", "'true'", "'false'", "'not'", "'-'", "'.'", "'*'", "'/'", "'div'", "'mod'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFireParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFireParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFireParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFire.g"; }



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




    // $ANTLR start "entryRuleProgram"
    // InternalFire.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalFire.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalFire.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalFire.g:72:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalFire.g:78:2: ( ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' ) )
            // InternalFire.g:79:2: ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' )
            {
            // InternalFire.g:79:2: ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' )
            // InternalFire.g:80:3: () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end'
            {
            // InternalFire.g:80:3: ()
            // InternalFire.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProgramAccess().getProgramAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
              		
            }
            // InternalFire.g:91:3: ( (lv_statements_2_0= ruleWritelnStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFire.g:92:4: (lv_statements_2_0= ruleWritelnStatement )
            	    {
            	    // InternalFire.g:92:4: (lv_statements_2_0= ruleWritelnStatement )
            	    // InternalFire.g:93:5: lv_statements_2_0= ruleWritelnStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_2_0=ruleWritelnStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"fire.Fire.WritelnStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getEndKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleWritelnStatement"
    // InternalFire.g:118:1: entryRuleWritelnStatement returns [EObject current=null] : iv_ruleWritelnStatement= ruleWritelnStatement EOF ;
    public final EObject entryRuleWritelnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWritelnStatement = null;


        try {
            // InternalFire.g:118:57: (iv_ruleWritelnStatement= ruleWritelnStatement EOF )
            // InternalFire.g:119:2: iv_ruleWritelnStatement= ruleWritelnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWritelnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWritelnStatement=ruleWritelnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWritelnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWritelnStatement"


    // $ANTLR start "ruleWritelnStatement"
    // InternalFire.g:125:1: ruleWritelnStatement returns [EObject current=null] : (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleWritelnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalFire.g:131:2: ( (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalFire.g:132:2: (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalFire.g:132:2: (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalFire.g:133:3: otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalFire.g:141:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalFire.g:142:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalFire.g:142:4: (lv_argument_2_0= ruleExpression )
            // InternalFire.g:143:5: lv_argument_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_argument_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWritelnStatementRule());
              					}
              					set(
              						current,
              						"argument",
              						lv_argument_2_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWritelnStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalFire.g:168:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFire.g:168:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFire.g:169:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFire.g:175:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:181:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalFire.g:182:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalFire.g:182:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalFire.g:183:3: this_TerminalExpression_0= ruleTerminalExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:191:3: ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_InternalFire()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (synpred1_InternalFire()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA2_4 = input.LA(2);

                    if ( (synpred1_InternalFire()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA2_5 = input.LA(2);

                    if ( (synpred1_InternalFire()) ) {
                        alt2=1;
                    }


                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalFire.g:192:4: ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalFire.g:192:4: ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ) )
            	    // InternalFire.g:193:5: ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) )
            	    {
            	    // InternalFire.g:203:5: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) )
            	    // InternalFire.g:204:6: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    {
            	    // InternalFire.g:204:6: ()
            	    // InternalFire.g:205:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getExpressionAccess().getMultiplicativeExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalFire.g:211:6: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalFire.g:212:7: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalFire.g:212:7: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalFire.g:213:8: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"fire.Fire.MultiplicativeOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalFire.g:232:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalFire.g:233:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalFire.g:233:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalFire.g:234:6: lv_right_3_0= ruleTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"fire.Fire.TerminalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalFire.g:256:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalFire.g:256:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalFire.g:257:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalFire.g:263:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        EObject lv_operand_11_0 = null;

        EObject lv_operand_14_0 = null;

        EObject this_Expression_16 = null;



        	enterRule();

        try {
            // InternalFire.g:269:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) ) )
            // InternalFire.g:270:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) )
            {
            // InternalFire.g:270:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case 16:
            case 17:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==20) ) {
                    alt4=4;
                }
                else if ( (LA4_3==EOF||LA4_3==15||(LA4_3>=21 && LA4_3<=24)) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 14:
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFire.g:271:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:271:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalFire.g:272:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalFire.g:272:4: ()
                    // InternalFire.g:273:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:279:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalFire.g:280:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalFire.g:280:5: (lv_value_1_0= RULE_STRING )
                    // InternalFire.g:281:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:299:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // InternalFire.g:299:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // InternalFire.g:300:4: () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // InternalFire.g:300:4: ()
                    // InternalFire.g:301:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:307:4: ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==17) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalFire.g:308:5: ( (lv_value_3_0= 'true' ) )
                            {
                            // InternalFire.g:308:5: ( (lv_value_3_0= 'true' ) )
                            // InternalFire.g:309:6: (lv_value_3_0= 'true' )
                            {
                            // InternalFire.g:309:6: (lv_value_3_0= 'true' )
                            // InternalFire.g:310:7: lv_value_3_0= 'true'
                            {
                            lv_value_3_0=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFire.g:323:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:330:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    {
                    // InternalFire.g:330:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    // InternalFire.g:331:4: () ( (lv_value_6_0= ruleLong ) )
                    {
                    // InternalFire.g:331:4: ()
                    // InternalFire.g:332:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:338:4: ( (lv_value_6_0= ruleLong ) )
                    // InternalFire.g:339:5: (lv_value_6_0= ruleLong )
                    {
                    // InternalFire.g:339:5: (lv_value_6_0= ruleLong )
                    // InternalFire.g:340:6: lv_value_6_0= ruleLong
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleLong();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"fire.Fire.Long");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:359:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:359:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    // InternalFire.g:360:4: () ( (lv_value_8_0= ruleDouble ) )
                    {
                    // InternalFire.g:360:4: ()
                    // InternalFire.g:361:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:367:4: ( (lv_value_8_0= ruleDouble ) )
                    // InternalFire.g:368:5: (lv_value_8_0= ruleDouble )
                    {
                    // InternalFire.g:368:5: (lv_value_8_0= ruleDouble )
                    // InternalFire.g:369:6: lv_value_8_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"fire.Fire.Double");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFire.g:388:3: ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) ) )
                    {
                    // InternalFire.g:388:3: ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) ) )
                    // InternalFire.g:389:4: () otherlv_10= 'not' ( (lv_operand_11_0= ruleExpression ) )
                    {
                    // InternalFire.g:389:4: ()
                    // InternalFire.g:390:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1());
                      			
                    }
                    // InternalFire.g:400:4: ( (lv_operand_11_0= ruleExpression ) )
                    // InternalFire.g:401:5: (lv_operand_11_0= ruleExpression )
                    {
                    // InternalFire.g:401:5: (lv_operand_11_0= ruleExpression )
                    // InternalFire.g:402:6: lv_operand_11_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_11_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_11_0,
                      							"fire.Fire.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFire.g:421:3: ( () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) ) )
                    {
                    // InternalFire.g:421:3: ( () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) ) )
                    // InternalFire.g:422:4: () otherlv_13= '-' ( (lv_operand_14_0= ruleExpression ) )
                    {
                    // InternalFire.g:422:4: ()
                    // InternalFire.g:423:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1());
                      			
                    }
                    // InternalFire.g:433:4: ( (lv_operand_14_0= ruleExpression ) )
                    // InternalFire.g:434:5: (lv_operand_14_0= ruleExpression )
                    {
                    // InternalFire.g:434:5: (lv_operand_14_0= ruleExpression )
                    // InternalFire.g:435:6: lv_operand_14_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_14_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_14_0,
                      							"fire.Fire.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalFire.g:454:3: (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' )
                    {
                    // InternalFire.g:454:3: (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' )
                    // InternalFire.g:455:4: otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_Expression_16=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_16;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_17=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleLong"
    // InternalFire.g:476:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:476:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:477:2: iv_ruleLong= ruleLong EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLongRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLong=ruleLong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLong.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // InternalFire.g:483:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:489:2: (this_INT_0= RULE_INT )
            // InternalFire.g:490:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getLongAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleDouble"
    // InternalFire.g:500:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:500:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:501:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalFire.g:507:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:513:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:514:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:514:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:515:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalFire.g:538:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:544:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) )
            // InternalFire.g:545:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            {
            // InternalFire.g:545:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFire.g:546:3: (enumLiteral_0= '*' )
                    {
                    // InternalFire.g:546:3: (enumLiteral_0= '*' )
                    // InternalFire.g:547:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:554:3: (enumLiteral_1= '/' )
                    {
                    // InternalFire.g:554:3: (enumLiteral_1= '/' )
                    // InternalFire.g:555:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:562:3: (enumLiteral_2= 'div' )
                    {
                    // InternalFire.g:562:3: (enumLiteral_2= 'div' )
                    // InternalFire.g:563:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:570:3: (enumLiteral_3= 'mod' )
                    {
                    // InternalFire.g:570:3: (enumLiteral_3= 'mod' )
                    // InternalFire.g:571:4: enumLiteral_3= 'mod'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"

    // $ANTLR start synpred1_InternalFire
    public final void synpred1_InternalFire_fragment() throws RecognitionException {   
        // InternalFire.g:193:5: ( ( () ( ( ruleMultiplicativeOperator ) ) ) )
        // InternalFire.g:193:6: ( () ( ( ruleMultiplicativeOperator ) ) )
        {
        // InternalFire.g:193:6: ( () ( ( ruleMultiplicativeOperator ) ) )
        // InternalFire.g:194:6: () ( ( ruleMultiplicativeOperator ) )
        {
        // InternalFire.g:194:6: ()
        // InternalFire.g:195:6: 
        {
        }

        // InternalFire.g:196:6: ( ( ruleMultiplicativeOperator ) )
        // InternalFire.g:197:7: ( ruleMultiplicativeOperator )
        {
        // InternalFire.g:197:7: ( ruleMultiplicativeOperator )
        // InternalFire.g:198:8: ruleMultiplicativeOperator
        {
        pushFollow(FOLLOW_2);
        ruleMultiplicativeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalFire

    // Delegated rules

    public final boolean synpred1_InternalFire() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFire_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F4030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}