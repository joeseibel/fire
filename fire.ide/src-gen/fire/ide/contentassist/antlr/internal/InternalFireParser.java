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

@SuppressWarnings("all")
public class InternalFireParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'program'", "'end'", "'writeln'", "'('", "')'", "'not'", "'.'", "'true'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // InternalFire.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalFire.g:54:1: ( ruleProgram EOF )
            // InternalFire.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalFire.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalFire.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalFire.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalFire.g:69:3: ( rule__Program__Group__0 )
            // InternalFire.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // InternalFire.g:78:1: entryRuleWritelnStatement : ruleWritelnStatement EOF ;
    public final void entryRuleWritelnStatement() throws RecognitionException {
        try {
            // InternalFire.g:79:1: ( ruleWritelnStatement EOF )
            // InternalFire.g:80:1: ruleWritelnStatement EOF
            {
             before(grammarAccess.getWritelnStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWritelnStatement();

            state._fsp--;

             after(grammarAccess.getWritelnStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:87:1: ruleWritelnStatement : ( ( rule__WritelnStatement__Group__0 ) ) ;
    public final void ruleWritelnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:91:2: ( ( ( rule__WritelnStatement__Group__0 ) ) )
            // InternalFire.g:92:2: ( ( rule__WritelnStatement__Group__0 ) )
            {
            // InternalFire.g:92:2: ( ( rule__WritelnStatement__Group__0 ) )
            // InternalFire.g:93:3: ( rule__WritelnStatement__Group__0 )
            {
             before(grammarAccess.getWritelnStatementAccess().getGroup()); 
            // InternalFire.g:94:3: ( rule__WritelnStatement__Group__0 )
            // InternalFire.g:94:4: rule__WritelnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWritelnStatementAccess().getGroup()); 

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
    // InternalFire.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFire.g:104:1: ( ruleExpression EOF )
            // InternalFire.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:112:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:116:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalFire.g:117:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalFire.g:117:2: ( ( rule__Expression__Group__0 ) )
            // InternalFire.g:118:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalFire.g:119:3: ( rule__Expression__Group__0 )
            // InternalFire.g:119:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalFire.g:128:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalFire.g:129:1: ( ruleComparisonExpression EOF )
            // InternalFire.g:130:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalFire.g:137:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:141:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalFire.g:142:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalFire.g:142:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalFire.g:143:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalFire.g:144:3: ( rule__ComparisonExpression__Group__0 )
            // InternalFire.g:144:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalFire.g:153:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalFire.g:154:1: ( ruleAdditiveExpression EOF )
            // InternalFire.g:155:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalFire.g:162:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:166:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalFire.g:167:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalFire.g:167:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalFire.g:168:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalFire.g:169:3: ( rule__AdditiveExpression__Group__0 )
            // InternalFire.g:169:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalFire.g:178:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalFire.g:179:1: ( ruleMultiplicativeExpression EOF )
            // InternalFire.g:180:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:187:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:191:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalFire.g:192:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalFire.g:192:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalFire.g:193:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalFire.g:194:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalFire.g:194:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

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
    // InternalFire.g:203:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalFire.g:204:1: ( ruleTerminalExpression EOF )
            // InternalFire.g:205:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:212:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:216:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalFire.g:217:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalFire.g:217:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalFire.g:218:3: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // InternalFire.g:219:3: ( rule__TerminalExpression__Alternatives )
            // InternalFire.g:219:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

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
    // InternalFire.g:228:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // InternalFire.g:229:1: ( ruleLong EOF )
            // InternalFire.g:230:1: ruleLong EOF
            {
             before(grammarAccess.getLongRule()); 
            pushFollow(FOLLOW_1);
            ruleLong();

            state._fsp--;

             after(grammarAccess.getLongRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:237:1: ruleLong : ( RULE_INT ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:241:2: ( ( RULE_INT ) )
            // InternalFire.g:242:2: ( RULE_INT )
            {
            // InternalFire.g:242:2: ( RULE_INT )
            // InternalFire.g:243:3: RULE_INT
            {
             before(grammarAccess.getLongAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLongAccess().getINTTerminalRuleCall()); 

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
    // InternalFire.g:253:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalFire.g:254:1: ( ruleDouble EOF )
            // InternalFire.g:255:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFire.g:262:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:266:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalFire.g:267:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalFire.g:267:2: ( ( rule__Double__Group__0 ) )
            // InternalFire.g:268:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalFire.g:269:3: ( rule__Double__Group__0 )
            // InternalFire.g:269:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

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


    // $ANTLR start "ruleEqualityOperator"
    // InternalFire.g:278:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:282:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalFire.g:283:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalFire.g:283:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalFire.g:284:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalFire.g:285:3: ( rule__EqualityOperator__Alternatives )
            // InternalFire.g:285:4: rule__EqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EqualityOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFire.g:294:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:298:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalFire.g:299:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalFire.g:299:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalFire.g:300:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalFire.g:301:3: ( rule__ComparisonOperator__Alternatives )
            // InternalFire.g:301:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalFire.g:310:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:314:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalFire.g:315:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalFire.g:315:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalFire.g:316:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalFire.g:317:3: ( rule__AdditiveOperator__Alternatives )
            // InternalFire.g:317:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

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
    // InternalFire.g:326:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:330:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalFire.g:331:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalFire.g:331:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalFire.g:332:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalFire.g:333:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalFire.g:333:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

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
    // InternalFire.g:341:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:345:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case 11:
            case 31:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==EOF||(LA1_3>=12 && LA1_3<=23)||LA1_3==28) ) {
                    alt1=3;
                }
                else if ( (LA1_3==30) ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt1=5;
                }
                break;
            case 19:
                {
                alt1=6;
                }
                break;
            case 27:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFire.g:346:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalFire.g:346:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalFire.g:347:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalFire.g:348:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalFire.g:348:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:352:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalFire.g:352:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalFire.g:353:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalFire.g:354:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalFire.g:354:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:358:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalFire.g:358:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalFire.g:359:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // InternalFire.g:360:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalFire.g:360:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:364:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalFire.g:364:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalFire.g:365:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // InternalFire.g:366:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalFire.g:366:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFire.g:370:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalFire.g:370:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalFire.g:371:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // InternalFire.g:372:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalFire.g:372:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFire.g:376:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalFire.g:376:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalFire.g:377:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    // InternalFire.g:378:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalFire.g:378:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFire.g:382:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalFire.g:382:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalFire.g:383:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    // InternalFire.g:384:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalFire.g:384:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 

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
    // InternalFire.g:392:1: rule__TerminalExpression__Alternatives_1_1 : ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__TerminalExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:396:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFire.g:397:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    {
                    // InternalFire.g:397:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    // InternalFire.g:398:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0()); 
                    // InternalFire.g:399:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    // InternalFire.g:399:4: rule__TerminalExpression__ValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__ValueAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:403:2: ( 'false' )
                    {
                    // InternalFire.g:403:2: ( 'false' )
                    // InternalFire.g:404:3: 'false'
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTerminalExpressionAccess().getFalseKeyword_1_1_1()); 

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


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // InternalFire.g:413:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:417:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFire.g:418:2: ( ( '=' ) )
                    {
                    // InternalFire.g:418:2: ( ( '=' ) )
                    // InternalFire.g:419:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:420:3: ( '=' )
                    // InternalFire.g:420:4: '='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:424:2: ( ( '<>' ) )
                    {
                    // InternalFire.g:424:2: ( ( '<>' ) )
                    // InternalFire.g:425:3: ( '<>' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalFire.g:426:3: ( '<>' )
                    // InternalFire.g:426:4: '<>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EqualityOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalFire.g:434:1: rule__ComparisonOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:438:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFire.g:439:2: ( ( '<' ) )
                    {
                    // InternalFire.g:439:2: ( ( '<' ) )
                    // InternalFire.g:440:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:441:3: ( '<' )
                    // InternalFire.g:441:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:445:2: ( ( '<=' ) )
                    {
                    // InternalFire.g:445:2: ( ( '<=' ) )
                    // InternalFire.g:446:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalFire.g:447:3: ( '<=' )
                    // InternalFire.g:447:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:451:2: ( ( '>' ) )
                    {
                    // InternalFire.g:451:2: ( ( '>' ) )
                    // InternalFire.g:452:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    // InternalFire.g:453:3: ( '>' )
                    // InternalFire.g:453:4: '>'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:457:2: ( ( '>=' ) )
                    {
                    // InternalFire.g:457:2: ( ( '>=' ) )
                    // InternalFire.g:458:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3()); 
                    // InternalFire.g:459:3: ( '>=' )
                    // InternalFire.g:459:4: '>='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalFire.g:467:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:471:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFire.g:472:2: ( ( '+' ) )
                    {
                    // InternalFire.g:472:2: ( ( '+' ) )
                    // InternalFire.g:473:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalFire.g:474:3: ( '+' )
                    // InternalFire.g:474:4: '+'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:478:2: ( ( '-' ) )
                    {
                    // InternalFire.g:478:2: ( ( '-' ) )
                    // InternalFire.g:479:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalFire.g:480:3: ( '-' )
                    // InternalFire.g:480:4: '-'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 

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
    // InternalFire.g:488:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:492:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFire.g:493:2: ( ( '*' ) )
                    {
                    // InternalFire.g:493:2: ( ( '*' ) )
                    // InternalFire.g:494:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalFire.g:495:3: ( '*' )
                    // InternalFire.g:495:4: '*'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:499:2: ( ( '/' ) )
                    {
                    // InternalFire.g:499:2: ( ( '/' ) )
                    // InternalFire.g:500:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 
                    // InternalFire.g:501:3: ( '/' )
                    // InternalFire.g:501:4: '/'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:505:2: ( ( 'div' ) )
                    {
                    // InternalFire.g:505:2: ( ( 'div' ) )
                    // InternalFire.g:506:3: ( 'div' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 
                    // InternalFire.g:507:3: ( 'div' )
                    // InternalFire.g:507:4: 'div'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:511:2: ( ( 'mod' ) )
                    {
                    // InternalFire.g:511:2: ( ( 'mod' ) )
                    // InternalFire.g:512:3: ( 'mod' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 
                    // InternalFire.g:513:3: ( 'mod' )
                    // InternalFire.g:513:4: 'mod'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 

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
    // InternalFire.g:521:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:525:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFire.g:526:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


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
    // InternalFire.g:533:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:537:1: ( ( () ) )
            // InternalFire.g:538:1: ( () )
            {
            // InternalFire.g:538:1: ( () )
            // InternalFire.g:539:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalFire.g:540:2: ()
            // InternalFire.g:540:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

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
    // InternalFire.g:548:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:552:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalFire.g:553:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


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
    // InternalFire.g:560:1: rule__Program__Group__1__Impl : ( 'program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:564:1: ( ( 'program' ) )
            // InternalFire.g:565:1: ( 'program' )
            {
            // InternalFire.g:565:1: ( 'program' )
            // InternalFire.g:566:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_1()); 

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
    // InternalFire.g:575:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:579:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalFire.g:580:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


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
    // InternalFire.g:587:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:591:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalFire.g:592:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalFire.g:592:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalFire.g:593:2: ( rule__Program__StatementsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            // InternalFire.g:594:2: ( rule__Program__StatementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFire.g:594:3: rule__Program__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 

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
    // InternalFire.g:602:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:606:1: ( rule__Program__Group__3__Impl )
            // InternalFire.g:607:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

            state._fsp--;


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
    // InternalFire.g:613:1: rule__Program__Group__3__Impl : ( 'end' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:617:1: ( ( 'end' ) )
            // InternalFire.g:618:1: ( 'end' )
            {
            // InternalFire.g:618:1: ( 'end' )
            // InternalFire.g:619:2: 'end'
            {
             before(grammarAccess.getProgramAccess().getEndKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getEndKeyword_3()); 

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
    // InternalFire.g:629:1: rule__WritelnStatement__Group__0 : rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1 ;
    public final void rule__WritelnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:633:1: ( rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1 )
            // InternalFire.g:634:2: rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WritelnStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__1();

            state._fsp--;


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
    // InternalFire.g:641:1: rule__WritelnStatement__Group__0__Impl : ( 'writeln' ) ;
    public final void rule__WritelnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:645:1: ( ( 'writeln' ) )
            // InternalFire.g:646:1: ( 'writeln' )
            {
            // InternalFire.g:646:1: ( 'writeln' )
            // InternalFire.g:647:2: 'writeln'
            {
             before(grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWritelnStatementAccess().getWritelnKeyword_0()); 

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
    // InternalFire.g:656:1: rule__WritelnStatement__Group__1 : rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2 ;
    public final void rule__WritelnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:660:1: ( rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2 )
            // InternalFire.g:661:2: rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WritelnStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__2();

            state._fsp--;


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
    // InternalFire.g:668:1: rule__WritelnStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WritelnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:672:1: ( ( '(' ) )
            // InternalFire.g:673:1: ( '(' )
            {
            // InternalFire.g:673:1: ( '(' )
            // InternalFire.g:674:2: '('
            {
             before(grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWritelnStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalFire.g:683:1: rule__WritelnStatement__Group__2 : rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3 ;
    public final void rule__WritelnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:687:1: ( rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3 )
            // InternalFire.g:688:2: rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__WritelnStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__3();

            state._fsp--;


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
    // InternalFire.g:695:1: rule__WritelnStatement__Group__2__Impl : ( ( rule__WritelnStatement__ArgumentAssignment_2 ) ) ;
    public final void rule__WritelnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:699:1: ( ( ( rule__WritelnStatement__ArgumentAssignment_2 ) ) )
            // InternalFire.g:700:1: ( ( rule__WritelnStatement__ArgumentAssignment_2 ) )
            {
            // InternalFire.g:700:1: ( ( rule__WritelnStatement__ArgumentAssignment_2 ) )
            // InternalFire.g:701:2: ( rule__WritelnStatement__ArgumentAssignment_2 )
            {
             before(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); 
            // InternalFire.g:702:2: ( rule__WritelnStatement__ArgumentAssignment_2 )
            // InternalFire.g:702:3: rule__WritelnStatement__ArgumentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__ArgumentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); 

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
    // InternalFire.g:710:1: rule__WritelnStatement__Group__3 : rule__WritelnStatement__Group__3__Impl ;
    public final void rule__WritelnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:714:1: ( rule__WritelnStatement__Group__3__Impl )
            // InternalFire.g:715:2: rule__WritelnStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WritelnStatement__Group__3__Impl();

            state._fsp--;


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
    // InternalFire.g:721:1: rule__WritelnStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WritelnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:725:1: ( ( ')' ) )
            // InternalFire.g:726:1: ( ')' )
            {
            // InternalFire.g:726:1: ( ')' )
            // InternalFire.g:727:2: ')'
            {
             before(grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWritelnStatementAccess().getRightParenthesisKeyword_3()); 

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
    // InternalFire.g:737:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:741:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalFire.g:742:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


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
    // InternalFire.g:749:1: rule__Expression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:753:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:754:1: ( ruleComparisonExpression )
            {
            // InternalFire.g:754:1: ( ruleComparisonExpression )
            // InternalFire.g:755:2: ruleComparisonExpression
            {
             before(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

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
    // InternalFire.g:764:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:768:1: ( rule__Expression__Group__1__Impl )
            // InternalFire.g:769:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


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
    // InternalFire.g:775:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:779:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalFire.g:780:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalFire.g:780:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalFire.g:781:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalFire.g:782:2: ( rule__Expression__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=12 && LA8_0<=13)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFire.g:782:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // InternalFire.g:791:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:795:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFire.g:796:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


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
    // InternalFire.g:803:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:807:1: ( ( () ) )
            // InternalFire.g:808:1: ( () )
            {
            // InternalFire.g:808:1: ( () )
            // InternalFire.g:809:2: ()
            {
             before(grammarAccess.getExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // InternalFire.g:810:2: ()
            // InternalFire.g:810:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getEqualityExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalFire.g:818:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:822:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalFire.g:823:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


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
    // InternalFire.g:830:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:834:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:835:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:835:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // InternalFire.g:836:2: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:837:2: ( rule__Expression__OperatorAssignment_1_1 )
            // InternalFire.g:837:3: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 

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


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalFire.g:845:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:849:1: ( rule__Expression__Group_1__2__Impl )
            // InternalFire.g:850:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalFire.g:856:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:860:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalFire.g:861:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:861:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalFire.g:862:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:863:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalFire.g:863:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalFire.g:872:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:876:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalFire.g:877:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalFire.g:884:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:888:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:889:1: ( ruleAdditiveExpression )
            {
            // InternalFire.g:889:1: ( ruleAdditiveExpression )
            // InternalFire.g:890:2: ruleAdditiveExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalFire.g:899:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:903:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalFire.g:904:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalFire.g:910:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:914:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalFire.g:915:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalFire.g:915:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalFire.g:916:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalFire.g:917:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=17)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:917:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalFire.g:926:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:930:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalFire.g:931:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalFire.g:938:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:942:1: ( ( () ) )
            // InternalFire.g:943:1: ( () )
            {
            // InternalFire.g:943:1: ( () )
            // InternalFire.g:944:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalFire.g:945:2: ()
            // InternalFire.g:945:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalFire.g:953:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:957:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalFire.g:958:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalFire.g:965:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:969:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:970:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:970:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:971:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:972:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalFire.g:972:3: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalFire.g:980:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:984:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalFire.g:985:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalFire.g:991:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:995:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:996:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:996:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalFire.g:997:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:998:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalFire.g:998:3: rule__ComparisonExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalFire.g:1007:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1011:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalFire.g:1012:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalFire.g:1019:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1023:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:1024:1: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:1024:1: ( ruleMultiplicativeExpression )
            // InternalFire.g:1025:2: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalFire.g:1034:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1038:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalFire.g:1039:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalFire.g:1045:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1049:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalFire.g:1050:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalFire.g:1050:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalFire.g:1051:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalFire.g:1052:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFire.g:1052:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalFire.g:1061:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1065:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalFire.g:1066:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalFire.g:1073:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1077:1: ( ( () ) )
            // InternalFire.g:1078:1: ( () )
            {
            // InternalFire.g:1078:1: ( () )
            // InternalFire.g:1079:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0()); 
            // InternalFire.g:1080:2: ()
            // InternalFire.g:1080:3: 
            {
            }

             after(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalFire.g:1088:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1092:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalFire.g:1093:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalFire.g:1100:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1104:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1105:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1105:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1106:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1107:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1107:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalFire.g:1115:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1119:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalFire.g:1120:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalFire.g:1126:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1130:1: ( ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1131:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1131:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1132:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1133:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            // InternalFire.g:1133:3: rule__AdditiveExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalFire.g:1142:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1146:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalFire.g:1147:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


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
    // InternalFire.g:1154:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1158:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1159:1: ( ruleTerminalExpression )
            {
            // InternalFire.g:1159:1: ( ruleTerminalExpression )
            // InternalFire.g:1160:2: ruleTerminalExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getTerminalExpressionParserRuleCall_0()); 

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
    // InternalFire.g:1169:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1173:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalFire.g:1174:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;


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
    // InternalFire.g:1180:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1184:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalFire.g:1185:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalFire.g:1185:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalFire.g:1186:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalFire.g:1187:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=20 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFire.g:1187:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

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
    // InternalFire.g:1196:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1200:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalFire.g:1201:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;


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
    // InternalFire.g:1208:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1212:1: ( ( () ) )
            // InternalFire.g:1213:1: ( () )
            {
            // InternalFire.g:1213:1: ( () )
            // InternalFire.g:1214:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0()); 
            // InternalFire.g:1215:2: ()
            // InternalFire.g:1215:3: 
            {
            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalFire.g:1223:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1227:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalFire.g:1228:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

            state._fsp--;


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
    // InternalFire.g:1235:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1239:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1240:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1240:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1241:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1242:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1242:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 

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


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalFire.g:1250:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1254:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalFire.g:1255:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalFire.g:1261:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1265:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1266:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1266:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1267:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1268:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            // InternalFire.g:1268:3: rule__MultiplicativeExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalFire.g:1277:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1281:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalFire.g:1282:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;


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
    // InternalFire.g:1289:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1293:1: ( ( () ) )
            // InternalFire.g:1294:1: ( () )
            {
            // InternalFire.g:1294:1: ( () )
            // InternalFire.g:1295:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0()); 
            // InternalFire.g:1296:2: ()
            // InternalFire.g:1296:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0()); 

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
    // InternalFire.g:1304:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1308:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalFire.g:1309:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;


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
    // InternalFire.g:1315:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1319:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalFire.g:1320:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalFire.g:1320:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalFire.g:1321:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // InternalFire.g:1322:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalFire.g:1322:3: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 

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
    // InternalFire.g:1331:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1335:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalFire.g:1336:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;


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
    // InternalFire.g:1343:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1347:1: ( ( () ) )
            // InternalFire.g:1348:1: ( () )
            {
            // InternalFire.g:1348:1: ( () )
            // InternalFire.g:1349:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalFire.g:1350:2: ()
            // InternalFire.g:1350:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 

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
    // InternalFire.g:1358:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1362:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalFire.g:1363:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;


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
    // InternalFire.g:1369:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__Alternatives_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1373:1: ( ( ( rule__TerminalExpression__Alternatives_1_1 ) ) )
            // InternalFire.g:1374:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            {
            // InternalFire.g:1374:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            // InternalFire.g:1375:2: ( rule__TerminalExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1()); 
            // InternalFire.g:1376:2: ( rule__TerminalExpression__Alternatives_1_1 )
            // InternalFire.g:1376:3: rule__TerminalExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1()); 

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
    // InternalFire.g:1385:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1389:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalFire.g:1390:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;


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
    // InternalFire.g:1397:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1401:1: ( ( () ) )
            // InternalFire.g:1402:1: ( () )
            {
            // InternalFire.g:1402:1: ( () )
            // InternalFire.g:1403:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalFire.g:1404:2: ()
            // InternalFire.g:1404:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0()); 

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
    // InternalFire.g:1412:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1416:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalFire.g:1417:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;


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
    // InternalFire.g:1423:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1427:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalFire.g:1428:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalFire.g:1428:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalFire.g:1429:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // InternalFire.g:1430:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalFire.g:1430:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 

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
    // InternalFire.g:1439:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1443:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalFire.g:1444:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

            state._fsp--;


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
    // InternalFire.g:1451:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1455:1: ( ( () ) )
            // InternalFire.g:1456:1: ( () )
            {
            // InternalFire.g:1456:1: ( () )
            // InternalFire.g:1457:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0()); 
            // InternalFire.g:1458:2: ()
            // InternalFire.g:1458:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0()); 

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
    // InternalFire.g:1466:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1470:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalFire.g:1471:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;


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
    // InternalFire.g:1477:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1481:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalFire.g:1482:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalFire.g:1482:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalFire.g:1483:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // InternalFire.g:1484:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalFire.g:1484:3: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 

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
    // InternalFire.g:1493:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1497:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalFire.g:1498:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

            state._fsp--;


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
    // InternalFire.g:1505:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1509:1: ( ( () ) )
            // InternalFire.g:1510:1: ( () )
            {
            // InternalFire.g:1510:1: ( () )
            // InternalFire.g:1511:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0()); 
            // InternalFire.g:1512:2: ()
            // InternalFire.g:1512:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0()); 

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
    // InternalFire.g:1520:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1524:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // InternalFire.g:1525:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__2();

            state._fsp--;


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
    // InternalFire.g:1532:1: rule__TerminalExpression__Group_4__1__Impl : ( 'not' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1536:1: ( ( 'not' ) )
            // InternalFire.g:1537:1: ( 'not' )
            {
            // InternalFire.g:1537:1: ( 'not' )
            // InternalFire.g:1538:2: 'not'
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1()); 

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
    // InternalFire.g:1547:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1551:1: ( rule__TerminalExpression__Group_4__2__Impl )
            // InternalFire.g:1552:2: rule__TerminalExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__2__Impl();

            state._fsp--;


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
    // InternalFire.g:1558:1: rule__TerminalExpression__Group_4__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1562:1: ( ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) )
            // InternalFire.g:1563:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            {
            // InternalFire.g:1563:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            // InternalFire.g:1564:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2()); 
            // InternalFire.g:1565:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            // InternalFire.g:1565:3: rule__TerminalExpression__OperandAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__OperandAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2()); 

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
    // InternalFire.g:1574:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1578:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalFire.g:1579:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

            state._fsp--;


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
    // InternalFire.g:1586:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1590:1: ( ( () ) )
            // InternalFire.g:1591:1: ( () )
            {
            // InternalFire.g:1591:1: ( () )
            // InternalFire.g:1592:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0()); 
            // InternalFire.g:1593:2: ()
            // InternalFire.g:1593:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0()); 

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
    // InternalFire.g:1601:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1605:1: ( rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 )
            // InternalFire.g:1606:2: rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__2();

            state._fsp--;


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
    // InternalFire.g:1613:1: rule__TerminalExpression__Group_5__1__Impl : ( '-' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1617:1: ( ( '-' ) )
            // InternalFire.g:1618:1: ( '-' )
            {
            // InternalFire.g:1618:1: ( '-' )
            // InternalFire.g:1619:2: '-'
            {
             before(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1()); 

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
    // InternalFire.g:1628:1: rule__TerminalExpression__Group_5__2 : rule__TerminalExpression__Group_5__2__Impl ;
    public final void rule__TerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1632:1: ( rule__TerminalExpression__Group_5__2__Impl )
            // InternalFire.g:1633:2: rule__TerminalExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__2__Impl();

            state._fsp--;


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
    // InternalFire.g:1639:1: rule__TerminalExpression__Group_5__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) ;
    public final void rule__TerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1643:1: ( ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) )
            // InternalFire.g:1644:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            {
            // InternalFire.g:1644:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            // InternalFire.g:1645:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 
            // InternalFire.g:1646:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            // InternalFire.g:1646:3: rule__TerminalExpression__OperandAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__OperandAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 

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
    // InternalFire.g:1655:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1659:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalFire.g:1660:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1();

            state._fsp--;


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
    // InternalFire.g:1667:1: rule__TerminalExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1671:1: ( ( '(' ) )
            // InternalFire.g:1672:1: ( '(' )
            {
            // InternalFire.g:1672:1: ( '(' )
            // InternalFire.g:1673:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0()); 

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
    // InternalFire.g:1682:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1686:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // InternalFire.g:1687:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__TerminalExpression__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__2();

            state._fsp--;


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
    // InternalFire.g:1694:1: rule__TerminalExpression__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1698:1: ( ( ruleExpression ) )
            // InternalFire.g:1699:1: ( ruleExpression )
            {
            // InternalFire.g:1699:1: ( ruleExpression )
            // InternalFire.g:1700:2: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_6_1()); 

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
    // InternalFire.g:1709:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1713:1: ( rule__TerminalExpression__Group_6__2__Impl )
            // InternalFire.g:1714:2: rule__TerminalExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__2__Impl();

            state._fsp--;


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
    // InternalFire.g:1720:1: rule__TerminalExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1724:1: ( ( ')' ) )
            // InternalFire.g:1725:1: ( ')' )
            {
            // InternalFire.g:1725:1: ( ')' )
            // InternalFire.g:1726:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2()); 

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
    // InternalFire.g:1736:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1740:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalFire.g:1741:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;


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
    // InternalFire.g:1748:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1752:1: ( ( RULE_INT ) )
            // InternalFire.g:1753:1: ( RULE_INT )
            {
            // InternalFire.g:1753:1: ( RULE_INT )
            // InternalFire.g:1754:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

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
    // InternalFire.g:1763:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1767:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalFire.g:1768:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;


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
    // InternalFire.g:1775:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1779:1: ( ( '.' ) )
            // InternalFire.g:1780:1: ( '.' )
            {
            // InternalFire.g:1780:1: ( '.' )
            // InternalFire.g:1781:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 

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
    // InternalFire.g:1790:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1794:1: ( rule__Double__Group__2__Impl )
            // InternalFire.g:1795:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;


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
    // InternalFire.g:1801:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1805:1: ( ( RULE_INT ) )
            // InternalFire.g:1806:1: ( RULE_INT )
            {
            // InternalFire.g:1806:1: ( RULE_INT )
            // InternalFire.g:1807:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 

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
    // InternalFire.g:1817:1: rule__Program__StatementsAssignment_2 : ( ruleWritelnStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1821:1: ( ( ruleWritelnStatement ) )
            // InternalFire.g:1822:2: ( ruleWritelnStatement )
            {
            // InternalFire.g:1822:2: ( ruleWritelnStatement )
            // InternalFire.g:1823:3: ruleWritelnStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWritelnStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsWritelnStatementParserRuleCall_2_0()); 

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
    // InternalFire.g:1832:1: rule__WritelnStatement__ArgumentAssignment_2 : ( ruleExpression ) ;
    public final void rule__WritelnStatement__ArgumentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1836:1: ( ( ruleExpression ) )
            // InternalFire.g:1837:2: ( ruleExpression )
            {
            // InternalFire.g:1837:2: ( ruleExpression )
            // InternalFire.g:1838:3: ruleExpression
            {
             before(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // InternalFire.g:1847:1: rule__Expression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1851:1: ( ( ruleEqualityOperator ) )
            // InternalFire.g:1852:2: ( ruleEqualityOperator )
            {
            // InternalFire.g:1852:2: ( ruleEqualityOperator )
            // InternalFire.g:1853:3: ruleEqualityOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__OperatorAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalFire.g:1862:1: rule__Expression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1866:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:1867:2: ( ruleComparisonExpression )
            {
            // InternalFire.g:1867:2: ( ruleComparisonExpression )
            // InternalFire.g:1868:3: ruleComparisonExpression
            {
             before(grammarAccess.getExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalFire.g:1877:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1881:1: ( ( ruleComparisonOperator ) )
            // InternalFire.g:1882:2: ( ruleComparisonOperator )
            {
            // InternalFire.g:1882:2: ( ruleComparisonOperator )
            // InternalFire.g:1883:3: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_2"
    // InternalFire.g:1892:1: rule__ComparisonExpression__RightAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1896:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:1897:2: ( ruleAdditiveExpression )
            {
            // InternalFire.g:1897:2: ( ruleAdditiveExpression )
            // InternalFire.g:1898:3: ruleAdditiveExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalFire.g:1907:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1911:1: ( ( ruleAdditiveOperator ) )
            // InternalFire.g:1912:2: ( ruleAdditiveOperator )
            {
            // InternalFire.g:1912:2: ( ruleAdditiveOperator )
            // InternalFire.g:1913:3: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__RightAssignment_1_2"
    // InternalFire.g:1922:1: rule__AdditiveExpression__RightAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1926:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:1927:2: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:1927:2: ( ruleMultiplicativeExpression )
            // InternalFire.g:1928:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AdditiveExpression__RightAssignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalFire.g:1937:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1941:1: ( ( ruleMultiplicativeOperator ) )
            // InternalFire.g:1942:2: ( ruleMultiplicativeOperator )
            {
            // InternalFire.g:1942:2: ( ruleMultiplicativeOperator )
            // InternalFire.g:1943:3: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightAssignment_1_2"
    // InternalFire.g:1952:1: rule__MultiplicativeExpression__RightAssignment_1_2 : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1956:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1957:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:1957:2: ( ruleTerminalExpression )
            // InternalFire.g:1958:3: ruleTerminalExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MultiplicativeExpression__RightAssignment_1_2"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalFire.g:1967:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1971:1: ( ( RULE_STRING ) )
            // InternalFire.g:1972:2: ( RULE_STRING )
            {
            // InternalFire.g:1972:2: ( RULE_STRING )
            // InternalFire.g:1973:3: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

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
    // InternalFire.g:1982:1: rule__TerminalExpression__ValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1986:1: ( ( ( 'true' ) ) )
            // InternalFire.g:1987:2: ( ( 'true' ) )
            {
            // InternalFire.g:1987:2: ( ( 'true' ) )
            // InternalFire.g:1988:3: ( 'true' )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            // InternalFire.g:1989:3: ( 'true' )
            // InternalFire.g:1990:4: 'true'
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 

            }

             after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 

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
    // InternalFire.g:2001:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ruleLong ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2005:1: ( ( ruleLong ) )
            // InternalFire.g:2006:2: ( ruleLong )
            {
            // InternalFire.g:2006:2: ( ruleLong )
            // InternalFire.g:2007:3: ruleLong
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLong();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_2_1_0()); 

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
    // InternalFire.g:2016:1: rule__TerminalExpression__ValueAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2020:1: ( ( ruleDouble ) )
            // InternalFire.g:2021:2: ( ruleDouble )
            {
            // InternalFire.g:2021:2: ( ruleDouble )
            // InternalFire.g:2022:3: ruleDouble
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_3_1_0()); 

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
    // InternalFire.g:2031:1: rule__TerminalExpression__OperandAssignment_4_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2035:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2036:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2036:2: ( ruleTerminalExpression )
            // InternalFire.g:2037:3: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_4_2_0()); 

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
    // InternalFire.g:2046:1: rule__TerminalExpression__OperandAssignment_5_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2050:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2051:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2051:2: ( ruleTerminalExpression )
            // InternalFire.g:2052:3: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_5_2_0()); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000A8080830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});

}