/*
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LsjatlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("cps/gameoflife/parser/antlr/internal/InternalLsjatl.tokens");
	}
}
