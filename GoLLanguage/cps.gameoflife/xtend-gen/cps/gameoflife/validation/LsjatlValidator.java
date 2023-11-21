/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.validation;

import cps.gameoflife.lsjatl.Grid;
import cps.gameoflife.lsjatl.PopulatedCell;
import cps.gameoflife.lsjatl.Rule;
import cps.gameoflife.lsjatl.Rules;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LsjatlValidator extends AbstractLsjatlValidator {
  @Check
  public void checkIfInitialCellsAreInGrid(final Grid grid) {
    EList<PopulatedCell> _populatedCells = grid.getPopulatedCells();
    for (final PopulatedCell cell : _populatedCells) {
      if (((((cell.getX() > grid.getSize().getWidth()) || (cell.getY() > grid.getSize().getHeight())) || (cell.getX() > grid.getSize().getHeight())) || (cell.getY() > grid.getSize().getHeight()))) {
        this.error("Cell cannot be outside the grid", 
          null);
      }
    }
  }

  @Check
  public void hasValidNeighborsToDie(final Rules rules) {
    EList<Rule> _rules = rules.getRules();
    for (final Rule rule : _rules) {
      {
        final List<String> list = Arrays.<String>asList("survives", "dies", "populates");
        boolean _contains = list.contains(rule.getResult());
        boolean _not = (!_contains);
        if (_not) {
          this.error("Cell needs to have a valid outcome", 
            null);
        }
      }
    }
  }

  @Check
  public void doRulesExist(final Rules rules) {
    int _size = rules.getRules().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Game has no rules, so everyone and everything will die", null);
    }
  }
}
