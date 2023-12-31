/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.ui.quickfix;

import cps.gameoflife.validation.LsjatlValidator;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class LsjatlQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(LsjatlValidator.TOO_MANY_NEIGHBORS)
  public void capitalizeName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      xtextDocument.replace((issue.getOffset()).intValue(), 1, "8");
    };
    acceptor.accept(issue, "Use a valid outcome", "Use a valid outcome", "upcase.png", _function);
  }
}
