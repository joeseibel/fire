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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFireParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'writeln'", "'('", "')'", "'true'", "'false'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalFire.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalFire.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalFire.g:65:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalFire.g:71:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalFire.g:77:2: ( ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' ) )
            // InternalFire.g:78:2: ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' )
            {
            // InternalFire.g:78:2: ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end' )
            // InternalFire.g:79:3: () otherlv_1= 'program' ( (lv_statements_2_0= ruleWritelnStatement ) )* otherlv_3= 'end'
            {
            // InternalFire.g:79:3: ()
            // InternalFire.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
            // InternalFire.g:90:3: ( (lv_statements_2_0= ruleWritelnStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFire.g:91:4: (lv_statements_2_0= ruleWritelnStatement )
            	    {
            	    // InternalFire.g:91:4: (lv_statements_2_0= ruleWritelnStatement )
            	    // InternalFire.g:92:5: lv_statements_2_0= ruleWritelnStatement
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
    // InternalFire.g:117:1: entryRuleWritelnStatement returns [EObject current=null] : iv_ruleWritelnStatement= ruleWritelnStatement EOF ;
    public final EObject entryRuleWritelnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWritelnStatement = null;


        try {
            // InternalFire.g:117:57: (iv_ruleWritelnStatement= ruleWritelnStatement EOF )
            // InternalFire.g:118:2: iv_ruleWritelnStatement= ruleWritelnStatement EOF
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
    // InternalFire.g:124:1: ruleWritelnStatement returns [EObject current=null] : (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleWritelnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalFire.g:130:2: ( (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalFire.g:131:2: (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalFire.g:131:2: (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalFire.g:132:3: otherlv_0= 'writeln' otherlv_1= '(' ( (lv_argument_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFire.g:140:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalFire.g:141:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalFire.g:141:4: (lv_argument_2_0= ruleExpression )
            // InternalFire.g:142:5: lv_argument_2_0= ruleExpression
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
    // InternalFire.g:167:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFire.g:167:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFire.g:168:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFire.g:174:1: ruleExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalFire.g:180:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) ) )
            // InternalFire.g:181:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) )
            {
            // InternalFire.g:181:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 16:
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==18) ) {
                    alt3=4;
                }
                else if ( (LA3_3==EOF||LA3_3==15) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFire.g:182:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:182:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalFire.g:183:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalFire.g:183:4: ()
                    // InternalFire.g:184:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getStringLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:190:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalFire.g:191:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalFire.g:191:5: (lv_value_1_0= RULE_STRING )
                    // InternalFire.g:192:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
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
                    // InternalFire.g:210:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // InternalFire.g:210:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // InternalFire.g:211:4: () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // InternalFire.g:211:4: ()
                    // InternalFire.g:212:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:218:4: ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==16) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==17) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalFire.g:219:5: ( (lv_value_3_0= 'true' ) )
                            {
                            // InternalFire.g:219:5: ( (lv_value_3_0= 'true' ) )
                            // InternalFire.g:220:6: (lv_value_3_0= 'true' )
                            {
                            // InternalFire.g:220:6: (lv_value_3_0= 'true' )
                            // InternalFire.g:221:7: lv_value_3_0= 'true'
                            {
                            lv_value_3_0=(Token)match(input,16,FOLLOW_2); 

                            							newLeafNode(lv_value_3_0, grammarAccess.getExpressionAccess().getValueTrueKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFire.g:234:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getFalseKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:241:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    {
                    // InternalFire.g:241:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    // InternalFire.g:242:4: () ( (lv_value_6_0= ruleLong ) )
                    {
                    // InternalFire.g:242:4: ()
                    // InternalFire.g:243:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:249:4: ( (lv_value_6_0= ruleLong ) )
                    // InternalFire.g:250:5: (lv_value_6_0= ruleLong )
                    {
                    // InternalFire.g:250:5: (lv_value_6_0= ruleLong )
                    // InternalFire.g:251:6: lv_value_6_0= ruleLong
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getValueLongParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleLong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
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
                    // InternalFire.g:270:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:270:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    // InternalFire.g:271:4: () ( (lv_value_8_0= ruleDouble ) )
                    {
                    // InternalFire.g:271:4: ()
                    // InternalFire.g:272:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getRealLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:278:4: ( (lv_value_8_0= ruleDouble ) )
                    // InternalFire.g:279:5: (lv_value_8_0= ruleDouble )
                    {
                    // InternalFire.g:279:5: (lv_value_8_0= ruleDouble )
                    // InternalFire.g:280:6: lv_value_8_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getValueDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
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


    // $ANTLR start "entryRuleLong"
    // InternalFire.g:302:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:302:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:303:2: iv_ruleLong= ruleLong EOF
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
    // InternalFire.g:309:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:315:2: (this_INT_0= RULE_INT )
            // InternalFire.g:316:2: this_INT_0= RULE_INT
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
    // InternalFire.g:326:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:326:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:327:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalFire.g:333:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:339:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:340:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:340:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:341:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,18,FOLLOW_8); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}