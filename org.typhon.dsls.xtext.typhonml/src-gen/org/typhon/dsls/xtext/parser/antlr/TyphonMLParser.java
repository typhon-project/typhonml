/*
 * generated by Xtext 2.14.0
 */
package org.typhon.dsls.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.typhon.dsls.xtext.parser.antlr.internal.InternalTyphonMLParser;
import org.typhon.dsls.xtext.services.TyphonMLGrammarAccess;

public class TyphonMLParser extends AbstractAntlrParser {

	@Inject
	private TyphonMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTyphonMLParser createParser(XtextTokenStream stream) {
		return new InternalTyphonMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public TyphonMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TyphonMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}