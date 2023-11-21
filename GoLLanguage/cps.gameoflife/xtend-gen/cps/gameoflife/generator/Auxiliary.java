package cps.gameoflife.generator;

import cps.gameoflife.lsjatl.Condition;
import cps.gameoflife.lsjatl.Game;
import cps.gameoflife.lsjatl.Rule;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<Rule> getRules(final Game root) {
    List<Rule> ruleList = new ArrayList<Rule>();
    EList<Rule> _rules = root.getRules().getRules();
    for (final Rule r : _rules) {
      ruleList.add(r);
    }
    return ruleList;
  }

  public static List<Condition> getConditions(final Rule rule) {
    List<Condition> conditionList = new ArrayList<Condition>();
    EList<Condition> _conditions = rule.getConditions();
    for (final Condition c : _conditions) {
      conditionList.add(c);
    }
    return conditionList;
  }
}
