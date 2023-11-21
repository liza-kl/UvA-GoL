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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'", "'Grid'", "'GridSize'", "'height:'", "'width:'", "'Point'", "'('", "','", "')'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'"
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
    public static final int T__13=13;
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


    // $ANTLR start "entryRulePoint"
    // InternalLsjatl.g:153:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalLsjatl.g:154:1: ( rulePoint EOF )
            // InternalLsjatl.g:155:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalLsjatl.g:162:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:166:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalLsjatl.g:167:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalLsjatl.g:167:2: ( ( rule__Point__Group__0 ) )
            // InternalLsjatl.g:168:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalLsjatl.g:169:3: ( rule__Point__Group__0 )
            // InternalLsjatl.g:169:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleRules"
    // InternalLsjatl.g:178:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalLsjatl.g:179:1: ( ruleRules EOF )
            // InternalLsjatl.g:180:1: ruleRules EOF
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
    // InternalLsjatl.g:187:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:191:2: ( ( ( rule__Rules__Group__0 ) ) )
            // InternalLsjatl.g:192:2: ( ( rule__Rules__Group__0 ) )
            {
            // InternalLsjatl.g:192:2: ( ( rule__Rules__Group__0 ) )
            // InternalLsjatl.g:193:3: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // InternalLsjatl.g:194:3: ( rule__Rules__Group__0 )
            // InternalLsjatl.g:194:4: rule__Rules__Group__0
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
    // InternalLsjatl.g:203:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalLsjatl.g:204:1: ( ruleCondition EOF )
            // InternalLsjatl.g:205:1: ruleCondition EOF
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
    // InternalLsjatl.g:212:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:216:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalLsjatl.g:217:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalLsjatl.g:217:2: ( ( rule__Condition__Group__0 ) )
            // InternalLsjatl.g:218:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalLsjatl.g:219:3: ( rule__Condition__Group__0 )
            // InternalLsjatl.g:219:4: rule__Condition__Group__0
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
    // InternalLsjatl.g:228:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalLsjatl.g:229:1: ( ruleRule EOF )
            // InternalLsjatl.g:230:1: ruleRule EOF
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
    // InternalLsjatl.g:237:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:241:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalLsjatl.g:242:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalLsjatl.g:242:2: ( ( rule__Rule__Group__0 ) )
            // InternalLsjatl.g:243:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalLsjatl.g:244:3: ( rule__Rule__Group__0 )
            // InternalLsjatl.g:244:4: rule__Rule__Group__0
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


    // $ANTLR start "rule__State__Alternatives"
    // InternalLsjatl.g:327:1: rule__State__Alternatives : ( ( 'living' ) | ( 'dead' ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:331:1: ( ( 'living' ) | ( 'dead' ) )
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
                    // InternalLsjatl.g:332:2: ( 'living' )
                    {
                    // InternalLsjatl.g:332:2: ( 'living' )
                    // InternalLsjatl.g:333:3: 'living'
                    {
                     before(grammarAccess.getStateAccess().getLivingKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getLivingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:338:2: ( 'dead' )
                    {
                    // InternalLsjatl.g:338:2: ( 'dead' )
                    // InternalLsjatl.g:339:3: 'dead'
                    {
                     before(grammarAccess.getStateAccess().getDeadKeyword_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalLsjatl.g:348:1: rule__BoolOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) );
    public final void rule__BoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:352:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLsjatl.g:353:2: ( '>' )
                    {
                    // InternalLsjatl.g:353:2: ( '>' )
                    // InternalLsjatl.g:354:3: '>'
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:359:2: ( '<' )
                    {
                    // InternalLsjatl.g:359:2: ( '<' )
                    // InternalLsjatl.g:360:3: '<'
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:365:2: ( '>=' )
                    {
                    // InternalLsjatl.g:365:2: ( '>=' )
                    // InternalLsjatl.g:366:3: '>='
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:371:2: ( '<=' )
                    {
                    // InternalLsjatl.g:371:2: ( '<=' )
                    // InternalLsjatl.g:372:3: '<='
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:377:2: ( '==' )
                    {
                    // InternalLsjatl.g:377:2: ( '==' )
                    // InternalLsjatl.g:378:3: '=='
                    {
                     before(grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalLsjatl.g:387:1: rule__Outcome__Alternatives : ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) );
    public final void rule__Outcome__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:391:1: ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLsjatl.g:392:2: ( 'survives' )
                    {
                    // InternalLsjatl.g:392:2: ( 'survives' )
                    // InternalLsjatl.g:393:3: 'survives'
                    {
                     before(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:398:2: ( 'dies' )
                    {
                    // InternalLsjatl.g:398:2: ( 'dies' )
                    // InternalLsjatl.g:399:3: 'dies'
                    {
                     before(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:404:2: ( 'populates' )
                    {
                    // InternalLsjatl.g:404:2: ( 'populates' )
                    // InternalLsjatl.g:405:3: 'populates'
                    {
                     before(grammarAccess.getOutcomeAccess().getPopulatesKeyword_2()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalLsjatl.g:414:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:418:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalLsjatl.g:419:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalLsjatl.g:426:1: rule__Game__Group__0__Impl : ( ( rule__Game__GridAssignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:430:1: ( ( ( rule__Game__GridAssignment_0 ) ) )
            // InternalLsjatl.g:431:1: ( ( rule__Game__GridAssignment_0 ) )
            {
            // InternalLsjatl.g:431:1: ( ( rule__Game__GridAssignment_0 ) )
            // InternalLsjatl.g:432:2: ( rule__Game__GridAssignment_0 )
            {
             before(grammarAccess.getGameAccess().getGridAssignment_0()); 
            // InternalLsjatl.g:433:2: ( rule__Game__GridAssignment_0 )
            // InternalLsjatl.g:433:3: rule__Game__GridAssignment_0
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
    // InternalLsjatl.g:441:1: rule__Game__Group__1 : rule__Game__Group__1__Impl ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:445:1: ( rule__Game__Group__1__Impl )
            // InternalLsjatl.g:446:2: rule__Game__Group__1__Impl
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
    // InternalLsjatl.g:452:1: rule__Game__Group__1__Impl : ( ( rule__Game__RulesAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:456:1: ( ( ( rule__Game__RulesAssignment_1 ) ) )
            // InternalLsjatl.g:457:1: ( ( rule__Game__RulesAssignment_1 ) )
            {
            // InternalLsjatl.g:457:1: ( ( rule__Game__RulesAssignment_1 ) )
            // InternalLsjatl.g:458:2: ( rule__Game__RulesAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getRulesAssignment_1()); 
            // InternalLsjatl.g:459:2: ( rule__Game__RulesAssignment_1 )
            // InternalLsjatl.g:459:3: rule__Game__RulesAssignment_1
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
    // InternalLsjatl.g:468:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:472:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalLsjatl.g:473:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
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
    // InternalLsjatl.g:480:1: rule__Grid__Group__0__Impl : ( () ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:484:1: ( ( () ) )
            // InternalLsjatl.g:485:1: ( () )
            {
            // InternalLsjatl.g:485:1: ( () )
            // InternalLsjatl.g:486:2: ()
            {
             before(grammarAccess.getGridAccess().getGridAction_0()); 
            // InternalLsjatl.g:487:2: ()
            // InternalLsjatl.g:487:3: 
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
    // InternalLsjatl.g:495:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:499:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalLsjatl.g:500:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
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
    // InternalLsjatl.g:507:1: rule__Grid__Group__1__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:511:1: ( ( 'Grid' ) )
            // InternalLsjatl.g:512:1: ( 'Grid' )
            {
            // InternalLsjatl.g:512:1: ( 'Grid' )
            // InternalLsjatl.g:513:2: 'Grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLsjatl.g:522:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:526:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalLsjatl.g:527:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
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
    // InternalLsjatl.g:534:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__SizeAssignment_2 ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:538:1: ( ( ( rule__Grid__SizeAssignment_2 ) ) )
            // InternalLsjatl.g:539:1: ( ( rule__Grid__SizeAssignment_2 ) )
            {
            // InternalLsjatl.g:539:1: ( ( rule__Grid__SizeAssignment_2 ) )
            // InternalLsjatl.g:540:2: ( rule__Grid__SizeAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_2()); 
            // InternalLsjatl.g:541:2: ( rule__Grid__SizeAssignment_2 )
            // InternalLsjatl.g:541:3: rule__Grid__SizeAssignment_2
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
    // InternalLsjatl.g:549:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:553:1: ( rule__Grid__Group__3__Impl )
            // InternalLsjatl.g:554:2: rule__Grid__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__3__Impl();

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
    // InternalLsjatl.g:560:1: rule__Grid__Group__3__Impl : ( ( rule__Grid__PopulatedCellsAssignment_3 )* ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:564:1: ( ( ( rule__Grid__PopulatedCellsAssignment_3 )* ) )
            // InternalLsjatl.g:565:1: ( ( rule__Grid__PopulatedCellsAssignment_3 )* )
            {
            // InternalLsjatl.g:565:1: ( ( rule__Grid__PopulatedCellsAssignment_3 )* )
            // InternalLsjatl.g:566:2: ( rule__Grid__PopulatedCellsAssignment_3 )*
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsAssignment_3()); 
            // InternalLsjatl.g:567:2: ( rule__Grid__PopulatedCellsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLsjatl.g:567:3: rule__Grid__PopulatedCellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Grid__PopulatedCellsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getPopulatedCellsAssignment_3()); 

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


    // $ANTLR start "rule__GridSize__Group__0"
    // InternalLsjatl.g:576:1: rule__GridSize__Group__0 : rule__GridSize__Group__0__Impl rule__GridSize__Group__1 ;
    public final void rule__GridSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:580:1: ( rule__GridSize__Group__0__Impl rule__GridSize__Group__1 )
            // InternalLsjatl.g:581:2: rule__GridSize__Group__0__Impl rule__GridSize__Group__1
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
    // InternalLsjatl.g:588:1: rule__GridSize__Group__0__Impl : ( () ) ;
    public final void rule__GridSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:592:1: ( ( () ) )
            // InternalLsjatl.g:593:1: ( () )
            {
            // InternalLsjatl.g:593:1: ( () )
            // InternalLsjatl.g:594:2: ()
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); 
            // InternalLsjatl.g:595:2: ()
            // InternalLsjatl.g:595:3: 
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
    // InternalLsjatl.g:603:1: rule__GridSize__Group__1 : rule__GridSize__Group__1__Impl rule__GridSize__Group__2 ;
    public final void rule__GridSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:607:1: ( rule__GridSize__Group__1__Impl rule__GridSize__Group__2 )
            // InternalLsjatl.g:608:2: rule__GridSize__Group__1__Impl rule__GridSize__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalLsjatl.g:615:1: rule__GridSize__Group__1__Impl : ( 'GridSize' ) ;
    public final void rule__GridSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:619:1: ( ( 'GridSize' ) )
            // InternalLsjatl.g:620:1: ( 'GridSize' )
            {
            // InternalLsjatl.g:620:1: ( 'GridSize' )
            // InternalLsjatl.g:621:2: 'GridSize'
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLsjatl.g:630:1: rule__GridSize__Group__2 : rule__GridSize__Group__2__Impl ;
    public final void rule__GridSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:634:1: ( rule__GridSize__Group__2__Impl )
            // InternalLsjatl.g:635:2: rule__GridSize__Group__2__Impl
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
    // InternalLsjatl.g:641:1: rule__GridSize__Group__2__Impl : ( ( rule__GridSize__Group_2__0 ) ) ;
    public final void rule__GridSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:645:1: ( ( ( rule__GridSize__Group_2__0 ) ) )
            // InternalLsjatl.g:646:1: ( ( rule__GridSize__Group_2__0 ) )
            {
            // InternalLsjatl.g:646:1: ( ( rule__GridSize__Group_2__0 ) )
            // InternalLsjatl.g:647:2: ( rule__GridSize__Group_2__0 )
            {
             before(grammarAccess.getGridSizeAccess().getGroup_2()); 
            // InternalLsjatl.g:648:2: ( rule__GridSize__Group_2__0 )
            // InternalLsjatl.g:648:3: rule__GridSize__Group_2__0
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
    // InternalLsjatl.g:657:1: rule__GridSize__Group_2__0 : rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1 ;
    public final void rule__GridSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:661:1: ( rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1 )
            // InternalLsjatl.g:662:2: rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLsjatl.g:669:1: rule__GridSize__Group_2__0__Impl : ( 'height:' ) ;
    public final void rule__GridSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:673:1: ( ( 'height:' ) )
            // InternalLsjatl.g:674:1: ( 'height:' )
            {
            // InternalLsjatl.g:674:1: ( 'height:' )
            // InternalLsjatl.g:675:2: 'height:'
            {
             before(grammarAccess.getGridSizeAccess().getHeightKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalLsjatl.g:684:1: rule__GridSize__Group_2__1 : rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2 ;
    public final void rule__GridSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:688:1: ( rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2 )
            // InternalLsjatl.g:689:2: rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalLsjatl.g:696:1: rule__GridSize__Group_2__1__Impl : ( ( rule__GridSize__HeightAssignment_2_1 ) ) ;
    public final void rule__GridSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:700:1: ( ( ( rule__GridSize__HeightAssignment_2_1 ) ) )
            // InternalLsjatl.g:701:1: ( ( rule__GridSize__HeightAssignment_2_1 ) )
            {
            // InternalLsjatl.g:701:1: ( ( rule__GridSize__HeightAssignment_2_1 ) )
            // InternalLsjatl.g:702:2: ( rule__GridSize__HeightAssignment_2_1 )
            {
             before(grammarAccess.getGridSizeAccess().getHeightAssignment_2_1()); 
            // InternalLsjatl.g:703:2: ( rule__GridSize__HeightAssignment_2_1 )
            // InternalLsjatl.g:703:3: rule__GridSize__HeightAssignment_2_1
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
    // InternalLsjatl.g:711:1: rule__GridSize__Group_2__2 : rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3 ;
    public final void rule__GridSize__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:715:1: ( rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3 )
            // InternalLsjatl.g:716:2: rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalLsjatl.g:723:1: rule__GridSize__Group_2__2__Impl : ( 'width:' ) ;
    public final void rule__GridSize__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:727:1: ( ( 'width:' ) )
            // InternalLsjatl.g:728:1: ( 'width:' )
            {
            // InternalLsjatl.g:728:1: ( 'width:' )
            // InternalLsjatl.g:729:2: 'width:'
            {
             before(grammarAccess.getGridSizeAccess().getWidthKeyword_2_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLsjatl.g:738:1: rule__GridSize__Group_2__3 : rule__GridSize__Group_2__3__Impl ;
    public final void rule__GridSize__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:742:1: ( rule__GridSize__Group_2__3__Impl )
            // InternalLsjatl.g:743:2: rule__GridSize__Group_2__3__Impl
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
    // InternalLsjatl.g:749:1: rule__GridSize__Group_2__3__Impl : ( ( rule__GridSize__WidthAssignment_2_3 ) ) ;
    public final void rule__GridSize__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:753:1: ( ( ( rule__GridSize__WidthAssignment_2_3 ) ) )
            // InternalLsjatl.g:754:1: ( ( rule__GridSize__WidthAssignment_2_3 ) )
            {
            // InternalLsjatl.g:754:1: ( ( rule__GridSize__WidthAssignment_2_3 ) )
            // InternalLsjatl.g:755:2: ( rule__GridSize__WidthAssignment_2_3 )
            {
             before(grammarAccess.getGridSizeAccess().getWidthAssignment_2_3()); 
            // InternalLsjatl.g:756:2: ( rule__GridSize__WidthAssignment_2_3 )
            // InternalLsjatl.g:756:3: rule__GridSize__WidthAssignment_2_3
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
    // InternalLsjatl.g:765:1: rule__PopulatedCell__Group__0 : rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 ;
    public final void rule__PopulatedCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:769:1: ( rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 )
            // InternalLsjatl.g:770:2: rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalLsjatl.g:777:1: rule__PopulatedCell__Group__0__Impl : ( 'Point' ) ;
    public final void rule__PopulatedCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:781:1: ( ( 'Point' ) )
            // InternalLsjatl.g:782:1: ( 'Point' )
            {
            // InternalLsjatl.g:782:1: ( 'Point' )
            // InternalLsjatl.g:783:2: 'Point'
            {
             before(grammarAccess.getPopulatedCellAccess().getPointKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPopulatedCellAccess().getPointKeyword_0()); 

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
    // InternalLsjatl.g:792:1: rule__PopulatedCell__Group__1 : rule__PopulatedCell__Group__1__Impl ;
    public final void rule__PopulatedCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:796:1: ( rule__PopulatedCell__Group__1__Impl )
            // InternalLsjatl.g:797:2: rule__PopulatedCell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__Group__1__Impl();

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
    // InternalLsjatl.g:803:1: rule__PopulatedCell__Group__1__Impl : ( ( rule__PopulatedCell__PoiAssignment_1 ) ) ;
    public final void rule__PopulatedCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:807:1: ( ( ( rule__PopulatedCell__PoiAssignment_1 ) ) )
            // InternalLsjatl.g:808:1: ( ( rule__PopulatedCell__PoiAssignment_1 ) )
            {
            // InternalLsjatl.g:808:1: ( ( rule__PopulatedCell__PoiAssignment_1 ) )
            // InternalLsjatl.g:809:2: ( rule__PopulatedCell__PoiAssignment_1 )
            {
             before(grammarAccess.getPopulatedCellAccess().getPoiAssignment_1()); 
            // InternalLsjatl.g:810:2: ( rule__PopulatedCell__PoiAssignment_1 )
            // InternalLsjatl.g:810:3: rule__PopulatedCell__PoiAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PopulatedCell__PoiAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPopulatedCellAccess().getPoiAssignment_1()); 

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


    // $ANTLR start "rule__Point__Group__0"
    // InternalLsjatl.g:819:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:823:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalLsjatl.g:824:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

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
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalLsjatl.g:831:1: rule__Point__Group__0__Impl : ( '(' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:835:1: ( ( '(' ) )
            // InternalLsjatl.g:836:1: ( '(' )
            {
            // InternalLsjatl.g:836:1: ( '(' )
            // InternalLsjatl.g:837:2: '('
            {
             before(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalLsjatl.g:846:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:850:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalLsjatl.g:851:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__2();

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
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalLsjatl.g:858:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:862:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalLsjatl.g:863:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalLsjatl.g:863:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalLsjatl.g:864:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalLsjatl.g:865:2: ( rule__Point__XAssignment_1 )
            // InternalLsjatl.g:865:3: rule__Point__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // InternalLsjatl.g:873:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:877:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalLsjatl.g:878:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__3();

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
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // InternalLsjatl.g:885:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:889:1: ( ( ',' ) )
            // InternalLsjatl.g:890:1: ( ',' )
            {
            // InternalLsjatl.g:890:1: ( ',' )
            // InternalLsjatl.g:891:2: ','
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // InternalLsjatl.g:900:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:904:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalLsjatl.g:905:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__4();

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
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // InternalLsjatl.g:912:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:916:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalLsjatl.g:917:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalLsjatl.g:917:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalLsjatl.g:918:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalLsjatl.g:919:2: ( rule__Point__YAssignment_3 )
            // InternalLsjatl.g:919:3: rule__Point__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Point__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_3()); 

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
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // InternalLsjatl.g:927:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:931:1: ( rule__Point__Group__4__Impl )
            // InternalLsjatl.g:932:2: rule__Point__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__4__Impl();

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
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // InternalLsjatl.g:938:1: rule__Point__Group__4__Impl : ( ')' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:942:1: ( ( ')' ) )
            // InternalLsjatl.g:943:1: ( ')' )
            {
            // InternalLsjatl.g:943:1: ( ')' )
            // InternalLsjatl.g:944:2: ')'
            {
             before(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // InternalLsjatl.g:954:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:958:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalLsjatl.g:959:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
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
    // InternalLsjatl.g:966:1: rule__Rules__Group__0__Impl : ( () ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:970:1: ( ( () ) )
            // InternalLsjatl.g:971:1: ( () )
            {
            // InternalLsjatl.g:971:1: ( () )
            // InternalLsjatl.g:972:2: ()
            {
             before(grammarAccess.getRulesAccess().getRulesAction_0()); 
            // InternalLsjatl.g:973:2: ()
            // InternalLsjatl.g:973:3: 
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
    // InternalLsjatl.g:981:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:985:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalLsjatl.g:986:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
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
    // InternalLsjatl.g:993:1: rule__Rules__Group__1__Impl : ( 'Rules' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:997:1: ( ( 'Rules' ) )
            // InternalLsjatl.g:998:1: ( 'Rules' )
            {
            // InternalLsjatl.g:998:1: ( 'Rules' )
            // InternalLsjatl.g:999:2: 'Rules'
            {
             before(grammarAccess.getRulesAccess().getRulesKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLsjatl.g:1008:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1012:1: ( rule__Rules__Group__2__Impl )
            // InternalLsjatl.g:1013:2: rule__Rules__Group__2__Impl
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
    // InternalLsjatl.g:1019:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__RulesAssignment_2 )* ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1023:1: ( ( ( rule__Rules__RulesAssignment_2 )* ) )
            // InternalLsjatl.g:1024:1: ( ( rule__Rules__RulesAssignment_2 )* )
            {
            // InternalLsjatl.g:1024:1: ( ( rule__Rules__RulesAssignment_2 )* )
            // InternalLsjatl.g:1025:2: ( rule__Rules__RulesAssignment_2 )*
            {
             before(grammarAccess.getRulesAccess().getRulesAssignment_2()); 
            // InternalLsjatl.g:1026:2: ( rule__Rules__RulesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLsjatl.g:1026:3: rule__Rules__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Rules__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalLsjatl.g:1035:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1039:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalLsjatl.g:1040:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLsjatl.g:1047:1: rule__Condition__Group__0__Impl : ( ruleBoolOp ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1051:1: ( ( ruleBoolOp ) )
            // InternalLsjatl.g:1052:1: ( ruleBoolOp )
            {
            // InternalLsjatl.g:1052:1: ( ruleBoolOp )
            // InternalLsjatl.g:1053:2: ruleBoolOp
            {
             before(grammarAccess.getConditionAccess().getBoolOpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getBoolOpParserRuleCall_0()); 

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
    // InternalLsjatl.g:1062:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1066:1: ( rule__Condition__Group__1__Impl )
            // InternalLsjatl.g:1067:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // InternalLsjatl.g:1073:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NCountAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1077:1: ( ( ( rule__Condition__NCountAssignment_1 ) ) )
            // InternalLsjatl.g:1078:1: ( ( rule__Condition__NCountAssignment_1 ) )
            {
            // InternalLsjatl.g:1078:1: ( ( rule__Condition__NCountAssignment_1 ) )
            // InternalLsjatl.g:1079:2: ( rule__Condition__NCountAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNCountAssignment_1()); 
            // InternalLsjatl.g:1080:2: ( rule__Condition__NCountAssignment_1 )
            // InternalLsjatl.g:1080:3: rule__Condition__NCountAssignment_1
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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalLsjatl.g:1089:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1093:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalLsjatl.g:1094:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLsjatl.g:1101:1: rule__Rule__Group__0__Impl : ( 'Each' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1105:1: ( ( 'Each' ) )
            // InternalLsjatl.g:1106:1: ( 'Each' )
            {
            // InternalLsjatl.g:1106:1: ( 'Each' )
            // InternalLsjatl.g:1107:2: 'Each'
            {
             before(grammarAccess.getRuleAccess().getEachKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalLsjatl.g:1116:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1120:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalLsjatl.g:1121:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalLsjatl.g:1128:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__StateAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1132:1: ( ( ( rule__Rule__StateAssignment_1 ) ) )
            // InternalLsjatl.g:1133:1: ( ( rule__Rule__StateAssignment_1 ) )
            {
            // InternalLsjatl.g:1133:1: ( ( rule__Rule__StateAssignment_1 ) )
            // InternalLsjatl.g:1134:2: ( rule__Rule__StateAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getStateAssignment_1()); 
            // InternalLsjatl.g:1135:2: ( rule__Rule__StateAssignment_1 )
            // InternalLsjatl.g:1135:3: rule__Rule__StateAssignment_1
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
    // InternalLsjatl.g:1143:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1147:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalLsjatl.g:1148:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalLsjatl.g:1155:1: rule__Rule__Group__2__Impl : ( 'cell' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1159:1: ( ( 'cell' ) )
            // InternalLsjatl.g:1160:1: ( 'cell' )
            {
            // InternalLsjatl.g:1160:1: ( 'cell' )
            // InternalLsjatl.g:1161:2: 'cell'
            {
             before(grammarAccess.getRuleAccess().getCellKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLsjatl.g:1170:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1174:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalLsjatl.g:1175:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalLsjatl.g:1182:1: rule__Rule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1186:1: ( ( 'with' ) )
            // InternalLsjatl.g:1187:1: ( 'with' )
            {
            // InternalLsjatl.g:1187:1: ( 'with' )
            // InternalLsjatl.g:1188:2: 'with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLsjatl.g:1197:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1201:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalLsjatl.g:1202:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalLsjatl.g:1209:1: rule__Rule__Group__4__Impl : ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1213:1: ( ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) ) )
            // InternalLsjatl.g:1214:1: ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) )
            {
            // InternalLsjatl.g:1214:1: ( ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* ) )
            // InternalLsjatl.g:1215:2: ( ( rule__Rule__ConditionsAssignment_4 ) ) ( ( rule__Rule__ConditionsAssignment_4 )* )
            {
            // InternalLsjatl.g:1215:2: ( ( rule__Rule__ConditionsAssignment_4 ) )
            // InternalLsjatl.g:1216:3: ( rule__Rule__ConditionsAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 
            // InternalLsjatl.g:1217:3: ( rule__Rule__ConditionsAssignment_4 )
            // InternalLsjatl.g:1217:4: rule__Rule__ConditionsAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__Rule__ConditionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 

            }

            // InternalLsjatl.g:1220:2: ( ( rule__Rule__ConditionsAssignment_4 )* )
            // InternalLsjatl.g:1221:3: ( rule__Rule__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getConditionsAssignment_4()); 
            // InternalLsjatl.g:1222:3: ( rule__Rule__ConditionsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLsjatl.g:1222:4: rule__Rule__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Rule__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalLsjatl.g:1231:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1235:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalLsjatl.g:1236:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalLsjatl.g:1243:1: rule__Rule__Group__5__Impl : ( 'neighbors' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1247:1: ( ( 'neighbors' ) )
            // InternalLsjatl.g:1248:1: ( 'neighbors' )
            {
            // InternalLsjatl.g:1248:1: ( 'neighbors' )
            // InternalLsjatl.g:1249:2: 'neighbors'
            {
             before(grammarAccess.getRuleAccess().getNeighborsKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalLsjatl.g:1258:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1262:1: ( rule__Rule__Group__6__Impl )
            // InternalLsjatl.g:1263:2: rule__Rule__Group__6__Impl
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
    // InternalLsjatl.g:1269:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ResultAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1273:1: ( ( ( rule__Rule__ResultAssignment_6 ) ) )
            // InternalLsjatl.g:1274:1: ( ( rule__Rule__ResultAssignment_6 ) )
            {
            // InternalLsjatl.g:1274:1: ( ( rule__Rule__ResultAssignment_6 ) )
            // InternalLsjatl.g:1275:2: ( rule__Rule__ResultAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getResultAssignment_6()); 
            // InternalLsjatl.g:1276:2: ( rule__Rule__ResultAssignment_6 )
            // InternalLsjatl.g:1276:3: rule__Rule__ResultAssignment_6
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
    // InternalLsjatl.g:1285:1: rule__Game__GridAssignment_0 : ( ruleGrid ) ;
    public final void rule__Game__GridAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1289:1: ( ( ruleGrid ) )
            // InternalLsjatl.g:1290:2: ( ruleGrid )
            {
            // InternalLsjatl.g:1290:2: ( ruleGrid )
            // InternalLsjatl.g:1291:3: ruleGrid
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
    // InternalLsjatl.g:1300:1: rule__Game__RulesAssignment_1 : ( ruleRules ) ;
    public final void rule__Game__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1304:1: ( ( ruleRules ) )
            // InternalLsjatl.g:1305:2: ( ruleRules )
            {
            // InternalLsjatl.g:1305:2: ( ruleRules )
            // InternalLsjatl.g:1306:3: ruleRules
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
    // InternalLsjatl.g:1315:1: rule__Grid__SizeAssignment_2 : ( ruleGridSize ) ;
    public final void rule__Grid__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1319:1: ( ( ruleGridSize ) )
            // InternalLsjatl.g:1320:2: ( ruleGridSize )
            {
            // InternalLsjatl.g:1320:2: ( ruleGridSize )
            // InternalLsjatl.g:1321:3: ruleGridSize
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


    // $ANTLR start "rule__Grid__PopulatedCellsAssignment_3"
    // InternalLsjatl.g:1330:1: rule__Grid__PopulatedCellsAssignment_3 : ( rulePopulatedCell ) ;
    public final void rule__Grid__PopulatedCellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1334:1: ( ( rulePopulatedCell ) )
            // InternalLsjatl.g:1335:2: ( rulePopulatedCell )
            {
            // InternalLsjatl.g:1335:2: ( rulePopulatedCell )
            // InternalLsjatl.g:1336:3: rulePopulatedCell
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePopulatedCell();

            state._fsp--;

             after(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Grid__PopulatedCellsAssignment_3"


    // $ANTLR start "rule__GridSize__HeightAssignment_2_1"
    // InternalLsjatl.g:1345:1: rule__GridSize__HeightAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GridSize__HeightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1349:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1350:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1350:2: ( RULE_INT )
            // InternalLsjatl.g:1351:3: RULE_INT
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
    // InternalLsjatl.g:1360:1: rule__GridSize__WidthAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__GridSize__WidthAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1364:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1365:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1365:2: ( RULE_INT )
            // InternalLsjatl.g:1366:3: RULE_INT
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


    // $ANTLR start "rule__PopulatedCell__PoiAssignment_1"
    // InternalLsjatl.g:1375:1: rule__PopulatedCell__PoiAssignment_1 : ( rulePoint ) ;
    public final void rule__PopulatedCell__PoiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1379:1: ( ( rulePoint ) )
            // InternalLsjatl.g:1380:2: ( rulePoint )
            {
            // InternalLsjatl.g:1380:2: ( rulePoint )
            // InternalLsjatl.g:1381:3: rulePoint
            {
             before(grammarAccess.getPopulatedCellAccess().getPoiPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPopulatedCellAccess().getPoiPointParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PopulatedCell__PoiAssignment_1"


    // $ANTLR start "rule__Point__XAssignment_1"
    // InternalLsjatl.g:1390:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1394:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1395:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1395:2: ( RULE_INT )
            // InternalLsjatl.g:1396:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Point__XAssignment_1"


    // $ANTLR start "rule__Point__YAssignment_3"
    // InternalLsjatl.g:1405:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1409:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1410:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1410:2: ( RULE_INT )
            // InternalLsjatl.g:1411:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Point__YAssignment_3"


    // $ANTLR start "rule__Rules__RulesAssignment_2"
    // InternalLsjatl.g:1420:1: rule__Rules__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__Rules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1424:1: ( ( ruleRule ) )
            // InternalLsjatl.g:1425:2: ( ruleRule )
            {
            // InternalLsjatl.g:1425:2: ( ruleRule )
            // InternalLsjatl.g:1426:3: ruleRule
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


    // $ANTLR start "rule__Condition__NCountAssignment_1"
    // InternalLsjatl.g:1435:1: rule__Condition__NCountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__NCountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1439:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1440:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1440:2: ( RULE_INT )
            // InternalLsjatl.g:1441:3: RULE_INT
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


    // $ANTLR start "rule__Rule__StateAssignment_1"
    // InternalLsjatl.g:1450:1: rule__Rule__StateAssignment_1 : ( ruleState ) ;
    public final void rule__Rule__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1454:1: ( ( ruleState ) )
            // InternalLsjatl.g:1455:2: ( ruleState )
            {
            // InternalLsjatl.g:1455:2: ( ruleState )
            // InternalLsjatl.g:1456:3: ruleState
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
    // InternalLsjatl.g:1465:1: rule__Rule__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1469:1: ( ( ruleCondition ) )
            // InternalLsjatl.g:1470:2: ( ruleCondition )
            {
            // InternalLsjatl.g:1470:2: ( ruleCondition )
            // InternalLsjatl.g:1471:3: ruleCondition
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
    // InternalLsjatl.g:1480:1: rule__Rule__ResultAssignment_6 : ( ruleOutcome ) ;
    public final void rule__Rule__ResultAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1484:1: ( ( ruleOutcome ) )
            // InternalLsjatl.g:1485:2: ( ruleOutcome )
            {
            // InternalLsjatl.g:1485:2: ( ruleOutcome )
            // InternalLsjatl.g:1486:3: ruleOutcome
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000003E002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001C0000L});

}