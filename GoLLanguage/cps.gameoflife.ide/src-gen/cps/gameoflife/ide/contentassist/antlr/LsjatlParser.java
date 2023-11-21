/*
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import cps.gameoflife.ide.contentassist.antlr.internal.InternalLsjatlParser;
import cps.gameoflife.services.LsjatlGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LsjatlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LsjatlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LsjatlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSeparatorAccess().getAlternatives(), "rule__Separator__Alternatives");
			builder.put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
			builder.put(grammarAccess.getBoolOpAccess().getAlternatives(), "rule__BoolOp__Alternatives");
			builder.put(grammarAccess.getOutcomeAccess().getAlternatives(), "rule__Outcome__Alternatives");
			builder.put(grammarAccess.getGameAccess().getGroup(), "rule__Game__Group__0");
			builder.put(grammarAccess.getGridAccess().getGroup(), "rule__Grid__Group__0");
			builder.put(grammarAccess.getGridSizeAccess().getGroup(), "rule__GridSize__Group__0");
			builder.put(grammarAccess.getGridSizeAccess().getGroup_3(), "rule__GridSize__Group_3__0");
			builder.put(grammarAccess.getPopulatedCellAccess().getGroup(), "rule__PopulatedCell__Group__0");
			builder.put(grammarAccess.getRulesAccess().getGroup(), "rule__Rules__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getGameAccess().getGridAssignment_0(), "rule__Game__GridAssignment_0");
			builder.put(grammarAccess.getGameAccess().getRulesAssignment_1(), "rule__Game__RulesAssignment_1");
			builder.put(grammarAccess.getGridAccess().getSizeAssignment_2(), "rule__Grid__SizeAssignment_2");
			builder.put(grammarAccess.getGridAccess().getPopulatedCellsAssignment_4(), "rule__Grid__PopulatedCellsAssignment_4");
			builder.put(grammarAccess.getGridSizeAccess().getHeightAssignment_3_1(), "rule__GridSize__HeightAssignment_3_1");
			builder.put(grammarAccess.getGridSizeAccess().getWidthAssignment_3_4(), "rule__GridSize__WidthAssignment_3_4");
			builder.put(grammarAccess.getPopulatedCellAccess().getXAssignment_1(), "rule__PopulatedCell__XAssignment_1");
			builder.put(grammarAccess.getPopulatedCellAccess().getYAssignment_3(), "rule__PopulatedCell__YAssignment_3");
			builder.put(grammarAccess.getRulesAccess().getRulesAssignment_2(), "rule__Rules__RulesAssignment_2");
			builder.put(grammarAccess.getConditionAccess().getBoolOpAssignment_0(), "rule__Condition__BoolOpAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getNCountAssignment_1(), "rule__Condition__NCountAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getSeparatorAssignment_2(), "rule__Condition__SeparatorAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getStateAssignment_1(), "rule__Rule__StateAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getConditionsAssignment_4(), "rule__Rule__ConditionsAssignment_4");
			builder.put(grammarAccess.getRuleAccess().getResultAssignment_6(), "rule__Rule__ResultAssignment_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LsjatlGrammarAccess grammarAccess;

	@Override
	protected InternalLsjatlParser createParser() {
		InternalLsjatlParser result = new InternalLsjatlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LsjatlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LsjatlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
