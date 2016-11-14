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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'end'", "'procedure'", "'('", "','", "')'", "'function'", "':'", "':='", "';'", "'writeln'", "'const'", "'var'", "'while'", "'do'", "'if'", "'then'", "'else'", "'begin'", "'or'", "'and'", "'xor'", "'true'", "'false'", "'not'", "'-'", "'.'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'/'", "'div'", "'mod'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int T__49=49;
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
    // InternalFire.g:72:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'program' ( (lv_callables_2_0= ruleCallable ) )* ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_callables_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:78:2: ( ( () otherlv_1= 'program' ( (lv_callables_2_0= ruleCallable ) )* ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalFire.g:79:2: ( () otherlv_1= 'program' ( (lv_callables_2_0= ruleCallable ) )* ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalFire.g:79:2: ( () otherlv_1= 'program' ( (lv_callables_2_0= ruleCallable ) )* ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalFire.g:80:3: () otherlv_1= 'program' ( (lv_callables_2_0= ruleCallable ) )* ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end'
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
            // InternalFire.g:91:3: ( (lv_callables_2_0= ruleCallable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFire.g:92:4: (lv_callables_2_0= ruleCallable )
            	    {
            	    // InternalFire.g:92:4: (lv_callables_2_0= ruleCallable )
            	    // InternalFire.g:93:5: lv_callables_2_0= ruleCallable
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getCallablesCallableParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_callables_2_0=ruleCallable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"callables",
            	      						lv_callables_2_0,
            	      						"fire.Fire.Callable");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFire.g:110:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=21 && LA2_0<=24)||LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFire.g:111:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:111:4: (lv_statements_3_0= ruleStatement )
            	    // InternalFire.g:112:5: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_3_0,
            	      						"fire.Fire.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getEndKeyword_4());
              		
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


    // $ANTLR start "entryRuleCallable"
    // InternalFire.g:137:1: entryRuleCallable returns [EObject current=null] : iv_ruleCallable= ruleCallable EOF ;
    public final EObject entryRuleCallable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallable = null;


        try {
            // InternalFire.g:137:49: (iv_ruleCallable= ruleCallable EOF )
            // InternalFire.g:138:2: iv_ruleCallable= ruleCallable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallable=ruleCallable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallable; 
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
    // $ANTLR end "entryRuleCallable"


    // $ANTLR start "ruleCallable"
    // InternalFire.g:144:1: ruleCallable returns [EObject current=null] : (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction ) ;
    public final EObject ruleCallable() throws RecognitionException {
        EObject current = null;

        EObject this_Procedure_0 = null;

        EObject this_Function_1 = null;



        	enterRule();

        try {
            // InternalFire.g:150:2: ( (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction ) )
            // InternalFire.g:151:2: (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction )
            {
            // InternalFire.g:151:2: (this_Procedure_0= ruleProcedure | this_Function_1= ruleFunction )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
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
                    // InternalFire.g:152:3: this_Procedure_0= ruleProcedure
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallableAccess().getProcedureParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Procedure_0=ruleProcedure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Procedure_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFire.g:161:3: this_Function_1= ruleFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallableAccess().getFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Function_1=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Function_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleCallable"


    // $ANTLR start "entryRuleProcedure"
    // InternalFire.g:173:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalFire.g:173:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalFire.g:174:2: iv_ruleProcedure= ruleProcedure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcedure; 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalFire.g:180:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= 'end' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalFire.g:186:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= 'end' ) )
            // InternalFire.g:187:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= 'end' )
            {
            // InternalFire.g:187:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= 'end' )
            // InternalFire.g:188:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
              		
            }
            // InternalFire.g:192:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFire.g:193:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFire.g:193:4: (lv_name_1_0= RULE_ID )
            // InternalFire.g:194:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcedureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalFire.g:214:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFire.g:215:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalFire.g:215:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalFire.g:216:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFire.g:216:5: (lv_parameters_3_0= ruleParameter )
                    // InternalFire.g:217:6: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcedureAccess().getParametersParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcedureRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"fire.Fire.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFire.g:234:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalFire.g:235:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalFire.g:239:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalFire.g:240:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalFire.g:240:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalFire.g:241:7: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getProcedureAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getProcedureRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"fire.Fire.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalFire.g:264:3: ( (lv_statements_7_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=21 && LA6_0<=24)||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFire.g:265:4: (lv_statements_7_0= ruleStatement )
            	    {
            	    // InternalFire.g:265:4: (lv_statements_7_0= ruleStatement )
            	    // InternalFire.g:266:5: lv_statements_7_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureAccess().getStatementsStatementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_statements_7_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_7_0,
            	      						"fire.Fire.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getProcedureAccess().getEndKeyword_6());
              		
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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleFunction"
    // InternalFire.g:291:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFire.g:291:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFire.g:292:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalFire.g:298:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleBuiltInType ) ) ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )* ( (lv_value_10_0= ruleExpression ) ) otherlv_11= 'end' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        Enumerator lv_returnType_8_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalFire.g:304:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleBuiltInType ) ) ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )* ( (lv_value_10_0= ruleExpression ) ) otherlv_11= 'end' ) )
            // InternalFire.g:305:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleBuiltInType ) ) ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )* ( (lv_value_10_0= ruleExpression ) ) otherlv_11= 'end' )
            {
            // InternalFire.g:305:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleBuiltInType ) ) ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )* ( (lv_value_10_0= ruleExpression ) ) otherlv_11= 'end' )
            // InternalFire.g:306:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleBuiltInType ) ) ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )* ( (lv_value_10_0= ruleExpression ) ) otherlv_11= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalFire.g:310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFire.g:311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFire.g:311:4: (lv_name_1_0= RULE_ID )
            // InternalFire.g:312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalFire.g:332:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFire.g:333:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalFire.g:333:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalFire.g:334:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalFire.g:334:5: (lv_parameters_3_0= ruleParameter )
                    // InternalFire.g:335:6: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"fire.Fire.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFire.g:352:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFire.g:353:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalFire.g:357:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalFire.g:358:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalFire.g:358:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalFire.g:359:7: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"fire.Fire.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_5());
              		
            }
            // InternalFire.g:386:3: ( (lv_returnType_8_0= ruleBuiltInType ) )
            // InternalFire.g:387:4: (lv_returnType_8_0= ruleBuiltInType )
            {
            // InternalFire.g:387:4: (lv_returnType_8_0= ruleBuiltInType )
            // InternalFire.g:388:5: lv_returnType_8_0= ruleBuiltInType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeBuiltInTypeEnumRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_returnType_8_0=ruleBuiltInType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_8_0,
              						"fire.Fire.BuiltInType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFire.g:405:3: ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:406:4: ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement )
            	    {
            	    // InternalFire.g:410:4: (lv_statements_9_0= ruleStatement )
            	    // InternalFire.g:411:5: lv_statements_9_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionAccess().getStatementsStatementParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_9_0,
            	      						"fire.Fire.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalFire.g:428:3: ( (lv_value_10_0= ruleExpression ) )
            // InternalFire.g:429:4: (lv_value_10_0= ruleExpression )
            {
            // InternalFire.g:429:4: (lv_value_10_0= ruleExpression )
            // InternalFire.g:430:5: lv_value_10_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getValueExpressionParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_value_10_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_10_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getEndKeyword_9());
              		
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleParameter"
    // InternalFire.g:455:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalFire.g:455:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalFire.g:456:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalFire.g:462:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBuiltInType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFire.g:468:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBuiltInType ) ) ) )
            // InternalFire.g:469:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBuiltInType ) ) )
            {
            // InternalFire.g:469:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBuiltInType ) ) )
            // InternalFire.g:470:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleBuiltInType ) )
            {
            // InternalFire.g:470:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFire.g:471:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFire.g:471:4: (lv_name_0_0= RULE_ID )
            // InternalFire.g:472:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalFire.g:492:3: ( (lv_type_2_0= ruleBuiltInType ) )
            // InternalFire.g:493:4: (lv_type_2_0= ruleBuiltInType )
            {
            // InternalFire.g:493:4: (lv_type_2_0= ruleBuiltInType )
            // InternalFire.g:494:5: lv_type_2_0= ruleBuiltInType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeBuiltInTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleBuiltInType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"fire.Fire.BuiltInType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleStatement"
    // InternalFire.g:515:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalFire.g:515:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFire.g:516:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFire.g:522:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )? ) | this_WhileLoop_6= ruleWhileLoop | this_IfStatement_7= ruleIfStatement | ( () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )? ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject this_VariableDeclaration_0 = null;

        EObject lv_value_4_0 = null;

        EObject this_WhileLoop_6 = null;

        EObject this_IfStatement_7 = null;

        EObject lv_argument_11_0 = null;



        	enterRule();

        try {
            // InternalFire.g:528:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )? ) | this_WhileLoop_6= ruleWhileLoop | this_IfStatement_7= ruleIfStatement | ( () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )? ) ) )
            // InternalFire.g:529:2: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )? ) | this_WhileLoop_6= ruleWhileLoop | this_IfStatement_7= ruleIfStatement | ( () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )? ) )
            {
            // InternalFire.g:529:2: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )? ) | this_WhileLoop_6= ruleWhileLoop | this_IfStatement_7= ruleIfStatement | ( () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )? ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            case 21:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFire.g:530:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFire.g:539:3: ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )? )
                    {
                    // InternalFire.g:539:3: ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )? )
                    // InternalFire.g:540:4: () ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_value_4_0= ruleExpression ) ) (otherlv_5= ';' )?
                    {
                    // InternalFire.g:540:4: ()
                    // InternalFire.g:541:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementAccess().getAssignmentStatementAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:547:4: ( (otherlv_2= RULE_ID ) )
                    // InternalFire.g:548:5: (otherlv_2= RULE_ID )
                    {
                    // InternalFire.g:548:5: (otherlv_2= RULE_ID )
                    // InternalFire.g:549:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStatementRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getVariableIdElementCrossReference_1_1_0());
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getColonEqualsSignKeyword_1_2());
                      			
                    }
                    // InternalFire.g:564:4: ( (lv_value_4_0= ruleExpression ) )
                    // InternalFire.g:565:5: (lv_value_4_0= ruleExpression )
                    {
                    // InternalFire.g:565:5: (lv_value_4_0= ruleExpression )
                    // InternalFire.g:566:6: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_value_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"fire.Fire.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFire.g:583:4: (otherlv_5= ';' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFire.g:584:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getSemicolonKeyword_1_4());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:591:3: this_WhileLoop_6= ruleWhileLoop
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_6=ruleWhileLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileLoop_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalFire.g:600:3: this_IfStatement_7= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_7=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalFire.g:609:3: ( () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )? )
                    {
                    // InternalFire.g:609:3: ( () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )? )
                    // InternalFire.g:610:4: () otherlv_9= 'writeln' otherlv_10= '(' ( (lv_argument_11_0= ruleExpression ) ) otherlv_12= ')' (otherlv_13= ';' )?
                    {
                    // InternalFire.g:610:4: ()
                    // InternalFire.g:611:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementAccess().getWritelnStatementAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getWritelnKeyword_4_1());
                      			
                    }
                    otherlv_10=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4_2());
                      			
                    }
                    // InternalFire.g:625:4: ( (lv_argument_11_0= ruleExpression ) )
                    // InternalFire.g:626:5: (lv_argument_11_0= ruleExpression )
                    {
                    // InternalFire.g:626:5: (lv_argument_11_0= ruleExpression )
                    // InternalFire.g:627:6: lv_argument_11_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_argument_11_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRule());
                      						}
                      						set(
                      							current,
                      							"argument",
                      							lv_argument_11_0,
                      							"fire.Fire.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getRightParenthesisKeyword_4_4());
                      			
                    }
                    // InternalFire.g:648:4: (otherlv_13= ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFire.g:649:5: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getSemicolonKeyword_4_5());
                              				
                            }

                            }
                            break;

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalFire.g:659:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalFire.g:659:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalFire.g:660:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalFire.g:666:1: ruleVariableDeclaration returns [EObject current=null] : ( ( ( (lv_constant_0_0= 'const' ) ) | otherlv_1= 'var' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) (otherlv_7= ';' )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalFire.g:672:2: ( ( ( ( (lv_constant_0_0= 'const' ) ) | otherlv_1= 'var' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) (otherlv_7= ';' )? ) )
            // InternalFire.g:673:2: ( ( ( (lv_constant_0_0= 'const' ) ) | otherlv_1= 'var' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) (otherlv_7= ';' )? )
            {
            // InternalFire.g:673:2: ( ( ( (lv_constant_0_0= 'const' ) ) | otherlv_1= 'var' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) (otherlv_7= ';' )? )
            // InternalFire.g:674:3: ( ( (lv_constant_0_0= 'const' ) ) | otherlv_1= 'var' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleBuiltInType ) ) otherlv_5= ':=' ( (lv_value_6_0= ruleExpression ) ) (otherlv_7= ';' )?
            {
            // InternalFire.g:674:3: ( ( (lv_constant_0_0= 'const' ) ) | otherlv_1= 'var' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFire.g:675:4: ( (lv_constant_0_0= 'const' ) )
                    {
                    // InternalFire.g:675:4: ( (lv_constant_0_0= 'const' ) )
                    // InternalFire.g:676:5: (lv_constant_0_0= 'const' )
                    {
                    // InternalFire.g:676:5: (lv_constant_0_0= 'const' )
                    // InternalFire.g:677:6: lv_constant_0_0= 'const'
                    {
                    lv_constant_0_0=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_constant_0_0, grammarAccess.getVariableDeclarationAccess().getConstantConstKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "constant", true, "const");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:690:4: otherlv_1= 'var'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalFire.g:695:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFire.g:696:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFire.g:696:4: (lv_name_2_0= RULE_ID )
            // InternalFire.g:697:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getColonKeyword_2());
              		
            }
            // InternalFire.g:717:3: ( (lv_type_4_0= ruleBuiltInType ) )
            // InternalFire.g:718:4: (lv_type_4_0= ruleBuiltInType )
            {
            // InternalFire.g:718:4: (lv_type_4_0= ruleBuiltInType )
            // InternalFire.g:719:5: lv_type_4_0= ruleBuiltInType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeBuiltInTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_type_4_0=ruleBuiltInType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"fire.Fire.BuiltInType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalFire.g:740:3: ( (lv_value_6_0= ruleExpression ) )
            // InternalFire.g:741:4: (lv_value_6_0= ruleExpression )
            {
            // InternalFire.g:741:4: (lv_value_6_0= ruleExpression )
            // InternalFire.g:742:5: lv_value_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_value_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
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

            // InternalFire.g:759:3: (otherlv_7= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFire.g:760:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_6());
                      			
                    }

                    }
                    break;

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalFire.g:769:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalFire.g:769:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalFire.g:770:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileLoop; 
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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalFire.g:776:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:782:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' ) )
            // InternalFire.g:783:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            {
            // InternalFire.g:783:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end' )
            // InternalFire.g:784:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
              		
            }
            // InternalFire.g:788:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalFire.g:789:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalFire.g:789:4: (lv_condition_1_0= ruleExpression )
            // InternalFire.g:790:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileLoopAccess().getDoKeyword_2());
              		
            }
            // InternalFire.g:811:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=21 && LA15_0<=24)||LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFire.g:812:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:812:4: (lv_statements_3_0= ruleStatement )
            	    // InternalFire.g:813:5: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // InternalFire.g:838:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalFire.g:838:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalFire.g:839:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalFire.g:845:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' ) ;
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
            // InternalFire.g:851:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' ) )
            // InternalFire.g:852:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' )
            {
            // InternalFire.g:852:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end' )
            // InternalFire.g:853:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_elseIfs_4_0= ruleElseIfStatement ) )* ( (lv_else_5_0= ruleElseStatement ) )? otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            // InternalFire.g:857:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalFire.g:858:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalFire.g:858:4: (lv_condition_1_0= ruleExpression )
            // InternalFire.g:859:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
              		
            }
            // InternalFire.g:880:3: ( (lv_thenStatements_3_0= ruleStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=21 && LA16_0<=24)||LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFire.g:881:4: (lv_thenStatements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:881:4: (lv_thenStatements_3_0= ruleStatement )
            	    // InternalFire.g:882:5: lv_thenStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getThenStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_thenStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalFire.g:899:3: ( (lv_elseIfs_4_0= ruleElseIfStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==26) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalFire.g:900:4: (lv_elseIfs_4_0= ruleElseIfStatement )
            	    {
            	    // InternalFire.g:900:4: (lv_elseIfs_4_0= ruleElseIfStatement )
            	    // InternalFire.g:901:5: lv_elseIfs_4_0= ruleElseIfStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfsElseIfStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_elseIfs_4_0=ruleElseIfStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalFire.g:918:3: ( (lv_else_5_0= ruleElseStatement ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFire.g:919:4: (lv_else_5_0= ruleElseStatement )
                    {
                    // InternalFire.g:919:4: (lv_else_5_0= ruleElseStatement )
                    // InternalFire.g:920:5: lv_else_5_0= ruleElseStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIfStatementAccess().getElseElseStatementParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_else_5_0=ruleElseStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getEndKeyword_6());
              		
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfStatement"
    // InternalFire.g:945:1: entryRuleElseIfStatement returns [EObject current=null] : iv_ruleElseIfStatement= ruleElseIfStatement EOF ;
    public final EObject entryRuleElseIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfStatement = null;


        try {
            // InternalFire.g:945:56: (iv_ruleElseIfStatement= ruleElseIfStatement EOF )
            // InternalFire.g:946:2: iv_ruleElseIfStatement= ruleElseIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfStatement=ruleElseIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfStatement; 
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
    // $ANTLR end "entryRuleElseIfStatement"


    // $ANTLR start "ruleElseIfStatement"
    // InternalFire.g:952:1: ruleElseIfStatement returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* ) ;
    public final EObject ruleElseIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenStatements_4_0 = null;



        	enterRule();

        try {
            // InternalFire.g:958:2: ( (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* ) )
            // InternalFire.g:959:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* )
            {
            // InternalFire.g:959:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )* )
            // InternalFire.g:960:3: otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenStatements_4_0= ruleStatement ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfStatementAccess().getElseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElseIfStatementAccess().getIfKeyword_1());
              		
            }
            // InternalFire.g:968:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalFire.g:969:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalFire.g:969:4: (lv_condition_2_0= ruleExpression )
            // InternalFire.g:970:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElseIfStatementAccess().getThenKeyword_3());
              		
            }
            // InternalFire.g:991:3: ( (lv_thenStatements_4_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=21 && LA19_0<=24)||LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFire.g:992:4: (lv_thenStatements_4_0= ruleStatement )
            	    {
            	    // InternalFire.g:992:4: (lv_thenStatements_4_0= ruleStatement )
            	    // InternalFire.g:993:5: lv_thenStatements_4_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseIfStatementAccess().getThenStatementsStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_thenStatements_4_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleElseIfStatement"


    // $ANTLR start "entryRuleElseStatement"
    // InternalFire.g:1014:1: entryRuleElseStatement returns [EObject current=null] : iv_ruleElseStatement= ruleElseStatement EOF ;
    public final EObject entryRuleElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseStatement = null;


        try {
            // InternalFire.g:1014:54: (iv_ruleElseStatement= ruleElseStatement EOF )
            // InternalFire.g:1015:2: iv_ruleElseStatement= ruleElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseStatement=ruleElseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseStatement; 
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
    // $ANTLR end "entryRuleElseStatement"


    // $ANTLR start "ruleElseStatement"
    // InternalFire.g:1021:1: ruleElseStatement returns [EObject current=null] : ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_elseStatements_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1027:2: ( ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* ) )
            // InternalFire.g:1028:2: ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* )
            {
            // InternalFire.g:1028:2: ( () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )* )
            // InternalFire.g:1029:3: () otherlv_1= 'else' otherlv_2= 'begin' ( (lv_elseStatements_3_0= ruleStatement ) )*
            {
            // InternalFire.g:1029:3: ()
            // InternalFire.g:1030:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElseStatementAccess().getElseStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElseStatementAccess().getElseKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseStatementAccess().getBeginKeyword_2());
              		
            }
            // InternalFire.g:1044:3: ( (lv_elseStatements_3_0= ruleStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=21 && LA20_0<=24)||LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFire.g:1045:4: (lv_elseStatements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:1045:4: (lv_elseStatements_3_0= ruleStatement )
            	    // InternalFire.g:1046:5: lv_elseStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseStatementAccess().getElseStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_elseStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleElseStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalFire.g:1067:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFire.g:1067:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFire.g:1068:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFire.g:1074:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1080:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalFire.g:1081:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalFire.g:1081:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalFire.g:1082:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1090:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFire.g:1091:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalFire.g:1091:4: ()
            	    // InternalFire.g:1092:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalFire.g:1102:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalFire.g:1103:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalFire.g:1103:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalFire.g:1104:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleAndExpression();

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
            	      							"fire.Fire.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "entryRuleAndExpression"
    // InternalFire.g:1126:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalFire.g:1126:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalFire.g:1127:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalFire.g:1133:1: ruleAndExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1139:2: ( (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalFire.g:1140:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalFire.g:1140:2: (this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalFire.g:1141:3: this_XorExpression_0= ruleXorExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1149:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFire.g:1150:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalFire.g:1150:4: ()
            	    // InternalFire.g:1151:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalFire.g:1161:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalFire.g:1162:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalFire.g:1162:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalFire.g:1163:6: lv_right_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalFire.g:1185:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalFire.g:1185:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalFire.g:1186:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalFire.g:1192:1: ruleXorExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1198:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalFire.g:1199:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalFire.g:1199:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalFire.g:1200:3: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1208:3: ( () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFire.g:1209:4: () otherlv_2= 'xor' ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalFire.g:1209:4: ()
            	    // InternalFire.g:1210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getXorExpressionAccess().getXorKeyword_1_1());
            	      			
            	    }
            	    // InternalFire.g:1220:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalFire.g:1221:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalFire.g:1221:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalFire.g:1222:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalFire.g:1244:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalFire.g:1244:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalFire.g:1245:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalFire.g:1251:1: ruleEqualityExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1257:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalFire.g:1258:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalFire.g:1258:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalFire.g:1259:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1267:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=42 && LA24_0<=43)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFire.g:1268:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalFire.g:1268:4: ()
            	    // InternalFire.g:1269:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalFire.g:1275:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalFire.g:1276:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalFire.g:1276:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalFire.g:1277:6: lv_operator_2_0= ruleEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalFire.g:1294:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalFire.g:1295:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalFire.g:1295:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalFire.g:1296:6: lv_right_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalFire.g:1318:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalFire.g:1318:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalFire.g:1319:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalFire.g:1325:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1331:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalFire.g:1332:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalFire.g:1332:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalFire.g:1333:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1341:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=44 && LA25_0<=47)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFire.g:1342:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalFire.g:1342:4: ()
            	    // InternalFire.g:1343:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalFire.g:1349:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // InternalFire.g:1350:5: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // InternalFire.g:1350:5: (lv_operator_2_0= ruleComparisonOperator )
            	    // InternalFire.g:1351:6: lv_operator_2_0= ruleComparisonOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_operator_2_0=ruleComparisonOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalFire.g:1368:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalFire.g:1369:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalFire.g:1369:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalFire.g:1370:6: lv_right_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalFire.g:1392:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalFire.g:1392:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalFire.g:1393:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalFire.g:1399:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1405:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalFire.g:1406:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalFire.g:1406:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalFire.g:1407:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1415:3: ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalFire.g:1416:4: ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalFire.g:1416:4: ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) )
            	    // InternalFire.g:1417:5: ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) )
            	    {
            	    // InternalFire.g:1427:5: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) )
            	    // InternalFire.g:1428:6: () ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    {
            	    // InternalFire.g:1428:6: ()
            	    // InternalFire.g:1429:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalFire.g:1435:6: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalFire.g:1436:7: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalFire.g:1436:7: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalFire.g:1437:8: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }


            	    }


            	    }

            	    // InternalFire.g:1456:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalFire.g:1457:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalFire.g:1457:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalFire.g:1458:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalFire.g:1480:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalFire.g:1480:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalFire.g:1481:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalFire.g:1487:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1493:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalFire.g:1494:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalFire.g:1494:2: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalFire.g:1495:3: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalFire.g:1503:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=49 && LA27_0<=52)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFire.g:1504:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalFire.g:1504:4: ()
            	    // InternalFire.g:1505:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalFire.g:1511:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalFire.g:1512:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalFire.g:1512:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalFire.g:1513:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalFire.g:1530:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalFire.g:1531:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalFire.g:1531:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalFire.g:1532:6: lv_right_3_0= ruleTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalFire.g:1554:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalFire.g:1554:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalFire.g:1555:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalFire.g:1561:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | this_IfExpression_17= ruleIfExpression | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        EObject lv_operand_13_0 = null;

        EObject lv_operand_16_0 = null;

        EObject this_IfExpression_17 = null;

        EObject this_Expression_19 = null;



        	enterRule();

        try {
            // InternalFire.g:1567:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | this_IfExpression_17= ruleIfExpression | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) ) )
            // InternalFire.g:1568:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | this_IfExpression_17= ruleIfExpression | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )
            {
            // InternalFire.g:1568:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | this_IfExpression_17= ruleIfExpression | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )
            int alt29=9;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalFire.g:1569:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFire.g:1569:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalFire.g:1570:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalFire.g:1570:4: ()
                    // InternalFire.g:1571:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIdExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:1577:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFire.g:1578:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFire.g:1578:5: (otherlv_1= RULE_ID )
                    // InternalFire.g:1579:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getTerminalExpressionAccess().getValueIdElementCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:1592:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalFire.g:1592:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalFire.g:1593:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalFire.g:1593:4: ()
                    // InternalFire.g:1594:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:1600:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalFire.g:1601:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalFire.g:1601:5: (lv_value_3_0= RULE_STRING )
                    // InternalFire.g:1602:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalFire.g:1620:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    {
                    // InternalFire.g:1620:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    // InternalFire.g:1621:4: () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    {
                    // InternalFire.g:1621:4: ()
                    // InternalFire.g:1622:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:1628:4: ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==33) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==34) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalFire.g:1629:5: ( (lv_value_5_0= 'true' ) )
                            {
                            // InternalFire.g:1629:5: ( (lv_value_5_0= 'true' ) )
                            // InternalFire.g:1630:6: (lv_value_5_0= 'true' )
                            {
                            // InternalFire.g:1630:6: (lv_value_5_0= 'true' )
                            // InternalFire.g:1631:7: lv_value_5_0= 'true'
                            {
                            lv_value_5_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
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
                            // InternalFire.g:1644:5: otherlv_6= 'false'
                            {
                            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getTerminalExpressionAccess().getFalseKeyword_2_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:1651:3: ( () ( (lv_value_8_0= ruleLong ) ) )
                    {
                    // InternalFire.g:1651:3: ( () ( (lv_value_8_0= ruleLong ) ) )
                    // InternalFire.g:1652:4: () ( (lv_value_8_0= ruleLong ) )
                    {
                    // InternalFire.g:1652:4: ()
                    // InternalFire.g:1653:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:1659:4: ( (lv_value_8_0= ruleLong ) )
                    // InternalFire.g:1660:5: (lv_value_8_0= ruleLong )
                    {
                    // InternalFire.g:1660:5: (lv_value_8_0= ruleLong )
                    // InternalFire.g:1661:6: lv_value_8_0= ruleLong
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleLong();

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
                      							"fire.Fire.Long");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFire.g:1680:3: ( () ( (lv_value_10_0= ruleDouble ) ) )
                    {
                    // InternalFire.g:1680:3: ( () ( (lv_value_10_0= ruleDouble ) ) )
                    // InternalFire.g:1681:4: () ( (lv_value_10_0= ruleDouble ) )
                    {
                    // InternalFire.g:1681:4: ()
                    // InternalFire.g:1682:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalFire.g:1688:4: ( (lv_value_10_0= ruleDouble ) )
                    // InternalFire.g:1689:5: (lv_value_10_0= ruleDouble )
                    {
                    // InternalFire.g:1689:5: (lv_value_10_0= ruleDouble )
                    // InternalFire.g:1690:6: lv_value_10_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_10_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 6 :
                    // InternalFire.g:1709:3: ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:1709:3: ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:1710:4: () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:1710:4: ()
                    // InternalFire.g:1711:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getTerminalExpressionAccess().getNotKeyword_5_1());
                      			
                    }
                    // InternalFire.g:1721:4: ( (lv_operand_13_0= ruleTerminalExpression ) )
                    // InternalFire.g:1722:5: (lv_operand_13_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:1722:5: (lv_operand_13_0= ruleTerminalExpression )
                    // InternalFire.g:1723:6: lv_operand_13_0= ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_13_0=ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 7 :
                    // InternalFire.g:1742:3: ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) )
                    {
                    // InternalFire.g:1742:3: ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) )
                    // InternalFire.g:1743:4: () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) )
                    {
                    // InternalFire.g:1743:4: ()
                    // InternalFire.g:1744:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_6_1());
                      			
                    }
                    // InternalFire.g:1754:4: ( (lv_operand_16_0= ruleTerminalExpression ) )
                    // InternalFire.g:1755:5: (lv_operand_16_0= ruleTerminalExpression )
                    {
                    // InternalFire.g:1755:5: (lv_operand_16_0= ruleTerminalExpression )
                    // InternalFire.g:1756:6: lv_operand_16_0= ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_16_0=ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 8 :
                    // InternalFire.g:1775:3: this_IfExpression_17= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getIfExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpression_17=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpression_17;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalFire.g:1784:3: (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' )
                    {
                    // InternalFire.g:1784:3: (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' )
                    // InternalFire.g:1785:4: otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')'
                    {
                    otherlv_18=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Expression_19=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_19;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_20=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_8_2());
                      			
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


    // $ANTLR start "entryRuleIfExpression"
    // InternalFire.g:1806:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalFire.g:1806:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalFire.g:1807:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalFire.g:1813:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_thenValue_4_0= ruleExpression ) ) ( (lv_elseIfs_5_0= ruleElseIfExpression ) )* otherlv_6= 'else' otherlv_7= 'begin' ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )* ( (lv_elseValue_9_0= ruleExpression ) ) otherlv_10= 'end' ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenStatements_3_0 = null;

        EObject lv_thenValue_4_0 = null;

        EObject lv_elseIfs_5_0 = null;

        EObject lv_elseStatements_8_0 = null;

        EObject lv_elseValue_9_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1819:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_thenValue_4_0= ruleExpression ) ) ( (lv_elseIfs_5_0= ruleElseIfExpression ) )* otherlv_6= 'else' otherlv_7= 'begin' ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )* ( (lv_elseValue_9_0= ruleExpression ) ) otherlv_10= 'end' ) )
            // InternalFire.g:1820:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_thenValue_4_0= ruleExpression ) ) ( (lv_elseIfs_5_0= ruleElseIfExpression ) )* otherlv_6= 'else' otherlv_7= 'begin' ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )* ( (lv_elseValue_9_0= ruleExpression ) ) otherlv_10= 'end' )
            {
            // InternalFire.g:1820:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_thenValue_4_0= ruleExpression ) ) ( (lv_elseIfs_5_0= ruleElseIfExpression ) )* otherlv_6= 'else' otherlv_7= 'begin' ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )* ( (lv_elseValue_9_0= ruleExpression ) ) otherlv_10= 'end' )
            // InternalFire.g:1821:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )* ( (lv_thenValue_4_0= ruleExpression ) ) ( (lv_elseIfs_5_0= ruleElseIfExpression ) )* otherlv_6= 'else' otherlv_7= 'begin' ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )* ( (lv_elseValue_9_0= ruleExpression ) ) otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
              		
            }
            // InternalFire.g:1825:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalFire.g:1826:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalFire.g:1826:4: (lv_condition_1_0= ruleExpression )
            // InternalFire.g:1827:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThenKeyword_2());
              		
            }
            // InternalFire.g:1848:3: ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // InternalFire.g:1849:4: ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement )
            	    {
            	    // InternalFire.g:1853:4: (lv_thenStatements_3_0= ruleStatement )
            	    // InternalFire.g:1854:5: lv_thenStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_thenStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"thenStatements",
            	      						lv_thenStatements_3_0,
            	      						"fire.Fire.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalFire.g:1871:3: ( (lv_thenValue_4_0= ruleExpression ) )
            // InternalFire.g:1872:4: (lv_thenValue_4_0= ruleExpression )
            {
            // InternalFire.g:1872:4: (lv_thenValue_4_0= ruleExpression )
            // InternalFire.g:1873:5: lv_thenValue_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenValueExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_thenValue_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"thenValue",
              						lv_thenValue_4_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFire.g:1890:3: ( (lv_elseIfs_5_0= ruleElseIfExpression ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==26) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalFire.g:1891:4: (lv_elseIfs_5_0= ruleElseIfExpression )
            	    {
            	    // InternalFire.g:1891:4: (lv_elseIfs_5_0= ruleElseIfExpression )
            	    // InternalFire.g:1892:5: lv_elseIfs_5_0= ruleElseIfExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpressionAccess().getElseIfsElseIfExpressionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_elseIfs_5_0=ruleElseIfExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elseIfs",
            	      						lv_elseIfs_5_0,
            	      						"fire.Fire.ElseIfExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getBeginKeyword_7());
              		
            }
            // InternalFire.g:1917:3: ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalFire.g:1918:4: ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement )
            	    {
            	    // InternalFire.g:1922:4: (lv_elseStatements_8_0= ruleStatement )
            	    // InternalFire.g:1923:5: lv_elseStatements_8_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpressionAccess().getElseStatementsStatementParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_elseStatements_8_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elseStatements",
            	      						lv_elseStatements_8_0,
            	      						"fire.Fire.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalFire.g:1940:3: ( (lv_elseValue_9_0= ruleExpression ) )
            // InternalFire.g:1941:4: (lv_elseValue_9_0= ruleExpression )
            {
            // InternalFire.g:1941:4: (lv_elseValue_9_0= ruleExpression )
            // InternalFire.g:1942:5: lv_elseValue_9_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getElseValueExpressionParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_elseValue_9_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"elseValue",
              						lv_elseValue_9_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getIfExpressionAccess().getEndKeyword_10());
              		
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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleElseIfExpression"
    // InternalFire.g:1967:1: entryRuleElseIfExpression returns [EObject current=null] : iv_ruleElseIfExpression= ruleElseIfExpression EOF ;
    public final EObject entryRuleElseIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfExpression = null;


        try {
            // InternalFire.g:1967:57: (iv_ruleElseIfExpression= ruleElseIfExpression EOF )
            // InternalFire.g:1968:2: iv_ruleElseIfExpression= ruleElseIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfExpression=ruleElseIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfExpression; 
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
    // $ANTLR end "entryRuleElseIfExpression"


    // $ANTLR start "ruleElseIfExpression"
    // InternalFire.g:1974:1: ruleElseIfExpression returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )* ( (lv_thenValue_5_0= ruleExpression ) ) ) ;
    public final EObject ruleElseIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenStatements_4_0 = null;

        EObject lv_thenValue_5_0 = null;



        	enterRule();

        try {
            // InternalFire.g:1980:2: ( (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )* ( (lv_thenValue_5_0= ruleExpression ) ) ) )
            // InternalFire.g:1981:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )* ( (lv_thenValue_5_0= ruleExpression ) ) )
            {
            // InternalFire.g:1981:2: (otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )* ( (lv_thenValue_5_0= ruleExpression ) ) )
            // InternalFire.g:1982:3: otherlv_0= 'else' otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )* ( (lv_thenValue_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfExpressionAccess().getElseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getElseIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalFire.g:1990:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalFire.g:1991:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalFire.g:1991:4: (lv_condition_2_0= ruleExpression )
            // InternalFire.g:1992:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfExpressionAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElseIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalFire.g:2013:3: ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalFire.g:2014:4: ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement )
            	    {
            	    // InternalFire.g:2018:4: (lv_thenStatements_4_0= ruleStatement )
            	    // InternalFire.g:2019:5: lv_thenStatements_4_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElseIfExpressionAccess().getThenStatementsStatementParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_thenStatements_4_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"thenStatements",
            	      						lv_thenStatements_4_0,
            	      						"fire.Fire.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalFire.g:2036:3: ( (lv_thenValue_5_0= ruleExpression ) )
            // InternalFire.g:2037:4: (lv_thenValue_5_0= ruleExpression )
            {
            // InternalFire.g:2037:4: (lv_thenValue_5_0= ruleExpression )
            // InternalFire.g:2038:5: lv_thenValue_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfExpressionAccess().getThenValueExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_thenValue_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
              					}
              					set(
              						current,
              						"thenValue",
              						lv_thenValue_5_0,
              						"fire.Fire.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


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
    // $ANTLR end "ruleElseIfExpression"


    // $ANTLR start "entryRuleLong"
    // InternalFire.g:2059:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // InternalFire.g:2059:44: (iv_ruleLong= ruleLong EOF )
            // InternalFire.g:2060:2: iv_ruleLong= ruleLong EOF
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
    // InternalFire.g:2066:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFire.g:2072:2: (this_INT_0= RULE_INT )
            // InternalFire.g:2073:2: this_INT_0= RULE_INT
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
    // InternalFire.g:2083:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalFire.g:2083:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalFire.g:2084:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalFire.g:2090:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFire.g:2096:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFire.g:2097:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFire.g:2097:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFire.g:2098:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,37,FOLLOW_32); if (state.failed) return current;
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


    // $ANTLR start "ruleBuiltInType"
    // InternalFire.g:2121:1: ruleBuiltInType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) ;
    public final Enumerator ruleBuiltInType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:2127:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) ) )
            // InternalFire.g:2128:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            {
            // InternalFire.g:2128:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Real' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt34=1;
                }
                break;
            case 39:
                {
                alt34=2;
                }
                break;
            case 40:
                {
                alt34=3;
                }
                break;
            case 41:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalFire.g:2129:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFire.g:2129:3: (enumLiteral_0= 'String' )
                    // InternalFire.g:2130:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:2137:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalFire.g:2137:3: (enumLiteral_1= 'Boolean' )
                    // InternalFire.g:2138:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:2145:3: (enumLiteral_2= 'Integer' )
                    {
                    // InternalFire.g:2145:3: (enumLiteral_2= 'Integer' )
                    // InternalFire.g:2146:4: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:2153:3: (enumLiteral_3= 'Real' )
                    {
                    // InternalFire.g:2153:3: (enumLiteral_3= 'Real' )
                    // InternalFire.g:2154:4: enumLiteral_3= 'Real'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "ruleEqualityOperator"
    // InternalFire.g:2164:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:2170:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalFire.g:2171:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalFire.g:2171:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            else if ( (LA35_0==43) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalFire.g:2172:3: (enumLiteral_0= '=' )
                    {
                    // InternalFire.g:2172:3: (enumLiteral_0= '=' )
                    // InternalFire.g:2173:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:2180:3: (enumLiteral_1= '<>' )
                    {
                    // InternalFire.g:2180:3: (enumLiteral_1= '<>' )
                    // InternalFire.g:2181:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFire.g:2191:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:2197:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // InternalFire.g:2198:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalFire.g:2198:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt36=1;
                }
                break;
            case 45:
                {
                alt36=2;
                }
                break;
            case 46:
                {
                alt36=3;
                }
                break;
            case 47:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalFire.g:2199:3: (enumLiteral_0= '<' )
                    {
                    // InternalFire.g:2199:3: (enumLiteral_0= '<' )
                    // InternalFire.g:2200:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:2207:3: (enumLiteral_1= '<=' )
                    {
                    // InternalFire.g:2207:3: (enumLiteral_1= '<=' )
                    // InternalFire.g:2208:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:2215:3: (enumLiteral_2= '>' )
                    {
                    // InternalFire.g:2215:3: (enumLiteral_2= '>' )
                    // InternalFire.g:2216:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:2223:3: (enumLiteral_3= '>=' )
                    {
                    // InternalFire.g:2223:3: (enumLiteral_3= '>=' )
                    // InternalFire.g:2224:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalFire.g:2234:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFire.g:2240:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalFire.g:2241:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalFire.g:2241:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            else if ( (LA37_0==36) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalFire.g:2242:3: (enumLiteral_0= '+' )
                    {
                    // InternalFire.g:2242:3: (enumLiteral_0= '+' )
                    // InternalFire.g:2243:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:2250:3: (enumLiteral_1= '-' )
                    {
                    // InternalFire.g:2250:3: (enumLiteral_1= '-' )
                    // InternalFire.g:2251:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalFire.g:2261:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFire.g:2267:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) ) )
            // InternalFire.g:2268:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            {
            // InternalFire.g:2268:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'div' ) | (enumLiteral_3= 'mod' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt38=1;
                }
                break;
            case 50:
                {
                alt38=2;
                }
                break;
            case 51:
                {
                alt38=3;
                }
                break;
            case 52:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalFire.g:2269:3: (enumLiteral_0= '*' )
                    {
                    // InternalFire.g:2269:3: (enumLiteral_0= '*' )
                    // InternalFire.g:2270:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:2277:3: (enumLiteral_1= '/' )
                    {
                    // InternalFire.g:2277:3: (enumLiteral_1= '/' )
                    // InternalFire.g:2278:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:2285:3: (enumLiteral_2= 'div' )
                    {
                    // InternalFire.g:2285:3: (enumLiteral_2= 'div' )
                    // InternalFire.g:2286:4: enumLiteral_2= 'div'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:2293:3: (enumLiteral_3= 'mod' )
                    {
                    // InternalFire.g:2293:3: (enumLiteral_3= 'mod' )
                    // InternalFire.g:2294:4: enumLiteral_3= 'mod'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
        // InternalFire.g:406:4: ( ( ruleStatement ) )
        // InternalFire.g:406:5: ( ruleStatement )
        {
        // InternalFire.g:406:5: ( ruleStatement )
        // InternalFire.g:407:5: ruleStatement
        {
        pushFollow(FOLLOW_2);
        ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalFire

    // $ANTLR start synpred2_InternalFire
    public final void synpred2_InternalFire_fragment() throws RecognitionException {   
        // InternalFire.g:1417:5: ( ( () ( ( ruleAdditiveOperator ) ) ) )
        // InternalFire.g:1417:6: ( () ( ( ruleAdditiveOperator ) ) )
        {
        // InternalFire.g:1417:6: ( () ( ( ruleAdditiveOperator ) ) )
        // InternalFire.g:1418:6: () ( ( ruleAdditiveOperator ) )
        {
        // InternalFire.g:1418:6: ()
        // InternalFire.g:1419:6: 
        {
        }

        // InternalFire.g:1420:6: ( ( ruleAdditiveOperator ) )
        // InternalFire.g:1421:7: ( ruleAdditiveOperator )
        {
        // InternalFire.g:1421:7: ( ruleAdditiveOperator )
        // InternalFire.g:1422:8: ruleAdditiveOperator
        {
        pushFollow(FOLLOW_2);
        ruleAdditiveOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFire

    // $ANTLR start synpred3_InternalFire
    public final void synpred3_InternalFire_fragment() throws RecognitionException {   
        // InternalFire.g:1849:4: ( ( ruleStatement ) )
        // InternalFire.g:1849:5: ( ruleStatement )
        {
        // InternalFire.g:1849:5: ( ruleStatement )
        // InternalFire.g:1850:5: ruleStatement
        {
        pushFollow(FOLLOW_2);
        ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalFire

    // $ANTLR start synpred4_InternalFire
    public final void synpred4_InternalFire_fragment() throws RecognitionException {   
        // InternalFire.g:1918:4: ( ( ruleStatement ) )
        // InternalFire.g:1918:5: ( ruleStatement )
        {
        // InternalFire.g:1918:5: ( ruleStatement )
        // InternalFire.g:1919:5: ruleStatement
        {
        pushFollow(FOLLOW_2);
        ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalFire

    // $ANTLR start synpred5_InternalFire
    public final void synpred5_InternalFire_fragment() throws RecognitionException {   
        // InternalFire.g:2014:4: ( ( ruleStatement ) )
        // InternalFire.g:2014:5: ( ruleStatement )
        {
        // InternalFire.g:2014:5: ( ruleStatement )
        // InternalFire.g:2015:5: ruleStatement
        {
        pushFollow(FOLLOW_2);
        ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFire

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
    public final boolean synpred4_InternalFire() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFire_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalFire() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFire_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFire() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFire_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFire() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFire_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\1\0\6\uffff\1\0\5\uffff";
    static final String dfa_3s = "\1\44\1\0\6\uffff\1\0\5\uffff";
    static final String dfa_4s = "\2\uffff\1\2\7\uffff\4\1";
    static final String dfa_5s = "\1\0\1\1\6\uffff\1\2\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\2\7\uffff\1\2\6\uffff\1\15\1\12\1\13\1\14\1\uffff\1\10\6\uffff\4\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 405:3: ( ( ( ruleStatement ) )=> (lv_statements_9_0= ruleStatement ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==RULE_ID) ) {s = 1;}

                        else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)||LA9_0==14||(LA9_0>=33 && LA9_0<=36)) ) {s = 2;}

                        else if ( (LA9_0==26) ) {s = 8;}

                        else if ( (LA9_0==22) && (synpred1_InternalFire())) {s = 10;}

                        else if ( (LA9_0==23) && (synpred1_InternalFire())) {s = 11;}

                        else if ( (LA9_0==24) && (synpred1_InternalFire())) {s = 12;}

                        else if ( (LA9_0==21) && (synpred1_InternalFire())) {s = 13;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\37\uffff";
    static final String dfa_8s = "\1\1\36\uffff";
    static final String dfa_9s = "\1\4\26\uffff\1\0\7\uffff";
    static final String dfa_10s = "\1\60\26\uffff\1\0\7\uffff";
    static final String dfa_11s = "\1\uffff\1\2\34\uffff\1\1";
    static final String dfa_12s = "\1\0\26\uffff\1\1\7\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\11\1\1\uffff\6\1\1\27\5\uffff\6\1\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1415:3: ( ( ( ( () ( ( ruleAdditiveOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==EOF||(LA26_0>=RULE_ID && LA26_0<=RULE_INT)||LA26_0==12||LA26_0==14||LA26_0==16||(LA26_0>=20 && LA26_0<=28)||(LA26_0>=30 && LA26_0<=35)||(LA26_0>=42 && LA26_0<=47)) ) {s = 1;}

                        else if ( (LA26_0==36) ) {s = 23;}

                        else if ( (LA26_0==48) && (synpred2_InternalFire())) {s = 30;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_23 = input.LA(1);

                         
                        int index26_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalFire()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\13\uffff";
    static final String dfa_15s = "\4\uffff\1\12\6\uffff";
    static final String dfa_16s = "\1\4\3\uffff\1\4\6\uffff";
    static final String dfa_17s = "\1\44\3\uffff\1\64\6\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\5\1\4";
    static final String dfa_19s = "\13\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2\1\4\7\uffff\1\10\13\uffff\1\7\6\uffff\2\3\1\5\1\6",
            "",
            "",
            "",
            "\3\12\5\uffff\1\12\1\uffff\1\12\1\uffff\1\12\3\uffff\11\12\1\uffff\7\12\1\11\4\uffff\13\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1568:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= ruleLong ) ) ) | ( () ( (lv_value_10_0= ruleDouble ) ) ) | ( () otherlv_12= 'not' ( (lv_operand_13_0= ruleTerminalExpression ) ) ) | ( () otherlv_15= '-' ( (lv_operand_16_0= ruleTerminalExpression ) ) ) | this_IfExpression_17= ruleIfExpression | (otherlv_18= '(' this_Expression_19= ruleExpression otherlv_20= ')' ) )";
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1848:3: ( ( ( ruleStatement ) )=> (lv_thenStatements_3_0= ruleStatement ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==RULE_ID) ) {s = 1;}

                        else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_INT)||LA30_0==14||(LA30_0>=33 && LA30_0<=36)) ) {s = 2;}

                        else if ( (LA30_0==26) ) {s = 8;}

                        else if ( (LA30_0==22) && (synpred3_InternalFire())) {s = 10;}

                        else if ( (LA30_0==23) && (synpred3_InternalFire())) {s = 11;}

                        else if ( (LA30_0==24) && (synpred3_InternalFire())) {s = 12;}

                        else if ( (LA30_0==21) && (synpred3_InternalFire())) {s = 13;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1917:3: ( ( ( ruleStatement ) )=> (lv_elseStatements_8_0= ruleStatement ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==RULE_ID) ) {s = 1;}

                        else if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_INT)||LA32_0==14||(LA32_0>=33 && LA32_0<=36)) ) {s = 2;}

                        else if ( (LA32_0==26) ) {s = 8;}

                        else if ( (LA32_0==22) && (synpred4_InternalFire())) {s = 10;}

                        else if ( (LA32_0==23) && (synpred4_InternalFire())) {s = 11;}

                        else if ( (LA32_0==24) && (synpred4_InternalFire())) {s = 12;}

                        else if ( (LA32_0==21) && (synpred4_InternalFire())) {s = 13;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2013:3: ( ( ( ruleStatement ) )=> (lv_thenStatements_4_0= ruleStatement ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_INT)||LA33_0==14||(LA33_0>=33 && LA33_0<=36)) ) {s = 2;}

                        else if ( (LA33_0==26) ) {s = 8;}

                        else if ( (LA33_0==22) && (synpred5_InternalFire())) {s = 10;}

                        else if ( (LA33_0==23) && (synpred5_InternalFire())) {s = 11;}

                        else if ( (LA33_0==24) && (synpred5_InternalFire())) {s = 12;}

                        else if ( (LA33_0==21) && (synpred5_InternalFire())) {s = 13;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalFire()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000005E23010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000005E01010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001E05E04070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000015E01010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000005E00012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001001000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});

}