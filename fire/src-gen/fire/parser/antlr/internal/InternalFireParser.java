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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'const'", "':'", "':='", "'writeln'", "'('", "')'", "'or'", "'and'", "'xor'", "'true'", "'false'", "'not'", "'-'", "'.'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'/'", "'div'", "'mod'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalFire.g:72:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalFire.g:78:2: ( ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'end' ) )
            // InternalFire.g:79:2: ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'end' )
            {
            // InternalFire.g:79:2: ( () otherlv_1= 'program' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'end' )
            // InternalFire.g:80:3: () otherlv_1= 'program' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= 'end'
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
            		
            // InternalFire.g:91:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFire.g:92:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalFire.g:92:4: (lv_statements_2_0= ruleStatement )
            	    // InternalFire.g:93:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"fire.Fire.Statement");
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


    // $ANTLR start "entryRuleStatement"
    // InternalFire.g:118:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalFire.g:118:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFire.g:119:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFire.g:125:1: ruleStatement returns [EObject current=null] : ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) ) | ( () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_argument_10_0 = null;



        	enterRule();

        try {
            // InternalFire.g:131:2: ( ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) ) | ( () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')' ) ) )
            // InternalFire.g:132:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) ) | ( () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')' ) )
            {
            // InternalFire.g:132:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) ) | ( () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFire.g:133:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) )
                    {
                    // InternalFire.g:133:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) )
                    // InternalFire.g:134:4: () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) )
                    {
                    // InternalFire.g:134:4: ()
                    // InternalFire.g:135:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getConstantDeclarationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getConstKeyword_0_1());
                    			
                    // InternalFire.g:145:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalFire.g:146:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalFire.g:146:5: (lv_name_2_0= RULE_ID )
                    // InternalFire.g:147:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getColonKeyword_0_3());
                    			
                    // InternalFire.g:167:4: ( (lv_type_4_0= ruleBuiltInType ) )
                    // InternalFire.g:168:5: (lv_type_4_0= ruleBuiltInType )
                    {
                    // InternalFire.g:168:5: (lv_type_4_0= ruleBuiltInType )
                    // InternalFire.g:169:6: lv_type_4_0= ruleBuiltInType
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getTypeBuiltInTypeEnumRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_type_4_0=ruleBuiltInType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"fire.Fire.BuiltInType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_5());
                    			
                    // InternalFire.g:190:4: ( (lv_value_6_0= ruleExpression ) )
                    // InternalFire.g:191:5: (lv_value_6_0= ruleExpression )
                    {
                    // InternalFire.g:191:5: (lv_value_6_0= ruleExpression )
                    // InternalFire.g:192:6: lv_value_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:211:3: ( () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')' )
                    {
                    // InternalFire.g:211:3: ( () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')' )
                    // InternalFire.g:212:4: () otherlv_8= 'writeln' otherlv_9= '(' ( (lv_argument_10_0= ruleExpression ) ) otherlv_11= ')'
                    {
                    // InternalFire.g:212:4: ()
                    // InternalFire.g:213:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getWritelnStatementAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getWritelnKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalFire.g:227:4: ( (lv_argument_10_0= ruleExpression ) )
                    // InternalFire.g:228:5: (lv_argument_10_0= ruleExpression )
                    {
                    // InternalFire.g:228:5: (lv_argument_10_0= ruleExpression )
                    // InternalFire.g:229:6: lv_argument_10_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_argument_10_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_10_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalFire.g:255:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFire.g:255:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFire.g:256:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFire.g:262:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:268:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalFire.g:269:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalFire.g:269:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalFire.g:270:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:278:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFire.g:279:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalFire.g:279:4: ()
            	    // InternalFire.g:280:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalFire.g:290:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalFire.g:291:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalFire.g:291:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalFire.g:292:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fire.Fire.AndExpression");
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalFire.g:314:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalFire.g:314:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalFire.g:315:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalFire.g:321:1: ruleAndExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:327:2: ( (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalFire.g:328:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalFire.g:328:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalFire.g:329:3: this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:337:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFire.g:338:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalFire.g:338:4: ()
            	    // InternalFire.g:339:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalFire.g:349:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalFire.g:350:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalFire.g:350:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalFire.g:351:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fire.Fire.XorExpression");
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalFire.g:373:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalFire.g:373:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalFire.g:374:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalFire.g:380:1: ruleXorExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:386:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalFire.g:387:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalFire.g:387:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalFire.g:388:3: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:396:3: ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFire.g:397:4: () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalFire.g:397:4: ()
            	    // InternalFire.g:398:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getXorExpressionAccess().getXorKeyword_1_1());
            	    			
            	    // InternalFire.g:408:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalFire.g:409:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalFire.g:409:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalFire.g:410:6: lv_right_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fire.Fire.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalFire.g:432:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalFire.g:432:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalFire.g:433:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalFire.g:439:1: ruleEqualityExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:445:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalFire.g:446:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalFire.g:446:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalFire.g:447:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:455:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=31 && LA6_0<=32)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFire.g:456:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalFire.g:456:4: ()
            	    // InternalFire.g:457:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:463:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalFire.g:464:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalFire.g:464:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalFire.g:465:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"fire.Fire.EqualityOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalFire.g:482:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalFire.g:483:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalFire.g:483:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalFire.g:484:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fire.Fire.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalFire.g:506:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalFire.g:506:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalFire.g:507:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalFire.g:513:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:519:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalFire.g:520:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalFire.g:520:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalFire.g:521:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:529:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=33 && LA7_0<=36)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFire.g:530:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalFire.g:530:4: ()
            	    // InternalFire.g:531:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:537:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // InternalFire.g:538:5: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // InternalFire.g:538:5: (lv_operator_2_0= ruleComparisonOperator )
            	    // InternalFire.g:539:6: lv_operator_2_0= ruleComparisonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operator_2_0=ruleComparisonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"fire.Fire.ComparisonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalFire.g:556:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalFire.g:557:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalFire.g:557:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalFire.g:558:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
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
            	    break loop7;
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalFire.g:580:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalFire.g:580:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalFire.g:581:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalFire.g:587:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:593:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalFire.g:594:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalFire.g:594:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalFire.g:595:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:603:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFire.g:604:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalFire.g:604:4: ()
            	    // InternalFire.g:605:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:611:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalFire.g:612:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalFire.g:612:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalFire.g:613:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            	    // InternalFire.g:630:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalFire.g:631:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalFire.g:631:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalFire.g:632:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop8;
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
    // InternalFire.g:654:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalFire.g:654:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalFire.g:655:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalFire.g:661:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:667:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalFire.g:668:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalFire.g:668:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalFire.g:669:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;


            			current = this_TerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:677:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=38 && LA9_0<=41)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:678:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalFire.g:678:4: ()
            	    // InternalFire.g:679:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:685:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalFire.g:686:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalFire.g:686:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalFire.g:687:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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

            	    // InternalFire.g:704:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalFire.g:705:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalFire.g:705:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalFire.g:706:6: lv_right_3_0= ruleTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop9;
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
    // InternalFire.g:728:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalFire.g:728:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalFire.g:729:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalFire.g:735:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) ) ;
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
            // InternalFire.g:741:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) ) )
            // InternalFire.g:742:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) )
            {
            // InternalFire.g:742:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () ( (lv_value_6_0= ruleLong ) ) ) | ( () ( (lv_value_8_0= ruleDouble ) ) ) | ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) ) | ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) ) | (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case 22:
            case 23:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==26) ) {
                    alt11=4;
                }
                else if ( (LA11_3==EOF||(LA11_3>=12 && LA11_3<=13)||LA11_3==16||(LA11_3>=18 && LA11_3<=21)||LA11_3==25||(LA11_3>=31 && LA11_3<=41)) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt11=5;
                }
                break;
            case 25:
                {
                alt11=6;
                }
                break;
            case 17:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFire.g:743:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:743:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalFire.g:744:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalFire.g:744:4: ()
                    // InternalFire.g:745:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:751:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalFire.g:752:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalFire.g:752:5: (lv_value_1_0= RULE_STRING )
                    // InternalFire.g:753:6: lv_value_1_0= RULE_STRING
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
                    // InternalFire.g:771:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // InternalFire.g:771:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // InternalFire.g:772:4: () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // InternalFire.g:772:4: ()
                    // InternalFire.g:773:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:779:4: ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==23) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFire.g:780:5: ( (lv_value_3_0= 'true' ) )
                            {
                            // InternalFire.g:780:5: ( (lv_value_3_0= 'true' ) )
                            // InternalFire.g:781:6: (lv_value_3_0= 'true' )
                            {
                            // InternalFire.g:781:6: (lv_value_3_0= 'true' )
                            // InternalFire.g:782:7: lv_value_3_0= 'true'
                            {
                            lv_value_3_0=(Token)match(input,22,FOLLOW_2); 

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
                            // InternalFire.g:795:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:802:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    {
                    // InternalFire.g:802:3: ( () ( (lv_value_6_0= ruleLong ) ) )
                    // InternalFire.g:803:4: () ( (lv_value_6_0= ruleLong ) )
                    {
                    // InternalFire.g:803:4: ()
                    // InternalFire.g:804:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:810:4: ( (lv_value_6_0= ruleLong ) )
                    // InternalFire.g:811:5: (lv_value_6_0= ruleLong )
                    {
                    // InternalFire.g:811:5: (lv_value_6_0= ruleLong )
                    // InternalFire.g:812:6: lv_value_6_0= ruleLong
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
                    // InternalFire.g:831:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:831:3: ( () ( (lv_value_8_0= ruleDouble ) ) )
                    // InternalFire.g:832:4: () ( (lv_value_8_0= ruleDouble ) )
                    {
                    // InternalFire.g:832:4: ()
                    // InternalFire.g:833:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:839:4: ( (lv_value_8_0= ruleDouble ) )
                    // InternalFire.g:840:5: (lv_value_8_0= ruleDouble )
                    {
                    // InternalFire.g:840:5: (lv_value_8_0= ruleDouble )
                    // InternalFire.g:841:6: lv_value_8_0= ruleDouble
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
                    // InternalFire.g:860:3: ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:860:3: ( () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:861:4: () otherlv_10= 'not' ( (lv_operand_11_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:861:4: ()
                    // InternalFire.g:862:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1());
                    			
                    // InternalFire.g:872:4: ( (lv_operand_11_0= ruleTerminalExpression ) )
                    // InternalFire.g:873:5: (lv_operand_11_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:873:5: (lv_operand_11_0= ruleTerminalExpression )
                    // InternalFire.g:874:6: lv_operand_11_0= ruleTerminalExpression
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
                    // InternalFire.g:893:3: ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:893:3: ( () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:894:4: () otherlv_13= '-' ( (lv_operand_14_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:894:4: ()
                    // InternalFire.g:895:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1());
                    			
                    // InternalFire.g:905:4: ( (lv_operand_14_0= ruleTerminalExpression ) )
                    // InternalFire.g:906:5: (lv_operand_14_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:906:5: (lv_operand_14_0= ruleTerminalExpression )
                    // InternalFire.g:907:6: lv_operand_14_0= ruleTerminalExpression
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
                    // InternalFire.g:926:3: (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' )
                    {
                    // InternalFire.g:926:3: (otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')' )
                    // InternalFire.g:927:4: otherlv_15= '(' this_Expression_16= ruleExpression otherlv_17= ')'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Expression_16=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_16;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_2); 

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
    // InternalFire.g:948:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:948:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:949:2: iv_ruleLong= ruleLong EOF
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
    // InternalFire.g:955:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:961:2: (this_INT_0= RULE_INT )
            // InternalFire.g:962:2: this_INT_0= RULE_INT
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
    // InternalFire.g:972:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:972:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:973:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalFire.g:979:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:985:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:986:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:986:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:987:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,26,FOLLOW_19); 

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


    // $ANTLR start "ruleBuiltInType"
    // InternalFire.g:1010:1: ruleBuiltInType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) ;
    public final Enumerator ruleBuiltInType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1016:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) )
            // InternalFire.g:1017:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            {
            // InternalFire.g:1017:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFire.g:1018:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFire.g:1018:3: (enumLiteral_0= 'String' )
                    // InternalFire.g:1019:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1026:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalFire.g:1026:3: (enumLiteral_1= 'Boolean' )
                    // InternalFire.g:1027:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1034:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalFire.g:1034:3: (enumLiteral_2= 'Integer' )
                    // InternalFire.g:1035:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1042:3: (enumLiteral_3= 'Real' )
                    {
                    // InternalFire.g:1042:3: (enumLiteral_3= 'Real' )
                    // InternalFire.g:1043:4: enumLiteral_3= 'Real'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "ruleEqualityOperator"
    // InternalFire.g:1053:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:1059:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalFire.g:1060:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalFire.g:1060:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFire.g:1061:3: (enumLiteral_0= '=' )
                    {
                    // InternalFire.g:1061:3: (enumLiteral_0= '=' )
                    // InternalFire.g:1062:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1069:3: (enumLiteral_1= '<>' )
                    {
                    // InternalFire.g:1069:3: (enumLiteral_1= '<>' )
                    // InternalFire.g:1070:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFire.g:1080:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1086:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // InternalFire.g:1087:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalFire.g:1087:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalFire.g:1088:3: (enumLiteral_0= '<' )
                    {
                    // InternalFire.g:1088:3: (enumLiteral_0= '<' )
                    // InternalFire.g:1089:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1096:3: (enumLiteral_1= '<=' )
                    {
                    // InternalFire.g:1096:3: (enumLiteral_1= '<=' )
                    // InternalFire.g:1097:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1104:3: (enumLiteral_2= '>' )
                    {
                    // InternalFire.g:1104:3: (enumLiteral_2= '>' )
                    // InternalFire.g:1105:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1112:3: (enumLiteral_3= '>=' )
                    {
                    // InternalFire.g:1112:3: (enumLiteral_3= '>=' )
                    // InternalFire.g:1113:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

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
    // InternalFire.g:1123:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:1129:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalFire.g:1130:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalFire.g:1130:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFire.g:1131:3: (enumLiteral_0= '+' )
                    {
                    // InternalFire.g:1131:3: (enumLiteral_0= '+' )
                    // InternalFire.g:1132:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1139:3: (enumLiteral_1= '-' )
                    {
                    // InternalFire.g:1139:3: (enumLiteral_1= '-' )
                    // InternalFire.g:1140:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalFire.g:1150:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1156:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) )
            // InternalFire.g:1157:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            {
            // InternalFire.g:1157:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 40:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFire.g:1158:3: (enumLiteral_0= '*' )
                    {
                    // InternalFire.g:1158:3: (enumLiteral_0= '*' )
                    // InternalFire.g:1159:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1166:3: (enumLiteral_1= '/' )
                    {
                    // InternalFire.g:1166:3: (enumLiteral_1= '/' )
                    // InternalFire.g:1167:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1174:3: (enumLiteral_2= 'div' )
                    {
                    // InternalFire.g:1174:3: (enumLiteral_2= 'div' )
                    // InternalFire.g:1175:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1182:3: (enumLiteral_3= 'mod' )
                    {
                    // InternalFire.g:1182:3: (enumLiteral_3= 'mod' )
                    // InternalFire.g:1183:4: enumLiteral_3= 'mod'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C20060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}