/*
 * generated by Xtext 2.10.0
 */
package fire.parser.antlr;

import com.google.inject.Inject;
import fire.parser.antlr.internal.InternalFireParser;
import fire.services.FireGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class FireParser extends AbstractAntlrParser {

	@Inject
	private FireGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFireParser createParser(XtextTokenStream stream) {
		return new InternalFireParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public FireGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FireGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}