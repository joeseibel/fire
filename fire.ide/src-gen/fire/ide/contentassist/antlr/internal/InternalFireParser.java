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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFireParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'program'", "'end'", "'writeln'", "'('", "')'", "'not'", "'.'", "'true'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleProgram"
    // InternalFire.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalFire.g:55:1: ( ruleProgram EOF )
            // InternalFire.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalFire.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalFire.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalFire.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalFire.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalFire.g:70:3: ( rule__Program__Group__0 )
            // InternalFire.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleWritelnStatement"
    // InternalFire.g:79:1: entryRuleWritelnStatement : ruleWritelnStatement EOF ;
    public final void entryRuleWritelnStatement() throws RecognitionException {
        try {
            // InternalFire.g:80:1: ( ruleWritelnStatement EOF )
            // InternalFire.g:81:1: ruleWritelnStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWritelnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWritelnStatement"


    // $ANTLR start "ruleWritelnStatement"
    // InternalFire.g:88:1: ruleWritelnStatement : ( ( rule__WritelnStatement__Group__0 ) ) ;
    public final void ruleWritelnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:92:2: ( ( ( rule__WritelnStatement__Group__0 ) ) )
            // InternalFire.g:93:2: ( ( rule__WritelnStatement__Group__0 ) )
            {
            // InternalFire.g:93:2: ( ( rule__WritelnStatement__Group__0 ) )
            // InternalFire.g:94:3: ( rule__WritelnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementAccess().getGroup()); 
            }
            // InternalFire.g:95:3: ( rule__WritelnStatement__Group__0 )
            // InternalFire.g:95:4: rule__WritelnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWritelnStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalFire.g:104:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFire.g:105:1: ( ruleExpression EOF )
            // InternalFire.g:106:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFire.g:113:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:117:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalFire.g:118:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalFire.g:118:2: ( ( rule__Expression__Group__0 ) )
            // InternalFire.g:119:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalFire.g:120:3: ( rule__Expression__Group__0 )
            // InternalFire.g:120:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalFire.g:129:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalFire.g:130:1: ( ruleMultiplicativeExpression EOF )
            // InternalFire.g:131:1: ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalFire.g:138:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:142:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalFire.g:143:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalFire.g:143:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalFire.g:144:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalFire.g:145:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalFire.g:145:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalFire.g:154:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalFire.g:155:1: ( ruleTerminalExpression EOF )
            // InternalFire.g:156:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalFire.g:163:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:167:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalFire.g:168:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalFire.g:168:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalFire.g:169:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalFire.g:170:3: ( rule__TerminalExpression__Alternatives )
            // InternalFire.g:170:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleLong"
    // InternalFire.g:179:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // InternalFire.g:180:1: ( ruleLong EOF )
            // InternalFire.g:181:1: ruleLong EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // InternalFire.g:188:1: ruleLong : ( RULE_INT ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:192:2: ( ( RULE_INT ) )
            // InternalFire.g:193:2: ( RULE_INT )
            {
            // InternalFire.g:193:2: ( RULE_INT )
            // InternalFire.g:194:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongAccess().getINTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleDouble"
    // InternalFire.g:204:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalFire.g:205:1: ( ruleDouble EOF )
            // InternalFire.g:206:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalFire.g:213:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:217:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalFire.g:218:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalFire.g:218:2: ( ( rule__Double__Group__0 ) )
            // InternalFire.g:219:3: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // InternalFire.g:220:3: ( rule__Double__Group__0 )
            // InternalFire.g:220:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalFire.g:229:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:233:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalFire.g:234:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalFire.g:234:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalFire.g:235:3: ( rule__AdditiveOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            }
            // InternalFire.g:236:3: ( rule__AdditiveOperator__Alternatives )
            // InternalFire.g:236:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalFire.g:245:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:249:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalFire.g:250:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalFire.g:250:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalFire.g:251:3: ( rule__MultiplicativeOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            }
            // InternalFire.g:252:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalFire.g:252:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalFire.g:260:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:264:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case 11:
            case 25:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==EOF||(LA1_3>=12 && LA1_3<=17)||LA1_3==22) ) {
                    alt1=3;
                }
                else if ( (LA1_3==24) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case 13:
                {
                alt1=6;
                }
                break;
            case 21:
                {
                alt1=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFire.g:265:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalFire.g:265:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalFire.g:266:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalFire.g:267:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalFire.g:267:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:271:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalFire.g:271:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalFire.g:272:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalFire.g:273:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalFire.g:273:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:277:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalFire.g:277:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalFire.g:278:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalFire.g:279:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalFire.g:279:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:283:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalFire.g:283:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalFire.g:284:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalFire.g:285:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalFire.g:285:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFire.g:289:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalFire.g:289:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalFire.g:290:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalFire.g:291:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalFire.g:291:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFire.g:295:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalFire.g:295:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalFire.g:296:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalFire.g:297:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalFire.g:297:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalFire.g:301:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalFire.g:301:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalFire.g:302:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }
                    // InternalFire.g:303:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalFire.g:303:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives_1_1"
    // InternalFire.g:311:1: rule__TerminalExpression__Alternatives_1_1 : ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__TerminalExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:315:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFire.g:316:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    {
                    // InternalFire.g:316:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    // InternalFire.g:317:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0()); 
                    }
                    // InternalFire.g:318:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    // InternalFire.g:318:4: rule__TerminalExpression__ValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__ValueAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:322:2: ( 'false' )
                    {
                    // InternalFire.g:322:2: ( 'false' )
                    // InternalFire.g:323:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives_1_1"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalFire.g:332:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:336:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFire.g:337:2: ( ( '+' ) )
                    {
                    // InternalFire.g:337:2: ( ( '+' ) )
                    // InternalFire.g:338:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalFire.g:339:3: ( '+' )
                    // InternalFire.g:339:4: '+'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:343:2: ( ( '-' ) )
                    {
                    // InternalFire.g:343:2: ( ( '-' ) )
                    // InternalFire.g:344:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }
                    // InternalFire.g:345:3: ( '-' )
                    // InternalFire.g:345:4: '-'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalFire.g:353:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:357:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFire.g:358:2: ( ( '*' ) )
                    {
                    // InternalFire.g:358:2: ( ( '*' ) )
                    // InternalFire.g:359:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }
                    // InternalFire.g:360:3: ( '*' )
                    // InternalFire.g:360:4: '*'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:364:2: ( ( '/' ) )
                    {
                    // InternalFire.g:364:2: ( ( '/' ) )
                    // InternalFire.g:365:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalFire.g:366:3: ( '/' )
                    // InternalFire.g:366:4: '/'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:370:2: ( ( 'div' ) )
                    {
                    // InternalFire.g:370:2: ( ( 'div' ) )
                    // InternalFire.g:371:3: ( 'div' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 
                    }
                    // InternalFire.g:372:3: ( 'div' )
                    // InternalFire.g:372:4: 'div'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:376:2: ( ( 'mod' ) )
                    {
                    // InternalFire.g:376:2: ( ( 'mod' ) )
                    // InternalFire.g:377:3: ( 'mod' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 
                    }
                    // InternalFire.g:378:3: ( 'mod' )
                    // InternalFire.g:378:4: 'mod'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalFire.g:386:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:390:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFire.g:391:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalFire.g:398:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:402:1: ( ( () ) )
            // InternalFire.g:403:1: ( () )
            {
            // InternalFire.g:403:1: ( () )
            // InternalFire.g:404:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }
            // InternalFire.g:405:2: ()
            // InternalFire.g:405:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalFire.g:413:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:417:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalFire.g:418:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalFire.g:425:1: rule__Program__Group__1__Impl : ( 'program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:429:1: ( ( 'program' ) )
            // InternalFire.g:430:1: ( 'program' )
            {
            // InternalFire.g:430:1: ( 'program' )
            // InternalFire.g:431:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalFire.g:440:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:444:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalFire.g:445:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalFire.g:452:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:456:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalFire.g:457:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalFire.g:457:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalFire.g:458:2: ( rule__Program__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            }
            // InternalFire.g:459:2: ( rule__Program__StatementsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFire.g:459:3: rule__Program__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalFire.g:467:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:471:1: ( rule__Program__Group__3__Impl )
            // InternalFire.g:472:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalFire.g:478:1: rule__Program__Group__3__Impl : ( 'end' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:482:1: ( ( 'end' ) )
            // InternalFire.g:483:1: ( 'end' )
            {
            // InternalFire.g:483:1: ( 'end' )
            // InternalFire.g:484:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getEndKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getEndKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__WritelnStatement__Group__0"
    // InternalFire.g:494:1: rule__WritelnStatement__Group__0 : rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1 ;
    public final void rule__WritelnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:498:1: ( rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1 )
            // InternalFire.g:499:2: rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WritelnStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__0"


    // $ANTLR start "rule__WritelnStatement__Group__0__Impl"
    // InternalFire.g:506:1: rule__WritelnStatement__Group__0__Impl : ( 'writeln' ) ;
    public final void rule__WritelnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:510:1: ( ( 'writeln' ) )
            // InternalFire.g:511:1: ( 'writeln' )
            {
            // InternalFire.g:511:1: ( 'writeln' )
            // InternalFire.g:512:2: 'writeln'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__0__Impl"


    // $ANTLR start "rule__WritelnStatement__Group__1"
    // InternalFire.g:521:1: rule__WritelnStatement__Group__1 : rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2 ;
    public final void rule__WritelnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:525:1: ( rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2 )
            // InternalFire.g:526:2: rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WritelnStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__1"


    // $ANTLR start "rule__WritelnStatement__Group__1__Impl"
    // InternalFire.g:533:1: rule__WritelnStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WritelnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:537:1: ( ( '(' ) )
            // InternalFire.g:538:1: ( '(' )
            {
            // InternalFire.g:538:1: ( '(' )
            // InternalFire.g:539:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__1__Impl"


    // $ANTLR start "rule__WritelnStatement__Group__2"
    // InternalFire.g:548:1: rule__WritelnStatement__Group__2 : rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3 ;
    public final void rule__WritelnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:552:1: ( rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3 )
            // InternalFire.g:553:2: rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__WritelnStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__2"


    // $ANTLR start "rule__WritelnStatement__Group__2__Impl"
    // InternalFire.g:560:1: rule__WritelnStatement__Group__2__Impl : ( ( rule__WritelnStatement__ArgumentAssignment_2 ) ) ;
    public final void rule__WritelnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:564:1: ( ( ( rule__WritelnStatement__ArgumentAssignment_2 ) ) )
            // InternalFire.g:565:1: ( ( rule__WritelnStatement__ArgumentAssignment_2 ) )
            {
            // InternalFire.g:565:1: ( ( rule__WritelnStatement__ArgumentAssignment_2 ) )
            // InternalFire.g:566:2: ( rule__WritelnStatement__ArgumentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); 
            }
            // InternalFire.g:567:2: ( rule__WritelnStatement__ArgumentAssignment_2 )
            // InternalFire.g:567:3: rule__WritelnStatement__ArgumentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__ArgumentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__2__Impl"


    // $ANTLR start "rule__WritelnStatement__Group__3"
    // InternalFire.g:575:1: rule__WritelnStatement__Group__3 : rule__WritelnStatement__Group__3__Impl ;
    public final void rule__WritelnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:579:1: ( rule__WritelnStatement__Group__3__Impl )
            // InternalFire.g:580:2: rule__WritelnStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__3"


    // $ANTLR start "rule__WritelnStatement__Group__3__Impl"
    // InternalFire.g:586:1: rule__WritelnStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WritelnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:590:1: ( ( ')' ) )
            // InternalFire.g:591:1: ( ')' )
            {
            // InternalFire.g:591:1: ( ')' )
            // InternalFire.g:592:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalFire.g:602:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:606:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalFire.g:607:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalFire.g:614:1: rule__Expression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:618:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:619:1: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:619:1: ( ruleMultiplicativeExpression )
            // InternalFire.g:620:2: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalFire.g:629:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:633:1: ( rule__Expression__Group__1__Impl )
            // InternalFire.g:634:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalFire.g:640:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:644:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalFire.g:645:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalFire.g:645:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalFire.g:646:2: ( rule__Expression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalFire.g:647:2: ( rule__Expression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=13)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFire.g:647:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalFire.g:656:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:660:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFire.g:661:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalFire.g:668:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:672:1: ( ( ( rule__Expression__Group_1_0__0 ) ) )
            // InternalFire.g:673:1: ( ( rule__Expression__Group_1_0__0 ) )
            {
            // InternalFire.g:673:1: ( ( rule__Expression__Group_1_0__0 ) )
            // InternalFire.g:674:2: ( rule__Expression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            }
            // InternalFire.g:675:2: ( rule__Expression__Group_1_0__0 )
            // InternalFire.g:675:3: rule__Expression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalFire.g:683:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:687:1: ( rule__Expression__Group_1__1__Impl )
            // InternalFire.g:688:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalFire.g:694:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:698:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalFire.g:699:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalFire.g:699:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalFire.g:700:2: ( rule__Expression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalFire.g:701:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalFire.g:701:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__0"
    // InternalFire.g:710:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:714:1: ( rule__Expression__Group_1_0__0__Impl )
            // InternalFire.g:715:2: rule__Expression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0"


    // $ANTLR start "rule__Expression__Group_1_0__0__Impl"
    // InternalFire.g:721:1: rule__Expression__Group_1_0__0__Impl : ( ( rule__Expression__Group_1_0_0__0 ) ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:725:1: ( ( ( rule__Expression__Group_1_0_0__0 ) ) )
            // InternalFire.g:726:1: ( ( rule__Expression__Group_1_0_0__0 ) )
            {
            // InternalFire.g:726:1: ( ( rule__Expression__Group_1_0_0__0 ) )
            // InternalFire.g:727:2: ( rule__Expression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalFire.g:728:2: ( rule__Expression__Group_1_0_0__0 )
            // InternalFire.g:728:3: rule__Expression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__0"
    // InternalFire.g:737:1: rule__Expression__Group_1_0_0__0 : rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 ;
    public final void rule__Expression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:741:1: ( rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 )
            // InternalFire.g:742:2: rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0"


    // $ANTLR start "rule__Expression__Group_1_0_0__0__Impl"
    // InternalFire.g:749:1: rule__Expression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:753:1: ( ( () ) )
            // InternalFire.g:754:1: ( () )
            {
            // InternalFire.g:754:1: ( () )
            // InternalFire.g:755:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAdditiveExpressionLeftAction_1_0_0_0()); 
            }
            // InternalFire.g:756:2: ()
            // InternalFire.g:756:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAdditiveExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__1"
    // InternalFire.g:764:1: rule__Expression__Group_1_0_0__1 : rule__Expression__Group_1_0_0__1__Impl ;
    public final void rule__Expression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:768:1: ( rule__Expression__Group_1_0_0__1__Impl )
            // InternalFire.g:769:2: rule__Expression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1"


    // $ANTLR start "rule__Expression__Group_1_0_0__1__Impl"
    // InternalFire.g:775:1: rule__Expression__Group_1_0_0__1__Impl : ( ( rule__Expression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__Expression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:779:1: ( ( ( rule__Expression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalFire.g:780:1: ( ( rule__Expression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalFire.g:780:1: ( ( rule__Expression__OperatorAssignment_1_0_0_1 ) )
            // InternalFire.g:781:2: ( rule__Expression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalFire.g:782:2: ( rule__Expression__OperatorAssignment_1_0_0_1 )
            // InternalFire.g:782:3: rule__Expression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalFire.g:791:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:795:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalFire.g:796:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalFire.g:803:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:807:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:808:1: ( ruleTerminalExpression )
            {
            // InternalFire.g:808:1: ( ruleTerminalExpression )
            // InternalFire.g:809:2: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalFire.g:818:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:822:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalFire.g:823:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalFire.g:829:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:833:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalFire.g:834:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalFire.g:834:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalFire.g:835:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalFire.g:836:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFire.g:836:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalFire.g:845:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:849:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalFire.g:850:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalFire.g:857:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:861:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalFire.g:862:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalFire.g:862:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalFire.g:863:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalFire.g:864:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalFire.g:864:3: rule__MultiplicativeExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalFire.g:872:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:876:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalFire.g:877:2: rule__MultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalFire.g:883:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:887:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalFire.g:888:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalFire.g:888:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalFire.g:889:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalFire.g:890:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalFire.g:890:3: rule__MultiplicativeExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0"
    // InternalFire.g:899:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:903:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalFire.g:904:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0__Impl"
    // InternalFire.g:910:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:914:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalFire.g:915:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalFire.g:915:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalFire.g:916:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalFire.g:917:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalFire.g:917:3: rule__MultiplicativeExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__0"
    // InternalFire.g:926:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:930:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalFire.g:931:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__MultiplicativeExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__0__Impl"
    // InternalFire.g:938:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:942:1: ( ( () ) )
            // InternalFire.g:943:1: ( () )
            {
            // InternalFire.g:943:1: ( () )
            // InternalFire.g:944:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0_0_0()); 
            }
            // InternalFire.g:945:2: ()
            // InternalFire.g:945:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__1"
    // InternalFire.g:953:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:957:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalFire.g:958:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__1__Impl"
    // InternalFire.g:964:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:968:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalFire.g:969:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalFire.g:969:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalFire.g:970:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalFire.g:971:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            // InternalFire.g:971:3: rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalFire.g:980:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:984:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalFire.g:985:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalFire.g:992:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:996:1: ( ( () ) )
            // InternalFire.g:997:1: ( () )
            {
            // InternalFire.g:997:1: ( () )
            // InternalFire.g:998:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0()); 
            }
            // InternalFire.g:999:2: ()
            // InternalFire.g:999:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalFire.g:1007:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1011:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalFire.g:1012:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalFire.g:1018:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1022:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalFire.g:1023:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalFire.g:1023:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalFire.g:1024:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalFire.g:1025:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalFire.g:1025:3: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalFire.g:1034:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1038:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalFire.g:1039:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalFire.g:1046:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1050:1: ( ( () ) )
            // InternalFire.g:1051:1: ( () )
            {
            // InternalFire.g:1051:1: ( () )
            // InternalFire.g:1052:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            }
            // InternalFire.g:1053:2: ()
            // InternalFire.g:1053:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalFire.g:1061:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1065:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalFire.g:1066:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalFire.g:1072:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__Alternatives_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1076:1: ( ( ( rule__TerminalExpression__Alternatives_1_1 ) ) )
            // InternalFire.g:1077:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            {
            // InternalFire.g:1077:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            // InternalFire.g:1078:2: ( rule__TerminalExpression__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1()); 
            }
            // InternalFire.g:1079:2: ( rule__TerminalExpression__Alternatives_1_1 )
            // InternalFire.g:1079:3: rule__TerminalExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalFire.g:1088:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1092:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalFire.g:1093:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalFire.g:1100:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1104:1: ( ( () ) )
            // InternalFire.g:1105:1: ( () )
            {
            // InternalFire.g:1105:1: ( () )
            // InternalFire.g:1106:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0()); 
            }
            // InternalFire.g:1107:2: ()
            // InternalFire.g:1107:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalFire.g:1115:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1119:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalFire.g:1120:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalFire.g:1126:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1130:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalFire.g:1131:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalFire.g:1131:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalFire.g:1132:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalFire.g:1133:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalFire.g:1133:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalFire.g:1142:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1146:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalFire.g:1147:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalFire.g:1154:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1158:1: ( ( () ) )
            // InternalFire.g:1159:1: ( () )
            {
            // InternalFire.g:1159:1: ( () )
            // InternalFire.g:1160:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0()); 
            }
            // InternalFire.g:1161:2: ()
            // InternalFire.g:1161:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalFire.g:1169:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1173:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalFire.g:1174:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalFire.g:1180:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1184:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalFire.g:1185:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalFire.g:1185:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalFire.g:1186:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalFire.g:1187:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalFire.g:1187:3: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__0"
    // InternalFire.g:1196:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1200:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalFire.g:1201:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_4__0__Impl"
    // InternalFire.g:1208:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1212:1: ( ( () ) )
            // InternalFire.g:1213:1: ( () )
            {
            // InternalFire.g:1213:1: ( () )
            // InternalFire.g:1214:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0()); 
            }
            // InternalFire.g:1215:2: ()
            // InternalFire.g:1215:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__1"
    // InternalFire.g:1223:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1227:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // InternalFire.g:1228:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_4__1__Impl"
    // InternalFire.g:1235:1: rule__TerminalExpression__Group_4__1__Impl : ( 'not' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1239:1: ( ( 'not' ) )
            // InternalFire.g:1240:1: ( 'not' )
            {
            // InternalFire.g:1240:1: ( 'not' )
            // InternalFire.g:1241:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__2"
    // InternalFire.g:1250:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1254:1: ( rule__TerminalExpression__Group_4__2__Impl )
            // InternalFire.g:1255:2: rule__TerminalExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__2"


    // $ANTLR start "rule__TerminalExpression__Group_4__2__Impl"
    // InternalFire.g:1261:1: rule__TerminalExpression__Group_4__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1265:1: ( ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) )
            // InternalFire.g:1266:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            {
            // InternalFire.g:1266:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            // InternalFire.g:1267:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2()); 
            }
            // InternalFire.g:1268:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            // InternalFire.g:1268:3: rule__TerminalExpression__OperandAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__OperandAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalFire.g:1277:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1281:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalFire.g:1282:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0"


    // $ANTLR start "rule__TerminalExpression__Group_5__0__Impl"
    // InternalFire.g:1289:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1293:1: ( ( () ) )
            // InternalFire.g:1294:1: ( () )
            {
            // InternalFire.g:1294:1: ( () )
            // InternalFire.g:1295:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0()); 
            }
            // InternalFire.g:1296:2: ()
            // InternalFire.g:1296:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__1"
    // InternalFire.g:1304:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1308:1: ( rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 )
            // InternalFire.g:1309:2: rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1"


    // $ANTLR start "rule__TerminalExpression__Group_5__1__Impl"
    // InternalFire.g:1316:1: rule__TerminalExpression__Group_5__1__Impl : ( '-' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1320:1: ( ( '-' ) )
            // InternalFire.g:1321:1: ( '-' )
            {
            // InternalFire.g:1321:1: ( '-' )
            // InternalFire.g:1322:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__2"
    // InternalFire.g:1331:1: rule__TerminalExpression__Group_5__2 : rule__TerminalExpression__Group_5__2__Impl ;
    public final void rule__TerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1335:1: ( rule__TerminalExpression__Group_5__2__Impl )
            // InternalFire.g:1336:2: rule__TerminalExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__2"


    // $ANTLR start "rule__TerminalExpression__Group_5__2__Impl"
    // InternalFire.g:1342:1: rule__TerminalExpression__Group_5__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) ;
    public final void rule__TerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1346:1: ( ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) )
            // InternalFire.g:1347:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            {
            // InternalFire.g:1347:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            // InternalFire.g:1348:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 
            }
            // InternalFire.g:1349:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            // InternalFire.g:1349:3: rule__TerminalExpression__OperandAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__OperandAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__0"
    // InternalFire.g:1358:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1362:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalFire.g:1363:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0"


    // $ANTLR start "rule__TerminalExpression__Group_6__0__Impl"
    // InternalFire.g:1370:1: rule__TerminalExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1374:1: ( ( '(' ) )
            // InternalFire.g:1375:1: ( '(' )
            {
            // InternalFire.g:1375:1: ( '(' )
            // InternalFire.g:1376:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__1"
    // InternalFire.g:1385:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1389:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // InternalFire.g:1390:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__TerminalExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1"


    // $ANTLR start "rule__TerminalExpression__Group_6__1__Impl"
    // InternalFire.g:1397:1: rule__TerminalExpression__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1401:1: ( ( ruleExpression ) )
            // InternalFire.g:1402:1: ( ruleExpression )
            {
            // InternalFire.g:1402:1: ( ruleExpression )
            // InternalFire.g:1403:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__2"
    // InternalFire.g:1412:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1416:1: ( rule__TerminalExpression__Group_6__2__Impl )
            // InternalFire.g:1417:2: rule__TerminalExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__2"


    // $ANTLR start "rule__TerminalExpression__Group_6__2__Impl"
    // InternalFire.g:1423:1: rule__TerminalExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1427:1: ( ( ')' ) )
            // InternalFire.g:1428:1: ( ')' )
            {
            // InternalFire.g:1428:1: ( ')' )
            // InternalFire.g:1429:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__2__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalFire.g:1439:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1443:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalFire.g:1444:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalFire.g:1451:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1455:1: ( ( RULE_INT ) )
            // InternalFire.g:1456:1: ( RULE_INT )
            {
            // InternalFire.g:1456:1: ( RULE_INT )
            // InternalFire.g:1457:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalFire.g:1466:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1470:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalFire.g:1471:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalFire.g:1478:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1482:1: ( ( '.' ) )
            // InternalFire.g:1483:1: ( '.' )
            {
            // InternalFire.g:1483:1: ( '.' )
            // InternalFire.g:1484:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalFire.g:1493:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1497:1: ( rule__Double__Group__2__Impl )
            // InternalFire.g:1498:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalFire.g:1504:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1508:1: ( ( RULE_INT ) )
            // InternalFire.g:1509:1: ( RULE_INT )
            {
            // InternalFire.g:1509:1: ( RULE_INT )
            // InternalFire.g:1510:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment_2"
    // InternalFire.g:1520:1: rule__Program__StatementsAssignment_2 : ( ruleWritelnStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1524:1: ( ( ruleWritelnStatement ) )
            // InternalFire.g:1525:2: ( ruleWritelnStatement )
            {
            // InternalFire.g:1525:2: ( ruleWritelnStatement )
            // InternalFire.g:1526:3: ruleWritelnStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWritelnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment_2"


    // $ANTLR start "rule__WritelnStatement__ArgumentAssignment_2"
    // InternalFire.g:1535:1: rule__WritelnStatement__ArgumentAssignment_2 : ( ruleExpression ) ;
    public final void rule__WritelnStatement__ArgumentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1539:1: ( ( ruleExpression ) )
            // InternalFire.g:1540:2: ( ruleExpression )
            {
            // InternalFire.g:1540:2: ( ruleExpression )
            // InternalFire.g:1541:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WritelnStatement__ArgumentAssignment_2"


    // $ANTLR start "rule__Expression__OperatorAssignment_1_0_0_1"
    // InternalFire.g:1550:1: rule__Expression__OperatorAssignment_1_0_0_1 : ( ruleAdditiveOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1554:1: ( ( ruleAdditiveOperator ) )
            // InternalFire.g:1555:2: ( ruleAdditiveOperator )
            {
            // InternalFire.g:1555:2: ( ruleAdditiveOperator )
            // InternalFire.g:1556:3: ruleAdditiveOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalFire.g:1565:1: rule__Expression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1569:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:1570:2: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:1570:2: ( ruleMultiplicativeExpression )
            // InternalFire.g:1571:3: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1"
    // InternalFire.g:1580:1: rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1584:1: ( ( ruleMultiplicativeOperator ) )
            // InternalFire.g:1585:2: ( ruleMultiplicativeOperator )
            {
            // InternalFire.g:1585:2: ( ruleMultiplicativeOperator )
            // InternalFire.g:1586:3: ruleMultiplicativeOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightAssignment_1_1"
    // InternalFire.g:1595:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1599:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1600:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:1600:2: ( ruleTerminalExpression )
            // InternalFire.g:1601:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__RightAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalFire.g:1610:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1614:1: ( ( RULE_STRING ) )
            // InternalFire.g:1615:2: ( RULE_STRING )
            {
            // InternalFire.g:1615:2: ( RULE_STRING )
            // InternalFire.g:1616:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1_0"
    // InternalFire.g:1625:1: rule__TerminalExpression__ValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1629:1: ( ( ( 'true' ) ) )
            // InternalFire.g:1630:2: ( ( 'true' ) )
            {
            // InternalFire.g:1630:2: ( ( 'true' ) )
            // InternalFire.g:1631:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            }
            // InternalFire.g:1632:3: ( 'true' )
            // InternalFire.g:1633:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1_0"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalFire.g:1644:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ruleLong ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1648:1: ( ( ruleLong ) )
            // InternalFire.g:1649:2: ( ruleLong )
            {
            // InternalFire.g:1649:2: ( ruleLong )
            // InternalFire.g:1650:3: ruleLong
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_3_1"
    // InternalFire.g:1659:1: rule__TerminalExpression__ValueAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1663:1: ( ( ruleDouble ) )
            // InternalFire.g:1664:2: ( ruleDouble )
            {
            // InternalFire.g:1664:2: ( ruleDouble )
            // InternalFire.g:1665:3: ruleDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__TerminalExpression__OperandAssignment_4_2"
    // InternalFire.g:1674:1: rule__TerminalExpression__OperandAssignment_4_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1678:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1679:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:1679:2: ( ruleTerminalExpression )
            // InternalFire.g:1680:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__OperandAssignment_4_2"


    // $ANTLR start "rule__TerminalExpression__OperandAssignment_5_2"
    // InternalFire.g:1689:1: rule__TerminalExpression__OperandAssignment_5_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1693:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1694:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:1694:2: ( ruleTerminalExpression )
            // InternalFire.g:1695:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__OperandAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002A02830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}