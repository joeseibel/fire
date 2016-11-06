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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'const'", "'var'", "':'", "':='", "'writeln'", "'('", "')'", "'while'", "'do'", "'if'", "'then'", "'else'", "'begin'", "'or'", "'and'", "'xor'", "'true'", "'false'", "'not'", "'-'", "'.'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'/'", "'div'", "'mod'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=14)||LA1_0==17||LA1_0==20||LA1_0==22) ) {
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
    // InternalFire.g:125:1: ruleStatement returns [EObject current=null] : ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | this_WhileLoop_12= ruleWhileLoop | this_IfStatement_13= ruleIfStatement | ( () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_constant_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Enumerator lv_type_5_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject this_WhileLoop_12 = null;

        EObject this_IfStatement_13 = null;

        EObject lv_argument_17_0 = null;



        	enterRule();

        try {
            // InternalFire.g:131:2: ( ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | this_WhileLoop_12= ruleWhileLoop | this_IfStatement_13= ruleIfStatement | ( () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')' ) ) )
            // InternalFire.g:132:2: ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | this_WhileLoop_12= ruleWhileLoop | this_IfStatement_13= ruleIfStatement | ( () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')' ) )
            {
            // InternalFire.g:132:2: ( ( () ( ( (lv_constant_1_0= 'const' ) ) | otherlv_2= 'var' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleBuiltInType ) ) otherlv_6= ':=' ( (lv_value_7_0= ruleExpression ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_value_11_0= ruleExpression ) ) ) | this_WhileLoop_12= ruleWhileLoop | this_IfStatement_13= ruleIfStatement | ( () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
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
                    // InternalFire.g:274:3: this_WhileLoop_12= ruleWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_12=ruleWhileLoop();

                    state._fsp--;


                    			current = this_WhileLoop_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFire.g:283:3: this_IfStatement_13= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_13=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFire.g:292:3: ( () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')' )
                    {
                    // InternalFire.g:292:3: ( () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')' )
                    // InternalFire.g:293:4: () otherlv_15= 'writeln' otherlv_16= '(' ( (lv_argument_17_0= ruleExpression ) ) otherlv_18= ')'
                    {
                    // InternalFire.g:293:4: ()
                    // InternalFire.g:294:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getWritelnStatementAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getWritelnKeyword_4_1());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalFire.g:308:4: ( (lv_argument_17_0= ruleExpression ) )
                    // InternalFire.g:309:5: (lv_argument_17_0= ruleExpression )
                    {
                    // InternalFire.g:309:5: (lv_argument_17_0= ruleExpression )
                    // InternalFire.g:310:6: lv_argument_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_argument_17_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"argument",
                    							lv_argument_17_0,
                    							"fire.Fire.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getRightParenthesisKeyword_4_4());
                    			

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


    // $ANTLR start "entryRuleWhileLoop"
    // InternalFire.g:336:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalFire.g:336:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalFire.g:337:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalFire.g:343:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:349:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalFire.g:350:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalFire.g:350:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalFire.g:351:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
            		
            // InternalFire.g:355:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalFire.g:356:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalFire.g:356:4: (lv_condition_1_0= ruleExpression )
            // InternalFire.g:357:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"fire.Fire.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getDoKeyword_2());
            		
            // InternalFire.g:378:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=13 && LA4_0<=14)||LA4_0==17||LA4_0==20||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFire.g:379:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:379:4: (lv_statements_3_0= ruleStatement )
            	    // InternalFire.g:380:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"fire.Fire.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // InternalFire.g:405:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalFire.g:405:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalFire.g:406:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalFire.g:412:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenStatements_3_0 = null;

        EObject lv_elseIfs_4_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalFire.g:418:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' ) )
            // InternalFire.g:419:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' )
            {
            // InternalFire.g:419:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' )
            // InternalFire.g:420:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalFire.g:424:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalFire.g:425:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalFire.g:425:4: (lv_condition_1_0= ruleExpression )
            // InternalFire.g:426:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"fire.Fire.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            // InternalFire.g:447:3: ( (lv_thenStatements_3_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=13 && LA5_0<=14)||LA5_0==17||LA5_0==20||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFire.g:448:4: (lv_thenStatements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:448:4: (lv_thenStatements_3_0= ruleStatement )
            	    // InternalFire.g:449:5: lv_thenStatements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getThenStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_thenStatements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thenStatements",
            	    						lv_thenStatements_3_0,
            	    						"fire.Fire.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalFire.g:466:3: ( (lv_elseIfs_4_0= ruleElseIfStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==22) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalFire.g:467:4: (lv_elseIfs_4_0= ruleElseIfStatement )
            	    {
            	    // InternalFire.g:467:4: (lv_elseIfs_4_0= ruleElseIfStatement )
            	    // InternalFire.g:468:5: lv_elseIfs_4_0= ruleElseIfStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfsElseIfStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elseIfs_4_0=ruleElseIfStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elseIfs",
            	    						lv_elseIfs_4_0,
            	    						"fire.Fire.ElseIfStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalFire.g:485:3: ( (lv_else_5_0= ruleElseStatement ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFire.g:486:4: (lv_else_5_0= ruleElseStatement )
                    {
                    // InternalFire.g:486:4: (lv_else_5_0= ruleElseStatement )
                    // InternalFire.g:487:5: lv_else_5_0= ruleElseStatement
                    {

                    					newCompositeNode(grammarAccess.getIfStatementAccess().getElseElseStatementParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_else_5_0=ruleElseStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    					}
                    					set(
                    						current,
                    						"else",
                    						lv_else_5_0,
                    						"fire.Fire.ElseStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfStatement"
    // InternalFire.g:512:1: entryRuleElseIfStatement returns [EObject current=null] : iv_ruleElseIfStatement= ruleElseIfStatement EOF ;
    public final EObject entryRuleElseIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfStatement = null;


        try {
            // InternalFire.g:512:56: (iv_ruleElseIfStatement= ruleElseIfStatement EOF )
            // InternalFire.g:513:2: iv_ruleElseIfStatement= ruleElseIfStatement EOF
            {
             newCompositeNode(grammarAccess.getElseIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseIfStatement=ruleElseIfStatement();

            state._fsp--;

             current =iv_ruleElseIfStatement; 
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
    // $ANTLR end "entryRuleElseIfStatement"


    // $ANTLR start "ruleElseIfStatement"
    // InternalFire.g:519:1: ruleElseIfStatement returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* ) ;
    public final EObject ruleElseIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenStatements_4_0 = null;



        	enterRule();

        try {
            // InternalFire.g:525:2: ( (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* ) )
            // InternalFire.g:526:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* )
            {
            // InternalFire.g:526:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* )
            // InternalFire.g:527:3: otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getElseIfStatementAccess().getElseKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getElseIfStatementAccess().getIfKeyword_1());
            		
            // InternalFire.g:535:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalFire.g:536:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalFire.g:536:4: (lv_condition_2_0= ruleExpression )
            // InternalFire.g:537:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getElseIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"fire.Fire.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getElseIfStatementAccess().getThenKeyword_3());
            		
            // InternalFire.g:558:3: ( (lv_thenStatements_4_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=13 && LA8_0<=14)||LA8_0==17||LA8_0==20||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFire.g:559:4: (lv_thenStatements_4_0= ruleStatement )
            	    {
            	    // InternalFire.g:559:4: (lv_thenStatements_4_0= ruleStatement )
            	    // InternalFire.g:560:5: lv_thenStatements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getElseIfStatementAccess().getThenStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_thenStatements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thenStatements",
            	    						lv_thenStatements_4_0,
            	    						"fire.Fire.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleElseIfStatement"


    // $ANTLR start "entryRuleElseStatement"
    // InternalFire.g:581:1: entryRuleElseStatement returns [EObject current=null] : iv_ruleElseStatement= ruleElseStatement EOF ;
    public final EObject entryRuleElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseStatement = null;


        try {
            // InternalFire.g:581:54: (iv_ruleElseStatement= ruleElseStatement EOF )
            // InternalFire.g:582:2: iv_ruleElseStatement= ruleElseStatement EOF
            {
             newCompositeNode(grammarAccess.getElseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseStatement=ruleElseStatement();

            state._fsp--;

             current =iv_ruleElseStatement; 
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
    // $ANTLR end "entryRuleElseStatement"


    // $ANTLR start "ruleElseStatement"
    // InternalFire.g:588:1: ruleElseStatement returns [EObject current=null] : ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_elseStatements_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:594:2: ( ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* ) )
            // InternalFire.g:595:2: ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* )
            {
            // InternalFire.g:595:2: ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* )
            // InternalFire.g:596:3: () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )*
            {
            // InternalFire.g:596:3: ()
            // InternalFire.g:597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseStatementAccess().getElseStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getElseStatementAccess().getElseKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getElseStatementAccess().getBeginKeyword_2());
            		
            // InternalFire.g:611:3: ( (lv_elseStatements_3_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=13 && LA9_0<=14)||LA9_0==17||LA9_0==20||LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:612:4: (lv_elseStatements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:612:4: (lv_elseStatements_3_0= ruleStatement )
            	    // InternalFire.g:613:5: lv_elseStatements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getElseStatementAccess().getElseStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_elseStatements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elseStatements",
            	    						lv_elseStatements_3_0,
            	    						"fire.Fire.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleElseStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalFire.g:634:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFire.g:634:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFire.g:635:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFire.g:641:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:647:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalFire.g:648:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalFire.g:648:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalFire.g:649:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:657:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFire.g:658:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalFire.g:658:4: ()
            	    // InternalFire.g:659:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalFire.g:669:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalFire.g:670:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalFire.g:670:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalFire.g:671:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalFire.g:693:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalFire.g:693:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalFire.g:694:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalFire.g:700:1: ruleAndExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:706:2: ( (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalFire.g:707:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalFire.g:707:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalFire.g:708:3: this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:716:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFire.g:717:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalFire.g:717:4: ()
            	    // InternalFire.g:718:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalFire.g:728:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalFire.g:729:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalFire.g:729:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalFire.g:730:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalFire.g:752:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalFire.g:752:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalFire.g:753:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalFire.g:759:1: ruleXorExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:765:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalFire.g:766:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalFire.g:766:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalFire.g:767:3: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:775:3: ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFire.g:776:4: () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalFire.g:776:4: ()
            	    // InternalFire.g:777:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getXorExpressionAccess().getXorKeyword_1_1());
            	    			
            	    // InternalFire.g:787:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalFire.g:788:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalFire.g:788:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalFire.g:789:6: lv_right_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop12;
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
    // InternalFire.g:811:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalFire.g:811:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalFire.g:812:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalFire.g:818:1: ruleEqualityExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:824:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalFire.g:825:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalFire.g:825:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalFire.g:826:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:834:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=38 && LA13_0<=39)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFire.g:835:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalFire.g:835:4: ()
            	    // InternalFire.g:836:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:842:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalFire.g:843:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalFire.g:843:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalFire.g:844:6: lv_operator_2_0= ruleEqualityOperator
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

            	    // InternalFire.g:861:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalFire.g:862:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalFire.g:862:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalFire.g:863:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop13;
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
    // InternalFire.g:885:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalFire.g:885:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalFire.g:886:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalFire.g:892:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:898:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalFire.g:899:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalFire.g:899:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalFire.g:900:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:908:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=40 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFire.g:909:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalFire.g:909:4: ()
            	    // InternalFire.g:910:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:916:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // InternalFire.g:917:5: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // InternalFire.g:917:5: (lv_operator_2_0= ruleComparisonOperator )
            	    // InternalFire.g:918:6: lv_operator_2_0= ruleComparisonOperator
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

            	    // InternalFire.g:935:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalFire.g:936:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalFire.g:936:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalFire.g:937:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop14;
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
    // InternalFire.g:959:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalFire.g:959:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalFire.g:960:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalFire.g:966:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:972:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalFire.g:973:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalFire.g:973:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalFire.g:974:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:982:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32||LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFire.g:983:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalFire.g:983:4: ()
            	    // InternalFire.g:984:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:990:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalFire.g:991:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalFire.g:991:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalFire.g:992:6: lv_operator_2_0= ruleAdditiveOperator
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

            	    // InternalFire.g:1009:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalFire.g:1010:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalFire.g:1010:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalFire.g:1011:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop15;
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
    // InternalFire.g:1033:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalFire.g:1033:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalFire.g:1034:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalFire.g:1040:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1046:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalFire.g:1047:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalFire.g:1047:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalFire.g:1048:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;


            			current = this_TerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFire.g:1056:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=45 && LA16_0<=48)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFire.g:1057:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalFire.g:1057:4: ()
            	    // InternalFire.g:1058:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFire.g:1064:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalFire.g:1065:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalFire.g:1065:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalFire.g:1066:6: lv_operator_2_0= ruleMultiplicativeOperator
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

            	    // InternalFire.g:1083:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalFire.g:1084:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalFire.g:1084:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalFire.g:1085:6: lv_right_3_0= ruleTerminalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop16;
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
    // InternalFire.g:1107:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalFire.g:1107:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalFire.g:1108:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalFire.g:1114:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) ) ;
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
            // InternalFire.g:1120:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) ) )
            // InternalFire.g:1121:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) )
            {
            // InternalFire.g:1121:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) )
            int alt18=8;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalFire.g:1122:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFire.g:1122:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalFire.g:1123:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalFire.g:1123:4: ()
                    // InternalFire.g:1124:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getIdExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:1130:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFire.g:1131:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFire.g:1131:5: (otherlv_1= RULE_ID )
                    // InternalFire.g:1132:6: otherlv_1= RULE_ID
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
                    // InternalFire.g:1145:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:1145:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalFire.g:1146:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalFire.g:1146:4: ()
                    // InternalFire.g:1147:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:1153:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalFire.g:1154:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalFire.g:1154:5: (lv_value_3_0= RULE_STRING )
                    // InternalFire.g:1155:6: lv_value_3_0= RULE_STRING
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
                    // InternalFire.g:1173:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    {
                    // InternalFire.g:1173:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    // InternalFire.g:1174:4: () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    {
                    // InternalFire.g:1174:4: ()
                    // InternalFire.g:1175:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:1181:4: ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==30) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalFire.g:1182:5: ( (lv_value_5_0= 'true' ) )
                            {
                            // InternalFire.g:1182:5: ( (lv_value_5_0= 'true' ) )
                            // InternalFire.g:1183:6: (lv_value_5_0= 'true' )
                            {
                            // InternalFire.g:1183:6: (lv_value_5_0= 'true' )
                            // InternalFire.g:1184:7: lv_value_5_0= 'true'
                            {
                            lv_value_5_0=(Token)match(input,29,FOLLOW_2); 

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
                            // InternalFire.g:1197:5: otherlv_6= 'false'
                            {
                            otherlv_6=(Token)match(input,30,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_2_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1204:3: ( () ( (lv_value_8_0= ruleLong ) ) )
                    {
                    // InternalFire.g:1204:3: ( () ( (lv_value_8_0= ruleLong ) ) )
                    // InternalFire.g:1205:4: () ( (lv_value_8_0= ruleLong ) )
                    {
                    // InternalFire.g:1205:4: ()
                    // InternalFire.g:1206:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:1212:4: ( (lv_value_8_0= ruleLong ) )
                    // InternalFire.g:1213:5: (lv_value_8_0= ruleLong )
                    {
                    // InternalFire.g:1213:5: (lv_value_8_0= ruleLong )
                    // InternalFire.g:1214:6: lv_value_8_0= ruleLong
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
                    // InternalFire.g:1233:3: ( () ( (lv_value_10_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:1233:3: ( () ( (lv_value_10_0= ruleDouble ) ) )
                    // InternalFire.g:1234:4: () ( (lv_value_10_0= ruleDouble ) )
                    {
                    // InternalFire.g:1234:4: ()
                    // InternalFire.g:1235:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_4_0(),
                    						current);
                    				

                    }

                    // InternalFire.g:1241:4: ( (lv_value_10_0= ruleDouble ) )
                    // InternalFire.g:1242:5: (lv_value_10_0= ruleDouble )
                    {
                    // InternalFire.g:1242:5: (lv_value_10_0= ruleDouble )
                    // InternalFire.g:1243:6: lv_value_10_0= ruleDouble
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
                    // InternalFire.g:1262:3: ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:1262:3: ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:1263:4: () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:1263:4: ()
                    // InternalFire.g:1264:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getTerminalExpressionAccess().getNotKeyword_5_1());
                    			
                    // InternalFire.g:1274:4: ( (lv_operand_13_0= ruleTerminalExpression ) )
                    // InternalFire.g:1275:5: (lv_operand_13_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:1275:5: (lv_operand_13_0= ruleTerminalExpression )
                    // InternalFire.g:1276:6: lv_operand_13_0= ruleTerminalExpression
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
                    // InternalFire.g:1295:3: ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:1295:3: ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:1296:4: () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:1296:4: ()
                    // InternalFire.g:1297:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_6_1());
                    			
                    // InternalFire.g:1307:4: ( (lv_operand_16_0= ruleTerminalExpression ) )
                    // InternalFire.g:1308:5: (lv_operand_16_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:1308:5: (lv_operand_16_0= ruleTerminalExpression )
                    // InternalFire.g:1309:6: lv_operand_16_0= ruleTerminalExpression
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
                    // InternalFire.g:1328:3: (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' )
                    {
                    // InternalFire.g:1328:3: (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' )
                    // InternalFire.g:1329:4: otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')'
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_7_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Expression_18=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_18;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_19=(Token)match(input,19,FOLLOW_2); 

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
    // InternalFire.g:1350:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:1350:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:1351:2: iv_ruleLong= ruleLong EOF
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
    // InternalFire.g:1357:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:1363:2: (this_INT_0= RULE_INT )
            // InternalFire.g:1364:2: this_INT_0= RULE_INT
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
    // InternalFire.g:1374:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:1374:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:1375:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalFire.g:1381:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:1387:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:1388:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:1388:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:1389:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,33,FOLLOW_27); 

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
    // InternalFire.g:1412:1: ruleBuiltInType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) ;
    public final Enumerator ruleBuiltInType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1418:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) )
            // InternalFire.g:1419:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            {
            // InternalFire.g:1419:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalFire.g:1420:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFire.g:1420:3: (enumLiteral_0= 'String' )
                    // InternalFire.g:1421:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1428:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalFire.g:1428:3: (enumLiteral_1= 'Boolean' )
                    // InternalFire.g:1429:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1436:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalFire.g:1436:3: (enumLiteral_2= 'Integer' )
                    // InternalFire.g:1437:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1444:3: (enumLiteral_3= 'Real' )
                    {
                    // InternalFire.g:1444:3: (enumLiteral_3= 'Real' )
                    // InternalFire.g:1445:4: enumLiteral_3= 'Real'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalFire.g:1455:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:1461:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalFire.g:1462:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalFire.g:1462:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFire.g:1463:3: (enumLiteral_0= '=' )
                    {
                    // InternalFire.g:1463:3: (enumLiteral_0= '=' )
                    // InternalFire.g:1464:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1471:3: (enumLiteral_1= '<>' )
                    {
                    // InternalFire.g:1471:3: (enumLiteral_1= '<>' )
                    // InternalFire.g:1472:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalFire.g:1482:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1488:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // InternalFire.g:1489:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalFire.g:1489:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 43:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFire.g:1490:3: (enumLiteral_0= '<' )
                    {
                    // InternalFire.g:1490:3: (enumLiteral_0= '<' )
                    // InternalFire.g:1491:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1498:3: (enumLiteral_1= '<=' )
                    {
                    // InternalFire.g:1498:3: (enumLiteral_1= '<=' )
                    // InternalFire.g:1499:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1506:3: (enumLiteral_2= '>' )
                    {
                    // InternalFire.g:1506:3: (enumLiteral_2= '>' )
                    // InternalFire.g:1507:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1514:3: (enumLiteral_3= '>=' )
                    {
                    // InternalFire.g:1514:3: (enumLiteral_3= '>=' )
                    // InternalFire.g:1515:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

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
    // InternalFire.g:1525:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:1531:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalFire.g:1532:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalFire.g:1532:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFire.g:1533:3: (enumLiteral_0= '+' )
                    {
                    // InternalFire.g:1533:3: (enumLiteral_0= '+' )
                    // InternalFire.g:1534:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1541:3: (enumLiteral_1= '-' )
                    {
                    // InternalFire.g:1541:3: (enumLiteral_1= '-' )
                    // InternalFire.g:1542:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalFire.g:1552:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:1558:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) )
            // InternalFire.g:1559:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            {
            // InternalFire.g:1559:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFire.g:1560:3: (enumLiteral_0= '*' )
                    {
                    // InternalFire.g:1560:3: (enumLiteral_0= '*' )
                    // InternalFire.g:1561:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1568:3: (enumLiteral_1= '/' )
                    {
                    // InternalFire.g:1568:3: (enumLiteral_1= '/' )
                    // InternalFire.g:1569:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:1576:3: (enumLiteral_2= 'div' )
                    {
                    // InternalFire.g:1576:3: (enumLiteral_2= 'div' )
                    // InternalFire.g:1577:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1584:3: (enumLiteral_3= 'mod' )
                    {
                    // InternalFire.g:1584:3: (enumLiteral_3= 'mod' )
                    // InternalFire.g:1585:4: enumLiteral_3= 'mod'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\11\5\uffff";
    static final String dfa_3s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_4s = "\1\40\3\uffff\1\60\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\5\1\4";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\4\13\uffff\1\7\12\uffff\2\3\1\5\1\6",
            "",
            "",
            "",
            "\1\11\7\uffff\3\11\2\uffff\1\11\1\uffff\6\11\1\uffff\3\11\3\uffff\1\11\1\10\4\uffff\13\11",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1121:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | (otherlv_17= '(' this_Expression_18= ruleExpression otherlv_19= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000527010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001E0040070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001527010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000526012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}