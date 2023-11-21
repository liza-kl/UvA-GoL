package cps.gameoflife.generator

import cps.gameoflife.lsjatl.Rule
import cps.gameoflife.lsjatl.Game
import cps.gameoflife.lsjatl.Condition
import cps.gameoflife.lsjatl.Grid
import cps.gameoflife.lsjatl.PopulatedCell

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
		for (Condition c: rule.conditions){
			conditionList.add(c)
		}
		return conditionList;
	}
	
	def static List<PopulatedCell> getStartingPoints(Grid grid) {
		var List<PopulatedCell> pointList = new ArrayList<PopulatedCell>()
		for (PopulatedCell p: grid.populatedCells){
			pointList.add(p)
		}
		return pointList;
	}
}
