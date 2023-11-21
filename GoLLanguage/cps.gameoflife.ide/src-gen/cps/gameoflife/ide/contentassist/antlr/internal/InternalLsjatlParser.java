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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLsjatlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&&'", "'||'", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'", "'Grid'", "'PopulatedCells:'", "'GridSize'", "'height:'", "'width:'", "'('", "','", "')'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLsjatlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLsjatlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLsjatlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLsjatl.g"; }


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



    // $ANTLR start "entryRuleGame"
    // InternalLsjatl.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalLsjatl.g:54:1: ( ruleGame EOF )
            // InternalLsjatl.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalLsjatl.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalLsjatl.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalLsjatl.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalLsjatl.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalLsjatl.g:69:3: ( rule__Game__Group__0 )
            // InternalLsjatl.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGrid"
    // InternalLsjatl.g:78:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalLsjatl.g:79:1: ( ruleGrid EOF )
            // InternalLsjatl.g:80:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalLsjatl.g:87:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:91:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalLsjatl.g:92:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalLsjatl.g:92:2: ( ( rule__Grid__Group__0 ) )
            // InternalLsjatl.g:93:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalLsjatl.g:94:3: ( rule__Grid__Group__0 )
            // InternalLsjatl.g:94:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleGridSize"
    // InternalLsjatl.g:103:1: entryRuleGridSize : ruleGridSize EOF ;
    public final void entryRuleGridSize() throws RecognitionException {
        try {
            // InternalLsjatl.g:104:1: ( ruleGridSize EOF )
            // InternalLsjatl.g:105:1: ruleGridSize EOF
            {
             before(grammarAccess.getGridSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGridSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGridSize"


    // $ANTLR start "ruleGridSize"
    // InternalLsjatl.g:112:1: ruleGridSize : ( ( rule__GridSize__Group__0 ) ) ;
    public final void ruleGridSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:116:2: ( ( ( rule__GridSize__Group__0 ) ) )
            // InternalLsjatl.g:117:2: ( ( rule__GridSize__Group__0 ) )
            {
            // InternalLsjatl.g:117:2: ( ( rule__GridSize__Group__0 ) )
            // InternalLsjatl.g:118:3: ( rule__GridSize__Group__0 )
            {
             before(grammarAccess.getGridSizeAccess().getGroup()); 
            // InternalLsjatl.g:119:3: ( rule__GridSize__Group__0 )
            // InternalLsjatl.g:119:4: rule__GridSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridSize"


    // $ANTLR start "entryRulePopulatedCell"
    // InternalLsjatl.g:128:1: entryRulePopulatedCell : rulePopulatedCell EOF ;
    public final void entryRulePopulatedCell() throws RecognitionException {
        try {
            // InternalLsjatl.g:129:1: ( rulePopulatedCell EOF )
            // InternalLsjatl.g:130:1: rulePopulatedCell EOF
            {
             before(grammarAccess.getPopulatedCellRule()); 
            pushFollow(FOLLOW_1);
            rulePopulatedCell();

            state._fsp--;

             after(grammarAccess.getPopulatedCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePopulatedCell"


    // $ANTLR start "rulePopulatedCell"
    // InternalLsjatl.g:137:1: rulePopulatedCell : ( ( rule__PopulatedCell__Group__0 ) ) ;
    public final void rulePopulatedCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:141:2: ( ( ( rule__PopulatedCell__Group__0 ) ) )
            // InternalLsjatl.g:142:2: ( ( rule__PopulatedCell__Group__0 ) )
            {
            // InternalLsjatl.g:142:2: ( ( rule__PopulatedCell__Group__0 ) )
            // InternalLsjatl.g:143:3: ( rule__PopulatedCell__Group__0 )
            {
             before(grammarAccess.getPopulatedCellAccess().getGroup()); 
            // InternalLsjatl.g:144:3: ( rule__PopulatedCell__Group__0 )
            // InternalLsjatl.g:144:4: rule__PopulatedCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePopulatedCell"


    // $ANTLR start "entryRuleRules"
    // InternalLsjatl.g:153:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalLsjatl.g:154:1: ( ruleRules EOF )
            // InternalLsjatl.g:155:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalLsjatl.g:162:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:166:2: ( ( ( rule__Rules__Group__0 ) ) )
            // InternalLsjatl.g:167:2: ( ( rule__Rules__Group__0 ) )
            {
            // InternalLsjatl.g:167:2: ( ( rule__Rules__Group__0 ) )
            // InternalLsjatl.g:168:3: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // InternalLsjatl.g:169:3: ( rule__Rules__Group__0 )
            // InternalLsjatl.g:169:4: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleCondition"
    // InternalLsjatl.g:178:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalLsjatl.g:179:1: ( ruleCondition EOF )
            // InternalLsjatl.g:180:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalLsjatl.g:187:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:191:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalLsjatl.g:192:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalLsjatl.g:192:2: ( ( rule__Condition__Group__0 ) )
            // InternalLsjatl.g:193:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalLsjatl.g:194:3: ( rule__Condition__Group__0 )
            // InternalLsjatl.g:194:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleRule"
    // InternalLsjatl.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalLsjatl.g:204:1: ( ruleRule EOF )
            // InternalLsjatl.g:205:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalLsjatl.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalLsjatl.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalLsjatl.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalLsjatl.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalLsjatl.g:219:3: ( rule__Rule__Group__0 )
            // InternalLsjatl.g:219:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSeparator"
    // InternalLsjatl.g:228:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalLsjatl.g:229:1: ( ruleSeparator EOF )
            // InternalLsjatl.g:230:1: ruleSeparator EOF
            {
             before(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getSeparatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalLsjatl.g:237:1: ruleSeparator : ( ( rule__Separator__Alternatives ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:241:2: ( ( ( rule__Separator__Alternatives ) ) )
            // InternalLsjatl.g:242:2: ( ( rule__Separator__Alternatives ) )
            {
            // InternalLsjatl.g:242:2: ( ( rule__Separator__Alternatives ) )
            // InternalLsjatl.g:243:3: ( rule__Separator__Alternatives )
            {
             before(grammarAccess.getSeparatorAccess().getAlternatives()); 
            // InternalLsjatl.g:244:3: ( rule__Separator__Alternatives )
            // InternalLsjatl.g:244:4: rule__Separator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Separator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleState"
    // InternalLsjatl.g:253:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalLsjatl.g:254:1: ( ruleState EOF )
            // InternalLsjatl.g:255:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalLsjatl.g:262:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:266:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalLsjatl.g:267:2: ( ( rule__State__Alternatives ) )
            {
            // InternalLsjatl.g:267:2: ( ( rule__State__Alternatives ) )
            // InternalLsjatl.g:268:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalLsjatl.g:269:3: ( rule__State__Alternatives )
            // InternalLsjatl.g:269:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleBoolOp"
    // InternalLsjatl.g:278:1: entryRuleBoolOp : ruleBoolOp EOF ;
    public final void entryRuleBoolOp() throws RecognitionException {
        try {
            // InternalLsjatl.g:279:1: ( ruleBoolOp EOF )
            // InternalLsjatl.g:280:1: ruleBoolOp EOF
            {
             before(grammarAccess.getBoolOpRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getBoolOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolOp"


    // $ANTLR start "ruleBoolOp"
    // InternalLsjatl.g:287:1: ruleBoolOp : ( ( rule__BoolOp__Alternatives ) ) ;
    public final void ruleBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:291:2: ( ( ( rule__BoolOp__Alternatives ) ) )
            // InternalLsjatl.g:292:2: ( ( rule__BoolOp__Alternatives ) )
            {
            // InternalLsjatl.g:292:2: ( ( rule__BoolOp__Alternatives ) )
            // InternalLsjatl.g:293:3: ( rule__BoolOp__Alternatives )
            {
             before(grammarAccess.getBoolOpAccess().getAlternatives()); 
            // InternalLsjatl.g:294:3: ( rule__BoolOp__Alternatives )
            // InternalLsjatl.g:294:4: rule__BoolOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolOp"


    // $ANTLR start "entryRuleOutcome"
    // InternalLsjatl.g:303:1: entryRuleOutcome : ruleOutcome EOF ;
    public final void entryRuleOutcome() throws RecognitionException {
        try {
            // InternalLsjatl.g:304:1: ( ruleOutcome EOF )
            // InternalLsjatl.g:305:1: ruleOutcome EOF
            {
             before(grammarAccess.getOutcomeRule()); 
            pushFollow(FOLLOW_1);
            ruleOutcome();

            state._fsp--;

             after(grammarAccess.getOutcomeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutcome"


    // $ANTLR start "ruleOutcome"
    // InternalLsjatl.g:312:1: ruleOutcome : ( ( rule__Outcome__Alternatives ) ) ;
    public final void ruleOutcome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:316:2: ( ( ( rule__Outcome__Alternatives ) ) )
            // InternalLsjatl.g:317:2: ( ( rule__Outcome__Alternatives ) )
            {
            // InternalLsjatl.g:317:2: ( ( rule__Outcome__Alternatives ) )
            // InternalLsjatl.g:318:3: ( rule__Outcome__Alternatives )
            {
             before(grammarAccess.getOutcomeAccess().getAlternatives()); 
            // InternalLsjatl.g:319:3: ( rule__Outcome__Alternatives )
            // InternalLsjatl.g:319:4: rule__Outcome__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Outcome__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutcomeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutcome"


    // $ANTLR start "rule__Separator__Alternatives"
    // InternalLsjatl.g:327:1: rule__Separator__Alternatives : ( ( '&&' ) | ( '||' ) );
    public final void rule__Separator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:331:1: ( ( '&&' ) | ( '||' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLsjatl.g:332:2: ( '&&' )
                    {
                    // InternalLsjatl.g:332:2: ( '&&' )
                    // InternalLsjatl.g:333:3: '&&'
                    {
                     before(grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:338:2: ( '||' )
                    {
                    // InternalLsjatl.g:338:2: ( '||' )
                    // InternalLsjatl.g:339:3: '||'
                    {
                     before(grammarAccess.getSeparatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getVerticalLineVerticalLineKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Alternatives"


    // $ANTLR start "rule__State__Alternatives"
    // InternalLsjatl.g:348:1: rule__State__Alternatives : ( ( 'living' ) | ( 'dead' ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:352:1: ( ( 'living' ) | ( 'dead' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLsjatl.g:353:2: ( 'living' )
                    {
                    // InternalLsjatl.g:353:2: ( 'living' )
                    // InternalLsjatl.g:354:3: 'living'
                    {
                     before(grammarAccess.getStateAccess().getLivingKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getLivingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:359:2: ( 'dead' )
                    {
                    // InternalLsjatl.g:359:2: ( 'dead' )
                    // InternalLsjatl.g:360:3: 'dead'
                    {
                     before(grammarAccess.getStateAccess().getDeadKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getDeadKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__BoolOp__Alternatives"
    // InternalLsjatl.g:369:1: rule__BoolOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) );
    public final void rule__BoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:373:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLsjatl.g:374:2: ( '>' )
                    {
                    // InternalLsjatl.g:374:2: ( '>' )
                    // InternalLsjatl.g:375:3: '>'
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:380:2: ( '<' )
                    {
                    // InternalLsjatl.g:380:2: ( '<' )
                    // InternalLsjatl.g:381:3: '<'
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:386:2: ( '>=' )
                    {
                    // InternalLsjatl.g:386:2: ( '>=' )
                    // InternalLsjatl.g:387:3: '>='
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:392:2: ( '<=' )
                    {
                    // InternalLsjatl.g:392:2: ( '<=' )
                    // InternalLsjatl.g:393:3: '<='
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:398:2: ( '==' )
                    {
                    // InternalLsjatl.g:398:2: ( '==' )
                    // InternalLsjatl.g:399:3: '=='
                    {
                     before(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOp__Alternatives"


    // $ANTLR start "rule__Outcome__Alternatives"
    // InternalLsjatl.g:408:1: rule__Outcome__Alternatives : ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) );
    public final void rule__Outcome__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:412:1: ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLsjatl.g:413:2: ( 'survives' )
                    {
                    // InternalLsjatl.g:413:2: ( 'survives' )
                    // InternalLsjatl.g:414:3: 'survives'
                    {
                     before(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:419:2: ( 'dies' )
                    {
                    // InternalLsjatl.g:419:2: ( 'dies' )
                    // InternalLsjatl.g:420:3: 'dies'
                    {
                     before(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:425:2: ( 'populates' )
                    {
                    // InternalLsjatl.g:425:2: ( 'populates' )
                    // InternalLsjatl.g:426:3: 'populates'
                    {
                     before(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outcome__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalLsjatl.g:435:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:439:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalLsjatl.g:440:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalLsjatl.g:447:1: rule__Game__Group__0__Impl : ( ( rule__Game__GridAssignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:451:1: ( ( ( rule__Game__GridAssignment_0 ) ) )
            // InternalLsjatl.g:452:1: ( ( rule__Game__GridAssignment_0 ) )
            {
            // InternalLsjatl.g:452:1: ( ( rule__Game__GridAssignment_0 ) )
            // InternalLsjatl.g:453:2: ( rule__Game__GridAssignment_0 )
            {
             before(grammarAccess.getGameAccess().getGridAssignment_0()); 
            // InternalLsjatl.g:454:2: ( rule__Game__GridAssignment_0 )
            // InternalLsjatl.g:454:3: rule__Game__GridAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Game__GridAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGridAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalLsjatl.g:462:1: rule__Game__Group__1 : rule__Game__Group__1__Impl ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:466:1: ( rule__Game__Group__1__Impl )
            // InternalLsjatl.g:467:2: rule__Game__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalLsjatl.g:473:1: rule__Game__Group__1__Impl : ( ( rule__Game__RulesAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:477:1: ( ( ( rule__Game__RulesAssignment_1 ) ) )
            // InternalLsjatl.g:478:1: ( ( rule__Game__RulesAssignment_1 ) )
            {
            // InternalLsjatl.g:478:1: ( ( rule__Game__RulesAssignment_1 ) )
            // InternalLsjatl.g:479:2: ( rule__Game__RulesAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getRulesAssignment_1()); 
            // InternalLsjatl.g:480:2: ( rule__Game__RulesAssignment_1 )
            // InternalLsjatl.g:480:3: rule__Game__RulesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalLsjatl.g:489:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:493:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalLsjatl.g:494:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalLsjatl.g:501:1: rule__Grid__Group__0__Impl : ( () ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:505:1: ( ( () ) )
            // InternalLsjatl.g:506:1: ( () )
            {
            // InternalLsjatl.g:506:1: ( () )
            // InternalLsjatl.g:507:2: ()
            {
             before(grammarAccess.getGridAccess().getGridAction_0()); 
            // InternalLsjatl.g:508:2: ()
            // InternalLsjatl.g:508:3: 
            {
            }

             after(grammarAccess.getGridAccess().getGridAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalLsjatl.g:516:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:520:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalLsjatl.g:521:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalLsjatl.g:528:1: rule__Grid__Group__1__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:532:1: ( ( 'Grid' ) )
            // InternalLsjatl.g:533:1: ( 'Grid' )
            {
            // InternalLsjatl.g:533:1: ( 'Grid' )
            // InternalLsjatl.g:534:2: 'Grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalLsjatl.g:543:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:547:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalLsjatl.g:548:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalLsjatl.g:555:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__SizeAssignment_2 ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:559:1: ( ( ( rule__Grid__SizeAssignment_2 ) ) )
            // InternalLsjatl.g:560:1: ( ( rule__Grid__SizeAssignment_2 ) )
            {
            // InternalLsjatl.g:560:1: ( ( rule__Grid__SizeAssignment_2 ) )
            // InternalLsjatl.g:561:2: ( rule__Grid__SizeAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_2()); 
            // InternalLsjatl.g:562:2: ( rule__Grid__SizeAssignment_2 )
            // InternalLsjatl.g:562:3: rule__Grid__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Grid__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalLsjatl.g:570:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl rule__Grid__Group__4 ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:574:1: ( rule__Grid__Group__3__Impl rule__Grid__Group__4 )
            // InternalLsjatl.g:575:2: rule__Grid__Group__3__Impl rule__Grid__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Grid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalLsjatl.g:582:1: rule__Grid__Group__3__Impl : ( 'PopulatedCells:' ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:586:1: ( ( 'PopulatedCells:' ) )
            // InternalLsjatl.g:587:1: ( 'PopulatedCells:' )
            {
            // InternalLsjatl.g:587:1: ( 'PopulatedCells:' )
            // InternalLsjatl.g:588:2: 'PopulatedCells:'
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getPopulatedCellsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Grid__Group__4"
    // InternalLsjatl.g:597:1: rule__Grid__Group__4 : rule__Grid__Group__4__Impl ;
    public final void rule__Grid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:601:1: ( rule__Grid__Group__4__Impl )
            // InternalLsjatl.g:602:2: rule__Grid__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4"


    // $ANTLR start "rule__Grid__Group__4__Impl"
    // InternalLsjatl.g:608:1: rule__Grid__Group__4__Impl : ( ( rule__Grid__PopulatedCellsAssignment_4 )* ) ;
    public final void rule__Grid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:612:1: ( ( ( rule__Grid__PopulatedCellsAssignment_4 )* ) )
            // InternalLsjatl.g:613:1: ( ( rule__Grid__PopulatedCellsAssignment_4 )* )
            {
            // InternalLsjatl.g:613:1: ( ( rule__Grid__PopulatedCellsAssignment_4 )* )
            // InternalLsjatl.g:614:2: ( rule__Grid__PopulatedCellsAssignment_4 )*
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsAssignment_4()); 
            // InternalLsjatl.g:615:2: ( rule__Grid__PopulatedCellsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLsjatl.g:615:3: rule__Grid__PopulatedCellsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Grid__PopulatedCellsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getPopulatedCellsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4__Impl"


    // $ANTLR start "rule__GridSize__Group__0"
    // InternalLsjatl.g:624:1: rule__GridSize__Group__0 : rule__GridSize__Group__0__Impl rule__GridSize__Group__1 ;
    public final void rule__GridSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:628:1: ( rule__GridSize__Group__0__Impl rule__GridSize__Group__1 )
            // InternalLsjatl.g:629:2: rule__GridSize__Group__0__Impl rule__GridSize__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GridSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__0"


    // $ANTLR start "rule__GridSize__Group__0__Impl"
    // InternalLsjatl.g:636:1: rule__GridSize__Group__0__Impl : ( () ) ;
    public final void rule__GridSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:640:1: ( ( () ) )
            // InternalLsjatl.g:641:1: ( () )
            {
            // InternalLsjatl.g:641:1: ( () )
            // InternalLsjatl.g:642:2: ()
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); 
            // InternalLsjatl.g:643:2: ()
            // InternalLsjatl.g:643:3: 
            {
            }

             after(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__0__Impl"


    // $ANTLR start "rule__GridSize__Group__1"
    // InternalLsjatl.g:651:1: rule__GridSize__Group__1 : rule__GridSize__Group__1__Impl rule__GridSize__Group__2 ;
    public final void rule__GridSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:655:1: ( rule__GridSize__Group__1__Impl rule__GridSize__Group__2 )
            // InternalLsjatl.g:656:2: rule__GridSize__Group__1__Impl rule__GridSize__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GridSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__1"


    // $ANTLR start "rule__GridSize__Group__1__Impl"
    // InternalLsjatl.g:663:1: rule__GridSize__Group__1__Impl : ( 'GridSize' ) ;
    public final void rule__GridSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:667:1: ( ( 'GridSize' ) )
            // InternalLsjatl.g:668:1: ( 'GridSize' )
            {
            // InternalLsjatl.g:668:1: ( 'GridSize' )
            // InternalLsjatl.g:669:2: 'GridSize'
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__1__Impl"


    // $ANTLR start "rule__GridSize__Group__2"
    // InternalLsjatl.g:678:1: rule__GridSize__Group__2 : rule__GridSize__Group__2__Impl ;
    public final void rule__GridSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:682:1: ( rule__GridSize__Group__2__Impl )
            // InternalLsjatl.g:683:2: rule__GridSize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__2"


    // $ANTLR start "rule__GridSize__Group__2__Impl"
    // InternalLsjatl.g:689:1: rule__GridSize__Group__2__Impl : ( ( rule__GridSize__Group_2__0 ) ) ;
    public final void rule__GridSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:693:1: ( ( ( rule__GridSize__Group_2__0 ) ) )
            // InternalLsjatl.g:694:1: ( ( rule__GridSize__Group_2__0 ) )
            {
            // InternalLsjatl.g:694:1: ( ( rule__GridSize__Group_2__0 ) )
            // InternalLsjatl.g:695:2: ( rule__GridSize__Group_2__0 )
            {
             before(grammarAccess.getGridSizeAccess().getGroup_2()); 
            // InternalLsjatl.g:696:2: ( rule__GridSize__Group_2__0 )
            // InternalLsjatl.g:696:3: rule__GridSize__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group__2__Impl"


    // $ANTLR start "rule__GridSize__Group_2__0"
    // InternalLsjatl.g:705:1: rule__GridSize__Group_2__0 : rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1 ;
    public final void rule__GridSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:709:1: ( rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1 )
            // InternalLsjatl.g:710:2: rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__GridSize__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__0"


    // $ANTLR start "rule__GridSize__Group_2__0__Impl"
    // InternalLsjatl.g:717:1: rule__GridSize__Group_2__0__Impl : ( 'height:' ) ;
    public final void rule__GridSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:721:1: ( ( 'height:' ) )
            // InternalLsjatl.g:722:1: ( 'height:' )
            {
            // InternalLsjatl.g:722:1: ( 'height:' )
            // InternalLsjatl.g:723:2: 'height:'
            {
             before(grammarAccess.getGridSizeAccess().getHeightKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getHeightKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__0__Impl"


    // $ANTLR start "rule__GridSize__Group_2__1"
    // InternalLsjatl.g:732:1: rule__GridSize__Group_2__1 : rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2 ;
    public final void rule__GridSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:736:1: ( rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2 )
            // InternalLsjatl.g:737:2: rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__GridSize__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__1"


    // $ANTLR start "rule__GridSize__Group_2__1__Impl"
    // InternalLsjatl.g:744:1: rule__GridSize__Group_2__1__Impl : ( ( rule__GridSize__HeightAssignment_2_1 ) ) ;
    public final void rule__GridSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:748:1: ( ( ( rule__GridSize__HeightAssignment_2_1 ) ) )
            // InternalLsjatl.g:749:1: ( ( rule__GridSize__HeightAssignment_2_1 ) )
            {
            // InternalLsjatl.g:749:1: ( ( rule__GridSize__HeightAssignment_2_1 ) )
            // InternalLsjatl.g:750:2: ( rule__GridSize__HeightAssignment_2_1 )
            {
             before(grammarAccess.getGridSizeAccess().getHeightAssignment_2_1()); 
            // InternalLsjatl.g:751:2: ( rule__GridSize__HeightAssignment_2_1 )
            // InternalLsjatl.g:751:3: rule__GridSize__HeightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__HeightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getHeightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__1__Impl"


    // $ANTLR start "rule__GridSize__Group_2__2"
    // InternalLsjatl.g:759:1: rule__GridSize__Group_2__2 : rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3 ;
    public final void rule__GridSize__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:763:1: ( rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3 )
            // InternalLsjatl.g:764:2: rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__GridSize__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GridSize__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__2"


    // $ANTLR start "rule__GridSize__Group_2__2__Impl"
    // InternalLsjatl.g:771:1: rule__GridSize__Group_2__2__Impl : ( 'width:' ) ;
    public final void rule__GridSize__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:775:1: ( ( 'width:' ) )
            // InternalLsjatl.g:776:1: ( 'width:' )
            {
            // InternalLsjatl.g:776:1: ( 'width:' )
            // InternalLsjatl.g:777:2: 'width:'
            {
             before(grammarAccess.getGridSizeAccess().getWidthKeyword_2_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getWidthKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__2__Impl"


    // $ANTLR start "rule__GridSize__Group_2__3"
    // InternalLsjatl.g:786:1: rule__GridSize__Group_2__3 : rule__GridSize__Group_2__3__Impl ;
    public final void rule__GridSize__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:790:1: ( rule__GridSize__Group_2__3__Impl )
            // InternalLsjatl.g:791:2: rule__GridSize__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__3"


    // $ANTLR start "rule__GridSize__Group_2__3__Impl"
    // InternalLsjatl.g:797:1: rule__GridSize__Group_2__3__Impl : ( ( rule__GridSize__WidthAssignment_2_3 ) ) ;
    public final void rule__GridSize__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:801:1: ( ( ( rule__GridSize__WidthAssignment_2_3 ) ) )
            // InternalLsjatl.g:802:1: ( ( rule__GridSize__WidthAssignment_2_3 ) )
            {
            // InternalLsjatl.g:802:1: ( ( rule__GridSize__WidthAssignment_2_3 ) )
            // InternalLsjatl.g:803:2: ( rule__GridSize__WidthAssignment_2_3 )
            {
             before(grammarAccess.getGridSizeAccess().getWidthAssignment_2_3()); 
            // InternalLsjatl.g:804:2: ( rule__GridSize__WidthAssignment_2_3 )
            // InternalLsjatl.g:804:3: rule__GridSize__WidthAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__GridSize__WidthAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getGridSizeAccess().getWidthAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__Group_2__3__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__0"
    // InternalLsjatl.g:813:1: rule__PopulatedCell__Group__0 : rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 ;
    public final void rule__PopulatedCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:817:1: ( rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 )
            // InternalLsjatl.g:818:2: rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PopulatedCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__0"


    // $ANTLR start "rule__PopulatedCell__Group__0__Impl"
    // InternalLsjatl.g:825:1: rule__PopulatedCell__Group__0__Impl : ( '(' ) ;
    public final void rule__PopulatedCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:829:1: ( ( '(' ) )
            // InternalLsjatl.g:830:1: ( '(' )
            {
            // InternalLsjatl.g:830:1: ( '(' )
            // InternalLsjatl.g:831:2: '('
            {
             before(grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__0__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__1"
    // InternalLsjatl.g:840:1: rule__PopulatedCell__Group__1 : rule__PopulatedCell__Group__1__Impl rule__PopulatedCell__Group__2 ;
    public final void rule__PopulatedCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:844:1: ( rule__PopulatedCell__Group__1__Impl rule__PopulatedCell__Group__2 )
            // InternalLsjatl.g:845:2: rule__PopulatedCell__Group__1__Impl rule__PopulatedCell__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PopulatedCell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__1"


    // $ANTLR start "rule__PopulatedCell__Group__1__Impl"
    // InternalLsjatl.g:852:1: rule__PopulatedCell__Group__1__Impl : ( ( rule__PopulatedCell__XAssignment_1 ) ) ;
    public final void rule__PopulatedCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:856:1: ( ( ( rule__PopulatedCell__XAssignment_1 ) ) )
            // InternalLsjatl.g:857:1: ( ( rule__PopulatedCell__XAssignment_1 ) )
            {
            // InternalLsjatl.g:857:1: ( ( rule__PopulatedCell__XAssignment_1 ) )
            // InternalLsjatl.g:858:2: ( rule__PopulatedCell__XAssignment_1 )
            {
             before(grammarAccess.getPopulatedCellAccess().getXAssignment_1()); 
            // InternalLsjatl.g:859:2: ( rule__PopulatedCell__XAssignment_1 )
            // InternalLsjatl.g:859:3: rule__PopulatedCell__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__1__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__2"
    // InternalLsjatl.g:867:1: rule__PopulatedCell__Group__2 : rule__PopulatedCell__Group__2__Impl rule__PopulatedCell__Group__3 ;
    public final void rule__PopulatedCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:871:1: ( rule__PopulatedCell__Group__2__Impl rule__PopulatedCell__Group__3 )
            // InternalLsjatl.g:872:2: rule__PopulatedCell__Group__2__Impl rule__PopulatedCell__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PopulatedCell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__2"


    // $ANTLR start "rule__PopulatedCell__Group__2__Impl"
    // InternalLsjatl.g:879:1: rule__PopulatedCell__Group__2__Impl : ( ',' ) ;
    public final void rule__PopulatedCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:883:1: ( ( ',' ) )
            // InternalLsjatl.g:884:1: ( ',' )
            {
            // InternalLsjatl.g:884:1: ( ',' )
            // InternalLsjatl.g:885:2: ','
            {
             before(grammarAccess.getPopulatedCellAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__2__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__3"
    // InternalLsjatl.g:894:1: rule__PopulatedCell__Group__3 : rule__PopulatedCell__Group__3__Impl rule__PopulatedCell__Group__4 ;
    public final void rule__PopulatedCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:898:1: ( rule__PopulatedCell__Group__3__Impl rule__PopulatedCell__Group__4 )
            // InternalLsjatl.g:899:2: rule__PopulatedCell__Group__3__Impl rule__PopulatedCell__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__PopulatedCell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__3"


    // $ANTLR start "rule__PopulatedCell__Group__3__Impl"
    // InternalLsjatl.g:906:1: rule__PopulatedCell__Group__3__Impl : ( ( rule__PopulatedCell__YAssignment_3 ) ) ;
    public final void rule__PopulatedCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:910:1: ( ( ( rule__PopulatedCell__YAssignment_3 ) ) )
            // InternalLsjatl.g:911:1: ( ( rule__PopulatedCell__YAssignment_3 ) )
            {
            // InternalLsjatl.g:911:1: ( ( rule__PopulatedCell__YAssignment_3 ) )
            // InternalLsjatl.g:912:2: ( rule__PopulatedCell__YAssignment_3 )
            {
             before(grammarAccess.getPopulatedCellAccess().getYAssignment_3()); 
            // InternalLsjatl.g:913:2: ( rule__PopulatedCell__YAssignment_3 )
            // InternalLsjatl.g:913:3: rule__PopulatedCell__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__3__Impl"


    // $ANTLR start "rule__PopulatedCell__Group__4"
    // InternalLsjatl.g:921:1: rule__PopulatedCell__Group__4 : rule__PopulatedCell__Group__4__Impl ;
    public final void rule__PopulatedCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:925:1: ( rule__PopulatedCell__Group__4__Impl )
            // InternalLsjatl.g:926:2: rule__PopulatedCell__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__4"


    // $ANTLR start "rule__PopulatedCell__Group__4__Impl"
    // InternalLsjatl.g:932:1: rule__PopulatedCell__Group__4__Impl : ( ')' ) ;
    public final void rule__PopulatedCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:936:1: ( ( ')' ) )
            // InternalLsjatl.g:937:1: ( ')' )
            {
            // InternalLsjatl.g:937:1: ( ')' )
            // InternalLsjatl.g:938:2: ')'
            {
             before(grammarAccess.getPopulatedCellAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__Group__4__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // InternalLsjatl.g:948:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:952:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalLsjatl.g:953:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // InternalLsjatl.g:960:1: rule__Rules__Group__0__Impl : ( () ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:964:1: ( ( () ) )
            // InternalLsjatl.g:965:1: ( () )
            {
            // InternalLsjatl.g:965:1: ( () )
            // InternalLsjatl.g:966:2: ()
            {
             before(grammarAccess.getRulesAccess().getRulesAction_0()); 
            // InternalLsjatl.g:967:2: ()
            // InternalLsjatl.g:967:3: 
            {
            }

             after(grammarAccess.getRulesAccess().getRulesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // InternalLsjatl.g:975:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:979:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalLsjatl.g:980:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Rules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // InternalLsjatl.g:987:1: rule__Rules__Group__1__Impl : ( 'Rules' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:991:1: ( ( 'Rules' ) )
            // InternalLsjatl.g:992:1: ( 'Rules' )
            {
            // InternalLsjatl.g:992:1: ( 'Rules' )
            // InternalLsjatl.g:993:2: 'Rules'
            {
             before(grammarAccess.getRulesAccess().getRulesKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRulesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // InternalLsjatl.g:1002:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1006:1: ( rule__Rules__Group__2__Impl )
            // InternalLsjatl.g:1007:2: rule__Rules__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // InternalLsjatl.g:1013:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__RulesAssignment_2 )* ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1017:1: ( ( ( rule__Rules__RulesAssignment_2 )* ) )
            // InternalLsjatl.g:1018:1: ( ( rule__Rules__RulesAssignment_2 )* )
            {
            // InternalLsjatl.g:1018:1: ( ( rule__Rules__RulesAssignment_2 )* )
            // InternalLsjatl.g:1019:2: ( rule__Rules__RulesAssignment_2 )*
            {
             before(grammarAccess.getRulesAccess().getRulesAssignment_2()); 
            // InternalLsjatl.g:1020:2: ( rule__Rules__RulesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLsjatl.g:1020:3: rule__Rules__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Rules__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalLsjatl.g:1029:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1033:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalLsjatl.g:1034:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalLsjatl.g:1041:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__BoolOpAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1045:1: ( ( ( rule__Condition__BoolOpAssignment_0 ) ) )
            // InternalLsjatl.g:1046:1: ( ( rule__Condition__BoolOpAssignment_0 ) )
            {
            // InternalLsjatl.g:1046:1: ( ( rule__Condition__BoolOpAssignment_0 ) )
            // InternalLsjatl.g:1047:2: ( rule__Condition__BoolOpAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getBoolOpAssignment_0()); 
            // InternalLsjatl.g:1048:2: ( rule__Condition__BoolOpAssignment_0 )
            // InternalLsjatl.g:1048:3: rule__Condition__BoolOpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__BoolOpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getBoolOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalLsjatl.g:1056:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1060:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalLsjatl.g:1061:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalLsjatl.g:1068:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NCountAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1072:1: ( ( ( rule__Condition__NCountAssignment_1 ) ) )
            // InternalLsjatl.g:1073:1: ( ( rule__Condition__NCountAssignment_1 ) )
            {
            // InternalLsjatl.g:1073:1: ( ( rule__Condition__NCountAssignment_1 ) )
            // InternalLsjatl.g:1074:2: ( rule__Condition__NCountAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNCountAssignment_1()); 
            // InternalLsjatl.g:1075:2: ( rule__Condition__NCountAssignment_1 )
            // InternalLsjatl.g:1075:3: rule__Condition__NCountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NCountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalLsjatl.g:1083:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1087:1: ( rule__Condition__Group__2__Impl )
            // InternalLsjatl.g:1088:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalLsjatl.g:1094:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__SeparatorAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1098:1: ( ( ( rule__Condition__SeparatorAssignment_2 )? ) )
            // InternalLsjatl.g:1099:1: ( ( rule__Condition__SeparatorAssignment_2 )? )
            {
            // InternalLsjatl.g:1099:1: ( ( rule__Condition__SeparatorAssignment_2 )? )
            // InternalLsjatl.g:1100:2: ( rule__Condition__SeparatorAssignment_2 )?
            {
             before(grammarAccess.getConditionAccess().getSeparatorAssignment_2()); 
            // InternalLsjatl.g:1101:2: ( rule__Condition__SeparatorAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLsjatl.g:1101:3: rule__Condition__SeparatorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__SeparatorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getSeparatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalLsjatl.g:1110:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1114:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalLsjatl.g:1115:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalLsjatl.g:1122:1: rule__Rule__Group__0__Impl : ( 'Each' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1126:1: ( ( 'Each' ) )
            // InternalLsjatl.g:1127:1: ( 'Each' )
            {
            // InternalLsjatl.g:1127:1: ( 'Each' )
            // InternalLsjatl.g:1128:2: 'Each'
            {
             before(grammarAccess.getRuleAccess().getEachKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalLsjatl.g:1137:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1141:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalLsjatl.g:1142:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalLsjatl.g:1149:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__StateAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1153:1: ( ( ( rule__Rule__StateAssignment_1 ) ) )
            // InternalLsjatl.g:1154:1: ( ( rule__Rule__StateAssignment_1 ) )
            {
            // InternalLsjatl.g:1154:1: ( ( rule__Rule__StateAssignment_1 ) )
            // InternalLsjatl.g:1155:2: ( rule__Rule__StateAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getStateAssignment_1()); 
            // InternalLsjatl.g:1156:2: ( rule__Rule__StateAssignment_1 )
            // InternalLsjatl.g:1156:3: rule__Rule__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalLsjatl.g:1164:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1168:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalLsjatl.g:1169:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalLsjatl.g:1176:1: rule__Rule__Group__2__Impl : ( 'cell' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1180:1: ( ( 'cell' ) )
            // InternalLsjatl.g:1181:1: ( 'cell' )
            {
            // InternalLsjatl.g:1181:1: ( 'cell' )
            // InternalLsjatl.g:1182:2: 'cell'
            {
             before(grammarAccess.getRuleAccess().getCellKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCellKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalLsjatl.g:1191:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1195:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalLsjatl.g:1196:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalLsjatl.g:1203:1: rule__Rule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1207:1: ( ( 'with' ) )
            // InternalLsjatl.g:1208:1: ( 'with' )
            {
            // InternalLsjatl.g:1208:1: ( 'with' )
            // InternalLsjatl.g:1209:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalLsjatl.g:1218:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1222:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalLsjatl.g:1223:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalLsjatl.g:1230:1: rule__Rule__Group__4__Impl : ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1234:1: ( ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) ) )
            // InternalLsjatl.g:1235:1: ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) )
            {
            // InternalLsjatl.g:1235:1: ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) )
            // InternalLsjatl.g:1236:2: ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* )
            {
            // InternalLsjatl.g:1236:2: ( ( rule__Rule__ConditionsAssignment_4 ) )
            // InternalLsjatl.g:1237:3: ( rule__Rule__ConditionsAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 
            // InternalLsjatl.g:1238:3: ( rule__Rule__ConditionsAssignment_4 )
            // InternalLsjatl.g:1238:4: rule__Rule__ConditionsAssignment_4
            {
            pushFollow(FOLLOW_22);
            rule__Rule__ConditionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 

            }

            // InternalLsjatl.g:1241:2: ( ( rule__Rule__ConditionsAssignment_4 )* )
            // InternalLsjatl.g:1242:3: ( rule__Rule__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 
            // InternalLsjatl.g:1243:3: ( rule__Rule__ConditionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLsjatl.g:1243:4: rule__Rule__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalLsjatl.g:1252:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1256:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalLsjatl.g:1257:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalLsjatl.g:1264:1: rule__Rule__Group__5__Impl : ( 'neighbors' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1268:1: ( ( 'neighbors' ) )
            // InternalLsjatl.g:1269:1: ( 'neighbors' )
            {
            // InternalLsjatl.g:1269:1: ( 'neighbors' )
            // InternalLsjatl.g:1270:2: 'neighbors'
            {
             before(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalLsjatl.g:1279:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1283:1: ( rule__Rule__Group__6__Impl )
            // InternalLsjatl.g:1284:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalLsjatl.g:1290:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ResultAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1294:1: ( ( ( rule__Rule__ResultAssignment_6 ) ) )
            // InternalLsjatl.g:1295:1: ( ( rule__Rule__ResultAssignment_6 ) )
            {
            // InternalLsjatl.g:1295:1: ( ( rule__Rule__ResultAssignment_6 ) )
            // InternalLsjatl.g:1296:2: ( rule__Rule__ResultAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getResultAssignment_6()); 
            // InternalLsjatl.g:1297:2: ( rule__Rule__ResultAssignment_6 )
            // InternalLsjatl.g:1297:3: rule__Rule__ResultAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResultAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResultAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Game__GridAssignment_0"
    // InternalLsjatl.g:1306:1: rule__Game__GridAssignment_0 : ( ruleGrid ) ;
    public final void rule__Game__GridAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1310:1: ( ( ruleGrid ) )
            // InternalLsjatl.g:1311:2: ( ruleGrid )
            {
            // InternalLsjatl.g:1311:2: ( ruleGrid )
            // InternalLsjatl.g:1312:3: ruleGrid
            {
             before(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GridAssignment_0"


    // $ANTLR start "rule__Game__RulesAssignment_1"
    // InternalLsjatl.g:1321:1: rule__Game__RulesAssignment_1 : ( ruleRules ) ;
    public final void rule__Game__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1325:1: ( ( ruleRules ) )
            // InternalLsjatl.g:1326:2: ( ruleRules )
            {
            // InternalLsjatl.g:1326:2: ( ruleRules )
            // InternalLsjatl.g:1327:3: ruleRules
            {
             before(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__RulesAssignment_1"


    // $ANTLR start "rule__Grid__SizeAssignment_2"
    // InternalLsjatl.g:1336:1: rule__Grid__SizeAssignment_2 : ( ruleGridSize ) ;
    public final void rule__Grid__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1340:1: ( ( ruleGridSize ) )
            // InternalLsjatl.g:1341:2: ( ruleGridSize )
            {
            // InternalLsjatl.g:1341:2: ( ruleGridSize )
            // InternalLsjatl.g:1342:3: ruleGridSize
            {
             before(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGridSize();

            state._fsp--;

             after(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__SizeAssignment_2"


    // $ANTLR start "rule__Grid__PopulatedCellsAssignment_4"
    // InternalLsjatl.g:1351:1: rule__Grid__PopulatedCellsAssignment_4 : ( rulePopulatedCell ) ;
    public final void rule__Grid__PopulatedCellsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1355:1: ( ( rulePopulatedCell ) )
            // InternalLsjatl.g:1356:2: ( rulePopulatedCell )
            {
            // InternalLsjatl.g:1356:2: ( rulePopulatedCell )
            // InternalLsjatl.g:1357:3: rulePopulatedCell
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePopulatedCell();

            state._fsp--;

             after(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__PopulatedCellsAssignment_4"


    // $ANTLR start "rule__GridSize__HeightAssignment_2_1"
    // InternalLsjatl.g:1366:1: rule__GridSize__HeightAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GridSize__HeightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1370:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1371:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1371:2: ( RULE_INT )
            // InternalLsjatl.g:1372:3: RULE_INT
            {
             before(grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__HeightAssignment_2_1"


    // $ANTLR start "rule__GridSize__WidthAssignment_2_3"
    // InternalLsjatl.g:1381:1: rule__GridSize__WidthAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__GridSize__WidthAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1385:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1386:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1386:2: ( RULE_INT )
            // InternalLsjatl.g:1387:3: RULE_INT
            {
             before(grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GridSize__WidthAssignment_2_3"


    // $ANTLR start "rule__PopulatedCell__XAssignment_1"
    // InternalLsjatl.g:1396:1: rule__PopulatedCell__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__PopulatedCell__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1400:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1401:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1401:2: ( RULE_INT )
            // InternalLsjatl.g:1402:3: RULE_INT
            {
             before(grammarAccess.getPopulatedCellAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__XAssignment_1"


    // $ANTLR start "rule__PopulatedCell__YAssignment_3"
    // InternalLsjatl.g:1411:1: rule__PopulatedCell__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__PopulatedCell__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1415:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1416:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1416:2: ( RULE_INT )
            // InternalLsjatl.g:1417:3: RULE_INT
            {
             before(grammarAccess.getPopulatedCellAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PopulatedCell__YAssignment_3"


    // $ANTLR start "rule__Rules__RulesAssignment_2"
    // InternalLsjatl.g:1426:1: rule__Rules__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__Rules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1430:1: ( ( ruleRule ) )
            // InternalLsjatl.g:1431:2: ( ruleRule )
            {
            // InternalLsjatl.g:1431:2: ( ruleRule )
            // InternalLsjatl.g:1432:3: ruleRule
            {
             before(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__RulesAssignment_2"


    // $ANTLR start "rule__Condition__BoolOpAssignment_0"
    // InternalLsjatl.g:1441:1: rule__Condition__BoolOpAssignment_0 : ( ruleBoolOp ) ;
    public final void rule__Condition__BoolOpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1445:1: ( ( ruleBoolOp ) )
            // InternalLsjatl.g:1446:2: ( ruleBoolOp )
            {
            // InternalLsjatl.g:1446:2: ( ruleBoolOp )
            // InternalLsjatl.g:1447:3: ruleBoolOp
            {
             before(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__BoolOpAssignment_0"


    // $ANTLR start "rule__Condition__NCountAssignment_1"
    // InternalLsjatl.g:1456:1: rule__Condition__NCountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__NCountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1460:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1461:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1461:2: ( RULE_INT )
            // InternalLsjatl.g:1462:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NCountAssignment_1"


    // $ANTLR start "rule__Condition__SeparatorAssignment_2"
    // InternalLsjatl.g:1471:1: rule__Condition__SeparatorAssignment_2 : ( ruleSeparator ) ;
    public final void rule__Condition__SeparatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1475:1: ( ( ruleSeparator ) )
            // InternalLsjatl.g:1476:2: ( ruleSeparator )
            {
            // InternalLsjatl.g:1476:2: ( ruleSeparator )
            // InternalLsjatl.g:1477:3: ruleSeparator
            {
             before(grammarAccess.getConditionAccess().getSeparatorSeparatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSeparatorSeparatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SeparatorAssignment_2"


    // $ANTLR start "rule__Rule__StateAssignment_1"
    // InternalLsjatl.g:1486:1: rule__Rule__StateAssignment_1 : ( ruleState ) ;
    public final void rule__Rule__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1490:1: ( ( ruleState ) )
            // InternalLsjatl.g:1491:2: ( ruleState )
            {
            // InternalLsjatl.g:1491:2: ( ruleState )
            // InternalLsjatl.g:1492:3: ruleState
            {
             before(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StateAssignment_1"


    // $ANTLR start "rule__Rule__ConditionsAssignment_4"
    // InternalLsjatl.g:1501:1: rule__Rule__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1505:1: ( ( ruleCondition ) )
            // InternalLsjatl.g:1506:2: ( ruleCondition )
            {
            // InternalLsjatl.g:1506:2: ( ruleCondition )
            // InternalLsjatl.g:1507:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionsAssignment_4"


    // $ANTLR start "rule__Rule__ResultAssignment_6"
    // InternalLsjatl.g:1516:1: rule__Rule__ResultAssignment_6 : ( ruleOutcome ) ;
    public final void rule__Rule__ResultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1520:1: ( ( ruleOutcome ) )
            // InternalLsjatl.g:1521:2: ( ruleOutcome )
            {
            // InternalLsjatl.g:1521:2: ( ruleOutcome )
            // InternalLsjatl.g:1522:3: ruleOutcome
            {
             before(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOutcome();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ResultAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000700000L});

}