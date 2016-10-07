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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'program'", "'end'", "'writeln'", "'('", "')'", "'or'", "'and'", "'xor'", "'not'", "'.'", "'true'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleAndExpression"
    // InternalFire.g:128:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalFire.g:129:1: ( ruleAndExpression EOF )
            // InternalFire.g:130:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalFire.g:137:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:141:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalFire.g:142:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalFire.g:142:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalFire.g:143:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalFire.g:144:3: ( rule__AndExpression__Group__0 )
            // InternalFire.g:144:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalFire.g:153:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalFire.g:154:1: ( ruleXorExpression EOF )
            // InternalFire.g:155:1: ruleXorExpression EOF
            {
             before(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionRule()); 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalFire.g:162:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:166:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalFire.g:167:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalFire.g:167:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalFire.g:168:3: ( rule__XorExpression__Group__0 )
            {
             before(grammarAccess.getXorExpressionAccess().getGroup()); 
            // InternalFire.g:169:3: ( rule__XorExpression__Group__0 )
            // InternalFire.g:169:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalFire.g:178:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalFire.g:179:1: ( ruleEqualityExpression EOF )
            // InternalFire.g:180:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalFire.g:187:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:191:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalFire.g:192:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalFire.g:192:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalFire.g:193:3: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // InternalFire.g:194:3: ( rule__EqualityExpression__Group__0 )
            // InternalFire.g:194:4: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalFire.g:203:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalFire.g:204:1: ( ruleComparisonExpression EOF )
            // InternalFire.g:205:1: ruleComparisonExpression EOF
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
    // InternalFire.g:212:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:216:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalFire.g:217:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalFire.g:217:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalFire.g:218:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalFire.g:219:3: ( rule__ComparisonExpression__Group__0 )
            // InternalFire.g:219:4: rule__ComparisonExpression__Group__0
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
    // InternalFire.g:228:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalFire.g:229:1: ( ruleAdditiveExpression EOF )
            // InternalFire.g:230:1: ruleAdditiveExpression EOF
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
    // InternalFire.g:237:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:241:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalFire.g:242:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalFire.g:242:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalFire.g:243:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalFire.g:244:3: ( rule__AdditiveExpression__Group__0 )
            // InternalFire.g:244:4: rule__AdditiveExpression__Group__0
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
    // InternalFire.g:253:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalFire.g:254:1: ( ruleMultiplicativeExpression EOF )
            // InternalFire.g:255:1: ruleMultiplicativeExpression EOF
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
    // InternalFire.g:262:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:266:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalFire.g:267:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalFire.g:267:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalFire.g:268:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalFire.g:269:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalFire.g:269:4: rule__MultiplicativeExpression__Group__0
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
    // InternalFire.g:278:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalFire.g:279:1: ( ruleTerminalExpression EOF )
            // InternalFire.g:280:1: ruleTerminalExpression EOF
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
    // InternalFire.g:287:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:291:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalFire.g:292:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalFire.g:292:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalFire.g:293:3: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // InternalFire.g:294:3: ( rule__TerminalExpression__Alternatives )
            // InternalFire.g:294:4: rule__TerminalExpression__Alternatives
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
    // InternalFire.g:303:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // InternalFire.g:304:1: ( ruleLong EOF )
            // InternalFire.g:305:1: ruleLong EOF
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
    // InternalFire.g:312:1: ruleLong : ( RULE_INT ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:316:2: ( ( RULE_INT ) )
            // InternalFire.g:317:2: ( RULE_INT )
            {
            // InternalFire.g:317:2: ( RULE_INT )
            // InternalFire.g:318:3: RULE_INT
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
    // InternalFire.g:328:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalFire.g:329:1: ( ruleDouble EOF )
            // InternalFire.g:330:1: ruleDouble EOF
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
    // InternalFire.g:337:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:341:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalFire.g:342:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalFire.g:342:2: ( ( rule__Double__Group__0 ) )
            // InternalFire.g:343:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalFire.g:344:3: ( rule__Double__Group__0 )
            // InternalFire.g:344:4: rule__Double__Group__0
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
    // InternalFire.g:353:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:357:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalFire.g:358:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalFire.g:358:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalFire.g:359:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalFire.g:360:3: ( rule__EqualityOperator__Alternatives )
            // InternalFire.g:360:4: rule__EqualityOperator__Alternatives
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
    // InternalFire.g:369:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:373:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalFire.g:374:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalFire.g:374:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalFire.g:375:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalFire.g:376:3: ( rule__ComparisonOperator__Alternatives )
            // InternalFire.g:376:4: rule__ComparisonOperator__Alternatives
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
    // InternalFire.g:385:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:389:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalFire.g:390:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalFire.g:390:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalFire.g:391:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalFire.g:392:3: ( rule__AdditiveOperator__Alternatives )
            // InternalFire.g:392:4: rule__AdditiveOperator__Alternatives
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
    // InternalFire.g:401:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:405:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalFire.g:406:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalFire.g:406:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalFire.g:407:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalFire.g:408:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalFire.g:408:4: rule__MultiplicativeOperator__Alternatives
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
    // InternalFire.g:416:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:420:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case 11:
            case 34:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==EOF||(LA1_3>=12 && LA1_3<=23)||(LA1_3>=28 && LA1_3<=31)) ) {
                    alt1=3;
                }
                else if ( (LA1_3==33) ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
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
                    // InternalFire.g:421:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalFire.g:421:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalFire.g:422:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalFire.g:423:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalFire.g:423:4: rule__TerminalExpression__Group_0__0
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
                    // InternalFire.g:427:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalFire.g:427:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalFire.g:428:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalFire.g:429:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalFire.g:429:4: rule__TerminalExpression__Group_1__0
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
                    // InternalFire.g:433:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalFire.g:433:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalFire.g:434:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // InternalFire.g:435:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalFire.g:435:4: rule__TerminalExpression__Group_2__0
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
                    // InternalFire.g:439:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalFire.g:439:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalFire.g:440:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // InternalFire.g:441:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalFire.g:441:4: rule__TerminalExpression__Group_3__0
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
                    // InternalFire.g:445:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalFire.g:445:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalFire.g:446:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // InternalFire.g:447:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalFire.g:447:4: rule__TerminalExpression__Group_4__0
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
                    // InternalFire.g:451:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalFire.g:451:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalFire.g:452:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    // InternalFire.g:453:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalFire.g:453:4: rule__TerminalExpression__Group_5__0
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
                    // InternalFire.g:457:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalFire.g:457:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalFire.g:458:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    // InternalFire.g:459:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalFire.g:459:4: rule__TerminalExpression__Group_6__0
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
    // InternalFire.g:467:1: rule__TerminalExpression__Alternatives_1_1 : ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__TerminalExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:471:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
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
                    // InternalFire.g:472:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    {
                    // InternalFire.g:472:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    // InternalFire.g:473:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0()); 
                    // InternalFire.g:474:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    // InternalFire.g:474:4: rule__TerminalExpression__ValueAssignment_1_1_0
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
                    // InternalFire.g:478:2: ( 'false' )
                    {
                    // InternalFire.g:478:2: ( 'false' )
                    // InternalFire.g:479:3: 'false'
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
    // InternalFire.g:488:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:492:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
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
                    // InternalFire.g:493:2: ( ( '=' ) )
                    {
                    // InternalFire.g:493:2: ( ( '=' ) )
                    // InternalFire.g:494:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:495:3: ( '=' )
                    // InternalFire.g:495:4: '='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:499:2: ( ( '<>' ) )
                    {
                    // InternalFire.g:499:2: ( ( '<>' ) )
                    // InternalFire.g:500:3: ( '<>' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalFire.g:501:3: ( '<>' )
                    // InternalFire.g:501:4: '<>'
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
    // InternalFire.g:509:1: rule__ComparisonOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:513:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
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
                    // InternalFire.g:514:2: ( ( '<' ) )
                    {
                    // InternalFire.g:514:2: ( ( '<' ) )
                    // InternalFire.g:515:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:516:3: ( '<' )
                    // InternalFire.g:516:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:520:2: ( ( '<=' ) )
                    {
                    // InternalFire.g:520:2: ( ( '<=' ) )
                    // InternalFire.g:521:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalFire.g:522:3: ( '<=' )
                    // InternalFire.g:522:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:526:2: ( ( '>' ) )
                    {
                    // InternalFire.g:526:2: ( ( '>' ) )
                    // InternalFire.g:527:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    // InternalFire.g:528:3: ( '>' )
                    // InternalFire.g:528:4: '>'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:532:2: ( ( '>=' ) )
                    {
                    // InternalFire.g:532:2: ( ( '>=' ) )
                    // InternalFire.g:533:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3()); 
                    // InternalFire.g:534:3: ( '>=' )
                    // InternalFire.g:534:4: '>='
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
    // InternalFire.g:542:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:546:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalFire.g:547:2: ( ( '+' ) )
                    {
                    // InternalFire.g:547:2: ( ( '+' ) )
                    // InternalFire.g:548:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalFire.g:549:3: ( '+' )
                    // InternalFire.g:549:4: '+'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:553:2: ( ( '-' ) )
                    {
                    // InternalFire.g:553:2: ( ( '-' ) )
                    // InternalFire.g:554:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalFire.g:555:3: ( '-' )
                    // InternalFire.g:555:4: '-'
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
    // InternalFire.g:563:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:567:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) )
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
                    // InternalFire.g:568:2: ( ( '*' ) )
                    {
                    // InternalFire.g:568:2: ( ( '*' ) )
                    // InternalFire.g:569:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalFire.g:570:3: ( '*' )
                    // InternalFire.g:570:4: '*'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:574:2: ( ( '/' ) )
                    {
                    // InternalFire.g:574:2: ( ( '/' ) )
                    // InternalFire.g:575:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 
                    // InternalFire.g:576:3: ( '/' )
                    // InternalFire.g:576:4: '/'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:580:2: ( ( 'div' ) )
                    {
                    // InternalFire.g:580:2: ( ( 'div' ) )
                    // InternalFire.g:581:3: ( 'div' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 
                    // InternalFire.g:582:3: ( 'div' )
                    // InternalFire.g:582:4: 'div'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:586:2: ( ( 'mod' ) )
                    {
                    // InternalFire.g:586:2: ( ( 'mod' ) )
                    // InternalFire.g:587:3: ( 'mod' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 
                    // InternalFire.g:588:3: ( 'mod' )
                    // InternalFire.g:588:4: 'mod'
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
    // InternalFire.g:596:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:600:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFire.g:601:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalFire.g:608:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:612:1: ( ( () ) )
            // InternalFire.g:613:1: ( () )
            {
            // InternalFire.g:613:1: ( () )
            // InternalFire.g:614:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalFire.g:615:2: ()
            // InternalFire.g:615:3: 
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
    // InternalFire.g:623:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:627:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalFire.g:628:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalFire.g:635:1: rule__Program__Group__1__Impl : ( 'program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:639:1: ( ( 'program' ) )
            // InternalFire.g:640:1: ( 'program' )
            {
            // InternalFire.g:640:1: ( 'program' )
            // InternalFire.g:641:2: 'program'
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
    // InternalFire.g:650:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:654:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalFire.g:655:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalFire.g:662:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:666:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalFire.g:667:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalFire.g:667:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalFire.g:668:2: ( rule__Program__StatementsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            // InternalFire.g:669:2: ( rule__Program__StatementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFire.g:669:3: rule__Program__StatementsAssignment_2
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
    // InternalFire.g:677:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:681:1: ( rule__Program__Group__3__Impl )
            // InternalFire.g:682:2: rule__Program__Group__3__Impl
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
    // InternalFire.g:688:1: rule__Program__Group__3__Impl : ( 'end' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:692:1: ( ( 'end' ) )
            // InternalFire.g:693:1: ( 'end' )
            {
            // InternalFire.g:693:1: ( 'end' )
            // InternalFire.g:694:2: 'end'
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
    // InternalFire.g:704:1: rule__WritelnStatement__Group__0 : rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1 ;
    public final void rule__WritelnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:708:1: ( rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1 )
            // InternalFire.g:709:2: rule__WritelnStatement__Group__0__Impl rule__WritelnStatement__Group__1
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
    // InternalFire.g:716:1: rule__WritelnStatement__Group__0__Impl : ( 'writeln' ) ;
    public final void rule__WritelnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:720:1: ( ( 'writeln' ) )
            // InternalFire.g:721:1: ( 'writeln' )
            {
            // InternalFire.g:721:1: ( 'writeln' )
            // InternalFire.g:722:2: 'writeln'
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
    // InternalFire.g:731:1: rule__WritelnStatement__Group__1 : rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2 ;
    public final void rule__WritelnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:735:1: ( rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2 )
            // InternalFire.g:736:2: rule__WritelnStatement__Group__1__Impl rule__WritelnStatement__Group__2
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
    // InternalFire.g:743:1: rule__WritelnStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WritelnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:747:1: ( ( '(' ) )
            // InternalFire.g:748:1: ( '(' )
            {
            // InternalFire.g:748:1: ( '(' )
            // InternalFire.g:749:2: '('
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
    // InternalFire.g:758:1: rule__WritelnStatement__Group__2 : rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3 ;
    public final void rule__WritelnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:762:1: ( rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3 )
            // InternalFire.g:763:2: rule__WritelnStatement__Group__2__Impl rule__WritelnStatement__Group__3
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
    // InternalFire.g:770:1: rule__WritelnStatement__Group__2__Impl : ( ( rule__WritelnStatement__ArgumentAssignment_2 ) ) ;
    public final void rule__WritelnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:774:1: ( ( ( rule__WritelnStatement__ArgumentAssignment_2 ) ) )
            // InternalFire.g:775:1: ( ( rule__WritelnStatement__ArgumentAssignment_2 ) )
            {
            // InternalFire.g:775:1: ( ( rule__WritelnStatement__ArgumentAssignment_2 ) )
            // InternalFire.g:776:2: ( rule__WritelnStatement__ArgumentAssignment_2 )
            {
             before(grammarAccess.getWritelnStatementAccess().getArgumentAssignment_2()); 
            // InternalFire.g:777:2: ( rule__WritelnStatement__ArgumentAssignment_2 )
            // InternalFire.g:777:3: rule__WritelnStatement__ArgumentAssignment_2
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
    // InternalFire.g:785:1: rule__WritelnStatement__Group__3 : rule__WritelnStatement__Group__3__Impl ;
    public final void rule__WritelnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:789:1: ( rule__WritelnStatement__Group__3__Impl )
            // InternalFire.g:790:2: rule__WritelnStatement__Group__3__Impl
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
    // InternalFire.g:796:1: rule__WritelnStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WritelnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:800:1: ( ( ')' ) )
            // InternalFire.g:801:1: ( ')' )
            {
            // InternalFire.g:801:1: ( ')' )
            // InternalFire.g:802:2: ')'
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
    // InternalFire.g:812:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:816:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalFire.g:817:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalFire.g:824:1: rule__Expression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:828:1: ( ( ruleAndExpression ) )
            // InternalFire.g:829:1: ( ruleAndExpression )
            {
            // InternalFire.g:829:1: ( ruleAndExpression )
            // InternalFire.g:830:2: ruleAndExpression
            {
             before(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 

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
    // InternalFire.g:839:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:843:1: ( rule__Expression__Group__1__Impl )
            // InternalFire.g:844:2: rule__Expression__Group__1__Impl
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
    // InternalFire.g:850:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:854:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalFire.g:855:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalFire.g:855:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalFire.g:856:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalFire.g:857:2: ( rule__Expression__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFire.g:857:3: rule__Expression__Group_1__0
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
    // InternalFire.g:866:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:870:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFire.g:871:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalFire.g:878:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:882:1: ( ( () ) )
            // InternalFire.g:883:1: ( () )
            {
            // InternalFire.g:883:1: ( () )
            // InternalFire.g:884:2: ()
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalFire.g:885:2: ()
            // InternalFire.g:885:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0()); 

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
    // InternalFire.g:893:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:897:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalFire.g:898:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
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
    // InternalFire.g:905:1: rule__Expression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:909:1: ( ( 'or' ) )
            // InternalFire.g:910:1: ( 'or' )
            {
            // InternalFire.g:910:1: ( 'or' )
            // InternalFire.g:911:2: 'or'
            {
             before(grammarAccess.getExpressionAccess().getOrKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOrKeyword_1_1()); 

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
    // InternalFire.g:920:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:924:1: ( rule__Expression__Group_1__2__Impl )
            // InternalFire.g:925:2: rule__Expression__Group_1__2__Impl
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
    // InternalFire.g:931:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:935:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalFire.g:936:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:936:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalFire.g:937:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:938:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalFire.g:938:3: rule__Expression__RightAssignment_1_2
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


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalFire.g:947:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:951:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalFire.g:952:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalFire.g:959:1: rule__AndExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:963:1: ( ( ruleXorExpression ) )
            // InternalFire.g:964:1: ( ruleXorExpression )
            {
            // InternalFire.g:964:1: ( ruleXorExpression )
            // InternalFire.g:965:2: ruleXorExpression
            {
             before(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getXorExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalFire.g:974:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:978:1: ( rule__AndExpression__Group__1__Impl )
            // InternalFire.g:979:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalFire.g:985:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:989:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalFire.g:990:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalFire.g:990:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalFire.g:991:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalFire.g:992:2: ( rule__AndExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:992:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalFire.g:1001:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1005:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalFire.g:1006:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalFire.g:1013:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1017:1: ( ( () ) )
            // InternalFire.g:1018:1: ( () )
            {
            // InternalFire.g:1018:1: ( () )
            // InternalFire.g:1019:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalFire.g:1020:2: ()
            // InternalFire.g:1020:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalFire.g:1028:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1032:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalFire.g:1033:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalFire.g:1040:1: rule__AndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1044:1: ( ( 'and' ) )
            // InternalFire.g:1045:1: ( 'and' )
            {
            // InternalFire.g:1045:1: ( 'and' )
            // InternalFire.g:1046:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalFire.g:1055:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1059:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalFire.g:1060:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalFire.g:1066:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1070:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1071:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1071:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1072:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1073:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalFire.g:1073:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalFire.g:1082:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1086:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalFire.g:1087:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

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
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalFire.g:1094:1: rule__XorExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1098:1: ( ( ruleEqualityExpression ) )
            // InternalFire.g:1099:1: ( ruleEqualityExpression )
            {
            // InternalFire.g:1099:1: ( ruleEqualityExpression )
            // InternalFire.g:1100:2: ruleEqualityExpression
            {
             before(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getEqualityExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalFire.g:1109:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1113:1: ( rule__XorExpression__Group__1__Impl )
            // InternalFire.g:1114:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

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
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalFire.g:1120:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1124:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalFire.g:1125:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalFire.g:1125:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalFire.g:1126:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalFire.g:1127:2: ( rule__XorExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFire.g:1127:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getXorExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalFire.g:1136:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1140:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalFire.g:1141:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

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
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalFire.g:1148:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1152:1: ( ( () ) )
            // InternalFire.g:1153:1: ( () )
            {
            // InternalFire.g:1153:1: ( () )
            // InternalFire.g:1154:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 
            // InternalFire.g:1155:2: ()
            // InternalFire.g:1155:3: 
            {
            }

             after(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalFire.g:1163:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1167:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalFire.g:1168:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2();

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
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalFire.g:1175:1: rule__XorExpression__Group_1__1__Impl : ( 'xor' ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1179:1: ( ( 'xor' ) )
            // InternalFire.g:1180:1: ( 'xor' )
            {
            // InternalFire.g:1180:1: ( 'xor' )
            // InternalFire.g:1181:2: 'xor'
            {
             before(grammarAccess.getXorExpressionAccess().getXorKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXorExpressionAccess().getXorKeyword_1_1()); 

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
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__2"
    // InternalFire.g:1190:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1194:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalFire.g:1195:2: rule__XorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__XorExpression__Group_1__2"


    // $ANTLR start "rule__XorExpression__Group_1__2__Impl"
    // InternalFire.g:1201:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1205:1: ( ( ( rule__XorExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1206:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1206:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1207:2: ( rule__XorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1208:2: ( rule__XorExpression__RightAssignment_1_2 )
            // InternalFire.g:1208:3: rule__XorExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__XorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // InternalFire.g:1217:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1221:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalFire.g:1222:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1();

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
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // InternalFire.g:1229:1: rule__EqualityExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1233:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:1234:1: ( ruleComparisonExpression )
            {
            // InternalFire.g:1234:1: ( ruleComparisonExpression )
            // InternalFire.g:1235:2: ruleComparisonExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // InternalFire.g:1244:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1248:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalFire.g:1249:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // InternalFire.g:1255:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1259:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalFire.g:1260:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalFire.g:1260:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalFire.g:1261:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalFire.g:1262:2: ( rule__EqualityExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFire.g:1262:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // InternalFire.g:1271:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1275:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalFire.g:1276:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // InternalFire.g:1283:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1287:1: ( ( () ) )
            // InternalFire.g:1288:1: ( () )
            {
            // InternalFire.g:1288:1: ( () )
            // InternalFire.g:1289:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // InternalFire.g:1290:2: ()
            // InternalFire.g:1290:3: 
            {
            }

             after(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // InternalFire.g:1298:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1302:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalFire.g:1303:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // InternalFire.g:1310:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1314:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1315:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1315:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1316:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1317:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1317:3: rule__EqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // InternalFire.g:1325:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1329:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalFire.g:1330:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // InternalFire.g:1336:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1340:1: ( ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1341:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1341:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1342:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1343:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            // InternalFire.g:1343:3: rule__EqualityExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalFire.g:1352:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1356:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalFire.g:1357:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFire.g:1364:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1368:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:1369:1: ( ruleAdditiveExpression )
            {
            // InternalFire.g:1369:1: ( ruleAdditiveExpression )
            // InternalFire.g:1370:2: ruleAdditiveExpression
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
    // InternalFire.g:1379:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1383:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalFire.g:1384:2: rule__ComparisonExpression__Group__1__Impl
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
    // InternalFire.g:1390:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1394:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalFire.g:1395:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalFire.g:1395:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalFire.g:1396:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalFire.g:1397:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=14 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFire.g:1397:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFire.g:1406:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1410:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalFire.g:1411:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFire.g:1418:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1422:1: ( ( () ) )
            // InternalFire.g:1423:1: ( () )
            {
            // InternalFire.g:1423:1: ( () )
            // InternalFire.g:1424:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalFire.g:1425:2: ()
            // InternalFire.g:1425:3: 
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
    // InternalFire.g:1433:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1437:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalFire.g:1438:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
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
    // InternalFire.g:1445:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1449:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1450:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1450:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1451:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1452:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1452:3: rule__ComparisonExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1460:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1464:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalFire.g:1465:2: rule__ComparisonExpression__Group_1__2__Impl
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
    // InternalFire.g:1471:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1475:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1476:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1476:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1477:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1478:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalFire.g:1478:3: rule__ComparisonExpression__RightAssignment_1_2
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
    // InternalFire.g:1487:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1491:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalFire.g:1492:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFire.g:1499:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1503:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:1504:1: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:1504:1: ( ruleMultiplicativeExpression )
            // InternalFire.g:1505:2: ruleMultiplicativeExpression
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
    // InternalFire.g:1514:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1518:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalFire.g:1519:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalFire.g:1525:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1529:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalFire.g:1530:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalFire.g:1530:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalFire.g:1531:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalFire.g:1532:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=18 && LA13_0<=19)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFire.g:1532:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFire.g:1541:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1545:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalFire.g:1546:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFire.g:1553:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1557:1: ( ( () ) )
            // InternalFire.g:1558:1: ( () )
            {
            // InternalFire.g:1558:1: ( () )
            // InternalFire.g:1559:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0()); 
            // InternalFire.g:1560:2: ()
            // InternalFire.g:1560:3: 
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
    // InternalFire.g:1568:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1572:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalFire.g:1573:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
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
    // InternalFire.g:1580:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1584:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1585:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1585:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1586:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1587:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1587:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1595:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1599:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalFire.g:1600:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalFire.g:1606:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1610:1: ( ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1611:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1611:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1612:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1613:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            // InternalFire.g:1613:3: rule__AdditiveExpression__RightAssignment_1_2
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
    // InternalFire.g:1622:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1626:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalFire.g:1627:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFire.g:1634:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1638:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1639:1: ( ruleTerminalExpression )
            {
            // InternalFire.g:1639:1: ( ruleTerminalExpression )
            // InternalFire.g:1640:2: ruleTerminalExpression
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
    // InternalFire.g:1649:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1653:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalFire.g:1654:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalFire.g:1660:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1664:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalFire.g:1665:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalFire.g:1665:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalFire.g:1666:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalFire.g:1667:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=20 && LA14_0<=23)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFire.g:1667:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalFire.g:1676:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1680:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalFire.g:1681:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFire.g:1688:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1692:1: ( ( () ) )
            // InternalFire.g:1693:1: ( () )
            {
            // InternalFire.g:1693:1: ( () )
            // InternalFire.g:1694:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0()); 
            // InternalFire.g:1695:2: ()
            // InternalFire.g:1695:3: 
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
    // InternalFire.g:1703:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1707:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalFire.g:1708:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
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
    // InternalFire.g:1715:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1719:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1720:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1720:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1721:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1722:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1722:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1730:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1734:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalFire.g:1735:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalFire.g:1741:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1745:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1746:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1746:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1747:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1748:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            // InternalFire.g:1748:3: rule__MultiplicativeExpression__RightAssignment_1_2
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
    // InternalFire.g:1757:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1761:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalFire.g:1762:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFire.g:1769:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1773:1: ( ( () ) )
            // InternalFire.g:1774:1: ( () )
            {
            // InternalFire.g:1774:1: ( () )
            // InternalFire.g:1775:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0()); 
            // InternalFire.g:1776:2: ()
            // InternalFire.g:1776:3: 
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
    // InternalFire.g:1784:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1788:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalFire.g:1789:2: rule__TerminalExpression__Group_0__1__Impl
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
    // InternalFire.g:1795:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1799:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalFire.g:1800:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalFire.g:1800:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalFire.g:1801:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // InternalFire.g:1802:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalFire.g:1802:3: rule__TerminalExpression__ValueAssignment_0_1
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
    // InternalFire.g:1811:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1815:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalFire.g:1816:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalFire.g:1823:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1827:1: ( ( () ) )
            // InternalFire.g:1828:1: ( () )
            {
            // InternalFire.g:1828:1: ( () )
            // InternalFire.g:1829:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalFire.g:1830:2: ()
            // InternalFire.g:1830:3: 
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
    // InternalFire.g:1838:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1842:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalFire.g:1843:2: rule__TerminalExpression__Group_1__1__Impl
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
    // InternalFire.g:1849:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__Alternatives_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1853:1: ( ( ( rule__TerminalExpression__Alternatives_1_1 ) ) )
            // InternalFire.g:1854:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            {
            // InternalFire.g:1854:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            // InternalFire.g:1855:2: ( rule__TerminalExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1()); 
            // InternalFire.g:1856:2: ( rule__TerminalExpression__Alternatives_1_1 )
            // InternalFire.g:1856:3: rule__TerminalExpression__Alternatives_1_1
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
    // InternalFire.g:1865:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1869:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalFire.g:1870:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:1877:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1881:1: ( ( () ) )
            // InternalFire.g:1882:1: ( () )
            {
            // InternalFire.g:1882:1: ( () )
            // InternalFire.g:1883:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalFire.g:1884:2: ()
            // InternalFire.g:1884:3: 
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
    // InternalFire.g:1892:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1896:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalFire.g:1897:2: rule__TerminalExpression__Group_2__1__Impl
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
    // InternalFire.g:1903:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1907:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalFire.g:1908:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalFire.g:1908:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalFire.g:1909:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // InternalFire.g:1910:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalFire.g:1910:3: rule__TerminalExpression__ValueAssignment_2_1
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
    // InternalFire.g:1919:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1923:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalFire.g:1924:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:1931:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1935:1: ( ( () ) )
            // InternalFire.g:1936:1: ( () )
            {
            // InternalFire.g:1936:1: ( () )
            // InternalFire.g:1937:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0()); 
            // InternalFire.g:1938:2: ()
            // InternalFire.g:1938:3: 
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
    // InternalFire.g:1946:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1950:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalFire.g:1951:2: rule__TerminalExpression__Group_3__1__Impl
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
    // InternalFire.g:1957:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1961:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalFire.g:1962:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalFire.g:1962:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalFire.g:1963:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // InternalFire.g:1964:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalFire.g:1964:3: rule__TerminalExpression__ValueAssignment_3_1
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
    // InternalFire.g:1973:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1977:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalFire.g:1978:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFire.g:1985:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1989:1: ( ( () ) )
            // InternalFire.g:1990:1: ( () )
            {
            // InternalFire.g:1990:1: ( () )
            // InternalFire.g:1991:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0()); 
            // InternalFire.g:1992:2: ()
            // InternalFire.g:1992:3: 
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
    // InternalFire.g:2000:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2004:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // InternalFire.g:2005:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
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
    // InternalFire.g:2012:1: rule__TerminalExpression__Group_4__1__Impl : ( 'not' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2016:1: ( ( 'not' ) )
            // InternalFire.g:2017:1: ( 'not' )
            {
            // InternalFire.g:2017:1: ( 'not' )
            // InternalFire.g:2018:2: 'not'
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalFire.g:2027:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2031:1: ( rule__TerminalExpression__Group_4__2__Impl )
            // InternalFire.g:2032:2: rule__TerminalExpression__Group_4__2__Impl
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
    // InternalFire.g:2038:1: rule__TerminalExpression__Group_4__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2042:1: ( ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) )
            // InternalFire.g:2043:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            {
            // InternalFire.g:2043:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            // InternalFire.g:2044:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2()); 
            // InternalFire.g:2045:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            // InternalFire.g:2045:3: rule__TerminalExpression__OperandAssignment_4_2
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
    // InternalFire.g:2054:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2058:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalFire.g:2059:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFire.g:2066:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2070:1: ( ( () ) )
            // InternalFire.g:2071:1: ( () )
            {
            // InternalFire.g:2071:1: ( () )
            // InternalFire.g:2072:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0()); 
            // InternalFire.g:2073:2: ()
            // InternalFire.g:2073:3: 
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
    // InternalFire.g:2081:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2085:1: ( rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 )
            // InternalFire.g:2086:2: rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2
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
    // InternalFire.g:2093:1: rule__TerminalExpression__Group_5__1__Impl : ( '-' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2097:1: ( ( '-' ) )
            // InternalFire.g:2098:1: ( '-' )
            {
            // InternalFire.g:2098:1: ( '-' )
            // InternalFire.g:2099:2: '-'
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
    // InternalFire.g:2108:1: rule__TerminalExpression__Group_5__2 : rule__TerminalExpression__Group_5__2__Impl ;
    public final void rule__TerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2112:1: ( rule__TerminalExpression__Group_5__2__Impl )
            // InternalFire.g:2113:2: rule__TerminalExpression__Group_5__2__Impl
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
    // InternalFire.g:2119:1: rule__TerminalExpression__Group_5__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) ;
    public final void rule__TerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2123:1: ( ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) )
            // InternalFire.g:2124:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            {
            // InternalFire.g:2124:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            // InternalFire.g:2125:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 
            // InternalFire.g:2126:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            // InternalFire.g:2126:3: rule__TerminalExpression__OperandAssignment_5_2
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
    // InternalFire.g:2135:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2139:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalFire.g:2140:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
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
    // InternalFire.g:2147:1: rule__TerminalExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2151:1: ( ( '(' ) )
            // InternalFire.g:2152:1: ( '(' )
            {
            // InternalFire.g:2152:1: ( '(' )
            // InternalFire.g:2153:2: '('
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
    // InternalFire.g:2162:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2166:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // InternalFire.g:2167:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
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
    // InternalFire.g:2174:1: rule__TerminalExpression__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2178:1: ( ( ruleExpression ) )
            // InternalFire.g:2179:1: ( ruleExpression )
            {
            // InternalFire.g:2179:1: ( ruleExpression )
            // InternalFire.g:2180:2: ruleExpression
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
    // InternalFire.g:2189:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2193:1: ( rule__TerminalExpression__Group_6__2__Impl )
            // InternalFire.g:2194:2: rule__TerminalExpression__Group_6__2__Impl
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
    // InternalFire.g:2200:1: rule__TerminalExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2204:1: ( ( ')' ) )
            // InternalFire.g:2205:1: ( ')' )
            {
            // InternalFire.g:2205:1: ( ')' )
            // InternalFire.g:2206:2: ')'
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
    // InternalFire.g:2216:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2220:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalFire.g:2221:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalFire.g:2228:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2232:1: ( ( RULE_INT ) )
            // InternalFire.g:2233:1: ( RULE_INT )
            {
            // InternalFire.g:2233:1: ( RULE_INT )
            // InternalFire.g:2234:2: RULE_INT
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
    // InternalFire.g:2243:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2247:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalFire.g:2248:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:2255:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2259:1: ( ( '.' ) )
            // InternalFire.g:2260:1: ( '.' )
            {
            // InternalFire.g:2260:1: ( '.' )
            // InternalFire.g:2261:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalFire.g:2270:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2274:1: ( rule__Double__Group__2__Impl )
            // InternalFire.g:2275:2: rule__Double__Group__2__Impl
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
    // InternalFire.g:2281:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2285:1: ( ( RULE_INT ) )
            // InternalFire.g:2286:1: ( RULE_INT )
            {
            // InternalFire.g:2286:1: ( RULE_INT )
            // InternalFire.g:2287:2: RULE_INT
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
    // InternalFire.g:2297:1: rule__Program__StatementsAssignment_2 : ( ruleWritelnStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2301:1: ( ( ruleWritelnStatement ) )
            // InternalFire.g:2302:2: ( ruleWritelnStatement )
            {
            // InternalFire.g:2302:2: ( ruleWritelnStatement )
            // InternalFire.g:2303:3: ruleWritelnStatement
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
    // InternalFire.g:2312:1: rule__WritelnStatement__ArgumentAssignment_2 : ( ruleExpression ) ;
    public final void rule__WritelnStatement__ArgumentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2316:1: ( ( ruleExpression ) )
            // InternalFire.g:2317:2: ( ruleExpression )
            {
            // InternalFire.g:2317:2: ( ruleExpression )
            // InternalFire.g:2318:3: ruleExpression
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


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalFire.g:2327:1: rule__Expression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2331:1: ( ( ruleAndExpression ) )
            // InternalFire.g:2332:2: ( ruleAndExpression )
            {
            // InternalFire.g:2332:2: ( ruleAndExpression )
            // InternalFire.g:2333:3: ruleAndExpression
            {
             before(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

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


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalFire.g:2342:1: rule__AndExpression__RightAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2346:1: ( ( ruleXorExpression ) )
            // InternalFire.g:2347:2: ( ruleXorExpression )
            {
            // InternalFire.g:2347:2: ( ruleXorExpression )
            // InternalFire.g:2348:3: ruleXorExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__XorExpression__RightAssignment_1_2"
    // InternalFire.g:2357:1: rule__XorExpression__RightAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2361:1: ( ( ruleEqualityExpression ) )
            // InternalFire.g:2362:2: ( ruleEqualityExpression )
            {
            // InternalFire.g:2362:2: ( ruleEqualityExpression )
            // InternalFire.g:2363:3: ruleEqualityExpression
            {
             before(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__XorExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OperatorAssignment_1_1"
    // InternalFire.g:2372:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2376:1: ( ( ruleEqualityOperator ) )
            // InternalFire.g:2377:2: ( ruleEqualityOperator )
            {
            // InternalFire.g:2377:2: ( ruleEqualityOperator )
            // InternalFire.g:2378:3: ruleEqualityOperator
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityOperator();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EqualityExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__RightAssignment_1_2"
    // InternalFire.g:2387:1: rule__EqualityExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2391:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:2392:2: ( ruleComparisonExpression )
            {
            // InternalFire.g:2392:2: ( ruleComparisonExpression )
            // InternalFire.g:2393:3: ruleComparisonExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__EqualityExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalFire.g:2402:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2406:1: ( ( ruleComparisonOperator ) )
            // InternalFire.g:2407:2: ( ruleComparisonOperator )
            {
            // InternalFire.g:2407:2: ( ruleComparisonOperator )
            // InternalFire.g:2408:3: ruleComparisonOperator
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
    // InternalFire.g:2417:1: rule__ComparisonExpression__RightAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2421:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:2422:2: ( ruleAdditiveExpression )
            {
            // InternalFire.g:2422:2: ( ruleAdditiveExpression )
            // InternalFire.g:2423:3: ruleAdditiveExpression
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
    // InternalFire.g:2432:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2436:1: ( ( ruleAdditiveOperator ) )
            // InternalFire.g:2437:2: ( ruleAdditiveOperator )
            {
            // InternalFire.g:2437:2: ( ruleAdditiveOperator )
            // InternalFire.g:2438:3: ruleAdditiveOperator
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
    // InternalFire.g:2447:1: rule__AdditiveExpression__RightAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2451:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:2452:2: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:2452:2: ( ruleMultiplicativeExpression )
            // InternalFire.g:2453:3: ruleMultiplicativeExpression
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
    // InternalFire.g:2462:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2466:1: ( ( ruleMultiplicativeOperator ) )
            // InternalFire.g:2467:2: ( ruleMultiplicativeOperator )
            {
            // InternalFire.g:2467:2: ( ruleMultiplicativeOperator )
            // InternalFire.g:2468:3: ruleMultiplicativeOperator
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
    // InternalFire.g:2477:1: rule__MultiplicativeExpression__RightAssignment_1_2 : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2481:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2482:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2482:2: ( ruleTerminalExpression )
            // InternalFire.g:2483:3: ruleTerminalExpression
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
    // InternalFire.g:2492:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2496:1: ( ( RULE_STRING ) )
            // InternalFire.g:2497:2: ( RULE_STRING )
            {
            // InternalFire.g:2497:2: ( RULE_STRING )
            // InternalFire.g:2498:3: RULE_STRING
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
    // InternalFire.g:2507:1: rule__TerminalExpression__ValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2511:1: ( ( ( 'true' ) ) )
            // InternalFire.g:2512:2: ( ( 'true' ) )
            {
            // InternalFire.g:2512:2: ( ( 'true' ) )
            // InternalFire.g:2513:3: ( 'true' )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            // InternalFire.g:2514:3: ( 'true' )
            // InternalFire.g:2515:4: 'true'
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalFire.g:2526:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ruleLong ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2530:1: ( ( ruleLong ) )
            // InternalFire.g:2531:2: ( ruleLong )
            {
            // InternalFire.g:2531:2: ( ruleLong )
            // InternalFire.g:2532:3: ruleLong
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
    // InternalFire.g:2541:1: rule__TerminalExpression__ValueAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2545:1: ( ( ruleDouble ) )
            // InternalFire.g:2546:2: ( ruleDouble )
            {
            // InternalFire.g:2546:2: ( ruleDouble )
            // InternalFire.g:2547:3: ruleDouble
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
    // InternalFire.g:2556:1: rule__TerminalExpression__OperandAssignment_4_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2560:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2561:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2561:2: ( ruleTerminalExpression )
            // InternalFire.g:2562:3: ruleTerminalExpression
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
    // InternalFire.g:2571:1: rule__TerminalExpression__OperandAssignment_5_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2575:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2576:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2576:2: ( ruleTerminalExpression )
            // InternalFire.g:2577:3: ruleTerminalExpression
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000508080830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});

}