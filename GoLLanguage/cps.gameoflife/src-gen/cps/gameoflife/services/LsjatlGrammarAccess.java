/*
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LsjatlGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Game");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cGridAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cGridGridParserRuleCall_0_0 = (RuleCall)cGridAssignment_0.eContents().get(0);
		private final Assignment cRulesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRulesRulesParserRuleCall_1_0 = (RuleCall)cRulesAssignment_1.eContents().get(0);
		
		//Game: grid = Grid // A game consists of a
		//      rules = Rules;
		@Override public ParserRule getRule() { return rule; }
		
		//grid = Grid // A game consists of a
		//     rules = Rules
		public Group getGroup() { return cGroup; }
		
		//grid = Grid
		public Assignment getGridAssignment_0() { return cGridAssignment_0; }
		
		//Grid
		public RuleCall getGridGridParserRuleCall_0_0() { return cGridGridParserRuleCall_0_0; }
		
		//// A game consists of a
		//     rules = Rules
		public Assignment getRulesAssignment_1() { return cRulesAssignment_1; }
		
		//Rules
		public RuleCall getRulesRulesParserRuleCall_1_0() { return cRulesRulesParserRuleCall_1_0; }
	}
	public class GridElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Grid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGridAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGridKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSizeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSizeGridSizeParserRuleCall_2_0 = (RuleCall)cSizeAssignment_2.eContents().get(0);
		private final Assignment cPopulatedCellsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPopulatedCellsPopulatedCellParserRuleCall_3_0 = (RuleCall)cPopulatedCellsAssignment_3.eContents().get(0);
		
		//Grid:{Grid} 'Grid' size= GridSize // Point optional
		//     populatedCells += PopulatedCell*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Grid} 'Grid' size= GridSize // Point optional
		//     populatedCells += PopulatedCell*
		public Group getGroup() { return cGroup; }
		
		//{Grid}
		public Action getGridAction_0() { return cGridAction_0; }
		
		//'Grid'
		public Keyword getGridKeyword_1() { return cGridKeyword_1; }
		
		//size= GridSize
		public Assignment getSizeAssignment_2() { return cSizeAssignment_2; }
		
		//GridSize
		public RuleCall getSizeGridSizeParserRuleCall_2_0() { return cSizeGridSizeParserRuleCall_2_0; }
		
		//// Point optional
		//    populatedCells += PopulatedCell*
		public Assignment getPopulatedCellsAssignment_3() { return cPopulatedCellsAssignment_3; }
		
		//PopulatedCell
		public RuleCall getPopulatedCellsPopulatedCellParserRuleCall_3_0() { return cPopulatedCellsPopulatedCellParserRuleCall_3_0; }
	}
	public class GridSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.GridSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGridSizeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGridSizeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHeightKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cHeightAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cHeightINTTerminalRuleCall_2_1_0 = (RuleCall)cHeightAssignment_2_1.eContents().get(0);
		private final Keyword cWidthKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cWidthAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cWidthINTTerminalRuleCall_2_3_0 = (RuleCall)cWidthAssignment_2_3.eContents().get(0);
		
		//GridSize:{GridSize} 'GridSize'
		//('height:' height = INT 'width:' width = INT);
		@Override public ParserRule getRule() { return rule; }
		
		//{GridSize} 'GridSize'
		//('height:' height = INT 'width:' width = INT)
		public Group getGroup() { return cGroup; }
		
		//{GridSize}
		public Action getGridSizeAction_0() { return cGridSizeAction_0; }
		
		//'GridSize'
		public Keyword getGridSizeKeyword_1() { return cGridSizeKeyword_1; }
		
		//('height:' height = INT 'width:' width = INT)
		public Group getGroup_2() { return cGroup_2; }
		
		//'height:'
		public Keyword getHeightKeyword_2_0() { return cHeightKeyword_2_0; }
		
		//height = INT
		public Assignment getHeightAssignment_2_1() { return cHeightAssignment_2_1; }
		
		//INT
		public RuleCall getHeightINTTerminalRuleCall_2_1_0() { return cHeightINTTerminalRuleCall_2_1_0; }
		
		//'width:'
		public Keyword getWidthKeyword_2_2() { return cWidthKeyword_2_2; }
		
		//width = INT
		public Assignment getWidthAssignment_2_3() { return cWidthAssignment_2_3; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_2_3_0() { return cWidthINTTerminalRuleCall_2_3_0; }
	}
	public class PopulatedCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.PopulatedCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPointKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPoiAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPoiPointParserRuleCall_1_0 = (RuleCall)cPoiAssignment_1.eContents().get(0);
		
		//PopulatedCell: ('Point' poi=Point);
		@Override public ParserRule getRule() { return rule; }
		
		//('Point' poi=Point)
		public Group getGroup() { return cGroup; }
		
		//'Point'
		public Keyword getPointKeyword_0() { return cPointKeyword_0; }
		
		//poi=Point
		public Assignment getPoiAssignment_1() { return cPoiAssignment_1; }
		
		//Point
		public RuleCall getPoiPointParserRuleCall_1_0() { return cPoiPointParserRuleCall_1_0; }
	}
	public class PointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Point");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXINTTerminalRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYINTTerminalRuleCall_3_0 = (RuleCall)cYAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Point: '(' x=INT',' y=INT')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' x=INT',' y=INT')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//x=INT
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_1_0() { return cXINTTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//y=INT
		public Assignment getYAssignment_3() { return cYAssignment_3; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_3_0() { return cYINTTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class RulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Rules");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRulesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRulesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRulesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRulesRuleParserRuleCall_2_0 = (RuleCall)cRulesAssignment_2.eContents().get(0);
		
		//Rules: {Rules} 'Rules'
		//       rules += Rule*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Rules} 'Rules'
		//      rules += Rule*
		public Group getGroup() { return cGroup; }
		
		//{Rules}
		public Action getRulesAction_0() { return cRulesAction_0; }
		
		//'Rules'
		public Keyword getRulesKeyword_1() { return cRulesKeyword_1; }
		
		//rules += Rule*
		public Assignment getRulesAssignment_2() { return cRulesAssignment_2; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_2_0() { return cRulesRuleParserRuleCall_2_0; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBoolOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBoolOpBoolOpParserRuleCall_0_0 = (RuleCall)cBoolOpAssignment_0.eContents().get(0);
		private final Assignment cNCountAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNCountINTTerminalRuleCall_1_0 = (RuleCall)cNCountAssignment_1.eContents().get(0);
		
		// // A list of rules, none or whatever size
		//Condition: boolOp=BoolOp NCount=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//boolOp=BoolOp NCount=INT
		public Group getGroup() { return cGroup; }
		
		//boolOp=BoolOp
		public Assignment getBoolOpAssignment_0() { return cBoolOpAssignment_0; }
		
		//BoolOp
		public RuleCall getBoolOpBoolOpParserRuleCall_0_0() { return cBoolOpBoolOpParserRuleCall_0_0; }
		
		//NCount=INT
		public Assignment getNCountAssignment_1() { return cNCountAssignment_1; }
		
		//INT
		public RuleCall getNCountINTTerminalRuleCall_1_0() { return cNCountINTTerminalRuleCall_1_0; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEachKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_1_0 = (RuleCall)cStateAssignment_1.eContents().get(0);
		private final Keyword cCellKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConditionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConditionsConditionParserRuleCall_4_0 = (RuleCall)cConditionsAssignment_4.eContents().get(0);
		private final Keyword cNeighborsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cResultAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cResultOutcomeParserRuleCall_6_0 = (RuleCall)cResultAssignment_6.eContents().get(0);
		
		//Rule: 'Each' state=State 'cell' 'with' conditions += Condition+ 'neighbors' result=Outcome;
		@Override public ParserRule getRule() { return rule; }
		
		//'Each' state=State 'cell' 'with' conditions += Condition+ 'neighbors' result=Outcome
		public Group getGroup() { return cGroup; }
		
		//'Each'
		public Keyword getEachKeyword_0() { return cEachKeyword_0; }
		
		//state=State
		public Assignment getStateAssignment_1() { return cStateAssignment_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_1_0() { return cStateStateParserRuleCall_1_0; }
		
		//'cell'
		public Keyword getCellKeyword_2() { return cCellKeyword_2; }
		
		//'with'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//conditions += Condition+
		public Assignment getConditionsAssignment_4() { return cConditionsAssignment_4; }
		
		//Condition
		public RuleCall getConditionsConditionParserRuleCall_4_0() { return cConditionsConditionParserRuleCall_4_0; }
		
		//'neighbors'
		public Keyword getNeighborsKeyword_5() { return cNeighborsKeyword_5; }
		
		//result=Outcome
		public Assignment getResultAssignment_6() { return cResultAssignment_6; }
		
		//Outcome
		public RuleCall getResultOutcomeParserRuleCall_6_0() { return cResultOutcomeParserRuleCall_6_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.State");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cLivingKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDeadKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//State: 'living' | 'dead';
		@Override public ParserRule getRule() { return rule; }
		
		//'living' | 'dead'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'living'
		public Keyword getLivingKeyword_0() { return cLivingKeyword_0; }
		
		//'dead'
		public Keyword getDeadKeyword_1() { return cDeadKeyword_1; }
	}
	public class BoolOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.BoolOp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cGreaterThanSignEqualsSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cEqualsSignEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//BoolOp: '>' | '<' | '>='| '<=' | '==';
		@Override public ParserRule getRule() { return rule; }
		
		//'>' | '<' | '>='| '<=' | '=='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_0() { return cGreaterThanSignKeyword_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_2() { return cGreaterThanSignEqualsSignKeyword_2; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_3() { return cLessThanSignEqualsSignKeyword_3; }
		
		//'=='
		public Keyword getEqualsSignEqualsSignKeyword_4() { return cEqualsSignEqualsSignKeyword_4; }
	}
	public class OutcomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "cps.gameoflife.Lsjatl.Outcome");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSurvivesKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cDiesKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cPopulatesKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//Outcome: 'survives' | 'dies' | 'populates';
		@Override public ParserRule getRule() { return rule; }
		
		//'survives' | 'dies' | 'populates'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'survives'
		public Keyword getSurvivesKeyword_0() { return cSurvivesKeyword_0; }
		
		//'dies'
		public Keyword getDiesKeyword_1() { return cDiesKeyword_1; }
		
		//'populates'
		public Keyword getPopulatesKeyword_2() { return cPopulatesKeyword_2; }
	}
	
	
	private final GameElements pGame;
	private final GridElements pGrid;
	private final GridSizeElements pGridSize;
	private final PopulatedCellElements pPopulatedCell;
	private final PointElements pPoint;
	private final RulesElements pRules;
	private final ConditionElements pCondition;
	private final RuleElements pRule;
	private final StateElements pState;
	private final BoolOpElements pBoolOp;
	private final OutcomeElements pOutcome;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LsjatlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGame = new GameElements();
		this.pGrid = new GridElements();
		this.pGridSize = new GridSizeElements();
		this.pPopulatedCell = new PopulatedCellElements();
		this.pPoint = new PointElements();
		this.pRules = new RulesElements();
		this.pCondition = new ConditionElements();
		this.pRule = new RuleElements();
		this.pState = new StateElements();
		this.pBoolOp = new BoolOpElements();
		this.pOutcome = new OutcomeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("cps.gameoflife.Lsjatl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Game: grid = Grid // A game consists of a
	//      rules = Rules;
	public GameElements getGameAccess() {
		return pGame;
	}
	
	public ParserRule getGameRule() {
		return getGameAccess().getRule();
	}
	
	//Grid:{Grid} 'Grid' size= GridSize // Point optional
	//     populatedCells += PopulatedCell*;
	public GridElements getGridAccess() {
		return pGrid;
	}
	
	public ParserRule getGridRule() {
		return getGridAccess().getRule();
	}
	
	//GridSize:{GridSize} 'GridSize'
	//('height:' height = INT 'width:' width = INT);
	public GridSizeElements getGridSizeAccess() {
		return pGridSize;
	}
	
	public ParserRule getGridSizeRule() {
		return getGridSizeAccess().getRule();
	}
	
	//PopulatedCell: ('Point' poi=Point);
	public PopulatedCellElements getPopulatedCellAccess() {
		return pPopulatedCell;
	}
	
	public ParserRule getPopulatedCellRule() {
		return getPopulatedCellAccess().getRule();
	}
	
	//Point: '(' x=INT',' y=INT')';
	public PointElements getPointAccess() {
		return pPoint;
	}
	
	public ParserRule getPointRule() {
		return getPointAccess().getRule();
	}
	
	//Rules: {Rules} 'Rules'
	//       rules += Rule*;
	public RulesElements getRulesAccess() {
		return pRules;
	}
	
	public ParserRule getRulesRule() {
		return getRulesAccess().getRule();
	}
	
	// // A list of rules, none or whatever size
	//Condition: boolOp=BoolOp NCount=INT;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//Rule: 'Each' state=State 'cell' 'with' conditions += Condition+ 'neighbors' result=Outcome;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//State: 'living' | 'dead';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//BoolOp: '>' | '<' | '>='| '<=' | '==';
	public BoolOpElements getBoolOpAccess() {
		return pBoolOp;
	}
	
	public ParserRule getBoolOpRule() {
		return getBoolOpAccess().getRule();
	}
	
	//Outcome: 'survives' | 'dies' | 'populates';
	public OutcomeElements getOutcomeAccess() {
		return pOutcome;
	}
	
	public ParserRule getOutcomeRule() {
		return getOutcomeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
