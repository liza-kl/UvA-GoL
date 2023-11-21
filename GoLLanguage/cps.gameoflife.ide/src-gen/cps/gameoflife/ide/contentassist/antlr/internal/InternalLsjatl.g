/*
 * generated by Xtext 2.32.0
 */
grammar InternalLsjatl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package cps.gameoflife.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package cps.gameoflife.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import cps.gameoflife.services.LsjatlGrammarAccess;

}
@parser::members {
	private LsjatlGrammarAccess grammarAccess;

	public void setGrammarAccess(LsjatlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGame
entryRuleGame
:
{ before(grammarAccess.getGameRule()); }
	 ruleGame
{ after(grammarAccess.getGameRule()); } 
	 EOF 
;

// Rule Game
ruleGame 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGameAccess().getGroup()); }
		(rule__Game__Group__0)
		{ after(grammarAccess.getGameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGrid
entryRuleGrid
:
{ before(grammarAccess.getGridRule()); }
	 ruleGrid
{ after(grammarAccess.getGridRule()); } 
	 EOF 
;

// Rule Grid
ruleGrid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGridAccess().getGroup()); }
		(rule__Grid__Group__0)
		{ after(grammarAccess.getGridAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGridSize
entryRuleGridSize
:
{ before(grammarAccess.getGridSizeRule()); }
	 ruleGridSize
{ after(grammarAccess.getGridSizeRule()); } 
	 EOF 
;

// Rule GridSize
ruleGridSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGridSizeAccess().getGroup()); }
		(rule__GridSize__Group__0)
		{ after(grammarAccess.getGridSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePopulatedCell
entryRulePopulatedCell
:
{ before(grammarAccess.getPopulatedCellRule()); }
	 rulePopulatedCell
{ after(grammarAccess.getPopulatedCellRule()); } 
	 EOF 
;

// Rule PopulatedCell
rulePopulatedCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPopulatedCellAccess().getGroup()); }
		(rule__PopulatedCell__Group__0)
		{ after(grammarAccess.getPopulatedCellAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePoint
entryRulePoint
:
{ before(grammarAccess.getPointRule()); }
	 rulePoint
{ after(grammarAccess.getPointRule()); } 
	 EOF 
;

// Rule Point
rulePoint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPointAccess().getGroup()); }
		(rule__Point__Group__0)
		{ after(grammarAccess.getPointAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRules
entryRuleRules
:
{ before(grammarAccess.getRulesRule()); }
	 ruleRules
{ after(grammarAccess.getRulesRule()); } 
	 EOF 
;

// Rule Rules
ruleRules 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRulesAccess().getGroup()); }
		(rule__Rules__Group__0)
		{ after(grammarAccess.getRulesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getAlternatives()); }
		(rule__State__Alternatives)
		{ after(grammarAccess.getStateAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolOp
entryRuleBoolOp
:
{ before(grammarAccess.getBoolOpRule()); }
	 ruleBoolOp
{ after(grammarAccess.getBoolOpRule()); } 
	 EOF 
;

// Rule BoolOp
ruleBoolOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBoolOpAccess().getAlternatives()); }
		(rule__BoolOp__Alternatives)
		{ after(grammarAccess.getBoolOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOutcome
entryRuleOutcome
:
{ before(grammarAccess.getOutcomeRule()); }
	 ruleOutcome
{ after(grammarAccess.getOutcomeRule()); } 
	 EOF 
;

// Rule Outcome
ruleOutcome 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOutcomeAccess().getAlternatives()); }
		(rule__Outcome__Alternatives)
		{ after(grammarAccess.getOutcomeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getLivingKeyword_0()); }
		'living'
		{ after(grammarAccess.getStateAccess().getLivingKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getDeadKeyword_1()); }
		'dead'
		{ after(grammarAccess.getStateAccess().getDeadKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BoolOp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); }
		'>'
		{ after(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); }
		'<'
		{ after(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); }
		'>='
		{ after(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); }
		'<='
		{ after(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); }
		'=='
		{ after(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Outcome__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); }
		'survives'
		{ after(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); }
		'dies'
		{ after(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); }
		'populates'
		{ after(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__0__Impl
	rule__Game__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getGridAssignment_0()); }
	(rule__Game__GridAssignment_0)
	{ after(grammarAccess.getGameAccess().getGridAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Game__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameAccess().getRulesAssignment_1()); }
	(rule__Game__RulesAssignment_1)
	{ after(grammarAccess.getGameAccess().getRulesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grid__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__0__Impl
	rule__Grid__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getGridAction_0()); }
	()
	{ after(grammarAccess.getGridAccess().getGridAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__1__Impl
	rule__Grid__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getGridKeyword_1()); }
	'Grid'
	{ after(grammarAccess.getGridAccess().getGridKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__2__Impl
	rule__Grid__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getSizeAssignment_2()); }
	(rule__Grid__SizeAssignment_2)
	{ after(grammarAccess.getGridAccess().getSizeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grid__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridAccess().getPopulatedCellsAssignment_3()); }
	(rule__Grid__PopulatedCellsAssignment_3)*
	{ after(grammarAccess.getGridAccess().getPopulatedCellsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GridSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__0__Impl
	rule__GridSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); }
	()
	{ after(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__1__Impl
	rule__GridSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); }
	'GridSize'
	{ after(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getGroup_2()); }
	(rule__GridSize__Group_2__0)
	{ after(grammarAccess.getGridSizeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GridSize__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group_2__0__Impl
	rule__GridSize__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getHeightKeyword_2_0()); }
	'height:'
	{ after(grammarAccess.getGridSizeAccess().getHeightKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group_2__1__Impl
	rule__GridSize__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getHeightAssignment_2_1()); }
	(rule__GridSize__HeightAssignment_2_1)
	{ after(grammarAccess.getGridSizeAccess().getHeightAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group_2__2__Impl
	rule__GridSize__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getWidthKeyword_2_2()); }
	'width:'
	{ after(grammarAccess.getGridSizeAccess().getWidthKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GridSize__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGridSizeAccess().getWidthAssignment_2_3()); }
	(rule__GridSize__WidthAssignment_2_3)
	{ after(grammarAccess.getGridSizeAccess().getWidthAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PopulatedCell__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PopulatedCell__Group__0__Impl
	rule__PopulatedCell__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PopulatedCell__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPopulatedCellAccess().getPointKeyword_0()); }
	'Point'
	{ after(grammarAccess.getPopulatedCellAccess().getPointKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PopulatedCell__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PopulatedCell__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PopulatedCell__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPopulatedCellAccess().getPoiAssignment_1()); }
	(rule__PopulatedCell__PoiAssignment_1)
	{ after(grammarAccess.getPopulatedCellAccess().getPoiAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Point__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Point__Group__0__Impl
	rule__Point__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Point__Group__1__Impl
	rule__Point__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPointAccess().getXAssignment_1()); }
	(rule__Point__XAssignment_1)
	{ after(grammarAccess.getPointAccess().getXAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Point__Group__2__Impl
	rule__Point__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPointAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getPointAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Point__Group__3__Impl
	rule__Point__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPointAccess().getYAssignment_3()); }
	(rule__Point__YAssignment_3)
	{ after(grammarAccess.getPointAccess().getYAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Point__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rules__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rules__Group__0__Impl
	rule__Rules__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rules__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRulesAccess().getRulesAction_0()); }
	()
	{ after(grammarAccess.getRulesAccess().getRulesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rules__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rules__Group__1__Impl
	rule__Rules__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rules__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRulesAccess().getRulesKeyword_1()); }
	'Rules'
	{ after(grammarAccess.getRulesAccess().getRulesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rules__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rules__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rules__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRulesAccess().getRulesAssignment_2()); }
	(rule__Rules__RulesAssignment_2)*
	{ after(grammarAccess.getRulesAccess().getRulesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getBoolOpAssignment_0()); }
	(rule__Condition__BoolOpAssignment_0)
	{ after(grammarAccess.getConditionAccess().getBoolOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getNCountAssignment_1()); }
	(rule__Condition__NCountAssignment_1)
	{ after(grammarAccess.getConditionAccess().getNCountAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getEachKeyword_0()); }
	'Each'
	{ after(grammarAccess.getRuleAccess().getEachKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getStateAssignment_1()); }
	(rule__Rule__StateAssignment_1)
	{ after(grammarAccess.getRuleAccess().getStateAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getCellKeyword_2()); }
	'cell'
	{ after(grammarAccess.getRuleAccess().getCellKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__3__Impl
	rule__Rule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getWithKeyword_3()); }
	'with'
	{ after(grammarAccess.getRuleAccess().getWithKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__4__Impl
	rule__Rule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); }
		(rule__Rule__ConditionsAssignment_4)
		{ after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); }
		(rule__Rule__ConditionsAssignment_4)*
		{ after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__5__Impl
	rule__Rule__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); }
	'neighbors'
	{ after(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getResultAssignment_6()); }
	(rule__Rule__ResultAssignment_6)
	{ after(grammarAccess.getRuleAccess().getResultAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Game__GridAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0()); }
		ruleGrid
		{ after(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Game__RulesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0()); }
		ruleRules
		{ after(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__SizeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0()); }
		ruleGridSize
		{ after(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grid__PopulatedCellsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_3_0()); }
		rulePopulatedCell
		{ after(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__HeightAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_2_1_0()); }
		RULE_INT
		{ after(grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GridSize__WidthAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_2_3_0()); }
		RULE_INT
		{ after(grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PopulatedCell__PoiAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPopulatedCellAccess().getPoiPointParserRuleCall_1_0()); }
		rulePoint
		{ after(grammarAccess.getPopulatedCellAccess().getPoiPointParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__XAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Point__YAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rules__RulesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); }
		ruleRule
		{ after(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__BoolOpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0()); }
		ruleBoolOp
		{ after(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__NCountAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__StateAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0()); }
		ruleState
		{ after(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ConditionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0()); }
		ruleCondition
		{ after(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__ResultAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0()); }
		ruleOutcome
		{ after(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
