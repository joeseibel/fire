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

@SuppressWarnings("all")
public class InternalFireParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'writeln'", "'('", "')'", "'true'", "'false'", "'not'", "'-'", "'.'", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'/'", "'div'", "'mod'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
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

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_2_0=ruleWritelnStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getEndKeyword_3());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getWritelnStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWritelnStatement=ruleWritelnStatement();

            state._fsp--;

             current =iv_ruleWritelnStatement; 
            match(input,EOF,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFire.g:141:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalFire.g:142:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalFire.g:142:4: (lv_argument_2_0= ruleExpression )
            // InternalFire.g:143:5: lv_argument_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_argument_2_0=ruleExpression();

            state._fsp--;


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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:175:1: ruleExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:181:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalFire.g:182:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalFire.g:182:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalFire.g:183:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:191:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=21 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFire.g:192:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalFire.g:192:4: ()
            	    // InternalFire.g:193:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:199:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // InternalFire.g:200:5: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // InternalFire.g:200:5: (lv_operator_2_0= ruleComparisonOperator )
            	    // InternalFire.g:201:6: lv_operator_2_0= ruleComparisonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operator_2_0=ruleComparisonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"fire.Fire.ComparisonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalFire.g:218:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalFire.g:219:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalFire.g:219:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalFire.g:220:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fire.Fire.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

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


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalFire.g:242:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalFire.g:242:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalFire.g:243:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalFire.g:249:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:255:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalFire.g:256:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalFire.g:256:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalFire.g:257:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:265:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFire.g:266:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalFire.g:266:4: ()
            	    // InternalFire.g:267:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:273:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalFire.g:274:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalFire.g:274:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalFire.g:275:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"fire.Fire.AdditiveOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalFire.g:292:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalFire.g:293:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalFire.g:293:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalFire.g:294:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fire.Fire.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalFire.g:316:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalFire.g:316:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalFire.g:317:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalFire.g:323:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:329:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalFire.g:330:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalFire.g:330:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalFire.g:331:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;


            			current = this_TerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:339:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=26 && LA4_0<=29)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFire.g:340:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalFire.g:340:4: ()
            	    // InternalFire.g:341:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:347:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalFire.g:348:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalFire.g:348:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalFire.g:349:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"fire.Fire.MultiplicativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalFire.g:366:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalFire.g:367:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalFire.g:367:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalFire.g:368:6: lv_right_3_0= ruleTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleTerminalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalFire.g:390:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalFire.g:390:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalFire.g:391:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:397:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) ) ;
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
            // InternalFire.g:403:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) ) )
            // InternalFire.g:404:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) )
            {
            // InternalFire.g:404:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 16:
            case 17:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EOF||LA6_3==15||LA6_3==19||(LA6_3>=21 && LA6_3<=29)) ) {
                    alt6=3;
                }
                else if ( (LA6_3==20) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 14:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFire.g:405:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:405:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalFire.g:406:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalFire.g:406:4: ()
                    // InternalFire.g:407:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:413:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalFire.g:414:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalFire.g:414:5: (lv_value_1_0= RULE_STRING )
                    // InternalFire.g:415:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

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
                    break;
                case 2 :
                    // InternalFire.g:433:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // InternalFire.g:433:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // InternalFire.g:434:4: () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // InternalFire.g:434:4: ()
                    // InternalFire.g:435:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:441:4: ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalFire.g:442:5: ( (lv_value_3_0= 'true' ) )
                            {
                            // InternalFire.g:442:5: ( (lv_value_3_0= 'true' ) )
                            // InternalFire.g:443:6: (lv_value_3_0= 'true' )
                            {
                            // InternalFire.g:443:6: (lv_value_3_0= 'true' )
                            // InternalFire.g:444:7: lv_value_3_0= 'true'
                            {
                            lv_value_3_0=(Token)match(input,16,FOLLOW_2); 

                            							newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFire.g:457:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:464:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    {
                    // InternalFire.g:464:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    // InternalFire.g:465:4: () ( (lv_value_6_0= ruleLong ) )
                    {
                    // InternalFire.g:465:4: ()
                    // InternalFire.g:466:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:472:4: ( (lv_value_6_0= ruleLong ) )
                    // InternalFire.g:473:5: (lv_value_6_0= ruleLong )
                    {
                    // InternalFire.g:473:5: (lv_value_6_0= ruleLong )
                    // InternalFire.g:474:6: lv_value_6_0= ruleLong
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleLong();

                    state._fsp--;


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
                    break;
                case 4 :
                    // InternalFire.g:493:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:493:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    // InternalFire.g:494:4: () ( (lv_value_8_0= ruleDouble ) )
                    {
                    // InternalFire.g:494:4: ()
                    // InternalFire.g:495:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:501:4: ( (lv_value_8_0= ruleDouble ) )
                    // InternalFire.g:502:5: (lv_value_8_0= ruleDouble )
                    {
                    // InternalFire.g:502:5: (lv_value_8_0= ruleDouble )
                    // InternalFire.g:503:6: lv_value_8_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleDouble();

                    state._fsp--;


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
                    break;
                case 5 :
                    // InternalFire.g:522:3: ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:522:3: ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:523:4: () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:523:4: ()
                    // InternalFire.g:524:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1());
                    			
                    // InternalFire.g:534:4: ( (lv_operand_11_0= ruleTerminalExpression ) )
                    // InternalFire.g:535:5: (lv_operand_11_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:535:5: (lv_operand_11_0= ruleTerminalExpression )
                    // InternalFire.g:536:6: lv_operand_11_0= ruleTerminalExpression
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_11_0=ruleTerminalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_11_0,
                    							"fire.Fire.TerminalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFire.g:555:3: ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:555:3: ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:556:4: () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:556:4: ()
                    // InternalFire.g:557:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1());
                    			
                    // InternalFire.g:567:4: ( (lv_operand_14_0= ruleTerminalExpression ) )
                    // InternalFire.g:568:5: (lv_operand_14_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:568:5: (lv_operand_14_0= ruleTerminalExpression )
                    // InternalFire.g:569:6: lv_operand_14_0= ruleTerminalExpression
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_14_0=ruleTerminalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_14_0,
                    							"fire.Fire.TerminalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalFire.g:588:3: (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' )
                    {
                    // InternalFire.g:588:3: (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' )
                    // InternalFire.g:589:4: otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Expression_16=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_16;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalFire.g:610:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:610:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:611:2: iv_ruleLong= ruleLong EOF
            {
             newCompositeNode(grammarAccess.getLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLong=ruleLong();

            state._fsp--;

             current =iv_ruleLong.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:617:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:623:2: (this_INT_0= RULE_INT )
            // InternalFire.g:624:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getLongAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalFire.g:634:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:634:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:635:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:641:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:647:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:648:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:648:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:649:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "ruleComparisonOperator"
    // InternalFire.g:672:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:678:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // InternalFire.g:679:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalFire.g:679:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFire.g:680:3: (enumLiteral_0= '<' )
                    {
                    // InternalFire.g:680:3: (enumLiteral_0= '<' )
                    // InternalFire.g:681:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:688:3: (enumLiteral_1= '<=' )
                    {
                    // InternalFire.g:688:3: (enumLiteral_1= '<=' )
                    // InternalFire.g:689:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:696:3: (enumLiteral_2= '>' )
                    {
                    // InternalFire.g:696:3: (enumLiteral_2= '>' )
                    // InternalFire.g:697:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:704:3: (enumLiteral_3= '>=' )
                    {
                    // InternalFire.g:704:3: (enumLiteral_3= '>=' )
                    // InternalFire.g:705:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalFire.g:715:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:721:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalFire.g:722:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalFire.g:722:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFire.g:723:3: (enumLiteral_0= '+' )
                    {
                    // InternalFire.g:723:3: (enumLiteral_0= '+' )
                    // InternalFire.g:724:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:731:3: (enumLiteral_1= '-' )
                    {
                    // InternalFire.g:731:3: (enumLiteral_1= '-' )
                    // InternalFire.g:732:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalFire.g:742:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:748:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) )
            // InternalFire.g:749:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            {
            // InternalFire.g:749:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFire.g:750:3: (enumLiteral_0= '*' )
                    {
                    // InternalFire.g:750:3: (enumLiteral_0= '*' )
                    // InternalFire.g:751:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:758:3: (enumLiteral_1= '/' )
                    {
                    // InternalFire.g:758:3: (enumLiteral_1= '/' )
                    // InternalFire.g:759:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:766:3: (enumLiteral_2= 'div' )
                    {
                    // InternalFire.g:766:3: (enumLiteral_2= 'div' )
                    // InternalFire.g:767:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:774:3: (enumLiteral_3= 'mod' )
                    {
                    // InternalFire.g:774:3: (enumLiteral_3= 'mod' )
                    // InternalFire.g:775:4: enumLiteral_3= 'mod'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F4030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}