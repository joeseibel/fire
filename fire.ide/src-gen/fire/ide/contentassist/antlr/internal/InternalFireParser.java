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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'false'", "'String'", "'Boolean'", "'Integer'", "'Real'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'program'", "'end'", "':'", "':='", "'while'", "'do'", "'writeln'", "'('", "')'", "'or'", "'and'", "'xor'", "'not'", "'.'", "'const'", "'true'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
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
    // InternalFire.g:432:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:436:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
            case 43:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            default:
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
                case 3 :
                    // InternalFire.g:449:2: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // InternalFire.g:449:2: ( ( rule__Statement__Group_2__0 ) )
                    // InternalFire.g:450:3: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // InternalFire.g:451:3: ( rule__Statement__Group_2__0 )
                    // InternalFire.g:451:4: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:455:2: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // InternalFire.g:455:2: ( ( rule__Statement__Group_3__0 ) )
                    // InternalFire.g:456:3: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // InternalFire.g:457:3: ( rule__Statement__Group_3__0 )
                    // InternalFire.g:457:4: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Statement__Alternatives_0_1"
    // InternalFire.g:465:1: rule__Statement__Alternatives_0_1 : ( ( ( rule__Statement__ConstantAssignment_0_1_0 ) ) | ( 'var' ) );
    public final void rule__Statement__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:469:1: ( ( ( rule__Statement__ConstantAssignment_0_1_0 ) ) | ( 'var' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==43) ) {
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
                    // InternalFire.g:470:2: ( ( rule__Statement__ConstantAssignment_0_1_0 ) )
                    {
                    // InternalFire.g:470:2: ( ( rule__Statement__ConstantAssignment_0_1_0 ) )
                    // InternalFire.g:471:3: ( rule__Statement__ConstantAssignment_0_1_0 )
                    {
                     before(grammarAccess.getStatementAccess().getConstantAssignment_0_1_0()); 
                    // InternalFire.g:472:3: ( rule__Statement__ConstantAssignment_0_1_0 )
                    // InternalFire.g:472:4: rule__Statement__ConstantAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__ConstantAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getConstantAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:476:2: ( 'var' )
                    {
                    // InternalFire.g:476:2: ( 'var' )
                    // InternalFire.g:477:3: 'var'
                    {
                     before(grammarAccess.getStatementAccess().getVarKeyword_0_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStatementAccess().getVarKeyword_0_1_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives_0_1"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalFire.g:486:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:490:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalFire.g:491:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalFire.g:491:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalFire.g:492:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalFire.g:493:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalFire.g:493:4: rule__TerminalExpression__Group_0__0
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
                    // InternalFire.g:497:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalFire.g:497:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalFire.g:498:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalFire.g:499:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalFire.g:499:4: rule__TerminalExpression__Group_1__0
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
                    // InternalFire.g:503:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalFire.g:503:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalFire.g:504:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // InternalFire.g:505:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalFire.g:505:4: rule__TerminalExpression__Group_2__0
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
                    // InternalFire.g:509:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalFire.g:509:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalFire.g:510:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    // InternalFire.g:511:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalFire.g:511:4: rule__TerminalExpression__Group_3__0
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
                    // InternalFire.g:515:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalFire.g:515:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalFire.g:516:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    // InternalFire.g:517:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalFire.g:517:4: rule__TerminalExpression__Group_4__0
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
                    // InternalFire.g:521:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalFire.g:521:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalFire.g:522:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    // InternalFire.g:523:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalFire.g:523:4: rule__TerminalExpression__Group_5__0
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
                    // InternalFire.g:527:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalFire.g:527:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalFire.g:528:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    // InternalFire.g:529:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalFire.g:529:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalFire.g:533:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    {
                    // InternalFire.g:533:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    // InternalFire.g:534:3: ( rule__TerminalExpression__Group_7__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    // InternalFire.g:535:3: ( rule__TerminalExpression__Group_7__0 )
                    // InternalFire.g:535:4: rule__TerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 

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


    // $ANTLR start "rule__TerminalExpression__Alternatives_2_1"
    // InternalFire.g:543:1: rule__TerminalExpression__Alternatives_2_1 : ( ( ( rule__TerminalExpression__ValueAssignment_2_1_0 ) ) | ( 'false' ) );
    public final void rule__TerminalExpression__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:547:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1_0 ) ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFire.g:548:2: ( ( rule__TerminalExpression__ValueAssignment_2_1_0 ) )
                    {
                    // InternalFire.g:548:2: ( ( rule__TerminalExpression__ValueAssignment_2_1_0 ) )
                    // InternalFire.g:549:3: ( rule__TerminalExpression__ValueAssignment_2_1_0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1_0()); 
                    // InternalFire.g:550:3: ( rule__TerminalExpression__ValueAssignment_2_1_0 )
                    // InternalFire.g:550:4: rule__TerminalExpression__ValueAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__ValueAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:554:2: ( 'false' )
                    {
                    // InternalFire.g:554:2: ( 'false' )
                    // InternalFire.g:555:3: 'false'
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getFalseKeyword_2_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTerminalExpressionAccess().getFalseKeyword_2_1_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Alternatives_2_1"


    // $ANTLR start "rule__BuiltInType__Alternatives"
    // InternalFire.g:564:1: rule__BuiltInType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'Real' ) ) );
    public final void rule__BuiltInType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:568:1: ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'Real' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFire.g:569:2: ( ( 'String' ) )
                    {
                    // InternalFire.g:569:2: ( ( 'String' ) )
                    // InternalFire.g:570:3: ( 'String' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalFire.g:571:3: ( 'String' )
                    // InternalFire.g:571:4: 'String'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:575:2: ( ( 'Boolean' ) )
                    {
                    // InternalFire.g:575:2: ( ( 'Boolean' ) )
                    // InternalFire.g:576:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalFire.g:577:3: ( 'Boolean' )
                    // InternalFire.g:577:4: 'Boolean'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getBOOLEANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:581:2: ( ( 'Integer' ) )
                    {
                    // InternalFire.g:581:2: ( ( 'Integer' ) )
                    // InternalFire.g:582:3: ( 'Integer' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
                    // InternalFire.g:583:3: ( 'Integer' )
                    // InternalFire.g:583:4: 'Integer'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBuiltInTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:587:2: ( ( 'Real' ) )
                    {
                    // InternalFire.g:587:2: ( ( 'Real' ) )
                    // InternalFire.g:588:3: ( 'Real' )
                    {
                     before(grammarAccess.getBuiltInTypeAccess().getREALEnumLiteralDeclaration_3()); 
                    // InternalFire.g:589:3: ( 'Real' )
                    // InternalFire.g:589:4: 'Real'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalFire.g:597:1: rule__EqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__EqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:601:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFire.g:602:2: ( ( '=' ) )
                    {
                    // InternalFire.g:602:2: ( ( '=' ) )
                    // InternalFire.g:603:3: ( '=' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:604:3: ( '=' )
                    // InternalFire.g:604:4: '='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEqualityOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:608:2: ( ( '<>' ) )
                    {
                    // InternalFire.g:608:2: ( ( '<>' ) )
                    // InternalFire.g:609:3: ( '<>' )
                    {
                     before(grammarAccess.getEqualityOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    // InternalFire.g:610:3: ( '<>' )
                    // InternalFire.g:610:4: '<>'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalFire.g:618:1: rule__ComparisonOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:622:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFire.g:623:2: ( ( '<' ) )
                    {
                    // InternalFire.g:623:2: ( ( '<' ) )
                    // InternalFire.g:624:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalFire.g:625:3: ( '<' )
                    // InternalFire.g:625:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:629:2: ( ( '<=' ) )
                    {
                    // InternalFire.g:629:2: ( ( '<=' ) )
                    // InternalFire.g:630:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalFire.g:631:3: ( '<=' )
                    // InternalFire.g:631:4: '<='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:635:2: ( ( '>' ) )
                    {
                    // InternalFire.g:635:2: ( ( '>' ) )
                    // InternalFire.g:636:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    // InternalFire.g:637:3: ( '>' )
                    // InternalFire.g:637:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:641:2: ( ( '>=' ) )
                    {
                    // InternalFire.g:641:2: ( ( '>=' ) )
                    // InternalFire.g:642:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALEnumLiteralDeclaration_3()); 
                    // InternalFire.g:643:3: ( '>=' )
                    // InternalFire.g:643:4: '>='
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalFire.g:651:1: rule__AdditiveOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:655:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFire.g:656:2: ( ( '+' ) )
                    {
                    // InternalFire.g:656:2: ( ( '+' ) )
                    // InternalFire.g:657:3: ( '+' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalFire.g:658:3: ( '+' )
                    // InternalFire.g:658:4: '+'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:662:2: ( ( '-' ) )
                    {
                    // InternalFire.g:662:2: ( ( '-' ) )
                    // InternalFire.g:663:3: ( '-' )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalFire.g:664:3: ( '-' )
                    // InternalFire.g:664:4: '-'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalFire.g:672:1: rule__MultiplicativeOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:676:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFire.g:677:2: ( ( '*' ) )
                    {
                    // InternalFire.g:677:2: ( ( '*' ) )
                    // InternalFire.g:678:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalFire.g:679:3: ( '*' )
                    // InternalFire.g:679:4: '*'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFire.g:683:2: ( ( '/' ) )
                    {
                    // InternalFire.g:683:2: ( ( '/' ) )
                    // InternalFire.g:684:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 
                    // InternalFire.g:685:3: ( '/' )
                    // InternalFire.g:685:4: '/'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getREAL_DIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFire.g:689:2: ( ( 'div' ) )
                    {
                    // InternalFire.g:689:2: ( ( 'div' ) )
                    // InternalFire.g:690:3: ( 'div' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 
                    // InternalFire.g:691:3: ( 'div' )
                    // InternalFire.g:691:4: 'div'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getINTEGER_DIVIDEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFire.g:695:2: ( ( 'mod' ) )
                    {
                    // InternalFire.g:695:2: ( ( 'mod' ) )
                    // InternalFire.g:696:3: ( 'mod' )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMODULUSEnumLiteralDeclaration_3()); 
                    // InternalFire.g:697:3: ( 'mod' )
                    // InternalFire.g:697:4: 'mod'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalFire.g:705:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:709:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFire.g:710:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalFire.g:717:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:721:1: ( ( () ) )
            // InternalFire.g:722:1: ( () )
            {
            // InternalFire.g:722:1: ( () )
            // InternalFire.g:723:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalFire.g:724:2: ()
            // InternalFire.g:724:3: 
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
    // InternalFire.g:732:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:736:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalFire.g:737:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalFire.g:744:1: rule__Program__Group__1__Impl : ( 'program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:748:1: ( ( 'program' ) )
            // InternalFire.g:749:1: ( 'program' )
            {
            // InternalFire.g:749:1: ( 'program' )
            // InternalFire.g:750:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFire.g:759:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:763:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalFire.g:764:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalFire.g:771:1: rule__Program__Group__2__Impl : ( ( rule__Program__StatementsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:775:1: ( ( ( rule__Program__StatementsAssignment_2 )* ) )
            // InternalFire.g:776:1: ( ( rule__Program__StatementsAssignment_2 )* )
            {
            // InternalFire.g:776:1: ( ( rule__Program__StatementsAssignment_2 )* )
            // InternalFire.g:777:2: ( rule__Program__StatementsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment_2()); 
            // InternalFire.g:778:2: ( rule__Program__StatementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==11||LA10_0==33||LA10_0==35||LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFire.g:778:3: rule__Program__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalFire.g:786:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:790:1: ( rule__Program__Group__3__Impl )
            // InternalFire.g:791:2: rule__Program__Group__3__Impl
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
    // InternalFire.g:797:1: rule__Program__Group__3__Impl : ( 'end' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:801:1: ( ( 'end' ) )
            // InternalFire.g:802:1: ( 'end' )
            {
            // InternalFire.g:802:1: ( 'end' )
            // InternalFire.g:803:2: 'end'
            {
             before(grammarAccess.getProgramAccess().getEndKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFire.g:813:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:817:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalFire.g:818:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalFire.g:825:1: rule__Statement__Group_0__0__Impl : ( () ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:829:1: ( ( () ) )
            // InternalFire.g:830:1: ( () )
            {
            // InternalFire.g:830:1: ( () )
            // InternalFire.g:831:2: ()
            {
             before(grammarAccess.getStatementAccess().getVariableDeclarationAction_0_0()); 
            // InternalFire.g:832:2: ()
            // InternalFire.g:832:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getVariableDeclarationAction_0_0()); 

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
    // InternalFire.g:840:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:844:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalFire.g:845:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
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
    // InternalFire.g:852:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__Alternatives_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:856:1: ( ( ( rule__Statement__Alternatives_0_1 ) ) )
            // InternalFire.g:857:1: ( ( rule__Statement__Alternatives_0_1 ) )
            {
            // InternalFire.g:857:1: ( ( rule__Statement__Alternatives_0_1 ) )
            // InternalFire.g:858:2: ( rule__Statement__Alternatives_0_1 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0_1()); 
            // InternalFire.g:859:2: ( rule__Statement__Alternatives_0_1 )
            // InternalFire.g:859:3: rule__Statement__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_0_1()); 

            }


            }

        }
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
    // InternalFire.g:867:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl rule__Statement__Group_0__3 ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:871:1: ( rule__Statement__Group_0__2__Impl rule__Statement__Group_0__3 )
            // InternalFire.g:872:2: rule__Statement__Group_0__2__Impl rule__Statement__Group_0__3
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
    // InternalFire.g:879:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__NameAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:883:1: ( ( ( rule__Statement__NameAssignment_0_2 ) ) )
            // InternalFire.g:884:1: ( ( rule__Statement__NameAssignment_0_2 ) )
            {
            // InternalFire.g:884:1: ( ( rule__Statement__NameAssignment_0_2 ) )
            // InternalFire.g:885:2: ( rule__Statement__NameAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0_2()); 
            // InternalFire.g:886:2: ( rule__Statement__NameAssignment_0_2 )
            // InternalFire.g:886:3: rule__Statement__NameAssignment_0_2
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
    // InternalFire.g:894:1: rule__Statement__Group_0__3 : rule__Statement__Group_0__3__Impl rule__Statement__Group_0__4 ;
    public final void rule__Statement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:898:1: ( rule__Statement__Group_0__3__Impl rule__Statement__Group_0__4 )
            // InternalFire.g:899:2: rule__Statement__Group_0__3__Impl rule__Statement__Group_0__4
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
    // InternalFire.g:906:1: rule__Statement__Group_0__3__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:910:1: ( ( ':' ) )
            // InternalFire.g:911:1: ( ':' )
            {
            // InternalFire.g:911:1: ( ':' )
            // InternalFire.g:912:2: ':'
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
    // InternalFire.g:921:1: rule__Statement__Group_0__4 : rule__Statement__Group_0__4__Impl rule__Statement__Group_0__5 ;
    public final void rule__Statement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:925:1: ( rule__Statement__Group_0__4__Impl rule__Statement__Group_0__5 )
            // InternalFire.g:926:2: rule__Statement__Group_0__4__Impl rule__Statement__Group_0__5
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
    // InternalFire.g:933:1: rule__Statement__Group_0__4__Impl : ( ( rule__Statement__TypeAssignment_0_4 ) ) ;
    public final void rule__Statement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:937:1: ( ( ( rule__Statement__TypeAssignment_0_4 ) ) )
            // InternalFire.g:938:1: ( ( rule__Statement__TypeAssignment_0_4 ) )
            {
            // InternalFire.g:938:1: ( ( rule__Statement__TypeAssignment_0_4 ) )
            // InternalFire.g:939:2: ( rule__Statement__TypeAssignment_0_4 )
            {
             before(grammarAccess.getStatementAccess().getTypeAssignment_0_4()); 
            // InternalFire.g:940:2: ( rule__Statement__TypeAssignment_0_4 )
            // InternalFire.g:940:3: rule__Statement__TypeAssignment_0_4
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
    // InternalFire.g:948:1: rule__Statement__Group_0__5 : rule__Statement__Group_0__5__Impl rule__Statement__Group_0__6 ;
    public final void rule__Statement__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:952:1: ( rule__Statement__Group_0__5__Impl rule__Statement__Group_0__6 )
            // InternalFire.g:953:2: rule__Statement__Group_0__5__Impl rule__Statement__Group_0__6
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
    // InternalFire.g:960:1: rule__Statement__Group_0__5__Impl : ( ':=' ) ;
    public final void rule__Statement__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:964:1: ( ( ':=' ) )
            // InternalFire.g:965:1: ( ':=' )
            {
            // InternalFire.g:965:1: ( ':=' )
            // InternalFire.g:966:2: ':='
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
    // InternalFire.g:975:1: rule__Statement__Group_0__6 : rule__Statement__Group_0__6__Impl ;
    public final void rule__Statement__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:979:1: ( rule__Statement__Group_0__6__Impl )
            // InternalFire.g:980:2: rule__Statement__Group_0__6__Impl
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
    // InternalFire.g:986:1: rule__Statement__Group_0__6__Impl : ( ( rule__Statement__ValueAssignment_0_6 ) ) ;
    public final void rule__Statement__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:990:1: ( ( ( rule__Statement__ValueAssignment_0_6 ) ) )
            // InternalFire.g:991:1: ( ( rule__Statement__ValueAssignment_0_6 ) )
            {
            // InternalFire.g:991:1: ( ( rule__Statement__ValueAssignment_0_6 ) )
            // InternalFire.g:992:2: ( rule__Statement__ValueAssignment_0_6 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_0_6()); 
            // InternalFire.g:993:2: ( rule__Statement__ValueAssignment_0_6 )
            // InternalFire.g:993:3: rule__Statement__ValueAssignment_0_6
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
    // InternalFire.g:1002:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1006:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalFire.g:1007:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalFire.g:1014:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1018:1: ( ( () ) )
            // InternalFire.g:1019:1: ( () )
            {
            // InternalFire.g:1019:1: ( () )
            // InternalFire.g:1020:2: ()
            {
             before(grammarAccess.getStatementAccess().getAssignmentStatementAction_1_0()); 
            // InternalFire.g:1021:2: ()
            // InternalFire.g:1021:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getAssignmentStatementAction_1_0()); 

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
    // InternalFire.g:1029:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1033:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalFire.g:1034:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFire.g:1041:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__VariableAssignment_1_1 ) ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1045:1: ( ( ( rule__Statement__VariableAssignment_1_1 ) ) )
            // InternalFire.g:1046:1: ( ( rule__Statement__VariableAssignment_1_1 ) )
            {
            // InternalFire.g:1046:1: ( ( rule__Statement__VariableAssignment_1_1 ) )
            // InternalFire.g:1047:2: ( rule__Statement__VariableAssignment_1_1 )
            {
             before(grammarAccess.getStatementAccess().getVariableAssignment_1_1()); 
            // InternalFire.g:1048:2: ( rule__Statement__VariableAssignment_1_1 )
            // InternalFire.g:1048:3: rule__Statement__VariableAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__VariableAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getVariableAssignment_1_1()); 

            }


            }

        }
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
    // InternalFire.g:1056:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1060:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // InternalFire.g:1061:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
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
    // InternalFire.g:1068:1: rule__Statement__Group_1__2__Impl : ( ':=' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1072:1: ( ( ':=' ) )
            // InternalFire.g:1073:1: ( ':=' )
            {
            // InternalFire.g:1073:1: ( ':=' )
            // InternalFire.g:1074:2: ':='
            {
             before(grammarAccess.getStatementAccess().getColonEqualsSignKeyword_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonEqualsSignKeyword_1_2()); 

            }


            }

        }
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
    // InternalFire.g:1083:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1087:1: ( rule__Statement__Group_1__3__Impl )
            // InternalFire.g:1088:2: rule__Statement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__3__Impl();

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
    // InternalFire.g:1094:1: rule__Statement__Group_1__3__Impl : ( ( rule__Statement__ValueAssignment_1_3 ) ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1098:1: ( ( ( rule__Statement__ValueAssignment_1_3 ) ) )
            // InternalFire.g:1099:1: ( ( rule__Statement__ValueAssignment_1_3 ) )
            {
            // InternalFire.g:1099:1: ( ( rule__Statement__ValueAssignment_1_3 ) )
            // InternalFire.g:1100:2: ( rule__Statement__ValueAssignment_1_3 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_1_3()); 
            // InternalFire.g:1101:2: ( rule__Statement__ValueAssignment_1_3 )
            // InternalFire.g:1101:3: rule__Statement__ValueAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ValueAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValueAssignment_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Statement__Group_2__0"
    // InternalFire.g:1110:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1114:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // InternalFire.g:1115:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__1();

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
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // InternalFire.g:1122:1: rule__Statement__Group_2__0__Impl : ( () ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1126:1: ( ( () ) )
            // InternalFire.g:1127:1: ( () )
            {
            // InternalFire.g:1127:1: ( () )
            // InternalFire.g:1128:2: ()
            {
             before(grammarAccess.getStatementAccess().getWhileLoopAction_2_0()); 
            // InternalFire.g:1129:2: ()
            // InternalFire.g:1129:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getWhileLoopAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // InternalFire.g:1137:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1141:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // InternalFire.g:1142:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__2();

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
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // InternalFire.g:1149:1: rule__Statement__Group_2__1__Impl : ( 'while' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1153:1: ( ( 'while' ) )
            // InternalFire.g:1154:1: ( 'while' )
            {
            // InternalFire.g:1154:1: ( 'while' )
            // InternalFire.g:1155:2: 'while'
            {
             before(grammarAccess.getStatementAccess().getWhileKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getWhileKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__2"
    // InternalFire.g:1164:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1168:1: ( rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 )
            // InternalFire.g:1169:2: rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3
            {
            pushFollow(FOLLOW_13);
            rule__Statement__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__3();

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
    // $ANTLR end "rule__Statement__Group_2__2"


    // $ANTLR start "rule__Statement__Group_2__2__Impl"
    // InternalFire.g:1176:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__ConditionAssignment_2_2 ) ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1180:1: ( ( ( rule__Statement__ConditionAssignment_2_2 ) ) )
            // InternalFire.g:1181:1: ( ( rule__Statement__ConditionAssignment_2_2 ) )
            {
            // InternalFire.g:1181:1: ( ( rule__Statement__ConditionAssignment_2_2 ) )
            // InternalFire.g:1182:2: ( rule__Statement__ConditionAssignment_2_2 )
            {
             before(grammarAccess.getStatementAccess().getConditionAssignment_2_2()); 
            // InternalFire.g:1183:2: ( rule__Statement__ConditionAssignment_2_2 )
            // InternalFire.g:1183:3: rule__Statement__ConditionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ConditionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getConditionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2__Impl"


    // $ANTLR start "rule__Statement__Group_2__3"
    // InternalFire.g:1191:1: rule__Statement__Group_2__3 : rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 ;
    public final void rule__Statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1195:1: ( rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4 )
            // InternalFire.g:1196:2: rule__Statement__Group_2__3__Impl rule__Statement__Group_2__4
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__4();

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
    // $ANTLR end "rule__Statement__Group_2__3"


    // $ANTLR start "rule__Statement__Group_2__3__Impl"
    // InternalFire.g:1203:1: rule__Statement__Group_2__3__Impl : ( 'do' ) ;
    public final void rule__Statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1207:1: ( ( 'do' ) )
            // InternalFire.g:1208:1: ( 'do' )
            {
            // InternalFire.g:1208:1: ( 'do' )
            // InternalFire.g:1209:2: 'do'
            {
             before(grammarAccess.getStatementAccess().getDoKeyword_2_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getDoKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__3__Impl"


    // $ANTLR start "rule__Statement__Group_2__4"
    // InternalFire.g:1218:1: rule__Statement__Group_2__4 : rule__Statement__Group_2__4__Impl rule__Statement__Group_2__5 ;
    public final void rule__Statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1222:1: ( rule__Statement__Group_2__4__Impl rule__Statement__Group_2__5 )
            // InternalFire.g:1223:2: rule__Statement__Group_2__4__Impl rule__Statement__Group_2__5
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__5();

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
    // $ANTLR end "rule__Statement__Group_2__4"


    // $ANTLR start "rule__Statement__Group_2__4__Impl"
    // InternalFire.g:1230:1: rule__Statement__Group_2__4__Impl : ( ( rule__Statement__StatementsAssignment_2_4 )* ) ;
    public final void rule__Statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1234:1: ( ( ( rule__Statement__StatementsAssignment_2_4 )* ) )
            // InternalFire.g:1235:1: ( ( rule__Statement__StatementsAssignment_2_4 )* )
            {
            // InternalFire.g:1235:1: ( ( rule__Statement__StatementsAssignment_2_4 )* )
            // InternalFire.g:1236:2: ( rule__Statement__StatementsAssignment_2_4 )*
            {
             before(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 
            // InternalFire.g:1237:2: ( rule__Statement__StatementsAssignment_2_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==11||LA11_0==33||LA11_0==35||LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFire.g:1237:3: rule__Statement__StatementsAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Statement__StatementsAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getStatementsAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__4__Impl"


    // $ANTLR start "rule__Statement__Group_2__5"
    // InternalFire.g:1245:1: rule__Statement__Group_2__5 : rule__Statement__Group_2__5__Impl ;
    public final void rule__Statement__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1249:1: ( rule__Statement__Group_2__5__Impl )
            // InternalFire.g:1250:2: rule__Statement__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_2__5__Impl();

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
    // $ANTLR end "rule__Statement__Group_2__5"


    // $ANTLR start "rule__Statement__Group_2__5__Impl"
    // InternalFire.g:1256:1: rule__Statement__Group_2__5__Impl : ( 'end' ) ;
    public final void rule__Statement__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1260:1: ( ( 'end' ) )
            // InternalFire.g:1261:1: ( 'end' )
            {
            // InternalFire.g:1261:1: ( 'end' )
            // InternalFire.g:1262:2: 'end'
            {
             before(grammarAccess.getStatementAccess().getEndKeyword_2_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getEndKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__5__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // InternalFire.g:1272:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1276:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // InternalFire.g:1277:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__1();

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
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // InternalFire.g:1284:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1288:1: ( ( () ) )
            // InternalFire.g:1289:1: ( () )
            {
            // InternalFire.g:1289:1: ( () )
            // InternalFire.g:1290:2: ()
            {
             before(grammarAccess.getStatementAccess().getWritelnStatementAction_3_0()); 
            // InternalFire.g:1291:2: ()
            // InternalFire.g:1291:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getWritelnStatementAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // InternalFire.g:1299:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1303:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // InternalFire.g:1304:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__Statement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__2();

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
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // InternalFire.g:1311:1: rule__Statement__Group_3__1__Impl : ( 'writeln' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1315:1: ( ( 'writeln' ) )
            // InternalFire.g:1316:1: ( 'writeln' )
            {
            // InternalFire.g:1316:1: ( 'writeln' )
            // InternalFire.g:1317:2: 'writeln'
            {
             before(grammarAccess.getStatementAccess().getWritelnKeyword_3_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getWritelnKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__2"
    // InternalFire.g:1326:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1330:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // InternalFire.g:1331:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__3();

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
    // $ANTLR end "rule__Statement__Group_3__2"


    // $ANTLR start "rule__Statement__Group_3__2__Impl"
    // InternalFire.g:1338:1: rule__Statement__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1342:1: ( ( '(' ) )
            // InternalFire.g:1343:1: ( '(' )
            {
            // InternalFire.g:1343:1: ( '(' )
            // InternalFire.g:1344:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__2__Impl"


    // $ANTLR start "rule__Statement__Group_3__3"
    // InternalFire.g:1353:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4 ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1357:1: ( rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4 )
            // InternalFire.g:1358:2: rule__Statement__Group_3__3__Impl rule__Statement__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__4();

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
    // $ANTLR end "rule__Statement__Group_3__3"


    // $ANTLR start "rule__Statement__Group_3__3__Impl"
    // InternalFire.g:1365:1: rule__Statement__Group_3__3__Impl : ( ( rule__Statement__ArgumentAssignment_3_3 ) ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1369:1: ( ( ( rule__Statement__ArgumentAssignment_3_3 ) ) )
            // InternalFire.g:1370:1: ( ( rule__Statement__ArgumentAssignment_3_3 ) )
            {
            // InternalFire.g:1370:1: ( ( rule__Statement__ArgumentAssignment_3_3 ) )
            // InternalFire.g:1371:2: ( rule__Statement__ArgumentAssignment_3_3 )
            {
             before(grammarAccess.getStatementAccess().getArgumentAssignment_3_3()); 
            // InternalFire.g:1372:2: ( rule__Statement__ArgumentAssignment_3_3 )
            // InternalFire.g:1372:3: rule__Statement__ArgumentAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ArgumentAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getArgumentAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__3__Impl"


    // $ANTLR start "rule__Statement__Group_3__4"
    // InternalFire.g:1380:1: rule__Statement__Group_3__4 : rule__Statement__Group_3__4__Impl ;
    public final void rule__Statement__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1384:1: ( rule__Statement__Group_3__4__Impl )
            // InternalFire.g:1385:2: rule__Statement__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__4__Impl();

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
    // $ANTLR end "rule__Statement__Group_3__4"


    // $ANTLR start "rule__Statement__Group_3__4__Impl"
    // InternalFire.g:1391:1: rule__Statement__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Statement__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1395:1: ( ( ')' ) )
            // InternalFire.g:1396:1: ( ')' )
            {
            // InternalFire.g:1396:1: ( ')' )
            // InternalFire.g:1397:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__4__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalFire.g:1407:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1411:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalFire.g:1412:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFire.g:1419:1: rule__Expression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1423:1: ( ( ruleAndExpression ) )
            // InternalFire.g:1424:1: ( ruleAndExpression )
            {
            // InternalFire.g:1424:1: ( ruleAndExpression )
            // InternalFire.g:1425:2: ruleAndExpression
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
    // InternalFire.g:1434:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1438:1: ( rule__Expression__Group__1__Impl )
            // InternalFire.g:1439:2: rule__Expression__Group__1__Impl
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
    // InternalFire.g:1445:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1449:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalFire.g:1450:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalFire.g:1450:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalFire.g:1451:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalFire.g:1452:2: ( rule__Expression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFire.g:1452:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFire.g:1461:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1465:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFire.g:1466:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFire.g:1473:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1477:1: ( ( () ) )
            // InternalFire.g:1478:1: ( () )
            {
            // InternalFire.g:1478:1: ( () )
            // InternalFire.g:1479:2: ()
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalFire.g:1480:2: ()
            // InternalFire.g:1480:3: 
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
    // InternalFire.g:1488:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1492:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalFire.g:1493:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
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
    // InternalFire.g:1500:1: rule__Expression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1504:1: ( ( 'or' ) )
            // InternalFire.g:1505:1: ( 'or' )
            {
            // InternalFire.g:1505:1: ( 'or' )
            // InternalFire.g:1506:2: 'or'
            {
             before(grammarAccess.getExpressionAccess().getOrKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalFire.g:1515:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1519:1: ( rule__Expression__Group_1__2__Impl )
            // InternalFire.g:1520:2: rule__Expression__Group_1__2__Impl
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
    // InternalFire.g:1526:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1530:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1531:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1531:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalFire.g:1532:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1533:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalFire.g:1533:3: rule__Expression__RightAssignment_1_2
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
    // InternalFire.g:1542:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1546:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalFire.g:1547:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFire.g:1554:1: rule__AndExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1558:1: ( ( ruleXorExpression ) )
            // InternalFire.g:1559:1: ( ruleXorExpression )
            {
            // InternalFire.g:1559:1: ( ruleXorExpression )
            // InternalFire.g:1560:2: ruleXorExpression
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
    // InternalFire.g:1569:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1573:1: ( rule__AndExpression__Group__1__Impl )
            // InternalFire.g:1574:2: rule__AndExpression__Group__1__Impl
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
    // InternalFire.g:1580:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1584:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalFire.g:1585:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalFire.g:1585:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalFire.g:1586:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalFire.g:1587:2: ( rule__AndExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFire.g:1587:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalFire.g:1596:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1600:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalFire.g:1601:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFire.g:1608:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1612:1: ( ( () ) )
            // InternalFire.g:1613:1: ( () )
            {
            // InternalFire.g:1613:1: ( () )
            // InternalFire.g:1614:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalFire.g:1615:2: ()
            // InternalFire.g:1615:3: 
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
    // InternalFire.g:1623:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1627:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalFire.g:1628:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
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
    // InternalFire.g:1635:1: rule__AndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1639:1: ( ( 'and' ) )
            // InternalFire.g:1640:1: ( 'and' )
            {
            // InternalFire.g:1640:1: ( 'and' )
            // InternalFire.g:1641:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalFire.g:1650:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1654:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalFire.g:1655:2: rule__AndExpression__Group_1__2__Impl
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
    // InternalFire.g:1661:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1665:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1666:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1666:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1667:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1668:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalFire.g:1668:3: rule__AndExpression__RightAssignment_1_2
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
    // InternalFire.g:1677:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1681:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalFire.g:1682:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFire.g:1689:1: rule__XorExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1693:1: ( ( ruleEqualityExpression ) )
            // InternalFire.g:1694:1: ( ruleEqualityExpression )
            {
            // InternalFire.g:1694:1: ( ruleEqualityExpression )
            // InternalFire.g:1695:2: ruleEqualityExpression
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
    // InternalFire.g:1704:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1708:1: ( rule__XorExpression__Group__1__Impl )
            // InternalFire.g:1709:2: rule__XorExpression__Group__1__Impl
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
    // InternalFire.g:1715:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1719:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalFire.g:1720:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalFire.g:1720:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalFire.g:1721:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalFire.g:1722:2: ( rule__XorExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFire.g:1722:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalFire.g:1731:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1735:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalFire.g:1736:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalFire.g:1743:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1747:1: ( ( () ) )
            // InternalFire.g:1748:1: ( () )
            {
            // InternalFire.g:1748:1: ( () )
            // InternalFire.g:1749:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 
            // InternalFire.g:1750:2: ()
            // InternalFire.g:1750:3: 
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
    // InternalFire.g:1758:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1762:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalFire.g:1763:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
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
    // InternalFire.g:1770:1: rule__XorExpression__Group_1__1__Impl : ( 'xor' ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1774:1: ( ( 'xor' ) )
            // InternalFire.g:1775:1: ( 'xor' )
            {
            // InternalFire.g:1775:1: ( 'xor' )
            // InternalFire.g:1776:2: 'xor'
            {
             before(grammarAccess.getXorExpressionAccess().getXorKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalFire.g:1785:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1789:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalFire.g:1790:2: rule__XorExpression__Group_1__2__Impl
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
    // InternalFire.g:1796:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1800:1: ( ( ( rule__XorExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1801:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1801:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1802:2: ( rule__XorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1803:2: ( rule__XorExpression__RightAssignment_1_2 )
            // InternalFire.g:1803:3: rule__XorExpression__RightAssignment_1_2
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
    // InternalFire.g:1812:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1816:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalFire.g:1817:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFire.g:1824:1: rule__EqualityExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1828:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:1829:1: ( ruleComparisonExpression )
            {
            // InternalFire.g:1829:1: ( ruleComparisonExpression )
            // InternalFire.g:1830:2: ruleComparisonExpression
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
    // InternalFire.g:1839:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1843:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalFire.g:1844:2: rule__EqualityExpression__Group__1__Impl
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
    // InternalFire.g:1850:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1854:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalFire.g:1855:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalFire.g:1855:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalFire.g:1856:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalFire.g:1857:2: ( rule__EqualityExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=17 && LA15_0<=18)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFire.g:1857:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalFire.g:1866:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1870:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalFire.g:1871:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFire.g:1878:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1882:1: ( ( () ) )
            // InternalFire.g:1883:1: ( () )
            {
            // InternalFire.g:1883:1: ( () )
            // InternalFire.g:1884:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // InternalFire.g:1885:2: ()
            // InternalFire.g:1885:3: 
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
    // InternalFire.g:1893:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1897:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalFire.g:1898:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
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
    // InternalFire.g:1905:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1909:1: ( ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:1910:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:1910:1: ( ( rule__EqualityExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:1911:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:1912:2: ( rule__EqualityExpression__OperatorAssignment_1_1 )
            // InternalFire.g:1912:3: rule__EqualityExpression__OperatorAssignment_1_1
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
    // InternalFire.g:1920:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1924:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalFire.g:1925:2: rule__EqualityExpression__Group_1__2__Impl
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
    // InternalFire.g:1931:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1935:1: ( ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:1936:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:1936:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            // InternalFire.g:1937:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:1938:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            // InternalFire.g:1938:3: rule__EqualityExpression__RightAssignment_1_2
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
    // InternalFire.g:1947:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1951:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalFire.g:1952:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:1959:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1963:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:1964:1: ( ruleAdditiveExpression )
            {
            // InternalFire.g:1964:1: ( ruleAdditiveExpression )
            // InternalFire.g:1965:2: ruleAdditiveExpression
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
    // InternalFire.g:1974:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1978:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalFire.g:1979:2: rule__ComparisonExpression__Group__1__Impl
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
    // InternalFire.g:1985:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:1989:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalFire.g:1990:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalFire.g:1990:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalFire.g:1991:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalFire.g:1992:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=19 && LA16_0<=22)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFire.g:1992:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalFire.g:2001:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2005:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalFire.g:2006:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalFire.g:2013:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2017:1: ( ( () ) )
            // InternalFire.g:2018:1: ( () )
            {
            // InternalFire.g:2018:1: ( () )
            // InternalFire.g:2019:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalFire.g:2020:2: ()
            // InternalFire.g:2020:3: 
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
    // InternalFire.g:2028:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2032:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalFire.g:2033:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
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
    // InternalFire.g:2040:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2044:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:2045:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:2045:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:2046:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:2047:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalFire.g:2047:3: rule__ComparisonExpression__OperatorAssignment_1_1
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
    // InternalFire.g:2055:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2059:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalFire.g:2060:2: rule__ComparisonExpression__Group_1__2__Impl
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
    // InternalFire.g:2066:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2070:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:2071:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:2071:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalFire.g:2072:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:2073:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalFire.g:2073:3: rule__ComparisonExpression__RightAssignment_1_2
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
    // InternalFire.g:2082:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2086:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalFire.g:2087:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFire.g:2094:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2098:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:2099:1: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:2099:1: ( ruleMultiplicativeExpression )
            // InternalFire.g:2100:2: ruleMultiplicativeExpression
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
    // InternalFire.g:2109:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2113:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalFire.g:2114:2: rule__AdditiveExpression__Group__1__Impl
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
    // InternalFire.g:2120:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2124:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalFire.g:2125:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalFire.g:2125:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalFire.g:2126:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalFire.g:2127:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=23 && LA17_0<=24)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFire.g:2127:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalFire.g:2136:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2140:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalFire.g:2141:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalFire.g:2148:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2152:1: ( ( () ) )
            // InternalFire.g:2153:1: ( () )
            {
            // InternalFire.g:2153:1: ( () )
            // InternalFire.g:2154:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0()); 
            // InternalFire.g:2155:2: ()
            // InternalFire.g:2155:3: 
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
    // InternalFire.g:2163:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2167:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalFire.g:2168:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
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
    // InternalFire.g:2175:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2179:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:2180:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:2180:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:2181:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:2182:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalFire.g:2182:3: rule__AdditiveExpression__OperatorAssignment_1_1
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
    // InternalFire.g:2190:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2194:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalFire.g:2195:2: rule__AdditiveExpression__Group_1__2__Impl
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
    // InternalFire.g:2201:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2205:1: ( ( ( rule__AdditiveExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:2206:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:2206:1: ( ( rule__AdditiveExpression__RightAssignment_1_2 ) )
            // InternalFire.g:2207:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:2208:2: ( rule__AdditiveExpression__RightAssignment_1_2 )
            // InternalFire.g:2208:3: rule__AdditiveExpression__RightAssignment_1_2
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
    // InternalFire.g:2217:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2221:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalFire.g:2222:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFire.g:2229:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2233:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:2234:1: ( ruleTerminalExpression )
            {
            // InternalFire.g:2234:1: ( ruleTerminalExpression )
            // InternalFire.g:2235:2: ruleTerminalExpression
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
    // InternalFire.g:2244:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2248:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalFire.g:2249:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalFire.g:2255:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2259:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalFire.g:2260:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalFire.g:2260:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalFire.g:2261:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalFire.g:2262:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=25 && LA18_0<=28)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFire.g:2262:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalFire.g:2271:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2275:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalFire.g:2276:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalFire.g:2283:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2287:1: ( ( () ) )
            // InternalFire.g:2288:1: ( () )
            {
            // InternalFire.g:2288:1: ( () )
            // InternalFire.g:2289:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0()); 
            // InternalFire.g:2290:2: ()
            // InternalFire.g:2290:3: 
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
    // InternalFire.g:2298:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2302:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalFire.g:2303:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
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
    // InternalFire.g:2310:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2314:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalFire.g:2315:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalFire.g:2315:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalFire.g:2316:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalFire.g:2317:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalFire.g:2317:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
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
    // InternalFire.g:2325:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2329:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalFire.g:2330:2: rule__MultiplicativeExpression__Group_1__2__Impl
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
    // InternalFire.g:2336:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2340:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) ) )
            // InternalFire.g:2341:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            {
            // InternalFire.g:2341:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_2 ) )
            // InternalFire.g:2342:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2()); 
            // InternalFire.g:2343:2: ( rule__MultiplicativeExpression__RightAssignment_1_2 )
            // InternalFire.g:2343:3: rule__MultiplicativeExpression__RightAssignment_1_2
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
    // InternalFire.g:2352:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2356:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalFire.g:2357:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalFire.g:2364:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2368:1: ( ( () ) )
            // InternalFire.g:2369:1: ( () )
            {
            // InternalFire.g:2369:1: ( () )
            // InternalFire.g:2370:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIdExpressionAction_0_0()); 
            // InternalFire.g:2371:2: ()
            // InternalFire.g:2371:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getIdExpressionAction_0_0()); 

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
    // InternalFire.g:2379:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2383:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalFire.g:2384:2: rule__TerminalExpression__Group_0__1__Impl
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
    // InternalFire.g:2390:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2394:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalFire.g:2395:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalFire.g:2395:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalFire.g:2396:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // InternalFire.g:2397:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalFire.g:2397:3: rule__TerminalExpression__ValueAssignment_0_1
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
    // InternalFire.g:2406:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2410:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalFire.g:2411:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalFire.g:2418:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2422:1: ( ( () ) )
            // InternalFire.g:2423:1: ( () )
            {
            // InternalFire.g:2423:1: ( () )
            // InternalFire.g:2424:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 
            // InternalFire.g:2425:2: ()
            // InternalFire.g:2425:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 

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
    // InternalFire.g:2433:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2437:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalFire.g:2438:2: rule__TerminalExpression__Group_1__1__Impl
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
    // InternalFire.g:2444:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2448:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalFire.g:2449:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalFire.g:2449:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalFire.g:2450:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // InternalFire.g:2451:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalFire.g:2451:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
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
    // InternalFire.g:2460:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2464:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalFire.g:2465:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFire.g:2472:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2476:1: ( ( () ) )
            // InternalFire.g:2477:1: ( () )
            {
            // InternalFire.g:2477:1: ( () )
            // InternalFire.g:2478:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 
            // InternalFire.g:2479:2: ()
            // InternalFire.g:2479:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 

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
    // InternalFire.g:2487:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2491:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalFire.g:2492:2: rule__TerminalExpression__Group_2__1__Impl
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
    // InternalFire.g:2498:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__Alternatives_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2502:1: ( ( ( rule__TerminalExpression__Alternatives_2_1 ) ) )
            // InternalFire.g:2503:1: ( ( rule__TerminalExpression__Alternatives_2_1 ) )
            {
            // InternalFire.g:2503:1: ( ( rule__TerminalExpression__Alternatives_2_1 ) )
            // InternalFire.g:2504:2: ( rule__TerminalExpression__Alternatives_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives_2_1()); 
            // InternalFire.g:2505:2: ( rule__TerminalExpression__Alternatives_2_1 )
            // InternalFire.g:2505:3: rule__TerminalExpression__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives_2_1()); 

            }


            }

        }
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
    // InternalFire.g:2514:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2518:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalFire.g:2519:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFire.g:2526:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2530:1: ( ( () ) )
            // InternalFire.g:2531:1: ( () )
            {
            // InternalFire.g:2531:1: ( () )
            // InternalFire.g:2532:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_3_0()); 
            // InternalFire.g:2533:2: ()
            // InternalFire.g:2533:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getIntegerLiteralAction_3_0()); 

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
    // InternalFire.g:2541:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2545:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalFire.g:2546:2: rule__TerminalExpression__Group_3__1__Impl
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
    // InternalFire.g:2552:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2556:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalFire.g:2557:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalFire.g:2557:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalFire.g:2558:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            // InternalFire.g:2559:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalFire.g:2559:3: rule__TerminalExpression__ValueAssignment_3_1
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
    // InternalFire.g:2568:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2572:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalFire.g:2573:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalFire.g:2580:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2584:1: ( ( () ) )
            // InternalFire.g:2585:1: ( () )
            {
            // InternalFire.g:2585:1: ( () )
            // InternalFire.g:2586:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_4_0()); 
            // InternalFire.g:2587:2: ()
            // InternalFire.g:2587:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getRealLiteralAction_4_0()); 

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
    // InternalFire.g:2595:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2599:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalFire.g:2600:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1__Impl();

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
    // InternalFire.g:2606:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2610:1: ( ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) )
            // InternalFire.g:2611:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            {
            // InternalFire.g:2611:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            // InternalFire.g:2612:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            // InternalFire.g:2613:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            // InternalFire.g:2613:3: rule__TerminalExpression__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalFire.g:2622:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2626:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalFire.g:2627:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFire.g:2634:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2638:1: ( ( () ) )
            // InternalFire.g:2639:1: ( () )
            {
            // InternalFire.g:2639:1: ( () )
            // InternalFire.g:2640:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_5_0()); 
            // InternalFire.g:2641:2: ()
            // InternalFire.g:2641:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getNotExpressionAction_5_0()); 

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
    // InternalFire.g:2649:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2653:1: ( rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2 )
            // InternalFire.g:2654:2: rule__TerminalExpression__Group_5__1__Impl rule__TerminalExpression__Group_5__2
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
    // InternalFire.g:2661:1: rule__TerminalExpression__Group_5__1__Impl : ( 'not' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2665:1: ( ( 'not' ) )
            // InternalFire.g:2666:1: ( 'not' )
            {
            // InternalFire.g:2666:1: ( 'not' )
            // InternalFire.g:2667:2: 'not'
            {
             before(grammarAccess.getTerminalExpressionAccess().getNotKeyword_5_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getNotKeyword_5_1()); 

            }


            }

        }
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
    // InternalFire.g:2676:1: rule__TerminalExpression__Group_5__2 : rule__TerminalExpression__Group_5__2__Impl ;
    public final void rule__TerminalExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2680:1: ( rule__TerminalExpression__Group_5__2__Impl )
            // InternalFire.g:2681:2: rule__TerminalExpression__Group_5__2__Impl
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
    // InternalFire.g:2687:1: rule__TerminalExpression__Group_5__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) ;
    public final void rule__TerminalExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2691:1: ( ( ( rule__TerminalExpression__OperandAssignment_5_2 ) ) )
            // InternalFire.g:2692:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            {
            // InternalFire.g:2692:1: ( ( rule__TerminalExpression__OperandAssignment_5_2 ) )
            // InternalFire.g:2693:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_5_2()); 
            // InternalFire.g:2694:2: ( rule__TerminalExpression__OperandAssignment_5_2 )
            // InternalFire.g:2694:3: rule__TerminalExpression__OperandAssignment_5_2
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
    // InternalFire.g:2703:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2707:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalFire.g:2708:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFire.g:2715:1: rule__TerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2719:1: ( ( () ) )
            // InternalFire.g:2720:1: ( () )
            {
            // InternalFire.g:2720:1: ( () )
            // InternalFire.g:2721:2: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_6_0()); 
            // InternalFire.g:2722:2: ()
            // InternalFire.g:2722:3: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getNegationExpressionAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__1"
    // InternalFire.g:2730:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2734:1: ( rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2 )
            // InternalFire.g:2735:2: rule__TerminalExpression__Group_6__1__Impl rule__TerminalExpression__Group_6__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalFire.g:2742:1: rule__TerminalExpression__Group_6__1__Impl : ( '-' ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2746:1: ( ( '-' ) )
            // InternalFire.g:2747:1: ( '-' )
            {
            // InternalFire.g:2747:1: ( '-' )
            // InternalFire.g:2748:2: '-'
            {
             before(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getHyphenMinusKeyword_6_1()); 

            }


            }

        }
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
    // InternalFire.g:2757:1: rule__TerminalExpression__Group_6__2 : rule__TerminalExpression__Group_6__2__Impl ;
    public final void rule__TerminalExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2761:1: ( rule__TerminalExpression__Group_6__2__Impl )
            // InternalFire.g:2762:2: rule__TerminalExpression__Group_6__2__Impl
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
    // InternalFire.g:2768:1: rule__TerminalExpression__Group_6__2__Impl : ( ( rule__TerminalExpression__OperandAssignment_6_2 ) ) ;
    public final void rule__TerminalExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2772:1: ( ( ( rule__TerminalExpression__OperandAssignment_6_2 ) ) )
            // InternalFire.g:2773:1: ( ( rule__TerminalExpression__OperandAssignment_6_2 ) )
            {
            // InternalFire.g:2773:1: ( ( rule__TerminalExpression__OperandAssignment_6_2 ) )
            // InternalFire.g:2774:2: ( rule__TerminalExpression__OperandAssignment_6_2 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_6_2()); 
            // InternalFire.g:2775:2: ( rule__TerminalExpression__OperandAssignment_6_2 )
            // InternalFire.g:2775:3: rule__TerminalExpression__OperandAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__OperandAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getOperandAssignment_6_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__TerminalExpression__Group_7__0"
    // InternalFire.g:2784:1: rule__TerminalExpression__Group_7__0 : rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 ;
    public final void rule__TerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2788:1: ( rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 )
            // InternalFire.g:2789:2: rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__TerminalExpression__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__0"


    // $ANTLR start "rule__TerminalExpression__Group_7__0__Impl"
    // InternalFire.g:2796:1: rule__TerminalExpression__Group_7__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2800:1: ( ( '(' ) )
            // InternalFire.g:2801:1: ( '(' )
            {
            // InternalFire.g:2801:1: ( '(' )
            // InternalFire.g:2802:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__1"
    // InternalFire.g:2811:1: rule__TerminalExpression__Group_7__1 : rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 ;
    public final void rule__TerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2815:1: ( rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 )
            // InternalFire.g:2816:2: rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__TerminalExpression__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__1"


    // $ANTLR start "rule__TerminalExpression__Group_7__1__Impl"
    // InternalFire.g:2823:1: rule__TerminalExpression__Group_7__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2827:1: ( ( ruleExpression ) )
            // InternalFire.g:2828:1: ( ruleExpression )
            {
            // InternalFire.g:2828:1: ( ruleExpression )
            // InternalFire.g:2829:2: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_7_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__2"
    // InternalFire.g:2838:1: rule__TerminalExpression__Group_7__2 : rule__TerminalExpression__Group_7__2__Impl ;
    public final void rule__TerminalExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2842:1: ( rule__TerminalExpression__Group_7__2__Impl )
            // InternalFire.g:2843:2: rule__TerminalExpression__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__2"


    // $ANTLR start "rule__TerminalExpression__Group_7__2__Impl"
    // InternalFire.g:2849:1: rule__TerminalExpression__Group_7__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2853:1: ( ( ')' ) )
            // InternalFire.g:2854:1: ( ')' )
            {
            // InternalFire.g:2854:1: ( ')' )
            // InternalFire.g:2855:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__2__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalFire.g:2865:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2869:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalFire.g:2870:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFire.g:2877:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2881:1: ( ( RULE_INT ) )
            // InternalFire.g:2882:1: ( RULE_INT )
            {
            // InternalFire.g:2882:1: ( RULE_INT )
            // InternalFire.g:2883:2: RULE_INT
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
    // InternalFire.g:2892:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2896:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalFire.g:2897:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalFire.g:2904:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2908:1: ( ( '.' ) )
            // InternalFire.g:2909:1: ( '.' )
            {
            // InternalFire.g:2909:1: ( '.' )
            // InternalFire.g:2910:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalFire.g:2919:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2923:1: ( rule__Double__Group__2__Impl )
            // InternalFire.g:2924:2: rule__Double__Group__2__Impl
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
    // InternalFire.g:2930:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2934:1: ( ( RULE_INT ) )
            // InternalFire.g:2935:1: ( RULE_INT )
            {
            // InternalFire.g:2935:1: ( RULE_INT )
            // InternalFire.g:2936:2: RULE_INT
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
    // InternalFire.g:2946:1: rule__Program__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2950:1: ( ( ruleStatement ) )
            // InternalFire.g:2951:2: ( ruleStatement )
            {
            // InternalFire.g:2951:2: ( ruleStatement )
            // InternalFire.g:2952:3: ruleStatement
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


    // $ANTLR start "rule__Statement__ConstantAssignment_0_1_0"
    // InternalFire.g:2961:1: rule__Statement__ConstantAssignment_0_1_0 : ( ( 'const' ) ) ;
    public final void rule__Statement__ConstantAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2965:1: ( ( ( 'const' ) ) )
            // InternalFire.g:2966:2: ( ( 'const' ) )
            {
            // InternalFire.g:2966:2: ( ( 'const' ) )
            // InternalFire.g:2967:3: ( 'const' )
            {
             before(grammarAccess.getStatementAccess().getConstantConstKeyword_0_1_0_0()); 
            // InternalFire.g:2968:3: ( 'const' )
            // InternalFire.g:2969:4: 'const'
            {
             before(grammarAccess.getStatementAccess().getConstantConstKeyword_0_1_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getConstantConstKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getConstantConstKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ConstantAssignment_0_1_0"


    // $ANTLR start "rule__Statement__NameAssignment_0_2"
    // InternalFire.g:2980:1: rule__Statement__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2984:1: ( ( RULE_ID ) )
            // InternalFire.g:2985:2: ( RULE_ID )
            {
            // InternalFire.g:2985:2: ( RULE_ID )
            // InternalFire.g:2986:3: RULE_ID
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
    // InternalFire.g:2995:1: rule__Statement__TypeAssignment_0_4 : ( ruleBuiltInType ) ;
    public final void rule__Statement__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:2999:1: ( ( ruleBuiltInType ) )
            // InternalFire.g:3000:2: ( ruleBuiltInType )
            {
            // InternalFire.g:3000:2: ( ruleBuiltInType )
            // InternalFire.g:3001:3: ruleBuiltInType
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
    // InternalFire.g:3010:1: rule__Statement__ValueAssignment_0_6 : ( ruleExpression ) ;
    public final void rule__Statement__ValueAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3014:1: ( ( ruleExpression ) )
            // InternalFire.g:3015:2: ( ruleExpression )
            {
            // InternalFire.g:3015:2: ( ruleExpression )
            // InternalFire.g:3016:3: ruleExpression
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


    // $ANTLR start "rule__Statement__VariableAssignment_1_1"
    // InternalFire.g:3025:1: rule__Statement__VariableAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Statement__VariableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3029:1: ( ( ( RULE_ID ) ) )
            // InternalFire.g:3030:2: ( ( RULE_ID ) )
            {
            // InternalFire.g:3030:2: ( ( RULE_ID ) )
            // InternalFire.g:3031:3: ( RULE_ID )
            {
             before(grammarAccess.getStatementAccess().getVariableVariableDeclarationCrossReference_1_1_0()); 
            // InternalFire.g:3032:3: ( RULE_ID )
            // InternalFire.g:3033:4: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVariableVariableDeclarationIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getVariableVariableDeclarationIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getStatementAccess().getVariableVariableDeclarationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VariableAssignment_1_1"


    // $ANTLR start "rule__Statement__ValueAssignment_1_3"
    // InternalFire.g:3044:1: rule__Statement__ValueAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__Statement__ValueAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3048:1: ( ( ruleExpression ) )
            // InternalFire.g:3049:2: ( ruleExpression )
            {
            // InternalFire.g:3049:2: ( ruleExpression )
            // InternalFire.g:3050:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValueExpressionParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ValueAssignment_1_3"


    // $ANTLR start "rule__Statement__ConditionAssignment_2_2"
    // InternalFire.g:3059:1: rule__Statement__ConditionAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Statement__ConditionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3063:1: ( ( ruleExpression ) )
            // InternalFire.g:3064:2: ( ruleExpression )
            {
            // InternalFire.g:3064:2: ( ruleExpression )
            // InternalFire.g:3065:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getConditionExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getConditionExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ConditionAssignment_2_2"


    // $ANTLR start "rule__Statement__StatementsAssignment_2_4"
    // InternalFire.g:3074:1: rule__Statement__StatementsAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Statement__StatementsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3078:1: ( ( ruleStatement ) )
            // InternalFire.g:3079:2: ( ruleStatement )
            {
            // InternalFire.g:3079:2: ( ruleStatement )
            // InternalFire.g:3080:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementsAssignment_2_4"


    // $ANTLR start "rule__Statement__ArgumentAssignment_3_3"
    // InternalFire.g:3089:1: rule__Statement__ArgumentAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Statement__ArgumentAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3093:1: ( ( ruleExpression ) )
            // InternalFire.g:3094:2: ( ruleExpression )
            {
            // InternalFire.g:3094:2: ( ruleExpression )
            // InternalFire.g:3095:3: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getArgumentExpressionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ArgumentAssignment_3_3"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalFire.g:3104:1: rule__Expression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3108:1: ( ( ruleAndExpression ) )
            // InternalFire.g:3109:2: ( ruleAndExpression )
            {
            // InternalFire.g:3109:2: ( ruleAndExpression )
            // InternalFire.g:3110:3: ruleAndExpression
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
    // InternalFire.g:3119:1: rule__AndExpression__RightAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3123:1: ( ( ruleXorExpression ) )
            // InternalFire.g:3124:2: ( ruleXorExpression )
            {
            // InternalFire.g:3124:2: ( ruleXorExpression )
            // InternalFire.g:3125:3: ruleXorExpression
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
    // InternalFire.g:3134:1: rule__XorExpression__RightAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3138:1: ( ( ruleEqualityExpression ) )
            // InternalFire.g:3139:2: ( ruleEqualityExpression )
            {
            // InternalFire.g:3139:2: ( ruleEqualityExpression )
            // InternalFire.g:3140:3: ruleEqualityExpression
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
    // InternalFire.g:3149:1: rule__EqualityExpression__OperatorAssignment_1_1 : ( ruleEqualityOperator ) ;
    public final void rule__EqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3153:1: ( ( ruleEqualityOperator ) )
            // InternalFire.g:3154:2: ( ruleEqualityOperator )
            {
            // InternalFire.g:3154:2: ( ruleEqualityOperator )
            // InternalFire.g:3155:3: ruleEqualityOperator
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
    // InternalFire.g:3164:1: rule__EqualityExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3168:1: ( ( ruleComparisonExpression ) )
            // InternalFire.g:3169:2: ( ruleComparisonExpression )
            {
            // InternalFire.g:3169:2: ( ruleComparisonExpression )
            // InternalFire.g:3170:3: ruleComparisonExpression
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
    // InternalFire.g:3179:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3183:1: ( ( ruleComparisonOperator ) )
            // InternalFire.g:3184:2: ( ruleComparisonOperator )
            {
            // InternalFire.g:3184:2: ( ruleComparisonOperator )
            // InternalFire.g:3185:3: ruleComparisonOperator
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
    // InternalFire.g:3194:1: rule__ComparisonExpression__RightAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3198:1: ( ( ruleAdditiveExpression ) )
            // InternalFire.g:3199:2: ( ruleAdditiveExpression )
            {
            // InternalFire.g:3199:2: ( ruleAdditiveExpression )
            // InternalFire.g:3200:3: ruleAdditiveExpression
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
    // InternalFire.g:3209:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3213:1: ( ( ruleAdditiveOperator ) )
            // InternalFire.g:3214:2: ( ruleAdditiveOperator )
            {
            // InternalFire.g:3214:2: ( ruleAdditiveOperator )
            // InternalFire.g:3215:3: ruleAdditiveOperator
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
    // InternalFire.g:3224:1: rule__AdditiveExpression__RightAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3228:1: ( ( ruleMultiplicativeExpression ) )
            // InternalFire.g:3229:2: ( ruleMultiplicativeExpression )
            {
            // InternalFire.g:3229:2: ( ruleMultiplicativeExpression )
            // InternalFire.g:3230:3: ruleMultiplicativeExpression
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
    // InternalFire.g:3239:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3243:1: ( ( ruleMultiplicativeOperator ) )
            // InternalFire.g:3244:2: ( ruleMultiplicativeOperator )
            {
            // InternalFire.g:3244:2: ( ruleMultiplicativeOperator )
            // InternalFire.g:3245:3: ruleMultiplicativeOperator
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
    // InternalFire.g:3254:1: rule__MultiplicativeExpression__RightAssignment_1_2 : ( ruleTerminalExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3258:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:3259:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:3259:2: ( ruleTerminalExpression )
            // InternalFire.g:3260:3: ruleTerminalExpression
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
    // InternalFire.g:3269:1: rule__TerminalExpression__ValueAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3273:1: ( ( ( RULE_ID ) ) )
            // InternalFire.g:3274:2: ( ( RULE_ID ) )
            {
            // InternalFire.g:3274:2: ( ( RULE_ID ) )
            // InternalFire.g:3275:3: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueVariableDeclarationCrossReference_0_1_0()); 
            // InternalFire.g:3276:3: ( RULE_ID )
            // InternalFire.g:3277:4: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueVariableDeclarationIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueVariableDeclarationIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTerminalExpressionAccess().getValueVariableDeclarationCrossReference_0_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalFire.g:3288:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3292:1: ( ( RULE_STRING ) )
            // InternalFire.g:3293:2: ( RULE_STRING )
            {
            // InternalFire.g:3293:2: ( RULE_STRING )
            // InternalFire.g:3294:3: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1_0"
    // InternalFire.g:3303:1: rule__TerminalExpression__ValueAssignment_2_1_0 : ( ( 'true' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3307:1: ( ( ( 'true' ) ) )
            // InternalFire.g:3308:2: ( ( 'true' ) )
            {
            // InternalFire.g:3308:2: ( ( 'true' ) )
            // InternalFire.g:3309:3: ( 'true' )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
            // InternalFire.g:3310:3: ( 'true' )
            // InternalFire.g:3311:4: 'true'
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1_0"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_3_1"
    // InternalFire.g:3322:1: rule__TerminalExpression__ValueAssignment_3_1 : ( ruleLong ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3326:1: ( ( ruleLong ) )
            // InternalFire.g:3327:2: ( ruleLong )
            {
            // InternalFire.g:3327:2: ( ruleLong )
            // InternalFire.g:3328:3: ruleLong
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLong();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getValueLongParserRuleCall_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_4_1"
    // InternalFire.g:3337:1: rule__TerminalExpression__ValueAssignment_4_1 : ( ruleDouble ) ;
    public final void rule__TerminalExpression__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3341:1: ( ( ruleDouble ) )
            // InternalFire.g:3342:2: ( ruleDouble )
            {
            // InternalFire.g:3342:2: ( ruleDouble )
            // InternalFire.g:3343:3: ruleDouble
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getValueDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_4_1"


    // $ANTLR start "rule__TerminalExpression__OperandAssignment_5_2"
    // InternalFire.g:3352:1: rule__TerminalExpression__OperandAssignment_5_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3356:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:3357:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:3357:2: ( ruleTerminalExpression )
            // InternalFire.g:3358:3: ruleTerminalExpression
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


    // $ANTLR start "rule__TerminalExpression__OperandAssignment_6_2"
    // InternalFire.g:3367:1: rule__TerminalExpression__OperandAssignment_6_2 : ( ruleTerminalExpression ) ;
    public final void rule__TerminalExpression__OperandAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFire.g:3371:1: ( ( ruleTerminalExpression ) )
            // InternalFire.g:3372:2: ( ruleTerminalExpression )
            {
            // InternalFire.g:3372:2: ( ruleTerminalExpression )
            // InternalFire.g:3373:3: ruleTerminalExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getOperandTerminalExpressionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__OperandAssignment_6_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\10\5\uffff";
    static final String dfa_3s = "\1\4\3\uffff\1\5\5\uffff";
    static final String dfa_4s = "\1\54\3\uffff\1\53\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\4\1\5";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\1\1\2\5\uffff\1\3\13\uffff\1\6\13\uffff\1\7\4\uffff\1\5\2\uffff\1\3",
            "",
            "",
            "",
            "\1\10\5\uffff\1\10\5\uffff\14\10\1\uffff\1\10\2\uffff\3\10\1\uffff\4\10\1\uffff\1\11\1\10",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "486:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000080A40000820L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080A00000822L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000121001001070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080A00000820L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});

}