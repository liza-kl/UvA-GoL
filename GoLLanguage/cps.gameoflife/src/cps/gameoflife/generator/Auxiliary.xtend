package cps.gameoflife.generator

import cps.gameoflife.lsjatl.Rule
import cps.gameoflife.lsjatl.Game
import cps.gameoflife.lsjatl.Condition

import java.util.List
import java.util.ArrayList


class Auxiliary {
	def static List<Rule> getRules(Game root) {
		var List<Rule> ruleList = new ArrayList<Rule>()
		for (Rule r : root.rules.rules){
			ruleList.add(r)
		}
		return ruleList;
	}
	
	def static List<Condition> getConditions(Rule rule) {
		var List<Condition> conditionList = new ArrayList<Condition>()
		for (Condition c: rule.condition){
			ruleList.add(r)
		}
		return ruleList;
	}
}
