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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'writeln'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
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
    // InternalFire.g:124:1: ruleWritelnStatement returns [EObject current=null] : (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleWritelnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFire.g:130:2: ( (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalFire.g:131:2: (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalFire.g:131:2: (otherlv_0= 'writeln' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalFire.g:132:3: otherlv_0= 'writeln' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFire.g:140:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalFire.g:141:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalFire.g:141:4: (lv_value_2_0= RULE_STRING )
            // InternalFire.g:142:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getWritelnStatementAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWritelnStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});

}