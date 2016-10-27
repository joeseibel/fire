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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'program'", "'end'", "'const'", "':'", "':='", "'writeln'", "'('", "')'", "'or'", "'and'", "'xor'", "'not'", "'.'", "'true'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
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


    // $ANTLR start "entryRuleStatement"
    // InternalFire.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalFire.g:79:1: ( ruleStatement EOF )
            // InternalFire.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFire.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalFire.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalFire.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalFire.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalFire.g:94:3: ( rule__Statement__Alternatives )
            // InternalFire.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


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


    // $ANTLR start "ruleBuiltInType"
    // InternalFire.g:353:1: ruleBuiltInType : ( ( rule__BuiltInType__Alternatives ) ) ;
    public final void ruleBuiltInType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:357:1: ( ( ( rule__BuiltInType__Alternatives ) ) )
            // InternalFire.g:358:2: ( ( rule__BuiltInType__Alternatives ) )
            {
            // InternalFire.g:358:2: ( ( rule__BuiltInType__Alternatives ) )
            // InternalFire.g:359:3: ( rule__BuiltInType__Alternatives )
            {
             before(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 
            // InternalFire.g:360:3: ( rule__BuiltInType__Alternatives )
            // InternalFire.g:360:4: rule__BuiltInType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BuiltInType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltInTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBuiltInType"


    // $ANTLR start "ruleEqualityOperator"
    // InternalFire.g:369:1: ruleEqualityOperator : ( ( rule__EqualityOperator__Alternatives ) ) ;
    public final void ruleEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:373:1: ( ( ( rule__EqualityOperator__Alternatives ) ) )
            // InternalFire.g:374:2: ( ( rule__EqualityOperator__Alternatives ) )
            {
            // InternalFire.g:374:2: ( ( rule__EqualityOperator__Alternatives ) )
            // InternalFire.g:375:3: ( rule__EqualityOperator__Alternatives )
            {
             before(grammarAccess.getEqualityOperatorAccess().getAlternatives()); 
            // InternalFire.g:376:3: ( rule__EqualityOperator__Alternatives )
            // InternalFire.g:376:4: rule__EqualityOperator__Alternatives
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
    // InternalFire.g:385:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:389:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalFire.g:390:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalFire.g:390:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalFire.g:391:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalFire.g:392:3: ( rule__ComparisonOperator__Alternatives )
            // InternalFire.g:392:4: rule__ComparisonOperator__Alternatives
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
    // InternalFire.g:401:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:405:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalFire.g:406:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalFire.g:406:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalFire.g:407:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalFire.g:408:3: ( rule__AdditiveOperator__Alternatives )
            // InternalFire.g:408:4: rule__AdditiveOperator__Alternatives
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
    // InternalFire.g:417:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:421:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalFire.g:422:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalFire.g:422:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalFire.g:423:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalFire.g:424:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalFire.g:424:4: rule__MultiplicativeOperator__Alternatives
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalFire.g:432:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:436:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFire.g:437:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalFire.g:437:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalFire.g:438:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalFire.g:439:3: ( rule__Statement__Group_0__0 )
                    // InternalFire.g:439:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:443:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalFire.g:443:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalFire.g:444:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalFire.g:445:3: ( rule__Statement__Group_1__0 )
                    // InternalFire.g:445:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalFire.g:453:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:457:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case 11:
            case 41:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==EOF||(LA2_3>=16 && LA2_3<=27)||(LA2_3>=29 && LA2_3<=30)||LA2_3==33||(LA2_3>=35 && LA2_3<=38)) ) {
                    alt2=3;
                }
                else if ( (LA2_3==40) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 34:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFire.g:458:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalFire.g:458:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalFire.g:459:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalFire.g:460:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalFire.g:460:4: rule__TerminalExpression__Group_0__0
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
                    // InternalFire.g:464:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalFire.g:464:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalFire.g:465:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalFire.g:466:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalFire.g:466:4: rule__TerminalExpression__Group_1__0
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
                    // InternalFire.g:470:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalFire.g:470:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalFire.g:471:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // InternalFire.g:472:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalFire.g:472:4: rule__TerminalExpression__Group_2__0
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
                    // InternalFire.g:476:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalFire.g:476:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalFire.g:477:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // InternalFire.g:478:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalFire.g:478:4: rule__TerminalExpression__Group_3__0
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
                    // InternalFire.g:482:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalFire.g:482:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalFire.g:483:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // InternalFire.g:484:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalFire.g:484:4: rule__TerminalExpression__Group_4__0
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
                    // InternalFire.g:488:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalFire.g:488:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalFire.g:489:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    // InternalFire.g:490:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalFire.g:490:4: rule__TerminalExpression__Group_5__0
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
                    // InternalFire.g:494:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalFire.g:494:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalFire.g:495:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    // InternalFire.g:496:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalFire.g:496:4: rule__TerminalExpression__Group_6__0
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
    // InternalFire.g:504:1: rule__TerminalExpression__Alternatives_1_1 : ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__TerminalExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:508:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFire.g:509:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    {
                    // InternalFire.g:509:2: ( ( rule__TerminalExpression__ValueAssignment_1_1_0 ) )
                    // InternalFire.g:510:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1_0()); 
                    // InternalFire.g:511:3: ( rule__TerminalExpression__ValueAssignment_1_1_0 )
                    // InternalFire.g:511:4: rule__TerminalExpression__ValueAssignment_1_1_0
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
                    // InternalFire.g:515:2: ( 'false' )
                    {
                    // InternalFire.g:515:2: ( 'false' )
                    // InternalFire.g:516:3: 'false'
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


    // $ANTLR start "rule__BuiltInType__Alternatives"
    // InternalFire.g:525:1: rule__BuiltInType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'Real' ) ) );
    public final void rule__BuiltInType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:529:1: ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'Real' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
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
                    // InternalFire.g:530:2: ( ( 'String' ) )
                    {
                    // InternalFire.g:530:2: ( ( 'String' ) )
                    // InternalFire.g:531:3: ( 'String' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalFire.g:532:3: ( 'String' )
                    // InternalFire.g:532:4: 'String'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:536:2: ( ( 'Boolean' ) )
                    {
                    // InternalFire.g:536:2: ( ( 'Boolean' ) )
                    // InternalFire.g:537:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalFire.g:538:3: ( 'Boolean' )
                    // InternalFire.g:538:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:542:2: ( ( 'Integer' ) )
                    {
                    // InternalFire.g:542:2: ( ( 'Integer' ) )
                    // InternalFire.g:543:3: ( 'Integer' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
                    // InternalFire.g:544:3: ( 'Integer' )
                    // InternalFire.g:544:4: 'Integer'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:548:2: ( ( 'Real' ) )
                    {
                    // InternalFire.g:548:2: ( ( 'Real' ) )
                    // InternalFire.g:549:3: ( 'Real' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3()); 
                    // InternalFire.g:550:3: ( 'Real' )
                    // InternalFire.g:550:4: 'Real'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__BuiltInType__Alternatives"


    // $ANTLR start "rule__EqualityOperator__Alternatives"
    // InternalFire.g:558:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:562:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
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
                    // InternalFire.g:563:2: ( ( '=' ) )
                    {
                    // InternalFire.g:563:2: ( ( '=' ) )
                    // InternalFire.g:564:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:565:3: ( '=' )
                    // InternalFire.g:565:4: '='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:569:2: ( ( '<>' ) )
                    {
                    // InternalFire.g:569:2: ( ( '<>' ) )
                    // InternalFire.g:570:3: ( '<>' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalFire.g:571:3: ( '<>' )
                    // InternalFire.g:571:4: '<>'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalFire.g:579:1: rule__ComparisonOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:583:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
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
                    // InternalFire.g:584:2: ( ( '<' ) )
                    {
                    // InternalFire.g:584:2: ( ( '<' ) )
                    // InternalFire.g:585:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:586:3: ( '<' )
                    // InternalFire.g:586:4: '<'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:590:2: ( ( '<=' ) )
                    {
                    // InternalFire.g:590:2: ( ( '<=' ) )
                    // InternalFire.g:591:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalFire.g:592:3: ( '<=' )
                    // InternalFire.g:592:4: '<='
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:596:2: ( ( '>' ) )
                    {
                    // InternalFire.g:596:2: ( ( '>' ) )
                    // InternalFire.g:597:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    // InternalFire.g:598:3: ( '>' )
                    // InternalFire.g:598:4: '>'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:602:2: ( ( '>=' ) )
                    {
                    // InternalFire.g:602:2: ( ( '>=' ) )
                    // InternalFire.g:603:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3()); 
                    // InternalFire.g:604:3: ( '>=' )
                    // InternalFire.g:604:4: '>='
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalFire.g:612:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:616:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFire.g:617:2: ( ( '+' ) )
                    {
                    // InternalFire.g:617:2: ( ( '+' ) )
                    // InternalFire.g:618:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalFire.g:619:3: ( '+' )
                    // InternalFire.g:619:4: '+'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:623:2: ( ( '-' ) )
                    {
                    // InternalFire.g:623:2: ( ( '-' ) )
                    // InternalFire.g:624:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalFire.g:625:3: ( '-' )
                    // InternalFire.g:625:4: '-'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalFire.g:633:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:637:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFire.g:638:2: ( ( '*' ) )
                    {
                    // InternalFire.g:638:2: ( ( '*' ) )
                    // InternalFire.g:639:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalFire.g:640:3: ( '*' )
                    // InternalFire.g:640:4: '*'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:644:2: ( ( '/' ) )
                    {
                    // InternalFire.g:644:2: ( ( '/' ) )
                    // InternalFire.g:645:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 
                    // InternalFire.g:646:3: ( '/' )
                    // InternalFire.g:646:4: '/'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:650:2: ( ( 'div' ) )
                    {
                    // InternalFire.g:650:2: ( ( 'div' ) )
                    // InternalFire.g:651:3: ( 'div' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 
                    // InternalFire.g:652:3: ( 'div' )
                    // InternalFire.g:652:4: 'div'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:656:2: ( ( 'mod' ) )
                    {
                    // InternalFire.g:656:2: ( ( 'mod' ) )
                    // InternalFire.g:657:3: ( 'mod' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 
                    // InternalFire.g:658:3: ( 'mod' )
                    // InternalFire.g:658:4: 'mod'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalFire.g:666:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:670:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFire.g:671:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalFire.g:678:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:682:1: ( ( () ) )
            // InternalFire.g:683:1: ( () )
            {
            // InternalFire.g:683:1: ( () )
            // InternalFire.g:684:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalFire.g:685:2: ()
            // InternalFire.g:685:3: 
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
    // InternalFire.g:693:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:697:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalFire.g:698:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalFire.g:705:1: rule__Program__Group__1__Impl : ( 'program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:709:1: ( ( 'program' ) )
            // InternalFire.g:710:1: ( 'program' )
            {
            // InternalFire.g:710:1: ( 'program' )
            // InternalFire.g:711:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFire.g:720:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:724:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalFire.g:725:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalFire.g:732:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:736:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalFire.g:737:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalFire.g:737:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalFire.g:738:2: ( rule__Program__StatementsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            // InternalFire.g:739:2: ( rule__Program__StatementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFire.g:739:3: rule__Program__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalFire.g:747:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:751:1: ( rule__Program__Group__3__Impl )
            // InternalFire.g:752:2: rule__Program__Group__3__Impl
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
    // InternalFire.g:758:1: rule__Program__Group__3__Impl : ( 'end' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:762:1: ( ( 'end' ) )
            // InternalFire.g:763:1: ( 'end' )
            {
            // InternalFire.g:763:1: ( 'end' )
            // InternalFire.g:764:2: 'end'
            {
             before(grammarAccess.getProgramAccess().getEndKeyword_3()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalFire.g:774:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:778:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalFire.g:779:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalFire.g:786:1: rule__Statement__Group_0__0__Impl : ( () ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:790:1: ( ( () ) )
            // InternalFire.g:791:1: ( () )
            {
            // InternalFire.g:791:1: ( () )
            // InternalFire.g:792:2: ()
            {
             before(grammarAccess.getStatementAccess().getConstantDeclarationAction_0_0()); 
            // InternalFire.g:793:2: ()
            // InternalFire.g:793:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getConstantDeclarationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalFire.g:801:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:805:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalFire.g:806:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalFire.g:813:1: rule__Statement__Group_0__1__Impl : ( 'const' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:817:1: ( ( 'const' ) )
            // InternalFire.g:818:1: ( 'const' )
            {
            // InternalFire.g:818:1: ( 'const' )
            // InternalFire.g:819:2: 'const'
            {
             before(grammarAccess.getStatementAccess().getConstKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getConstKeyword_0_1()); 

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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__2"
    // InternalFire.g:828:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl rule__Statement__Group_0__3 ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:832:1: ( rule__Statement__Group_0__2__Impl rule__Statement__Group_0__3 )
            // InternalFire.g:833:2: rule__Statement__Group_0__2__Impl rule__Statement__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__3();

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
    // $ANTLR end "rule__Statement__Group_0__2"


    // $ANTLR start "rule__Statement__Group_0__2__Impl"
    // InternalFire.g:840:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__NameAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:844:1: ( ( ( rule__Statement__NameAssignment_0_2 ) ) )
            // InternalFire.g:845:1: ( ( rule__Statement__NameAssignment_0_2 ) )
            {
            // InternalFire.g:845:1: ( ( rule__Statement__NameAssignment_0_2 ) )
            // InternalFire.g:846:2: ( rule__Statement__NameAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0_2()); 
            // InternalFire.g:847:2: ( rule__Statement__NameAssignment_0_2 )
            // InternalFire.g:847:3: rule__Statement__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_0_2()); 

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
    // $ANTLR end "rule__Statement__Group_0__2__Impl"


    // $ANTLR start "rule__Statement__Group_0__3"
    // InternalFire.g:855:1: rule__Statement__Group_0__3 : rule__Statement__Group_0__3__Impl rule__Statement__Group_0__4 ;
    public final void rule__Statement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:859:1: ( rule__Statement__Group_0__3__Impl rule__Statement__Group_0__4 )
            // InternalFire.g:860:2: rule__Statement__Group_0__3__Impl rule__Statement__Group_0__4
            {
            pushFollow(FOLLOW_9);
            rule__Statement__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__4();

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
    // $ANTLR end "rule__Statement__Group_0__3"


    // $ANTLR start "rule__Statement__Group_0__3__Impl"
    // InternalFire.g:867:1: rule__Statement__Group_0__3__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:871:1: ( ( ':' ) )
            // InternalFire.g:872:1: ( ':' )
            {
            // InternalFire.g:872:1: ( ':' )
            // InternalFire.g:873:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonKeyword_0_3()); 

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
    // $ANTLR end "rule__Statement__Group_0__3__Impl"


    // $ANTLR start "rule__Statement__Group_0__4"
    // InternalFire.g:882:1: rule__Statement__Group_0__4 : rule__Statement__Group_0__4__Impl rule__Statement__Group_0__5 ;
    public final void rule__Statement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:886:1: ( rule__Statement__Group_0__4__Impl rule__Statement__Group_0__5 )
            // InternalFire.g:887:2: rule__Statement__Group_0__4__Impl rule__Statement__Group_0__5
            {
            pushFollow(FOLLOW_10);
            rule__Statement__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__5();

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
    // $ANTLR end "rule__Statement__Group_0__4"


    // $ANTLR start "rule__Statement__Group_0__4__Impl"
    // InternalFire.g:894:1: rule__Statement__Group_0__4__Impl : ( ( rule__Statement__TypeAssignment_0_4 ) ) ;
    public final void rule__Statement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:898:1: ( ( ( rule__Statement__TypeAssignment_0_4 ) ) )
            // InternalFire.g:899:1: ( ( rule__Statement__TypeAssignment_0_4 ) )
            {
            // InternalFire.g:899:1: ( ( rule__Statement__TypeAssignment_0_4 ) )
            // InternalFire.g:900:2: ( rule__Statement__TypeAssignment_0_4 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_0_4()); 
            // InternalFire.g:901:2: ( rule__Statement__TypeAssignment_0_4 )
            // InternalFire.g:901:3: rule__Statement__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Statement__TypeAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getTypeAssignment_0_4()); 

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
    // $ANTLR end "rule__Statement__Group_0__4__Impl"


    // $ANTLR start "rule__Statement__Group_0__5"
    // InternalFire.g:909:1: rule__Statement__Group_0__5 : rule__Statement__Group_0__5__Impl rule__Statement__Group_0__6 ;
    public final void rule__Statement__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:913:1: ( rule__Statement__Group_0__5__Impl rule__Statement__Group_0__6 )
            // InternalFire.g:914:2: rule__Statement__Group_0__5__Impl rule__Statement__Group_0__6
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__6();

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
    // $ANTLR end "rule__Statement__Group_0__5"


    // $ANTLR start "rule__Statement__Group_0__5__Impl"
    // InternalFire.g:921:1: rule__Statement__Group_0__5__Impl : ( ':=' ) ;
    public final void rule__Statement__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:925:1: ( ( ':=' ) )
            // InternalFire.g:926:1: ( ':=' )
            {
            // InternalFire.g:926:1: ( ':=' )
            // InternalFire.g:927:2: ':='
            {
             before(grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonEqualsSignKeyword_0_5()); 

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
    // $ANTLR end "rule__Statement__Group_0__5__Impl"


    // $ANTLR start "rule__Statement__Group_0__6"
    // InternalFire.g:936:1: rule__Statement__Group_0__6 : rule__Statement__Group_0__6__Impl ;
    public final void rule__Statement__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:940:1: ( rule__Statement__Group_0__6__Impl )
            // InternalFire.g:941:2: rule__Statement__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__6__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__6"


    // $ANTLR start "rule__Statement__Group_0__6__Impl"
    // InternalFire.g:947:1: rule__Statement__Group_0__6__Impl : ( ( rule__Statement__ValueAssignment_0_6 ) ) ;
    public final void rule__Statement__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:951:1: ( ( ( rule__Statement__ValueAssignment_0_6 ) ) )
            // InternalFire.g:952:1: ( ( rule__Statement__ValueAssignment_0_6 ) )
            {
            // InternalFire.g:952:1: ( ( rule__Statement__ValueAssignment_0_6 ) )
            // InternalFire.g:953:2: ( rule__Statement__ValueAssignment_0_6 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_0_6()); 
            // InternalFire.g:954:2: ( rule__Statement__ValueAssignment_0_6 )
            // InternalFire.g:954:3: rule__Statement__ValueAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ValueAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValueAssignment_0_6()); 

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
    // $ANTLR end "rule__Statement__Group_0__6__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalFire.g:963:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:967:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalFire.g:968:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalFire.g:975:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:979:1: ( ( () ) )
            // InternalFire.g:980:1: ( () )
            {
            // InternalFire.g:980:1: ( () )
            // InternalFire.g:981:2: ()
            {
             before(grammarAccess.getStatementAccess().getWritelnStatementAction_1_0()); 
            // InternalFire.g:982:2: ()
            // InternalFire.g:982:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getWritelnStatementAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalFire.g:990:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:994:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalFire.g:995:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalFire.g:1002:1: rule__Statement__Group_1__1__Impl : ( 'writeln' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1006:1: ( ( 'writeln' ) )
            // InternalFire.g:1007:1: ( 'writeln' )
            {
            // InternalFire.g:1007:1: ( 'writeln' )
            // InternalFire.g:1008:2: 'writeln'
            {
             before(grammarAccess.getStatementAccess().getWritelnKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getWritelnKeyword_1_1()); 

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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalFire.g:1017:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1021:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // InternalFire.g:1022:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__3();

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
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalFire.g:1029:1: rule__Statement__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1033:1: ( ( '(' ) )
            // InternalFire.g:1034:1: ( '(' )
            {
            // InternalFire.g:1034:1: ( '(' )
            // InternalFire.g:1035:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__3"
    // InternalFire.g:1044:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1048:1: ( rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4 )
            // InternalFire.g:1049:2: rule__Statement__Group_1__3__Impl rule__Statement__Group_1__4
            {
            pushFollow(FOLLOW_14);
            rule__Statement__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__4();

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
    // $ANTLR end "rule__Statement__Group_1__3"


    // $ANTLR start "rule__Statement__Group_1__3__Impl"
    // InternalFire.g:1056:1: rule__Statement__Group_1__3__Impl : ( ( rule__Statement__ArgumentAssignment_1_3 ) ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1060:1: ( ( ( rule__Statement__ArgumentAssignment_1_3 ) ) )
            // InternalFire.g:1061:1: ( ( rule__Statement__ArgumentAssignment_1_3 ) )
            {
            // InternalFire.g:1061:1: ( ( rule__Statement__ArgumentAssignment_1_3 ) )
            // InternalFire.g:1062:2: ( rule__Statement__ArgumentAssignment_1_3 )
            {
             before(grammarAccess.getStatementAccess().getArgumentAssignment_1_3()); 
            // InternalFire.g:1063:2: ( rule__Statement__ArgumentAssignment_1_3 )
            // InternalFire.g:1063:3: rule__Statement__ArgumentAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ArgumentAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getArgumentAssignment_1_3()); 

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
    // $ANTLR end "rule__Statement__Group_1__3__Impl"


    // $ANTLR start "rule__Statement__Group_1__4"
    // InternalFire.g:1071:1: rule__Statement__Group_1__4 : rule__Statement__Group_1__4__Impl ;
    public final void rule__Statement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1075:1: ( rule__Statement__Group_1__4__Impl )
            // InternalFire.g:1076:2: rule__Statement__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__4__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__4"


    // $ANTLR start "rule__Statement__Group_1__4__Impl"
    // InternalFire.g:1082:1: rule__Statement__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1086:1: ( ( ')' ) )
            // InternalFire.g:1087:1: ( ')' )
            {
            // InternalFire.g:1087:1: ( ')' )
            // InternalFire.g:1088:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_4()); 

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
    // $ANTLR end "rule__Statement__Group_1__4__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalFire.g:1098:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1102:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalFire.g:1103:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalFire.g:1110:1: rule__Expression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1114:1: ( ( ruleAndExpression ) )
            // InternalFire.g:1115:1: ( ruleAndExpression )
            {
            // InternalFire.g:1115:1: ( ruleAndExpression )
            // InternalFire.g:1116:2: ruleAndExpression
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
    // InternalFire.g:1125:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1129:1: ( rule__Expression__Group__1__Impl )
            // InternalFire.g:1130:2: rule__Expression__Group__1__Impl
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
    // InternalFire.g:1136:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1140:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalFire.g:1141:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalFire.g:1141:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalFire.g:1142:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalFire.g:1143:2: ( rule__Expression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFire.g:1143:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalFire.g:1152:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1156:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFire.g:1157:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalFire.g:1164:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1168:1: ( ( () ) )
            // InternalFire.g:1169:1: ( () )
            {
            // InternalFire.g:1169:1: ( () )
            // InternalFire.g:1170:2: ()
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalFire.g:1171:2: ()
            // InternalFire.g:1171:3: 
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
    // InternalFire.g:1179:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1183:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalFire.g:1184:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:1191:1: rule__Expression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1195:1: ( ( 'or' ) )
            // InternalFire.g:1196:1: ( 'or' )
            {
            // InternalFire.g:1196:1: ( 'or' )
            // InternalFire.g:1197:2: 'or'
            {
             before(grammarAccess.getExpressionAccess().getOrKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalFire.g:1206:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1210:1: ( rule__Expression__Group_1__2__Impl )
            // InternalFire.g:1211:2: rule__Expression__Group_1__2__Impl
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
    // InternalFire.g:1217:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1221:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1222:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1222:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalFire.g:1223:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1224:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalFire.g:1224:3: rule__Expression__RightAssignment_1_2
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
    // InternalFire.g:1233:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1237:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalFire.g:1238:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFire.g:1245:1: rule__AndExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1249:1: ( ( ruleXorExpression ) )
            // InternalFire.g:1250:1: ( ruleXorExpression )
            {
            // InternalFire.g:1250:1: ( ruleXorExpression )
            // InternalFire.g:1251:2: ruleXorExpression
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
    // InternalFire.g:1260:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1264:1: ( rule__AndExpression__Group__1__Impl )
            // InternalFire.g:1265:2: rule__AndExpression__Group__1__Impl
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
    // InternalFire.g:1271:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1275:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalFire.g:1276:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalFire.g:1276:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalFire.g:1277:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalFire.g:1278:2: ( rule__AndExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFire.g:1278:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalFire.g:1287:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1291:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalFire.g:1292:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFire.g:1299:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1303:1: ( ( () ) )
            // InternalFire.g:1304:1: ( () )
            {
            // InternalFire.g:1304:1: ( () )
            // InternalFire.g:1305:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalFire.g:1306:2: ()
            // InternalFire.g:1306:3: 
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
    // InternalFire.g:1314:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1318:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalFire.g:1319:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:1326:1: rule__AndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1330:1: ( ( 'and' ) )
            // InternalFire.g:1331:1: ( 'and' )
            {
            // InternalFire.g:1331:1: ( 'and' )
            // InternalFire.g:1332:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalFire.g:1341:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1345:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalFire.g:1346:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalFire.g:1352:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1356:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1357:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1357:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1358:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1359:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalFire.g:1359:3: rule__AndExpression__RightAssignment_1_2
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
    // InternalFire.g:1368:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1372:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalFire.g:1373:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFire.g:1380:1: rule__XorExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1384:1: ( ( ruleEqualityExpression ) )
            // InternalFire.g:1385:1: ( ruleEqualityExpression )
            {
            // InternalFire.g:1385:1: ( ruleEqualityExpression )
            // InternalFire.g:1386:2: ruleEqualityExpression
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
    // InternalFire.g:1395:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1399:1: ( rule__XorExpression__Group__1__Impl )
            // InternalFire.g:1400:2: rule__XorExpression__Group__1__Impl
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
    // InternalFire.g:1406:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1410:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalFire.g:1411:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalFire.g:1411:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalFire.g:1412:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalFire.g:1413:2: ( rule__XorExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFire.g:1413:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFire.g:1422:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1426:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalFire.g:1427:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFire.g:1434:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1438:1: ( ( () ) )
            // InternalFire.g:1439:1: ( () )
            {
            // InternalFire.g:1439:1: ( () )
            // InternalFire.g:1440:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 
            // InternalFire.g:1441:2: ()
            // InternalFire.g:1441:3: 
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
    // InternalFire.g:1449:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1453:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalFire.g:1454:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:1461:1: rule__XorExpression__Group_1__1__Impl : ( 'xor' ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1465:1: ( ( 'xor' ) )
            // InternalFire.g:1466:1: ( 'xor' )
            {
            // InternalFire.g:1466:1: ( 'xor' )
            // InternalFire.g:1467:2: 'xor'
            {
             before(grammarAccess.getXorExpressionAccess().getXorKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalFire.g:1476:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1480:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalFire.g:1481:2: rule__XorExpression__Group_1__2__Impl
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
    // InternalFire.g:1487:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1491:1: ( ( ( rule__XorExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1492:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1492:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1493:2: ( rule__XorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1494:2: ( rule__XorExpression__RightAssignment_1_2 )
            // InternalFire.g:1494:3: rule__XorExpression__RightAssignment_1_2
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
    // InternalFire.g:1503:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1507:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalFire.g:1508:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFire.g:1515:1: rule__EqualityExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1519:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:1520:1: ( ruleComparisonExpression )
            {
            // InternalFire.g:1520:1: ( ruleComparisonExpression )
            // InternalFire.g:1521:2: ruleComparisonExpression
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
    // InternalFire.g:1530:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1534:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalFire.g:1535:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalFire.g:1541:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1545:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalFire.g:1546:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalFire.g:1546:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalFire.g:1547:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalFire.g:1548:2: ( rule__EqualityExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=16 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFire.g:1548:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFire.g:1557:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1561:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalFire.g:1562:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFire.g:1569:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1573:1: ( ( () ) )
            // InternalFire.g:1574:1: ( () )
            {
            // InternalFire.g:1574:1: ( () )
            // InternalFire.g:1575:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // InternalFire.g:1576:2: ()
            // InternalFire.g:1576:3: 
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
    // InternalFire.g:1584:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1588:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalFire.g:1589:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:1596:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1600:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1601:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1601:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1602:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1603:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1603:3: rule__EqualityExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1611:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1615:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalFire.g:1616:2: rule__EqualityExpression__Group_1__2__Impl
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
    // InternalFire.g:1622:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1626:1: ( ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1627:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1627:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1628:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1629:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            // InternalFire.g:1629:3: rule__EqualityExpression__RightAssignment_1_2
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
    // InternalFire.g:1638:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1642:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalFire.g:1643:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFire.g:1650:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1654:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:1655:1: ( ruleAdditiveExpression )
            {
            // InternalFire.g:1655:1: ( ruleAdditiveExpression )
            // InternalFire.g:1656:2: ruleAdditiveExpression
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
    // InternalFire.g:1665:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1669:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalFire.g:1670:2: rule__ComparisonExpression__Group__1__Impl
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
    // InternalFire.g:1676:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1680:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalFire.g:1681:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalFire.g:1681:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalFire.g:1682:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalFire.g:1683:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=18 && LA14_0<=21)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFire.g:1683:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalFire.g:1692:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1696:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalFire.g:1697:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFire.g:1704:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1708:1: ( ( () ) )
            // InternalFire.g:1709:1: ( () )
            {
            // InternalFire.g:1709:1: ( () )
            // InternalFire.g:1710:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalFire.g:1711:2: ()
            // InternalFire.g:1711:3: 
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
    // InternalFire.g:1719:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1723:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalFire.g:1724:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:1731:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1735:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1736:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1736:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1737:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1738:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1738:3: rule__ComparisonExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1746:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1750:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalFire.g:1751:2: rule__ComparisonExpression__Group_1__2__Impl
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
    // InternalFire.g:1757:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1761:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1762:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1762:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1763:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1764:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalFire.g:1764:3: rule__ComparisonExpression__RightAssignment_1_2
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
    // InternalFire.g:1773:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1777:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalFire.g:1778:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:1785:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1789:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:1790:1: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:1790:1: ( ruleMultiplicativeExpression )
            // InternalFire.g:1791:2: ruleMultiplicativeExpression
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
    // InternalFire.g:1800:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1804:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalFire.g:1805:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalFire.g:1811:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1815:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalFire.g:1816:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalFire.g:1816:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalFire.g:1817:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalFire.g:1818:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=22 && LA15_0<=23)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFire.g:1818:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalFire.g:1827:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1831:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalFire.g:1832:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:1839:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1843:1: ( ( () ) )
            // InternalFire.g:1844:1: ( () )
            {
            // InternalFire.g:1844:1: ( () )
            // InternalFire.g:1845:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0()); 
            // InternalFire.g:1846:2: ()
            // InternalFire.g:1846:3: 
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
    // InternalFire.g:1854:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1858:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalFire.g:1859:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:1866:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1870:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1871:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1871:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1872:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1873:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1873:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1881:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1885:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalFire.g:1886:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalFire.g:1892:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1896:1: ( ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1897:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1897:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1898:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1899:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            // InternalFire.g:1899:3: rule__AdditiveExpression__RightAssignment_1_2
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
    // InternalFire.g:1908:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1912:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalFire.g:1913:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFire.g:1920:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1924:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:1925:1: ( ruleTerminalExpression )
            {
            // InternalFire.g:1925:1: ( ruleTerminalExpression )
            // InternalFire.g:1926:2: ruleTerminalExpression
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
    // InternalFire.g:1935:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1939:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalFire.g:1940:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalFire.g:1946:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1950:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalFire.g:1951:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalFire.g:1951:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalFire.g:1952:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalFire.g:1953:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=24 && LA16_0<=27)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFire.g:1953:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalFire.g:1962:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1966:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalFire.g:1967:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFire.g:1974:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1978:1: ( ( () ) )
            // InternalFire.g:1979:1: ( () )
            {
            // InternalFire.g:1979:1: ( () )
            // InternalFire.g:1980:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0()); 
            // InternalFire.g:1981:2: ()
            // InternalFire.g:1981:3: 
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
    // InternalFire.g:1989:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1993:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalFire.g:1994:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:2001:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2005:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:2006:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:2006:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:2007:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:2008:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalFire.g:2008:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalFire.g:2016:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2020:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalFire.g:2021:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalFire.g:2027:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2031:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:2032:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:2032:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            // InternalFire.g:2033:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:2034:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            // InternalFire.g:2034:3: rule__MultiplicativeExpression__RightAssignment_1_2
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
    // InternalFire.g:2043:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2047:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalFire.g:2048:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFire.g:2055:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2059:1: ( ( () ) )
            // InternalFire.g:2060:1: ( () )
            {
            // InternalFire.g:2060:1: ( () )
            // InternalFire.g:2061:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_0_0()); 
            // InternalFire.g:2062:2: ()
            // InternalFire.g:2062:3: 
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
    // InternalFire.g:2070:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2074:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalFire.g:2075:2: rule__TerminalExpression__Group_0__1__Impl
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
    // InternalFire.g:2081:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2085:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalFire.g:2086:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalFire.g:2086:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalFire.g:2087:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // InternalFire.g:2088:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalFire.g:2088:3: rule__TerminalExpression__ValueAssignment_0_1
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
    // InternalFire.g:2097:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2101:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalFire.g:2102:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalFire.g:2109:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2113:1: ( ( () ) )
            // InternalFire.g:2114:1: ( () )
            {
            // InternalFire.g:2114:1: ( () )
            // InternalFire.g:2115:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            // InternalFire.g:2116:2: ()
            // InternalFire.g:2116:3: 
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
    // InternalFire.g:2124:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2128:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalFire.g:2129:2: rule__TerminalExpression__Group_1__1__Impl
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
    // InternalFire.g:2135:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__Alternatives_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2139:1: ( ( ( rule__TerminalExpression__Alternatives_1_1 ) ) )
            // InternalFire.g:2140:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            {
            // InternalFire.g:2140:1: ( ( rule__TerminalExpression__Alternatives_1_1 ) )
            // InternalFire.g:2141:2: ( rule__TerminalExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives_1_1()); 
            // InternalFire.g:2142:2: ( rule__TerminalExpression__Alternatives_1_1 )
            // InternalFire.g:2142:3: rule__TerminalExpression__Alternatives_1_1
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
    // InternalFire.g:2151:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2155:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalFire.g:2156:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFire.g:2163:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2167:1: ( ( () ) )
            // InternalFire.g:2168:1: ( () )
            {
            // InternalFire.g:2168:1: ( () )
            // InternalFire.g:2169:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalFire.g:2170:2: ()
            // InternalFire.g:2170:3: 
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
    // InternalFire.g:2178:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2182:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalFire.g:2183:2: rule__TerminalExpression__Group_2__1__Impl
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
    // InternalFire.g:2189:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2193:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalFire.g:2194:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalFire.g:2194:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalFire.g:2195:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // InternalFire.g:2196:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalFire.g:2196:3: rule__TerminalExpression__ValueAssignment_2_1
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
    // InternalFire.g:2205:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2209:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalFire.g:2210:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFire.g:2217:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2221:1: ( ( () ) )
            // InternalFire.g:2222:1: ( () )
            {
            // InternalFire.g:2222:1: ( () )
            // InternalFire.g:2223:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_3_0()); 
            // InternalFire.g:2224:2: ()
            // InternalFire.g:2224:3: 
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
    // InternalFire.g:2232:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2236:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalFire.g:2237:2: rule__TerminalExpression__Group_3__1__Impl
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
    // InternalFire.g:2243:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2247:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalFire.g:2248:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalFire.g:2248:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalFire.g:2249:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // InternalFire.g:2250:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalFire.g:2250:3: rule__TerminalExpression__ValueAssignment_3_1
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
    // InternalFire.g:2259:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2263:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalFire.g:2264:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFire.g:2271:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2275:1: ( ( () ) )
            // InternalFire.g:2276:1: ( () )
            {
            // InternalFire.g:2276:1: ( () )
            // InternalFire.g:2277:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_4_0()); 
            // InternalFire.g:2278:2: ()
            // InternalFire.g:2278:3: 
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
    // InternalFire.g:2286:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2290:1: ( rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2 )
            // InternalFire.g:2291:2: rule__TerminalExpression__Group_4__1__Impl rule__TerminalExpression__Group_4__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:2298:1: rule__TerminalExpression__Group_4__1__Impl : ( 'not' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2302:1: ( ( 'not' ) )
            // InternalFire.g:2303:1: ( 'not' )
            {
            // InternalFire.g:2303:1: ( 'not' )
            // InternalFire.g:2304:2: 'not'
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotKeyword_4_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalFire.g:2313:1: rule__TerminalExpression__Group_4__2 : rule__TerminalExpression__Group_4__2__Impl ;
    public final void rule__TerminalExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2317:1: ( rule__TerminalExpression__Group_4__2__Impl )
            // InternalFire.g:2318:2: rule__TerminalExpression__Group_4__2__Impl
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
    // InternalFire.g:2324:1: rule__TerminalExpression__Group_4__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) ;
    public final void rule__TerminalExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2328:1: ( ( ( rule__TerminalExpression__OperandAssignment_4_2 ) ) )
            // InternalFire.g:2329:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            {
            // InternalFire.g:2329:1: ( ( rule__TerminalExpression__OperandAssignment_4_2 ) )
            // InternalFire.g:2330:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_4_2()); 
            // InternalFire.g:2331:2: ( rule__TerminalExpression__OperandAssignment_4_2 )
            // InternalFire.g:2331:3: rule__TerminalExpression__OperandAssignment_4_2
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
    // InternalFire.g:2340:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2344:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalFire.g:2345:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFire.g:2352:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2356:1: ( ( () ) )
            // InternalFire.g:2357:1: ( () )
            {
            // InternalFire.g:2357:1: ( () )
            // InternalFire.g:2358:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_5_0()); 
            // InternalFire.g:2359:2: ()
            // InternalFire.g:2359:3: 
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
    // InternalFire.g:2367:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2371:1: ( rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 )
            // InternalFire.g:2372:2: rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:2379:1: rule__TerminalExpression__Group_5__1__Impl : ( '-' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2383:1: ( ( '-' ) )
            // InternalFire.g:2384:1: ( '-' )
            {
            // InternalFire.g:2384:1: ( '-' )
            // InternalFire.g:2385:2: '-'
            {
             before(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalFire.g:2394:1: rule__TerminalExpression__Group_5__2 : rule__TerminalExpression__Group_5__2__Impl ;
    public final void rule__TerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2398:1: ( rule__TerminalExpression__Group_5__2__Impl )
            // InternalFire.g:2399:2: rule__TerminalExpression__Group_5__2__Impl
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
    // InternalFire.g:2405:1: rule__TerminalExpression__Group_5__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) ;
    public final void rule__TerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2409:1: ( ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) )
            // InternalFire.g:2410:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            {
            // InternalFire.g:2410:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            // InternalFire.g:2411:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 
            // InternalFire.g:2412:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            // InternalFire.g:2412:3: rule__TerminalExpression__OperandAssignment_5_2
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
    // InternalFire.g:2421:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2425:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalFire.g:2426:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:2433:1: rule__TerminalExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2437:1: ( ( '(' ) )
            // InternalFire.g:2438:1: ( '(' )
            {
            // InternalFire.g:2438:1: ( '(' )
            // InternalFire.g:2439:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalFire.g:2448:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2452:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // InternalFire.g:2453:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalFire.g:2460:1: rule__TerminalExpression__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2464:1: ( ( ruleExpression ) )
            // InternalFire.g:2465:1: ( ruleExpression )
            {
            // InternalFire.g:2465:1: ( ruleExpression )
            // InternalFire.g:2466:2: ruleExpression
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
    // InternalFire.g:2475:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2479:1: ( rule__TerminalExpression__Group_6__2__Impl )
            // InternalFire.g:2480:2: rule__TerminalExpression__Group_6__2__Impl
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
    // InternalFire.g:2486:1: rule__TerminalExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2490:1: ( ( ')' ) )
            // InternalFire.g:2491:1: ( ')' )
            {
            // InternalFire.g:2491:1: ( ')' )
            // InternalFire.g:2492:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_6_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFire.g:2502:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2506:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalFire.g:2507:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFire.g:2514:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2518:1: ( ( RULE_INT ) )
            // InternalFire.g:2519:1: ( RULE_INT )
            {
            // InternalFire.g:2519:1: ( RULE_INT )
            // InternalFire.g:2520:2: RULE_INT
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
    // InternalFire.g:2529:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2533:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalFire.g:2534:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalFire.g:2541:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2545:1: ( ( '.' ) )
            // InternalFire.g:2546:1: ( '.' )
            {
            // InternalFire.g:2546:1: ( '.' )
            // InternalFire.g:2547:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalFire.g:2556:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2560:1: ( rule__Double__Group__2__Impl )
            // InternalFire.g:2561:2: rule__Double__Group__2__Impl
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
    // InternalFire.g:2567:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2571:1: ( ( RULE_INT ) )
            // InternalFire.g:2572:1: ( RULE_INT )
            {
            // InternalFire.g:2572:1: ( RULE_INT )
            // InternalFire.g:2573:2: RULE_INT
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
    // InternalFire.g:2583:1: rule__Program__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2587:1: ( ( ruleStatement ) )
            // InternalFire.g:2588:2: ( ruleStatement )
            {
            // InternalFire.g:2588:2: ( ruleStatement )
            // InternalFire.g:2589:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__Statement__NameAssignment_0_2"
    // InternalFire.g:2598:1: rule__Statement__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2602:1: ( ( RULE_ID ) )
            // InternalFire.g:2603:2: ( RULE_ID )
            {
            // InternalFire.g:2603:2: ( RULE_ID )
            // InternalFire.g:2604:3: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Statement__NameAssignment_0_2"


    // $ANTLR start "rule__Statement__TypeAssignment_0_4"
    // InternalFire.g:2613:1: rule__Statement__TypeAssignment_0_4 : ( ruleBuiltInType ) ;
    public final void rule__Statement__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2617:1: ( ( ruleBuiltInType ) )
            // InternalFire.g:2618:2: ( ruleBuiltInType )
            {
            // InternalFire.g:2618:2: ( ruleBuiltInType )
            // InternalFire.g:2619:3: ruleBuiltInType
            {
             before(grammarAccess.getStatementAccess().getTypeBuiltInTypeEnumRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBuiltInType();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTypeBuiltInTypeEnumRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__Statement__TypeAssignment_0_4"


    // $ANTLR start "rule__Statement__ValueAssignment_0_6"
    // InternalFire.g:2628:1: rule__Statement__ValueAssignment_0_6 : ( ruleExpression ) ;
    public final void rule__Statement__ValueAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2632:1: ( ( ruleExpression ) )
            // InternalFire.g:2633:2: ( ruleExpression )
            {
            // InternalFire.g:2633:2: ( ruleExpression )
            // InternalFire.g:2634:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_0_6_0()); 

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
    // $ANTLR end "rule__Statement__ValueAssignment_0_6"


    // $ANTLR start "rule__Statement__ArgumentAssignment_1_3"
    // InternalFire.g:2643:1: rule__Statement__ArgumentAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__Statement__ArgumentAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2647:1: ( ( ruleExpression ) )
            // InternalFire.g:2648:2: ( ruleExpression )
            {
            // InternalFire.g:2648:2: ( ruleExpression )
            // InternalFire.g:2649:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Statement__ArgumentAssignment_1_3"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalFire.g:2658:1: rule__Expression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2662:1: ( ( ruleAndExpression ) )
            // InternalFire.g:2663:2: ( ruleAndExpression )
            {
            // InternalFire.g:2663:2: ( ruleAndExpression )
            // InternalFire.g:2664:3: ruleAndExpression
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
    // InternalFire.g:2673:1: rule__AndExpression__RightAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2677:1: ( ( ruleXorExpression ) )
            // InternalFire.g:2678:2: ( ruleXorExpression )
            {
            // InternalFire.g:2678:2: ( ruleXorExpression )
            // InternalFire.g:2679:3: ruleXorExpression
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
    // InternalFire.g:2688:1: rule__XorExpression__RightAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2692:1: ( ( ruleEqualityExpression ) )
            // InternalFire.g:2693:2: ( ruleEqualityExpression )
            {
            // InternalFire.g:2693:2: ( ruleEqualityExpression )
            // InternalFire.g:2694:3: ruleEqualityExpression
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
    // InternalFire.g:2703:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2707:1: ( ( ruleEqualityOperator ) )
            // InternalFire.g:2708:2: ( ruleEqualityOperator )
            {
            // InternalFire.g:2708:2: ( ruleEqualityOperator )
            // InternalFire.g:2709:3: ruleEqualityOperator
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
    // InternalFire.g:2718:1: rule__EqualityExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2722:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:2723:2: ( ruleComparisonExpression )
            {
            // InternalFire.g:2723:2: ( ruleComparisonExpression )
            // InternalFire.g:2724:3: ruleComparisonExpression
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
    // InternalFire.g:2733:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2737:1: ( ( ruleComparisonOperator ) )
            // InternalFire.g:2738:2: ( ruleComparisonOperator )
            {
            // InternalFire.g:2738:2: ( ruleComparisonOperator )
            // InternalFire.g:2739:3: ruleComparisonOperator
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
    // InternalFire.g:2748:1: rule__ComparisonExpression__RightAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2752:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:2753:2: ( ruleAdditiveExpression )
            {
            // InternalFire.g:2753:2: ( ruleAdditiveExpression )
            // InternalFire.g:2754:3: ruleAdditiveExpression
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
    // InternalFire.g:2763:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2767:1: ( ( ruleAdditiveOperator ) )
            // InternalFire.g:2768:2: ( ruleAdditiveOperator )
            {
            // InternalFire.g:2768:2: ( ruleAdditiveOperator )
            // InternalFire.g:2769:3: ruleAdditiveOperator
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
    // InternalFire.g:2778:1: rule__AdditiveExpression__RightAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2782:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:2783:2: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:2783:2: ( ruleMultiplicativeExpression )
            // InternalFire.g:2784:3: ruleMultiplicativeExpression
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
    // InternalFire.g:2793:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2797:1: ( ( ruleMultiplicativeOperator ) )
            // InternalFire.g:2798:2: ( ruleMultiplicativeOperator )
            {
            // InternalFire.g:2798:2: ( ruleMultiplicativeOperator )
            // InternalFire.g:2799:3: ruleMultiplicativeOperator
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
    // InternalFire.g:2808:1: rule__MultiplicativeExpression__RightAssignment_1_2 : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2812:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2813:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2813:2: ( ruleTerminalExpression )
            // InternalFire.g:2814:3: ruleTerminalExpression
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
    // InternalFire.g:2823:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2827:1: ( ( RULE_STRING ) )
            // InternalFire.g:2828:2: ( RULE_STRING )
            {
            // InternalFire.g:2828:2: ( RULE_STRING )
            // InternalFire.g:2829:3: RULE_STRING
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
    // InternalFire.g:2838:1: rule__TerminalExpression__ValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2842:1: ( ( ( 'true' ) ) )
            // InternalFire.g:2843:2: ( ( 'true' ) )
            {
            // InternalFire.g:2843:2: ( ( 'true' ) )
            // InternalFire.g:2844:3: ( 'true' )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            // InternalFire.g:2845:3: ( 'true' )
            // InternalFire.g:2846:4: 'true'
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_1_1_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalFire.g:2857:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ruleLong ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2861:1: ( ( ruleLong ) )
            // InternalFire.g:2862:2: ( ruleLong )
            {
            // InternalFire.g:2862:2: ( ruleLong )
            // InternalFire.g:2863:3: ruleLong
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
    // InternalFire.g:2872:1: rule__TerminalExpression__ValueAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2876:1: ( ( ruleDouble ) )
            // InternalFire.g:2877:2: ( ruleDouble )
            {
            // InternalFire.g:2877:2: ( ruleDouble )
            // InternalFire.g:2878:3: ruleDouble
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
    // InternalFire.g:2887:1: rule__TerminalExpression__OperandAssignment_4_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2891:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2892:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2892:2: ( ruleTerminalExpression )
            // InternalFire.g:2893:3: ruleTerminalExpression
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
    // InternalFire.g:2902:1: rule__TerminalExpression__OperandAssignment_5_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2906:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2907:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:2907:2: ( ruleTerminalExpression )
            // InternalFire.g:2908:3: ruleTerminalExpression
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000260000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000028400800850L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});

}