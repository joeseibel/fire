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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'const'", "'var'", "':'", "':='", "'while'", "'do'", "'writeln'", "'('", "')'", "'or'", "'and'", "'xor'", "'true'", "'false'", "'not'", "'-'", "'.'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'/'", "'div'", "'mod'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=14)||LA1_0==17||LA1_0==19) ) {
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
    // InternalFire.g:125:1: ruleStatement returns [EObject current=null] : ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | ( () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end' ) | ( () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_constant_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_type_5_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_condition_14_0 = null;

        EObject lv_statements_16_0 = null;

        EObject lv_argument_21_0 = null;



        	enterRule();

        try {
            // InternalFire.g:131:2: ( ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | ( () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end' ) | ( () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')' ) ) )
            // InternalFire.g:132:2: ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | ( () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end' ) | ( () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')' ) )
            {
            // InternalFire.g:132:2: ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | ( () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end' ) | ( () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFire.g:133:3: ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) )
                    {
                    // InternalFire.g:133:3: ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) )
                    // InternalFire.g:134:4: () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) )
                    {
                    // InternalFire.g:134:4: ()
                    // InternalFire.g:135:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getVariableDeclarationAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:141:4: ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==14) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalFire.g:142:5: ( (lv_constant_1_0= 'const' ) )
                            {
                            // InternalFire.g:142:5: ( (lv_constant_1_0= 'const' ) )
                            // InternalFire.g:143:6: (lv_constant_1_0= 'const' )
                            {
                            // InternalFire.g:143:6: (lv_constant_1_0= 'const' )
                            // InternalFire.g:144:7: lv_constant_1_0= 'const'
                            {
                            lv_constant_1_0=(Token)match(input,13,FOLLOW_4); 

                            							newLeafNode(lv_constant_1_0, grammarAccess.getStatementAccess().getConstantConstKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStatementRule());
                            							}
                            							setWithLastConsumed(current, "constant", true, "const");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFire.g:157:5: otherlv_2= 'var'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getVarKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalFire.g:162:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalFire.g:163:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalFire.g:163:5: (lv_name_3_0= RULE_ID )
                    // InternalFire.g:164:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getColonKeyword_0_3());
                    			
                    // InternalFire.g:184:4: ( (lv_type_5_0= ruleBuiltInType ) )
                    // InternalFire.g:185:5: (lv_type_5_0= ruleBuiltInType )
                    {
                    // InternalFire.g:185:5: (lv_type_5_0= ruleBuiltInType )
                    // InternalFire.g:186:6: lv_type_5_0= ruleBuiltInType
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getTypeBuiltInTypeEnumRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_type_5_0=ruleBuiltInType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"fire.Fire.BuiltInType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_5());
                    			
                    // InternalFire.g:207:4: ( (lv_value_7_0= ruleExpression ) )
                    // InternalFire.g:208:5: (lv_value_7_0= ruleExpression )
                    {
                    // InternalFire.g:208:5: (lv_value_7_0= ruleExpression )
                    // InternalFire.g:209:6: lv_value_7_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:228:3: ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) )
                    {
                    // InternalFire.g:228:3: ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) )
                    // InternalFire.g:229:4: () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) )
                    {
                    // InternalFire.g:229:4: ()
                    // InternalFire.g:230:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getAssignmentStatementAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:236:4: ( (otherlv_9= RULE_ID ) )
                    // InternalFire.g:237:5: (otherlv_9= RULE_ID )
                    {
                    // InternalFire.g:237:5: (otherlv_9= RULE_ID )
                    // InternalFire.g:238:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getVariableVariableDeclarationCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_1_2());
                    			
                    // InternalFire.g:253:4: ( (lv_value_11_0= ruleExpression ) )
                    // InternalFire.g:254:5: (lv_value_11_0= ruleExpression )
                    {
                    // InternalFire.g:254:5: (lv_value_11_0= ruleExpression )
                    // InternalFire.g:255:6: lv_value_11_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_11_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:274:3: ( () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end' )
                    {
                    // InternalFire.g:274:3: ( () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end' )
                    // InternalFire.g:275:4: () otherlv_13= 'while' ( (lv_condition_14_0= ruleExpression ) ) otherlv_15= 'do' ( (lv_statements_16_0= ruleStatement ) )* otherlv_17= 'end'
                    {
                    // InternalFire.g:275:4: ()
                    // InternalFire.g:276:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getWhileLoopAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getWhileKeyword_2_1());
                    			
                    // InternalFire.g:286:4: ( (lv_condition_14_0= ruleExpression ) )
                    // InternalFire.g:287:5: (lv_condition_14_0= ruleExpression )
                    {
                    // InternalFire.g:287:5: (lv_condition_14_0= ruleExpression )
                    // InternalFire.g:288:6: lv_condition_14_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getConditionExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_condition_14_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_14_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getDoKeyword_2_3());
                    			
                    // InternalFire.g:309:4: ( (lv_statements_16_0= ruleStatement ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||(LA3_0>=13 && LA3_0<=14)||LA3_0==17||LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFire.g:310:5: (lv_statements_16_0= ruleStatement )
                    	    {
                    	    // InternalFire.g:310:5: (lv_statements_16_0= ruleStatement )
                    	    // InternalFire.g:311:6: lv_statements_16_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_statements_16_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_16_0,
                    	    							"fire.Fire.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getEndKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:334:3: ( () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')' )
                    {
                    // InternalFire.g:334:3: ( () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')' )
                    // InternalFire.g:335:4: () otherlv_19= 'writeln' otherlv_20= '(' ( (lv_argument_21_0= ruleExpression ) ) otherlv_22= ')'
                    {
                    // InternalFire.g:335:4: ()
                    // InternalFire.g:336:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getWritelnStatementAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getWritelnKeyword_3_1());
                    			
                    otherlv_20=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalFire.g:350:4: ( (lv_argument_21_0= ruleExpression ) )
                    // InternalFire.g:351:5: (lv_argument_21_0= ruleExpression )
                    {
                    // InternalFire.g:351:5: (lv_argument_21_0= ruleExpression )
                    // InternalFire.g:352:6: lv_argument_21_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_argument_21_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_21_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_4());
                    			

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
    // InternalFire.g:378:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFire.g:378:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFire.g:379:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFire.g:385:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:391:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalFire.g:392:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalFire.g:392:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalFire.g:393:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:401:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFire.g:402:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalFire.g:402:4: ()
            	    // InternalFire.g:403:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalFire.g:413:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalFire.g:414:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalFire.g:414:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalFire.g:415:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalFire.g:437:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalFire.g:437:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalFire.g:438:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalFire.g:444:1: ruleAndExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:450:2: ( (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalFire.g:451:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalFire.g:451:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalFire.g:452:3: this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:460:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFire.g:461:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalFire.g:461:4: ()
            	    // InternalFire.g:462:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalFire.g:472:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalFire.g:473:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalFire.g:473:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalFire.g:474:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalFire.g:496:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalFire.g:496:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalFire.g:497:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalFire.g:503:1: ruleXorExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:509:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalFire.g:510:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalFire.g:510:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalFire.g:511:3: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:519:3: ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFire.g:520:4: () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalFire.g:520:4: ()
            	    // InternalFire.g:521:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getXorExpressionAccess().getXorKeyword_1_1());
            	    			
            	    // InternalFire.g:531:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalFire.g:532:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalFire.g:532:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalFire.g:533:6: lv_right_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalFire.g:555:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalFire.g:555:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalFire.g:556:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalFire.g:562:1: ruleEqualityExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:568:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalFire.g:569:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalFire.g:569:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalFire.g:570:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:578:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=34 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFire.g:579:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalFire.g:579:4: ()
            	    // InternalFire.g:580:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:586:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalFire.g:587:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalFire.g:587:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalFire.g:588:6: lv_operator_2_0= ruleEqualityOperator
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

            	    // InternalFire.g:605:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalFire.g:606:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalFire.g:606:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalFire.g:607:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalFire.g:629:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalFire.g:629:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalFire.g:630:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalFire.g:636:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:642:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalFire.g:643:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalFire.g:643:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalFire.g:644:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:652:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=36 && LA9_0<=39)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:653:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalFire.g:653:4: ()
            	    // InternalFire.g:654:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:660:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // InternalFire.g:661:5: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // InternalFire.g:661:5: (lv_operator_2_0= ruleComparisonOperator )
            	    // InternalFire.g:662:6: lv_operator_2_0= ruleComparisonOperator
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

            	    // InternalFire.g:679:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalFire.g:680:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalFire.g:680:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalFire.g:681:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalFire.g:703:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalFire.g:703:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalFire.g:704:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalFire.g:710:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:716:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalFire.g:717:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalFire.g:717:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalFire.g:718:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:726:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFire.g:727:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalFire.g:727:4: ()
            	    // InternalFire.g:728:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:734:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalFire.g:735:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalFire.g:735:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalFire.g:736:6: lv_operator_2_0= ruleAdditiveOperator
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

            	    // InternalFire.g:753:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalFire.g:754:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalFire.g:754:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalFire.g:755:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop10;
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
    // InternalFire.g:777:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalFire.g:777:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalFire.g:778:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalFire.g:784:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:790:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalFire.g:791:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalFire.g:791:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalFire.g:792:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;


            			current = this_TerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:800:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=41 && LA11_0<=44)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFire.g:801:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalFire.g:801:4: ()
            	    // InternalFire.g:802:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:808:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalFire.g:809:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalFire.g:809:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalFire.g:810:6: lv_operator_2_0= ruleMultiplicativeOperator
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

            	    // InternalFire.g:827:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalFire.g:828:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalFire.g:828:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalFire.g:829:6: lv_right_3_0= ruleTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop11;
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
    // InternalFire.g:851:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalFire.g:851:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalFire.g:852:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalFire.g:858:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        EObject lv_operand_13_0 = null;

        EObject lv_operand_16_0 = null;

        EObject this_Expression_18 = null;



        	enterRule();

        try {
            // InternalFire.g:864:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) ) )
            // InternalFire.g:865:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) )
            {
            // InternalFire.g:865:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalFire.g:866:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFire.g:866:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalFire.g:867:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalFire.g:867:4: ()
                    // InternalFire.g:868:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getIdExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:874:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFire.g:875:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFire.g:875:5: (otherlv_1= RULE_ID )
                    // InternalFire.g:876:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getTerminalExpressionAccess().getValueVariableDeclarationCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:889:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:889:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalFire.g:890:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalFire.g:890:4: ()
                    // InternalFire.g:891:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:897:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalFire.g:898:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalFire.g:898:5: (lv_value_3_0= RULE_STRING )
                    // InternalFire.g:899:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:917:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    {
                    // InternalFire.g:917:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    // InternalFire.g:918:4: () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    {
                    // InternalFire.g:918:4: ()
                    // InternalFire.g:919:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:925:4: ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==26) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFire.g:926:5: ( (lv_value_5_0= 'true' ) )
                            {
                            // InternalFire.g:926:5: ( (lv_value_5_0= 'true' ) )
                            // InternalFire.g:927:6: (lv_value_5_0= 'true' )
                            {
                            // InternalFire.g:927:6: (lv_value_5_0= 'true' )
                            // InternalFire.g:928:7: lv_value_5_0= 'true'
                            {
                            lv_value_5_0=(Token)match(input,25,FOLLOW_2); 

                            							newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalFire.g:941:5: otherlv_6= 'false'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_2_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:948:3: ( () ( (lv_value_8_0= ruleLong ) ) )
                    {
                    // InternalFire.g:948:3: ( () ( (lv_value_8_0= ruleLong ) ) )
                    // InternalFire.g:949:4: () ( (lv_value_8_0= ruleLong ) )
                    {
                    // InternalFire.g:949:4: ()
                    // InternalFire.g:950:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:956:4: ( (lv_value_8_0= ruleLong ) )
                    // InternalFire.g:957:5: (lv_value_8_0= ruleLong )
                    {
                    // InternalFire.g:957:5: (lv_value_8_0= ruleLong )
                    // InternalFire.g:958:6: lv_value_8_0= ruleLong
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleLong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"fire.Fire.Long");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFire.g:977:3: ( () ( (lv_value_10_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:977:3: ( () ( (lv_value_10_0= ruleDouble ) ) )
                    // InternalFire.g:978:4: () ( (lv_value_10_0= ruleDouble ) )
                    {
                    // InternalFire.g:978:4: ()
                    // InternalFire.g:979:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_4_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:985:4: ( (lv_value_10_0= ruleDouble ) )
                    // InternalFire.g:986:5: (lv_value_10_0= ruleDouble )
                    {
                    // InternalFire.g:986:5: (lv_value_10_0= ruleDouble )
                    // InternalFire.g:987:6: lv_value_10_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_10_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"fire.Fire.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFire.g:1006:3: ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:1006:3: ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:1007:4: () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:1007:4: ()
                    // InternalFire.g:1008:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getTerminalExpressionAccess().getNotKeyword_5_1());
                    			
                    // InternalFire.g:1018:4: ( (lv_operand_13_0= ruleTerminalExpression ) )
                    // InternalFire.g:1019:5: (lv_operand_13_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:1019:5: (lv_operand_13_0= ruleTerminalExpression )
                    // InternalFire.g:1020:6: lv_operand_13_0= ruleTerminalExpression
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_13_0=ruleTerminalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_13_0,
                    							"fire.Fire.TerminalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalFire.g:1039:3: ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:1039:3: ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:1040:4: () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:1040:4: ()
                    // InternalFire.g:1041:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_6_1());
                    			
                    // InternalFire.g:1051:4: ( (lv_operand_16_0= ruleTerminalExpression ) )
                    // InternalFire.g:1052:5: (lv_operand_16_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:1052:5: (lv_operand_16_0= ruleTerminalExpression )
                    // InternalFire.g:1053:6: lv_operand_16_0= ruleTerminalExpression
                    {

                    						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_16_0=ruleTerminalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_16_0,
                    							"fire.Fire.TerminalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalFire.g:1072:3: (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' )
                    {
                    // InternalFire.g:1072:3: (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' )
                    // InternalFire.g:1073:4: otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_7_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Expression_18=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_18;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_19=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_2());
                    			

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
    // InternalFire.g:1094:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:1094:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:1095:2: iv_ruleLong= ruleLong EOF
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
    // InternalFire.g:1101:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:1107:2: (this_INT_0= RULE_INT )
            // InternalFire.g:1108:2: this_INT_0= RULE_INT
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
    // InternalFire.g:1118:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:1118:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:1119:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalFire.g:1125:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:1131:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:1132:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:1132:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:1133:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,29,FOLLOW_20); 

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
    // InternalFire.g:1156:1: ruleBuiltInType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) ;
    public final Enumerator ruleBuiltInType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1162:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) )
            // InternalFire.g:1163:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            {
            // InternalFire.g:1163:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
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
                    // InternalFire.g:1164:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFire.g:1164:3: (enumLiteral_0= 'String' )
                    // InternalFire.g:1165:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1172:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalFire.g:1172:3: (enumLiteral_1= 'Boolean' )
                    // InternalFire.g:1173:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1180:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalFire.g:1180:3: (enumLiteral_2= 'Integer' )
                    // InternalFire.g:1181:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1188:3: (enumLiteral_3= 'Real' )
                    {
                    // InternalFire.g:1188:3: (enumLiteral_3= 'Real' )
                    // InternalFire.g:1189:4: enumLiteral_3= 'Real'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalFire.g:1199:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:1205:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalFire.g:1206:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalFire.g:1206:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFire.g:1207:3: (enumLiteral_0= '=' )
                    {
                    // InternalFire.g:1207:3: (enumLiteral_0= '=' )
                    // InternalFire.g:1208:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1215:3: (enumLiteral_1= '<>' )
                    {
                    // InternalFire.g:1215:3: (enumLiteral_1= '<>' )
                    // InternalFire.g:1216:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalFire.g:1226:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1232:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // InternalFire.g:1233:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalFire.g:1233:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
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
                    // InternalFire.g:1234:3: (enumLiteral_0= '<' )
                    {
                    // InternalFire.g:1234:3: (enumLiteral_0= '<' )
                    // InternalFire.g:1235:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1242:3: (enumLiteral_1= '<=' )
                    {
                    // InternalFire.g:1242:3: (enumLiteral_1= '<=' )
                    // InternalFire.g:1243:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1250:3: (enumLiteral_2= '>' )
                    {
                    // InternalFire.g:1250:3: (enumLiteral_2= '>' )
                    // InternalFire.g:1251:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1258:3: (enumLiteral_3= '>=' )
                    {
                    // InternalFire.g:1258:3: (enumLiteral_3= '>=' )
                    // InternalFire.g:1259:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

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
    // InternalFire.g:1269:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:1275:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalFire.g:1276:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalFire.g:1276:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFire.g:1277:3: (enumLiteral_0= '+' )
                    {
                    // InternalFire.g:1277:3: (enumLiteral_0= '+' )
                    // InternalFire.g:1278:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1285:3: (enumLiteral_1= '-' )
                    {
                    // InternalFire.g:1285:3: (enumLiteral_1= '-' )
                    // InternalFire.g:1286:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalFire.g:1296:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1302:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) )
            // InternalFire.g:1303:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            {
            // InternalFire.g:1303:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalFire.g:1304:3: (enumLiteral_0= '*' )
                    {
                    // InternalFire.g:1304:3: (enumLiteral_0= '*' )
                    // InternalFire.g:1305:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1312:3: (enumLiteral_1= '/' )
                    {
                    // InternalFire.g:1312:3: (enumLiteral_1= '/' )
                    // InternalFire.g:1313:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1320:3: (enumLiteral_2= 'div' )
                    {
                    // InternalFire.g:1320:3: (enumLiteral_2= 'div' )
                    // InternalFire.g:1321:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1328:3: (enumLiteral_3= 'mod' )
                    {
                    // InternalFire.g:1328:3: (enumLiteral_3= 'mod' )
                    // InternalFire.g:1329:4: enumLiteral_3= 'mod'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\11\5\uffff";
    static final String dfa_3s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_4s = "\1\34\3\uffff\1\54\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\5\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\4\15\uffff\1\7\4\uffff\2\3\1\5\1\6",
            "",
            "",
            "",
            "\1\11\7\uffff\3\11\2\uffff\3\11\1\uffff\4\11\3\uffff\1\11\1\10\4\uffff\13\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "865:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A7010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001E100070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}