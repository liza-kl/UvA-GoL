package cps.gameoflife.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cps.gameoflife.services.LsjatlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLsjatlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid'", "'PopulatedCells:'", "'PredefinedPatterns:'", "'GridSize:'", "'('", "'height:'", "','", "'width:'", "')'", "'Glider'", "'Blinker'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'", "'&&'", "'||'", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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

        public InternalLsjatlParser(TokenStream input, LsjatlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected LsjatlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalLsjatl.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalLsjatl.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalLsjatl.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalLsjatl.g:71:1: ruleGame returns [EObject current=null] : ( ( (lv_grid_0_0= ruleGrid ) ) ( (lv_rules_1_0= ruleRules ) ) ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_grid_0_0 = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:77:2: ( ( ( (lv_grid_0_0= ruleGrid ) ) ( (lv_rules_1_0= ruleRules ) ) ) )
            // InternalLsjatl.g:78:2: ( ( (lv_grid_0_0= ruleGrid ) ) ( (lv_rules_1_0= ruleRules ) ) )
            {
            // InternalLsjatl.g:78:2: ( ( (lv_grid_0_0= ruleGrid ) ) ( (lv_rules_1_0= ruleRules ) ) )
            // InternalLsjatl.g:79:3: ( (lv_grid_0_0= ruleGrid ) ) ( (lv_rules_1_0= ruleRules ) )
            {
            // InternalLsjatl.g:79:3: ( (lv_grid_0_0= ruleGrid ) )
            // InternalLsjatl.g:80:4: (lv_grid_0_0= ruleGrid )
            {
            // InternalLsjatl.g:80:4: (lv_grid_0_0= ruleGrid )
            // InternalLsjatl.g:81:5: lv_grid_0_0= ruleGrid
            {

            					newCompositeNode(grammarAccess.getGameAccess().getGridGridParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_grid_0_0=ruleGrid();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"grid",
            						lv_grid_0_0,
            						"cps.gameoflife.Lsjatl.Grid");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLsjatl.g:98:3: ( (lv_rules_1_0= ruleRules ) )
            // InternalLsjatl.g:99:4: (lv_rules_1_0= ruleRules )
            {
            // InternalLsjatl.g:99:4: (lv_rules_1_0= ruleRules )
            // InternalLsjatl.g:100:5: lv_rules_1_0= ruleRules
            {

            					newCompositeNode(grammarAccess.getGameAccess().getRulesRulesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rules_1_0=ruleRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_1_0,
            						"cps.gameoflife.Lsjatl.Rules");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleGrid"
    // InternalLsjatl.g:121:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalLsjatl.g:121:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalLsjatl.g:122:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalLsjatl.g:128:1: ruleGrid returns [EObject current=null] : ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* (otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+ )? ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_size_2_0 = null;

        EObject lv_populatedCells_4_0 = null;

        AntlrDatatypeRuleToken lv_predefinedPatterns_6_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:134:2: ( ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* (otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+ )? ) )
            // InternalLsjatl.g:135:2: ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* (otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+ )? )
            {
            // InternalLsjatl.g:135:2: ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* (otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+ )? )
            // InternalLsjatl.g:136:3: () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* (otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+ )?
            {
            // InternalLsjatl.g:136:3: ()
            // InternalLsjatl.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGridAccess().getGridAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGridAccess().getGridKeyword_1());
            		
            // InternalLsjatl.g:147:3: ( (lv_size_2_0= ruleGridSize ) )
            // InternalLsjatl.g:148:4: (lv_size_2_0= ruleGridSize )
            {
            // InternalLsjatl.g:148:4: (lv_size_2_0= ruleGridSize )
            // InternalLsjatl.g:149:5: lv_size_2_0= ruleGridSize
            {

            					newCompositeNode(grammarAccess.getGridAccess().getSizeGridSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_size_2_0=ruleGridSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGridRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_2_0,
            						"cps.gameoflife.Lsjatl.GridSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGridAccess().getPopulatedCellsKeyword_3());
            		
            // InternalLsjatl.g:170:3: ( (lv_populatedCells_4_0= rulePopulatedCell ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLsjatl.g:171:4: (lv_populatedCells_4_0= rulePopulatedCell )
            	    {
            	    // InternalLsjatl.g:171:4: (lv_populatedCells_4_0= rulePopulatedCell )
            	    // InternalLsjatl.g:172:5: lv_populatedCells_4_0= rulePopulatedCell
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_populatedCells_4_0=rulePopulatedCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"populatedCells",
            	    						lv_populatedCells_4_0,
            	    						"cps.gameoflife.Lsjatl.PopulatedCell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLsjatl.g:189:3: (otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLsjatl.g:190:4: otherlv_5= 'PredefinedPatterns:' ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getGridAccess().getPredefinedPatternsKeyword_5_0());
                    			
                    // InternalLsjatl.g:194:4: ( (lv_predefinedPatterns_6_0= rulePredefinedPattern ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=20 && LA2_0<=21)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLsjatl.g:195:5: (lv_predefinedPatterns_6_0= rulePredefinedPattern )
                    	    {
                    	    // InternalLsjatl.g:195:5: (lv_predefinedPatterns_6_0= rulePredefinedPattern )
                    	    // InternalLsjatl.g:196:6: lv_predefinedPatterns_6_0= rulePredefinedPattern
                    	    {

                    	    						newCompositeNode(grammarAccess.getGridAccess().getPredefinedPatternsPredefinedPatternParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_predefinedPatterns_6_0=rulePredefinedPattern();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGridRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"predefinedPatterns",
                    	    							lv_predefinedPatterns_6_0,
                    	    							"cps.gameoflife.Lsjatl.PredefinedPattern");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleGridSize"
    // InternalLsjatl.g:218:1: entryRuleGridSize returns [EObject current=null] : iv_ruleGridSize= ruleGridSize EOF ;
    public final EObject entryRuleGridSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridSize = null;


        try {
            // InternalLsjatl.g:218:49: (iv_ruleGridSize= ruleGridSize EOF )
            // InternalLsjatl.g:219:2: iv_ruleGridSize= ruleGridSize EOF
            {
             newCompositeNode(grammarAccess.getGridSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGridSize=ruleGridSize();

            state._fsp--;

             current =iv_ruleGridSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGridSize"


    // $ANTLR start "ruleGridSize"
    // InternalLsjatl.g:225:1: ruleGridSize returns [EObject current=null] : ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' ) ;
    public final EObject ruleGridSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_height_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_width_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalLsjatl.g:231:2: ( ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' ) )
            // InternalLsjatl.g:232:2: ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' )
            {
            // InternalLsjatl.g:232:2: ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' )
            // InternalLsjatl.g:233:3: () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')'
            {
            // InternalLsjatl.g:233:3: ()
            // InternalLsjatl.g:234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGridSizeAccess().getGridSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGridSizeAccess().getGridSizeKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLsjatl.g:248:3: (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) )
            // InternalLsjatl.g:249:4: otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) )
            {
            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getGridSizeAccess().getHeightKeyword_3_0());
            			
            // InternalLsjatl.g:253:4: ( (lv_height_4_0= RULE_INT ) )
            // InternalLsjatl.g:254:5: (lv_height_4_0= RULE_INT )
            {
            // InternalLsjatl.g:254:5: (lv_height_4_0= RULE_INT )
            // InternalLsjatl.g:255:6: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            						newLeafNode(lv_height_4_0, grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGridSizeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"height",
            							lv_height_4_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_13); 

            				newLeafNode(otherlv_5, grammarAccess.getGridSizeAccess().getCommaKeyword_3_2());
            			
            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            				newLeafNode(otherlv_6, grammarAccess.getGridSizeAccess().getWidthKeyword_3_3());
            			
            // InternalLsjatl.g:279:4: ( (lv_width_7_0= RULE_INT ) )
            // InternalLsjatl.g:280:5: (lv_width_7_0= RULE_INT )
            {
            // InternalLsjatl.g:280:5: (lv_width_7_0= RULE_INT )
            // InternalLsjatl.g:281:6: lv_width_7_0= RULE_INT
            {
            lv_width_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            						newLeafNode(lv_width_7_0, grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_3_4_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGridSizeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"width",
            							lv_width_7_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGridSizeAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGridSize"


    // $ANTLR start "entryRulePredefinedPattern"
    // InternalLsjatl.g:306:1: entryRulePredefinedPattern returns [String current=null] : iv_rulePredefinedPattern= rulePredefinedPattern EOF ;
    public final String entryRulePredefinedPattern() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredefinedPattern = null;


        try {
            // InternalLsjatl.g:306:57: (iv_rulePredefinedPattern= rulePredefinedPattern EOF )
            // InternalLsjatl.g:307:2: iv_rulePredefinedPattern= rulePredefinedPattern EOF
            {
             newCompositeNode(grammarAccess.getPredefinedPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredefinedPattern=rulePredefinedPattern();

            state._fsp--;

             current =iv_rulePredefinedPattern.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredefinedPattern"


    // $ANTLR start "rulePredefinedPattern"
    // InternalLsjatl.g:313:1: rulePredefinedPattern returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Glider' | kw= 'Blinker' ) ;
    public final AntlrDatatypeRuleToken rulePredefinedPattern() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:319:2: ( (kw= 'Glider' | kw= 'Blinker' ) )
            // InternalLsjatl.g:320:2: (kw= 'Glider' | kw= 'Blinker' )
            {
            // InternalLsjatl.g:320:2: (kw= 'Glider' | kw= 'Blinker' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLsjatl.g:321:3: kw= 'Glider'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPredefinedPatternAccess().getGliderKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:327:3: kw= 'Blinker'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPredefinedPatternAccess().getBlinkerKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefinedPattern"


    // $ANTLR start "entryRulePopulatedCell"
    // InternalLsjatl.g:336:1: entryRulePopulatedCell returns [EObject current=null] : iv_rulePopulatedCell= rulePopulatedCell EOF ;
    public final EObject entryRulePopulatedCell() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulatedCell = null;


        try {
            // InternalLsjatl.g:336:54: (iv_rulePopulatedCell= rulePopulatedCell EOF )
            // InternalLsjatl.g:337:2: iv_rulePopulatedCell= rulePopulatedCell EOF
            {
             newCompositeNode(grammarAccess.getPopulatedCellRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePopulatedCell=rulePopulatedCell();

            state._fsp--;

             current =iv_rulePopulatedCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePopulatedCell"


    // $ANTLR start "rulePopulatedCell"
    // InternalLsjatl.g:343:1: rulePopulatedCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject rulePopulatedCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLsjatl.g:349:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalLsjatl.g:350:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalLsjatl.g:350:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalLsjatl.g:351:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLsjatl.g:355:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalLsjatl.g:356:4: (lv_x_1_0= RULE_INT )
            {
            // InternalLsjatl.g:356:4: (lv_x_1_0= RULE_INT )
            // InternalLsjatl.g:357:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPopulatedCellAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPopulatedCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPopulatedCellAccess().getCommaKeyword_2());
            		
            // InternalLsjatl.g:377:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalLsjatl.g:378:4: (lv_y_3_0= RULE_INT )
            {
            // InternalLsjatl.g:378:4: (lv_y_3_0= RULE_INT )
            // InternalLsjatl.g:379:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_y_3_0, grammarAccess.getPopulatedCellAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPopulatedCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPopulatedCellAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePopulatedCell"


    // $ANTLR start "entryRuleRules"
    // InternalLsjatl.g:403:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalLsjatl.g:403:46: (iv_ruleRules= ruleRules EOF )
            // InternalLsjatl.g:404:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalLsjatl.g:410:1: ruleRules returns [EObject current=null] : ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:416:2: ( ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalLsjatl.g:417:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalLsjatl.g:417:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            // InternalLsjatl.g:418:3: () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalLsjatl.g:418:3: ()
            // InternalLsjatl.g:419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulesAccess().getRulesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getRulesKeyword_1());
            		
            // InternalLsjatl.g:429:3: ( (lv_rules_2_0= ruleRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLsjatl.g:430:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalLsjatl.g:430:4: (lv_rules_2_0= ruleRule )
            	    // InternalLsjatl.g:431:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"cps.gameoflife.Lsjatl.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleCondition"
    // InternalLsjatl.g:452:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalLsjatl.g:452:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalLsjatl.g:453:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalLsjatl.g:459:1: ruleCondition returns [EObject current=null] : ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_NCount_1_0=null;
        AntlrDatatypeRuleToken lv_boolOp_0_0 = null;

        AntlrDatatypeRuleToken lv_separator_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:465:2: ( ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? ) )
            // InternalLsjatl.g:466:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? )
            {
            // InternalLsjatl.g:466:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? )
            // InternalLsjatl.g:467:3: ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )?
            {
            // InternalLsjatl.g:467:3: ( (lv_boolOp_0_0= ruleBoolOp ) )
            // InternalLsjatl.g:468:4: (lv_boolOp_0_0= ruleBoolOp )
            {
            // InternalLsjatl.g:468:4: (lv_boolOp_0_0= ruleBoolOp )
            // InternalLsjatl.g:469:5: lv_boolOp_0_0= ruleBoolOp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_boolOp_0_0=ruleBoolOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"boolOp",
            						lv_boolOp_0_0,
            						"cps.gameoflife.Lsjatl.BoolOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLsjatl.g:486:3: ( (lv_NCount_1_0= RULE_INT ) )
            // InternalLsjatl.g:487:4: (lv_NCount_1_0= RULE_INT )
            {
            // InternalLsjatl.g:487:4: (lv_NCount_1_0= RULE_INT )
            // InternalLsjatl.g:488:5: lv_NCount_1_0= RULE_INT
            {
            lv_NCount_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_NCount_1_0, grammarAccess.getConditionAccess().getNCountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"NCount",
            						lv_NCount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalLsjatl.g:504:3: ( (lv_separator_2_0= ruleSeparator ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=27 && LA6_0<=28)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLsjatl.g:505:4: (lv_separator_2_0= ruleSeparator )
                    {
                    // InternalLsjatl.g:505:4: (lv_separator_2_0= ruleSeparator )
                    // InternalLsjatl.g:506:5: lv_separator_2_0= ruleSeparator
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getSeparatorSeparatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_separator_2_0=ruleSeparator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"separator",
                    						lv_separator_2_0,
                    						"cps.gameoflife.Lsjatl.Separator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleRule"
    // InternalLsjatl.g:527:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalLsjatl.g:527:45: (iv_ruleRule= ruleRule EOF )
            // InternalLsjatl.g:528:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalLsjatl.g:534:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_state_1_0 = null;

        EObject lv_conditions_4_0 = null;

        AntlrDatatypeRuleToken lv_result_6_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:540:2: ( (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) )
            // InternalLsjatl.g:541:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            {
            // InternalLsjatl.g:541:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            // InternalLsjatl.g:542:3: otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getEachKeyword_0());
            		
            // InternalLsjatl.g:546:3: ( (lv_state_1_0= ruleState ) )
            // InternalLsjatl.g:547:4: (lv_state_1_0= ruleState )
            {
            // InternalLsjatl.g:547:4: (lv_state_1_0= ruleState )
            // InternalLsjatl.g:548:5: lv_state_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_state_1_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"cps.gameoflife.Lsjatl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCellKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWithKeyword_3());
            		
            // InternalLsjatl.g:573:3: ( (lv_conditions_4_0= ruleCondition ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=31 && LA7_0<=35)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLsjatl.g:574:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalLsjatl.g:574:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalLsjatl.g:575:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_conditions_4_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_4_0,
            	    						"cps.gameoflife.Lsjatl.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getNeighborsKeyword_5());
            		
            // InternalLsjatl.g:596:3: ( (lv_result_6_0= ruleOutcome ) )
            // InternalLsjatl.g:597:4: (lv_result_6_0= ruleOutcome )
            {
            // InternalLsjatl.g:597:4: (lv_result_6_0= ruleOutcome )
            // InternalLsjatl.g:598:5: lv_result_6_0= ruleOutcome
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getResultOutcomeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_6_0=ruleOutcome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_6_0,
            						"cps.gameoflife.Lsjatl.Outcome");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSeparator"
    // InternalLsjatl.g:619:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // InternalLsjatl.g:619:49: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalLsjatl.g:620:2: iv_ruleSeparator= ruleSeparator EOF
            {
             newCompositeNode(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparator=ruleSeparator();

            state._fsp--;

             current =iv_ruleSeparator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalLsjatl.g:626:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:632:2: ( (kw= '&&' | kw= '||' ) )
            // InternalLsjatl.g:633:2: (kw= '&&' | kw= '||' )
            {
            // InternalLsjatl.g:633:2: (kw= '&&' | kw= '||' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLsjatl.g:634:3: kw= '&&'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:640:3: kw= '||'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleState"
    // InternalLsjatl.g:649:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalLsjatl.g:649:45: (iv_ruleState= ruleState EOF )
            // InternalLsjatl.g:650:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalLsjatl.g:656:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'living' | kw= 'dead' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:662:2: ( (kw= 'living' | kw= 'dead' ) )
            // InternalLsjatl.g:663:2: (kw= 'living' | kw= 'dead' )
            {
            // InternalLsjatl.g:663:2: (kw= 'living' | kw= 'dead' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLsjatl.g:664:3: kw= 'living'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getLivingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:670:3: kw= 'dead'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getDeadKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleBoolOp"
    // InternalLsjatl.g:679:1: entryRuleBoolOp returns [String current=null] : iv_ruleBoolOp= ruleBoolOp EOF ;
    public final String entryRuleBoolOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOp = null;


        try {
            // InternalLsjatl.g:679:46: (iv_ruleBoolOp= ruleBoolOp EOF )
            // InternalLsjatl.g:680:2: iv_ruleBoolOp= ruleBoolOp EOF
            {
             newCompositeNode(grammarAccess.getBoolOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolOp=ruleBoolOp();

            state._fsp--;

             current =iv_ruleBoolOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolOp"


    // $ANTLR start "ruleBoolOp"
    // InternalLsjatl.g:686:1: ruleBoolOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:692:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) )
            // InternalLsjatl.g:693:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            {
            // InternalLsjatl.g:693:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 35:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLsjatl.g:694:3: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:700:3: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:706:3: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:712:3: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:718:3: kw= '=='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolOp"


    // $ANTLR start "entryRuleOutcome"
    // InternalLsjatl.g:727:1: entryRuleOutcome returns [String current=null] : iv_ruleOutcome= ruleOutcome EOF ;
    public final String entryRuleOutcome() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutcome = null;


        try {
            // InternalLsjatl.g:727:47: (iv_ruleOutcome= ruleOutcome EOF )
            // InternalLsjatl.g:728:2: iv_ruleOutcome= ruleOutcome EOF
            {
             newCompositeNode(grammarAccess.getOutcomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutcome=ruleOutcome();

            state._fsp--;

             current =iv_ruleOutcome.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutcome"


    // $ANTLR start "ruleOutcome"
    // InternalLsjatl.g:734:1: ruleOutcome returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'survives' | kw= 'dies' | kw= 'populates' ) ;
    public final AntlrDatatypeRuleToken ruleOutcome() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:740:2: ( (kw= 'survives' | kw= 'dies' | kw= 'populates' ) )
            // InternalLsjatl.g:741:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            {
            // InternalLsjatl.g:741:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLsjatl.g:742:3: kw= 'survives'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getSurvivesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:748:3: kw= 'dies'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getDiesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:754:3: kw= 'populates'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getPopulatesKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutcome"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000F84000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007000000000L});

}