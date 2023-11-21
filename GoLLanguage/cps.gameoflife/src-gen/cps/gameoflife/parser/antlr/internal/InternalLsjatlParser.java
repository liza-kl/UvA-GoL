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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid'", "'GridSize'", "'height:'", "'width:'", "'Point'", "'('", "','", "')'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'"
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
    // InternalLsjatl.g:128:1: ruleGrid returns [EObject current=null] : ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) ( (lv_populatedCells_3_0= rulePopulatedCell ) )* ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_size_2_0 = null;

        EObject lv_populatedCells_3_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:134:2: ( ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) ( (lv_populatedCells_3_0= rulePopulatedCell ) )* ) )
            // InternalLsjatl.g:135:2: ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) ( (lv_populatedCells_3_0= rulePopulatedCell ) )* )
            {
            // InternalLsjatl.g:135:2: ( () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) ( (lv_populatedCells_3_0= rulePopulatedCell ) )* )
            // InternalLsjatl.g:136:3: () otherlv_1= 'Grid' ( (lv_size_2_0= ruleGridSize ) ) ( (lv_populatedCells_3_0= rulePopulatedCell ) )*
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

            // InternalLsjatl.g:166:3: ( (lv_populatedCells_3_0= rulePopulatedCell ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLsjatl.g:167:4: (lv_populatedCells_3_0= rulePopulatedCell )
            	    {
            	    // InternalLsjatl.g:167:4: (lv_populatedCells_3_0= rulePopulatedCell )
            	    // InternalLsjatl.g:168:5: lv_populatedCells_3_0= rulePopulatedCell
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getPopulatedCellsPopulatedCellParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_populatedCells_3_0=rulePopulatedCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"populatedCells",
            	    						lv_populatedCells_3_0,
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
    // InternalLsjatl.g:189:1: entryRuleGridSize returns [EObject current=null] : iv_ruleGridSize= ruleGridSize EOF ;
    public final EObject entryRuleGridSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridSize = null;


        try {
            // InternalLsjatl.g:189:49: (iv_ruleGridSize= ruleGridSize EOF )
            // InternalLsjatl.g:190:2: iv_ruleGridSize= ruleGridSize EOF
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
    // InternalLsjatl.g:196:1: ruleGridSize returns [EObject current=null] : ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleGridSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;
        Token lv_width_5_0=null;


        	enterRule();

        try {
            // InternalLsjatl.g:202:2: ( ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) ) )
            // InternalLsjatl.g:203:2: ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) )
            {
            // InternalLsjatl.g:203:2: ( () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) ) )
            // InternalLsjatl.g:204:3: () otherlv_1= 'GridSize' (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) )
            {
            // InternalLsjatl.g:204:3: ()
            // InternalLsjatl.g:205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGridSizeAccess().getGridSizeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGridSizeAccess().getGridSizeKeyword_1());
            		
            // InternalLsjatl.g:215:3: (otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) ) )
            // InternalLsjatl.g:216:4: otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) otherlv_4= 'width:' ( (lv_width_5_0= RULE_INT ) )
            {
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            				newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getHeightKeyword_2_0());
            			
            // InternalLsjatl.g:220:4: ( (lv_height_3_0= RULE_INT ) )
            // InternalLsjatl.g:221:5: (lv_height_3_0= RULE_INT )
            {
            // InternalLsjatl.g:221:5: (lv_height_3_0= RULE_INT )
            // InternalLsjatl.g:222:6: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            				newLeafNode(otherlv_4, grammarAccess.getGridSizeAccess().getWidthKeyword_2_2());
            			
            // InternalLsjatl.g:242:4: ( (lv_width_5_0= RULE_INT ) )
            // InternalLsjatl.g:243:5: (lv_width_5_0= RULE_INT )
            {
            // InternalLsjatl.g:243:5: (lv_width_5_0= RULE_INT )
            // InternalLsjatl.g:244:6: lv_width_5_0= RULE_INT
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
    // InternalLsjatl.g:265:1: entryRulePopulatedCell returns [EObject current=null] : iv_rulePopulatedCell= rulePopulatedCell EOF ;
    public final EObject entryRulePopulatedCell() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulatedCell = null;


        try {
            // InternalLsjatl.g:265:54: (iv_rulePopulatedCell= rulePopulatedCell EOF )
            // InternalLsjatl.g:266:2: iv_rulePopulatedCell= rulePopulatedCell EOF
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
    // InternalLsjatl.g:272:1: rulePopulatedCell returns [EObject current=null] : (otherlv_0= 'Point' ( (lv_poi_1_0= rulePoint ) ) ) ;
    public final EObject rulePopulatedCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_poi_1_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:278:2: ( (otherlv_0= 'Point' ( (lv_poi_1_0= rulePoint ) ) ) )
            // InternalLsjatl.g:279:2: (otherlv_0= 'Point' ( (lv_poi_1_0= rulePoint ) ) )
            {
            // InternalLsjatl.g:279:2: (otherlv_0= 'Point' ( (lv_poi_1_0= rulePoint ) ) )
            // InternalLsjatl.g:280:3: otherlv_0= 'Point' ( (lv_poi_1_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPopulatedCellAccess().getPointKeyword_0());
            		
            // InternalLsjatl.g:284:3: ( (lv_poi_1_0= rulePoint ) )
            // InternalLsjatl.g:285:4: (lv_poi_1_0= rulePoint )
            {
            // InternalLsjatl.g:285:4: (lv_poi_1_0= rulePoint )
            // InternalLsjatl.g:286:5: lv_poi_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPopulatedCellAccess().getPoiPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_poi_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPopulatedCellRule());
            					}
            					set(
            						current,
            						"poi",
            						lv_poi_1_0,
            						"cps.gameoflife.Lsjatl.Point");
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
    // $ANTLR end "rulePopulatedCell"


    // $ANTLR start "entryRulePoint"
    // InternalLsjatl.g:307:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalLsjatl.g:307:46: (iv_rulePoint= rulePoint EOF )
            // InternalLsjatl.g:308:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalLsjatl.g:314:1: rulePoint returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLsjatl.g:320:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalLsjatl.g:321:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalLsjatl.g:321:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalLsjatl.g:322:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLsjatl.g:326:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalLsjatl.g:327:4: (lv_x_1_0= RULE_INT )
            {
            // InternalLsjatl.g:327:4: (lv_x_1_0= RULE_INT )
            // InternalLsjatl.g:328:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getCommaKeyword_2());
            		
            // InternalLsjatl.g:348:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalLsjatl.g:349:4: (lv_y_3_0= RULE_INT )
            {
            // InternalLsjatl.g:349:4: (lv_y_3_0= RULE_INT )
            // InternalLsjatl.g:350:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_y_3_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleRules"
    // InternalLsjatl.g:374:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalLsjatl.g:374:46: (iv_ruleRules= ruleRules EOF )
            // InternalLsjatl.g:375:2: iv_ruleRules= ruleRules EOF
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
    // InternalLsjatl.g:381:1: ruleRules returns [EObject current=null] : ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:387:2: ( ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalLsjatl.g:388:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalLsjatl.g:388:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            // InternalLsjatl.g:389:3: () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalLsjatl.g:389:3: ()
            // InternalLsjatl.g:390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulesAccess().getRulesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getRulesKeyword_1());
            		
            // InternalLsjatl.g:400:3: ( (lv_rules_2_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLsjatl.g:401:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalLsjatl.g:401:4: (lv_rules_2_0= ruleRule )
            	    // InternalLsjatl.g:402:5: lv_rules_2_0= ruleRule
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
    // InternalLsjatl.g:423:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalLsjatl.g:423:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalLsjatl.g:424:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalLsjatl.g:430:1: ruleCondition returns [EObject current=null] : ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_NCount_1_0=null;
        AntlrDatatypeRuleToken lv_boolOp_0_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:436:2: ( ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ) )
            // InternalLsjatl.g:437:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) )
            {
            // InternalLsjatl.g:437:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) )
            // InternalLsjatl.g:438:3: ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) )
            {
            // InternalLsjatl.g:438:3: ( (lv_boolOp_0_0= ruleBoolOp ) )
            // InternalLsjatl.g:439:4: (lv_boolOp_0_0= ruleBoolOp )
            {
            // InternalLsjatl.g:439:4: (lv_boolOp_0_0= ruleBoolOp )
            // InternalLsjatl.g:440:5: lv_boolOp_0_0= ruleBoolOp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalLsjatl.g:457:3: ( (lv_NCount_1_0= RULE_INT ) )
            // InternalLsjatl.g:458:4: (lv_NCount_1_0= RULE_INT )
            {
            // InternalLsjatl.g:458:4: (lv_NCount_1_0= RULE_INT )
            // InternalLsjatl.g:459:5: lv_NCount_1_0= RULE_INT
            {
            lv_NCount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

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
    // InternalLsjatl.g:479:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalLsjatl.g:479:45: (iv_ruleRule= ruleRule EOF )
            // InternalLsjatl.g:480:2: iv_ruleRule= ruleRule EOF
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
    // InternalLsjatl.g:486:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) ;
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
            // InternalLsjatl.g:492:2: ( (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) )
            // InternalLsjatl.g:493:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            {
            // InternalLsjatl.g:493:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            // InternalLsjatl.g:494:3: otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getEachKeyword_0());
            		
            // InternalLsjatl.g:498:3: ( (lv_state_1_0= ruleState ) )
            // InternalLsjatl.g:499:4: (lv_state_1_0= ruleState )
            {
            // InternalLsjatl.g:499:4: (lv_state_1_0= ruleState )
            // InternalLsjatl.g:500:5: lv_state_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCellKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWithKeyword_3());
            		
            // InternalLsjatl.g:525:3: ( (lv_conditions_4_0= ruleCondition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=26 && LA3_0<=30)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLsjatl.g:526:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalLsjatl.g:526:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalLsjatl.g:527:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getNeighborsKeyword_5());
            		
            // InternalLsjatl.g:548:3: ( (lv_result_6_0= ruleOutcome ) )
            // InternalLsjatl.g:549:4: (lv_result_6_0= ruleOutcome )
            {
            // InternalLsjatl.g:549:4: (lv_result_6_0= ruleOutcome )
            // InternalLsjatl.g:550:5: lv_result_6_0= ruleOutcome
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


    // $ANTLR start "entryRuleState"
    // InternalLsjatl.g:571:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalLsjatl.g:571:45: (iv_ruleState= ruleState EOF )
            // InternalLsjatl.g:572:2: iv_ruleState= ruleState EOF
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
    // InternalLsjatl.g:578:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'living' | kw= 'dead' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:584:2: ( (kw= 'living' | kw= 'dead' ) )
            // InternalLsjatl.g:585:2: (kw= 'living' | kw= 'dead' )
            {
            // InternalLsjatl.g:585:2: (kw= 'living' | kw= 'dead' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLsjatl.g:586:3: kw= 'living'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getLivingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:592:3: kw= 'dead'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalLsjatl.g:601:1: entryRuleBoolOp returns [String current=null] : iv_ruleBoolOp= ruleBoolOp EOF ;
    public final String entryRuleBoolOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOp = null;


        try {
            // InternalLsjatl.g:601:46: (iv_ruleBoolOp= ruleBoolOp EOF )
            // InternalLsjatl.g:602:2: iv_ruleBoolOp= ruleBoolOp EOF
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
    // InternalLsjatl.g:608:1: ruleBoolOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:614:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) )
            // InternalLsjatl.g:615:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            {
            // InternalLsjatl.g:615:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLsjatl.g:616:3: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:622:3: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:628:3: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:634:3: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:640:3: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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
    // InternalLsjatl.g:649:1: entryRuleOutcome returns [String current=null] : iv_ruleOutcome= ruleOutcome EOF ;
    public final String entryRuleOutcome() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutcome = null;


        try {
            // InternalLsjatl.g:649:47: (iv_ruleOutcome= ruleOutcome EOF )
            // InternalLsjatl.g:650:2: iv_ruleOutcome= ruleOutcome EOF
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
    // InternalLsjatl.g:656:1: ruleOutcome returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'survives' | kw= 'dies' | kw= 'populates' ) ;
    public final AntlrDatatypeRuleToken ruleOutcome() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:662:2: ( (kw= 'survives' | kw= 'dies' | kw= 'populates' ) )
            // InternalLsjatl.g:663:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            {
            // InternalLsjatl.g:663:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLsjatl.g:664:3: kw= 'survives'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getSurvivesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:670:3: kw= 'dies'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getDiesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:676:3: kw= 'populates'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007C800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000380000000L});

}