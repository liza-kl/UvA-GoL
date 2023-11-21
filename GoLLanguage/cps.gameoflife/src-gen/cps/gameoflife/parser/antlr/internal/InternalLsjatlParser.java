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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid'", "'PopulatedCells:'", "'GridSize:'", "'('", "'height:'", "','", "'width:'", "')'", "'Rules'", "'Each'", "'cell'", "'with'", "'neighbors'", "'&&'", "'||'", "'living'", "'dead'", "'>'", "'<'", "'>='", "'<='", "'=='", "'survives'", "'dies'", "'populates'"
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

                if ( (LA1_0==14) ) {
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
    // InternalLsjatl.g:200:1: ruleGridSize returns [EObject current=null] : ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' ) ;
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
            // InternalLsjatl.g:206:2: ( ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' ) )
            // InternalLsjatl.g:207:2: ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' )
            {
            // InternalLsjatl.g:207:2: ( () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')' )
            // InternalLsjatl.g:208:3: () otherlv_1= 'GridSize:' otherlv_2= '(' (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) ) otherlv_8= ')'
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
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGridSizeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLsjatl.g:223:3: (otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) ) )
            // InternalLsjatl.g:224:4: otherlv_3= 'height:' ( (lv_height_4_0= RULE_INT ) ) otherlv_5= ',' otherlv_6= 'width:' ( (lv_width_7_0= RULE_INT ) )
            {
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            				newLeafNode(otherlv_3, grammarAccess.getGridSizeAccess().getHeightKeyword_3_0());
            			
            // InternalLsjatl.g:228:4: ( (lv_height_4_0= RULE_INT ) )
            // InternalLsjatl.g:229:5: (lv_height_4_0= RULE_INT )
            {
            // InternalLsjatl.g:229:5: (lv_height_4_0= RULE_INT )
            // InternalLsjatl.g:230:6: lv_height_4_0= RULE_INT
            {
            lv_height_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_11); 

            				newLeafNode(otherlv_5, grammarAccess.getGridSizeAccess().getCommaKeyword_3_2());
            			
            otherlv_6=(Token)match(input,17,FOLLOW_9); 

            				newLeafNode(otherlv_6, grammarAccess.getGridSizeAccess().getWidthKeyword_3_3());
            			
            // InternalLsjatl.g:254:4: ( (lv_width_7_0= RULE_INT ) )
            // InternalLsjatl.g:255:5: (lv_width_7_0= RULE_INT )
            {
            // InternalLsjatl.g:255:5: (lv_width_7_0= RULE_INT )
            // InternalLsjatl.g:256:6: lv_width_7_0= RULE_INT
            {
            lv_width_7_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRulePopulatedCell"
    // InternalLsjatl.g:281:1: entryRulePopulatedCell returns [EObject current=null] : iv_rulePopulatedCell= rulePopulatedCell EOF ;
    public final EObject entryRulePopulatedCell() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulatedCell = null;


        try {
            // InternalLsjatl.g:281:54: (iv_rulePopulatedCell= rulePopulatedCell EOF )
            // InternalLsjatl.g:282:2: iv_rulePopulatedCell= rulePopulatedCell EOF
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
    // InternalLsjatl.g:288:1: rulePopulatedCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject rulePopulatedCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLsjatl.g:294:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalLsjatl.g:295:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalLsjatl.g:295:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalLsjatl.g:296:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPopulatedCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLsjatl.g:300:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalLsjatl.g:301:4: (lv_x_1_0= RULE_INT )
            {
            // InternalLsjatl.g:301:4: (lv_x_1_0= RULE_INT )
            // InternalLsjatl.g:302:5: lv_x_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPopulatedCellAccess().getCommaKeyword_2());
            		
            // InternalLsjatl.g:322:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalLsjatl.g:323:4: (lv_y_3_0= RULE_INT )
            {
            // InternalLsjatl.g:323:4: (lv_y_3_0= RULE_INT )
            // InternalLsjatl.g:324:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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
    // InternalLsjatl.g:348:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalLsjatl.g:348:46: (iv_ruleRules= ruleRules EOF )
            // InternalLsjatl.g:349:2: iv_ruleRules= ruleRules EOF
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
    // InternalLsjatl.g:355:1: ruleRules returns [EObject current=null] : ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:361:2: ( ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalLsjatl.g:362:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalLsjatl.g:362:2: ( () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )* )
            // InternalLsjatl.g:363:3: () otherlv_1= 'Rules' ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalLsjatl.g:363:3: ()
            // InternalLsjatl.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulesAccess().getRulesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getRulesKeyword_1());
            		
            // InternalLsjatl.g:374:3: ( (lv_rules_2_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLsjatl.g:375:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalLsjatl.g:375:4: (lv_rules_2_0= ruleRule )
            	    // InternalLsjatl.g:376:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
    // InternalLsjatl.g:397:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalLsjatl.g:397:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalLsjatl.g:398:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalLsjatl.g:404:1: ruleCondition returns [EObject current=null] : ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_NCount_1_0=null;
        AntlrDatatypeRuleToken lv_boolOp_0_0 = null;

        AntlrDatatypeRuleToken lv_separator_2_0 = null;



        	enterRule();

        try {
            // InternalLsjatl.g:410:2: ( ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? ) )
            // InternalLsjatl.g:411:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? )
            {
            // InternalLsjatl.g:411:2: ( ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )? )
            // InternalLsjatl.g:412:3: ( (lv_boolOp_0_0= ruleBoolOp ) ) ( (lv_NCount_1_0= RULE_INT ) ) ( (lv_separator_2_0= ruleSeparator ) )?
            {
            // InternalLsjatl.g:412:3: ( (lv_boolOp_0_0= ruleBoolOp ) )
            // InternalLsjatl.g:413:4: (lv_boolOp_0_0= ruleBoolOp )
            {
            // InternalLsjatl.g:413:4: (lv_boolOp_0_0= ruleBoolOp )
            // InternalLsjatl.g:414:5: lv_boolOp_0_0= ruleBoolOp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getBoolOpBoolOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalLsjatl.g:431:3: ( (lv_NCount_1_0= RULE_INT ) )
            // InternalLsjatl.g:432:4: (lv_NCount_1_0= RULE_INT )
            {
            // InternalLsjatl.g:432:4: (lv_NCount_1_0= RULE_INT )
            // InternalLsjatl.g:433:5: lv_NCount_1_0= RULE_INT
            {
            lv_NCount_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalLsjatl.g:449:3: ( (lv_separator_2_0= ruleSeparator ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=25)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLsjatl.g:450:4: (lv_separator_2_0= ruleSeparator )
                    {
                    // InternalLsjatl.g:450:4: (lv_separator_2_0= ruleSeparator )
                    // InternalLsjatl.g:451:5: lv_separator_2_0= ruleSeparator
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
    // InternalLsjatl.g:472:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalLsjatl.g:472:45: (iv_ruleRule= ruleRule EOF )
            // InternalLsjatl.g:473:2: iv_ruleRule= ruleRule EOF
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
    // InternalLsjatl.g:479:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) ;
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
            // InternalLsjatl.g:485:2: ( (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) ) )
            // InternalLsjatl.g:486:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            {
            // InternalLsjatl.g:486:2: (otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) ) )
            // InternalLsjatl.g:487:3: otherlv_0= 'Each' ( (lv_state_1_0= ruleState ) ) otherlv_2= 'cell' otherlv_3= 'with' ( (lv_conditions_4_0= ruleCondition ) )+ otherlv_5= 'neighbors' ( (lv_result_6_0= ruleOutcome ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getEachKeyword_0());
            		
            // InternalLsjatl.g:491:3: ( (lv_state_1_0= ruleState ) )
            // InternalLsjatl.g:492:4: (lv_state_1_0= ruleState )
            {
            // InternalLsjatl.g:492:4: (lv_state_1_0= ruleState )
            // InternalLsjatl.g:493:5: lv_state_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStateStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getCellKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWithKeyword_3());
            		
            // InternalLsjatl.g:518:3: ( (lv_conditions_4_0= ruleCondition ) )+
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
            	    // InternalLsjatl.g:519:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalLsjatl.g:519:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalLsjatl.g:520:5: lv_conditions_4_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
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

            otherlv_5=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getNeighborsKeyword_5());
            		
            // InternalLsjatl.g:541:3: ( (lv_result_6_0= ruleOutcome ) )
            // InternalLsjatl.g:542:4: (lv_result_6_0= ruleOutcome )
            {
            // InternalLsjatl.g:542:4: (lv_result_6_0= ruleOutcome )
            // InternalLsjatl.g:543:5: lv_result_6_0= ruleOutcome
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
    // InternalLsjatl.g:564:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // InternalLsjatl.g:564:49: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalLsjatl.g:565:2: iv_ruleSeparator= ruleSeparator EOF
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
    // InternalLsjatl.g:571:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:577:2: ( (kw= '&&' | kw= '||' ) )
            // InternalLsjatl.g:578:2: (kw= '&&' | kw= '||' )
            {
            // InternalLsjatl.g:578:2: (kw= '&&' | kw= '||' )
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
                    // InternalLsjatl.g:579:3: kw= '&&'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:585:3: kw= '||'
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
    // InternalLsjatl.g:594:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalLsjatl.g:594:45: (iv_ruleState= ruleState EOF )
            // InternalLsjatl.g:595:2: iv_ruleState= ruleState EOF
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
    // InternalLsjatl.g:601:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'living' | kw= 'dead' ) ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:607:2: ( (kw= 'living' | kw= 'dead' ) )
            // InternalLsjatl.g:608:2: (kw= 'living' | kw= 'dead' )
            {
            // InternalLsjatl.g:608:2: (kw= 'living' | kw= 'dead' )
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
                    // InternalLsjatl.g:609:3: kw= 'living'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStateAccess().getLivingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:615:3: kw= 'dead'
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
    // InternalLsjatl.g:624:1: entryRuleBoolOp returns [String current=null] : iv_ruleBoolOp= ruleBoolOp EOF ;
    public final String entryRuleBoolOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOp = null;


        try {
            // InternalLsjatl.g:624:46: (iv_ruleBoolOp= ruleBoolOp EOF )
            // InternalLsjatl.g:625:2: iv_ruleBoolOp= ruleBoolOp EOF
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
    // InternalLsjatl.g:631:1: ruleBoolOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:637:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' ) )
            // InternalLsjatl.g:638:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
            {
            // InternalLsjatl.g:638:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' )
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
                    // InternalLsjatl.g:639:3: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:645:3: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:651:3: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLsjatl.g:657:3: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOpAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLsjatl.g:663:3: kw= '=='
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
    // InternalLsjatl.g:672:1: entryRuleOutcome returns [String current=null] : iv_ruleOutcome= ruleOutcome EOF ;
    public final String entryRuleOutcome() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutcome = null;


        try {
            // InternalLsjatl.g:672:47: (iv_ruleOutcome= ruleOutcome EOF )
            // InternalLsjatl.g:673:2: iv_ruleOutcome= ruleOutcome EOF
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
    // InternalLsjatl.g:679:1: ruleOutcome returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'survives' | kw= 'dies' | kw= 'populates' ) ;
    public final AntlrDatatypeRuleToken ruleOutcome() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLsjatl.g:685:2: ( (kw= 'survives' | kw= 'dies' | kw= 'populates' ) )
            // InternalLsjatl.g:686:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
            {
            // InternalLsjatl.g:686:2: (kw= 'survives' | kw= 'dies' | kw= 'populates' )
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
                    // InternalLsjatl.g:687:3: kw= 'survives'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getSurvivesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLsjatl.g:693:3: kw= 'dies'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOutcomeAccess().getDiesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLsjatl.g:699:3: kw= 'populates'
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001F0800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000E00000000L});

}