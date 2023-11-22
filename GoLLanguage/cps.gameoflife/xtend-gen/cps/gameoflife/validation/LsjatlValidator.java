/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.validation;

import com.google.common.base.Objects;
import cps.gameoflife.lsjatl.Condition;
import cps.gameoflife.lsjatl.Game;
import cps.gameoflife.lsjatl.Grid;
import cps.gameoflife.lsjatl.LsjatlPackage;
import cps.gameoflife.lsjatl.PopulatedCell;
import cps.gameoflife.lsjatl.Rule;
import cps.gameoflife.lsjatl.Rules;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LsjatlValidator extends AbstractLsjatlValidator {
  protected static final String ISSUE_CODE_PREFIX = "cps.gameoflife.lsjatl.";

  public static final String INVALID_RULE_OUTCOME = (LsjatlValidator.ISSUE_CODE_PREFIX + "InvalidRuleOutcome");

  public static final String INVALID_SIGN = (LsjatlValidator.ISSUE_CODE_PREFIX + "InvalidSign");

  public static final String INVALID_DUPLICATION = "InvalidDuplication";

  @Check
  public void checkIfValidNumberOfNeighbors(final Condition condition) {
    int _nCount = condition.getNCount();
    boolean _greaterThan = (_nCount > 8);
    if (_greaterThan) {
      this.warning("The number of neighbors should not be greater than 8", null);
    }
    int _nCount_1 = condition.getNCount();
    boolean _lessThan = (_nCount_1 < 0);
    if (_lessThan) {
      this.error("The number of neighbors cannot be negative", null);
    }
  }

  @Check
  public void checkForNegativeStartingCells(final Game game) {
    for (int i = 0; (i < game.getGrid().getPopulatedCells().size()); i++) {
      if (((game.getGrid().getPopulatedCells().get(i).getX() < 0) || (game.getGrid().getPopulatedCells().get(i).getY() < 0))) {
        this.error("Cells must have positive coordinates", null, i);
      }
    }
  }

  @Check
  public void checkIfInitialCellsAreInGrid(final Grid grid) {
    EList<PopulatedCell> _populatedCells = grid.getPopulatedCells();
    for (final PopulatedCell cell : _populatedCells) {
      if (((((cell.getX() > grid.getSize().getWidth()) || (cell.getY() > grid.getSize().getHeight())) || (cell.getX() > grid.getSize().getHeight())) || 
        (cell.getY() > grid.getSize().getHeight()))) {
        this.error("Cell cannot be outside the grid", null);
      }
    }
  }

  @Check
  public void hasValidCellStates(final Rules rules) {
    EList<Rule> _rules = rules.getRules();
    for (final Rule rule : _rules) {
      {
        final List<String> list = Arrays.<String>asList("survives", "dies", "populates");
        boolean _contains = list.contains(rule.getResult());
        boolean _not = (!_contains);
        if (_not) {
          this.error("Cell needs to have a valid outcome", null);
        }
      }
    }
  }

  @Check
  public void hasValidOutcomeRules(final Rules rules) {
    EList<Rule> _rules = rules.getRules();
    for (final Rule rule : _rules) {
      {
        final List<String> list = Arrays.<String>asList("living", "dead");
        boolean _contains = list.contains(rule.getState());
        boolean _not = (!_contains);
        if (_not) {
          this.error("Cell needs to have a valid state e.g. living or dead", null);
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

  @Check
  public void checkIdenticalRules(final Rules rules) {
    List<Rule> rulesList = IterableExtensions.<Rule>toList(rules.getRules());
    HashSet<Rule> ruleSet = new HashSet<Rule>();
    for (final Rule rule : rulesList) {
      boolean _contains = ruleSet.contains(rule);
      if (_contains) {
        this.warning("There cannot be duplicate rules", LsjatlPackage.Literals.RULES__RULES, LsjatlValidator.INVALID_DUPLICATION);
      } else {
        ruleSet.add(rule);
      }
    }
  }

  @Check
  public void checkDeadSurviving(final Rules rules) {
    List<Rule> rulesList = IterableExtensions.<Rule>toList(rules.getRules());
    for (final Rule rule : rulesList) {
      if ((Objects.equal(rule.getState(), "dead") && Objects.equal(rule.getResult(), "survives"))) {
        this.warning("A rule exists for a survival of dead cell.", null);
      }
    }
  }

  @Check
  public void checkLivingPopulating(final Rules rules) {
    List<Rule> rulesList = IterableExtensions.<Rule>toList(rules.getRules());
    for (final Rule rule : rulesList) {
      if ((Objects.equal(rule.getState(), "living") && Objects.equal(rule.getResult(), "populates"))) {
        this.warning("A rule exists for populating a living cell. Only dead cells can be populated.", null);
      }
    }
  }
}
