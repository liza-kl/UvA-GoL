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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid'", "'PopulatedCells:'", "'GridSize'", "'height:'", "'width:'", "'('", "','", "')'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'", "'&&'", "'||'", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'"
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
    // InternalLsjatl.g:128:1: ruleGrid returns [EObject current=null] : ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_size_2_0 = null;

        EObject lv_populatedCells_4_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:134:2: ( ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* ) )
            // InternalLsjatl.g:135:2: ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* )
            {
            // InternalLsjatl.g:135:2: ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )* )
            // InternalLsjatl.g:136:3: () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) otherlv_3= 'PopulatedCells:' ( (lv_populatedCells_4_0= rulePopulatedCell ) )*
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

                if ( (LA1_0==16) ) {
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
    // InternalLsjatl.g:193:1: entryRuleGridSize returns [EObject current=null] : iv_ruleGridSize= ruleGridSize EOF ;
    public final EObject entryRuleGridSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridSize = null;


        try {
            // InternalLsjatl.g:193:49: (iv_ruleGridSize= ruleGridSize EOF )
            // InternalLsjatl.g:194:2: iv_ruleGridSize= ruleGridSize EOF
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
    // InternalLsjatl.g:200:1: ruleGridSize returns [EObject current=null] : ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleGridSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;
        Token lv_width_5_0=null;


        	enterRule();

        try {
            // InternalLsjatl.g:206:2: ( ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) ) )
            // InternalLsjatl.g:207:2: ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) )
            {
            // InternalLsjatl.g:207:2: ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) )
            // InternalLsjatl.g:208:3: () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) )
            {
            // InternalLsjatl.g:208:3: ()
            // InternalLsjatl.g:209:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGridSizeAccess().getGridSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGridSizeAccess().getGridSizeKeyword_1());
            		
            // InternalLsjatl.g:219:3: (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) )
            // InternalLsjatl.g:220:4: otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            				newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getHeightKeyword_2_0());
            			
            // InternalLsjatl.g:224:4: ( (lv_height_3_0= RULE_INT ) )
            // InternalLsjatl.g:225:5: (lv_height_3_0= RULE_INT )
            {
            // InternalLsjatl.g:225:5: (lv_height_3_0= RULE_INT )
            // InternalLsjatl.g:226:6: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            						newLeafNode(lv_height_3_0, grammarAccess.getGridSizeAccess().getHeightINTTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGridSizeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"height",
            							lv_height_3_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_4, grammarAccess.getGridSizeAccess().getWidthKeyword_2_2());
            			
            // InternalLsjatl.g:246:4: ( (lv_width_5_0= RULE_INT ) )
            // InternalLsjatl.g:247:5: (lv_width_5_0= RULE_INT )
            {
            // InternalLsjatl.g:247:5: (lv_width_5_0= RULE_INT )
            // InternalLsjatl.g:248:6: lv_width_5_0= RULE_INT
            {
            lv_width_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            						newLeafNode(lv_width_5_0, grammarAccess.getGridSizeAccess().getWidthINTTerminalRuleCall_2_3_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGridSizeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"width",
            							lv_width_5_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


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
    // $ANTLR end "ruleGridSize"


    // $ANTLR start "entryRulePopulatedCell"
    // InternalLsjatl.g:269:1: entryRulePopulatedCell returns [EObject current=null] : iv_rulePopulatedCell= rulePopulatedCell EOF ;
    public final EObject entryRulePopulatedCell() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulatedCell = null;


        try {
            // InternalLsjatl.g:269:54: (iv_rulePopulatedCell= rulePopulatedCell EOF )
            // InternalLsjatl.g:270:2: iv_rulePopulatedCell= rulePopulatedCell EOF
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
    // InternalLsjatl.g:276:1: rulePopulatedCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject rulePopulatedCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLsjatl.g:282:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalLsjatl.g:283:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalLsjatl.g:283:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalLsjatl.g:284:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLsjatl.g:288:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalLsjatl.g:289:4: (lv_x_1_0= RULE_INT )
            {
            // InternalLsjatl.g:289:4: (lv_x_1_0= RULE_INT )
            // InternalLsjatl.g:290:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPopulatedCellAccess().getCommaKeyword_2());
            		
            // InternalLsjatl.g:310:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalLsjatl.g:311:4: (lv_y_3_0= RULE_INT )
            {
            // InternalLsjatl.g:311:4: (lv_y_3_0= RULE_INT )
            // InternalLsjatl.g:312:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLsjatl.g:336:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalLsjatl.g:336:46: (iv_ruleRules= ruleRules EOF )
            // InternalLsjatl.g:337:2: iv_ruleRules= ruleRules EOF
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
    // InternalLsjatl.g:343:1: ruleRules returns [EObject current=null] : ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:349:2: ( ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalLsjatl.g:350:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalLsjatl.g:350:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            // InternalLsjatl.g:351:3: () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalLsjatl.g:351:3: ()
            // InternalLsjatl.g:352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulesAccess().getRulesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getRulesKeyword_1());
            		
            // InternalLsjatl.g:362:3: ( (lv_rules_2_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLsjatl.g:363:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalLsjatl.g:363:4: (lv_rules_2_0= ruleRule )
            	    // InternalLsjatl.g:364:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop2;
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
    // InternalLsjatl.g:385:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalLsjatl.g:385:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalLsjatl.g:386:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalLsjatl.g:392:1: ruleCondition returns [EObject current=null] : ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_NCount_1_0=null;
        AntlrDatatypeRuleToken lv_boolOp_0_0 = null;

        AntlrDatatypeRuleToken lv_separator_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:398:2: ( ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? ) )
            // InternalLsjatl.g:399:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? )
            {
            // InternalLsjatl.g:399:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? )
            // InternalLsjatl.g:400:3: ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )?
            {
            // InternalLsjatl.g:400:3: ( (lv_boolOp_0_0= ruleBoolOp ) )
            // InternalLsjatl.g:401:4: (lv_boolOp_0_0= ruleBoolOp )
            {
            // InternalLsjatl.g:401:4: (lv_boolOp_0_0= ruleBoolOp )
            // InternalLsjatl.g:402:5: lv_boolOp_0_0= ruleBoolOp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLsjatl.g:419:3: ( (lv_NCount_1_0= RULE_INT ) )
            // InternalLsjatl.g:420:4: (lv_NCount_1_0= RULE_INT )
            {
            // InternalLsjatl.g:420:4: (lv_NCount_1_0= RULE_INT )
            // InternalLsjatl.g:421:5: lv_NCount_1_0= RULE_INT
            {
            lv_NCount_1_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            // InternalLsjatl.g:437:3: ( (lv_separator_2_0= ruleSeparator ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=25)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLsjatl.g:438:4: (lv_separator_2_0= ruleSeparator )
                    {
                    // InternalLsjatl.g:438:4: (lv_separator_2_0= ruleSeparator )
                    // InternalLsjatl.g:439:5: lv_separator_2_0= ruleSeparator
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
    // InternalLsjatl.g:460:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalLsjatl.g:460:45: (iv_ruleRule= ruleRule EOF )
            // InternalLsjatl.g:461:2: iv_ruleRule= ruleRule EOF
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
    // InternalLsjatl.g:467:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) ;
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
            // InternalLsjatl.g:473:2: ( (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) )
            // InternalLsjatl.g:474:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            {
            // InternalLsjatl.g:474:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            // InternalLsjatl.g:475:3: otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getEachKeyword_0());
            		
            // InternalLsjatl.g:479:3: ( (lv_state_1_0= ruleState ) )
            // InternalLsjatl.g:480:4: (lv_state_1_0= ruleState )
            {
            // InternalLsjatl.g:480:4: (lv_state_1_0= ruleState )
            // InternalLsjatl.g:481:5: lv_state_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCellKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWithKeyword_3());
            		
            // InternalLsjatl.g:506:3: ( (lv_conditions_4_0= ruleCondition ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=28 && LA4_0<=32)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLsjatl.g:507:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalLsjatl.g:507:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalLsjatl.g:508:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getNeighborsKeyword_5());
            		
            // InternalLsjatl.g:529:3: ( (lv_result_6_0= ruleOutcome ) )
            // InternalLsjatl.g:530:4: (lv_result_6_0= ruleOutcome )
            {
            // InternalLsjatl.g:530:4: (lv_result_6_0= ruleOutcome )
            // InternalLsjatl.g:531:5: lv_result_6_0= ruleOutcome
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
    // InternalLsjatl.g:552:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // InternalLsjatl.g:552:49: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalLsjatl.g:553:2: iv_ruleSeparator= ruleSeparator EOF
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
    // InternalLsjatl.g:559:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:565:2: ( (kw= '&&' | kw= '||' ) )
            // InternalLsjatl.g:566:2: (kw= '&&' | kw= '||' )
            {
            // InternalLsjatl.g:566:2: (kw= '&&' | kw= '||' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLsjatl.g:567:3: kw= '&&'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:573:3: kw= '||'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalLsjatl.g:582:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalLsjatl.g:582:45: (iv_ruleState= ruleState EOF )
            // InternalLsjatl.g:583:2: iv_ruleState= ruleState EOF
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
    // InternalLsjatl.g:589:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'living' | kw= 'dead' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:595:2: ( (kw= 'living' | kw= 'dead' ) )
            // InternalLsjatl.g:596:2: (kw= 'living' | kw= 'dead' )
            {
            // InternalLsjatl.g:596:2: (kw= 'living' | kw= 'dead' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLsjatl.g:597:3: kw= 'living'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getLivingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:603:3: kw= 'dead'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalLsjatl.g:612:1: entryRuleBoolOp returns [String current=null] : iv_ruleBoolOp= ruleBoolOp EOF ;
    public final String entryRuleBoolOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOp = null;


        try {
            // InternalLsjatl.g:612:46: (iv_ruleBoolOp= ruleBoolOp EOF )
            // InternalLsjatl.g:613:2: iv_ruleBoolOp= ruleBoolOp EOF
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
    // InternalLsjatl.g:619:1: ruleBoolOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:625:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) )
            // InternalLsjatl.g:626:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            {
            // InternalLsjatl.g:626:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLsjatl.g:627:3: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:633:3: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:639:3: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:645:3: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:651:3: kw= '=='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalLsjatl.g:660:1: entryRuleOutcome returns [String current=null] : iv_ruleOutcome= ruleOutcome EOF ;
    public final String entryRuleOutcome() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutcome = null;


        try {
            // InternalLsjatl.g:660:47: (iv_ruleOutcome= ruleOutcome EOF )
            // InternalLsjatl.g:661:2: iv_ruleOutcome= ruleOutcome EOF
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
    // InternalLsjatl.g:667:1: ruleOutcome returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'survives' | kw= 'dies' | kw= 'populates' ) ;
    public final AntlrDatatypeRuleToken ruleOutcome() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:673:2: ( (kw= 'survives' | kw= 'dies' | kw= 'populates' ) )
            // InternalLsjatl.g:674:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            {
            // InternalLsjatl.g:674:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLsjatl.g:675:3: kw= 'survives'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getSurvivesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:681:3: kw= 'dies'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getDiesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:687:3: kw= 'populates'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001F0800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000E00000000L});

}