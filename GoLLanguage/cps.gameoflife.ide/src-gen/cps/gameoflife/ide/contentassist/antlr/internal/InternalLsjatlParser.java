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


    // $ANTLR start "entryRuleState"
    // InternalLsjatl.g:228:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalLsjatl.g:229:1: ( ruleState EOF )
            // InternalLsjatl.g:230:1: ruleState EOF
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
    // InternalLsjatl.g:237:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:241:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalLsjatl.g:242:2: ( ( rule__State__Alternatives ) )
            {
            // InternalLsjatl.g:242:2: ( ( rule__State__Alternatives ) )
            // InternalLsjatl.g:243:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalLsjatl.g:244:3: ( rule__State__Alternatives )
            // InternalLsjatl.g:244:4: rule__State__Alternatives
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
    // InternalLsjatl.g:253:1: entryRuleBoolOp : ruleBoolOp EOF ;
    public final void entryRuleBoolOp() throws RecognitionException {
        try {
            // InternalLsjatl.g:254:1: ( ruleBoolOp EOF )
            // InternalLsjatl.g:255:1: ruleBoolOp EOF
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
    // InternalLsjatl.g:262:1: ruleBoolOp : ( ( rule__BoolOp__Alternatives ) ) ;
    public final void ruleBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:266:2: ( ( ( rule__BoolOp__Alternatives ) ) )
            // InternalLsjatl.g:267:2: ( ( rule__BoolOp__Alternatives ) )
            {
            // InternalLsjatl.g:267:2: ( ( rule__BoolOp__Alternatives ) )
            // InternalLsjatl.g:268:3: ( rule__BoolOp__Alternatives )
            {
             before(grammarAccess.getBoolOpAccess().getAlternatives()); 
            // InternalLsjatl.g:269:3: ( rule__BoolOp__Alternatives )
            // InternalLsjatl.g:269:4: rule__BoolOp__Alternatives
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
    // InternalLsjatl.g:278:1: entryRuleOutcome : ruleOutcome EOF ;
    public final void entryRuleOutcome() throws RecognitionException {
        try {
            // InternalLsjatl.g:279:1: ( ruleOutcome EOF )
            // InternalLsjatl.g:280:1: ruleOutcome EOF
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
    // InternalLsjatl.g:287:1: ruleOutcome : ( ( rule__Outcome__Alternatives ) ) ;
    public final void ruleOutcome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:291:2: ( ( ( rule__Outcome__Alternatives ) ) )
            // InternalLsjatl.g:292:2: ( ( rule__Outcome__Alternatives ) )
            {
            // InternalLsjatl.g:292:2: ( ( rule__Outcome__Alternatives ) )
            // InternalLsjatl.g:293:3: ( rule__Outcome__Alternatives )
            {
             before(grammarAccess.getOutcomeAccess().getAlternatives()); 
            // InternalLsjatl.g:294:3: ( rule__Outcome__Alternatives )
            // InternalLsjatl.g:294:4: rule__Outcome__Alternatives
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
    // InternalLsjatl.g:302:1: rule__State__Alternatives : ( ( 'living' ) | ( 'dead' ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:306:1: ( ( 'living' ) | ( 'dead' ) )
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
                    // InternalLsjatl.g:307:2: ( 'living' )
                    {
                    // InternalLsjatl.g:307:2: ( 'living' )
                    // InternalLsjatl.g:308:3: 'living'
                    {
                     before(grammarAccess.getStateAccess().getLivingKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getLivingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:313:2: ( 'dead' )
                    {
                    // InternalLsjatl.g:313:2: ( 'dead' )
                    // InternalLsjatl.g:314:3: 'dead'
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
    // InternalLsjatl.g:323:1: rule__BoolOp__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) );
    public final void rule__BoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:327:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) )
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
                    // InternalLsjatl.g:328:2: ( '>' )
                    {
                    // InternalLsjatl.g:328:2: ( '>' )
                    // InternalLsjatl.g:329:3: '>'
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:334:2: ( '<' )
                    {
                    // InternalLsjatl.g:334:2: ( '<' )
                    // InternalLsjatl.g:335:3: '<'
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:340:2: ( '>=' )
                    {
                    // InternalLsjatl.g:340:2: ( '>=' )
                    // InternalLsjatl.g:341:3: '>='
                    {
                     before(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:346:2: ( '<=' )
                    {
                    // InternalLsjatl.g:346:2: ( '<=' )
                    // InternalLsjatl.g:347:3: '<='
                    {
                     before(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:352:2: ( '==' )
                    {
                    // InternalLsjatl.g:352:2: ( '==' )
                    // InternalLsjatl.g:353:3: '=='
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
    // InternalLsjatl.g:362:1: rule__Outcome__Alternatives : ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) );
    public final void rule__Outcome__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:366:1: ( ( 'survives' ) | ( 'dies' ) | ( 'populates' ) )
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
                    // InternalLsjatl.g:367:2: ( 'survives' )
                    {
                    // InternalLsjatl.g:367:2: ( 'survives' )
                    // InternalLsjatl.g:368:3: 'survives'
                    {
                     before(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getSurvivesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:373:2: ( 'dies' )
                    {
                    // InternalLsjatl.g:373:2: ( 'dies' )
                    // InternalLsjatl.g:374:3: 'dies'
                    {
                     before(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOutcomeAccess().getDiesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:379:2: ( 'populates' )
                    {
                    // InternalLsjatl.g:379:2: ( 'populates' )
                    // InternalLsjatl.g:380:3: 'populates'
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
    // InternalLsjatl.g:389:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:393:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalLsjatl.g:394:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalLsjatl.g:401:1: rule__Game__Group__0__Impl : ( ( rule__Game__GridAssignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:405:1: ( ( ( rule__Game__GridAssignment_0 ) ) )
            // InternalLsjatl.g:406:1: ( ( rule__Game__GridAssignment_0 ) )
            {
            // InternalLsjatl.g:406:1: ( ( rule__Game__GridAssignment_0 ) )
            // InternalLsjatl.g:407:2: ( rule__Game__GridAssignment_0 )
            {
             before(grammarAccess.getGameAccess().getGridAssignment_0()); 
            // InternalLsjatl.g:408:2: ( rule__Game__GridAssignment_0 )
            // InternalLsjatl.g:408:3: rule__Game__GridAssignment_0
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
    // InternalLsjatl.g:416:1: rule__Game__Group__1 : rule__Game__Group__1__Impl ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:420:1: ( rule__Game__Group__1__Impl )
            // InternalLsjatl.g:421:2: rule__Game__Group__1__Impl
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
    // InternalLsjatl.g:427:1: rule__Game__Group__1__Impl : ( ( rule__Game__RulesAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:431:1: ( ( ( rule__Game__RulesAssignment_1 ) ) )
            // InternalLsjatl.g:432:1: ( ( rule__Game__RulesAssignment_1 ) )
            {
            // InternalLsjatl.g:432:1: ( ( rule__Game__RulesAssignment_1 ) )
            // InternalLsjatl.g:433:2: ( rule__Game__RulesAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getRulesAssignment_1()); 
            // InternalLsjatl.g:434:2: ( rule__Game__RulesAssignment_1 )
            // InternalLsjatl.g:434:3: rule__Game__RulesAssignment_1
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
    // InternalLsjatl.g:443:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:447:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalLsjatl.g:448:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
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
    // InternalLsjatl.g:455:1: rule__Grid__Group__0__Impl : ( () ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:459:1: ( ( () ) )
            // InternalLsjatl.g:460:1: ( () )
            {
            // InternalLsjatl.g:460:1: ( () )
            // InternalLsjatl.g:461:2: ()
            {
             before(grammarAccess.getGridAccess().getGridAction_0()); 
            // InternalLsjatl.g:462:2: ()
            // InternalLsjatl.g:462:3: 
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
    // InternalLsjatl.g:470:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:474:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalLsjatl.g:475:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
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
    // InternalLsjatl.g:482:1: rule__Grid__Group__1__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:486:1: ( ( 'Grid' ) )
            // InternalLsjatl.g:487:1: ( 'Grid' )
            {
            // InternalLsjatl.g:487:1: ( 'Grid' )
            // InternalLsjatl.g:488:2: 'Grid'
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
    // InternalLsjatl.g:497:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:501:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalLsjatl.g:502:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
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
    // InternalLsjatl.g:509:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__SizeAssignment_2 ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:513:1: ( ( ( rule__Grid__SizeAssignment_2 ) ) )
            // InternalLsjatl.g:514:1: ( ( rule__Grid__SizeAssignment_2 ) )
            {
            // InternalLsjatl.g:514:1: ( ( rule__Grid__SizeAssignment_2 ) )
            // InternalLsjatl.g:515:2: ( rule__Grid__SizeAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_2()); 
            // InternalLsjatl.g:516:2: ( rule__Grid__SizeAssignment_2 )
            // InternalLsjatl.g:516:3: rule__Grid__SizeAssignment_2
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
    // InternalLsjatl.g:524:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:528:1: ( rule__Grid__Group__3__Impl )
            // InternalLsjatl.g:529:2: rule__Grid__Group__3__Impl
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
    // InternalLsjatl.g:535:1: rule__Grid__Group__3__Impl : ( ( rule__Grid__PopulatedCellsAssignment_3 )* ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:539:1: ( ( ( rule__Grid__PopulatedCellsAssignment_3 )* ) )
            // InternalLsjatl.g:540:1: ( ( rule__Grid__PopulatedCellsAssignment_3 )* )
            {
            // InternalLsjatl.g:540:1: ( ( rule__Grid__PopulatedCellsAssignment_3 )* )
            // InternalLsjatl.g:541:2: ( rule__Grid__PopulatedCellsAssignment_3 )*
            {
             before(grammarAccess.getGridAccess().getPopulatedCellsAssignment_3()); 
            // InternalLsjatl.g:542:2: ( rule__Grid__PopulatedCellsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLsjatl.g:542:3: rule__Grid__PopulatedCellsAssignment_3
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
    // InternalLsjatl.g:551:1: rule__GridSize__Group__0 : rule__GridSize__Group__0__Impl rule__GridSize__Group__1 ;
    public final void rule__GridSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:555:1: ( rule__GridSize__Group__0__Impl rule__GridSize__Group__1 )
            // InternalLsjatl.g:556:2: rule__GridSize__Group__0__Impl rule__GridSize__Group__1
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
    // InternalLsjatl.g:563:1: rule__GridSize__Group__0__Impl : ( () ) ;
    public final void rule__GridSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:567:1: ( ( () ) )
            // InternalLsjatl.g:568:1: ( () )
            {
            // InternalLsjatl.g:568:1: ( () )
            // InternalLsjatl.g:569:2: ()
            {
             before(grammarAccess.getGridSizeAccess().getGridSizeAction_0()); 
            // InternalLsjatl.g:570:2: ()
            // InternalLsjatl.g:570:3: 
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
    // InternalLsjatl.g:578:1: rule__GridSize__Group__1 : rule__GridSize__Group__1__Impl rule__GridSize__Group__2 ;
    public final void rule__GridSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:582:1: ( rule__GridSize__Group__1__Impl rule__GridSize__Group__2 )
            // InternalLsjatl.g:583:2: rule__GridSize__Group__1__Impl rule__GridSize__Group__2
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
    // InternalLsjatl.g:590:1: rule__GridSize__Group__1__Impl : ( 'GridSize' ) ;
    public final void rule__GridSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:594:1: ( ( 'GridSize' ) )
            // InternalLsjatl.g:595:1: ( 'GridSize' )
            {
            // InternalLsjatl.g:595:1: ( 'GridSize' )
            // InternalLsjatl.g:596:2: 'GridSize'
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
    // InternalLsjatl.g:605:1: rule__GridSize__Group__2 : rule__GridSize__Group__2__Impl ;
    public final void rule__GridSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:609:1: ( rule__GridSize__Group__2__Impl )
            // InternalLsjatl.g:610:2: rule__GridSize__Group__2__Impl
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
    // InternalLsjatl.g:616:1: rule__GridSize__Group__2__Impl : ( ( rule__GridSize__Group_2__0 ) ) ;
    public final void rule__GridSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:620:1: ( ( ( rule__GridSize__Group_2__0 ) ) )
            // InternalLsjatl.g:621:1: ( ( rule__GridSize__Group_2__0 ) )
            {
            // InternalLsjatl.g:621:1: ( ( rule__GridSize__Group_2__0 ) )
            // InternalLsjatl.g:622:2: ( rule__GridSize__Group_2__0 )
            {
             before(grammarAccess.getGridSizeAccess().getGroup_2()); 
            // InternalLsjatl.g:623:2: ( rule__GridSize__Group_2__0 )
            // InternalLsjatl.g:623:3: rule__GridSize__Group_2__0
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
    // InternalLsjatl.g:632:1: rule__GridSize__Group_2__0 : rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1 ;
    public final void rule__GridSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:636:1: ( rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1 )
            // InternalLsjatl.g:637:2: rule__GridSize__Group_2__0__Impl rule__GridSize__Group_2__1
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
    // InternalLsjatl.g:644:1: rule__GridSize__Group_2__0__Impl : ( 'height:' ) ;
    public final void rule__GridSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:648:1: ( ( 'height:' ) )
            // InternalLsjatl.g:649:1: ( 'height:' )
            {
            // InternalLsjatl.g:649:1: ( 'height:' )
            // InternalLsjatl.g:650:2: 'height:'
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
    // InternalLsjatl.g:659:1: rule__GridSize__Group_2__1 : rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2 ;
    public final void rule__GridSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:663:1: ( rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2 )
            // InternalLsjatl.g:664:2: rule__GridSize__Group_2__1__Impl rule__GridSize__Group_2__2
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
    // InternalLsjatl.g:671:1: rule__GridSize__Group_2__1__Impl : ( ( rule__GridSize__HeightAssignment_2_1 ) ) ;
    public final void rule__GridSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:675:1: ( ( ( rule__GridSize__HeightAssignment_2_1 ) ) )
            // InternalLsjatl.g:676:1: ( ( rule__GridSize__HeightAssignment_2_1 ) )
            {
            // InternalLsjatl.g:676:1: ( ( rule__GridSize__HeightAssignment_2_1 ) )
            // InternalLsjatl.g:677:2: ( rule__GridSize__HeightAssignment_2_1 )
            {
             before(grammarAccess.getGridSizeAccess().getHeightAssignment_2_1()); 
            // InternalLsjatl.g:678:2: ( rule__GridSize__HeightAssignment_2_1 )
            // InternalLsjatl.g:678:3: rule__GridSize__HeightAssignment_2_1
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
    // InternalLsjatl.g:686:1: rule__GridSize__Group_2__2 : rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3 ;
    public final void rule__GridSize__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:690:1: ( rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3 )
            // InternalLsjatl.g:691:2: rule__GridSize__Group_2__2__Impl rule__GridSize__Group_2__3
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
    // InternalLsjatl.g:698:1: rule__GridSize__Group_2__2__Impl : ( 'width:' ) ;
    public final void rule__GridSize__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:702:1: ( ( 'width:' ) )
            // InternalLsjatl.g:703:1: ( 'width:' )
            {
            // InternalLsjatl.g:703:1: ( 'width:' )
            // InternalLsjatl.g:704:2: 'width:'
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
    // InternalLsjatl.g:713:1: rule__GridSize__Group_2__3 : rule__GridSize__Group_2__3__Impl ;
    public final void rule__GridSize__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:717:1: ( rule__GridSize__Group_2__3__Impl )
            // InternalLsjatl.g:718:2: rule__GridSize__Group_2__3__Impl
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
    // InternalLsjatl.g:724:1: rule__GridSize__Group_2__3__Impl : ( ( rule__GridSize__WidthAssignment_2_3 ) ) ;
    public final void rule__GridSize__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:728:1: ( ( ( rule__GridSize__WidthAssignment_2_3 ) ) )
            // InternalLsjatl.g:729:1: ( ( rule__GridSize__WidthAssignment_2_3 ) )
            {
            // InternalLsjatl.g:729:1: ( ( rule__GridSize__WidthAssignment_2_3 ) )
            // InternalLsjatl.g:730:2: ( rule__GridSize__WidthAssignment_2_3 )
            {
             before(grammarAccess.getGridSizeAccess().getWidthAssignment_2_3()); 
            // InternalLsjatl.g:731:2: ( rule__GridSize__WidthAssignment_2_3 )
            // InternalLsjatl.g:731:3: rule__GridSize__WidthAssignment_2_3
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
    // InternalLsjatl.g:740:1: rule__PopulatedCell__Group__0 : rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 ;
    public final void rule__PopulatedCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:744:1: ( rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1 )
            // InternalLsjatl.g:745:2: rule__PopulatedCell__Group__0__Impl rule__PopulatedCell__Group__1
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
    // InternalLsjatl.g:752:1: rule__PopulatedCell__Group__0__Impl : ( 'Point' ) ;
    public final void rule__PopulatedCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:756:1: ( ( 'Point' ) )
            // InternalLsjatl.g:757:1: ( 'Point' )
            {
            // InternalLsjatl.g:757:1: ( 'Point' )
            // InternalLsjatl.g:758:2: 'Point'
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
    // InternalLsjatl.g:767:1: rule__PopulatedCell__Group__1 : rule__PopulatedCell__Group__1__Impl ;
    public final void rule__PopulatedCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:771:1: ( rule__PopulatedCell__Group__1__Impl )
            // InternalLsjatl.g:772:2: rule__PopulatedCell__Group__1__Impl
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
    // InternalLsjatl.g:778:1: rule__PopulatedCell__Group__1__Impl : ( ( rule__PopulatedCell__PoiAssignment_1 ) ) ;
    public final void rule__PopulatedCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:782:1: ( ( ( rule__PopulatedCell__PoiAssignment_1 ) ) )
            // InternalLsjatl.g:783:1: ( ( rule__PopulatedCell__PoiAssignment_1 ) )
            {
            // InternalLsjatl.g:783:1: ( ( rule__PopulatedCell__PoiAssignment_1 ) )
            // InternalLsjatl.g:784:2: ( rule__PopulatedCell__PoiAssignment_1 )
            {
             before(grammarAccess.getPopulatedCellAccess().getPoiAssignment_1()); 
            // InternalLsjatl.g:785:2: ( rule__PopulatedCell__PoiAssignment_1 )
            // InternalLsjatl.g:785:3: rule__PopulatedCell__PoiAssignment_1
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
    // InternalLsjatl.g:794:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:798:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalLsjatl.g:799:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalLsjatl.g:806:1: rule__Point__Group__0__Impl : ( '(' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:810:1: ( ( '(' ) )
            // InternalLsjatl.g:811:1: ( '(' )
            {
            // InternalLsjatl.g:811:1: ( '(' )
            // InternalLsjatl.g:812:2: '('
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
    // InternalLsjatl.g:821:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:825:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalLsjatl.g:826:2: rule__Point__Group__1__Impl rule__Point__Group__2
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
    // InternalLsjatl.g:833:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:837:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalLsjatl.g:838:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalLsjatl.g:838:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalLsjatl.g:839:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalLsjatl.g:840:2: ( rule__Point__XAssignment_1 )
            // InternalLsjatl.g:840:3: rule__Point__XAssignment_1
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
    // InternalLsjatl.g:848:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:852:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalLsjatl.g:853:2: rule__Point__Group__2__Impl rule__Point__Group__3
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
    // InternalLsjatl.g:860:1: rule__Point__Group__2__Impl : ( ',' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:864:1: ( ( ',' ) )
            // InternalLsjatl.g:865:1: ( ',' )
            {
            // InternalLsjatl.g:865:1: ( ',' )
            // InternalLsjatl.g:866:2: ','
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
    // InternalLsjatl.g:875:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:879:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalLsjatl.g:880:2: rule__Point__Group__3__Impl rule__Point__Group__4
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
    // InternalLsjatl.g:887:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:891:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalLsjatl.g:892:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalLsjatl.g:892:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalLsjatl.g:893:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalLsjatl.g:894:2: ( rule__Point__YAssignment_3 )
            // InternalLsjatl.g:894:3: rule__Point__YAssignment_3
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
    // InternalLsjatl.g:902:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:906:1: ( rule__Point__Group__4__Impl )
            // InternalLsjatl.g:907:2: rule__Point__Group__4__Impl
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
    // InternalLsjatl.g:913:1: rule__Point__Group__4__Impl : ( ')' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:917:1: ( ( ')' ) )
            // InternalLsjatl.g:918:1: ( ')' )
            {
            // InternalLsjatl.g:918:1: ( ')' )
            // InternalLsjatl.g:919:2: ')'
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
    // InternalLsjatl.g:929:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:933:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalLsjatl.g:934:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
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
    // InternalLsjatl.g:941:1: rule__Rules__Group__0__Impl : ( () ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:945:1: ( ( () ) )
            // InternalLsjatl.g:946:1: ( () )
            {
            // InternalLsjatl.g:946:1: ( () )
            // InternalLsjatl.g:947:2: ()
            {
             before(grammarAccess.getRulesAccess().getRulesAction_0()); 
            // InternalLsjatl.g:948:2: ()
            // InternalLsjatl.g:948:3: 
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
    // InternalLsjatl.g:956:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:960:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalLsjatl.g:961:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
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
    // InternalLsjatl.g:968:1: rule__Rules__Group__1__Impl : ( 'Rules' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:972:1: ( ( 'Rules' ) )
            // InternalLsjatl.g:973:1: ( 'Rules' )
            {
            // InternalLsjatl.g:973:1: ( 'Rules' )
            // InternalLsjatl.g:974:2: 'Rules'
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
    // InternalLsjatl.g:983:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:987:1: ( rule__Rules__Group__2__Impl )
            // InternalLsjatl.g:988:2: rule__Rules__Group__2__Impl
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
    // InternalLsjatl.g:994:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__RulesAssignment_2 )* ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:998:1: ( ( ( rule__Rules__RulesAssignment_2 )* ) )
            // InternalLsjatl.g:999:1: ( ( rule__Rules__RulesAssignment_2 )* )
            {
            // InternalLsjatl.g:999:1: ( ( rule__Rules__RulesAssignment_2 )* )
            // InternalLsjatl.g:1000:2: ( rule__Rules__RulesAssignment_2 )*
            {
             before(grammarAccess.getRulesAccess().getRulesAssignment_2()); 
            // InternalLsjatl.g:1001:2: ( rule__Rules__RulesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLsjatl.g:1001:3: rule__Rules__RulesAssignment_2
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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalLsjatl.g:1010:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1014:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalLsjatl.g:1015:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalLsjatl.g:1022:1: rule__Rule__Group__0__Impl : ( 'Each' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1026:1: ( ( 'Each' ) )
            // InternalLsjatl.g:1027:1: ( 'Each' )
            {
            // InternalLsjatl.g:1027:1: ( 'Each' )
            // InternalLsjatl.g:1028:2: 'Each'
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
    // InternalLsjatl.g:1037:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1041:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalLsjatl.g:1042:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalLsjatl.g:1049:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__StateAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1053:1: ( ( ( rule__Rule__StateAssignment_1 ) ) )
            // InternalLsjatl.g:1054:1: ( ( rule__Rule__StateAssignment_1 ) )
            {
            // InternalLsjatl.g:1054:1: ( ( rule__Rule__StateAssignment_1 ) )
            // InternalLsjatl.g:1055:2: ( rule__Rule__StateAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getStateAssignment_1()); 
            // InternalLsjatl.g:1056:2: ( rule__Rule__StateAssignment_1 )
            // InternalLsjatl.g:1056:3: rule__Rule__StateAssignment_1
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
    // InternalLsjatl.g:1064:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1068:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalLsjatl.g:1069:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalLsjatl.g:1076:1: rule__Rule__Group__2__Impl : ( 'cell' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1080:1: ( ( 'cell' ) )
            // InternalLsjatl.g:1081:1: ( 'cell' )
            {
            // InternalLsjatl.g:1081:1: ( 'cell' )
            // InternalLsjatl.g:1082:2: 'cell'
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
    // InternalLsjatl.g:1091:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1095:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalLsjatl.g:1096:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalLsjatl.g:1103:1: rule__Rule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1107:1: ( ( 'with' ) )
            // InternalLsjatl.g:1108:1: ( 'with' )
            {
            // InternalLsjatl.g:1108:1: ( 'with' )
            // InternalLsjatl.g:1109:2: 'with'
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
    // InternalLsjatl.g:1118:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1122:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalLsjatl.g:1123:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalLsjatl.g:1130:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__OpAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1134:1: ( ( ( rule__Rule__OpAssignment_4 ) ) )
            // InternalLsjatl.g:1135:1: ( ( rule__Rule__OpAssignment_4 ) )
            {
            // InternalLsjatl.g:1135:1: ( ( rule__Rule__OpAssignment_4 ) )
            // InternalLsjatl.g:1136:2: ( rule__Rule__OpAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getOpAssignment_4()); 
            // InternalLsjatl.g:1137:2: ( rule__Rule__OpAssignment_4 )
            // InternalLsjatl.g:1137:3: rule__Rule__OpAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOpAssignment_4()); 

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
    // InternalLsjatl.g:1145:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1149:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalLsjatl.g:1150:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalLsjatl.g:1157:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__NCountAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1161:1: ( ( ( rule__Rule__NCountAssignment_5 ) ) )
            // InternalLsjatl.g:1162:1: ( ( rule__Rule__NCountAssignment_5 ) )
            {
            // InternalLsjatl.g:1162:1: ( ( rule__Rule__NCountAssignment_5 ) )
            // InternalLsjatl.g:1163:2: ( rule__Rule__NCountAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getNCountAssignment_5()); 
            // InternalLsjatl.g:1164:2: ( rule__Rule__NCountAssignment_5 )
            // InternalLsjatl.g:1164:3: rule__Rule__NCountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NCountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNCountAssignment_5()); 

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
    // InternalLsjatl.g:1172:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1176:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalLsjatl.g:1177:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

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
    // InternalLsjatl.g:1184:1: rule__Rule__Group__6__Impl : ( 'neighbors' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1188:1: ( ( 'neighbors' ) )
            // InternalLsjatl.g:1189:1: ( 'neighbors' )
            {
            // InternalLsjatl.g:1189:1: ( 'neighbors' )
            // InternalLsjatl.g:1190:2: 'neighbors'
            {
             before(grammarAccess.getRuleAccess().getNeighborsKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNeighborsKeyword_6()); 

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


    // $ANTLR start "rule__Rule__Group__7"
    // InternalLsjatl.g:1199:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1203:1: ( rule__Rule__Group__7__Impl )
            // InternalLsjatl.g:1204:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalLsjatl.g:1210:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__ResultAssignment_7 ) ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1214:1: ( ( ( rule__Rule__ResultAssignment_7 ) ) )
            // InternalLsjatl.g:1215:1: ( ( rule__Rule__ResultAssignment_7 ) )
            {
            // InternalLsjatl.g:1215:1: ( ( rule__Rule__ResultAssignment_7 ) )
            // InternalLsjatl.g:1216:2: ( rule__Rule__ResultAssignment_7 )
            {
             before(grammarAccess.getRuleAccess().getResultAssignment_7()); 
            // InternalLsjatl.g:1217:2: ( rule__Rule__ResultAssignment_7 )
            // InternalLsjatl.g:1217:3: rule__Rule__ResultAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResultAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResultAssignment_7()); 

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
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Game__GridAssignment_0"
    // InternalLsjatl.g:1226:1: rule__Game__GridAssignment_0 : ( ruleGrid ) ;
    public final void rule__Game__GridAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1230:1: ( ( ruleGrid ) )
            // InternalLsjatl.g:1231:2: ( ruleGrid )
            {
            // InternalLsjatl.g:1231:2: ( ruleGrid )
            // InternalLsjatl.g:1232:3: ruleGrid
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
    // InternalLsjatl.g:1241:1: rule__Game__RulesAssignment_1 : ( ruleRules ) ;
    public final void rule__Game__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1245:1: ( ( ruleRules ) )
            // InternalLsjatl.g:1246:2: ( ruleRules )
            {
            // InternalLsjatl.g:1246:2: ( ruleRules )
            // InternalLsjatl.g:1247:3: ruleRules
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
    // InternalLsjatl.g:1256:1: rule__Grid__SizeAssignment_2 : ( ruleGridSize ) ;
    public final void rule__Grid__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1260:1: ( ( ruleGridSize ) )
            // InternalLsjatl.g:1261:2: ( ruleGridSize )
            {
            // InternalLsjatl.g:1261:2: ( ruleGridSize )
            // InternalLsjatl.g:1262:3: ruleGridSize
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
    // InternalLsjatl.g:1271:1: rule__Grid__PopulatedCellsAssignment_3 : ( rulePopulatedCell ) ;
    public final void rule__Grid__PopulatedCellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1275:1: ( ( rulePopulatedCell ) )
            // InternalLsjatl.g:1276:2: ( rulePopulatedCell )
            {
            // InternalLsjatl.g:1276:2: ( rulePopulatedCell )
            // InternalLsjatl.g:1277:3: rulePopulatedCell
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
    // InternalLsjatl.g:1286:1: rule__GridSize__HeightAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GridSize__HeightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1290:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1291:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1291:2: ( RULE_INT )
            // InternalLsjatl.g:1292:3: RULE_INT
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
    // InternalLsjatl.g:1301:1: rule__GridSize__WidthAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__GridSize__WidthAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1305:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1306:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1306:2: ( RULE_INT )
            // InternalLsjatl.g:1307:3: RULE_INT
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
    // InternalLsjatl.g:1316:1: rule__PopulatedCell__PoiAssignment_1 : ( rulePoint ) ;
    public final void rule__PopulatedCell__PoiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1320:1: ( ( rulePoint ) )
            // InternalLsjatl.g:1321:2: ( rulePoint )
            {
            // InternalLsjatl.g:1321:2: ( rulePoint )
            // InternalLsjatl.g:1322:3: rulePoint
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
    // InternalLsjatl.g:1331:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1335:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1336:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1336:2: ( RULE_INT )
            // InternalLsjatl.g:1337:3: RULE_INT
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
    // InternalLsjatl.g:1346:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1350:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1351:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1351:2: ( RULE_INT )
            // InternalLsjatl.g:1352:3: RULE_INT
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
    // InternalLsjatl.g:1361:1: rule__Rules__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__Rules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1365:1: ( ( ruleRule ) )
            // InternalLsjatl.g:1366:2: ( ruleRule )
            {
            // InternalLsjatl.g:1366:2: ( ruleRule )
            // InternalLsjatl.g:1367:3: ruleRule
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


    // $ANTLR start "rule__Rule__StateAssignment_1"
    // InternalLsjatl.g:1376:1: rule__Rule__StateAssignment_1 : ( ruleState ) ;
    public final void rule__Rule__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1380:1: ( ( ruleState ) )
            // InternalLsjatl.g:1381:2: ( ruleState )
            {
            // InternalLsjatl.g:1381:2: ( ruleState )
            // InternalLsjatl.g:1382:3: ruleState
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


    // $ANTLR start "rule__Rule__OpAssignment_4"
    // InternalLsjatl.g:1391:1: rule__Rule__OpAssignment_4 : ( ruleBoolOp ) ;
    public final void rule__Rule__OpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1395:1: ( ( ruleBoolOp ) )
            // InternalLsjatl.g:1396:2: ( ruleBoolOp )
            {
            // InternalLsjatl.g:1396:2: ( ruleBoolOp )
            // InternalLsjatl.g:1397:3: ruleBoolOp
            {
             before(grammarAccess.getRuleAccess().getOpBoolOpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOp();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOpBoolOpParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__OpAssignment_4"


    // $ANTLR start "rule__Rule__NCountAssignment_5"
    // InternalLsjatl.g:1406:1: rule__Rule__NCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__Rule__NCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1410:1: ( ( RULE_INT ) )
            // InternalLsjatl.g:1411:2: ( RULE_INT )
            {
            // InternalLsjatl.g:1411:2: ( RULE_INT )
            // InternalLsjatl.g:1412:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getNCountINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNCountINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Rule__NCountAssignment_5"


    // $ANTLR start "rule__Rule__ResultAssignment_7"
    // InternalLsjatl.g:1421:1: rule__Rule__ResultAssignment_7 : ( ruleOutcome ) ;
    public final void rule__Rule__ResultAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLsjatl.g:1425:1: ( ( ruleOutcome ) )
            // InternalLsjatl.g:1426:2: ( ruleOutcome )
            {
            // InternalLsjatl.g:1426:2: ( ruleOutcome )
            // InternalLsjatl.g:1427:3: ruleOutcome
            {
             before(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOutcome();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Rule__ResultAssignment_7"

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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000001C0000L});

}