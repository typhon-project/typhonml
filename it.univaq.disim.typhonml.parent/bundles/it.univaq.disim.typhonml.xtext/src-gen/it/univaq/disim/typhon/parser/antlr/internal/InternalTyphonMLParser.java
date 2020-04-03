package it.univaq.disim.typhon.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.disim.typhon.services.TyphonMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTyphonMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'changeOperators'", "'['", "','", "']'", "'true'", "'false'", "'int'", "'bigint'", "'string'", "'text'", "'point'", "'polygon'", "'bool'", "'float'", "'blob'", "'freetext'", "'date'", "'datetime'", "'customdatatype'", "'{'", "'}'", "'importedNamespace'", "':'", "'@functionalTags'", "'('", "')'", "'@nFunctionalTags'", "'entity'", "'->'", "'.'", "'table'", "'db'", "'node'", "'!'", "'column'", "'attributes'", "'index'", "'references'", "'idSpec'", "'relationaldb'", "'tables'", "'documentdb'", "'collections'", "'keyvaluedb'", "'elements'", "'graphdb'", "'nodes'", "'edges'", "'columndb'", "'columns'", "'edge'", "'from'", "'to'", "'labels'", "'='", "'AddCustomDataTypeAttribute'", "'ownerEntity'", "'type'", "'ChangePrimitiveDataTypeAttribute'", "'maxSize'", "'attributeToChange'", "'ChangeCustomDataTypeAttribute'", "'newType'", "'add'", "'relations'", "'rename'", "'as'", "'remove'", "'SplitEntity'", "'entityToBeSplit'", "'firstNewEntity'", "'secondNewEntity'", "'migrate'", "'split'", "'vertical'", "'attributes:'", "'horizontal'", "'where'", "'value'", "'merge'", "'entities'", "'attribute'", "'relation'", "'change'", "'containment'", "'cardinality'", "'EnableRelationContainment'", "'DisableRelationContainment'", "'EnableBidirectionalRelation'", "'DisableBidirectionalRelation'", "'extends'", "'tableindex'", "'reduce'", "'AddIndex'", "'DropIndex'", "'AddGraphAttribute'", "'AddGraphEdge'", "'RemoveGraphAttribute'", "'RemoveGraphEdge'", "'graphEdgeToRemove'", "'RenabeGraphEdgeLabel'", "'newName'", "'AddCollectionIndex'", "'collection'", "'DropCollectionIndex'", "'0..1'", "'1'", "'0..*'", "'*'", "'ParagraphSegmentation'", "'SentenceSegmentation'", "'Tokenisation'", "'PhraseExtractor'", "'NGramExtractor'", "'POSTagging'", "'Lemmatisation'", "'Stemming'", "'DependencyParsing'", "'Chunking'", "'SentimentAnalysis'", "'TextClassification'", "'TopicModelling'", "'TermExtraction'", "'NamedEntityRecognition'", "'RelationExtraction'", "'CoreferenceResolution'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalTyphonMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTyphonMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTyphonMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTyphonML.g"; }



     	private TyphonMLGrammarAccess grammarAccess;

        public InternalTyphonMLParser(TokenStream input, TyphonMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TyphonMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTyphonML.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTyphonML.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalTyphonML.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTyphonML.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_customDataTypes_1_0= ruleCustomDataType ) )* ( (lv_entities_2_0= ruleEntity ) )* ( (lv_databases_3_0= ruleDatabase ) )* (otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']' )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_customDataTypes_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_databases_3_0 = null;

        EObject lv_changeOperators_6_0 = null;

        EObject lv_changeOperators_8_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:78:2: ( ( () ( (lv_customDataTypes_1_0= ruleCustomDataType ) )* ( (lv_entities_2_0= ruleEntity ) )* ( (lv_databases_3_0= ruleDatabase ) )* (otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']' )? ) )
            // InternalTyphonML.g:79:2: ( () ( (lv_customDataTypes_1_0= ruleCustomDataType ) )* ( (lv_entities_2_0= ruleEntity ) )* ( (lv_databases_3_0= ruleDatabase ) )* (otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']' )? )
            {
            // InternalTyphonML.g:79:2: ( () ( (lv_customDataTypes_1_0= ruleCustomDataType ) )* ( (lv_entities_2_0= ruleEntity ) )* ( (lv_databases_3_0= ruleDatabase ) )* (otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']' )? )
            // InternalTyphonML.g:80:3: () ( (lv_customDataTypes_1_0= ruleCustomDataType ) )* ( (lv_entities_2_0= ruleEntity ) )* ( (lv_databases_3_0= ruleDatabase ) )* (otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']' )?
            {
            // InternalTyphonML.g:80:3: ()
            // InternalTyphonML.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:87:3: ( (lv_customDataTypes_1_0= ruleCustomDataType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTyphonML.g:88:4: (lv_customDataTypes_1_0= ruleCustomDataType )
            	    {
            	    // InternalTyphonML.g:88:4: (lv_customDataTypes_1_0= ruleCustomDataType )
            	    // InternalTyphonML.g:89:5: lv_customDataTypes_1_0= ruleCustomDataType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCustomDataTypesCustomDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_customDataTypes_1_0=ruleCustomDataType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customDataTypes",
            	    						lv_customDataTypes_1_0,
            	    						"it.univaq.disim.typhon.TyphonML.CustomDataType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTyphonML.g:106:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_STRING) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==38) ) {
                            alt2=1;
                        }


                    }
                    else if ( (LA2_1==RULE_ID) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==38) ) {
                            alt2=1;
                        }


                    }


                }
                else if ( (LA2_0==34||(LA2_0>=37 && LA2_0<=38)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTyphonML.g:107:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalTyphonML.g:107:4: (lv_entities_2_0= ruleEntity )
            	    // InternalTyphonML.g:108:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"it.univaq.disim.typhon.TyphonML.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTyphonML.g:125:3: ( (lv_databases_3_0= ruleDatabase ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32||LA3_0==50||LA3_0==52||LA3_0==54||LA3_0==56||LA3_0==59) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTyphonML.g:126:4: (lv_databases_3_0= ruleDatabase )
            	    {
            	    // InternalTyphonML.g:126:4: (lv_databases_3_0= ruleDatabase )
            	    // InternalTyphonML.g:127:5: lv_databases_3_0= ruleDatabase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDatabasesDatabaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_databases_3_0=ruleDatabase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"databases",
            	    						lv_databases_3_0,
            	    						"it.univaq.disim.typhon.TyphonML.Database");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTyphonML.g:144:3: (otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTyphonML.g:145:4: otherlv_4= 'changeOperators' otherlv_5= '[' ( (lv_changeOperators_6_0= ruleChangeOperator ) ) (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getChangeOperatorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalTyphonML.g:153:4: ( (lv_changeOperators_6_0= ruleChangeOperator ) )
                    // InternalTyphonML.g:154:5: (lv_changeOperators_6_0= ruleChangeOperator )
                    {
                    // InternalTyphonML.g:154:5: (lv_changeOperators_6_0= ruleChangeOperator )
                    // InternalTyphonML.g:155:6: lv_changeOperators_6_0= ruleChangeOperator
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getChangeOperatorsChangeOperatorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_changeOperators_6_0=ruleChangeOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"changeOperators",
                    							lv_changeOperators_6_0,
                    							"it.univaq.disim.typhon.TyphonML.ChangeOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:172:4: (otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTyphonML.g:173:5: otherlv_7= ',' ( (lv_changeOperators_8_0= ruleChangeOperator ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTyphonML.g:177:5: ( (lv_changeOperators_8_0= ruleChangeOperator ) )
                    	    // InternalTyphonML.g:178:6: (lv_changeOperators_8_0= ruleChangeOperator )
                    	    {
                    	    // InternalTyphonML.g:178:6: (lv_changeOperators_8_0= ruleChangeOperator )
                    	    // InternalTyphonML.g:179:7: lv_changeOperators_8_0= ruleChangeOperator
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getChangeOperatorsChangeOperatorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_changeOperators_8_0=ruleChangeOperator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"changeOperators",
                    	    								lv_changeOperators_8_0,
                    	    								"it.univaq.disim.typhon.TyphonML.ChangeOperator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightSquareBracketKeyword_4_4());
                    			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDataType"
    // InternalTyphonML.g:206:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTyphonML.g:206:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTyphonML.g:207:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalTyphonML.g:213:1: ruleDataType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_BigintType_1= ruleBigintType | this_StringType_2= ruleStringType | this_TextType_3= ruleTextType | this_PointType_4= rulePointType | this_PolygonType_5= rulePolygonType | this_BoolType_6= ruleBoolType | this_FloatType_7= ruleFloatType | this_BlobType_8= ruleBlobType | this_FreetextType_9= ruleFreetextType | this_DateType_10= ruleDateType | this_DatetimeType_11= ruleDatetimeType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_BigintType_1 = null;

        EObject this_StringType_2 = null;

        EObject this_TextType_3 = null;

        EObject this_PointType_4 = null;

        EObject this_PolygonType_5 = null;

        EObject this_BoolType_6 = null;

        EObject this_FloatType_7 = null;

        EObject this_BlobType_8 = null;

        EObject this_FreetextType_9 = null;

        EObject this_DateType_10 = null;

        EObject this_DatetimeType_11 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:219:2: ( (this_IntType_0= ruleIntType | this_BigintType_1= ruleBigintType | this_StringType_2= ruleStringType | this_TextType_3= ruleTextType | this_PointType_4= rulePointType | this_PolygonType_5= rulePolygonType | this_BoolType_6= ruleBoolType | this_FloatType_7= ruleFloatType | this_BlobType_8= ruleBlobType | this_FreetextType_9= ruleFreetextType | this_DateType_10= ruleDateType | this_DatetimeType_11= ruleDatetimeType ) )
            // InternalTyphonML.g:220:2: (this_IntType_0= ruleIntType | this_BigintType_1= ruleBigintType | this_StringType_2= ruleStringType | this_TextType_3= ruleTextType | this_PointType_4= rulePointType | this_PolygonType_5= rulePolygonType | this_BoolType_6= ruleBoolType | this_FloatType_7= ruleFloatType | this_BlobType_8= ruleBlobType | this_FreetextType_9= ruleFreetextType | this_DateType_10= ruleDateType | this_DatetimeType_11= ruleDatetimeType )
            {
            // InternalTyphonML.g:220:2: (this_IntType_0= ruleIntType | this_BigintType_1= ruleBigintType | this_StringType_2= ruleStringType | this_TextType_3= ruleTextType | this_PointType_4= rulePointType | this_PolygonType_5= rulePolygonType | this_BoolType_6= ruleBoolType | this_FloatType_7= ruleFloatType | this_BlobType_8= ruleBlobType | this_FreetextType_9= ruleFreetextType | this_DateType_10= ruleDateType | this_DatetimeType_11= ruleDatetimeType )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            case 24:
                {
                alt6=8;
                }
                break;
            case 25:
                {
                alt6=9;
                }
                break;
            case 26:
                {
                alt6=10;
                }
                break;
            case 27:
                {
                alt6=11;
                }
                break;
            case 28:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTyphonML.g:221:3: this_IntType_0= ruleIntType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getIntTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntType_0=ruleIntType();

                    state._fsp--;


                    			current = this_IntType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:230:3: this_BigintType_1= ruleBigintType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBigintTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BigintType_1=ruleBigintType();

                    state._fsp--;


                    			current = this_BigintType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:239:3: this_StringType_2= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_2=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:248:3: this_TextType_3= ruleTextType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getTextTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextType_3=ruleTextType();

                    state._fsp--;


                    			current = this_TextType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:257:3: this_PointType_4= rulePointType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getPointTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PointType_4=rulePointType();

                    state._fsp--;


                    			current = this_PointType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:266:3: this_PolygonType_5= rulePolygonType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getPolygonTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PolygonType_5=rulePolygonType();

                    state._fsp--;


                    			current = this_PolygonType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:275:3: this_BoolType_6= ruleBoolType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBoolTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolType_6=ruleBoolType();

                    state._fsp--;


                    			current = this_BoolType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:284:3: this_FloatType_7= ruleFloatType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getFloatTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatType_7=ruleFloatType();

                    state._fsp--;


                    			current = this_FloatType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:293:3: this_BlobType_8= ruleBlobType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBlobTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlobType_8=ruleBlobType();

                    state._fsp--;


                    			current = this_BlobType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:302:3: this_FreetextType_9= ruleFreetextType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getFreetextTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_FreetextType_9=ruleFreetextType();

                    state._fsp--;


                    			current = this_FreetextType_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:311:3: this_DateType_10= ruleDateType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getDateTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateType_10=ruleDateType();

                    state._fsp--;


                    			current = this_DateType_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:320:3: this_DatetimeType_11= ruleDatetimeType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getDatetimeTypeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatetimeType_11=ruleDatetimeType();

                    state._fsp--;


                    			current = this_DatetimeType_11;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalTyphonML.g:332:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalTyphonML.g:332:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalTyphonML.g:333:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getEBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanObject=ruleEBooleanObject();

            state._fsp--;

             current =iv_ruleEBooleanObject.getText(); 
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
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalTyphonML.g:339:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTyphonML.g:345:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTyphonML.g:346:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTyphonML.g:346:2: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTyphonML.g:347:3: kw= 'true'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:353:3: kw= 'false'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleEString"
    // InternalTyphonML.g:362:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:362:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:363:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTyphonML.g:369:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:375:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:376:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:376:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:377:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:385:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalTyphonML.g:396:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTyphonML.g:396:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTyphonML.g:397:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTyphonML.g:403:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalTyphonML.g:409:2: (this_INT_0= RULE_INT )
            // InternalTyphonML.g:410:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIntType"
    // InternalTyphonML.g:420:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalTyphonML.g:420:48: (iv_ruleIntType= ruleIntType EOF )
            // InternalTyphonML.g:421:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // InternalTyphonML.g:427:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:433:2: ( ( () otherlv_1= 'int' ) )
            // InternalTyphonML.g:434:2: ( () otherlv_1= 'int' )
            {
            // InternalTyphonML.g:434:2: ( () otherlv_1= 'int' )
            // InternalTyphonML.g:435:3: () otherlv_1= 'int'
            {
            // InternalTyphonML.g:435:3: ()
            // InternalTyphonML.g:436:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
            		

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleBigintType"
    // InternalTyphonML.g:450:1: entryRuleBigintType returns [EObject current=null] : iv_ruleBigintType= ruleBigintType EOF ;
    public final EObject entryRuleBigintType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigintType = null;


        try {
            // InternalTyphonML.g:450:51: (iv_ruleBigintType= ruleBigintType EOF )
            // InternalTyphonML.g:451:2: iv_ruleBigintType= ruleBigintType EOF
            {
             newCompositeNode(grammarAccess.getBigintTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigintType=ruleBigintType();

            state._fsp--;

             current =iv_ruleBigintType; 
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
    // $ANTLR end "entryRuleBigintType"


    // $ANTLR start "ruleBigintType"
    // InternalTyphonML.g:457:1: ruleBigintType returns [EObject current=null] : ( () otherlv_1= 'bigint' ) ;
    public final EObject ruleBigintType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:463:2: ( ( () otherlv_1= 'bigint' ) )
            // InternalTyphonML.g:464:2: ( () otherlv_1= 'bigint' )
            {
            // InternalTyphonML.g:464:2: ( () otherlv_1= 'bigint' )
            // InternalTyphonML.g:465:3: () otherlv_1= 'bigint'
            {
            // InternalTyphonML.g:465:3: ()
            // InternalTyphonML.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBigintTypeAccess().getBigintTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBigintTypeAccess().getBigintKeyword_1());
            		

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
    // $ANTLR end "ruleBigintType"


    // $ANTLR start "entryRuleStringType"
    // InternalTyphonML.g:480:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalTyphonML.g:480:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalTyphonML.g:481:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalTyphonML.g:487:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' (otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxSize_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:493:2: ( ( () otherlv_1= 'string' (otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']' )? ) )
            // InternalTyphonML.g:494:2: ( () otherlv_1= 'string' (otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']' )? )
            {
            // InternalTyphonML.g:494:2: ( () otherlv_1= 'string' (otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']' )? )
            // InternalTyphonML.g:495:3: () otherlv_1= 'string' (otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']' )?
            {
            // InternalTyphonML.g:495:3: ()
            // InternalTyphonML.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
            		
            // InternalTyphonML.g:506:3: (otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:507:4: otherlv_2= '[' ( (lv_maxSize_3_0= ruleEInt ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalTyphonML.g:511:4: ( (lv_maxSize_3_0= ruleEInt ) )
                    // InternalTyphonML.g:512:5: (lv_maxSize_3_0= ruleEInt )
                    {
                    // InternalTyphonML.g:512:5: (lv_maxSize_3_0= ruleEInt )
                    // InternalTyphonML.g:513:6: lv_maxSize_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxSizeEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_maxSize_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"maxSize",
                    							lv_maxSize_3_0,
                    							"it.univaq.disim.typhon.TyphonML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleTextType"
    // InternalTyphonML.g:539:1: entryRuleTextType returns [EObject current=null] : iv_ruleTextType= ruleTextType EOF ;
    public final EObject entryRuleTextType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextType = null;


        try {
            // InternalTyphonML.g:539:49: (iv_ruleTextType= ruleTextType EOF )
            // InternalTyphonML.g:540:2: iv_ruleTextType= ruleTextType EOF
            {
             newCompositeNode(grammarAccess.getTextTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextType=ruleTextType();

            state._fsp--;

             current =iv_ruleTextType; 
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
    // $ANTLR end "entryRuleTextType"


    // $ANTLR start "ruleTextType"
    // InternalTyphonML.g:546:1: ruleTextType returns [EObject current=null] : ( () otherlv_1= 'text' ) ;
    public final EObject ruleTextType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:552:2: ( ( () otherlv_1= 'text' ) )
            // InternalTyphonML.g:553:2: ( () otherlv_1= 'text' )
            {
            // InternalTyphonML.g:553:2: ( () otherlv_1= 'text' )
            // InternalTyphonML.g:554:3: () otherlv_1= 'text'
            {
            // InternalTyphonML.g:554:3: ()
            // InternalTyphonML.g:555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextTypeAccess().getTextTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTextTypeAccess().getTextKeyword_1());
            		

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
    // $ANTLR end "ruleTextType"


    // $ANTLR start "entryRulePointType"
    // InternalTyphonML.g:569:1: entryRulePointType returns [EObject current=null] : iv_rulePointType= rulePointType EOF ;
    public final EObject entryRulePointType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointType = null;


        try {
            // InternalTyphonML.g:569:50: (iv_rulePointType= rulePointType EOF )
            // InternalTyphonML.g:570:2: iv_rulePointType= rulePointType EOF
            {
             newCompositeNode(grammarAccess.getPointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointType=rulePointType();

            state._fsp--;

             current =iv_rulePointType; 
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
    // $ANTLR end "entryRulePointType"


    // $ANTLR start "rulePointType"
    // InternalTyphonML.g:576:1: rulePointType returns [EObject current=null] : ( () otherlv_1= 'point' ) ;
    public final EObject rulePointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:582:2: ( ( () otherlv_1= 'point' ) )
            // InternalTyphonML.g:583:2: ( () otherlv_1= 'point' )
            {
            // InternalTyphonML.g:583:2: ( () otherlv_1= 'point' )
            // InternalTyphonML.g:584:3: () otherlv_1= 'point'
            {
            // InternalTyphonML.g:584:3: ()
            // InternalTyphonML.g:585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointTypeAccess().getPointTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPointTypeAccess().getPointKeyword_1());
            		

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
    // $ANTLR end "rulePointType"


    // $ANTLR start "entryRulePolygonType"
    // InternalTyphonML.g:599:1: entryRulePolygonType returns [EObject current=null] : iv_rulePolygonType= rulePolygonType EOF ;
    public final EObject entryRulePolygonType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygonType = null;


        try {
            // InternalTyphonML.g:599:52: (iv_rulePolygonType= rulePolygonType EOF )
            // InternalTyphonML.g:600:2: iv_rulePolygonType= rulePolygonType EOF
            {
             newCompositeNode(grammarAccess.getPolygonTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolygonType=rulePolygonType();

            state._fsp--;

             current =iv_rulePolygonType; 
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
    // $ANTLR end "entryRulePolygonType"


    // $ANTLR start "rulePolygonType"
    // InternalTyphonML.g:606:1: rulePolygonType returns [EObject current=null] : ( () otherlv_1= 'polygon' ) ;
    public final EObject rulePolygonType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:612:2: ( ( () otherlv_1= 'polygon' ) )
            // InternalTyphonML.g:613:2: ( () otherlv_1= 'polygon' )
            {
            // InternalTyphonML.g:613:2: ( () otherlv_1= 'polygon' )
            // InternalTyphonML.g:614:3: () otherlv_1= 'polygon'
            {
            // InternalTyphonML.g:614:3: ()
            // InternalTyphonML.g:615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolygonTypeAccess().getPolygonTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPolygonTypeAccess().getPolygonKeyword_1());
            		

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
    // $ANTLR end "rulePolygonType"


    // $ANTLR start "entryRuleBoolType"
    // InternalTyphonML.g:629:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // InternalTyphonML.g:629:49: (iv_ruleBoolType= ruleBoolType EOF )
            // InternalTyphonML.g:630:2: iv_ruleBoolType= ruleBoolType EOF
            {
             newCompositeNode(grammarAccess.getBoolTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolType=ruleBoolType();

            state._fsp--;

             current =iv_ruleBoolType; 
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
    // $ANTLR end "entryRuleBoolType"


    // $ANTLR start "ruleBoolType"
    // InternalTyphonML.g:636:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:642:2: ( ( () otherlv_1= 'bool' ) )
            // InternalTyphonML.g:643:2: ( () otherlv_1= 'bool' )
            {
            // InternalTyphonML.g:643:2: ( () otherlv_1= 'bool' )
            // InternalTyphonML.g:644:3: () otherlv_1= 'bool'
            {
            // InternalTyphonML.g:644:3: ()
            // InternalTyphonML.g:645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolTypeAccess().getBoolKeyword_1());
            		

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
    // $ANTLR end "ruleBoolType"


    // $ANTLR start "entryRuleFloatType"
    // InternalTyphonML.g:659:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalTyphonML.g:659:50: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalTyphonML.g:660:2: iv_ruleFloatType= ruleFloatType EOF
            {
             newCompositeNode(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;

             current =iv_ruleFloatType; 
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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // InternalTyphonML.g:666:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:672:2: ( ( () otherlv_1= 'float' ) )
            // InternalTyphonML.g:673:2: ( () otherlv_1= 'float' )
            {
            // InternalTyphonML.g:673:2: ( () otherlv_1= 'float' )
            // InternalTyphonML.g:674:3: () otherlv_1= 'float'
            {
            // InternalTyphonML.g:674:3: ()
            // InternalTyphonML.g:675:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getFloatKeyword_1());
            		

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
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleBlobType"
    // InternalTyphonML.g:689:1: entryRuleBlobType returns [EObject current=null] : iv_ruleBlobType= ruleBlobType EOF ;
    public final EObject entryRuleBlobType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlobType = null;


        try {
            // InternalTyphonML.g:689:49: (iv_ruleBlobType= ruleBlobType EOF )
            // InternalTyphonML.g:690:2: iv_ruleBlobType= ruleBlobType EOF
            {
             newCompositeNode(grammarAccess.getBlobTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlobType=ruleBlobType();

            state._fsp--;

             current =iv_ruleBlobType; 
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
    // $ANTLR end "entryRuleBlobType"


    // $ANTLR start "ruleBlobType"
    // InternalTyphonML.g:696:1: ruleBlobType returns [EObject current=null] : ( () otherlv_1= 'blob' ) ;
    public final EObject ruleBlobType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:702:2: ( ( () otherlv_1= 'blob' ) )
            // InternalTyphonML.g:703:2: ( () otherlv_1= 'blob' )
            {
            // InternalTyphonML.g:703:2: ( () otherlv_1= 'blob' )
            // InternalTyphonML.g:704:3: () otherlv_1= 'blob'
            {
            // InternalTyphonML.g:704:3: ()
            // InternalTyphonML.g:705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlobTypeAccess().getBlobTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBlobTypeAccess().getBlobKeyword_1());
            		

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
    // $ANTLR end "ruleBlobType"


    // $ANTLR start "entryRuleFreetextType"
    // InternalTyphonML.g:719:1: entryRuleFreetextType returns [EObject current=null] : iv_ruleFreetextType= ruleFreetextType EOF ;
    public final EObject entryRuleFreetextType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreetextType = null;


        try {
            // InternalTyphonML.g:719:53: (iv_ruleFreetextType= ruleFreetextType EOF )
            // InternalTyphonML.g:720:2: iv_ruleFreetextType= ruleFreetextType EOF
            {
             newCompositeNode(grammarAccess.getFreetextTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreetextType=ruleFreetextType();

            state._fsp--;

             current =iv_ruleFreetextType; 
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
    // $ANTLR end "entryRuleFreetextType"


    // $ANTLR start "ruleFreetextType"
    // InternalTyphonML.g:726:1: ruleFreetextType returns [EObject current=null] : ( () otherlv_1= 'freetext' (otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']' )? ) ;
    public final EObject ruleFreetextType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tasks_3_0 = null;

        EObject lv_tasks_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:732:2: ( ( () otherlv_1= 'freetext' (otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']' )? ) )
            // InternalTyphonML.g:733:2: ( () otherlv_1= 'freetext' (otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']' )? )
            {
            // InternalTyphonML.g:733:2: ( () otherlv_1= 'freetext' (otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']' )? )
            // InternalTyphonML.g:734:3: () otherlv_1= 'freetext' (otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']' )?
            {
            // InternalTyphonML.g:734:3: ()
            // InternalTyphonML.g:735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreetextTypeAccess().getFreetextTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFreetextTypeAccess().getFreetextKeyword_1());
            		
            // InternalTyphonML.g:745:3: (otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTyphonML.g:746:4: otherlv_2= '[' ( (lv_tasks_3_0= ruleNlpTask ) ) (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getFreetextTypeAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalTyphonML.g:750:4: ( (lv_tasks_3_0= ruleNlpTask ) )
                    // InternalTyphonML.g:751:5: (lv_tasks_3_0= ruleNlpTask )
                    {
                    // InternalTyphonML.g:751:5: (lv_tasks_3_0= ruleNlpTask )
                    // InternalTyphonML.g:752:6: lv_tasks_3_0= ruleNlpTask
                    {

                    						newCompositeNode(grammarAccess.getFreetextTypeAccess().getTasksNlpTaskParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_tasks_3_0=ruleNlpTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFreetextTypeRule());
                    						}
                    						add(
                    							current,
                    							"tasks",
                    							lv_tasks_3_0,
                    							"it.univaq.disim.typhon.TyphonML.NlpTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:769:4: (otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTyphonML.g:770:5: otherlv_4= ',' ( (lv_tasks_5_0= ruleNlpTask ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFreetextTypeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTyphonML.g:774:5: ( (lv_tasks_5_0= ruleNlpTask ) )
                    	    // InternalTyphonML.g:775:6: (lv_tasks_5_0= ruleNlpTask )
                    	    {
                    	    // InternalTyphonML.g:775:6: (lv_tasks_5_0= ruleNlpTask )
                    	    // InternalTyphonML.g:776:7: lv_tasks_5_0= ruleNlpTask
                    	    {

                    	    							newCompositeNode(grammarAccess.getFreetextTypeAccess().getTasksNlpTaskParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_tasks_5_0=ruleNlpTask();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFreetextTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tasks",
                    	    								lv_tasks_5_0,
                    	    								"it.univaq.disim.typhon.TyphonML.NlpTask");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFreetextTypeAccess().getRightSquareBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleFreetextType"


    // $ANTLR start "entryRuleDateType"
    // InternalTyphonML.g:803:1: entryRuleDateType returns [EObject current=null] : iv_ruleDateType= ruleDateType EOF ;
    public final EObject entryRuleDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateType = null;


        try {
            // InternalTyphonML.g:803:49: (iv_ruleDateType= ruleDateType EOF )
            // InternalTyphonML.g:804:2: iv_ruleDateType= ruleDateType EOF
            {
             newCompositeNode(grammarAccess.getDateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateType=ruleDateType();

            state._fsp--;

             current =iv_ruleDateType; 
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
    // $ANTLR end "entryRuleDateType"


    // $ANTLR start "ruleDateType"
    // InternalTyphonML.g:810:1: ruleDateType returns [EObject current=null] : ( () otherlv_1= 'date' ) ;
    public final EObject ruleDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:816:2: ( ( () otherlv_1= 'date' ) )
            // InternalTyphonML.g:817:2: ( () otherlv_1= 'date' )
            {
            // InternalTyphonML.g:817:2: ( () otherlv_1= 'date' )
            // InternalTyphonML.g:818:3: () otherlv_1= 'date'
            {
            // InternalTyphonML.g:818:3: ()
            // InternalTyphonML.g:819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateTypeAccess().getDateTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDateTypeAccess().getDateKeyword_1());
            		

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
    // $ANTLR end "ruleDateType"


    // $ANTLR start "entryRuleDatetimeType"
    // InternalTyphonML.g:833:1: entryRuleDatetimeType returns [EObject current=null] : iv_ruleDatetimeType= ruleDatetimeType EOF ;
    public final EObject entryRuleDatetimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatetimeType = null;


        try {
            // InternalTyphonML.g:833:53: (iv_ruleDatetimeType= ruleDatetimeType EOF )
            // InternalTyphonML.g:834:2: iv_ruleDatetimeType= ruleDatetimeType EOF
            {
             newCompositeNode(grammarAccess.getDatetimeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatetimeType=ruleDatetimeType();

            state._fsp--;

             current =iv_ruleDatetimeType; 
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
    // $ANTLR end "entryRuleDatetimeType"


    // $ANTLR start "ruleDatetimeType"
    // InternalTyphonML.g:840:1: ruleDatetimeType returns [EObject current=null] : ( () otherlv_1= 'datetime' ) ;
    public final EObject ruleDatetimeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:846:2: ( ( () otherlv_1= 'datetime' ) )
            // InternalTyphonML.g:847:2: ( () otherlv_1= 'datetime' )
            {
            // InternalTyphonML.g:847:2: ( () otherlv_1= 'datetime' )
            // InternalTyphonML.g:848:3: () otherlv_1= 'datetime'
            {
            // InternalTyphonML.g:848:3: ()
            // InternalTyphonML.g:849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatetimeTypeAccess().getDatetimeTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDatetimeTypeAccess().getDatetimeKeyword_1());
            		

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
    // $ANTLR end "ruleDatetimeType"


    // $ANTLR start "entryRuleNlpTask"
    // InternalTyphonML.g:863:1: entryRuleNlpTask returns [EObject current=null] : iv_ruleNlpTask= ruleNlpTask EOF ;
    public final EObject entryRuleNlpTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNlpTask = null;


        try {
            // InternalTyphonML.g:863:48: (iv_ruleNlpTask= ruleNlpTask EOF )
            // InternalTyphonML.g:864:2: iv_ruleNlpTask= ruleNlpTask EOF
            {
             newCompositeNode(grammarAccess.getNlpTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNlpTask=ruleNlpTask();

            state._fsp--;

             current =iv_ruleNlpTask; 
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
    // $ANTLR end "entryRuleNlpTask"


    // $ANTLR start "ruleNlpTask"
    // InternalTyphonML.g:870:1: ruleNlpTask returns [EObject current=null] : ( () ( (lv_type_1_0= ruleNlpTaskType ) ) otherlv_2= '[' ( (lv_workflowName_3_0= ruleEString ) ) otherlv_4= ']' ) ;
    public final EObject ruleNlpTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_workflowName_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:876:2: ( ( () ( (lv_type_1_0= ruleNlpTaskType ) ) otherlv_2= '[' ( (lv_workflowName_3_0= ruleEString ) ) otherlv_4= ']' ) )
            // InternalTyphonML.g:877:2: ( () ( (lv_type_1_0= ruleNlpTaskType ) ) otherlv_2= '[' ( (lv_workflowName_3_0= ruleEString ) ) otherlv_4= ']' )
            {
            // InternalTyphonML.g:877:2: ( () ( (lv_type_1_0= ruleNlpTaskType ) ) otherlv_2= '[' ( (lv_workflowName_3_0= ruleEString ) ) otherlv_4= ']' )
            // InternalTyphonML.g:878:3: () ( (lv_type_1_0= ruleNlpTaskType ) ) otherlv_2= '[' ( (lv_workflowName_3_0= ruleEString ) ) otherlv_4= ']'
            {
            // InternalTyphonML.g:878:3: ()
            // InternalTyphonML.g:879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNlpTaskAccess().getNlpTaskAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:885:3: ( (lv_type_1_0= ruleNlpTaskType ) )
            // InternalTyphonML.g:886:4: (lv_type_1_0= ruleNlpTaskType )
            {
            // InternalTyphonML.g:886:4: (lv_type_1_0= ruleNlpTaskType )
            // InternalTyphonML.g:887:5: lv_type_1_0= ruleNlpTaskType
            {

            					newCompositeNode(grammarAccess.getNlpTaskAccess().getTypeNlpTaskTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_1_0=ruleNlpTaskType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNlpTaskRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"it.univaq.disim.typhon.TyphonML.NlpTaskType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNlpTaskAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalTyphonML.g:908:3: ( (lv_workflowName_3_0= ruleEString ) )
            // InternalTyphonML.g:909:4: (lv_workflowName_3_0= ruleEString )
            {
            // InternalTyphonML.g:909:4: (lv_workflowName_3_0= ruleEString )
            // InternalTyphonML.g:910:5: lv_workflowName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNlpTaskAccess().getWorkflowNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_workflowName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNlpTaskRule());
            					}
            					set(
            						current,
            						"workflowName",
            						lv_workflowName_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNlpTaskAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNlpTask"


    // $ANTLR start "entryRuleSuperDataType"
    // InternalTyphonML.g:935:1: entryRuleSuperDataType returns [EObject current=null] : iv_ruleSuperDataType= ruleSuperDataType EOF ;
    public final EObject entryRuleSuperDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperDataType = null;


        try {
            // InternalTyphonML.g:935:54: (iv_ruleSuperDataType= ruleSuperDataType EOF )
            // InternalTyphonML.g:936:2: iv_ruleSuperDataType= ruleSuperDataType EOF
            {
             newCompositeNode(grammarAccess.getSuperDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperDataType=ruleSuperDataType();

            state._fsp--;

             current =iv_ruleSuperDataType; 
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
    // $ANTLR end "entryRuleSuperDataType"


    // $ANTLR start "ruleSuperDataType"
    // InternalTyphonML.g:942:1: ruleSuperDataType returns [EObject current=null] : (this_ComplexDataType_0= ruleComplexDataType | this_SimpleDataType_1= ruleSimpleDataType ) ;
    public final EObject ruleSuperDataType() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexDataType_0 = null;

        EObject this_SimpleDataType_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:948:2: ( (this_ComplexDataType_0= ruleComplexDataType | this_SimpleDataType_1= ruleSimpleDataType ) )
            // InternalTyphonML.g:949:2: (this_ComplexDataType_0= ruleComplexDataType | this_SimpleDataType_1= ruleSimpleDataType )
            {
            // InternalTyphonML.g:949:2: (this_ComplexDataType_0= ruleComplexDataType | this_SimpleDataType_1= ruleSimpleDataType )
            int alt12=2;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==33) ) {
                    int LA12_4 = input.LA(3);

                    if ( ((LA12_4>=17 && LA12_4<=28)) ) {
                        alt12=2;
                    }
                    else if ( ((LA12_4>=RULE_STRING && LA12_4<=RULE_ID)) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==33) ) {
                    int LA12_4 = input.LA(3);

                    if ( ((LA12_4>=17 && LA12_4<=28)) ) {
                        alt12=2;
                    }
                    else if ( ((LA12_4>=RULE_STRING && LA12_4<=RULE_ID)) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTyphonML.g:950:3: this_ComplexDataType_0= ruleComplexDataType
                    {

                    			newCompositeNode(grammarAccess.getSuperDataTypeAccess().getComplexDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexDataType_0=ruleComplexDataType();

                    state._fsp--;


                    			current = this_ComplexDataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:959:3: this_SimpleDataType_1= ruleSimpleDataType
                    {

                    			newCompositeNode(grammarAccess.getSuperDataTypeAccess().getSimpleDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleDataType_1=ruleSimpleDataType();

                    state._fsp--;


                    			current = this_SimpleDataType_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSuperDataType"


    // $ANTLR start "entryRuleCustomDataType"
    // InternalTyphonML.g:971:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:971:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:972:2: iv_ruleCustomDataType= ruleCustomDataType EOF
            {
             newCompositeNode(grammarAccess.getCustomDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomDataType=ruleCustomDataType();

            state._fsp--;

             current =iv_ruleCustomDataType; 
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
    // $ANTLR end "entryRuleCustomDataType"


    // $ANTLR start "ruleCustomDataType"
    // InternalTyphonML.g:978:1: ruleCustomDataType returns [EObject current=null] : ( () otherlv_1= 'customdatatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']' )? ( ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleCustomDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_implementation_5_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:984:2: ( ( () otherlv_1= 'customdatatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']' )? ( ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )* )? otherlv_10= '}' ) )
            // InternalTyphonML.g:985:2: ( () otherlv_1= 'customdatatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']' )? ( ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )* )? otherlv_10= '}' )
            {
            // InternalTyphonML.g:985:2: ( () otherlv_1= 'customdatatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']' )? ( ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )* )? otherlv_10= '}' )
            // InternalTyphonML.g:986:3: () otherlv_1= 'customdatatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']' )? ( ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )* )? otherlv_10= '}'
            {
            // InternalTyphonML.g:986:3: ()
            // InternalTyphonML.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getCustomdatatypeKeyword_1());
            		
            // InternalTyphonML.g:997:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:998:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:998:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:999:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDataTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:1020:3: (otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTyphonML.g:1021:4: otherlv_4= '[' ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomDataTypeAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalTyphonML.g:1025:4: ( (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage ) )
                    // InternalTyphonML.g:1026:5: (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage )
                    {
                    // InternalTyphonML.g:1026:5: (lv_implementation_5_0= ruleCustomDataTypeImplementationPackage )
                    // InternalTyphonML.g:1027:6: lv_implementation_5_0= ruleCustomDataTypeImplementationPackage
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getImplementationCustomDataTypeImplementationPackageParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_implementation_5_0=ruleCustomDataTypeImplementationPackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"implementation",
                    							lv_implementation_5_0,
                    							"it.univaq.disim.typhon.TyphonML.CustomDataTypeImplementationPackage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomDataTypeAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:1049:3: ( ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTyphonML.g:1050:4: ( (lv_elements_7_0= ruleSuperDataType ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )*
                    {
                    // InternalTyphonML.g:1050:4: ( (lv_elements_7_0= ruleSuperDataType ) )
                    // InternalTyphonML.g:1051:5: (lv_elements_7_0= ruleSuperDataType )
                    {
                    // InternalTyphonML.g:1051:5: (lv_elements_7_0= ruleSuperDataType )
                    // InternalTyphonML.g:1052:6: lv_elements_7_0= ruleSuperDataType
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsSuperDataTypeParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_elements_7_0=ruleSuperDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_7_0,
                    							"it.univaq.disim.typhon.TyphonML.SuperDataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1069:4: (otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTyphonML.g:1070:5: otherlv_8= ',' ( (lv_elements_9_0= ruleSuperDataType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_18); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCustomDataTypeAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalTyphonML.g:1074:5: ( (lv_elements_9_0= ruleSuperDataType ) )
                    	    // InternalTyphonML.g:1075:6: (lv_elements_9_0= ruleSuperDataType )
                    	    {
                    	    // InternalTyphonML.g:1075:6: (lv_elements_9_0= ruleSuperDataType )
                    	    // InternalTyphonML.g:1076:7: lv_elements_9_0= ruleSuperDataType
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsSuperDataTypeParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_elements_9_0=ruleSuperDataType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_9_0,
                    	    								"it.univaq.disim.typhon.TyphonML.SuperDataType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCustomDataType"


    // $ANTLR start "entryRuleComplexDataType"
    // InternalTyphonML.g:1103:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // InternalTyphonML.g:1103:56: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // InternalTyphonML.g:1104:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
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
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // InternalTyphonML.g:1110:1: ruleComplexDataType returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1116:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1117:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1117:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1118:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:1118:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTyphonML.g:1119:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getComplexDataTypeAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1123:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1124:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1124:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1125:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComplexDataTypeAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1143:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1144:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1144:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1145:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexDataTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexDataTypeAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1166:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1167:4: ( ruleEString )
            {
            // InternalTyphonML.g:1167:4: ( ruleEString )
            // InternalTyphonML.g:1168:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexDataTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplexDataTypeAccess().getTypeCustomDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleSimpleDataType"
    // InternalTyphonML.g:1186:1: entryRuleSimpleDataType returns [EObject current=null] : iv_ruleSimpleDataType= ruleSimpleDataType EOF ;
    public final EObject entryRuleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDataType = null;


        try {
            // InternalTyphonML.g:1186:55: (iv_ruleSimpleDataType= ruleSimpleDataType EOF )
            // InternalTyphonML.g:1187:2: iv_ruleSimpleDataType= ruleSimpleDataType EOF
            {
             newCompositeNode(grammarAccess.getSimpleDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleDataType=ruleSimpleDataType();

            state._fsp--;

             current =iv_ruleSimpleDataType; 
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
    // $ANTLR end "entryRuleSimpleDataType"


    // $ANTLR start "ruleSimpleDataType"
    // InternalTyphonML.g:1193:1: ruleSimpleDataType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleSimpleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1199:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalTyphonML.g:1200:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalTyphonML.g:1200:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            // InternalTyphonML.g:1201:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) )
            {
            // InternalTyphonML.g:1201:3: ()
            // InternalTyphonML.g:1202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleDataTypeAccess().getSimpleDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1208:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1209:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1209:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1210:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleDataTypeAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1231:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalTyphonML.g:1232:4: (lv_type_3_0= ruleDataType )
            {
            // InternalTyphonML.g:1232:4: (lv_type_3_0= ruleDataType )
            // InternalTyphonML.g:1233:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getTypeDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleDataTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"it.univaq.disim.typhon.TyphonML.DataType");
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
    // $ANTLR end "ruleSimpleDataType"


    // $ANTLR start "entryRuleCustomDataTypeImplementationPackage"
    // InternalTyphonML.g:1254:1: entryRuleCustomDataTypeImplementationPackage returns [EObject current=null] : iv_ruleCustomDataTypeImplementationPackage= ruleCustomDataTypeImplementationPackage EOF ;
    public final EObject entryRuleCustomDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataTypeImplementationPackage = null;


        try {
            // InternalTyphonML.g:1254:76: (iv_ruleCustomDataTypeImplementationPackage= ruleCustomDataTypeImplementationPackage EOF )
            // InternalTyphonML.g:1255:2: iv_ruleCustomDataTypeImplementationPackage= ruleCustomDataTypeImplementationPackage EOF
            {
             newCompositeNode(grammarAccess.getCustomDataTypeImplementationPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomDataTypeImplementationPackage=ruleCustomDataTypeImplementationPackage();

            state._fsp--;

             current =iv_ruleCustomDataTypeImplementationPackage; 
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
    // $ANTLR end "entryRuleCustomDataTypeImplementationPackage"


    // $ANTLR start "ruleCustomDataTypeImplementationPackage"
    // InternalTyphonML.g:1261:1: ruleCustomDataTypeImplementationPackage returns [EObject current=null] : ( () ( (lv_location_1_0= ruleEString ) ) ) ;
    public final EObject ruleCustomDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_location_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1267:2: ( ( () ( (lv_location_1_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1268:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1268:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            // InternalTyphonML.g:1269:3: () ( (lv_location_1_0= ruleEString ) )
            {
            // InternalTyphonML.g:1269:3: ()
            // InternalTyphonML.g:1270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeImplementationPackageAccess().getCustomDataTypeImplementationPackageAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1276:3: ( (lv_location_1_0= ruleEString ) )
            // InternalTyphonML.g:1277:4: (lv_location_1_0= ruleEString )
            {
            // InternalTyphonML.g:1277:4: (lv_location_1_0= ruleEString )
            // InternalTyphonML.g:1278:5: lv_location_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDataTypeImplementationPackageAccess().getLocationEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDataTypeImplementationPackageRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleCustomDataTypeImplementationPackage"


    // $ANTLR start "entryRuleEntity"
    // InternalTyphonML.g:1299:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalTyphonML.g:1299:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalTyphonML.g:1300:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalTyphonML.g:1306:1: ruleEntity returns [EObject current=null] : this_Entity_Impl_0= ruleEntity_Impl ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_Impl_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1312:2: (this_Entity_Impl_0= ruleEntity_Impl )
            // InternalTyphonML.g:1313:2: this_Entity_Impl_0= ruleEntity_Impl
            {

            		newCompositeNode(grammarAccess.getEntityAccess().getEntity_ImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Entity_Impl_0=ruleEntity_Impl();

            state._fsp--;


            		current = this_Entity_Impl_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntity_Impl"
    // InternalTyphonML.g:1324:1: entryRuleEntity_Impl returns [EObject current=null] : iv_ruleEntity_Impl= ruleEntity_Impl EOF ;
    public final EObject entryRuleEntity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Impl = null;


        try {
            // InternalTyphonML.g:1324:52: (iv_ruleEntity_Impl= ruleEntity_Impl EOF )
            // InternalTyphonML.g:1325:2: iv_ruleEntity_Impl= ruleEntity_Impl EOF
            {
             newCompositeNode(grammarAccess.getEntity_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity_Impl=ruleEntity_Impl();

            state._fsp--;

             current =iv_ruleEntity_Impl; 
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
    // $ANTLR end "entryRuleEntity_Impl"


    // $ANTLR start "ruleEntity_Impl"
    // InternalTyphonML.g:1331:1: ruleEntity_Impl returns [EObject current=null] : ( (otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')' )? (otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')' )? (otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) ) )? otherlv_14= 'entity' ( (lv_name_15_0= ruleEString ) ) otherlv_16= '{' ( ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )* )? ( ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )* )? otherlv_21= '}' ) ;
    public final EObject ruleEntity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_21=null;
        EObject lv_functionalTags_2_0 = null;

        EObject lv_functionalTags_4_0 = null;

        EObject lv_nfunctionalTags_8_0 = null;

        EObject lv_nfunctionalTags_10_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_attributes_17_0 = null;

        EObject lv_attributes_18_0 = null;

        EObject lv_relations_19_0 = null;

        EObject lv_relations_20_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1337:2: ( ( (otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')' )? (otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')' )? (otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) ) )? otherlv_14= 'entity' ( (lv_name_15_0= ruleEString ) ) otherlv_16= '{' ( ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )* )? ( ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )* )? otherlv_21= '}' ) )
            // InternalTyphonML.g:1338:2: ( (otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')' )? (otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')' )? (otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) ) )? otherlv_14= 'entity' ( (lv_name_15_0= ruleEString ) ) otherlv_16= '{' ( ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )* )? ( ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )* )? otherlv_21= '}' )
            {
            // InternalTyphonML.g:1338:2: ( (otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')' )? (otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')' )? (otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) ) )? otherlv_14= 'entity' ( (lv_name_15_0= ruleEString ) ) otherlv_16= '{' ( ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )* )? ( ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )* )? otherlv_21= '}' )
            // InternalTyphonML.g:1339:3: (otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')' )? (otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')' )? (otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) ) )? otherlv_14= 'entity' ( (lv_name_15_0= ruleEString ) ) otherlv_16= '{' ( ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )* )? ( ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )* )? otherlv_21= '}'
            {
            // InternalTyphonML.g:1339:3: (otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTyphonML.g:1340:4: otherlv_0= '@functionalTags' otherlv_1= '(' ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntity_ImplAccess().getFunctionalTagsKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntity_ImplAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalTyphonML.g:1348:4: ( ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTyphonML.g:1349:5: ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) ) (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )*
                            {
                            // InternalTyphonML.g:1349:5: ( (lv_functionalTags_2_0= ruleFunctionalTag_Impl ) )
                            // InternalTyphonML.g:1350:6: (lv_functionalTags_2_0= ruleFunctionalTag_Impl )
                            {
                            // InternalTyphonML.g:1350:6: (lv_functionalTags_2_0= ruleFunctionalTag_Impl )
                            // InternalTyphonML.g:1351:7: lv_functionalTags_2_0= ruleFunctionalTag_Impl
                            {

                            							newCompositeNode(grammarAccess.getEntity_ImplAccess().getFunctionalTagsFunctionalTag_ImplParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_functionalTags_2_0=ruleFunctionalTag_Impl();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                            							}
                            							add(
                            								current,
                            								"functionalTags",
                            								lv_functionalTags_2_0,
                            								"it.univaq.disim.typhon.TyphonML.FunctionalTag_Impl");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalTyphonML.g:1368:5: (otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==13) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalTyphonML.g:1369:6: otherlv_3= ',' ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FOLLOW_13); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getEntity_ImplAccess().getCommaKeyword_0_2_1_0());
                            	    					
                            	    // InternalTyphonML.g:1373:6: ( (lv_functionalTags_4_0= ruleFunctionalTag_Impl ) )
                            	    // InternalTyphonML.g:1374:7: (lv_functionalTags_4_0= ruleFunctionalTag_Impl )
                            	    {
                            	    // InternalTyphonML.g:1374:7: (lv_functionalTags_4_0= ruleFunctionalTag_Impl )
                            	    // InternalTyphonML.g:1375:8: lv_functionalTags_4_0= ruleFunctionalTag_Impl
                            	    {

                            	    								newCompositeNode(grammarAccess.getEntity_ImplAccess().getFunctionalTagsFunctionalTag_ImplParserRuleCall_0_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_23);
                            	    lv_functionalTags_4_0=ruleFunctionalTag_Impl();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"functionalTags",
                            	    									lv_functionalTags_4_0,
                            	    									"it.univaq.disim.typhon.TyphonML.FunctionalTag_Impl");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntity_ImplAccess().getRightParenthesisKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:1399:3: (otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:1400:4: otherlv_6= '@nFunctionalTags' otherlv_7= '(' ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )? otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntity_ImplAccess().getNFunctionalTagsKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntity_ImplAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalTyphonML.g:1408:4: ( ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalTyphonML.g:1409:5: ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) ) (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )*
                            {
                            // InternalTyphonML.g:1409:5: ( (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl ) )
                            // InternalTyphonML.g:1410:6: (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl )
                            {
                            // InternalTyphonML.g:1410:6: (lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl )
                            // InternalTyphonML.g:1411:7: lv_nfunctionalTags_8_0= ruleNFunctionalTag_Impl
                            {

                            							newCompositeNode(grammarAccess.getEntity_ImplAccess().getNfunctionalTagsNFunctionalTag_ImplParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_nfunctionalTags_8_0=ruleNFunctionalTag_Impl();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                            							}
                            							add(
                            								current,
                            								"nfunctionalTags",
                            								lv_nfunctionalTags_8_0,
                            								"it.univaq.disim.typhon.TyphonML.NFunctionalTag_Impl");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalTyphonML.g:1428:5: (otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==13) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalTyphonML.g:1429:6: otherlv_9= ',' ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FOLLOW_13); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getEntity_ImplAccess().getCommaKeyword_1_2_1_0());
                            	    					
                            	    // InternalTyphonML.g:1433:6: ( (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl ) )
                            	    // InternalTyphonML.g:1434:7: (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl )
                            	    {
                            	    // InternalTyphonML.g:1434:7: (lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl )
                            	    // InternalTyphonML.g:1435:8: lv_nfunctionalTags_10_0= ruleNFunctionalTag_Impl
                            	    {

                            	    								newCompositeNode(grammarAccess.getEntity_ImplAccess().getNfunctionalTagsNFunctionalTag_ImplParserRuleCall_1_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_23);
                            	    lv_nfunctionalTags_10_0=ruleNFunctionalTag_Impl();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"nfunctionalTags",
                            	    									lv_nfunctionalTags_10_0,
                            	    									"it.univaq.disim.typhon.TyphonML.NFunctionalTag_Impl");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntity_ImplAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:1459:3: (otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:1460:4: otherlv_12= 'importedNamespace' ( (lv_importedNamespace_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntity_ImplAccess().getImportedNamespaceKeyword_2_0());
                    			
                    // InternalTyphonML.g:1464:4: ( (lv_importedNamespace_13_0= ruleEString ) )
                    // InternalTyphonML.g:1465:5: (lv_importedNamespace_13_0= ruleEString )
                    {
                    // InternalTyphonML.g:1465:5: (lv_importedNamespace_13_0= ruleEString )
                    // InternalTyphonML.g:1466:6: lv_importedNamespace_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getImportedNamespaceEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_importedNamespace_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_13_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getEntity_ImplAccess().getEntityKeyword_3());
            		
            // InternalTyphonML.g:1488:3: ( (lv_name_15_0= ruleEString ) )
            // InternalTyphonML.g:1489:4: (lv_name_15_0= ruleEString )
            {
            // InternalTyphonML.g:1489:4: (lv_name_15_0= ruleEString )
            // InternalTyphonML.g:1490:5: lv_name_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_15_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_16, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalTyphonML.g:1511:3: ( ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )* )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_STRING) ) {
                        int LA25_6 = input.LA(3);

                        if ( (LA25_6==RULE_STRING) ) {
                            int LA25_2 = input.LA(4);

                            if ( (LA25_2==33) ) {
                                int LA25_8 = input.LA(5);

                                if ( ((LA25_8>=RULE_STRING && LA25_8<=RULE_ID)||(LA25_8>=17 && LA25_8<=28)) ) {
                                    alt25=1;
                                }
                            }
                        }
                        else if ( (LA25_6==RULE_ID) ) {
                            int LA25_3 = input.LA(4);

                            if ( (LA25_3==33) ) {
                                int LA25_8 = input.LA(5);

                                if ( ((LA25_8>=RULE_STRING && LA25_8<=RULE_ID)||(LA25_8>=17 && LA25_8<=28)) ) {
                                    alt25=1;
                                }
                            }
                        }
                    }
                    else if ( (LA25_1==RULE_ID) ) {
                        int LA25_7 = input.LA(3);

                        if ( (LA25_7==RULE_STRING) ) {
                            int LA25_2 = input.LA(4);

                            if ( (LA25_2==33) ) {
                                int LA25_8 = input.LA(5);

                                if ( ((LA25_8>=RULE_STRING && LA25_8<=RULE_ID)||(LA25_8>=17 && LA25_8<=28)) ) {
                                    alt25=1;
                                }
                            }
                        }
                        else if ( (LA25_7==RULE_ID) ) {
                            int LA25_3 = input.LA(4);

                            if ( (LA25_3==33) ) {
                                int LA25_8 = input.LA(5);

                                if ( ((LA25_8>=RULE_STRING && LA25_8<=RULE_ID)||(LA25_8>=17 && LA25_8<=28)) ) {
                                    alt25=1;
                                }
                            }
                        }
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==33) ) {
                        int LA25_8 = input.LA(3);

                        if ( ((LA25_8>=RULE_STRING && LA25_8<=RULE_ID)||(LA25_8>=17 && LA25_8<=28)) ) {
                            alt25=1;
                        }
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (LA25_3==33) ) {
                        int LA25_8 = input.LA(3);

                        if ( ((LA25_8>=RULE_STRING && LA25_8<=RULE_ID)||(LA25_8>=17 && LA25_8<=28)) ) {
                            alt25=1;
                        }
                    }
                    }
                    break;
                case 66:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // InternalTyphonML.g:1512:4: ( (lv_attributes_17_0= ruleEntityAttributeKind ) ) ( (lv_attributes_18_0= ruleEntityAttributeKind ) )*
                    {
                    // InternalTyphonML.g:1512:4: ( (lv_attributes_17_0= ruleEntityAttributeKind ) )
                    // InternalTyphonML.g:1513:5: (lv_attributes_17_0= ruleEntityAttributeKind )
                    {
                    // InternalTyphonML.g:1513:5: (lv_attributes_17_0= ruleEntityAttributeKind )
                    // InternalTyphonML.g:1514:6: lv_attributes_17_0= ruleEntityAttributeKind
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesEntityAttributeKindParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attributes_17_0=ruleEntityAttributeKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_17_0,
                    							"it.univaq.disim.typhon.TyphonML.EntityAttributeKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1531:4: ( (lv_attributes_18_0= ruleEntityAttributeKind ) )*
                    loop24:
                    do {
                        int alt24=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==RULE_STRING) ) {
                                int LA24_6 = input.LA(3);

                                if ( (LA24_6==RULE_STRING) ) {
                                    int LA24_2 = input.LA(4);

                                    if ( (LA24_2==33) ) {
                                        int LA24_8 = input.LA(5);

                                        if ( ((LA24_8>=RULE_STRING && LA24_8<=RULE_ID)||(LA24_8>=17 && LA24_8<=28)) ) {
                                            alt24=1;
                                        }


                                    }


                                }
                                else if ( (LA24_6==RULE_ID) ) {
                                    int LA24_3 = input.LA(4);

                                    if ( (LA24_3==33) ) {
                                        int LA24_8 = input.LA(5);

                                        if ( ((LA24_8>=RULE_STRING && LA24_8<=RULE_ID)||(LA24_8>=17 && LA24_8<=28)) ) {
                                            alt24=1;
                                        }


                                    }


                                }


                            }
                            else if ( (LA24_1==RULE_ID) ) {
                                int LA24_7 = input.LA(3);

                                if ( (LA24_7==RULE_STRING) ) {
                                    int LA24_2 = input.LA(4);

                                    if ( (LA24_2==33) ) {
                                        int LA24_8 = input.LA(5);

                                        if ( ((LA24_8>=RULE_STRING && LA24_8<=RULE_ID)||(LA24_8>=17 && LA24_8<=28)) ) {
                                            alt24=1;
                                        }


                                    }


                                }
                                else if ( (LA24_7==RULE_ID) ) {
                                    int LA24_3 = input.LA(4);

                                    if ( (LA24_3==33) ) {
                                        int LA24_8 = input.LA(5);

                                        if ( ((LA24_8>=RULE_STRING && LA24_8<=RULE_ID)||(LA24_8>=17 && LA24_8<=28)) ) {
                                            alt24=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==33) ) {
                                int LA24_8 = input.LA(3);

                                if ( ((LA24_8>=RULE_STRING && LA24_8<=RULE_ID)||(LA24_8>=17 && LA24_8<=28)) ) {
                                    alt24=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA24_3 = input.LA(2);

                            if ( (LA24_3==33) ) {
                                int LA24_8 = input.LA(3);

                                if ( ((LA24_8>=RULE_STRING && LA24_8<=RULE_ID)||(LA24_8>=17 && LA24_8<=28)) ) {
                                    alt24=1;
                                }


                            }


                            }
                            break;
                        case 66:
                            {
                            alt24=1;
                            }
                            break;

                        }

                        switch (alt24) {
                    	case 1 :
                    	    // InternalTyphonML.g:1532:5: (lv_attributes_18_0= ruleEntityAttributeKind )
                    	    {
                    	    // InternalTyphonML.g:1532:5: (lv_attributes_18_0= ruleEntityAttributeKind )
                    	    // InternalTyphonML.g:1533:6: lv_attributes_18_0= ruleEntityAttributeKind
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesEntityAttributeKindParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_attributes_18_0=ruleEntityAttributeKind();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_18_0,
                    	    							"it.univaq.disim.typhon.TyphonML.EntityAttributeKind");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTyphonML.g:1551:3: ( ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTyphonML.g:1552:4: ( (lv_relations_19_0= ruleRelation ) ) ( (lv_relations_20_0= ruleRelation ) )*
                    {
                    // InternalTyphonML.g:1552:4: ( (lv_relations_19_0= ruleRelation ) )
                    // InternalTyphonML.g:1553:5: (lv_relations_19_0= ruleRelation )
                    {
                    // InternalTyphonML.g:1553:5: (lv_relations_19_0= ruleRelation )
                    // InternalTyphonML.g:1554:6: lv_relations_19_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_relations_19_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relations",
                    							lv_relations_19_0,
                    							"it.univaq.disim.typhon.TyphonML.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1571:4: ( (lv_relations_20_0= ruleRelation ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||LA26_0==32) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTyphonML.g:1572:5: (lv_relations_20_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:1572:5: (lv_relations_20_0= ruleRelation )
                    	    // InternalTyphonML.g:1573:6: lv_relations_20_0= ruleRelation
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_relations_20_0=ruleRelation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relations",
                    	    							lv_relations_20_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Relation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEntity_Impl"


    // $ANTLR start "entryRuleFunctionalTag_Impl"
    // InternalTyphonML.g:1599:1: entryRuleFunctionalTag_Impl returns [EObject current=null] : iv_ruleFunctionalTag_Impl= ruleFunctionalTag_Impl EOF ;
    public final EObject entryRuleFunctionalTag_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalTag_Impl = null;


        try {
            // InternalTyphonML.g:1599:59: (iv_ruleFunctionalTag_Impl= ruleFunctionalTag_Impl EOF )
            // InternalTyphonML.g:1600:2: iv_ruleFunctionalTag_Impl= ruleFunctionalTag_Impl EOF
            {
             newCompositeNode(grammarAccess.getFunctionalTag_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalTag_Impl=ruleFunctionalTag_Impl();

            state._fsp--;

             current =iv_ruleFunctionalTag_Impl; 
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
    // $ANTLR end "entryRuleFunctionalTag_Impl"


    // $ANTLR start "ruleFunctionalTag_Impl"
    // InternalTyphonML.g:1606:1: ruleFunctionalTag_Impl returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleFunctionalTag_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1612:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalTyphonML.g:1613:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalTyphonML.g:1613:2: ( (lv_name_0_0= ruleEString ) )
            // InternalTyphonML.g:1614:3: (lv_name_0_0= ruleEString )
            {
            // InternalTyphonML.g:1614:3: (lv_name_0_0= ruleEString )
            // InternalTyphonML.g:1615:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getFunctionalTag_ImplAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionalTag_ImplRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.univaq.disim.typhon.TyphonML.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFunctionalTag_Impl"


    // $ANTLR start "entryRuleNFunctionalTag_Impl"
    // InternalTyphonML.g:1635:1: entryRuleNFunctionalTag_Impl returns [EObject current=null] : iv_ruleNFunctionalTag_Impl= ruleNFunctionalTag_Impl EOF ;
    public final EObject entryRuleNFunctionalTag_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNFunctionalTag_Impl = null;


        try {
            // InternalTyphonML.g:1635:60: (iv_ruleNFunctionalTag_Impl= ruleNFunctionalTag_Impl EOF )
            // InternalTyphonML.g:1636:2: iv_ruleNFunctionalTag_Impl= ruleNFunctionalTag_Impl EOF
            {
             newCompositeNode(grammarAccess.getNFunctionalTag_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNFunctionalTag_Impl=ruleNFunctionalTag_Impl();

            state._fsp--;

             current =iv_ruleNFunctionalTag_Impl; 
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
    // $ANTLR end "entryRuleNFunctionalTag_Impl"


    // $ANTLR start "ruleNFunctionalTag_Impl"
    // InternalTyphonML.g:1642:1: ruleNFunctionalTag_Impl returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleNFunctionalTag_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1648:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalTyphonML.g:1649:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalTyphonML.g:1649:2: ( (lv_name_0_0= ruleEString ) )
            // InternalTyphonML.g:1650:3: (lv_name_0_0= ruleEString )
            {
            // InternalTyphonML.g:1650:3: (lv_name_0_0= ruleEString )
            // InternalTyphonML.g:1651:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getNFunctionalTag_ImplAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNFunctionalTag_ImplRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.univaq.disim.typhon.TyphonML.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleNFunctionalTag_Impl"


    // $ANTLR start "entryRuleAttribute"
    // InternalTyphonML.g:1671:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:1671:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:1672:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTyphonML.g:1678:1: ruleAttribute returns [EObject current=null] : (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddCustomDataTypeAttribute_1= ruleAddCustomDataTypeAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;

        EObject this_AddCustomDataTypeAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1684:2: ( (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddCustomDataTypeAttribute_1= ruleAddCustomDataTypeAttribute ) )
            // InternalTyphonML.g:1685:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddCustomDataTypeAttribute_1= ruleAddCustomDataTypeAttribute )
            {
            // InternalTyphonML.g:1685:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddCustomDataTypeAttribute_1= ruleAddCustomDataTypeAttribute )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==32) ) {
                alt28=1;
            }
            else if ( (LA28_0==66) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTyphonML.g:1686:3: this_Attribute_Impl_0= ruleAttribute_Impl
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getAttribute_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_Impl_0=ruleAttribute_Impl();

                    state._fsp--;


                    			current = this_Attribute_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1695:3: this_AddCustomDataTypeAttribute_1= ruleAddCustomDataTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getAddCustomDataTypeAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCustomDataTypeAttribute_1=ruleAddCustomDataTypeAttribute();

                    state._fsp--;


                    			current = this_AddCustomDataTypeAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntityAttributeKind"
    // InternalTyphonML.g:1707:1: entryRuleEntityAttributeKind returns [EObject current=null] : iv_ruleEntityAttributeKind= ruleEntityAttributeKind EOF ;
    public final EObject entryRuleEntityAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityAttributeKind = null;


        try {
            // InternalTyphonML.g:1707:60: (iv_ruleEntityAttributeKind= ruleEntityAttributeKind EOF )
            // InternalTyphonML.g:1708:2: iv_ruleEntityAttributeKind= ruleEntityAttributeKind EOF
            {
             newCompositeNode(grammarAccess.getEntityAttributeKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityAttributeKind=ruleEntityAttributeKind();

            state._fsp--;

             current =iv_ruleEntityAttributeKind; 
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
    // $ANTLR end "entryRuleEntityAttributeKind"


    // $ANTLR start "ruleEntityAttributeKind"
    // InternalTyphonML.g:1714:1: ruleEntityAttributeKind returns [EObject current=null] : (this_Attribute_Impl_0= ruleAttribute_Impl | this_CustomAttribute_1= ruleCustomAttribute | this_AddCustomDataTypeAttribute_2= ruleAddCustomDataTypeAttribute ) ;
    public final EObject ruleEntityAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;

        EObject this_CustomAttribute_1 = null;

        EObject this_AddCustomDataTypeAttribute_2 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1720:2: ( (this_Attribute_Impl_0= ruleAttribute_Impl | this_CustomAttribute_1= ruleCustomAttribute | this_AddCustomDataTypeAttribute_2= ruleAddCustomDataTypeAttribute ) )
            // InternalTyphonML.g:1721:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_CustomAttribute_1= ruleCustomAttribute | this_AddCustomDataTypeAttribute_2= ruleAddCustomDataTypeAttribute )
            {
            // InternalTyphonML.g:1721:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_CustomAttribute_1= ruleCustomAttribute | this_AddCustomDataTypeAttribute_2= ruleAddCustomDataTypeAttribute )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalTyphonML.g:1722:3: this_Attribute_Impl_0= ruleAttribute_Impl
                    {

                    			newCompositeNode(grammarAccess.getEntityAttributeKindAccess().getAttribute_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_Impl_0=ruleAttribute_Impl();

                    state._fsp--;


                    			current = this_Attribute_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1731:3: this_CustomAttribute_1= ruleCustomAttribute
                    {

                    			newCompositeNode(grammarAccess.getEntityAttributeKindAccess().getCustomAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomAttribute_1=ruleCustomAttribute();

                    state._fsp--;


                    			current = this_CustomAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:1740:3: this_AddCustomDataTypeAttribute_2= ruleAddCustomDataTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getEntityAttributeKindAccess().getAddCustomDataTypeAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCustomDataTypeAttribute_2=ruleAddCustomDataTypeAttribute();

                    state._fsp--;


                    			current = this_AddCustomDataTypeAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEntityAttributeKind"


    // $ANTLR start "entryRuleAttribute_Impl"
    // InternalTyphonML.g:1752:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalTyphonML.g:1752:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalTyphonML.g:1753:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
            {
             newCompositeNode(grammarAccess.getAttribute_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute_Impl=ruleAttribute_Impl();

            state._fsp--;

             current =iv_ruleAttribute_Impl; 
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
    // $ANTLR end "entryRuleAttribute_Impl"


    // $ANTLR start "ruleAttribute_Impl"
    // InternalTyphonML.g:1759:1: ruleAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1765:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDataType ) ) ) )
            // InternalTyphonML.g:1766:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDataType ) ) )
            {
            // InternalTyphonML.g:1766:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDataType ) ) )
            // InternalTyphonML.g:1767:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDataType ) )
            {
            // InternalTyphonML.g:1767:3: ()
            // InternalTyphonML.g:1768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1774:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTyphonML.g:1775:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:1779:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:1780:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:1780:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:1781:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1799:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:1800:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:1800:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:1801:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getAttribute_ImplAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:1822:3: ( (lv_type_5_0= ruleDataType ) )
            // InternalTyphonML.g:1823:4: (lv_type_5_0= ruleDataType )
            {
            // InternalTyphonML.g:1823:4: (lv_type_5_0= ruleDataType )
            // InternalTyphonML.g:1824:5: lv_type_5_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getTypeDataTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"it.univaq.disim.typhon.TyphonML.DataType");
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
    // $ANTLR end "ruleAttribute_Impl"


    // $ANTLR start "entryRuleCustomAttribute"
    // InternalTyphonML.g:1845:1: entryRuleCustomAttribute returns [EObject current=null] : iv_ruleCustomAttribute= ruleCustomAttribute EOF ;
    public final EObject entryRuleCustomAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAttribute = null;


        try {
            // InternalTyphonML.g:1845:56: (iv_ruleCustomAttribute= ruleCustomAttribute EOF )
            // InternalTyphonML.g:1846:2: iv_ruleCustomAttribute= ruleCustomAttribute EOF
            {
             newCompositeNode(grammarAccess.getCustomAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomAttribute=ruleCustomAttribute();

            state._fsp--;

             current =iv_ruleCustomAttribute; 
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
    // $ANTLR end "entryRuleCustomAttribute"


    // $ANTLR start "ruleCustomAttribute"
    // InternalTyphonML.g:1852:1: ruleCustomAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleCustomAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1858:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1859:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1859:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1860:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:1860:3: ()
            // InternalTyphonML.g:1861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomAttributeAccess().getCustomAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1867:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTyphonML.g:1868:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getCustomAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:1872:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:1873:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:1873:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:1874:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomAttributeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1892:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:1893:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:1893:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:1894:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomAttributeAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:1915:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1916:4: ( ruleEString )
            {
            // InternalTyphonML.g:1916:4: ( ruleEString )
            // InternalTyphonML.g:1917:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomAttributeAccess().getTypeCustomDataTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleCustomAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalTyphonML.g:1935:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:1935:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:1936:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalTyphonML.g:1942:1: ruleRelation returns [EObject current=null] : this_Relation_Impl_0= ruleRelation_Impl ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_Impl_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1948:2: (this_Relation_Impl_0= ruleRelation_Impl )
            // InternalTyphonML.g:1949:2: this_Relation_Impl_0= ruleRelation_Impl
            {

            		newCompositeNode(grammarAccess.getRelationAccess().getRelation_ImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Relation_Impl_0=ruleRelation_Impl();

            state._fsp--;


            		current = this_Relation_Impl_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelation_Impl"
    // InternalTyphonML.g:1960:1: entryRuleRelation_Impl returns [EObject current=null] : iv_ruleRelation_Impl= ruleRelation_Impl EOF ;
    public final EObject entryRuleRelation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation_Impl = null;


        try {
            // InternalTyphonML.g:1960:54: (iv_ruleRelation_Impl= ruleRelation_Impl EOF )
            // InternalTyphonML.g:1961:2: iv_ruleRelation_Impl= ruleRelation_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelation_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation_Impl=ruleRelation_Impl();

            state._fsp--;

             current =iv_ruleRelation_Impl; 
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
    // $ANTLR end "entryRuleRelation_Impl"


    // $ANTLR start "ruleRelation_Impl"
    // InternalTyphonML.g:1967:1: ruleRelation_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) ;
    public final EObject ruleRelation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isContainment_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_cardinality_9_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1973:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) )
            // InternalTyphonML.g:1974:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            {
            // InternalTyphonML.g:1974:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            // InternalTyphonML.g:1975:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            {
            // InternalTyphonML.g:1975:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTyphonML.g:1976:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelation_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1980:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1981:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1981:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1982:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2000:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2001:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2001:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2002:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelation_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2019:3: ( (lv_isContainment_3_0= ':' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTyphonML.g:2020:4: (lv_isContainment_3_0= ':' )
                    {
                    // InternalTyphonML.g:2020:4: (lv_isContainment_3_0= ':' )
                    // InternalTyphonML.g:2021:5: lv_isContainment_3_0= ':'
                    {
                    lv_isContainment_3_0=(Token)match(input,33,FOLLOW_29); 

                    					newLeafNode(lv_isContainment_3_0, grammarAccess.getRelation_ImplAccess().getIsContainmentColonKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelation_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRelation_ImplAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTyphonML.g:2037:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2038:4: ( ruleEString )
            {
            // InternalTyphonML.g:2038:4: ( ruleEString )
            // InternalTyphonML.g:2039:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getTypeEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2053:3: (otherlv_6= '.' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTyphonML.g:2054:4: otherlv_6= '.' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelation_ImplAccess().getFullStopKeyword_5_0());
                    			
                    // InternalTyphonML.g:2058:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2059:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2059:5: ( ruleEString )
                    // InternalTyphonML.g:2060:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getOppositeRelationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2075:3: (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTyphonML.g:2076:4: otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelation_ImplAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalTyphonML.g:2080:4: ( (lv_cardinality_9_0= ruleCardinality ) )
                    // InternalTyphonML.g:2081:5: (lv_cardinality_9_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:2081:5: (lv_cardinality_9_0= ruleCardinality )
                    // InternalTyphonML.g:2082:6: lv_cardinality_9_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getCardinalityCardinalityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_cardinality_9_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_9_0,
                    							"it.univaq.disim.typhon.TyphonML.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelation_ImplAccess().getRightSquareBracketKeyword_6_2());
                    			

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
    // $ANTLR end "ruleRelation_Impl"


    // $ANTLR start "entryRuleDatabase"
    // InternalTyphonML.g:2108:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:2108:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:2109:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalTyphonML.g:2115:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_DocumentDB_1 = null;

        EObject this_KeyValueDB_2 = null;

        EObject this_GraphDB_3 = null;

        EObject this_ColumnDB_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2121:2: ( (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) )
            // InternalTyphonML.g:2122:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            {
            // InternalTyphonML.g:2122:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 54:
                        {
                        alt36=3;
                        }
                        break;
                    case 52:
                        {
                        alt36=2;
                        }
                        break;
                    case 59:
                        {
                        alt36=5;
                        }
                        break;
                    case 50:
                        {
                        alt36=1;
                        }
                        break;
                    case 56:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA36_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 54:
                        {
                        alt36=3;
                        }
                        break;
                    case 52:
                        {
                        alt36=2;
                        }
                        break;
                    case 59:
                        {
                        alt36=5;
                        }
                        break;
                    case 50:
                        {
                        alt36=1;
                        }
                        break;
                    case 56:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt36=1;
                }
                break;
            case 52:
                {
                alt36=2;
                }
                break;
            case 54:
                {
                alt36=3;
                }
                break;
            case 56:
                {
                alt36=4;
                }
                break;
            case 59:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalTyphonML.g:2123:3: this_RelationalDB_0= ruleRelationalDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getRelationalDBParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationalDB_0=ruleRelationalDB();

                    state._fsp--;


                    			current = this_RelationalDB_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:2132:3: this_DocumentDB_1= ruleDocumentDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getDocumentDBParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentDB_1=ruleDocumentDB();

                    state._fsp--;


                    			current = this_DocumentDB_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:2141:3: this_KeyValueDB_2= ruleKeyValueDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getKeyValueDBParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyValueDB_2=ruleKeyValueDB();

                    state._fsp--;


                    			current = this_KeyValueDB_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:2150:3: this_GraphDB_3= ruleGraphDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getGraphDBParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphDB_3=ruleGraphDB();

                    state._fsp--;


                    			current = this_GraphDB_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:2159:3: this_ColumnDB_4= ruleColumnDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getColumnDBParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnDB_4=ruleColumnDB();

                    state._fsp--;


                    			current = this_ColumnDB_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleGraphAttribute"
    // InternalTyphonML.g:2171:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:2171:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:2172:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
            {
             newCompositeNode(grammarAccess.getGraphAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphAttribute=ruleGraphAttribute();

            state._fsp--;

             current =iv_ruleGraphAttribute; 
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
    // $ANTLR end "entryRuleGraphAttribute"


    // $ANTLR start "ruleGraphAttribute"
    // InternalTyphonML.g:2178:1: ruleGraphAttribute returns [EObject current=null] : (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_GraphAttribute_Impl_0 = null;

        EObject this_AddGraphAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2184:2: ( (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) )
            // InternalTyphonML.g:2185:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            {
            // InternalTyphonML.g:2185:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            int alt37=2;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_STRING) ) {
                    int LA37_4 = input.LA(3);

                    if ( (LA37_4==106) ) {
                        alt37=2;
                    }
                    else if ( ((LA37_4>=RULE_STRING && LA37_4<=RULE_ID)) ) {
                        alt37=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_1==RULE_ID) ) {
                    int LA37_5 = input.LA(3);

                    if ( ((LA37_5>=RULE_STRING && LA37_5<=RULE_ID)) ) {
                        alt37=1;
                    }
                    else if ( (LA37_5==106) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt37=1;
                }
                break;
            case 106:
                {
                alt37=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalTyphonML.g:2186:3: this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl
                    {

                    			newCompositeNode(grammarAccess.getGraphAttributeAccess().getGraphAttribute_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphAttribute_Impl_0=ruleGraphAttribute_Impl();

                    state._fsp--;


                    			current = this_GraphAttribute_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:2195:3: this_AddGraphAttribute_1= ruleAddGraphAttribute
                    {

                    			newCompositeNode(grammarAccess.getGraphAttributeAccess().getAddGraphAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddGraphAttribute_1=ruleAddGraphAttribute();

                    state._fsp--;


                    			current = this_AddGraphAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleGraphAttribute"


    // $ANTLR start "entryRuleGraphEdge"
    // InternalTyphonML.g:2207:1: entryRuleGraphEdge returns [EObject current=null] : iv_ruleGraphEdge= ruleGraphEdge EOF ;
    public final EObject entryRuleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge = null;


        try {
            // InternalTyphonML.g:2207:50: (iv_ruleGraphEdge= ruleGraphEdge EOF )
            // InternalTyphonML.g:2208:2: iv_ruleGraphEdge= ruleGraphEdge EOF
            {
             newCompositeNode(grammarAccess.getGraphEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphEdge=ruleGraphEdge();

            state._fsp--;

             current =iv_ruleGraphEdge; 
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
    // $ANTLR end "entryRuleGraphEdge"


    // $ANTLR start "ruleGraphEdge"
    // InternalTyphonML.g:2214:1: ruleGraphEdge returns [EObject current=null] : (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) ;
    public final EObject ruleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject this_GraphEdge_Impl_0 = null;

        EObject this_AddGraphEdge_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2220:2: ( (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) )
            // InternalTyphonML.g:2221:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            {
            // InternalTyphonML.g:2221:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            int alt38=2;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_STRING) ) {
                    int LA38_4 = input.LA(3);

                    if ( (LA38_4==107) ) {
                        alt38=2;
                    }
                    else if ( (LA38_4==61) ) {
                        alt38=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA38_1==RULE_ID) ) {
                    int LA38_5 = input.LA(3);

                    if ( (LA38_5==61) ) {
                        alt38=1;
                    }
                    else if ( (LA38_5==107) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt38=1;
                }
                break;
            case 107:
                {
                alt38=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalTyphonML.g:2222:3: this_GraphEdge_Impl_0= ruleGraphEdge_Impl
                    {

                    			newCompositeNode(grammarAccess.getGraphEdgeAccess().getGraphEdge_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphEdge_Impl_0=ruleGraphEdge_Impl();

                    state._fsp--;


                    			current = this_GraphEdge_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:2231:3: this_AddGraphEdge_1= ruleAddGraphEdge
                    {

                    			newCompositeNode(grammarAccess.getGraphEdgeAccess().getAddGraphEdgeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddGraphEdge_1=ruleAddGraphEdge();

                    state._fsp--;


                    			current = this_AddGraphEdge_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleGraphEdge"


    // $ANTLR start "entryRuleTable"
    // InternalTyphonML.g:2243:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:2243:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:2244:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalTyphonML.g:2250:1: ruleTable returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_indexSpec_9_0 = null;

        EObject lv_idSpec_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2256:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2257:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2257:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            // InternalTyphonML.g:2258:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2258:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTyphonML.g:2259:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getTableAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2263:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2264:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2264:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2265:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2291:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2292:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2292:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2293:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:2314:3: ( ( ruleEString ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTyphonML.g:2315:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:2315:4: ( ruleEString )
                    // InternalTyphonML.g:2316:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0());
                    				
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2330:3: (otherlv_7= 'db' ( ( ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTyphonML.g:2331:4: otherlv_7= 'db' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDbKeyword_6_0());
                    			
                    // InternalTyphonML.g:2335:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2336:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2336:5: ( ruleEString )
                    // InternalTyphonML.g:2337:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableAccess().getDbDatabaseCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2352:3: ( (lv_indexSpec_9_0= ruleIndexSpec ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32||LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTyphonML.g:2353:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:2353:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    // InternalTyphonML.g:2354:5: lv_indexSpec_9_0= ruleIndexSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_indexSpec_9_0=ruleIndexSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"indexSpec",
                    						lv_indexSpec_9_0,
                    						"it.univaq.disim.typhon.TyphonML.IndexSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2371:3: ( (lv_idSpec_10_0= ruleIdSpec ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTyphonML.g:2372:4: (lv_idSpec_10_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:2372:4: (lv_idSpec_10_0= ruleIdSpec )
                    // InternalTyphonML.g:2373:5: lv_idSpec_10_0= ruleIdSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_idSpec_10_0=ruleIdSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"idSpec",
                    						lv_idSpec_10_0,
                    						"it.univaq.disim.typhon.TyphonML.IdSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleCollection"
    // InternalTyphonML.g:2398:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalTyphonML.g:2398:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalTyphonML.g:2399:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalTyphonML.g:2405:1: ruleCollection returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2411:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:2412:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:2412:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:2413:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:2413:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTyphonML.g:2414:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2418:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2419:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2419:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2420:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2438:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2439:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2439:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2440:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:2461:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2462:4: ( ruleEString )
            {
            // InternalTyphonML.g:2462:4: ( ruleEString )
            // InternalTyphonML.g:2463:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollectionAccess().getEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleKeyValueElement"
    // InternalTyphonML.g:2481:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:2481:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:2482:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
            {
             newCompositeNode(grammarAccess.getKeyValueElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValueElement=ruleKeyValueElement();

            state._fsp--;

             current =iv_ruleKeyValueElement; 
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
    // $ANTLR end "entryRuleKeyValueElement"


    // $ANTLR start "ruleKeyValueElement"
    // InternalTyphonML.g:2488:1: ruleKeyValueElement returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' ) ;
    public final EObject ruleKeyValueElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_key_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2494:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' ) )
            // InternalTyphonML.g:2495:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalTyphonML.g:2495:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' )
            // InternalTyphonML.g:2496:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}'
            {
            // InternalTyphonML.g:2496:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==32) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTyphonML.g:2497:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getKeyValueElementAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2501:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2502:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2502:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2503:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyValueElementRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2521:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2522:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2522:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2523:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2544:3: ( (lv_key_4_0= ruleEString ) )
            // InternalTyphonML.g:2545:4: (lv_key_4_0= ruleEString )
            {
            // InternalTyphonML.g:2545:4: (lv_key_4_0= ruleEString )
            // InternalTyphonML.g:2546:5: lv_key_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_key_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueElementRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            otherlv_6=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getKeyValueElementAccess().getLeftParenthesisKeyword_5());
            		
            // InternalTyphonML.g:2571:3: ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTyphonML.g:2572:4: ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalTyphonML.g:2572:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2573:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2573:5: ( ruleEString )
                    // InternalTyphonML.g:2574:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyValueElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesAttributeCrossReference_6_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2588:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==13) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalTyphonML.g:2589:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getKeyValueElementAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalTyphonML.g:2593:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2594:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2594:6: ( ruleEString )
                    	    // InternalTyphonML.g:2595:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeyValueElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesAttributeCrossReference_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_10, grammarAccess.getKeyValueElementAccess().getRightParenthesisKeyword_7());
            		
            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getKeyValueElementAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleKeyValueElement"


    // $ANTLR start "entryRuleGraphNode"
    // InternalTyphonML.g:2623:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // InternalTyphonML.g:2623:50: (iv_ruleGraphNode= ruleGraphNode EOF )
            // InternalTyphonML.g:2624:2: iv_ruleGraphNode= ruleGraphNode EOF
            {
             newCompositeNode(grammarAccess.getGraphNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphNode=ruleGraphNode();

            state._fsp--;

             current =iv_ruleGraphNode; 
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
    // $ANTLR end "entryRuleGraphNode"


    // $ANTLR start "ruleGraphNode"
    // InternalTyphonML.g:2630:1: ruleGraphNode returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleGraphNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2636:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2637:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2637:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:2638:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2638:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTyphonML.g:2639:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getGraphNodeAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2643:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2644:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2644:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2645:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphNodeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphNodeAccess().getNodeKeyword_1());
            		
            // InternalTyphonML.g:2667:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:2668:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:2668:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:2669:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphNodeAccess().getExclamationMarkKeyword_3());
            		
            // InternalTyphonML.g:2690:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2691:4: ( ruleEString )
            {
            // InternalTyphonML.g:2691:4: ( ruleEString )
            // InternalTyphonML.g:2692:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getEntityEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2706:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTyphonML.g:2707:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalTyphonML.g:2711:4: ( (lv_attributes_7_0= ruleGraphAttribute ) )
                    // InternalTyphonML.g:2712:5: (lv_attributes_7_0= ruleGraphAttribute )
                    {
                    // InternalTyphonML.g:2712:5: (lv_attributes_7_0= ruleGraphAttribute )
                    // InternalTyphonML.g:2713:6: lv_attributes_7_0= ruleGraphAttribute
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_attributes_7_0=ruleGraphAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphNodeRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_7_0,
                    							"it.univaq.disim.typhon.TyphonML.GraphAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2730:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==13) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalTyphonML.g:2731:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_41); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getGraphNodeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalTyphonML.g:2735:5: ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    	    // InternalTyphonML.g:2736:6: (lv_attributes_9_0= ruleGraphAttribute )
                    	    {
                    	    // InternalTyphonML.g:2736:6: (lv_attributes_9_0= ruleGraphAttribute )
                    	    // InternalTyphonML.g:2737:7: lv_attributes_9_0= ruleGraphAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_attributes_9_0=ruleGraphAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_9_0,
                    	    								"it.univaq.disim.typhon.TyphonML.GraphAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGraphNode"


    // $ANTLR start "entryRuleColumn"
    // InternalTyphonML.g:2768:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTyphonML.g:2768:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTyphonML.g:2769:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalTyphonML.g:2775:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2781:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:2782:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:2782:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:2783:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:2783:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==32) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTyphonML.g:2784:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2788:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2789:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2789:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2790:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalTyphonML.g:2812:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:2813:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:2813:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:2814:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2839:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2840:4: ( ruleEString )
            {
            // InternalTyphonML.g:2840:4: ( ruleEString )
            // InternalTyphonML.g:2841:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColumnAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2855:3: (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTyphonML.g:2856:4: otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2864:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2865:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2865:5: ( ruleEString )
                    // InternalTyphonML.g:2866:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2880:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalTyphonML.g:2881:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2885:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2886:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2886:6: ( ruleEString )
                    	    // InternalTyphonML.g:2887:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_12, grammarAccess.getColumnAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleIndexSpec"
    // InternalTyphonML.g:2915:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:2915:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:2916:2: iv_ruleIndexSpec= ruleIndexSpec EOF
            {
             newCompositeNode(grammarAccess.getIndexSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexSpec=ruleIndexSpec();

            state._fsp--;

             current =iv_ruleIndexSpec; 
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
    // $ANTLR end "entryRuleIndexSpec"


    // $ANTLR start "ruleIndexSpec"
    // InternalTyphonML.g:2922:1: ruleIndexSpec returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleIndexSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2928:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:2929:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:2929:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTyphonML.g:2930:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:2930:3: ()
            // InternalTyphonML.g:2931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2937:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==32) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTyphonML.g:2938:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2942:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2943:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2943:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2944:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexSpecRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getIndexKeyword_2());
            		
            // InternalTyphonML.g:2966:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2967:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2967:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2968:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexSpecAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2989:3: (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTyphonML.g:2990:4: otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexSpecAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTyphonML.g:2998:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2999:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2999:5: ( ruleEString )
                    // InternalTyphonML.g:3000:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3014:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==13) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalTyphonML.g:3015:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getIndexSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3019:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3020:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3020:6: ( ruleEString )
                    	    // InternalTyphonML.g:3021:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,36,FOLLOW_46); 

                    				newLeafNode(otherlv_11, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3041:3: (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==48) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTyphonML.g:3042:4: otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexSpecAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:3050:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3051:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3051:5: ( ruleEString )
                    // InternalTyphonML.g:3052:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3066:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==13) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTyphonML.g:3067:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getIndexSpecAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3071:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3072:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3072:6: ( ruleEString )
                    	    // InternalTyphonML.g:3073:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getIndexSpecAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleIndexSpec"


    // $ANTLR start "entryRuleIdSpec"
    // InternalTyphonML.g:3101:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:3101:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:3102:2: iv_ruleIdSpec= ruleIdSpec EOF
            {
             newCompositeNode(grammarAccess.getIdSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdSpec=ruleIdSpec();

            state._fsp--;

             current =iv_ruleIdSpec; 
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
    // $ANTLR end "entryRuleIdSpec"


    // $ANTLR start "ruleIdSpec"
    // InternalTyphonML.g:3108:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:3114:2: ( ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalTyphonML.g:3115:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalTyphonML.g:3115:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalTyphonML.g:3116:3: () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalTyphonML.g:3116:3: ()
            // InternalTyphonML.g:3117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdSpecKeyword_1());
            		
            // InternalTyphonML.g:3127:3: (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTyphonML.g:3128:4: otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTyphonML.g:3132:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3133:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3133:5: ( ruleEString )
                    // InternalTyphonML.g:3134:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3148:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==13) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalTyphonML.g:3149:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTyphonML.g:3153:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3154:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3154:6: ( ruleEString )
                    	    // InternalTyphonML.g:3155:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIdSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getIdSpecAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleIdSpec"


    // $ANTLR start "entryRuleRelationalDB"
    // InternalTyphonML.g:3179:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:3179:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:3180:2: iv_ruleRelationalDB= ruleRelationalDB EOF
            {
             newCompositeNode(grammarAccess.getRelationalDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalDB=ruleRelationalDB();

            state._fsp--;

             current =iv_ruleRelationalDB; 
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
    // $ANTLR end "entryRuleRelationalDB"


    // $ANTLR start "ruleRelationalDB"
    // InternalTyphonML.g:3186:1: ruleRelationalDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRelationalDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_tables_8_0 = null;

        EObject lv_tables_9_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3192:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3193:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3193:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3194:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3194:3: ()
            // InternalTyphonML.g:3195:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3201:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTyphonML.g:3202:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3206:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3207:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3207:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3208:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_2());
            		
            // InternalTyphonML.g:3230:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3231:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3231:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3232:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationalDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationalDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3253:3: (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTyphonML.g:3254:4: otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationalDBAccess().getTablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,30,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3262:4: ( (lv_tables_8_0= ruleTable ) )
                    // InternalTyphonML.g:3263:5: (lv_tables_8_0= ruleTable )
                    {
                    // InternalTyphonML.g:3263:5: (lv_tables_8_0= ruleTable )
                    // InternalTyphonML.g:3264:6: lv_tables_8_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_tables_8_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalDBRule());
                    						}
                    						add(
                    							current,
                    							"tables",
                    							lv_tables_8_0,
                    							"it.univaq.disim.typhon.TyphonML.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3281:4: ( (lv_tables_9_0= ruleTable ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==32||LA62_0==41) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalTyphonML.g:3282:5: (lv_tables_9_0= ruleTable )
                    	    {
                    	    // InternalTyphonML.g:3282:5: (lv_tables_9_0= ruleTable )
                    	    // InternalTyphonML.g:3283:6: lv_tables_9_0= ruleTable
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_51);
                    	    lv_tables_9_0=ruleTable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRelationalDBRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tables",
                    	    							lv_tables_9_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Table");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRelationalDB"


    // $ANTLR start "entryRuleDocumentDB"
    // InternalTyphonML.g:3313:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:3313:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:3314:2: iv_ruleDocumentDB= ruleDocumentDB EOF
            {
             newCompositeNode(grammarAccess.getDocumentDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentDB=ruleDocumentDB();

            state._fsp--;

             current =iv_ruleDocumentDB; 
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
    // $ANTLR end "entryRuleDocumentDB"


    // $ANTLR start "ruleDocumentDB"
    // InternalTyphonML.g:3320:1: ruleDocumentDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleDocumentDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_collections_8_0 = null;

        EObject lv_collections_9_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3326:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3327:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3327:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3328:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3328:3: ()
            // InternalTyphonML.g:3329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3335:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==32) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTyphonML.g:3336:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3340:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3341:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3341:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3342:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,52,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_2());
            		
            // InternalTyphonML.g:3364:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3365:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3365:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3366:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_53); 

            			newLeafNode(otherlv_5, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3387:3: (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==53) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTyphonML.g:3388:4: otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentDBAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3396:4: ( (lv_collections_8_0= ruleCollection ) )
                    // InternalTyphonML.g:3397:5: (lv_collections_8_0= ruleCollection )
                    {
                    // InternalTyphonML.g:3397:5: (lv_collections_8_0= ruleCollection )
                    // InternalTyphonML.g:3398:6: lv_collections_8_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_collections_8_0=ruleCollection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentDBRule());
                    						}
                    						add(
                    							current,
                    							"collections",
                    							lv_collections_8_0,
                    							"it.univaq.disim.typhon.TyphonML.Collection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3415:4: ( (lv_collections_9_0= ruleCollection ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_ID)||LA65_0==32) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalTyphonML.g:3416:5: (lv_collections_9_0= ruleCollection )
                    	    {
                    	    // InternalTyphonML.g:3416:5: (lv_collections_9_0= ruleCollection )
                    	    // InternalTyphonML.g:3417:6: lv_collections_9_0= ruleCollection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_collections_9_0=ruleCollection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDocumentDBRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"collections",
                    	    							lv_collections_9_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Collection");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDocumentDB"


    // $ANTLR start "entryRuleKeyValueDB"
    // InternalTyphonML.g:3447:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:3447:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:3448:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
            {
             newCompositeNode(grammarAccess.getKeyValueDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValueDB=ruleKeyValueDB();

            state._fsp--;

             current =iv_ruleKeyValueDB; 
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
    // $ANTLR end "entryRuleKeyValueDB"


    // $ANTLR start "ruleKeyValueDB"
    // InternalTyphonML.g:3454:1: ruleKeyValueDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleKeyValueDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3460:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:3461:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:3461:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:3462:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:3462:3: ()
            // InternalTyphonML.g:3463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3469:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==32) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTyphonML.g:3470:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3474:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3475:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3475:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3476:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,54,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_2());
            		
            // InternalTyphonML.g:3498:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3499:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3499:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3500:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_55); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3521:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==55) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTyphonML.g:3522:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeyValueDBAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3530:4: ( (lv_elements_8_0= ruleKeyValueElement ) )
                    // InternalTyphonML.g:3531:5: (lv_elements_8_0= ruleKeyValueElement )
                    {
                    // InternalTyphonML.g:3531:5: (lv_elements_8_0= ruleKeyValueElement )
                    // InternalTyphonML.g:3532:6: lv_elements_8_0= ruleKeyValueElement
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_elements_8_0=ruleKeyValueElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_8_0,
                    							"it.univaq.disim.typhon.TyphonML.KeyValueElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3549:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==13) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalTyphonML.g:3550:5: otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_18); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getKeyValueDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3554:5: ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    // InternalTyphonML.g:3555:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    {
                    	    // InternalTyphonML.g:3555:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    // InternalTyphonML.g:3556:7: lv_elements_10_0= ruleKeyValueElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_elements_10_0=ruleKeyValueElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_10_0,
                    	    								"it.univaq.disim.typhon.TyphonML.KeyValueElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleKeyValueDB"


    // $ANTLR start "entryRuleGraphDB"
    // InternalTyphonML.g:3587:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:3587:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:3588:2: iv_ruleGraphDB= ruleGraphDB EOF
            {
             newCompositeNode(grammarAccess.getGraphDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphDB=ruleGraphDB();

            state._fsp--;

             current =iv_ruleGraphDB; 
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
    // $ANTLR end "entryRuleGraphDB"


    // $ANTLR start "ruleGraphDB"
    // InternalTyphonML.g:3594:1: ruleGraphDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleGraphDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_nodes_8_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_edges_14_0 = null;

        EObject lv_edges_16_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3600:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:3601:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:3601:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:3602:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:3602:3: ()
            // InternalTyphonML.g:3603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3609:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==32) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTyphonML.g:3610:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3614:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3615:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3615:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3616:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getGraphdbKeyword_2());
            		
            // InternalTyphonML.g:3638:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3639:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3639:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3640:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_57); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3661:3: (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==57) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTyphonML.g:3662:4: otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getNodesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,30,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3670:4: ( (lv_nodes_8_0= ruleGraphNode ) )
                    // InternalTyphonML.g:3671:5: (lv_nodes_8_0= ruleGraphNode )
                    {
                    // InternalTyphonML.g:3671:5: (lv_nodes_8_0= ruleGraphNode )
                    // InternalTyphonML.g:3672:6: lv_nodes_8_0= ruleGraphNode
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_nodes_8_0=ruleGraphNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphDBRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_8_0,
                    							"it.univaq.disim.typhon.TyphonML.GraphNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3689:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==13) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalTyphonML.g:3690:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_58); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGraphDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3694:5: ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    // InternalTyphonML.g:3695:6: (lv_nodes_10_0= ruleGraphNode )
                    	    {
                    	    // InternalTyphonML.g:3695:6: (lv_nodes_10_0= ruleGraphNode )
                    	    // InternalTyphonML.g:3696:7: lv_nodes_10_0= ruleGraphNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_nodes_10_0=ruleGraphNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphDBRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_10_0,
                    	    								"it.univaq.disim.typhon.TyphonML.GraphNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,31,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3719:3: (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==58) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTyphonML.g:3720:4: otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphDBAccess().getEdgesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,30,FOLLOW_60); 

                    				newLeafNode(otherlv_13, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:3728:4: ( (lv_edges_14_0= ruleGraphEdge ) )
                    // InternalTyphonML.g:3729:5: (lv_edges_14_0= ruleGraphEdge )
                    {
                    // InternalTyphonML.g:3729:5: (lv_edges_14_0= ruleGraphEdge )
                    // InternalTyphonML.g:3730:6: lv_edges_14_0= ruleGraphEdge
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_edges_14_0=ruleGraphEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphDBRule());
                    						}
                    						add(
                    							current,
                    							"edges",
                    							lv_edges_14_0,
                    							"it.univaq.disim.typhon.TyphonML.GraphEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3747:4: (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==13) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalTyphonML.g:3748:5: otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_60); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGraphDBAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3752:5: ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    // InternalTyphonML.g:3753:6: (lv_edges_16_0= ruleGraphEdge )
                    	    {
                    	    // InternalTyphonML.g:3753:6: (lv_edges_16_0= ruleGraphEdge )
                    	    // InternalTyphonML.g:3754:7: lv_edges_16_0= ruleGraphEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_edges_16_0=ruleGraphEdge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphDBRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edges",
                    	    								lv_edges_16_0,
                    	    								"it.univaq.disim.typhon.TyphonML.GraphEdge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleGraphDB"


    // $ANTLR start "entryRuleColumnDB"
    // InternalTyphonML.g:3785:1: entryRuleColumnDB returns [EObject current=null] : iv_ruleColumnDB= ruleColumnDB EOF ;
    public final EObject entryRuleColumnDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDB = null;


        try {
            // InternalTyphonML.g:3785:49: (iv_ruleColumnDB= ruleColumnDB EOF )
            // InternalTyphonML.g:3786:2: iv_ruleColumnDB= ruleColumnDB EOF
            {
             newCompositeNode(grammarAccess.getColumnDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnDB=ruleColumnDB();

            state._fsp--;

             current =iv_ruleColumnDB; 
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
    // $ANTLR end "entryRuleColumnDB"


    // $ANTLR start "ruleColumnDB"
    // InternalTyphonML.g:3792:1: ruleColumnDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleColumnDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_columns_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3798:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:3799:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:3799:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:3800:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:3800:3: ()
            // InternalTyphonML.g:3801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDBAccess().getColumnDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3807:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==32) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalTyphonML.g:3808:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3812:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3813:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3813:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3814:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDBAccess().getColumndbKeyword_2());
            		
            // InternalTyphonML.g:3836:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3837:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3837:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3838:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_62); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3859:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==60) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTyphonML.g:3860:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnDBAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,30,FOLLOW_63); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3868:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalTyphonML.g:3869:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalTyphonML.g:3869:5: (lv_columns_8_0= ruleColumn )
                    // InternalTyphonML.g:3870:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_columns_8_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnDBRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_8_0,
                    							"it.univaq.disim.typhon.TyphonML.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3887:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==13) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalTyphonML.g:3888:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_63); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getColumnDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3892:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalTyphonML.g:3893:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalTyphonML.g:3893:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalTyphonML.g:3894:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_columns_10_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnDBRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_10_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getColumnDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getColumnDBAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleColumnDB"


    // $ANTLR start "entryRuleGraphEdge_Impl"
    // InternalTyphonML.g:3925:1: entryRuleGraphEdge_Impl returns [EObject current=null] : iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF ;
    public final EObject entryRuleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge_Impl = null;


        try {
            // InternalTyphonML.g:3925:55: (iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF )
            // InternalTyphonML.g:3926:2: iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF
            {
             newCompositeNode(grammarAccess.getGraphEdge_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphEdge_Impl=ruleGraphEdge_Impl();

            state._fsp--;

             current =iv_ruleGraphEdge_Impl; 
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
    // $ANTLR end "entryRuleGraphEdge_Impl"


    // $ANTLR start "ruleGraphEdge_Impl"
    // InternalTyphonML.g:3932:1: ruleGraphEdge_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_labels_12_0 = null;

        EObject lv_labels_14_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3938:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3939:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3939:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3940:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3940:3: ()
            // InternalTyphonML.g:3941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3947:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==32) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTyphonML.g:3948:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3952:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3953:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3953:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3954:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,61,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdge_ImplAccess().getEdgeKeyword_2());
            		
            // InternalTyphonML.g:3976:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3977:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3977:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3978:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphEdge_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_65); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3999:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==62) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTyphonML.g:4000:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdge_ImplAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:4004:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4005:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4005:5: ( ruleEString )
                    // InternalTyphonML.g:4006:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4021:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==63) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTyphonML.g:4022:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphEdge_ImplAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:4026:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4027:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4027:5: ( ruleEString )
                    // InternalTyphonML.g:4028:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4043:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==64) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTyphonML.g:4044:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,64,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphEdge_ImplAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:4052:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:4053:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:4053:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:4054:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_labels_12_0=ruleGraphEdgeLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    						add(
                    							current,
                    							"labels",
                    							lv_labels_12_0,
                    							"it.univaq.disim.typhon.TyphonML.GraphEdgeLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:4071:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==13) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalTyphonML.g:4072:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getGraphEdge_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:4076:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:4077:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:4077:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:4078:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_labels_14_0=ruleGraphEdgeLabel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphEdge_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"labels",
                    	    								lv_labels_14_0,
                    	    								"it.univaq.disim.typhon.TyphonML.GraphEdgeLabel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_15, grammarAccess.getGraphEdge_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getGraphEdge_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGraphEdge_Impl"


    // $ANTLR start "entryRuleGraphEdgeLabel"
    // InternalTyphonML.g:4109:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:4109:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:4110:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
            {
             newCompositeNode(grammarAccess.getGraphEdgeLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphEdgeLabel=ruleGraphEdgeLabel();

            state._fsp--;

             current =iv_ruleGraphEdgeLabel; 
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
    // $ANTLR end "entryRuleGraphEdgeLabel"


    // $ANTLR start "ruleGraphEdgeLabel"
    // InternalTyphonML.g:4116:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4122:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4123:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4123:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4124:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4124:3: ()
            // InternalTyphonML.g:4125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4131:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==32) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTyphonML.g:4132:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4136:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4137:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4137:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4138:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphEdgeLabelRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4156:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4157:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4157:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4158:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphEdgeLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:4179:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4180:4: ( ruleEString )
            {
            // InternalTyphonML.g:4180:4: ( ruleEString )
            // InternalTyphonML.g:4181:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphEdgeLabelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleGraphEdgeLabel"


    // $ANTLR start "entryRuleGraphAttribute_Impl"
    // InternalTyphonML.g:4199:1: entryRuleGraphAttribute_Impl returns [EObject current=null] : iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF ;
    public final EObject entryRuleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute_Impl = null;


        try {
            // InternalTyphonML.g:4199:60: (iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF )
            // InternalTyphonML.g:4200:2: iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF
            {
             newCompositeNode(grammarAccess.getGraphAttribute_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphAttribute_Impl=ruleGraphAttribute_Impl();

            state._fsp--;

             current =iv_ruleGraphAttribute_Impl; 
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
    // $ANTLR end "entryRuleGraphAttribute_Impl"


    // $ANTLR start "ruleGraphAttribute_Impl"
    // InternalTyphonML.g:4206:1: ruleGraphAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) ;
    public final EObject ruleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4212:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:4213:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:4213:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            // InternalTyphonML.g:4214:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:4214:3: ()
            // InternalTyphonML.g:4215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4221:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==32) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalTyphonML.g:4222:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4226:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4227:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4227:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4228:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphAttribute_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4246:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4247:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4247:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4248:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_68);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphAttribute_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,65,FOLLOW_69); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAttribute_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalTyphonML.g:4269:3: ( ( ruleEString ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_STRING && LA85_0<=RULE_ID)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalTyphonML.g:4270:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:4270:4: ( ruleEString )
                    // InternalTyphonML.g:4271:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGraphAttribute_ImplRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getValueAttributeCrossReference_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleGraphAttribute_Impl"


    // $ANTLR start "entryRuleChangeOperator"
    // InternalTyphonML.g:4289:1: entryRuleChangeOperator returns [EObject current=null] : iv_ruleChangeOperator= ruleChangeOperator EOF ;
    public final EObject entryRuleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeOperator = null;


        try {
            // InternalTyphonML.g:4289:55: (iv_ruleChangeOperator= ruleChangeOperator EOF )
            // InternalTyphonML.g:4290:2: iv_ruleChangeOperator= ruleChangeOperator EOF
            {
             newCompositeNode(grammarAccess.getChangeOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeOperator=ruleChangeOperator();

            state._fsp--;

             current =iv_ruleChangeOperator; 
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
    // $ANTLR end "entryRuleChangeOperator"


    // $ANTLR start "ruleChangeOperator"
    // InternalTyphonML.g:4296:1: ruleChangeOperator returns [EObject current=null] : (this_AddEntity_0= ruleAddEntity | this_RenameEntity_1= ruleRenameEntity | this_RemoveEntity_2= ruleRemoveEntity | this_RemoveAttribute_3= ruleRemoveAttribute | this_RenameAttribute_4= ruleRenameAttribute | this_ChangeRelationContainement_5= ruleChangeRelationContainement | this_AddRelation_6= ruleAddRelation | this_RemoveRelation_7= ruleRemoveRelation | this_RenameRelation_8= ruleRenameRelation | this_EnableRelationContainment_9= ruleEnableRelationContainment | this_DisableRelationContainment_10= ruleDisableRelationContainment | this_EnableBidirectionalRelation_11= ruleEnableBidirectionalRelation | this_DisableBidirectionalRelation_12= ruleDisableBidirectionalRelation | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_SplitEntity_14= ruleSplitEntity | this_SplitEntityVertical_15= ruleSplitEntityVertical | this_SplitEntityHorizontal_16= ruleSplitEntityHorizontal | this_MigrateEntity_17= ruleMigrateEntity | this_MergeEntity_18= ruleMergeEntity | this_RenameTable_19= ruleRenameTable | this_AddIndex_20= ruleAddIndex | this_DropIndex_21= ruleDropIndex | this_AddAttributesToIndex_22= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_23= ruleRemoveAttributesToIndex | this_RenameCollection_24= ruleRenameCollection | this_AddCollectionIndex_25= ruleAddCollectionIndex | this_DropCollectionIndex_26= ruleDropCollectionIndex | this_AddGraphAttribute_27= ruleAddGraphAttribute | this_RemoveGraphAttribute_28= ruleRemoveGraphAttribute | this_AddGraphEdge_29= ruleAddGraphEdge | this_RemoveGraphEdge_30= ruleRemoveGraphEdge | this_RenabeGraphEdgeLabel_31= ruleRenabeGraphEdgeLabel | this_AddCustomDataTypeAttribute_32= ruleAddCustomDataTypeAttribute | this_ChangePrimitiveDataTypeAttribute_33= ruleChangePrimitiveDataTypeAttribute | this_ChangeCustomDataTypeAttribute_34= ruleChangeCustomDataTypeAttribute ) ;
    public final EObject ruleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AddEntity_0 = null;

        EObject this_RenameEntity_1 = null;

        EObject this_RemoveEntity_2 = null;

        EObject this_RemoveAttribute_3 = null;

        EObject this_RenameAttribute_4 = null;

        EObject this_ChangeRelationContainement_5 = null;

        EObject this_AddRelation_6 = null;

        EObject this_RemoveRelation_7 = null;

        EObject this_RenameRelation_8 = null;

        EObject this_EnableRelationContainment_9 = null;

        EObject this_DisableRelationContainment_10 = null;

        EObject this_EnableBidirectionalRelation_11 = null;

        EObject this_DisableBidirectionalRelation_12 = null;

        EObject this_ChangeRelationCardinality_13 = null;

        EObject this_SplitEntity_14 = null;

        EObject this_SplitEntityVertical_15 = null;

        EObject this_SplitEntityHorizontal_16 = null;

        EObject this_MigrateEntity_17 = null;

        EObject this_MergeEntity_18 = null;

        EObject this_RenameTable_19 = null;

        EObject this_AddIndex_20 = null;

        EObject this_DropIndex_21 = null;

        EObject this_AddAttributesToIndex_22 = null;

        EObject this_RemoveAttributesToIndex_23 = null;

        EObject this_RenameCollection_24 = null;

        EObject this_AddCollectionIndex_25 = null;

        EObject this_DropCollectionIndex_26 = null;

        EObject this_AddGraphAttribute_27 = null;

        EObject this_RemoveGraphAttribute_28 = null;

        EObject this_AddGraphEdge_29 = null;

        EObject this_RemoveGraphEdge_30 = null;

        EObject this_RenabeGraphEdgeLabel_31 = null;

        EObject this_AddCustomDataTypeAttribute_32 = null;

        EObject this_ChangePrimitiveDataTypeAttribute_33 = null;

        EObject this_ChangeCustomDataTypeAttribute_34 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4302:2: ( (this_AddEntity_0= ruleAddEntity | this_RenameEntity_1= ruleRenameEntity | this_RemoveEntity_2= ruleRemoveEntity | this_RemoveAttribute_3= ruleRemoveAttribute | this_RenameAttribute_4= ruleRenameAttribute | this_ChangeRelationContainement_5= ruleChangeRelationContainement | this_AddRelation_6= ruleAddRelation | this_RemoveRelation_7= ruleRemoveRelation | this_RenameRelation_8= ruleRenameRelation | this_EnableRelationContainment_9= ruleEnableRelationContainment | this_DisableRelationContainment_10= ruleDisableRelationContainment | this_EnableBidirectionalRelation_11= ruleEnableBidirectionalRelation | this_DisableBidirectionalRelation_12= ruleDisableBidirectionalRelation | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_SplitEntity_14= ruleSplitEntity | this_SplitEntityVertical_15= ruleSplitEntityVertical | this_SplitEntityHorizontal_16= ruleSplitEntityHorizontal | this_MigrateEntity_17= ruleMigrateEntity | this_MergeEntity_18= ruleMergeEntity | this_RenameTable_19= ruleRenameTable | this_AddIndex_20= ruleAddIndex | this_DropIndex_21= ruleDropIndex | this_AddAttributesToIndex_22= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_23= ruleRemoveAttributesToIndex | this_RenameCollection_24= ruleRenameCollection | this_AddCollectionIndex_25= ruleAddCollectionIndex | this_DropCollectionIndex_26= ruleDropCollectionIndex | this_AddGraphAttribute_27= ruleAddGraphAttribute | this_RemoveGraphAttribute_28= ruleRemoveGraphAttribute | this_AddGraphEdge_29= ruleAddGraphEdge | this_RemoveGraphEdge_30= ruleRemoveGraphEdge | this_RenabeGraphEdgeLabel_31= ruleRenabeGraphEdgeLabel | this_AddCustomDataTypeAttribute_32= ruleAddCustomDataTypeAttribute | this_ChangePrimitiveDataTypeAttribute_33= ruleChangePrimitiveDataTypeAttribute | this_ChangeCustomDataTypeAttribute_34= ruleChangeCustomDataTypeAttribute ) )
            // InternalTyphonML.g:4303:2: (this_AddEntity_0= ruleAddEntity | this_RenameEntity_1= ruleRenameEntity | this_RemoveEntity_2= ruleRemoveEntity | this_RemoveAttribute_3= ruleRemoveAttribute | this_RenameAttribute_4= ruleRenameAttribute | this_ChangeRelationContainement_5= ruleChangeRelationContainement | this_AddRelation_6= ruleAddRelation | this_RemoveRelation_7= ruleRemoveRelation | this_RenameRelation_8= ruleRenameRelation | this_EnableRelationContainment_9= ruleEnableRelationContainment | this_DisableRelationContainment_10= ruleDisableRelationContainment | this_EnableBidirectionalRelation_11= ruleEnableBidirectionalRelation | this_DisableBidirectionalRelation_12= ruleDisableBidirectionalRelation | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_SplitEntity_14= ruleSplitEntity | this_SplitEntityVertical_15= ruleSplitEntityVertical | this_SplitEntityHorizontal_16= ruleSplitEntityHorizontal | this_MigrateEntity_17= ruleMigrateEntity | this_MergeEntity_18= ruleMergeEntity | this_RenameTable_19= ruleRenameTable | this_AddIndex_20= ruleAddIndex | this_DropIndex_21= ruleDropIndex | this_AddAttributesToIndex_22= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_23= ruleRemoveAttributesToIndex | this_RenameCollection_24= ruleRenameCollection | this_AddCollectionIndex_25= ruleAddCollectionIndex | this_DropCollectionIndex_26= ruleDropCollectionIndex | this_AddGraphAttribute_27= ruleAddGraphAttribute | this_RemoveGraphAttribute_28= ruleRemoveGraphAttribute | this_AddGraphEdge_29= ruleAddGraphEdge | this_RemoveGraphEdge_30= ruleRemoveGraphEdge | this_RenabeGraphEdgeLabel_31= ruleRenabeGraphEdgeLabel | this_AddCustomDataTypeAttribute_32= ruleAddCustomDataTypeAttribute | this_ChangePrimitiveDataTypeAttribute_33= ruleChangePrimitiveDataTypeAttribute | this_ChangeCustomDataTypeAttribute_34= ruleChangeCustomDataTypeAttribute )
            {
            // InternalTyphonML.g:4303:2: (this_AddEntity_0= ruleAddEntity | this_RenameEntity_1= ruleRenameEntity | this_RemoveEntity_2= ruleRemoveEntity | this_RemoveAttribute_3= ruleRemoveAttribute | this_RenameAttribute_4= ruleRenameAttribute | this_ChangeRelationContainement_5= ruleChangeRelationContainement | this_AddRelation_6= ruleAddRelation | this_RemoveRelation_7= ruleRemoveRelation | this_RenameRelation_8= ruleRenameRelation | this_EnableRelationContainment_9= ruleEnableRelationContainment | this_DisableRelationContainment_10= ruleDisableRelationContainment | this_EnableBidirectionalRelation_11= ruleEnableBidirectionalRelation | this_DisableBidirectionalRelation_12= ruleDisableBidirectionalRelation | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_SplitEntity_14= ruleSplitEntity | this_SplitEntityVertical_15= ruleSplitEntityVertical | this_SplitEntityHorizontal_16= ruleSplitEntityHorizontal | this_MigrateEntity_17= ruleMigrateEntity | this_MergeEntity_18= ruleMergeEntity | this_RenameTable_19= ruleRenameTable | this_AddIndex_20= ruleAddIndex | this_DropIndex_21= ruleDropIndex | this_AddAttributesToIndex_22= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_23= ruleRemoveAttributesToIndex | this_RenameCollection_24= ruleRenameCollection | this_AddCollectionIndex_25= ruleAddCollectionIndex | this_DropCollectionIndex_26= ruleDropCollectionIndex | this_AddGraphAttribute_27= ruleAddGraphAttribute | this_RemoveGraphAttribute_28= ruleRemoveGraphAttribute | this_AddGraphEdge_29= ruleAddGraphEdge | this_RemoveGraphEdge_30= ruleRemoveGraphEdge | this_RenabeGraphEdgeLabel_31= ruleRenabeGraphEdgeLabel | this_AddCustomDataTypeAttribute_32= ruleAddCustomDataTypeAttribute | this_ChangePrimitiveDataTypeAttribute_33= ruleChangePrimitiveDataTypeAttribute | this_ChangeCustomDataTypeAttribute_34= ruleChangeCustomDataTypeAttribute )
            int alt86=35;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalTyphonML.g:4304:3: this_AddEntity_0= ruleAddEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddEntity_0=ruleAddEntity();

                    state._fsp--;


                    			current = this_AddEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:4313:3: this_RenameEntity_1= ruleRenameEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameEntity_1=ruleRenameEntity();

                    state._fsp--;


                    			current = this_RenameEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:4322:3: this_RemoveEntity_2= ruleRemoveEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveEntityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveEntity_2=ruleRemoveEntity();

                    state._fsp--;


                    			current = this_RemoveEntity_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:4331:3: this_RemoveAttribute_3= ruleRemoveAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttribute_3=ruleRemoveAttribute();

                    state._fsp--;


                    			current = this_RemoveAttribute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:4340:3: this_RenameAttribute_4= ruleRenameAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameAttributeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameAttribute_4=ruleRenameAttribute();

                    state._fsp--;


                    			current = this_RenameAttribute_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:4349:3: this_ChangeRelationContainement_5= ruleChangeRelationContainement
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeRelationContainementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeRelationContainement_5=ruleChangeRelationContainement();

                    state._fsp--;


                    			current = this_ChangeRelationContainement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:4358:3: this_AddRelation_6= ruleAddRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddRelationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRelation_6=ruleAddRelation();

                    state._fsp--;


                    			current = this_AddRelation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:4367:3: this_RemoveRelation_7= ruleRemoveRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveRelationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveRelation_7=ruleRemoveRelation();

                    state._fsp--;


                    			current = this_RemoveRelation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:4376:3: this_RenameRelation_8= ruleRenameRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameRelationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameRelation_8=ruleRenameRelation();

                    state._fsp--;


                    			current = this_RenameRelation_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:4385:3: this_EnableRelationContainment_9= ruleEnableRelationContainment
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getEnableRelationContainmentParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnableRelationContainment_9=ruleEnableRelationContainment();

                    state._fsp--;


                    			current = this_EnableRelationContainment_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:4394:3: this_DisableRelationContainment_10= ruleDisableRelationContainment
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getDisableRelationContainmentParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisableRelationContainment_10=ruleDisableRelationContainment();

                    state._fsp--;


                    			current = this_DisableRelationContainment_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:4403:3: this_EnableBidirectionalRelation_11= ruleEnableBidirectionalRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getEnableBidirectionalRelationParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnableBidirectionalRelation_11=ruleEnableBidirectionalRelation();

                    state._fsp--;


                    			current = this_EnableBidirectionalRelation_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTyphonML.g:4412:3: this_DisableBidirectionalRelation_12= ruleDisableBidirectionalRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getDisableBidirectionalRelationParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisableBidirectionalRelation_12=ruleDisableBidirectionalRelation();

                    state._fsp--;


                    			current = this_DisableBidirectionalRelation_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTyphonML.g:4421:3: this_ChangeRelationCardinality_13= ruleChangeRelationCardinality
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeRelationCardinalityParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeRelationCardinality_13=ruleChangeRelationCardinality();

                    state._fsp--;


                    			current = this_ChangeRelationCardinality_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTyphonML.g:4430:3: this_SplitEntity_14= ruleSplitEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getSplitEntityParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntity_14=ruleSplitEntity();

                    state._fsp--;


                    			current = this_SplitEntity_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTyphonML.g:4439:3: this_SplitEntityVertical_15= ruleSplitEntityVertical
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getSplitEntityVerticalParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntityVertical_15=ruleSplitEntityVertical();

                    state._fsp--;


                    			current = this_SplitEntityVertical_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTyphonML.g:4448:3: this_SplitEntityHorizontal_16= ruleSplitEntityHorizontal
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getSplitEntityHorizontalParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntityHorizontal_16=ruleSplitEntityHorizontal();

                    state._fsp--;


                    			current = this_SplitEntityHorizontal_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTyphonML.g:4457:3: this_MigrateEntity_17= ruleMigrateEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getMigrateEntityParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_MigrateEntity_17=ruleMigrateEntity();

                    state._fsp--;


                    			current = this_MigrateEntity_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTyphonML.g:4466:3: this_MergeEntity_18= ruleMergeEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getMergeEntityParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeEntity_18=ruleMergeEntity();

                    state._fsp--;


                    			current = this_MergeEntity_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTyphonML.g:4475:3: this_RenameTable_19= ruleRenameTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameTableParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameTable_19=ruleRenameTable();

                    state._fsp--;


                    			current = this_RenameTable_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalTyphonML.g:4484:3: this_AddIndex_20= ruleAddIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddIndexParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddIndex_20=ruleAddIndex();

                    state._fsp--;


                    			current = this_AddIndex_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalTyphonML.g:4493:3: this_DropIndex_21= ruleDropIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getDropIndexParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropIndex_21=ruleDropIndex();

                    state._fsp--;


                    			current = this_DropIndex_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalTyphonML.g:4502:3: this_AddAttributesToIndex_22= ruleAddAttributesToIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddAttributesToIndexParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttributesToIndex_22=ruleAddAttributesToIndex();

                    state._fsp--;


                    			current = this_AddAttributesToIndex_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalTyphonML.g:4511:3: this_RemoveAttributesToIndex_23= ruleRemoveAttributesToIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributesToIndexParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttributesToIndex_23=ruleRemoveAttributesToIndex();

                    state._fsp--;


                    			current = this_RemoveAttributesToIndex_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalTyphonML.g:4520:3: this_RenameCollection_24= ruleRenameCollection
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameCollectionParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameCollection_24=ruleRenameCollection();

                    state._fsp--;


                    			current = this_RenameCollection_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalTyphonML.g:4529:3: this_AddCollectionIndex_25= ruleAddCollectionIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddCollectionIndexParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCollectionIndex_25=ruleAddCollectionIndex();

                    state._fsp--;


                    			current = this_AddCollectionIndex_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalTyphonML.g:4538:3: this_DropCollectionIndex_26= ruleDropCollectionIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getDropCollectionIndexParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropCollectionIndex_26=ruleDropCollectionIndex();

                    state._fsp--;


                    			current = this_DropCollectionIndex_26;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 28 :
                    // InternalTyphonML.g:4547:3: this_AddGraphAttribute_27= ruleAddGraphAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddGraphAttributeParserRuleCall_27());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddGraphAttribute_27=ruleAddGraphAttribute();

                    state._fsp--;


                    			current = this_AddGraphAttribute_27;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 29 :
                    // InternalTyphonML.g:4556:3: this_RemoveGraphAttribute_28= ruleRemoveGraphAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveGraphAttributeParserRuleCall_28());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveGraphAttribute_28=ruleRemoveGraphAttribute();

                    state._fsp--;


                    			current = this_RemoveGraphAttribute_28;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 30 :
                    // InternalTyphonML.g:4565:3: this_AddGraphEdge_29= ruleAddGraphEdge
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddGraphEdgeParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddGraphEdge_29=ruleAddGraphEdge();

                    state._fsp--;


                    			current = this_AddGraphEdge_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 31 :
                    // InternalTyphonML.g:4574:3: this_RemoveGraphEdge_30= ruleRemoveGraphEdge
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveGraphEdgeParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveGraphEdge_30=ruleRemoveGraphEdge();

                    state._fsp--;


                    			current = this_RemoveGraphEdge_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 32 :
                    // InternalTyphonML.g:4583:3: this_RenabeGraphEdgeLabel_31= ruleRenabeGraphEdgeLabel
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenabeGraphEdgeLabelParserRuleCall_31());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenabeGraphEdgeLabel_31=ruleRenabeGraphEdgeLabel();

                    state._fsp--;


                    			current = this_RenabeGraphEdgeLabel_31;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 33 :
                    // InternalTyphonML.g:4592:3: this_AddCustomDataTypeAttribute_32= ruleAddCustomDataTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddCustomDataTypeAttributeParserRuleCall_32());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCustomDataTypeAttribute_32=ruleAddCustomDataTypeAttribute();

                    state._fsp--;


                    			current = this_AddCustomDataTypeAttribute_32;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 34 :
                    // InternalTyphonML.g:4601:3: this_ChangePrimitiveDataTypeAttribute_33= ruleChangePrimitiveDataTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangePrimitiveDataTypeAttributeParserRuleCall_33());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangePrimitiveDataTypeAttribute_33=ruleChangePrimitiveDataTypeAttribute();

                    state._fsp--;


                    			current = this_ChangePrimitiveDataTypeAttribute_33;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 35 :
                    // InternalTyphonML.g:4610:3: this_ChangeCustomDataTypeAttribute_34= ruleChangeCustomDataTypeAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeCustomDataTypeAttributeParserRuleCall_34());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeCustomDataTypeAttribute_34=ruleChangeCustomDataTypeAttribute();

                    state._fsp--;


                    			current = this_ChangeCustomDataTypeAttribute_34;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleChangeOperator"


    // $ANTLR start "entryRuleAddCustomDataTypeAttribute"
    // InternalTyphonML.g:4622:1: entryRuleAddCustomDataTypeAttribute returns [EObject current=null] : iv_ruleAddCustomDataTypeAttribute= ruleAddCustomDataTypeAttribute EOF ;
    public final EObject entryRuleAddCustomDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCustomDataTypeAttribute = null;


        try {
            // InternalTyphonML.g:4622:67: (iv_ruleAddCustomDataTypeAttribute= ruleAddCustomDataTypeAttribute EOF )
            // InternalTyphonML.g:4623:2: iv_ruleAddCustomDataTypeAttribute= ruleAddCustomDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getAddCustomDataTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddCustomDataTypeAttribute=ruleAddCustomDataTypeAttribute();

            state._fsp--;

             current =iv_ruleAddCustomDataTypeAttribute; 
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
    // $ANTLR end "entryRuleAddCustomDataTypeAttribute"


    // $ANTLR start "ruleAddCustomDataTypeAttribute"
    // InternalTyphonML.g:4629:1: ruleAddCustomDataTypeAttribute returns [EObject current=null] : (otherlv_0= 'AddCustomDataTypeAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'ownerEntity' ( ( ruleEString ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleDataType ) ) otherlv_9= '}' ) ;
    public final EObject ruleAddCustomDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;

        EObject lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4635:2: ( (otherlv_0= 'AddCustomDataTypeAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'ownerEntity' ( ( ruleEString ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleDataType ) ) otherlv_9= '}' ) )
            // InternalTyphonML.g:4636:2: (otherlv_0= 'AddCustomDataTypeAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'ownerEntity' ( ( ruleEString ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleDataType ) ) otherlv_9= '}' )
            {
            // InternalTyphonML.g:4636:2: (otherlv_0= 'AddCustomDataTypeAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'ownerEntity' ( ( ruleEString ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleDataType ) ) otherlv_9= '}' )
            // InternalTyphonML.g:4637:3: otherlv_0= 'AddCustomDataTypeAttribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'ownerEntity' ( ( ruleEString ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleDataType ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAddCustomDataTypeAttributeAccess().getAddCustomDataTypeAttributeKeyword_0());
            		
            // InternalTyphonML.g:4641:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:4642:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:4642:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:4643:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddCustomDataTypeAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddCustomDataTypeAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getAddCustomDataTypeAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:4664:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==32) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalTyphonML.g:4665:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddCustomDataTypeAttributeAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:4669:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:4670:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:4670:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:4671:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddCustomDataTypeAttributeAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddCustomDataTypeAttributeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_4_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAddCustomDataTypeAttributeAccess().getOwnerEntityKeyword_4());
            		
            // InternalTyphonML.g:4693:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4694:4: ( ruleEString )
            {
            // InternalTyphonML.g:4694:4: ( ruleEString )
            // InternalTyphonML.g:4695:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddCustomDataTypeAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddCustomDataTypeAttributeAccess().getOwnerEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_72);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,68,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getAddCustomDataTypeAttributeAccess().getTypeKeyword_6());
            		
            // InternalTyphonML.g:4713:3: ( (lv_type_8_0= ruleDataType ) )
            // InternalTyphonML.g:4714:4: (lv_type_8_0= ruleDataType )
            {
            // InternalTyphonML.g:4714:4: (lv_type_8_0= ruleDataType )
            // InternalTyphonML.g:4715:5: lv_type_8_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAddCustomDataTypeAttributeAccess().getTypeDataTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_37);
            lv_type_8_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddCustomDataTypeAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"it.univaq.disim.typhon.TyphonML.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAddCustomDataTypeAttributeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAddCustomDataTypeAttribute"


    // $ANTLR start "entryRuleChangePrimitiveDataTypeAttribute"
    // InternalTyphonML.g:4740:1: entryRuleChangePrimitiveDataTypeAttribute returns [EObject current=null] : iv_ruleChangePrimitiveDataTypeAttribute= ruleChangePrimitiveDataTypeAttribute EOF ;
    public final EObject entryRuleChangePrimitiveDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePrimitiveDataTypeAttribute = null;


        try {
            // InternalTyphonML.g:4740:73: (iv_ruleChangePrimitiveDataTypeAttribute= ruleChangePrimitiveDataTypeAttribute EOF )
            // InternalTyphonML.g:4741:2: iv_ruleChangePrimitiveDataTypeAttribute= ruleChangePrimitiveDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getChangePrimitiveDataTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangePrimitiveDataTypeAttribute=ruleChangePrimitiveDataTypeAttribute();

            state._fsp--;

             current =iv_ruleChangePrimitiveDataTypeAttribute; 
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
    // $ANTLR end "entryRuleChangePrimitiveDataTypeAttribute"


    // $ANTLR start "ruleChangePrimitiveDataTypeAttribute"
    // InternalTyphonML.g:4747:1: ruleChangePrimitiveDataTypeAttribute returns [EObject current=null] : (otherlv_0= 'ChangePrimitiveDataTypeAttribute' otherlv_1= '{' (otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) ) )? otherlv_4= 'attributeToChange' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleChangePrimitiveDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_maxSize_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4753:2: ( (otherlv_0= 'ChangePrimitiveDataTypeAttribute' otherlv_1= '{' (otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) ) )? otherlv_4= 'attributeToChange' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalTyphonML.g:4754:2: (otherlv_0= 'ChangePrimitiveDataTypeAttribute' otherlv_1= '{' (otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) ) )? otherlv_4= 'attributeToChange' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalTyphonML.g:4754:2: (otherlv_0= 'ChangePrimitiveDataTypeAttribute' otherlv_1= '{' (otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) ) )? otherlv_4= 'attributeToChange' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalTyphonML.g:4755:3: otherlv_0= 'ChangePrimitiveDataTypeAttribute' otherlv_1= '{' (otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) ) )? otherlv_4= 'attributeToChange' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getChangePrimitiveDataTypeAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTyphonML.g:4763:3: (otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==70) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTyphonML.g:4764:4: otherlv_2= 'maxSize' ( (lv_maxSize_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getMaxSizeKeyword_2_0());
                    			
                    // InternalTyphonML.g:4768:4: ( (lv_maxSize_3_0= ruleEInt ) )
                    // InternalTyphonML.g:4769:5: (lv_maxSize_3_0= ruleEInt )
                    {
                    // InternalTyphonML.g:4769:5: (lv_maxSize_3_0= ruleEInt )
                    // InternalTyphonML.g:4770:6: lv_maxSize_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getMaxSizeEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_maxSize_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangePrimitiveDataTypeAttributeRule());
                    						}
                    						set(
                    							current,
                    							"maxSize",
                    							lv_maxSize_3_0,
                    							"it.univaq.disim.typhon.TyphonML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,71,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getAttributeToChangeKeyword_3());
            		
            // InternalTyphonML.g:4792:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4793:4: ( ruleEString )
            {
            // InternalTyphonML.g:4793:4: ( ruleEString )
            // InternalTyphonML.g:4794:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangePrimitiveDataTypeAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getAttributeToChangeAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangePrimitiveDataTypeAttributeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleChangePrimitiveDataTypeAttribute"


    // $ANTLR start "entryRuleChangeCustomDataTypeAttribute"
    // InternalTyphonML.g:4816:1: entryRuleChangeCustomDataTypeAttribute returns [EObject current=null] : iv_ruleChangeCustomDataTypeAttribute= ruleChangeCustomDataTypeAttribute EOF ;
    public final EObject entryRuleChangeCustomDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeCustomDataTypeAttribute = null;


        try {
            // InternalTyphonML.g:4816:70: (iv_ruleChangeCustomDataTypeAttribute= ruleChangeCustomDataTypeAttribute EOF )
            // InternalTyphonML.g:4817:2: iv_ruleChangeCustomDataTypeAttribute= ruleChangeCustomDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getChangeCustomDataTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeCustomDataTypeAttribute=ruleChangeCustomDataTypeAttribute();

            state._fsp--;

             current =iv_ruleChangeCustomDataTypeAttribute; 
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
    // $ANTLR end "entryRuleChangeCustomDataTypeAttribute"


    // $ANTLR start "ruleChangeCustomDataTypeAttribute"
    // InternalTyphonML.g:4823:1: ruleChangeCustomDataTypeAttribute returns [EObject current=null] : (otherlv_0= 'ChangeCustomDataTypeAttribute' otherlv_1= '{' otherlv_2= 'attributeToChange' ( ( ruleEString ) ) otherlv_4= 'newType' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleChangeCustomDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:4829:2: ( (otherlv_0= 'ChangeCustomDataTypeAttribute' otherlv_1= '{' otherlv_2= 'attributeToChange' ( ( ruleEString ) ) otherlv_4= 'newType' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalTyphonML.g:4830:2: (otherlv_0= 'ChangeCustomDataTypeAttribute' otherlv_1= '{' otherlv_2= 'attributeToChange' ( ( ruleEString ) ) otherlv_4= 'newType' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalTyphonML.g:4830:2: (otherlv_0= 'ChangeCustomDataTypeAttribute' otherlv_1= '{' otherlv_2= 'attributeToChange' ( ( ruleEString ) ) otherlv_4= 'newType' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalTyphonML.g:4831:3: otherlv_0= 'ChangeCustomDataTypeAttribute' otherlv_1= '{' otherlv_2= 'attributeToChange' ( ( ruleEString ) ) otherlv_4= 'newType' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeCustomDataTypeAttributeAccess().getChangeCustomDataTypeAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeCustomDataTypeAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeCustomDataTypeAttributeAccess().getAttributeToChangeKeyword_2());
            		
            // InternalTyphonML.g:4843:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4844:4: ( ruleEString )
            {
            // InternalTyphonML.g:4844:4: ( ruleEString )
            // InternalTyphonML.g:4845:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeCustomDataTypeAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeCustomDataTypeAttributeAccess().getAttributeToChangeAttributeCrossReference_3_0());
            				
            pushFollow(FOLLOW_75);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,73,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeCustomDataTypeAttributeAccess().getNewTypeKeyword_4());
            		
            // InternalTyphonML.g:4863:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4864:4: ( ruleEString )
            {
            // InternalTyphonML.g:4864:4: ( ruleEString )
            // InternalTyphonML.g:4865:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeCustomDataTypeAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeCustomDataTypeAttributeAccess().getNewTypeCustomDataTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeCustomDataTypeAttributeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleChangeCustomDataTypeAttribute"


    // $ANTLR start "entryRuleAddEntity"
    // InternalTyphonML.g:4887:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalTyphonML.g:4887:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalTyphonML.g:4888:2: iv_ruleAddEntity= ruleAddEntity EOF
            {
             newCompositeNode(grammarAccess.getAddEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddEntity=ruleAddEntity();

            state._fsp--;

             current =iv_ruleAddEntity; 
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
    // $ANTLR end "entryRuleAddEntity"


    // $ANTLR start "ruleAddEntity"
    // InternalTyphonML.g:4894:1: ruleAddEntity returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' ) ;
    public final EObject ruleAddEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_relations_14_0 = null;

        EObject lv_relations_16_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4900:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:4901:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:4901:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' )
            // InternalTyphonML.g:4902:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:4902:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==32) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalTyphonML.g:4903:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddEntityAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:4907:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:4908:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:4908:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:4909:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,74,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAddEntityAccess().getAddKeyword_1());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddEntityAccess().getEntityKeyword_2());
            		
            // InternalTyphonML.g:4935:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4936:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4936:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4937:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_77); 

            			newLeafNode(otherlv_5, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4958:3: (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==46) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalTyphonML.g:4959:4: otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )* otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddEntityAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_78); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddEntityAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4967:4: ( ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( ((LA91_0>=RULE_STRING && LA91_0<=RULE_ID)||LA91_0==32||LA91_0==66) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalTyphonML.g:4968:5: ( (lv_attributes_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )*
                    	    {
                    	    // InternalTyphonML.g:4968:5: ( (lv_attributes_8_0= ruleAttribute ) )
                    	    // InternalTyphonML.g:4969:6: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:4969:6: (lv_attributes_8_0= ruleAttribute )
                    	    // InternalTyphonML.g:4970:7: lv_attributes_8_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_5_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_79);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_8_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalTyphonML.g:4987:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )*
                    	    loop90:
                    	    do {
                    	        int alt90=2;
                    	        int LA90_0 = input.LA(1);

                    	        if ( (LA90_0==13) ) {
                    	            alt90=1;
                    	        }


                    	        switch (alt90) {
                    	    	case 1 :
                    	    	    // InternalTyphonML.g:4988:6: otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) )
                    	    	    {
                    	    	    otherlv_9=(Token)match(input,13,FOLLOW_80); 

                    	    	    						newLeafNode(otherlv_9, grammarAccess.getAddEntityAccess().getCommaKeyword_5_2_1_0());
                    	    	    					
                    	    	    // InternalTyphonML.g:4992:6: ( (lv_attributes_10_0= ruleAttribute ) )
                    	    	    // InternalTyphonML.g:4993:7: (lv_attributes_10_0= ruleAttribute )
                    	    	    {
                    	    	    // InternalTyphonML.g:4993:7: (lv_attributes_10_0= ruleAttribute )
                    	    	    // InternalTyphonML.g:4994:8: lv_attributes_10_0= ruleAttribute
                    	    	    {

                    	    	    								newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_5_2_1_1_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_79);
                    	    	    lv_attributes_10_0=ruleAttribute();

                    	    	    state._fsp--;


                    	    	    								if (current==null) {
                    	    	    									current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    	    								}
                    	    	    								add(
                    	    	    									current,
                    	    	    									"attributes",
                    	    	    									lv_attributes_10_0,
                    	    	    									"it.univaq.disim.typhon.TyphonML.Attribute");
                    	    	    								afterParserOrEnumRuleCall();
                    	    	    							

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop90;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_81); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddEntityAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:5018:3: (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==75) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalTyphonML.g:5019:4: otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']'
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddEntityAccess().getRelationsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_82); 

                    				newLeafNode(otherlv_13, grammarAccess.getAddEntityAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:5027:4: ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==32||LA94_0==74) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalTyphonML.g:5028:5: ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )*
                    	    {
                    	    // InternalTyphonML.g:5028:5: ( (lv_relations_14_0= ruleAddRelation ) )
                    	    // InternalTyphonML.g:5029:6: (lv_relations_14_0= ruleAddRelation )
                    	    {
                    	    // InternalTyphonML.g:5029:6: (lv_relations_14_0= ruleAddRelation )
                    	    // InternalTyphonML.g:5030:7: lv_relations_14_0= ruleAddRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsAddRelationParserRuleCall_6_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
                    	    lv_relations_14_0=ruleAddRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relations",
                    	    								lv_relations_14_0,
                    	    								"it.univaq.disim.typhon.TyphonML.AddRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalTyphonML.g:5047:5: (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )*
                    	    loop93:
                    	    do {
                    	        int alt93=2;
                    	        int LA93_0 = input.LA(1);

                    	        if ( (LA93_0==13) ) {
                    	            alt93=1;
                    	        }


                    	        switch (alt93) {
                    	    	case 1 :
                    	    	    // InternalTyphonML.g:5048:6: otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) )
                    	    	    {
                    	    	    otherlv_15=(Token)match(input,13,FOLLOW_84); 

                    	    	    						newLeafNode(otherlv_15, grammarAccess.getAddEntityAccess().getCommaKeyword_6_2_1_0());
                    	    	    					
                    	    	    // InternalTyphonML.g:5052:6: ( (lv_relations_16_0= ruleAddRelation ) )
                    	    	    // InternalTyphonML.g:5053:7: (lv_relations_16_0= ruleAddRelation )
                    	    	    {
                    	    	    // InternalTyphonML.g:5053:7: (lv_relations_16_0= ruleAddRelation )
                    	    	    // InternalTyphonML.g:5054:8: lv_relations_16_0= ruleAddRelation
                    	    	    {

                    	    	    								newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsAddRelationParserRuleCall_6_2_1_1_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_83);
                    	    	    lv_relations_16_0=ruleAddRelation();

                    	    	    state._fsp--;


                    	    	    								if (current==null) {
                    	    	    									current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    	    								}
                    	    	    								add(
                    	    	    									current,
                    	    	    									"relations",
                    	    	    									lv_relations_16_0,
                    	    	    									"it.univaq.disim.typhon.TyphonML.AddRelation");
                    	    	    								afterParserOrEnumRuleCall();
                    	    	    							

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop93;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getAddEntityAccess().getRightSquareBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAddEntity"


    // $ANTLR start "entryRuleRenameEntity"
    // InternalTyphonML.g:5086:1: entryRuleRenameEntity returns [EObject current=null] : iv_ruleRenameEntity= ruleRenameEntity EOF ;
    public final EObject entryRuleRenameEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEntity = null;


        try {
            // InternalTyphonML.g:5086:53: (iv_ruleRenameEntity= ruleRenameEntity EOF )
            // InternalTyphonML.g:5087:2: iv_ruleRenameEntity= ruleRenameEntity EOF
            {
             newCompositeNode(grammarAccess.getRenameEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameEntity=ruleRenameEntity();

            state._fsp--;

             current =iv_ruleRenameEntity; 
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
    // $ANTLR end "entryRuleRenameEntity"


    // $ANTLR start "ruleRenameEntity"
    // InternalTyphonML.g:5093:1: ruleRenameEntity returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newEntityName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5099:2: ( (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:5100:2: (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:5100:2: (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:5101:3: otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameEntityAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:5109:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5110:4: ( ruleEString )
            {
            // InternalTyphonML.g:5110:4: ( ruleEString )
            // InternalTyphonML.g:5111:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameEntityAccess().getEntityToRenameEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameEntityAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:5129:3: ( (lv_newEntityName_4_0= ruleEString ) )
            // InternalTyphonML.g:5130:4: (lv_newEntityName_4_0= ruleEString )
            {
            // InternalTyphonML.g:5130:4: (lv_newEntityName_4_0= ruleEString )
            // InternalTyphonML.g:5131:5: lv_newEntityName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRenameEntityAccess().getNewEntityNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newEntityName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameEntityRule());
            					}
            					set(
            						current,
            						"newEntityName",
            						lv_newEntityName_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleRenameEntity"


    // $ANTLR start "entryRuleRemoveEntity"
    // InternalTyphonML.g:5152:1: entryRuleRemoveEntity returns [EObject current=null] : iv_ruleRemoveEntity= ruleRemoveEntity EOF ;
    public final EObject entryRuleRemoveEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEntity = null;


        try {
            // InternalTyphonML.g:5152:53: (iv_ruleRemoveEntity= ruleRemoveEntity EOF )
            // InternalTyphonML.g:5153:2: iv_ruleRemoveEntity= ruleRemoveEntity EOF
            {
             newCompositeNode(grammarAccess.getRemoveEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveEntity=ruleRemoveEntity();

            state._fsp--;

             current =iv_ruleRemoveEntity; 
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
    // $ANTLR end "entryRuleRemoveEntity"


    // $ANTLR start "ruleRemoveEntity"
    // InternalTyphonML.g:5159:1: ruleRemoveEntity returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:5165:2: ( (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:5166:2: (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:5166:2: (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) )
            // InternalTyphonML.g:5167:3: otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveEntityAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:5175:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5176:4: ( ruleEString )
            {
            // InternalTyphonML.g:5176:4: ( ruleEString )
            // InternalTyphonML.g:5177:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveEntityAccess().getEntityToRemoveEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleRemoveEntity"


    // $ANTLR start "entryRuleSplitEntity"
    // InternalTyphonML.g:5195:1: entryRuleSplitEntity returns [EObject current=null] : iv_ruleSplitEntity= ruleSplitEntity EOF ;
    public final EObject entryRuleSplitEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntity = null;


        try {
            // InternalTyphonML.g:5195:52: (iv_ruleSplitEntity= ruleSplitEntity EOF )
            // InternalTyphonML.g:5196:2: iv_ruleSplitEntity= ruleSplitEntity EOF
            {
             newCompositeNode(grammarAccess.getSplitEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitEntity=ruleSplitEntity();

            state._fsp--;

             current =iv_ruleSplitEntity; 
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
    // $ANTLR end "entryRuleSplitEntity"


    // $ANTLR start "ruleSplitEntity"
    // InternalTyphonML.g:5202:1: ruleSplitEntity returns [EObject current=null] : (otherlv_0= 'SplitEntity' otherlv_1= '{' otherlv_2= 'entityToBeSplit' ( ( ruleEString ) ) otherlv_4= 'firstNewEntity' ( (lv_firstNewEntity_5_0= ruleEntity ) ) otherlv_6= 'secondNewEntity' ( (lv_secondNewEntity_7_0= ruleEntity ) ) otherlv_8= '}' ) ;
    public final EObject ruleSplitEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_firstNewEntity_5_0 = null;

        EObject lv_secondNewEntity_7_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5208:2: ( (otherlv_0= 'SplitEntity' otherlv_1= '{' otherlv_2= 'entityToBeSplit' ( ( ruleEString ) ) otherlv_4= 'firstNewEntity' ( (lv_firstNewEntity_5_0= ruleEntity ) ) otherlv_6= 'secondNewEntity' ( (lv_secondNewEntity_7_0= ruleEntity ) ) otherlv_8= '}' ) )
            // InternalTyphonML.g:5209:2: (otherlv_0= 'SplitEntity' otherlv_1= '{' otherlv_2= 'entityToBeSplit' ( ( ruleEString ) ) otherlv_4= 'firstNewEntity' ( (lv_firstNewEntity_5_0= ruleEntity ) ) otherlv_6= 'secondNewEntity' ( (lv_secondNewEntity_7_0= ruleEntity ) ) otherlv_8= '}' )
            {
            // InternalTyphonML.g:5209:2: (otherlv_0= 'SplitEntity' otherlv_1= '{' otherlv_2= 'entityToBeSplit' ( ( ruleEString ) ) otherlv_4= 'firstNewEntity' ( (lv_firstNewEntity_5_0= ruleEntity ) ) otherlv_6= 'secondNewEntity' ( (lv_secondNewEntity_7_0= ruleEntity ) ) otherlv_8= '}' )
            // InternalTyphonML.g:5210:3: otherlv_0= 'SplitEntity' otherlv_1= '{' otherlv_2= 'entityToBeSplit' ( ( ruleEString ) ) otherlv_4= 'firstNewEntity' ( (lv_firstNewEntity_5_0= ruleEntity ) ) otherlv_6= 'secondNewEntity' ( (lv_secondNewEntity_7_0= ruleEntity ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitEntityAccess().getSplitEntityKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_86); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitEntityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitEntityAccess().getEntityToBeSplitKeyword_2());
            		
            // InternalTyphonML.g:5222:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5223:4: ( ruleEString )
            {
            // InternalTyphonML.g:5223:4: ( ruleEString )
            // InternalTyphonML.g:5224:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityAccess().getEntityToBeSplitEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_87);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,81,FOLLOW_88); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitEntityAccess().getFirstNewEntityKeyword_4());
            		
            // InternalTyphonML.g:5242:3: ( (lv_firstNewEntity_5_0= ruleEntity ) )
            // InternalTyphonML.g:5243:4: (lv_firstNewEntity_5_0= ruleEntity )
            {
            // InternalTyphonML.g:5243:4: (lv_firstNewEntity_5_0= ruleEntity )
            // InternalTyphonML.g:5244:5: lv_firstNewEntity_5_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getSplitEntityAccess().getFirstNewEntityEntityParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_89);
            lv_firstNewEntity_5_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitEntityRule());
            					}
            					set(
            						current,
            						"firstNewEntity",
            						lv_firstNewEntity_5_0,
            						"it.univaq.disim.typhon.TyphonML.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,82,FOLLOW_88); 

            			newLeafNode(otherlv_6, grammarAccess.getSplitEntityAccess().getSecondNewEntityKeyword_6());
            		
            // InternalTyphonML.g:5265:3: ( (lv_secondNewEntity_7_0= ruleEntity ) )
            // InternalTyphonML.g:5266:4: (lv_secondNewEntity_7_0= ruleEntity )
            {
            // InternalTyphonML.g:5266:4: (lv_secondNewEntity_7_0= ruleEntity )
            // InternalTyphonML.g:5267:5: lv_secondNewEntity_7_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getSplitEntityAccess().getSecondNewEntityEntityParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_37);
            lv_secondNewEntity_7_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitEntityRule());
            					}
            					set(
            						current,
            						"secondNewEntity",
            						lv_secondNewEntity_7_0,
            						"it.univaq.disim.typhon.TyphonML.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSplitEntityAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSplitEntity"


    // $ANTLR start "entryRuleMigrateEntity"
    // InternalTyphonML.g:5292:1: entryRuleMigrateEntity returns [EObject current=null] : iv_ruleMigrateEntity= ruleMigrateEntity EOF ;
    public final EObject entryRuleMigrateEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrateEntity = null;


        try {
            // InternalTyphonML.g:5292:54: (iv_ruleMigrateEntity= ruleMigrateEntity EOF )
            // InternalTyphonML.g:5293:2: iv_ruleMigrateEntity= ruleMigrateEntity EOF
            {
             newCompositeNode(grammarAccess.getMigrateEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMigrateEntity=ruleMigrateEntity();

            state._fsp--;

             current =iv_ruleMigrateEntity; 
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
    // $ANTLR end "entryRuleMigrateEntity"


    // $ANTLR start "ruleMigrateEntity"
    // InternalTyphonML.g:5299:1: ruleMigrateEntity returns [EObject current=null] : (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleMigrateEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTyphonML.g:5305:2: ( (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:5306:2: (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:5306:2: (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            // InternalTyphonML.g:5307:3: otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMigrateEntityAccess().getMigrateKeyword_0());
            		
            // InternalTyphonML.g:5311:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5312:4: ( ruleEString )
            {
            // InternalTyphonML.g:5312:4: ( ruleEString )
            // InternalTyphonML.g:5313:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrateEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMigrateEntityAccess().getEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_90);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMigrateEntityAccess().getToKeyword_2());
            		
            // InternalTyphonML.g:5331:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5332:4: ( ruleEString )
            {
            // InternalTyphonML.g:5332:4: ( ruleEString )
            // InternalTyphonML.g:5333:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrateEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMigrateEntityAccess().getNewDatabaseDatabaseCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleMigrateEntity"


    // $ANTLR start "entryRuleSplitEntityVertical"
    // InternalTyphonML.g:5351:1: entryRuleSplitEntityVertical returns [EObject current=null] : iv_ruleSplitEntityVertical= ruleSplitEntityVertical EOF ;
    public final EObject entryRuleSplitEntityVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntityVertical = null;


        try {
            // InternalTyphonML.g:5351:60: (iv_ruleSplitEntityVertical= ruleSplitEntityVertical EOF )
            // InternalTyphonML.g:5352:2: iv_ruleSplitEntityVertical= ruleSplitEntityVertical EOF
            {
             newCompositeNode(grammarAccess.getSplitEntityVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitEntityVertical=ruleSplitEntityVertical();

            state._fsp--;

             current =iv_ruleSplitEntityVertical; 
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
    // $ANTLR end "entryRuleSplitEntityVertical"


    // $ANTLR start "ruleSplitEntityVertical"
    // InternalTyphonML.g:5358:1: ruleSplitEntityVertical returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' ) ;
    public final EObject ruleSplitEntityVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_entity2name_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5364:2: ( (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' ) )
            // InternalTyphonML.g:5365:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' )
            {
            // InternalTyphonML.g:5365:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' )
            // InternalTyphonML.g:5366:3: otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitEntityVerticalAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_91); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitEntityVerticalAccess().getEntityKeyword_1());
            		
            otherlv_2=(Token)match(input,85,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitEntityVerticalAccess().getVerticalKeyword_2());
            		
            // InternalTyphonML.g:5378:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5379:4: ( ruleEString )
            {
            // InternalTyphonML.g:5379:4: ( ruleEString )
            // InternalTyphonML.g:5380:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityVerticalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getEntity1EntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_90);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitEntityVerticalAccess().getToKeyword_4());
            		
            // InternalTyphonML.g:5398:3: ( (lv_entity2name_5_0= ruleEString ) )
            // InternalTyphonML.g:5399:4: (lv_entity2name_5_0= ruleEString )
            {
            // InternalTyphonML.g:5399:4: (lv_entity2name_5_0= ruleEString )
            // InternalTyphonML.g:5400:5: lv_entity2name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getEntity2nameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_92);
            lv_entity2name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitEntityVerticalRule());
            					}
            					set(
            						current,
            						"entity2name",
            						lv_entity2name_5_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,86,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getSplitEntityVerticalAccess().getAttributesKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_7, grammarAccess.getSplitEntityVerticalAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalTyphonML.g:5425:3: ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=RULE_STRING && LA97_0<=RULE_ID)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalTyphonML.g:5426:4: ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
            	    {
            	    // InternalTyphonML.g:5426:4: ( ( ruleEString ) )
            	    // InternalTyphonML.g:5427:5: ( ruleEString )
            	    {
            	    // InternalTyphonML.g:5427:5: ( ruleEString )
            	    // InternalTyphonML.g:5428:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSplitEntityVerticalRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getAttributeListAttributeCrossReference_8_0_0());
            	    					
            	    pushFollow(FOLLOW_94);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTyphonML.g:5442:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
            	    loop96:
            	    do {
            	        int alt96=2;
            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==13) ) {
            	            alt96=1;
            	        }


            	        switch (alt96) {
            	    	case 1 :
            	    	    // InternalTyphonML.g:5443:5: otherlv_9= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getSplitEntityVerticalAccess().getCommaKeyword_8_1_0());
            	    	    				
            	    	    // InternalTyphonML.g:5447:5: ( ( ruleEString ) )
            	    	    // InternalTyphonML.g:5448:6: ( ruleEString )
            	    	    {
            	    	    // InternalTyphonML.g:5448:6: ( ruleEString )
            	    	    // InternalTyphonML.g:5449:7: ruleEString
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getSplitEntityVerticalRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getAttributeListAttributeCrossReference_8_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_94);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop96;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSplitEntityVerticalAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSplitEntityVertical"


    // $ANTLR start "entryRuleSplitEntityHorizontal"
    // InternalTyphonML.g:5473:1: entryRuleSplitEntityHorizontal returns [EObject current=null] : iv_ruleSplitEntityHorizontal= ruleSplitEntityHorizontal EOF ;
    public final EObject entryRuleSplitEntityHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntityHorizontal = null;


        try {
            // InternalTyphonML.g:5473:62: (iv_ruleSplitEntityHorizontal= ruleSplitEntityHorizontal EOF )
            // InternalTyphonML.g:5474:2: iv_ruleSplitEntityHorizontal= ruleSplitEntityHorizontal EOF
            {
             newCompositeNode(grammarAccess.getSplitEntityHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitEntityHorizontal=ruleSplitEntityHorizontal();

            state._fsp--;

             current =iv_ruleSplitEntityHorizontal; 
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
    // $ANTLR end "entryRuleSplitEntityHorizontal"


    // $ANTLR start "ruleSplitEntityHorizontal"
    // InternalTyphonML.g:5480:1: ruleSplitEntityHorizontal returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleSplitEntityHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_expression_9_0=null;
        AntlrDatatypeRuleToken lv_entity2name_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5486:2: ( (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) ) )
            // InternalTyphonML.g:5487:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) )
            {
            // InternalTyphonML.g:5487:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) )
            // InternalTyphonML.g:5488:3: otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitEntityHorizontalAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_95); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitEntityHorizontalAccess().getEntityKeyword_1());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitEntityHorizontalAccess().getHorizontalKeyword_2());
            		
            // InternalTyphonML.g:5500:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5501:4: ( ruleEString )
            {
            // InternalTyphonML.g:5501:4: ( ruleEString )
            // InternalTyphonML.g:5502:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityHorizontalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityHorizontalAccess().getEntity1EntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_90);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitEntityHorizontalAccess().getToKeyword_4());
            		
            // InternalTyphonML.g:5520:3: ( (lv_entity2name_5_0= ruleEString ) )
            // InternalTyphonML.g:5521:4: (lv_entity2name_5_0= ruleEString )
            {
            // InternalTyphonML.g:5521:4: (lv_entity2name_5_0= ruleEString )
            // InternalTyphonML.g:5522:5: lv_entity2name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSplitEntityHorizontalAccess().getEntity2nameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_96);
            lv_entity2name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitEntityHorizontalRule());
            					}
            					set(
            						current,
            						"entity2name",
            						lv_entity2name_5_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,88,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getSplitEntityHorizontalAccess().getWhereKeyword_6());
            		
            // InternalTyphonML.g:5543:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5544:4: ( ruleEString )
            {
            // InternalTyphonML.g:5544:4: ( ruleEString )
            // InternalTyphonML.g:5545:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityHorizontalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityHorizontalAccess().getAttributeAttributeCrossReference_7_0());
            				
            pushFollow(FOLLOW_97);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,89,FOLLOW_98); 

            			newLeafNode(otherlv_8, grammarAccess.getSplitEntityHorizontalAccess().getValueKeyword_8());
            		
            // InternalTyphonML.g:5563:3: ( (lv_expression_9_0= RULE_STRING ) )
            // InternalTyphonML.g:5564:4: (lv_expression_9_0= RULE_STRING )
            {
            // InternalTyphonML.g:5564:4: (lv_expression_9_0= RULE_STRING )
            // InternalTyphonML.g:5565:5: lv_expression_9_0= RULE_STRING
            {
            lv_expression_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_expression_9_0, grammarAccess.getSplitEntityHorizontalAccess().getExpressionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityHorizontalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSplitEntityHorizontal"


    // $ANTLR start "entryRuleMergeEntity"
    // InternalTyphonML.g:5585:1: entryRuleMergeEntity returns [EObject current=null] : iv_ruleMergeEntity= ruleMergeEntity EOF ;
    public final EObject entryRuleMergeEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeEntity = null;


        try {
            // InternalTyphonML.g:5585:52: (iv_ruleMergeEntity= ruleMergeEntity EOF )
            // InternalTyphonML.g:5586:2: iv_ruleMergeEntity= ruleMergeEntity EOF
            {
             newCompositeNode(grammarAccess.getMergeEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeEntity=ruleMergeEntity();

            state._fsp--;

             current =iv_ruleMergeEntity; 
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
    // $ANTLR end "entryRuleMergeEntity"


    // $ANTLR start "ruleMergeEntity"
    // InternalTyphonML.g:5592:1: ruleMergeEntity returns [EObject current=null] : (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) ) ;
    public final EObject ruleMergeEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_newEntityName_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5598:2: ( (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) ) )
            // InternalTyphonML.g:5599:2: (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:5599:2: (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) )
            // InternalTyphonML.g:5600:3: otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeEntityAccess().getMergeKeyword_0());
            		
            otherlv_1=(Token)match(input,91,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMergeEntityAccess().getEntitiesKeyword_1());
            		
            // InternalTyphonML.g:5608:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5609:4: ( ruleEString )
            {
            // InternalTyphonML.g:5609:4: ( ruleEString )
            // InternalTyphonML.g:5610:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMergeEntityAccess().getFirstEntityToMergeEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5624:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5625:4: ( ruleEString )
            {
            // InternalTyphonML.g:5625:4: ( ruleEString )
            // InternalTyphonML.g:5626:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMergeEntityAccess().getSecondEntityToMergeEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMergeEntityAccess().getAsKeyword_4());
            		
            // InternalTyphonML.g:5644:3: ( (lv_newEntityName_5_0= ruleEString ) )
            // InternalTyphonML.g:5645:4: (lv_newEntityName_5_0= ruleEString )
            {
            // InternalTyphonML.g:5645:4: (lv_newEntityName_5_0= ruleEString )
            // InternalTyphonML.g:5646:5: lv_newEntityName_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMergeEntityAccess().getNewEntityNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_newEntityName_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMergeEntityRule());
            					}
            					set(
            						current,
            						"newEntityName",
            						lv_newEntityName_5_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleMergeEntity"


    // $ANTLR start "entryRuleRenameAttribute"
    // InternalTyphonML.g:5667:1: entryRuleRenameAttribute returns [EObject current=null] : iv_ruleRenameAttribute= ruleRenameAttribute EOF ;
    public final EObject entryRuleRenameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameAttribute = null;


        try {
            // InternalTyphonML.g:5667:56: (iv_ruleRenameAttribute= ruleRenameAttribute EOF )
            // InternalTyphonML.g:5668:2: iv_ruleRenameAttribute= ruleRenameAttribute EOF
            {
             newCompositeNode(grammarAccess.getRenameAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameAttribute=ruleRenameAttribute();

            state._fsp--;

             current =iv_ruleRenameAttribute; 
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
    // $ANTLR end "entryRuleRenameAttribute"


    // $ANTLR start "ruleRenameAttribute"
    // InternalTyphonML.g:5674:1: ruleRenameAttribute returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5680:2: ( (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:5681:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:5681:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:5682:3: otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_100); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameAttributeAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,92,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:5690:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5691:4: ( ruleEString )
            {
            // InternalTyphonML.g:5691:4: ( ruleEString )
            // InternalTyphonML.g:5692:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameAttributeAccess().getAttributeToRenameAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameAttributeAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:5710:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:5711:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:5711:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:5712:5: lv_newName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRenameAttributeAccess().getNewNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameAttributeRule());
            					}
            					set(
            						current,
            						"newName",
            						lv_newName_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleRenameAttribute"


    // $ANTLR start "entryRuleRemoveAttribute"
    // InternalTyphonML.g:5733:1: entryRuleRemoveAttribute returns [EObject current=null] : iv_ruleRemoveAttribute= ruleRemoveAttribute EOF ;
    public final EObject entryRuleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttribute = null;


        try {
            // InternalTyphonML.g:5733:56: (iv_ruleRemoveAttribute= ruleRemoveAttribute EOF )
            // InternalTyphonML.g:5734:2: iv_ruleRemoveAttribute= ruleRemoveAttribute EOF
            {
             newCompositeNode(grammarAccess.getRemoveAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveAttribute=ruleRemoveAttribute();

            state._fsp--;

             current =iv_ruleRemoveAttribute; 
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
    // $ANTLR end "entryRuleRemoveAttribute"


    // $ANTLR start "ruleRemoveAttribute"
    // InternalTyphonML.g:5740:1: ruleRemoveAttribute returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:5746:2: ( (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:5747:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:5747:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) )
            // InternalTyphonML.g:5748:3: otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_100); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributeAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,92,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:5756:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5757:4: ( ruleEString )
            {
            // InternalTyphonML.g:5757:4: ( ruleEString )
            // InternalTyphonML.g:5758:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveAttributeAccess().getAttributeToRemoveAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleRemoveAttribute"


    // $ANTLR start "entryRuleAddRelation"
    // InternalTyphonML.g:5776:1: entryRuleAddRelation returns [EObject current=null] : iv_ruleAddRelation= ruleAddRelation EOF ;
    public final EObject entryRuleAddRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRelation = null;


        try {
            // InternalTyphonML.g:5776:52: (iv_ruleAddRelation= ruleAddRelation EOF )
            // InternalTyphonML.g:5777:2: iv_ruleAddRelation= ruleAddRelation EOF
            {
             newCompositeNode(grammarAccess.getAddRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddRelation=ruleAddRelation();

            state._fsp--;

             current =iv_ruleAddRelation; 
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
    // $ANTLR end "entryRuleAddRelation"


    // $ANTLR start "ruleAddRelation"
    // InternalTyphonML.g:5783:1: ruleAddRelation returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? ) ;
    public final EObject ruleAddRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_isContainment_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_cardinality_13_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5789:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? ) )
            // InternalTyphonML.g:5790:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? )
            {
            // InternalTyphonML.g:5790:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? )
            // InternalTyphonML.g:5791:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )?
            {
            // InternalTyphonML.g:5791:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==32) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalTyphonML.g:5792:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddRelationAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:5796:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:5797:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:5797:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:5798:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddRelationRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,74,FOLLOW_101); 

            			newLeafNode(otherlv_2, grammarAccess.getAddRelationAccess().getAddKeyword_1());
            		
            otherlv_3=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddRelationAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:5824:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5825:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5825:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5826:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddRelationAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_90);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAddRelationAccess().getToKeyword_4());
            		
            // InternalTyphonML.g:5847:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5848:4: ( ruleEString )
            {
            // InternalTyphonML.g:5848:4: ( ruleEString )
            // InternalTyphonML.g:5849:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getOwnerEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5863:3: ( (lv_isContainment_7_0= ':' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==33) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalTyphonML.g:5864:4: (lv_isContainment_7_0= ':' )
                    {
                    // InternalTyphonML.g:5864:4: (lv_isContainment_7_0= ':' )
                    // InternalTyphonML.g:5865:5: lv_isContainment_7_0= ':'
                    {
                    lv_isContainment_7_0=(Token)match(input,33,FOLLOW_29); 

                    					newLeafNode(lv_isContainment_7_0, grammarAccess.getAddRelationAccess().getIsContainmentColonKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getAddRelationAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalTyphonML.g:5881:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5882:4: ( ruleEString )
            {
            // InternalTyphonML.g:5882:4: ( ruleEString )
            // InternalTyphonML.g:5883:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getTypeEntityCrossReference_8_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5897:3: (otherlv_10= '.' ( ( ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==40) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalTyphonML.g:5898:4: otherlv_10= '.' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddRelationAccess().getFullStopKeyword_9_0());
                    			
                    // InternalTyphonML.g:5902:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5903:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5903:5: ( ruleEString )
                    // InternalTyphonML.g:5904:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getOppositeRelationCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:5919:3: (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==12) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalTyphonML.g:5920:4: otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddRelationAccess().getLeftSquareBracketKeyword_10_0());
                    			
                    // InternalTyphonML.g:5924:4: ( (lv_cardinality_13_0= ruleCardinality ) )
                    // InternalTyphonML.g:5925:5: (lv_cardinality_13_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:5925:5: (lv_cardinality_13_0= ruleCardinality )
                    // InternalTyphonML.g:5926:6: lv_cardinality_13_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getCardinalityCardinalityEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_cardinality_13_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddRelationRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_13_0,
                    							"it.univaq.disim.typhon.TyphonML.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getAddRelationAccess().getRightSquareBracketKeyword_10_2());
                    			

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
    // $ANTLR end "ruleAddRelation"


    // $ANTLR start "entryRuleRenameRelation"
    // InternalTyphonML.g:5952:1: entryRuleRenameRelation returns [EObject current=null] : iv_ruleRenameRelation= ruleRenameRelation EOF ;
    public final EObject entryRuleRenameRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameRelation = null;


        try {
            // InternalTyphonML.g:5952:55: (iv_ruleRenameRelation= ruleRenameRelation EOF )
            // InternalTyphonML.g:5953:2: iv_ruleRenameRelation= ruleRenameRelation EOF
            {
             newCompositeNode(grammarAccess.getRenameRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameRelation=ruleRenameRelation();

            state._fsp--;

             current =iv_ruleRenameRelation; 
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
    // $ANTLR end "entryRuleRenameRelation"


    // $ANTLR start "ruleRenameRelation"
    // InternalTyphonML.g:5959:1: ruleRenameRelation returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newRelationName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5965:2: ( (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:5966:2: (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:5966:2: (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:5967:3: otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_101); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameRelationAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:5975:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5976:4: ( ruleEString )
            {
            // InternalTyphonML.g:5976:4: ( ruleEString )
            // InternalTyphonML.g:5977:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameRelationAccess().getRelationToRenameRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameRelationAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:5995:3: ( (lv_newRelationName_4_0= ruleEString ) )
            // InternalTyphonML.g:5996:4: (lv_newRelationName_4_0= ruleEString )
            {
            // InternalTyphonML.g:5996:4: (lv_newRelationName_4_0= ruleEString )
            // InternalTyphonML.g:5997:5: lv_newRelationName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRenameRelationAccess().getNewRelationNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newRelationName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameRelationRule());
            					}
            					set(
            						current,
            						"newRelationName",
            						lv_newRelationName_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleRenameRelation"


    // $ANTLR start "entryRuleRemoveRelation"
    // InternalTyphonML.g:6018:1: entryRuleRemoveRelation returns [EObject current=null] : iv_ruleRemoveRelation= ruleRemoveRelation EOF ;
    public final EObject entryRuleRemoveRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveRelation = null;


        try {
            // InternalTyphonML.g:6018:55: (iv_ruleRemoveRelation= ruleRemoveRelation EOF )
            // InternalTyphonML.g:6019:2: iv_ruleRemoveRelation= ruleRemoveRelation EOF
            {
             newCompositeNode(grammarAccess.getRemoveRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveRelation=ruleRemoveRelation();

            state._fsp--;

             current =iv_ruleRemoveRelation; 
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
    // $ANTLR end "entryRuleRemoveRelation"


    // $ANTLR start "ruleRemoveRelation"
    // InternalTyphonML.g:6025:1: ruleRemoveRelation returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6031:2: ( (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:6032:2: (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:6032:2: (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) )
            // InternalTyphonML.g:6033:3: otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_101); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveRelationAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:6041:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6042:4: ( ruleEString )
            {
            // InternalTyphonML.g:6042:4: ( ruleEString )
            // InternalTyphonML.g:6043:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveRelationAccess().getRelationToRemoveRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleRemoveRelation"


    // $ANTLR start "entryRuleChangeRelationContainement"
    // InternalTyphonML.g:6061:1: entryRuleChangeRelationContainement returns [EObject current=null] : iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF ;
    public final EObject entryRuleChangeRelationContainement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRelationContainement = null;


        try {
            // InternalTyphonML.g:6061:67: (iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF )
            // InternalTyphonML.g:6062:2: iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF
            {
             newCompositeNode(grammarAccess.getChangeRelationContainementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeRelationContainement=ruleChangeRelationContainement();

            state._fsp--;

             current =iv_ruleChangeRelationContainement; 
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
    // $ANTLR end "entryRuleChangeRelationContainement"


    // $ANTLR start "ruleChangeRelationContainement"
    // InternalTyphonML.g:6068:1: ruleChangeRelationContainement returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleChangeRelationContainement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newContainment_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:6074:2: ( (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) ) )
            // InternalTyphonML.g:6075:2: (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) )
            {
            // InternalTyphonML.g:6075:2: (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) )
            // InternalTyphonML.g:6076:3: otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_102); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRelationContainementAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,95,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeRelationContainementAccess().getContainmentKeyword_1());
            		
            // InternalTyphonML.g:6084:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6085:4: ( ruleEString )
            {
            // InternalTyphonML.g:6085:4: ( ruleEString )
            // InternalTyphonML.g:6086:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeRelationContainementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeRelationContainementAccess().getRelationRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_103); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeRelationContainementAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:6104:3: ( (lv_newContainment_4_0= ruleEBooleanObject ) )
            // InternalTyphonML.g:6105:4: (lv_newContainment_4_0= ruleEBooleanObject )
            {
            // InternalTyphonML.g:6105:4: (lv_newContainment_4_0= ruleEBooleanObject )
            // InternalTyphonML.g:6106:5: lv_newContainment_4_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getChangeRelationContainementAccess().getNewContainmentEBooleanObjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newContainment_4_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeRelationContainementRule());
            					}
            					set(
            						current,
            						"newContainment",
            						lv_newContainment_4_0,
            						"it.univaq.disim.typhon.TyphonML.EBooleanObject");
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
    // $ANTLR end "ruleChangeRelationContainement"


    // $ANTLR start "entryRuleChangeRelationCardinality"
    // InternalTyphonML.g:6127:1: entryRuleChangeRelationCardinality returns [EObject current=null] : iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF ;
    public final EObject entryRuleChangeRelationCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRelationCardinality = null;


        try {
            // InternalTyphonML.g:6127:66: (iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF )
            // InternalTyphonML.g:6128:2: iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF
            {
             newCompositeNode(grammarAccess.getChangeRelationCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeRelationCardinality=ruleChangeRelationCardinality();

            state._fsp--;

             current =iv_ruleChangeRelationCardinality; 
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
    // $ANTLR end "entryRuleChangeRelationCardinality"


    // $ANTLR start "ruleChangeRelationCardinality"
    // InternalTyphonML.g:6134:1: ruleChangeRelationCardinality returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) ) ;
    public final EObject ruleChangeRelationCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_newCardinality_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:6140:2: ( (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) ) )
            // InternalTyphonML.g:6141:2: (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) )
            {
            // InternalTyphonML.g:6141:2: (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) )
            // InternalTyphonML.g:6142:3: otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_104); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRelationCardinalityAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,96,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeRelationCardinalityAccess().getCardinalityKeyword_1());
            		
            // InternalTyphonML.g:6150:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6151:4: ( ruleEString )
            {
            // InternalTyphonML.g:6151:4: ( ruleEString )
            // InternalTyphonML.g:6152:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeRelationCardinalityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeRelationCardinalityAccess().getRelationRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeRelationCardinalityAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:6170:3: ( (lv_newCardinality_4_0= ruleCardinality ) )
            // InternalTyphonML.g:6171:4: (lv_newCardinality_4_0= ruleCardinality )
            {
            // InternalTyphonML.g:6171:4: (lv_newCardinality_4_0= ruleCardinality )
            // InternalTyphonML.g:6172:5: lv_newCardinality_4_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getChangeRelationCardinalityAccess().getNewCardinalityCardinalityEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newCardinality_4_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeRelationCardinalityRule());
            					}
            					set(
            						current,
            						"newCardinality",
            						lv_newCardinality_4_0,
            						"it.univaq.disim.typhon.TyphonML.Cardinality");
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
    // $ANTLR end "ruleChangeRelationCardinality"


    // $ANTLR start "entryRuleEnableRelationContainment"
    // InternalTyphonML.g:6193:1: entryRuleEnableRelationContainment returns [EObject current=null] : iv_ruleEnableRelationContainment= ruleEnableRelationContainment EOF ;
    public final EObject entryRuleEnableRelationContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableRelationContainment = null;


        try {
            // InternalTyphonML.g:6193:66: (iv_ruleEnableRelationContainment= ruleEnableRelationContainment EOF )
            // InternalTyphonML.g:6194:2: iv_ruleEnableRelationContainment= ruleEnableRelationContainment EOF
            {
             newCompositeNode(grammarAccess.getEnableRelationContainmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnableRelationContainment=ruleEnableRelationContainment();

            state._fsp--;

             current =iv_ruleEnableRelationContainment; 
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
    // $ANTLR end "entryRuleEnableRelationContainment"


    // $ANTLR start "ruleEnableRelationContainment"
    // InternalTyphonML.g:6200:1: ruleEnableRelationContainment returns [EObject current=null] : (otherlv_0= 'EnableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnableRelationContainment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6206:2: ( (otherlv_0= 'EnableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:6207:2: (otherlv_0= 'EnableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:6207:2: (otherlv_0= 'EnableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:6208:3: otherlv_0= 'EnableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableRelationContainmentAccess().getEnableRelationContainmentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_101); 

            			newLeafNode(otherlv_1, grammarAccess.getEnableRelationContainmentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEnableRelationContainmentAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:6220:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6221:4: ( ruleEString )
            {
            // InternalTyphonML.g:6221:4: ( ruleEString )
            // InternalTyphonML.g:6222:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnableRelationContainmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnableRelationContainmentAccess().getRelationRelationCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnableRelationContainmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnableRelationContainment"


    // $ANTLR start "entryRuleDisableRelationContainment"
    // InternalTyphonML.g:6244:1: entryRuleDisableRelationContainment returns [EObject current=null] : iv_ruleDisableRelationContainment= ruleDisableRelationContainment EOF ;
    public final EObject entryRuleDisableRelationContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisableRelationContainment = null;


        try {
            // InternalTyphonML.g:6244:67: (iv_ruleDisableRelationContainment= ruleDisableRelationContainment EOF )
            // InternalTyphonML.g:6245:2: iv_ruleDisableRelationContainment= ruleDisableRelationContainment EOF
            {
             newCompositeNode(grammarAccess.getDisableRelationContainmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisableRelationContainment=ruleDisableRelationContainment();

            state._fsp--;

             current =iv_ruleDisableRelationContainment; 
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
    // $ANTLR end "entryRuleDisableRelationContainment"


    // $ANTLR start "ruleDisableRelationContainment"
    // InternalTyphonML.g:6251:1: ruleDisableRelationContainment returns [EObject current=null] : (otherlv_0= 'DisableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleDisableRelationContainment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6257:2: ( (otherlv_0= 'DisableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:6258:2: (otherlv_0= 'DisableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:6258:2: (otherlv_0= 'DisableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:6259:3: otherlv_0= 'DisableRelationContainment' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDisableRelationContainmentAccess().getDisableRelationContainmentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_101); 

            			newLeafNode(otherlv_1, grammarAccess.getDisableRelationContainmentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDisableRelationContainmentAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:6271:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6272:4: ( ruleEString )
            {
            // InternalTyphonML.g:6272:4: ( ruleEString )
            // InternalTyphonML.g:6273:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisableRelationContainmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDisableRelationContainmentAccess().getRelationRelationCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDisableRelationContainmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDisableRelationContainment"


    // $ANTLR start "entryRuleEnableBidirectionalRelation"
    // InternalTyphonML.g:6295:1: entryRuleEnableBidirectionalRelation returns [EObject current=null] : iv_ruleEnableBidirectionalRelation= ruleEnableBidirectionalRelation EOF ;
    public final EObject entryRuleEnableBidirectionalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnableBidirectionalRelation = null;


        try {
            // InternalTyphonML.g:6295:68: (iv_ruleEnableBidirectionalRelation= ruleEnableBidirectionalRelation EOF )
            // InternalTyphonML.g:6296:2: iv_ruleEnableBidirectionalRelation= ruleEnableBidirectionalRelation EOF
            {
             newCompositeNode(grammarAccess.getEnableBidirectionalRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnableBidirectionalRelation=ruleEnableBidirectionalRelation();

            state._fsp--;

             current =iv_ruleEnableBidirectionalRelation; 
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
    // $ANTLR end "entryRuleEnableBidirectionalRelation"


    // $ANTLR start "ruleEnableBidirectionalRelation"
    // InternalTyphonML.g:6302:1: ruleEnableBidirectionalRelation returns [EObject current=null] : (otherlv_0= 'EnableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnableBidirectionalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6308:2: ( (otherlv_0= 'EnableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:6309:2: (otherlv_0= 'EnableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:6309:2: (otherlv_0= 'EnableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:6310:3: otherlv_0= 'EnableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEnableBidirectionalRelationAccess().getEnableBidirectionalRelationKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_101); 

            			newLeafNode(otherlv_1, grammarAccess.getEnableBidirectionalRelationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEnableBidirectionalRelationAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:6322:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6323:4: ( ruleEString )
            {
            // InternalTyphonML.g:6323:4: ( ruleEString )
            // InternalTyphonML.g:6324:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnableBidirectionalRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnableBidirectionalRelationAccess().getRelationRelationCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnableBidirectionalRelationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnableBidirectionalRelation"


    // $ANTLR start "entryRuleDisableBidirectionalRelation"
    // InternalTyphonML.g:6346:1: entryRuleDisableBidirectionalRelation returns [EObject current=null] : iv_ruleDisableBidirectionalRelation= ruleDisableBidirectionalRelation EOF ;
    public final EObject entryRuleDisableBidirectionalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisableBidirectionalRelation = null;


        try {
            // InternalTyphonML.g:6346:69: (iv_ruleDisableBidirectionalRelation= ruleDisableBidirectionalRelation EOF )
            // InternalTyphonML.g:6347:2: iv_ruleDisableBidirectionalRelation= ruleDisableBidirectionalRelation EOF
            {
             newCompositeNode(grammarAccess.getDisableBidirectionalRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisableBidirectionalRelation=ruleDisableBidirectionalRelation();

            state._fsp--;

             current =iv_ruleDisableBidirectionalRelation; 
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
    // $ANTLR end "entryRuleDisableBidirectionalRelation"


    // $ANTLR start "ruleDisableBidirectionalRelation"
    // InternalTyphonML.g:6353:1: ruleDisableBidirectionalRelation returns [EObject current=null] : (otherlv_0= 'DisableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleDisableBidirectionalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6359:2: ( (otherlv_0= 'DisableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:6360:2: (otherlv_0= 'DisableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:6360:2: (otherlv_0= 'DisableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:6361:3: otherlv_0= 'DisableBidirectionalRelation' otherlv_1= '{' otherlv_2= 'relation' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDisableBidirectionalRelationAccess().getDisableBidirectionalRelationKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_101); 

            			newLeafNode(otherlv_1, grammarAccess.getDisableBidirectionalRelationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDisableBidirectionalRelationAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:6373:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6374:4: ( ruleEString )
            {
            // InternalTyphonML.g:6374:4: ( ruleEString )
            // InternalTyphonML.g:6375:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisableBidirectionalRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDisableBidirectionalRelationAccess().getRelationRelationCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDisableBidirectionalRelationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDisableBidirectionalRelation"


    // $ANTLR start "entryRuleAddAttributesToIndex"
    // InternalTyphonML.g:6397:1: entryRuleAddAttributesToIndex returns [EObject current=null] : iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF ;
    public final EObject entryRuleAddAttributesToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttributesToIndex = null;


        try {
            // InternalTyphonML.g:6397:61: (iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF )
            // InternalTyphonML.g:6398:2: iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF
            {
             newCompositeNode(grammarAccess.getAddAttributesToIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddAttributesToIndex=ruleAddAttributesToIndex();

            state._fsp--;

             current =iv_ruleAddAttributesToIndex; 
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
    // $ANTLR end "entryRuleAddAttributesToIndex"


    // $ANTLR start "ruleAddAttributesToIndex"
    // InternalTyphonML.g:6404:1: ruleAddAttributesToIndex returns [EObject current=null] : (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAddAttributesToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6410:2: ( (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:6411:2: (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:6411:2: (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:6412:3: otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_105); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAttributesToIndexAccess().getExtendsKeyword_0());
            		
            otherlv_1=(Token)match(input,102,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAttributesToIndexAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:6420:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6421:4: ( ruleEString )
            {
            // InternalTyphonML.g:6421:4: ( ruleEString )
            // InternalTyphonML.g:6422:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributesToIndexAccess().getTableTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributesToIndexAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:6440:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6441:4: ( ruleEString )
            {
            // InternalTyphonML.g:6441:4: ( ruleEString )
            // InternalTyphonML.g:6442:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributesToIndexAccess().getAttributesAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:6456:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==13) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalTyphonML.g:6457:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddAttributesToIndexAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:6461:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:6462:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:6462:5: ( ruleEString )
                    // InternalTyphonML.g:6463:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddAttributesToIndexRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddAttributesToIndexAccess().getAttributesAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAddAttributesToIndexAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAddAttributesToIndex"


    // $ANTLR start "entryRuleRemoveAttributesToIndex"
    // InternalTyphonML.g:6486:1: entryRuleRemoveAttributesToIndex returns [EObject current=null] : iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF ;
    public final EObject entryRuleRemoveAttributesToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttributesToIndex = null;


        try {
            // InternalTyphonML.g:6486:64: (iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF )
            // InternalTyphonML.g:6487:2: iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF
            {
             newCompositeNode(grammarAccess.getRemoveAttributesToIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveAttributesToIndex=ruleRemoveAttributesToIndex();

            state._fsp--;

             current =iv_ruleRemoveAttributesToIndex; 
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
    // $ANTLR end "entryRuleRemoveAttributesToIndex"


    // $ANTLR start "ruleRemoveAttributesToIndex"
    // InternalTyphonML.g:6493:1: ruleRemoveAttributesToIndex returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRemoveAttributesToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6499:2: ( (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:6500:2: (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:6500:2: (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:6501:3: otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_105); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributesToIndexAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,102,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributesToIndexAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:6509:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6510:4: ( ruleEString )
            {
            // InternalTyphonML.g:6510:4: ( ruleEString )
            // InternalTyphonML.g:6511:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveAttributesToIndexAccess().getTableTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRemoveAttributesToIndexAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:6529:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6530:4: ( ruleEString )
            {
            // InternalTyphonML.g:6530:4: ( ruleEString )
            // InternalTyphonML.g:6531:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveAttributesToIndexAccess().getAttributesAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:6545:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==13) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalTyphonML.g:6546:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getRemoveAttributesToIndexAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:6550:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:6551:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:6551:5: ( ruleEString )
                    // InternalTyphonML.g:6552:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRemoveAttributesToIndexRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRemoveAttributesToIndexAccess().getAttributesAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRemoveAttributesToIndexAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRemoveAttributesToIndex"


    // $ANTLR start "entryRuleRenameTable"
    // InternalTyphonML.g:6575:1: entryRuleRenameTable returns [EObject current=null] : iv_ruleRenameTable= ruleRenameTable EOF ;
    public final EObject entryRuleRenameTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameTable = null;


        try {
            // InternalTyphonML.g:6575:52: (iv_ruleRenameTable= ruleRenameTable EOF )
            // InternalTyphonML.g:6576:2: iv_ruleRenameTable= ruleRenameTable EOF
            {
             newCompositeNode(grammarAccess.getRenameTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameTable=ruleRenameTable();

            state._fsp--;

             current =iv_ruleRenameTable; 
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
    // $ANTLR end "entryRuleRenameTable"


    // $ANTLR start "ruleRenameTable"
    // InternalTyphonML.g:6582:1: ruleRenameTable returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:6588:2: ( (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:6589:2: (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:6589:2: (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:6590:3: otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameTableAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameTableAccess().getTableKeyword_1());
            		
            // InternalTyphonML.g:6598:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6599:4: ( ruleEString )
            {
            // InternalTyphonML.g:6599:4: ( ruleEString )
            // InternalTyphonML.g:6600:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameTableAccess().getTableToRenameTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameTableAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:6618:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:6619:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:6619:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:6620:5: lv_newName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRenameTableAccess().getNewNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameTableRule());
            					}
            					set(
            						current,
            						"newName",
            						lv_newName_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleRenameTable"


    // $ANTLR start "entryRuleAddIndex"
    // InternalTyphonML.g:6641:1: entryRuleAddIndex returns [EObject current=null] : iv_ruleAddIndex= ruleAddIndex EOF ;
    public final EObject entryRuleAddIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddIndex = null;


        try {
            // InternalTyphonML.g:6641:49: (iv_ruleAddIndex= ruleAddIndex EOF )
            // InternalTyphonML.g:6642:2: iv_ruleAddIndex= ruleAddIndex EOF
            {
             newCompositeNode(grammarAccess.getAddIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddIndex=ruleAddIndex();

            state._fsp--;

             current =iv_ruleAddIndex; 
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
    // $ANTLR end "entryRuleAddIndex"


    // $ANTLR start "ruleAddIndex"
    // InternalTyphonML.g:6648:1: ruleAddIndex returns [EObject current=null] : (otherlv_0= 'AddIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleAddIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6654:2: ( (otherlv_0= 'AddIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalTyphonML.g:6655:2: (otherlv_0= 'AddIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalTyphonML.g:6655:2: (otherlv_0= 'AddIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalTyphonML.g:6656:3: otherlv_0= 'AddIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAddIndexAccess().getAddIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getAddIndexAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAddIndexAccess().getTableKeyword_2());
            		
            // InternalTyphonML.g:6668:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6669:4: ( ruleEString )
            {
            // InternalTyphonML.g:6669:4: ( ruleEString )
            // InternalTyphonML.g:6670:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddIndexAccess().getTableTableCrossReference_3_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:6684:3: (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==46) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalTyphonML.g:6685:4: otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddIndexAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddIndexAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalTyphonML.g:6693:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:6694:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:6694:5: ( ruleEString )
                    // InternalTyphonML.g:6695:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddIndexRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddIndexAccess().getAttributesAttributeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:6709:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==13) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalTyphonML.g:6710:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAddIndexAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTyphonML.g:6714:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:6715:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:6715:6: ( ruleEString )
                    	    // InternalTyphonML.g:6716:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddIndexRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAddIndexAccess().getAttributesAttributeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddIndexAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAddIndexAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAddIndex"


    // $ANTLR start "entryRuleDropIndex"
    // InternalTyphonML.g:6744:1: entryRuleDropIndex returns [EObject current=null] : iv_ruleDropIndex= ruleDropIndex EOF ;
    public final EObject entryRuleDropIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndex = null;


        try {
            // InternalTyphonML.g:6744:50: (iv_ruleDropIndex= ruleDropIndex EOF )
            // InternalTyphonML.g:6745:2: iv_ruleDropIndex= ruleDropIndex EOF
            {
             newCompositeNode(grammarAccess.getDropIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropIndex=ruleDropIndex();

            state._fsp--;

             current =iv_ruleDropIndex; 
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
    // $ANTLR end "entryRuleDropIndex"


    // $ANTLR start "ruleDropIndex"
    // InternalTyphonML.g:6751:1: ruleDropIndex returns [EObject current=null] : (otherlv_0= 'DropIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleDropIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:6757:2: ( (otherlv_0= 'DropIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:6758:2: (otherlv_0= 'DropIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:6758:2: (otherlv_0= 'DropIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:6759:3: otherlv_0= 'DropIndex' otherlv_1= '{' otherlv_2= 'table' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDropIndexAccess().getDropIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDropIndexAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDropIndexAccess().getTableKeyword_2());
            		
            // InternalTyphonML.g:6771:3: ( ( ruleEString ) )
            // InternalTyphonML.g:6772:4: ( ruleEString )
            {
            // InternalTyphonML.g:6772:4: ( ruleEString )
            // InternalTyphonML.g:6773:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDropIndexAccess().getTableTableCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDropIndexAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDropIndex"


    // $ANTLR start "entryRuleAddGraphAttribute"
    // InternalTyphonML.g:6795:1: entryRuleAddGraphAttribute returns [EObject current=null] : iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF ;
    public final EObject entryRuleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphAttribute = null;


        try {
            // InternalTyphonML.g:6795:58: (iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF )
            // InternalTyphonML.g:6796:2: iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF
            {
             newCompositeNode(grammarAccess.getAddGraphAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddGraphAttribute=ruleAddGraphAttribute();

            state._fsp--;

             current =iv_ruleAddGraphAttribute; 
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
    // $ANTLR end "entryRuleAddGraphAttribute"


    // $ANTLR start "ruleAddGraphAttribute"
    // InternalTyphonML.g:6802:1: ruleAddGraphAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:6808:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:6809:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:6809:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:6810:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:6810:3: ()
            // InternalTyphonML.g:6811:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:6817:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==32) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalTyphonML.g:6818:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:6822:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:6823:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:6823:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:6824:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddGraphAttributeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,106,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeKeyword_2());
            		
            // InternalTyphonML.g:6846:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:6847:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:6847:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:6848:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddGraphAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_107); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphAttributeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:6869:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==89) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalTyphonML.g:6870:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,89,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:6874:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:6875:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:6875:5: ( ruleEString )
                    // InternalTyphonML.g:6876:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getValueAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAddGraphAttributeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAddGraphAttribute"


    // $ANTLR start "entryRuleAddGraphEdge"
    // InternalTyphonML.g:6899:1: entryRuleAddGraphEdge returns [EObject current=null] : iv_ruleAddGraphEdge= ruleAddGraphEdge EOF ;
    public final EObject entryRuleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphEdge = null;


        try {
            // InternalTyphonML.g:6899:53: (iv_ruleAddGraphEdge= ruleAddGraphEdge EOF )
            // InternalTyphonML.g:6900:2: iv_ruleAddGraphEdge= ruleAddGraphEdge EOF
            {
             newCompositeNode(grammarAccess.getAddGraphEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddGraphEdge=ruleAddGraphEdge();

            state._fsp--;

             current =iv_ruleAddGraphEdge; 
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
    // $ANTLR end "entryRuleAddGraphEdge"


    // $ANTLR start "ruleAddGraphEdge"
    // InternalTyphonML.g:6906:1: ruleAddGraphEdge returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_labels_12_0 = null;

        EObject lv_labels_14_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:6912:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:6913:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:6913:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:6914:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:6914:3: ()
            // InternalTyphonML.g:6915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:6921:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==32) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalTyphonML.g:6922:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:6926:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:6927:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:6927:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:6928:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddGraphEdgeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_2_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,107,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeKeyword_2());
            		
            // InternalTyphonML.g:6950:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:6951:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:6951:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:6952:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddGraphEdgeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_65); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:6973:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==62) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalTyphonML.g:6974:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphEdgeAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:6978:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:6979:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:6979:5: ( ruleEString )
                    // InternalTyphonML.g:6980:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:6995:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==63) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalTyphonML.g:6996:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddGraphEdgeAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:7000:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:7001:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:7001:5: ( ruleEString )
                    // InternalTyphonML.g:7002:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:7017:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==64) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalTyphonML.g:7018:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,64,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddGraphEdgeAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:7026:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:7027:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:7027:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:7028:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_labels_12_0=ruleGraphEdgeLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddGraphEdgeRule());
                    						}
                    						add(
                    							current,
                    							"labels",
                    							lv_labels_12_0,
                    							"it.univaq.disim.typhon.TyphonML.GraphEdgeLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:7045:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==13) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalTyphonML.g:7046:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAddGraphEdgeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:7050:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:7051:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:7051:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:7052:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_labels_14_0=ruleGraphEdgeLabel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddGraphEdgeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"labels",
                    	    								lv_labels_14_0,
                    	    								"it.univaq.disim.typhon.TyphonML.GraphEdgeLabel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,31,FOLLOW_37); 

                    				newLeafNode(otherlv_15, grammarAccess.getAddGraphEdgeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAddGraphEdgeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAddGraphEdge"


    // $ANTLR start "entryRuleRemoveGraphAttribute"
    // InternalTyphonML.g:7083:1: entryRuleRemoveGraphAttribute returns [EObject current=null] : iv_ruleRemoveGraphAttribute= ruleRemoveGraphAttribute EOF ;
    public final EObject entryRuleRemoveGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveGraphAttribute = null;


        try {
            // InternalTyphonML.g:7083:61: (iv_ruleRemoveGraphAttribute= ruleRemoveGraphAttribute EOF )
            // InternalTyphonML.g:7084:2: iv_ruleRemoveGraphAttribute= ruleRemoveGraphAttribute EOF
            {
             newCompositeNode(grammarAccess.getRemoveGraphAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveGraphAttribute=ruleRemoveGraphAttribute();

            state._fsp--;

             current =iv_ruleRemoveGraphAttribute; 
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
    // $ANTLR end "entryRuleRemoveGraphAttribute"


    // $ANTLR start "ruleRemoveGraphAttribute"
    // InternalTyphonML.g:7090:1: ruleRemoveGraphAttribute returns [EObject current=null] : (otherlv_0= 'RemoveGraphAttribute' otherlv_1= '{' otherlv_2= 'node' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleRemoveGraphAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:7096:2: ( (otherlv_0= 'RemoveGraphAttribute' otherlv_1= '{' otherlv_2= 'node' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:7097:2: (otherlv_0= 'RemoveGraphAttribute' otherlv_1= '{' otherlv_2= 'node' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:7097:2: (otherlv_0= 'RemoveGraphAttribute' otherlv_1= '{' otherlv_2= 'node' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:7098:3: otherlv_0= 'RemoveGraphAttribute' otherlv_1= '{' otherlv_2= 'node' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveGraphAttributeAccess().getRemoveGraphAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveGraphAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveGraphAttributeAccess().getNodeKeyword_2());
            		
            // InternalTyphonML.g:7110:3: ( ( ruleEString ) )
            // InternalTyphonML.g:7111:4: ( ruleEString )
            {
            // InternalTyphonML.g:7111:4: ( ruleEString )
            // InternalTyphonML.g:7112:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveGraphAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveGraphAttributeAccess().getNodeGraphNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRemoveGraphAttributeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRemoveGraphAttribute"


    // $ANTLR start "entryRuleRemoveGraphEdge"
    // InternalTyphonML.g:7134:1: entryRuleRemoveGraphEdge returns [EObject current=null] : iv_ruleRemoveGraphEdge= ruleRemoveGraphEdge EOF ;
    public final EObject entryRuleRemoveGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveGraphEdge = null;


        try {
            // InternalTyphonML.g:7134:56: (iv_ruleRemoveGraphEdge= ruleRemoveGraphEdge EOF )
            // InternalTyphonML.g:7135:2: iv_ruleRemoveGraphEdge= ruleRemoveGraphEdge EOF
            {
             newCompositeNode(grammarAccess.getRemoveGraphEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveGraphEdge=ruleRemoveGraphEdge();

            state._fsp--;

             current =iv_ruleRemoveGraphEdge; 
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
    // $ANTLR end "entryRuleRemoveGraphEdge"


    // $ANTLR start "ruleRemoveGraphEdge"
    // InternalTyphonML.g:7141:1: ruleRemoveGraphEdge returns [EObject current=null] : (otherlv_0= 'RemoveGraphEdge' otherlv_1= '{' otherlv_2= 'graphEdgeToRemove' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleRemoveGraphEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:7147:2: ( (otherlv_0= 'RemoveGraphEdge' otherlv_1= '{' otherlv_2= 'graphEdgeToRemove' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:7148:2: (otherlv_0= 'RemoveGraphEdge' otherlv_1= '{' otherlv_2= 'graphEdgeToRemove' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:7148:2: (otherlv_0= 'RemoveGraphEdge' otherlv_1= '{' otherlv_2= 'graphEdgeToRemove' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:7149:3: otherlv_0= 'RemoveGraphEdge' otherlv_1= '{' otherlv_2= 'graphEdgeToRemove' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveGraphEdgeAccess().getRemoveGraphEdgeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_109); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveGraphEdgeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,110,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveGraphEdgeAccess().getGraphEdgeToRemoveKeyword_2());
            		
            // InternalTyphonML.g:7161:3: ( ( ruleEString ) )
            // InternalTyphonML.g:7162:4: ( ruleEString )
            {
            // InternalTyphonML.g:7162:4: ( ruleEString )
            // InternalTyphonML.g:7163:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveGraphEdgeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveGraphEdgeAccess().getGraphEdgeToRemoveGraphEdgeCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRemoveGraphEdgeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRemoveGraphEdge"


    // $ANTLR start "entryRuleRenabeGraphEdgeLabel"
    // InternalTyphonML.g:7185:1: entryRuleRenabeGraphEdgeLabel returns [EObject current=null] : iv_ruleRenabeGraphEdgeLabel= ruleRenabeGraphEdgeLabel EOF ;
    public final EObject entryRuleRenabeGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenabeGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:7185:61: (iv_ruleRenabeGraphEdgeLabel= ruleRenabeGraphEdgeLabel EOF )
            // InternalTyphonML.g:7186:2: iv_ruleRenabeGraphEdgeLabel= ruleRenabeGraphEdgeLabel EOF
            {
             newCompositeNode(grammarAccess.getRenabeGraphEdgeLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenabeGraphEdgeLabel=ruleRenabeGraphEdgeLabel();

            state._fsp--;

             current =iv_ruleRenabeGraphEdgeLabel; 
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
    // $ANTLR end "entryRuleRenabeGraphEdgeLabel"


    // $ANTLR start "ruleRenabeGraphEdgeLabel"
    // InternalTyphonML.g:7192:1: ruleRenabeGraphEdgeLabel returns [EObject current=null] : (otherlv_0= 'RenabeGraphEdgeLabel' otherlv_1= '{' (otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) ) )? otherlv_4= 'edge' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleRenabeGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_newName_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:7198:2: ( (otherlv_0= 'RenabeGraphEdgeLabel' otherlv_1= '{' (otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) ) )? otherlv_4= 'edge' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalTyphonML.g:7199:2: (otherlv_0= 'RenabeGraphEdgeLabel' otherlv_1= '{' (otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) ) )? otherlv_4= 'edge' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalTyphonML.g:7199:2: (otherlv_0= 'RenabeGraphEdgeLabel' otherlv_1= '{' (otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) ) )? otherlv_4= 'edge' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalTyphonML.g:7200:3: otherlv_0= 'RenabeGraphEdgeLabel' otherlv_1= '{' (otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) ) )? otherlv_4= 'edge' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRenabeGraphEdgeLabelAccess().getRenabeGraphEdgeLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_110); 

            			newLeafNode(otherlv_1, grammarAccess.getRenabeGraphEdgeLabelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTyphonML.g:7208:3: (otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==112) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalTyphonML.g:7209:4: otherlv_2= 'newName' ( (lv_newName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,112,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getRenabeGraphEdgeLabelAccess().getNewNameKeyword_2_0());
                    			
                    // InternalTyphonML.g:7213:4: ( (lv_newName_3_0= ruleEString ) )
                    // InternalTyphonML.g:7214:5: (lv_newName_3_0= ruleEString )
                    {
                    // InternalTyphonML.g:7214:5: (lv_newName_3_0= ruleEString )
                    // InternalTyphonML.g:7215:6: lv_newName_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRenabeGraphEdgeLabelAccess().getNewNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_newName_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenabeGraphEdgeLabelRule());
                    						}
                    						set(
                    							current,
                    							"newName",
                    							lv_newName_3_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,61,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRenabeGraphEdgeLabelAccess().getEdgeKeyword_3());
            		
            // InternalTyphonML.g:7237:3: ( ( ruleEString ) )
            // InternalTyphonML.g:7238:4: ( ruleEString )
            {
            // InternalTyphonML.g:7238:4: ( ruleEString )
            // InternalTyphonML.g:7239:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenabeGraphEdgeLabelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenabeGraphEdgeLabelAccess().getEdgeGraphEdgeCrossReference_4_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRenabeGraphEdgeLabelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRenabeGraphEdgeLabel"


    // $ANTLR start "entryRuleAddCollectionIndex"
    // InternalTyphonML.g:7261:1: entryRuleAddCollectionIndex returns [EObject current=null] : iv_ruleAddCollectionIndex= ruleAddCollectionIndex EOF ;
    public final EObject entryRuleAddCollectionIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCollectionIndex = null;


        try {
            // InternalTyphonML.g:7261:59: (iv_ruleAddCollectionIndex= ruleAddCollectionIndex EOF )
            // InternalTyphonML.g:7262:2: iv_ruleAddCollectionIndex= ruleAddCollectionIndex EOF
            {
             newCompositeNode(grammarAccess.getAddCollectionIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddCollectionIndex=ruleAddCollectionIndex();

            state._fsp--;

             current =iv_ruleAddCollectionIndex; 
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
    // $ANTLR end "entryRuleAddCollectionIndex"


    // $ANTLR start "ruleAddCollectionIndex"
    // InternalTyphonML.g:7268:1: ruleAddCollectionIndex returns [EObject current=null] : (otherlv_0= 'AddCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleAddCollectionIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalTyphonML.g:7274:2: ( (otherlv_0= 'AddCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalTyphonML.g:7275:2: (otherlv_0= 'AddCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalTyphonML.g:7275:2: (otherlv_0= 'AddCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalTyphonML.g:7276:3: otherlv_0= 'AddCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAddCollectionIndexAccess().getAddCollectionIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getAddCollectionIndexAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,114,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAddCollectionIndexAccess().getCollectionKeyword_2());
            		
            // InternalTyphonML.g:7288:3: ( ( ruleEString ) )
            // InternalTyphonML.g:7289:4: ( ruleEString )
            {
            // InternalTyphonML.g:7289:4: ( ruleEString )
            // InternalTyphonML.g:7290:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddCollectionIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddCollectionIndexAccess().getCollectionCollectionCrossReference_3_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:7304:3: (otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==46) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalTyphonML.g:7305:4: otherlv_4= 'attributes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddCollectionIndexAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddCollectionIndexAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalTyphonML.g:7313:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:7314:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:7314:5: ( ruleEString )
                    // InternalTyphonML.g:7315:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddCollectionIndexRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddCollectionIndexAccess().getAttributesAttributeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:7329:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==13) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalTyphonML.g:7330:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAddCollectionIndexAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTyphonML.g:7334:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:7335:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:7335:6: ( ruleEString )
                    	    // InternalTyphonML.g:7336:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddCollectionIndexRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAddCollectionIndexAccess().getAttributesAttributeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddCollectionIndexAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAddCollectionIndexAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAddCollectionIndex"


    // $ANTLR start "entryRuleDropCollectionIndex"
    // InternalTyphonML.g:7364:1: entryRuleDropCollectionIndex returns [EObject current=null] : iv_ruleDropCollectionIndex= ruleDropCollectionIndex EOF ;
    public final EObject entryRuleDropCollectionIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropCollectionIndex = null;


        try {
            // InternalTyphonML.g:7364:60: (iv_ruleDropCollectionIndex= ruleDropCollectionIndex EOF )
            // InternalTyphonML.g:7365:2: iv_ruleDropCollectionIndex= ruleDropCollectionIndex EOF
            {
             newCompositeNode(grammarAccess.getDropCollectionIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropCollectionIndex=ruleDropCollectionIndex();

            state._fsp--;

             current =iv_ruleDropCollectionIndex; 
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
    // $ANTLR end "entryRuleDropCollectionIndex"


    // $ANTLR start "ruleDropCollectionIndex"
    // InternalTyphonML.g:7371:1: ruleDropCollectionIndex returns [EObject current=null] : (otherlv_0= 'DropCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleDropCollectionIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:7377:2: ( (otherlv_0= 'DropCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:7378:2: (otherlv_0= 'DropCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:7378:2: (otherlv_0= 'DropCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:7379:3: otherlv_0= 'DropCollectionIndex' otherlv_1= '{' otherlv_2= 'collection' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDropCollectionIndexAccess().getDropCollectionIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getDropCollectionIndexAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,114,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDropCollectionIndexAccess().getCollectionKeyword_2());
            		
            // InternalTyphonML.g:7391:3: ( ( ruleEString ) )
            // InternalTyphonML.g:7392:4: ( ruleEString )
            {
            // InternalTyphonML.g:7392:4: ( ruleEString )
            // InternalTyphonML.g:7393:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropCollectionIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDropCollectionIndexAccess().getCollectionCollectionCrossReference_3_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDropCollectionIndexAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDropCollectionIndex"


    // $ANTLR start "entryRuleRenameCollection"
    // InternalTyphonML.g:7415:1: entryRuleRenameCollection returns [EObject current=null] : iv_ruleRenameCollection= ruleRenameCollection EOF ;
    public final EObject entryRuleRenameCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameCollection = null;


        try {
            // InternalTyphonML.g:7415:57: (iv_ruleRenameCollection= ruleRenameCollection EOF )
            // InternalTyphonML.g:7416:2: iv_ruleRenameCollection= ruleRenameCollection EOF
            {
             newCompositeNode(grammarAccess.getRenameCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameCollection=ruleRenameCollection();

            state._fsp--;

             current =iv_ruleRenameCollection; 
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
    // $ANTLR end "entryRuleRenameCollection"


    // $ANTLR start "ruleRenameCollection"
    // InternalTyphonML.g:7422:1: ruleRenameCollection returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:7428:2: ( (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:7429:2: (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:7429:2: (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:7430:3: otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_111); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameCollectionAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,114,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameCollectionAccess().getCollectionKeyword_1());
            		
            // InternalTyphonML.g:7438:3: ( ( ruleEString ) )
            // InternalTyphonML.g:7439:4: ( ruleEString )
            {
            // InternalTyphonML.g:7439:4: ( ruleEString )
            // InternalTyphonML.g:7440:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameCollectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameCollectionAccess().getCollectionToRenameCollectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_85);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameCollectionAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:7458:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:7459:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:7459:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:7460:5: lv_newName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRenameCollectionAccess().getNewNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameCollectionRule());
            					}
            					set(
            						current,
            						"newName",
            						lv_newName_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
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
    // $ANTLR end "ruleRenameCollection"


    // $ANTLR start "ruleCardinality"
    // InternalTyphonML.g:7481:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:7487:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) )
            // InternalTyphonML.g:7488:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            {
            // InternalTyphonML.g:7488:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            int alt116=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt116=1;
                }
                break;
            case 117:
                {
                alt116=2;
                }
                break;
            case 118:
                {
                alt116=3;
                }
                break;
            case 119:
                {
                alt116=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalTyphonML.g:7489:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalTyphonML.g:7489:3: (enumLiteral_0= '0..1' )
                    // InternalTyphonML.g:7490:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:7497:3: (enumLiteral_1= '1' )
                    {
                    // InternalTyphonML.g:7497:3: (enumLiteral_1= '1' )
                    // InternalTyphonML.g:7498:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:7505:3: (enumLiteral_2= '0..*' )
                    {
                    // InternalTyphonML.g:7505:3: (enumLiteral_2= '0..*' )
                    // InternalTyphonML.g:7506:4: enumLiteral_2= '0..*'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:7513:3: (enumLiteral_3= '*' )
                    {
                    // InternalTyphonML.g:7513:3: (enumLiteral_3= '*' )
                    // InternalTyphonML.g:7514:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOne_manyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCardinalityAccess().getOne_manyEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "ruleNlpTaskType"
    // InternalTyphonML.g:7524:1: ruleNlpTaskType returns [Enumerator current=null] : ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'CoreferenceResolution' ) ) ;
    public final Enumerator ruleNlpTaskType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;


        	enterRule();

        try {
            // InternalTyphonML.g:7530:2: ( ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'CoreferenceResolution' ) ) )
            // InternalTyphonML.g:7531:2: ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'CoreferenceResolution' ) )
            {
            // InternalTyphonML.g:7531:2: ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'CoreferenceResolution' ) )
            int alt117=17;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt117=1;
                }
                break;
            case 121:
                {
                alt117=2;
                }
                break;
            case 122:
                {
                alt117=3;
                }
                break;
            case 123:
                {
                alt117=4;
                }
                break;
            case 124:
                {
                alt117=5;
                }
                break;
            case 125:
                {
                alt117=6;
                }
                break;
            case 126:
                {
                alt117=7;
                }
                break;
            case 127:
                {
                alt117=8;
                }
                break;
            case 128:
                {
                alt117=9;
                }
                break;
            case 129:
                {
                alt117=10;
                }
                break;
            case 130:
                {
                alt117=11;
                }
                break;
            case 131:
                {
                alt117=12;
                }
                break;
            case 132:
                {
                alt117=13;
                }
                break;
            case 133:
                {
                alt117=14;
                }
                break;
            case 134:
                {
                alt117=15;
                }
                break;
            case 135:
                {
                alt117=16;
                }
                break;
            case 136:
                {
                alt117=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalTyphonML.g:7532:3: (enumLiteral_0= 'ParagraphSegmentation' )
                    {
                    // InternalTyphonML.g:7532:3: (enumLiteral_0= 'ParagraphSegmentation' )
                    // InternalTyphonML.g:7533:4: enumLiteral_0= 'ParagraphSegmentation'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getParagraphSegmentationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNlpTaskTypeAccess().getParagraphSegmentationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:7540:3: (enumLiteral_1= 'SentenceSegmentation' )
                    {
                    // InternalTyphonML.g:7540:3: (enumLiteral_1= 'SentenceSegmentation' )
                    // InternalTyphonML.g:7541:4: enumLiteral_1= 'SentenceSegmentation'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getSentenceSegmentationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNlpTaskTypeAccess().getSentenceSegmentationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:7548:3: (enumLiteral_2= 'Tokenisation' )
                    {
                    // InternalTyphonML.g:7548:3: (enumLiteral_2= 'Tokenisation' )
                    // InternalTyphonML.g:7549:4: enumLiteral_2= 'Tokenisation'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTokenisationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNlpTaskTypeAccess().getTokenisationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:7556:3: (enumLiteral_3= 'PhraseExtractor' )
                    {
                    // InternalTyphonML.g:7556:3: (enumLiteral_3= 'PhraseExtractor' )
                    // InternalTyphonML.g:7557:4: enumLiteral_3= 'PhraseExtractor'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getPhraseExtractorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNlpTaskTypeAccess().getPhraseExtractorEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:7564:3: (enumLiteral_4= 'NGramExtractor' )
                    {
                    // InternalTyphonML.g:7564:3: (enumLiteral_4= 'NGramExtractor' )
                    // InternalTyphonML.g:7565:4: enumLiteral_4= 'NGramExtractor'
                    {
                    enumLiteral_4=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getNGramExtractorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNlpTaskTypeAccess().getNGramExtractorEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:7572:3: (enumLiteral_5= 'POSTagging' )
                    {
                    // InternalTyphonML.g:7572:3: (enumLiteral_5= 'POSTagging' )
                    // InternalTyphonML.g:7573:4: enumLiteral_5= 'POSTagging'
                    {
                    enumLiteral_5=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getPOSTaggingEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNlpTaskTypeAccess().getPOSTaggingEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:7580:3: (enumLiteral_6= 'Lemmatisation' )
                    {
                    // InternalTyphonML.g:7580:3: (enumLiteral_6= 'Lemmatisation' )
                    // InternalTyphonML.g:7581:4: enumLiteral_6= 'Lemmatisation'
                    {
                    enumLiteral_6=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getLemmatisationEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNlpTaskTypeAccess().getLemmatisationEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:7588:3: (enumLiteral_7= 'Stemming' )
                    {
                    // InternalTyphonML.g:7588:3: (enumLiteral_7= 'Stemming' )
                    // InternalTyphonML.g:7589:4: enumLiteral_7= 'Stemming'
                    {
                    enumLiteral_7=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getStemmingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getNlpTaskTypeAccess().getStemmingEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:7596:3: (enumLiteral_8= 'DependencyParsing' )
                    {
                    // InternalTyphonML.g:7596:3: (enumLiteral_8= 'DependencyParsing' )
                    // InternalTyphonML.g:7597:4: enumLiteral_8= 'DependencyParsing'
                    {
                    enumLiteral_8=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getDependencyParsingEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getNlpTaskTypeAccess().getDependencyParsingEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:7604:3: (enumLiteral_9= 'Chunking' )
                    {
                    // InternalTyphonML.g:7604:3: (enumLiteral_9= 'Chunking' )
                    // InternalTyphonML.g:7605:4: enumLiteral_9= 'Chunking'
                    {
                    enumLiteral_9=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getChunkingEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getNlpTaskTypeAccess().getChunkingEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:7612:3: (enumLiteral_10= 'SentimentAnalysis' )
                    {
                    // InternalTyphonML.g:7612:3: (enumLiteral_10= 'SentimentAnalysis' )
                    // InternalTyphonML.g:7613:4: enumLiteral_10= 'SentimentAnalysis'
                    {
                    enumLiteral_10=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getSentimentAnalysisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getNlpTaskTypeAccess().getSentimentAnalysisEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:7620:3: (enumLiteral_11= 'TextClassification' )
                    {
                    // InternalTyphonML.g:7620:3: (enumLiteral_11= 'TextClassification' )
                    // InternalTyphonML.g:7621:4: enumLiteral_11= 'TextClassification'
                    {
                    enumLiteral_11=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTextClassificationEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getNlpTaskTypeAccess().getTextClassificationEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTyphonML.g:7628:3: (enumLiteral_12= 'TopicModelling' )
                    {
                    // InternalTyphonML.g:7628:3: (enumLiteral_12= 'TopicModelling' )
                    // InternalTyphonML.g:7629:4: enumLiteral_12= 'TopicModelling'
                    {
                    enumLiteral_12=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTopicModellingEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getNlpTaskTypeAccess().getTopicModellingEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTyphonML.g:7636:3: (enumLiteral_13= 'TermExtraction' )
                    {
                    // InternalTyphonML.g:7636:3: (enumLiteral_13= 'TermExtraction' )
                    // InternalTyphonML.g:7637:4: enumLiteral_13= 'TermExtraction'
                    {
                    enumLiteral_13=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTermExtractionEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getNlpTaskTypeAccess().getTermExtractionEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTyphonML.g:7644:3: (enumLiteral_14= 'NamedEntityRecognition' )
                    {
                    // InternalTyphonML.g:7644:3: (enumLiteral_14= 'NamedEntityRecognition' )
                    // InternalTyphonML.g:7645:4: enumLiteral_14= 'NamedEntityRecognition'
                    {
                    enumLiteral_14=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getNamedEntityRecognitionEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getNlpTaskTypeAccess().getNamedEntityRecognitionEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTyphonML.g:7652:3: (enumLiteral_15= 'RelationExtraction' )
                    {
                    // InternalTyphonML.g:7652:3: (enumLiteral_15= 'RelationExtraction' )
                    // InternalTyphonML.g:7653:4: enumLiteral_15= 'RelationExtraction'
                    {
                    enumLiteral_15=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getRelationExtractionEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getNlpTaskTypeAccess().getRelationExtractionEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTyphonML.g:7660:3: (enumLiteral_16= 'CoreferenceResolution' )
                    {
                    // InternalTyphonML.g:7660:3: (enumLiteral_16= 'CoreferenceResolution' )
                    // InternalTyphonML.g:7661:4: enumLiteral_16= 'CoreferenceResolution'
                    {
                    enumLiteral_16=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getCoreferenceResolutionEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getNlpTaskTypeAccess().getCoreferenceResolutionEnumLiteralDeclaration_16());
                    			

                    }


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
    // $ANTLR end "ruleNlpTaskType"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\4\2\41\1\uffff\3\4\2\uffff";
    static final String dfa_3s = "\1\102\1\5\2\41\1\uffff\2\5\1\34\2\uffff";
    static final String dfa_4s = "\4\uffff\1\3\3\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\32\uffff\1\1\41\uffff\1\4",
            "\1\5\1\6",
            "\1\7",
            "\1\7",
            "",
            "\1\2\1\3",
            "\1\2\1\3",
            "\2\11\13\uffff\14\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1721:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_CustomAttribute_1= ruleCustomAttribute | this_AddCustomDataTypeAttribute_2= ruleAddCustomDataTypeAttribute )";
        }
    }
    static final String dfa_7s = "\55\uffff";
    static final String dfa_8s = "\1\40\1\4\3\46\1\137\5\uffff\1\46\20\uffff\2\112\14\uffff\1\125\2\uffff";
    static final String dfa_9s = "\1\163\1\5\1\135\1\162\1\135\1\140\5\uffff\1\46\20\uffff\2\153\14\uffff\1\127\2\uffff";
    static final String dfa_10s = "\6\uffff\1\12\1\13\1\14\1\15\1\17\1\uffff\1\22\1\23\1\25\1\26\1\27\1\30\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\2\uffff\1\7\1\1\1\11\1\2\1\24\1\31\1\5\1\4\1\3\1\10\1\6\1\16\1\uffff\1\21\1\20";
    static final String dfa_11s = "\55\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\41\uffff\1\31\2\uffff\1\32\2\uffff\1\33\1\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\12\3\uffff\1\14\1\13\5\uffff\1\15\3\uffff\1\5\2\uffff\1\6\1\7\1\10\1\11\1\20\1\uffff\1\21\1\16\1\17\1\24\1\26\1\25\1\27\1\uffff\1\30\1\uffff\1\22\1\uffff\1\23",
            "\1\34\1\35",
            "\1\37\66\uffff\1\36",
            "\1\41\2\uffff\1\42\62\uffff\1\44\1\40\24\uffff\1\43",
            "\1\46\65\uffff\1\45\1\47",
            "\1\50\1\51",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\37\uffff\1\24\1\26",
            "\1\2\37\uffff\1\24\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\1\53",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4303:2: (this_AddEntity_0= ruleAddEntity | this_RenameEntity_1= ruleRenameEntity | this_RemoveEntity_2= ruleRemoveEntity | this_RemoveAttribute_3= ruleRemoveAttribute | this_RenameAttribute_4= ruleRenameAttribute | this_ChangeRelationContainement_5= ruleChangeRelationContainement | this_AddRelation_6= ruleAddRelation | this_RemoveRelation_7= ruleRemoveRelation | this_RenameRelation_8= ruleRenameRelation | this_EnableRelationContainment_9= ruleEnableRelationContainment | this_DisableRelationContainment_10= ruleDisableRelationContainment | this_EnableBidirectionalRelation_11= ruleEnableBidirectionalRelation | this_DisableBidirectionalRelation_12= ruleDisableBidirectionalRelation | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_SplitEntity_14= ruleSplitEntity | this_SplitEntityVertical_15= ruleSplitEntityVertical | this_SplitEntityHorizontal_16= ruleSplitEntityHorizontal | this_MigrateEntity_17= ruleMigrateEntity | this_MergeEntity_18= ruleMergeEntity | this_RenameTable_19= ruleRenameTable | this_AddIndex_20= ruleAddIndex | this_DropIndex_21= ruleDropIndex | this_AddAttributesToIndex_22= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_23= ruleRemoveAttributesToIndex | this_RenameCollection_24= ruleRenameCollection | this_AddCollectionIndex_25= ruleAddCollectionIndex | this_DropCollectionIndex_26= ruleDropCollectionIndex | this_AddGraphAttribute_27= ruleAddGraphAttribute | this_RemoveGraphAttribute_28= ruleRemoveGraphAttribute | this_AddGraphEdge_29= ruleAddGraphEdge | this_RemoveGraphEdge_30= ruleRemoveGraphEdge | this_RenabeGraphEdgeLabel_31= ruleRenabeGraphEdgeLabel | this_AddCustomDataTypeAttribute_32= ruleAddCustomDataTypeAttribute | this_ChangePrimitiveDataTypeAttribute_33= ruleChangePrimitiveDataTypeAttribute | this_ChangeCustomDataTypeAttribute_34= ruleChangeCustomDataTypeAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0954006520000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0954006500000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0954000100000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L,0x000ABFBE4418D524L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0xFF00000000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180001030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001FFE0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000001002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002840180000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002840180000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002800180000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000030L,0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001400080000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020180000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000080000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000080000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0600000080000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000080000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000100000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000080000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xC000000080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000400080000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000100004030L,0x0000000000000004L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000100006030L,0x0000000000000004L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000100000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000100004000L,0x0000000000000400L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000100006000L,0x0000000000000400L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000006500000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000080000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x2000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});

}