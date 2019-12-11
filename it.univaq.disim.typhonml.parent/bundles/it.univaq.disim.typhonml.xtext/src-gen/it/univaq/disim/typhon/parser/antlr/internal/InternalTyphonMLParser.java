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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'changeOperators'", "'['", "','", "']'", "'rename'", "'collection'", "'as'", "'extends'", "'tableindex'", "'{'", "'}'", "'reduce'", "'table'", "'drop'", "'create'", "'change'", "'attribute'", "'type'", "'migrate'", "'to'", "'split'", "'entity'", "'vertical'", "'attributes:'", "'horizontal'", "'where'", "'value'", "'merge'", "'entities'", "'relation'", "'remove'", "'containment'", "'cardinality'", "'importedNamespace'", "'datatype'", "':'", "'freetext'", "'customdatatype'", "'elements'", "'->'", "'.'", "'true'", "'false'", "'db'", "'('", "')'", "'node'", "'!'", "'column'", "'attributes'", "'index'", "'references'", "'idSpec'", "'relationaldb'", "'tables'", "'documentdb'", "'collections'", "'keyvaluedb'", "'graphdb'", "'nodes'", "'edges'", "'columndb'", "'columns'", "'edge'", "'from'", "'labels'", "'add'", "'AddGraphEdge'", "'='", "'AddGraphAttribute'", "'relations'", "'0..1'", "'1'", "'0..*'", "'*'", "'ParagraphSegmentation'", "'SentenceSegmentation'", "'Tokenisation'", "'PhraseExtractor'", "'NGramExtractor'", "'POSTagging'", "'Lemmatisation'", "'Stemming'", "'DependencyParsing'", "'Chunking'", "'SentimentAnalysis'", "'TextClassification'", "'TopicModelling'", "'TermExtraction'", "'NamedEntityRecognition'", "'RelationExtraction'", "'EventExtraction'", "'CoreferenceResolution'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalTyphonML.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* (otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_dataTypes_1_0 = null;

        EObject lv_databases_2_0 = null;

        EObject lv_changeOperators_5_0 = null;

        EObject lv_changeOperators_7_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:78:2: ( ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* (otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']' )? ) )
            // InternalTyphonML.g:79:2: ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* (otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']' )? )
            {
            // InternalTyphonML.g:79:2: ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* (otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']' )? )
            // InternalTyphonML.g:80:3: () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* (otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']' )?
            {
            // InternalTyphonML.g:80:3: ()
            // InternalTyphonML.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:87:3: ( (lv_dataTypes_1_0= ruleDataType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_STRING) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==32||LA1_4==45||LA1_4==48) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_1==RULE_ID) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==32||LA1_5==45||LA1_5==48) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==32||LA1_0==45||LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTyphonML.g:88:4: (lv_dataTypes_1_0= ruleDataType )
            	    {
            	    // InternalTyphonML.g:88:4: (lv_dataTypes_1_0= ruleDataType )
            	    // InternalTyphonML.g:89:5: lv_dataTypes_1_0= ruleDataType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDataTypesDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_dataTypes_1_0=ruleDataType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataTypes",
            	    						lv_dataTypes_1_0,
            	    						"it.univaq.disim.typhon.TyphonML.DataType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTyphonML.g:106:3: ( (lv_databases_2_0= ruleDatabase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44||LA2_0==64||LA2_0==66||(LA2_0>=68 && LA2_0<=69)||LA2_0==72) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTyphonML.g:107:4: (lv_databases_2_0= ruleDatabase )
            	    {
            	    // InternalTyphonML.g:107:4: (lv_databases_2_0= ruleDatabase )
            	    // InternalTyphonML.g:108:5: lv_databases_2_0= ruleDatabase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDatabasesDatabaseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_databases_2_0=ruleDatabase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"databases",
            	    						lv_databases_2_0,
            	    						"it.univaq.disim.typhon.TyphonML.Database");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTyphonML.g:125:3: (otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTyphonML.g:126:4: otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) ) (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getChangeOperatorsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalTyphonML.g:134:4: ( (lv_changeOperators_5_0= ruleChangeOperator ) )
                    // InternalTyphonML.g:135:5: (lv_changeOperators_5_0= ruleChangeOperator )
                    {
                    // InternalTyphonML.g:135:5: (lv_changeOperators_5_0= ruleChangeOperator )
                    // InternalTyphonML.g:136:6: lv_changeOperators_5_0= ruleChangeOperator
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getChangeOperatorsChangeOperatorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_changeOperators_5_0=ruleChangeOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"changeOperators",
                    							lv_changeOperators_5_0,
                    							"it.univaq.disim.typhon.TyphonML.ChangeOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:153:4: (otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTyphonML.g:154:5: otherlv_6= ',' ( (lv_changeOperators_7_0= ruleChangeOperator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTyphonML.g:158:5: ( (lv_changeOperators_7_0= ruleChangeOperator ) )
                    	    // InternalTyphonML.g:159:6: (lv_changeOperators_7_0= ruleChangeOperator )
                    	    {
                    	    // InternalTyphonML.g:159:6: (lv_changeOperators_7_0= ruleChangeOperator )
                    	    // InternalTyphonML.g:160:7: lv_changeOperators_7_0= ruleChangeOperator
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getChangeOperatorsChangeOperatorParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_changeOperators_7_0=ruleChangeOperator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"changeOperators",
                    	    								lv_changeOperators_7_0,
                    	    								"it.univaq.disim.typhon.TyphonML.ChangeOperator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightSquareBracketKeyword_3_4());
                    			

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
    // InternalTyphonML.g:187:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTyphonML.g:187:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTyphonML.g:188:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalTyphonML.g:194:1: ruleDataType returns [EObject current=null] : (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_CustomDataType_1= ruleCustomDataType | this_Entity_Impl_2= ruleEntity_Impl ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveDataType_Impl_0 = null;

        EObject this_CustomDataType_1 = null;

        EObject this_Entity_Impl_2 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:200:2: ( (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_CustomDataType_1= ruleCustomDataType | this_Entity_Impl_2= ruleEntity_Impl ) )
            // InternalTyphonML.g:201:2: (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_CustomDataType_1= ruleCustomDataType | this_Entity_Impl_2= ruleEntity_Impl )
            {
            // InternalTyphonML.g:201:2: (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_CustomDataType_1= ruleCustomDataType | this_Entity_Impl_2= ruleEntity_Impl )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 32:
                        {
                        alt5=3;
                        }
                        break;
                    case 45:
                        {
                        alt5=1;
                        }
                        break;
                    case 48:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA5_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 45:
                        {
                        alt5=1;
                        }
                        break;
                    case 48:
                        {
                        alt5=2;
                        }
                        break;
                    case 32:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTyphonML.g:202:3: this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getPrimitiveDataType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveDataType_Impl_0=rulePrimitiveDataType_Impl();

                    state._fsp--;


                    			current = this_PrimitiveDataType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:211:3: this_CustomDataType_1= ruleCustomDataType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getCustomDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomDataType_1=ruleCustomDataType();

                    state._fsp--;


                    			current = this_CustomDataType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:220:3: this_Entity_Impl_2= ruleEntity_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEntity_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_Impl_2=ruleEntity_Impl();

                    state._fsp--;


                    			current = this_Entity_Impl_2;
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


    // $ANTLR start "entryRuleChangeOperator"
    // InternalTyphonML.g:232:1: entryRuleChangeOperator returns [EObject current=null] : iv_ruleChangeOperator= ruleChangeOperator EOF ;
    public final EObject entryRuleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeOperator = null;


        try {
            // InternalTyphonML.g:232:55: (iv_ruleChangeOperator= ruleChangeOperator EOF )
            // InternalTyphonML.g:233:2: iv_ruleChangeOperator= ruleChangeOperator EOF
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
    // InternalTyphonML.g:239:1: ruleChangeOperator returns [EObject current=null] : (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntityVertical_4= ruleSplitEntityVertical | this_SplitEntityHorizontal_5= ruleSplitEntityHorizontal | this_MergeEntity_6= ruleMergeEntity | this_AddAttribute_7= ruleAddAttribute | this_AddRelation_8= ruleAddRelation | this_RenameAttribute_9= ruleRenameAttribute | this_RenameRelation_10= ruleRenameRelation | this_RemoveAttribute_11= ruleRemoveAttribute | this_RemoveRelation_12= ruleRemoveRelation | this_ChangeRelationContainement_13= ruleChangeRelationContainement | this_ChangeRelationCardinality_14= ruleChangeRelationCardinality | this_ChangeAttributeType_15= ruleChangeAttributeType | this_AddIndexTable_16= ruleAddIndexTable | this_DropIndexTable_17= ruleDropIndexTable | this_RenameTable_18= ruleRenameTable | this_AddAttributesToIndex_19= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_20= ruleRemoveAttributesToIndex | this_RenameCollection_21= ruleRenameCollection ) ;
    public final EObject ruleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AddEntity_0 = null;

        EObject this_RemoveEntity_1 = null;

        EObject this_RenameEntity_2 = null;

        EObject this_MigrateEntity_3 = null;

        EObject this_SplitEntityVertical_4 = null;

        EObject this_SplitEntityHorizontal_5 = null;

        EObject this_MergeEntity_6 = null;

        EObject this_AddAttribute_7 = null;

        EObject this_AddRelation_8 = null;

        EObject this_RenameAttribute_9 = null;

        EObject this_RenameRelation_10 = null;

        EObject this_RemoveAttribute_11 = null;

        EObject this_RemoveRelation_12 = null;

        EObject this_ChangeRelationContainement_13 = null;

        EObject this_ChangeRelationCardinality_14 = null;

        EObject this_ChangeAttributeType_15 = null;

        EObject this_AddIndexTable_16 = null;

        EObject this_DropIndexTable_17 = null;

        EObject this_RenameTable_18 = null;

        EObject this_AddAttributesToIndex_19 = null;

        EObject this_RemoveAttributesToIndex_20 = null;

        EObject this_RenameCollection_21 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:245:2: ( (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntityVertical_4= ruleSplitEntityVertical | this_SplitEntityHorizontal_5= ruleSplitEntityHorizontal | this_MergeEntity_6= ruleMergeEntity | this_AddAttribute_7= ruleAddAttribute | this_AddRelation_8= ruleAddRelation | this_RenameAttribute_9= ruleRenameAttribute | this_RenameRelation_10= ruleRenameRelation | this_RemoveAttribute_11= ruleRemoveAttribute | this_RemoveRelation_12= ruleRemoveRelation | this_ChangeRelationContainement_13= ruleChangeRelationContainement | this_ChangeRelationCardinality_14= ruleChangeRelationCardinality | this_ChangeAttributeType_15= ruleChangeAttributeType | this_AddIndexTable_16= ruleAddIndexTable | this_DropIndexTable_17= ruleDropIndexTable | this_RenameTable_18= ruleRenameTable | this_AddAttributesToIndex_19= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_20= ruleRemoveAttributesToIndex | this_RenameCollection_21= ruleRenameCollection ) )
            // InternalTyphonML.g:246:2: (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntityVertical_4= ruleSplitEntityVertical | this_SplitEntityHorizontal_5= ruleSplitEntityHorizontal | this_MergeEntity_6= ruleMergeEntity | this_AddAttribute_7= ruleAddAttribute | this_AddRelation_8= ruleAddRelation | this_RenameAttribute_9= ruleRenameAttribute | this_RenameRelation_10= ruleRenameRelation | this_RemoveAttribute_11= ruleRemoveAttribute | this_RemoveRelation_12= ruleRemoveRelation | this_ChangeRelationContainement_13= ruleChangeRelationContainement | this_ChangeRelationCardinality_14= ruleChangeRelationCardinality | this_ChangeAttributeType_15= ruleChangeAttributeType | this_AddIndexTable_16= ruleAddIndexTable | this_DropIndexTable_17= ruleDropIndexTable | this_RenameTable_18= ruleRenameTable | this_AddAttributesToIndex_19= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_20= ruleRemoveAttributesToIndex | this_RenameCollection_21= ruleRenameCollection )
            {
            // InternalTyphonML.g:246:2: (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntityVertical_4= ruleSplitEntityVertical | this_SplitEntityHorizontal_5= ruleSplitEntityHorizontal | this_MergeEntity_6= ruleMergeEntity | this_AddAttribute_7= ruleAddAttribute | this_AddRelation_8= ruleAddRelation | this_RenameAttribute_9= ruleRenameAttribute | this_RenameRelation_10= ruleRenameRelation | this_RemoveAttribute_11= ruleRemoveAttribute | this_RemoveRelation_12= ruleRemoveRelation | this_ChangeRelationContainement_13= ruleChangeRelationContainement | this_ChangeRelationCardinality_14= ruleChangeRelationCardinality | this_ChangeAttributeType_15= ruleChangeAttributeType | this_AddIndexTable_16= ruleAddIndexTable | this_DropIndexTable_17= ruleDropIndexTable | this_RenameTable_18= ruleRenameTable | this_AddAttributesToIndex_19= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_20= ruleRemoveAttributesToIndex | this_RenameCollection_21= ruleRenameCollection )
            int alt6=22;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalTyphonML.g:247:3: this_AddEntity_0= ruleAddEntity
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
                    // InternalTyphonML.g:256:3: this_RemoveEntity_1= ruleRemoveEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveEntity_1=ruleRemoveEntity();

                    state._fsp--;


                    			current = this_RemoveEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:265:3: this_RenameEntity_2= ruleRenameEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameEntityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameEntity_2=ruleRenameEntity();

                    state._fsp--;


                    			current = this_RenameEntity_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:274:3: this_MigrateEntity_3= ruleMigrateEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getMigrateEntityParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MigrateEntity_3=ruleMigrateEntity();

                    state._fsp--;


                    			current = this_MigrateEntity_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:283:3: this_SplitEntityVertical_4= ruleSplitEntityVertical
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getSplitEntityVerticalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntityVertical_4=ruleSplitEntityVertical();

                    state._fsp--;


                    			current = this_SplitEntityVertical_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:292:3: this_SplitEntityHorizontal_5= ruleSplitEntityHorizontal
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getSplitEntityHorizontalParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntityHorizontal_5=ruleSplitEntityHorizontal();

                    state._fsp--;


                    			current = this_SplitEntityHorizontal_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:301:3: this_MergeEntity_6= ruleMergeEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getMergeEntityParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeEntity_6=ruleMergeEntity();

                    state._fsp--;


                    			current = this_MergeEntity_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:310:3: this_AddAttribute_7= ruleAddAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddAttributeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttribute_7=ruleAddAttribute();

                    state._fsp--;


                    			current = this_AddAttribute_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:319:3: this_AddRelation_8= ruleAddRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddRelationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRelation_8=ruleAddRelation();

                    state._fsp--;


                    			current = this_AddRelation_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:328:3: this_RenameAttribute_9= ruleRenameAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameAttributeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameAttribute_9=ruleRenameAttribute();

                    state._fsp--;


                    			current = this_RenameAttribute_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:337:3: this_RenameRelation_10= ruleRenameRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameRelationParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameRelation_10=ruleRenameRelation();

                    state._fsp--;


                    			current = this_RenameRelation_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:346:3: this_RemoveAttribute_11= ruleRemoveAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttribute_11=ruleRemoveAttribute();

                    state._fsp--;


                    			current = this_RemoveAttribute_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTyphonML.g:355:3: this_RemoveRelation_12= ruleRemoveRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveRelationParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveRelation_12=ruleRemoveRelation();

                    state._fsp--;


                    			current = this_RemoveRelation_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTyphonML.g:364:3: this_ChangeRelationContainement_13= ruleChangeRelationContainement
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeRelationContainementParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeRelationContainement_13=ruleChangeRelationContainement();

                    state._fsp--;


                    			current = this_ChangeRelationContainement_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalTyphonML.g:373:3: this_ChangeRelationCardinality_14= ruleChangeRelationCardinality
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeRelationCardinalityParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeRelationCardinality_14=ruleChangeRelationCardinality();

                    state._fsp--;


                    			current = this_ChangeRelationCardinality_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTyphonML.g:382:3: this_ChangeAttributeType_15= ruleChangeAttributeType
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeAttributeTypeParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeAttributeType_15=ruleChangeAttributeType();

                    state._fsp--;


                    			current = this_ChangeAttributeType_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTyphonML.g:391:3: this_AddIndexTable_16= ruleAddIndexTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddIndexTableParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddIndexTable_16=ruleAddIndexTable();

                    state._fsp--;


                    			current = this_AddIndexTable_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTyphonML.g:400:3: this_DropIndexTable_17= ruleDropIndexTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getDropIndexTableParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropIndexTable_17=ruleDropIndexTable();

                    state._fsp--;


                    			current = this_DropIndexTable_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTyphonML.g:409:3: this_RenameTable_18= ruleRenameTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameTableParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameTable_18=ruleRenameTable();

                    state._fsp--;


                    			current = this_RenameTable_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTyphonML.g:418:3: this_AddAttributesToIndex_19= ruleAddAttributesToIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddAttributesToIndexParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttributesToIndex_19=ruleAddAttributesToIndex();

                    state._fsp--;


                    			current = this_AddAttributesToIndex_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalTyphonML.g:427:3: this_RemoveAttributesToIndex_20= ruleRemoveAttributesToIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributesToIndexParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttributesToIndex_20=ruleRemoveAttributesToIndex();

                    state._fsp--;


                    			current = this_RemoveAttributesToIndex_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalTyphonML.g:436:3: this_RenameCollection_21= ruleRenameCollection
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameCollectionParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameCollection_21=ruleRenameCollection();

                    state._fsp--;


                    			current = this_RenameCollection_21;
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


    // $ANTLR start "entryRuleRenameCollection"
    // InternalTyphonML.g:448:1: entryRuleRenameCollection returns [EObject current=null] : iv_ruleRenameCollection= ruleRenameCollection EOF ;
    public final EObject entryRuleRenameCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameCollection = null;


        try {
            // InternalTyphonML.g:448:57: (iv_ruleRenameCollection= ruleRenameCollection EOF )
            // InternalTyphonML.g:449:2: iv_ruleRenameCollection= ruleRenameCollection EOF
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
    // InternalTyphonML.g:455:1: ruleRenameCollection returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:461:2: ( (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:462:2: (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:462:2: (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:463:3: otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameCollectionAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameCollectionAccess().getCollectionKeyword_1());
            		
            // InternalTyphonML.g:471:3: ( ( ruleEString ) )
            // InternalTyphonML.g:472:4: ( ruleEString )
            {
            // InternalTyphonML.g:472:4: ( ruleEString )
            // InternalTyphonML.g:473:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameCollectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameCollectionAccess().getCollectionToRenameCollectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameCollectionAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:491:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:492:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:492:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:493:5: lv_newName_4_0= ruleEString
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


    // $ANTLR start "entryRuleAddAttributesToIndex"
    // InternalTyphonML.g:514:1: entryRuleAddAttributesToIndex returns [EObject current=null] : iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF ;
    public final EObject entryRuleAddAttributesToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttributesToIndex = null;


        try {
            // InternalTyphonML.g:514:61: (iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF )
            // InternalTyphonML.g:515:2: iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF
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
    // InternalTyphonML.g:521:1: ruleAddAttributesToIndex returns [EObject current=null] : (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAddAttributesToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:527:2: ( (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:528:2: (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:528:2: (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:529:3: otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAttributesToIndexAccess().getExtendsKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAttributesToIndexAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:537:3: ( ( ruleEString ) )
            // InternalTyphonML.g:538:4: ( ruleEString )
            {
            // InternalTyphonML.g:538:4: ( ruleEString )
            // InternalTyphonML.g:539:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributesToIndexAccess().getTableTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributesToIndexAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:557:3: ( ( ruleEString ) )
            // InternalTyphonML.g:558:4: ( ruleEString )
            {
            // InternalTyphonML.g:558:4: ( ruleEString )
            // InternalTyphonML.g:559:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributesToIndexAccess().getAttributesAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:573:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTyphonML.g:574:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddAttributesToIndexAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:578:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:579:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:579:5: ( ruleEString )
                    // InternalTyphonML.g:580:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddAttributesToIndexRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddAttributesToIndexAccess().getAttributesAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:603:1: entryRuleRemoveAttributesToIndex returns [EObject current=null] : iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF ;
    public final EObject entryRuleRemoveAttributesToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttributesToIndex = null;


        try {
            // InternalTyphonML.g:603:64: (iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF )
            // InternalTyphonML.g:604:2: iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF
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
    // InternalTyphonML.g:610:1: ruleRemoveAttributesToIndex returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRemoveAttributesToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:616:2: ( (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:617:2: (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:617:2: (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:618:3: otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributesToIndexAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributesToIndexAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:626:3: ( ( ruleEString ) )
            // InternalTyphonML.g:627:4: ( ruleEString )
            {
            // InternalTyphonML.g:627:4: ( ruleEString )
            // InternalTyphonML.g:628:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveAttributesToIndexAccess().getTableTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRemoveAttributesToIndexAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:646:3: ( ( ruleEString ) )
            // InternalTyphonML.g:647:4: ( ruleEString )
            {
            // InternalTyphonML.g:647:4: ( ruleEString )
            // InternalTyphonML.g:648:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveAttributesToIndexRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveAttributesToIndexAccess().getAttributesAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:662:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:663:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRemoveAttributesToIndexAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:667:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:668:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:668:5: ( ruleEString )
                    // InternalTyphonML.g:669:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRemoveAttributesToIndexRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRemoveAttributesToIndexAccess().getAttributesAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:692:1: entryRuleRenameTable returns [EObject current=null] : iv_ruleRenameTable= ruleRenameTable EOF ;
    public final EObject entryRuleRenameTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameTable = null;


        try {
            // InternalTyphonML.g:692:52: (iv_ruleRenameTable= ruleRenameTable EOF )
            // InternalTyphonML.g:693:2: iv_ruleRenameTable= ruleRenameTable EOF
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
    // InternalTyphonML.g:699:1: ruleRenameTable returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:705:2: ( (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:706:2: (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:706:2: (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:707:3: otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameTableAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameTableAccess().getTableKeyword_1());
            		
            // InternalTyphonML.g:715:3: ( ( ruleEString ) )
            // InternalTyphonML.g:716:4: ( ruleEString )
            {
            // InternalTyphonML.g:716:4: ( ruleEString )
            // InternalTyphonML.g:717:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameTableAccess().getTableToRenameTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameTableAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:735:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:736:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:736:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:737:5: lv_newName_4_0= ruleEString
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


    // $ANTLR start "entryRuleDropIndexTable"
    // InternalTyphonML.g:758:1: entryRuleDropIndexTable returns [EObject current=null] : iv_ruleDropIndexTable= ruleDropIndexTable EOF ;
    public final EObject entryRuleDropIndexTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexTable = null;


        try {
            // InternalTyphonML.g:758:55: (iv_ruleDropIndexTable= ruleDropIndexTable EOF )
            // InternalTyphonML.g:759:2: iv_ruleDropIndexTable= ruleDropIndexTable EOF
            {
             newCompositeNode(grammarAccess.getDropIndexTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropIndexTable=ruleDropIndexTable();

            state._fsp--;

             current =iv_ruleDropIndexTable; 
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
    // $ANTLR end "entryRuleDropIndexTable"


    // $ANTLR start "ruleDropIndexTable"
    // InternalTyphonML.g:765:1: ruleDropIndexTable returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) ) ;
    public final EObject ruleDropIndexTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:771:2: ( (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:772:2: (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:772:2: (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) )
            // InternalTyphonML.g:773:3: otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDropIndexTableAccess().getDropKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDropIndexTableAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:781:3: ( ( ruleEString ) )
            // InternalTyphonML.g:782:4: ( ruleEString )
            {
            // InternalTyphonML.g:782:4: ( ruleEString )
            // InternalTyphonML.g:783:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropIndexTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDropIndexTableAccess().getTableTableCrossReference_2_0());
            				
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
    // $ANTLR end "ruleDropIndexTable"


    // $ANTLR start "entryRuleAddIndexTable"
    // InternalTyphonML.g:801:1: entryRuleAddIndexTable returns [EObject current=null] : iv_ruleAddIndexTable= ruleAddIndexTable EOF ;
    public final EObject entryRuleAddIndexTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddIndexTable = null;


        try {
            // InternalTyphonML.g:801:54: (iv_ruleAddIndexTable= ruleAddIndexTable EOF )
            // InternalTyphonML.g:802:2: iv_ruleAddIndexTable= ruleAddIndexTable EOF
            {
             newCompositeNode(grammarAccess.getAddIndexTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddIndexTable=ruleAddIndexTable();

            state._fsp--;

             current =iv_ruleAddIndexTable; 
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
    // $ANTLR end "entryRuleAddIndexTable"


    // $ANTLR start "ruleAddIndexTable"
    // InternalTyphonML.g:808:1: ruleAddIndexTable returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAddIndexTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:814:2: ( (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:815:2: (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:815:2: (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:816:3: otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAddIndexTableAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddIndexTableAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:824:3: ( ( ruleEString ) )
            // InternalTyphonML.g:825:4: ( ruleEString )
            {
            // InternalTyphonML.g:825:4: ( ruleEString )
            // InternalTyphonML.g:826:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddIndexTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddIndexTableAccess().getTableTableCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddIndexTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:844:3: ( ( ruleEString ) )
            // InternalTyphonML.g:845:4: ( ruleEString )
            {
            // InternalTyphonML.g:845:4: ( ruleEString )
            // InternalTyphonML.g:846:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddIndexTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddIndexTableAccess().getAttributesAttributeCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:860:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:861:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddIndexTableAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:865:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:866:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:866:5: ( ruleEString )
                    // InternalTyphonML.g:867:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddIndexTableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddIndexTableAccess().getAttributesAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAddIndexTableAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAddIndexTable"


    // $ANTLR start "entryRuleChangeAttributeType"
    // InternalTyphonML.g:890:1: entryRuleChangeAttributeType returns [EObject current=null] : iv_ruleChangeAttributeType= ruleChangeAttributeType EOF ;
    public final EObject entryRuleChangeAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAttributeType = null;


        try {
            // InternalTyphonML.g:890:60: (iv_ruleChangeAttributeType= ruleChangeAttributeType EOF )
            // InternalTyphonML.g:891:2: iv_ruleChangeAttributeType= ruleChangeAttributeType EOF
            {
             newCompositeNode(grammarAccess.getChangeAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeAttributeType=ruleChangeAttributeType();

            state._fsp--;

             current =iv_ruleChangeAttributeType; 
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
    // $ANTLR end "entryRuleChangeAttributeType"


    // $ANTLR start "ruleChangeAttributeType"
    // InternalTyphonML.g:897:1: ruleChangeAttributeType returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) ) ;
    public final EObject ruleChangeAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:903:2: ( (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:904:2: (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:904:2: (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) )
            // InternalTyphonML.g:905:3: otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAttributeTypeAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAttributeTypeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:913:3: ( ( ruleEString ) )
            // InternalTyphonML.g:914:4: ( ruleEString )
            {
            // InternalTyphonML.g:914:4: ( ruleEString )
            // InternalTyphonML.g:915:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeAttributeTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeAttributeTypeAccess().getAttributeToChangeAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeAttributeTypeAccess().getTypeKeyword_3());
            		
            // InternalTyphonML.g:933:3: ( ( ruleEString ) )
            // InternalTyphonML.g:934:4: ( ruleEString )
            {
            // InternalTyphonML.g:934:4: ( ruleEString )
            // InternalTyphonML.g:935:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeAttributeTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeAttributeTypeAccess().getNewTypeDataTypeCrossReference_4_0());
            				
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
    // $ANTLR end "ruleChangeAttributeType"


    // $ANTLR start "entryRuleMigrateEntity"
    // InternalTyphonML.g:953:1: entryRuleMigrateEntity returns [EObject current=null] : iv_ruleMigrateEntity= ruleMigrateEntity EOF ;
    public final EObject entryRuleMigrateEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrateEntity = null;


        try {
            // InternalTyphonML.g:953:54: (iv_ruleMigrateEntity= ruleMigrateEntity EOF )
            // InternalTyphonML.g:954:2: iv_ruleMigrateEntity= ruleMigrateEntity EOF
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
    // InternalTyphonML.g:960:1: ruleMigrateEntity returns [EObject current=null] : (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleMigrateEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTyphonML.g:966:2: ( (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:967:2: (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:967:2: (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            // InternalTyphonML.g:968:3: otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMigrateEntityAccess().getMigrateKeyword_0());
            		
            // InternalTyphonML.g:972:3: ( ( ruleEString ) )
            // InternalTyphonML.g:973:4: ( ruleEString )
            {
            // InternalTyphonML.g:973:4: ( ruleEString )
            // InternalTyphonML.g:974:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrateEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMigrateEntityAccess().getEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMigrateEntityAccess().getToKeyword_2());
            		
            // InternalTyphonML.g:992:3: ( ( ruleEString ) )
            // InternalTyphonML.g:993:4: ( ruleEString )
            {
            // InternalTyphonML.g:993:4: ( ruleEString )
            // InternalTyphonML.g:994:5: ruleEString
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
    // InternalTyphonML.g:1012:1: entryRuleSplitEntityVertical returns [EObject current=null] : iv_ruleSplitEntityVertical= ruleSplitEntityVertical EOF ;
    public final EObject entryRuleSplitEntityVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntityVertical = null;


        try {
            // InternalTyphonML.g:1012:60: (iv_ruleSplitEntityVertical= ruleSplitEntityVertical EOF )
            // InternalTyphonML.g:1013:2: iv_ruleSplitEntityVertical= ruleSplitEntityVertical EOF
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
    // InternalTyphonML.g:1019:1: ruleSplitEntityVertical returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' ) ;
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
            // InternalTyphonML.g:1025:2: ( (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' ) )
            // InternalTyphonML.g:1026:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' )
            {
            // InternalTyphonML.g:1026:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']' )
            // InternalTyphonML.g:1027:3: otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'vertical' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'attributes:' otherlv_7= '[' ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )* otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitEntityVerticalAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitEntityVerticalAccess().getEntityKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitEntityVerticalAccess().getVerticalKeyword_2());
            		
            // InternalTyphonML.g:1039:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1040:4: ( ruleEString )
            {
            // InternalTyphonML.g:1040:4: ( ruleEString )
            // InternalTyphonML.g:1041:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityVerticalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getEntity1EntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitEntityVerticalAccess().getToKeyword_4());
            		
            // InternalTyphonML.g:1059:3: ( (lv_entity2name_5_0= ruleEString ) )
            // InternalTyphonML.g:1060:4: (lv_entity2name_5_0= ruleEString )
            {
            // InternalTyphonML.g:1060:4: (lv_entity2name_5_0= ruleEString )
            // InternalTyphonML.g:1061:5: lv_entity2name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getEntity2nameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_6=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSplitEntityVerticalAccess().getAttributesKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getSplitEntityVerticalAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalTyphonML.g:1086:3: ( ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTyphonML.g:1087:4: ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
            	    {
            	    // InternalTyphonML.g:1087:4: ( ( ruleEString ) )
            	    // InternalTyphonML.g:1088:5: ( ruleEString )
            	    {
            	    // InternalTyphonML.g:1088:5: ( ruleEString )
            	    // InternalTyphonML.g:1089:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSplitEntityVerticalRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getAttributeListAttributeCrossReference_8_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTyphonML.g:1103:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==13) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalTyphonML.g:1104:5: otherlv_9= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FOLLOW_9); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getSplitEntityVerticalAccess().getCommaKeyword_8_1_0());
            	    	    				
            	    	    // InternalTyphonML.g:1108:5: ( ( ruleEString ) )
            	    	    // InternalTyphonML.g:1109:6: ( ruleEString )
            	    	    {
            	    	    // InternalTyphonML.g:1109:6: ( ruleEString )
            	    	    // InternalTyphonML.g:1110:7: ruleEString
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getSplitEntityVerticalRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getSplitEntityVerticalAccess().getAttributeListAttributeCrossReference_8_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_23);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTyphonML.g:1134:1: entryRuleSplitEntityHorizontal returns [EObject current=null] : iv_ruleSplitEntityHorizontal= ruleSplitEntityHorizontal EOF ;
    public final EObject entryRuleSplitEntityHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntityHorizontal = null;


        try {
            // InternalTyphonML.g:1134:62: (iv_ruleSplitEntityHorizontal= ruleSplitEntityHorizontal EOF )
            // InternalTyphonML.g:1135:2: iv_ruleSplitEntityHorizontal= ruleSplitEntityHorizontal EOF
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
    // InternalTyphonML.g:1141:1: ruleSplitEntityHorizontal returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) ) ;
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
            // InternalTyphonML.g:1147:2: ( (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) ) )
            // InternalTyphonML.g:1148:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) )
            {
            // InternalTyphonML.g:1148:2: (otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) ) )
            // InternalTyphonML.g:1149:3: otherlv_0= 'split' otherlv_1= 'entity' otherlv_2= 'horizontal' ( ( ruleEString ) ) otherlv_4= 'to' ( (lv_entity2name_5_0= ruleEString ) ) otherlv_6= 'where' ( ( ruleEString ) ) otherlv_8= 'value' ( (lv_expression_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitEntityHorizontalAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitEntityHorizontalAccess().getEntityKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitEntityHorizontalAccess().getHorizontalKeyword_2());
            		
            // InternalTyphonML.g:1161:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1162:4: ( ruleEString )
            {
            // InternalTyphonML.g:1162:4: ( ruleEString )
            // InternalTyphonML.g:1163:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityHorizontalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityHorizontalAccess().getEntity1EntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitEntityHorizontalAccess().getToKeyword_4());
            		
            // InternalTyphonML.g:1181:3: ( (lv_entity2name_5_0= ruleEString ) )
            // InternalTyphonML.g:1182:4: (lv_entity2name_5_0= ruleEString )
            {
            // InternalTyphonML.g:1182:4: (lv_entity2name_5_0= ruleEString )
            // InternalTyphonML.g:1183:5: lv_entity2name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSplitEntityHorizontalAccess().getEntity2nameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_6=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSplitEntityHorizontalAccess().getWhereKeyword_6());
            		
            // InternalTyphonML.g:1204:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1205:4: ( ruleEString )
            {
            // InternalTyphonML.g:1205:4: ( ruleEString )
            // InternalTyphonML.g:1206:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityHorizontalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityHorizontalAccess().getAttributeAttributeCrossReference_7_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getSplitEntityHorizontalAccess().getValueKeyword_8());
            		
            // InternalTyphonML.g:1224:3: ( (lv_expression_9_0= RULE_STRING ) )
            // InternalTyphonML.g:1225:4: (lv_expression_9_0= RULE_STRING )
            {
            // InternalTyphonML.g:1225:4: (lv_expression_9_0= RULE_STRING )
            // InternalTyphonML.g:1226:5: lv_expression_9_0= RULE_STRING
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
    // InternalTyphonML.g:1246:1: entryRuleMergeEntity returns [EObject current=null] : iv_ruleMergeEntity= ruleMergeEntity EOF ;
    public final EObject entryRuleMergeEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeEntity = null;


        try {
            // InternalTyphonML.g:1246:52: (iv_ruleMergeEntity= ruleMergeEntity EOF )
            // InternalTyphonML.g:1247:2: iv_ruleMergeEntity= ruleMergeEntity EOF
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
    // InternalTyphonML.g:1253:1: ruleMergeEntity returns [EObject current=null] : (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) ) ;
    public final EObject ruleMergeEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_newEntityName_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1259:2: ( (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1260:2: (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1260:2: (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) )
            // InternalTyphonML.g:1261:3: otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeEntityAccess().getMergeKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMergeEntityAccess().getEntitiesKeyword_1());
            		
            // InternalTyphonML.g:1269:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1270:4: ( ruleEString )
            {
            // InternalTyphonML.g:1270:4: ( ruleEString )
            // InternalTyphonML.g:1271:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMergeEntityAccess().getFirstEntityToMergeEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1285:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1286:4: ( ruleEString )
            {
            // InternalTyphonML.g:1286:4: ( ruleEString )
            // InternalTyphonML.g:1287:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMergeEntityAccess().getSecondEntityToMergeEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMergeEntityAccess().getAsKeyword_4());
            		
            // InternalTyphonML.g:1305:3: ( (lv_newEntityName_5_0= ruleEString ) )
            // InternalTyphonML.g:1306:4: (lv_newEntityName_5_0= ruleEString )
            {
            // InternalTyphonML.g:1306:4: (lv_newEntityName_5_0= ruleEString )
            // InternalTyphonML.g:1307:5: lv_newEntityName_5_0= ruleEString
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
    // InternalTyphonML.g:1328:1: entryRuleRenameAttribute returns [EObject current=null] : iv_ruleRenameAttribute= ruleRenameAttribute EOF ;
    public final EObject entryRuleRenameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameAttribute = null;


        try {
            // InternalTyphonML.g:1328:56: (iv_ruleRenameAttribute= ruleRenameAttribute EOF )
            // InternalTyphonML.g:1329:2: iv_ruleRenameAttribute= ruleRenameAttribute EOF
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
    // InternalTyphonML.g:1335:1: ruleRenameAttribute returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1341:2: ( (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1342:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1342:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1343:3: otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameAttributeAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:1351:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1352:4: ( ruleEString )
            {
            // InternalTyphonML.g:1352:4: ( ruleEString )
            // InternalTyphonML.g:1353:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameAttributeAccess().getAttributeToRenameAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameAttributeAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1371:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:1372:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:1372:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:1373:5: lv_newName_4_0= ruleEString
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


    // $ANTLR start "entryRuleRenameEntity"
    // InternalTyphonML.g:1394:1: entryRuleRenameEntity returns [EObject current=null] : iv_ruleRenameEntity= ruleRenameEntity EOF ;
    public final EObject entryRuleRenameEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEntity = null;


        try {
            // InternalTyphonML.g:1394:53: (iv_ruleRenameEntity= ruleRenameEntity EOF )
            // InternalTyphonML.g:1395:2: iv_ruleRenameEntity= ruleRenameEntity EOF
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
    // InternalTyphonML.g:1401:1: ruleRenameEntity returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newEntityName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1407:2: ( (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1408:2: (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1408:2: (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1409:3: otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameEntityAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:1417:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1418:4: ( ruleEString )
            {
            // InternalTyphonML.g:1418:4: ( ruleEString )
            // InternalTyphonML.g:1419:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameEntityAccess().getEntityToRenameEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameEntityAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1437:3: ( (lv_newEntityName_4_0= ruleEString ) )
            // InternalTyphonML.g:1438:4: (lv_newEntityName_4_0= ruleEString )
            {
            // InternalTyphonML.g:1438:4: (lv_newEntityName_4_0= ruleEString )
            // InternalTyphonML.g:1439:5: lv_newEntityName_4_0= ruleEString
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


    // $ANTLR start "entryRuleRenameRelation"
    // InternalTyphonML.g:1460:1: entryRuleRenameRelation returns [EObject current=null] : iv_ruleRenameRelation= ruleRenameRelation EOF ;
    public final EObject entryRuleRenameRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameRelation = null;


        try {
            // InternalTyphonML.g:1460:55: (iv_ruleRenameRelation= ruleRenameRelation EOF )
            // InternalTyphonML.g:1461:2: iv_ruleRenameRelation= ruleRenameRelation EOF
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
    // InternalTyphonML.g:1467:1: ruleRenameRelation returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newRelationName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1473:2: ( (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1474:2: (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1474:2: (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1475:3: otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameRelationAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:1483:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1484:4: ( ruleEString )
            {
            // InternalTyphonML.g:1484:4: ( ruleEString )
            // InternalTyphonML.g:1485:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameRelationAccess().getRelationToRenameRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameRelationAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1503:3: ( (lv_newRelationName_4_0= ruleEString ) )
            // InternalTyphonML.g:1504:4: (lv_newRelationName_4_0= ruleEString )
            {
            // InternalTyphonML.g:1504:4: (lv_newRelationName_4_0= ruleEString )
            // InternalTyphonML.g:1505:5: lv_newRelationName_4_0= ruleEString
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


    // $ANTLR start "entryRuleRemoveAttribute"
    // InternalTyphonML.g:1526:1: entryRuleRemoveAttribute returns [EObject current=null] : iv_ruleRemoveAttribute= ruleRemoveAttribute EOF ;
    public final EObject entryRuleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttribute = null;


        try {
            // InternalTyphonML.g:1526:56: (iv_ruleRemoveAttribute= ruleRemoveAttribute EOF )
            // InternalTyphonML.g:1527:2: iv_ruleRemoveAttribute= ruleRemoveAttribute EOF
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
    // InternalTyphonML.g:1533:1: ruleRemoveAttribute returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1539:2: ( (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1540:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1540:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1541:3: otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributeAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:1549:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1550:4: ( ruleEString )
            {
            // InternalTyphonML.g:1550:4: ( ruleEString )
            // InternalTyphonML.g:1551:5: ruleEString
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


    // $ANTLR start "entryRuleRemoveEntity"
    // InternalTyphonML.g:1569:1: entryRuleRemoveEntity returns [EObject current=null] : iv_ruleRemoveEntity= ruleRemoveEntity EOF ;
    public final EObject entryRuleRemoveEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEntity = null;


        try {
            // InternalTyphonML.g:1569:53: (iv_ruleRemoveEntity= ruleRemoveEntity EOF )
            // InternalTyphonML.g:1570:2: iv_ruleRemoveEntity= ruleRemoveEntity EOF
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
    // InternalTyphonML.g:1576:1: ruleRemoveEntity returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1582:2: ( (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1583:2: (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1583:2: (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1584:3: otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveEntityAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:1592:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1593:4: ( ruleEString )
            {
            // InternalTyphonML.g:1593:4: ( ruleEString )
            // InternalTyphonML.g:1594:5: ruleEString
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


    // $ANTLR start "entryRuleRemoveRelation"
    // InternalTyphonML.g:1612:1: entryRuleRemoveRelation returns [EObject current=null] : iv_ruleRemoveRelation= ruleRemoveRelation EOF ;
    public final EObject entryRuleRemoveRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveRelation = null;


        try {
            // InternalTyphonML.g:1612:55: (iv_ruleRemoveRelation= ruleRemoveRelation EOF )
            // InternalTyphonML.g:1613:2: iv_ruleRemoveRelation= ruleRemoveRelation EOF
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
    // InternalTyphonML.g:1619:1: ruleRemoveRelation returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1625:2: ( (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1626:2: (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1626:2: (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1627:3: otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveRelationAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:1635:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1636:4: ( ruleEString )
            {
            // InternalTyphonML.g:1636:4: ( ruleEString )
            // InternalTyphonML.g:1637:5: ruleEString
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
    // InternalTyphonML.g:1655:1: entryRuleChangeRelationContainement returns [EObject current=null] : iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF ;
    public final EObject entryRuleChangeRelationContainement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRelationContainement = null;


        try {
            // InternalTyphonML.g:1655:67: (iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF )
            // InternalTyphonML.g:1656:2: iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF
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
    // InternalTyphonML.g:1662:1: ruleChangeRelationContainement returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleChangeRelationContainement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newContainment_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1668:2: ( (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) ) )
            // InternalTyphonML.g:1669:2: (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) )
            {
            // InternalTyphonML.g:1669:2: (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) )
            // InternalTyphonML.g:1670:3: otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRelationContainementAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeRelationContainementAccess().getContainmentKeyword_1());
            		
            // InternalTyphonML.g:1678:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1679:4: ( ruleEString )
            {
            // InternalTyphonML.g:1679:4: ( ruleEString )
            // InternalTyphonML.g:1680:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeRelationContainementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeRelationContainementAccess().getRelationRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeRelationContainementAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1698:3: ( (lv_newContainment_4_0= ruleEBooleanObject ) )
            // InternalTyphonML.g:1699:4: (lv_newContainment_4_0= ruleEBooleanObject )
            {
            // InternalTyphonML.g:1699:4: (lv_newContainment_4_0= ruleEBooleanObject )
            // InternalTyphonML.g:1700:5: lv_newContainment_4_0= ruleEBooleanObject
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
    // InternalTyphonML.g:1721:1: entryRuleChangeRelationCardinality returns [EObject current=null] : iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF ;
    public final EObject entryRuleChangeRelationCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRelationCardinality = null;


        try {
            // InternalTyphonML.g:1721:66: (iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF )
            // InternalTyphonML.g:1722:2: iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF
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
    // InternalTyphonML.g:1728:1: ruleChangeRelationCardinality returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) ) ;
    public final EObject ruleChangeRelationCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_newCardinality_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1734:2: ( (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) ) )
            // InternalTyphonML.g:1735:2: (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) )
            {
            // InternalTyphonML.g:1735:2: (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) )
            // InternalTyphonML.g:1736:3: otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRelationCardinalityAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeRelationCardinalityAccess().getCardinalityKeyword_1());
            		
            // InternalTyphonML.g:1744:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1745:4: ( ruleEString )
            {
            // InternalTyphonML.g:1745:4: ( ruleEString )
            // InternalTyphonML.g:1746:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeRelationCardinalityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeRelationCardinalityAccess().getRelationRelationCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeRelationCardinalityAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1764:3: ( (lv_newCardinality_4_0= ruleCardinality ) )
            // InternalTyphonML.g:1765:4: (lv_newCardinality_4_0= ruleCardinality )
            {
            // InternalTyphonML.g:1765:4: (lv_newCardinality_4_0= ruleCardinality )
            // InternalTyphonML.g:1766:5: lv_newCardinality_4_0= ruleCardinality
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


    // $ANTLR start "entryRuleAttribute"
    // InternalTyphonML.g:1787:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:1787:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:1788:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTyphonML.g:1794:1: ruleAttribute returns [EObject current=null] : this_Attribute_Impl_0= ruleAttribute_Impl ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1800:2: (this_Attribute_Impl_0= ruleAttribute_Impl )
            // InternalTyphonML.g:1801:2: this_Attribute_Impl_0= ruleAttribute_Impl
            {

            		newCompositeNode(grammarAccess.getAttributeAccess().getAttribute_ImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Attribute_Impl_0=ruleAttribute_Impl();

            state._fsp--;


            		current = this_Attribute_Impl_0;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalTyphonML.g:1812:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:1812:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:1813:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalTyphonML.g:1819:1: ruleRelation returns [EObject current=null] : this_Relation_Impl_0= ruleRelation_Impl ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_Impl_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1825:2: (this_Relation_Impl_0= ruleRelation_Impl )
            // InternalTyphonML.g:1826:2: this_Relation_Impl_0= ruleRelation_Impl
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


    // $ANTLR start "entryRuleDatabase"
    // InternalTyphonML.g:1837:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:1837:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:1838:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalTyphonML.g:1844:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_DocumentDB_1 = null;

        EObject this_KeyValueDB_2 = null;

        EObject this_GraphDB_3 = null;

        EObject this_ColumnDB_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1850:2: ( (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) )
            // InternalTyphonML.g:1851:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            {
            // InternalTyphonML.g:1851:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 68:
                        {
                        alt12=3;
                        }
                        break;
                    case 66:
                        {
                        alt12=2;
                        }
                        break;
                    case 72:
                        {
                        alt12=5;
                        }
                        break;
                    case 64:
                        {
                        alt12=1;
                        }
                        break;
                    case 69:
                        {
                        alt12=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA12_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 68:
                        {
                        alt12=3;
                        }
                        break;
                    case 66:
                        {
                        alt12=2;
                        }
                        break;
                    case 72:
                        {
                        alt12=5;
                        }
                        break;
                    case 64:
                        {
                        alt12=1;
                        }
                        break;
                    case 69:
                        {
                        alt12=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                alt12=1;
                }
                break;
            case 66:
                {
                alt12=2;
                }
                break;
            case 68:
                {
                alt12=3;
                }
                break;
            case 69:
                {
                alt12=4;
                }
                break;
            case 72:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTyphonML.g:1852:3: this_RelationalDB_0= ruleRelationalDB
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
                    // InternalTyphonML.g:1861:3: this_DocumentDB_1= ruleDocumentDB
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
                    // InternalTyphonML.g:1870:3: this_KeyValueDB_2= ruleKeyValueDB
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
                    // InternalTyphonML.g:1879:3: this_GraphDB_3= ruleGraphDB
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
                    // InternalTyphonML.g:1888:3: this_ColumnDB_4= ruleColumnDB
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
    // InternalTyphonML.g:1900:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:1900:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:1901:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
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
    // InternalTyphonML.g:1907:1: ruleGraphAttribute returns [EObject current=null] : (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_GraphAttribute_Impl_0 = null;

        EObject this_AddGraphAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1913:2: ( (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) )
            // InternalTyphonML.g:1914:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            {
            // InternalTyphonML.g:1914:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_STRING) ) {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=RULE_STRING && LA13_4<=RULE_ID)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_4==80) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==RULE_ID) ) {
                    int LA13_5 = input.LA(3);

                    if ( ((LA13_5>=RULE_STRING && LA13_5<=RULE_ID)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_5==80) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 80:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTyphonML.g:1915:3: this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl
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
                    // InternalTyphonML.g:1924:3: this_AddGraphAttribute_1= ruleAddGraphAttribute
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
    // InternalTyphonML.g:1936:1: entryRuleGraphEdge returns [EObject current=null] : iv_ruleGraphEdge= ruleGraphEdge EOF ;
    public final EObject entryRuleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge = null;


        try {
            // InternalTyphonML.g:1936:50: (iv_ruleGraphEdge= ruleGraphEdge EOF )
            // InternalTyphonML.g:1937:2: iv_ruleGraphEdge= ruleGraphEdge EOF
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
    // InternalTyphonML.g:1943:1: ruleGraphEdge returns [EObject current=null] : (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) ;
    public final EObject ruleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject this_GraphEdge_Impl_0 = null;

        EObject this_AddGraphEdge_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1949:2: ( (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) )
            // InternalTyphonML.g:1950:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            {
            // InternalTyphonML.g:1950:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_STRING) ) {
                    int LA14_4 = input.LA(3);

                    if ( (LA14_4==78) ) {
                        alt14=2;
                    }
                    else if ( (LA14_4==74) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1==RULE_ID) ) {
                    int LA14_5 = input.LA(3);

                    if ( (LA14_5==74) ) {
                        alt14=1;
                    }
                    else if ( (LA14_5==78) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                alt14=1;
                }
                break;
            case 78:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTyphonML.g:1951:3: this_GraphEdge_Impl_0= ruleGraphEdge_Impl
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
                    // InternalTyphonML.g:1960:3: this_AddGraphEdge_1= ruleAddGraphEdge
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


    // $ANTLR start "entryRuleEString"
    // InternalTyphonML.g:1972:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:1972:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:1973:2: iv_ruleEString= ruleEString EOF
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
    // InternalTyphonML.g:1979:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1985:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:1986:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:1986:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTyphonML.g:1987:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1995:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRulePrimitiveDataType_Impl"
    // InternalTyphonML.g:2006:1: entryRulePrimitiveDataType_Impl returns [EObject current=null] : iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF ;
    public final EObject entryRulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType_Impl = null;


        try {
            // InternalTyphonML.g:2006:63: (iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF )
            // InternalTyphonML.g:2007:2: iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveDataType_Impl=rulePrimitiveDataType_Impl();

            state._fsp--;

             current =iv_rulePrimitiveDataType_Impl; 
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
    // $ANTLR end "entryRulePrimitiveDataType_Impl"


    // $ANTLR start "rulePrimitiveDataType_Impl"
    // InternalTyphonML.g:2013:1: rulePrimitiveDataType_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject rulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2019:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:2020:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:2020:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            // InternalTyphonML.g:2021:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalTyphonML.g:2021:3: ()
            // InternalTyphonML.g:2022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataType_ImplAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2028:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTyphonML.g:2029:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2033:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2034:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2034:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2035:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveDataType_ImplRule());
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

            otherlv_3=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimitiveDataType_ImplAccess().getDatatypeKeyword_2());
            		
            // InternalTyphonML.g:2057:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2058:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2058:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2059:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveDataType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
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
    // $ANTLR end "rulePrimitiveDataType_Impl"


    // $ANTLR start "entryRuleDataTypeItem"
    // InternalTyphonML.g:2080:1: entryRuleDataTypeItem returns [EObject current=null] : iv_ruleDataTypeItem= ruleDataTypeItem EOF ;
    public final EObject entryRuleDataTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeItem = null;


        try {
            // InternalTyphonML.g:2080:53: (iv_ruleDataTypeItem= ruleDataTypeItem EOF )
            // InternalTyphonML.g:2081:2: iv_ruleDataTypeItem= ruleDataTypeItem EOF
            {
             newCompositeNode(grammarAccess.getDataTypeItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeItem=ruleDataTypeItem();

            state._fsp--;

             current =iv_ruleDataTypeItem; 
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
    // $ANTLR end "entryRuleDataTypeItem"


    // $ANTLR start "ruleDataTypeItem"
    // InternalTyphonML.g:2087:1: ruleDataTypeItem returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) ;
    public final EObject ruleDataTypeItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_implementation_6_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2093:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) )
            // InternalTyphonML.g:2094:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            {
            // InternalTyphonML.g:2094:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            // InternalTyphonML.g:2095:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']'
            {
            // InternalTyphonML.g:2095:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTyphonML.g:2096:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataTypeItemAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2100:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2101:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2101:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2102:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataTypeItemAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeItemRule());
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

            // InternalTyphonML.g:2120:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2121:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2121:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2122:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeItemAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:2143:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2144:4: ( ruleEString )
            {
            // InternalTyphonML.g:2144:4: ( ruleEString )
            // InternalTyphonML.g:2145:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeItemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDataTypeItemAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalTyphonML.g:2163:3: ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) )
            // InternalTyphonML.g:2164:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            {
            // InternalTyphonML.g:2164:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            // InternalTyphonML.g:2165:5: lv_implementation_6_0= ruleDataTypeImplementationPackage
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getImplementationDataTypeImplementationPackageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_36);
            lv_implementation_6_0=ruleDataTypeImplementationPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeItemRule());
            					}
            					set(
            						current,
            						"implementation",
            						lv_implementation_6_0,
            						"it.univaq.disim.typhon.TyphonML.DataTypeImplementationPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataTypeItemAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDataTypeItem"


    // $ANTLR start "entryRuleDataTypeImplementationPackage"
    // InternalTyphonML.g:2190:1: entryRuleDataTypeImplementationPackage returns [EObject current=null] : iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF ;
    public final EObject entryRuleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeImplementationPackage = null;


        try {
            // InternalTyphonML.g:2190:70: (iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF )
            // InternalTyphonML.g:2191:2: iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF
            {
             newCompositeNode(grammarAccess.getDataTypeImplementationPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeImplementationPackage=ruleDataTypeImplementationPackage();

            state._fsp--;

             current =iv_ruleDataTypeImplementationPackage; 
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
    // $ANTLR end "entryRuleDataTypeImplementationPackage"


    // $ANTLR start "ruleDataTypeImplementationPackage"
    // InternalTyphonML.g:2197:1: ruleDataTypeImplementationPackage returns [EObject current=null] : ( () ( (lv_location_1_0= ruleEString ) ) ) ;
    public final EObject ruleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_location_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2203:2: ( ( () ( (lv_location_1_0= ruleEString ) ) ) )
            // InternalTyphonML.g:2204:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:2204:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            // InternalTyphonML.g:2205:3: () ( (lv_location_1_0= ruleEString ) )
            {
            // InternalTyphonML.g:2205:3: ()
            // InternalTyphonML.g:2206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeImplementationPackageAccess().getDataTypeImplementationPackageAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2212:3: ( (lv_location_1_0= ruleEString ) )
            // InternalTyphonML.g:2213:4: (lv_location_1_0= ruleEString )
            {
            // InternalTyphonML.g:2213:4: (lv_location_1_0= ruleEString )
            // InternalTyphonML.g:2214:5: lv_location_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeImplementationPackageAccess().getLocationEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeImplementationPackageRule());
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
    // $ANTLR end "ruleDataTypeImplementationPackage"


    // $ANTLR start "entryRuleFreeText"
    // InternalTyphonML.g:2235:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalTyphonML.g:2235:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalTyphonML.g:2236:2: iv_ruleFreeText= ruleFreeText EOF
            {
             newCompositeNode(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreeText=ruleFreeText();

            state._fsp--;

             current =iv_ruleFreeText; 
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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // InternalTyphonML.g:2242:1: ruleFreeText returns [EObject current=null] : ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_tasks_4_0 = null;

        EObject lv_tasks_6_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2248:2: ( ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? ) )
            // InternalTyphonML.g:2249:2: ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? )
            {
            // InternalTyphonML.g:2249:2: ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? )
            // InternalTyphonML.g:2250:3: () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )?
            {
            // InternalTyphonML.g:2250:3: ()
            // InternalTyphonML.g:2251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeTextAccess().getFreeTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFreeTextAccess().getFreetextKeyword_1());
            		
            // InternalTyphonML.g:2261:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2262:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2262:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2263:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFreeTextAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFreeTextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getFreeTextAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalTyphonML.g:2284:3: ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=86 && LA19_0<=103)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTyphonML.g:2285:4: ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']'
                    {
                    // InternalTyphonML.g:2285:4: ( (lv_tasks_4_0= ruleNlpTask ) )
                    // InternalTyphonML.g:2286:5: (lv_tasks_4_0= ruleNlpTask )
                    {
                    // InternalTyphonML.g:2286:5: (lv_tasks_4_0= ruleNlpTask )
                    // InternalTyphonML.g:2287:6: lv_tasks_4_0= ruleNlpTask
                    {

                    						newCompositeNode(grammarAccess.getFreeTextAccess().getTasksNlpTaskParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tasks_4_0=ruleNlpTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFreeTextRule());
                    						}
                    						add(
                    							current,
                    							"tasks",
                    							lv_tasks_4_0,
                    							"it.univaq.disim.typhon.TyphonML.NlpTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2304:4: (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTyphonML.g:2305:5: otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_38); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFreeTextAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalTyphonML.g:2309:5: ( (lv_tasks_6_0= ruleNlpTask ) )
                    	    // InternalTyphonML.g:2310:6: (lv_tasks_6_0= ruleNlpTask )
                    	    {
                    	    // InternalTyphonML.g:2310:6: (lv_tasks_6_0= ruleNlpTask )
                    	    // InternalTyphonML.g:2311:7: lv_tasks_6_0= ruleNlpTask
                    	    {

                    	    							newCompositeNode(grammarAccess.getFreeTextAccess().getTasksNlpTaskParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_tasks_6_0=ruleNlpTask();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFreeTextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tasks",
                    	    								lv_tasks_6_0,
                    	    								"it.univaq.disim.typhon.TyphonML.NlpTask");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFreeTextAccess().getRightSquareBracketKeyword_4_2());
                    			

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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleNlpTask"
    // InternalTyphonML.g:2338:1: entryRuleNlpTask returns [EObject current=null] : iv_ruleNlpTask= ruleNlpTask EOF ;
    public final EObject entryRuleNlpTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNlpTask = null;


        try {
            // InternalTyphonML.g:2338:48: (iv_ruleNlpTask= ruleNlpTask EOF )
            // InternalTyphonML.g:2339:2: iv_ruleNlpTask= ruleNlpTask EOF
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
    // InternalTyphonML.g:2345:1: ruleNlpTask returns [EObject current=null] : ( (lv_type_0_0= ruleNlpTaskType ) ) ;
    public final EObject ruleNlpTask() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2351:2: ( ( (lv_type_0_0= ruleNlpTaskType ) ) )
            // InternalTyphonML.g:2352:2: ( (lv_type_0_0= ruleNlpTaskType ) )
            {
            // InternalTyphonML.g:2352:2: ( (lv_type_0_0= ruleNlpTaskType ) )
            // InternalTyphonML.g:2353:3: (lv_type_0_0= ruleNlpTaskType )
            {
            // InternalTyphonML.g:2353:3: (lv_type_0_0= ruleNlpTaskType )
            // InternalTyphonML.g:2354:4: lv_type_0_0= ruleNlpTaskType
            {

            				newCompositeNode(grammarAccess.getNlpTaskAccess().getTypeNlpTaskTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleNlpTaskType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNlpTaskRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"it.univaq.disim.typhon.TyphonML.NlpTaskType");
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
    // $ANTLR end "ruleNlpTask"


    // $ANTLR start "entryRuleCustomDataType"
    // InternalTyphonML.g:2374:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:2374:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:2375:2: iv_ruleCustomDataType= ruleCustomDataType EOF
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
    // InternalTyphonML.g:2381:1: ruleCustomDataType returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleCustomDataType() throws RecognitionException {
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
            // InternalTyphonML.g:2387:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2388:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2388:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2389:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2389:3: ()
            // InternalTyphonML.g:2390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2396:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTyphonML.g:2397:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2401:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2402:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2402:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2403:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
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

            otherlv_3=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getCustomdatatypeKeyword_2());
            		
            // InternalTyphonML.g:2425:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2426:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2426:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2427:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDataTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2448:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:2449:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomDataTypeAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2457:4: ( (lv_elements_8_0= ruleDataTypeItem ) )
                    // InternalTyphonML.g:2458:5: (lv_elements_8_0= ruleDataTypeItem )
                    {
                    // InternalTyphonML.g:2458:5: (lv_elements_8_0= ruleDataTypeItem )
                    // InternalTyphonML.g:2459:6: lv_elements_8_0= ruleDataTypeItem
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_elements_8_0=ruleDataTypeItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_8_0,
                    							"it.univaq.disim.typhon.TyphonML.DataTypeItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2476:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalTyphonML.g:2477:5: otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_41); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCustomDataTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2481:5: ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    // InternalTyphonML.g:2482:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    {
                    	    // InternalTyphonML.g:2482:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    // InternalTyphonML.g:2483:7: lv_elements_10_0= ruleDataTypeItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_elements_10_0=ruleDataTypeItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_10_0,
                    	    								"it.univaq.disim.typhon.TyphonML.DataTypeItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEntity_Impl"
    // InternalTyphonML.g:2514:1: entryRuleEntity_Impl returns [EObject current=null] : iv_ruleEntity_Impl= ruleEntity_Impl EOF ;
    public final EObject entryRuleEntity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Impl = null;


        try {
            // InternalTyphonML.g:2514:52: (iv_ruleEntity_Impl= ruleEntity_Impl EOF )
            // InternalTyphonML.g:2515:2: iv_ruleEntity_Impl= ruleEntity_Impl EOF
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
    // InternalTyphonML.g:2521:1: ruleEntity_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleEntity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_fretextAttributes_7_0 = null;

        EObject lv_fretextAttributes_8_0 = null;

        EObject lv_relations_9_0 = null;

        EObject lv_relations_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2527:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2528:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2528:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' )
            // InternalTyphonML.g:2529:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2529:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:2530:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntity_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2534:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2535:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2535:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2536:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_importedNamespace_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
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

            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEntity_ImplAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:2558:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:2559:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:2559:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:2560:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:2581:3: ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_STRING) ) {
                        int LA25_5 = input.LA(3);

                        if ( (LA25_5==RULE_STRING) ) {
                            int LA25_2 = input.LA(4);

                            if ( (LA25_2==46) ) {
                                int LA25_7 = input.LA(5);

                                if ( ((LA25_7>=RULE_STRING && LA25_7<=RULE_ID)) ) {
                                    alt25=1;
                                }
                            }
                        }
                        else if ( (LA25_5==RULE_ID) ) {
                            int LA25_3 = input.LA(4);

                            if ( (LA25_3==46) ) {
                                int LA25_7 = input.LA(5);

                                if ( ((LA25_7>=RULE_STRING && LA25_7<=RULE_ID)) ) {
                                    alt25=1;
                                }
                            }
                        }
                    }
                    else if ( (LA25_1==RULE_ID) ) {
                        int LA25_6 = input.LA(3);

                        if ( (LA25_6==RULE_STRING) ) {
                            int LA25_2 = input.LA(4);

                            if ( (LA25_2==46) ) {
                                int LA25_7 = input.LA(5);

                                if ( ((LA25_7>=RULE_STRING && LA25_7<=RULE_ID)) ) {
                                    alt25=1;
                                }
                            }
                        }
                        else if ( (LA25_6==RULE_ID) ) {
                            int LA25_3 = input.LA(4);

                            if ( (LA25_3==46) ) {
                                int LA25_7 = input.LA(5);

                                if ( ((LA25_7>=RULE_STRING && LA25_7<=RULE_ID)) ) {
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

                    if ( (LA25_2==46) ) {
                        int LA25_7 = input.LA(3);

                        if ( ((LA25_7>=RULE_STRING && LA25_7<=RULE_ID)) ) {
                            alt25=1;
                        }
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (LA25_3==46) ) {
                        int LA25_7 = input.LA(3);

                        if ( ((LA25_7>=RULE_STRING && LA25_7<=RULE_ID)) ) {
                            alt25=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // InternalTyphonML.g:2582:4: ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )*
                    {
                    // InternalTyphonML.g:2582:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalTyphonML.g:2583:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:2583:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalTyphonML.g:2584:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"it.univaq.disim.typhon.TyphonML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2601:4: ( (lv_attributes_6_0= ruleAttribute ) )*
                    loop24:
                    do {
                        int alt24=2;
                        switch ( input.LA(1) ) {
                        case 44:
                            {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==RULE_STRING) ) {
                                int LA24_5 = input.LA(3);

                                if ( (LA24_5==RULE_STRING) ) {
                                    int LA24_3 = input.LA(4);

                                    if ( (LA24_3==46) ) {
                                        int LA24_7 = input.LA(5);

                                        if ( ((LA24_7>=RULE_STRING && LA24_7<=RULE_ID)) ) {
                                            alt24=1;
                                        }


                                    }


                                }
                                else if ( (LA24_5==RULE_ID) ) {
                                    int LA24_4 = input.LA(4);

                                    if ( (LA24_4==46) ) {
                                        int LA24_7 = input.LA(5);

                                        if ( ((LA24_7>=RULE_STRING && LA24_7<=RULE_ID)) ) {
                                            alt24=1;
                                        }


                                    }


                                }


                            }
                            else if ( (LA24_2==RULE_ID) ) {
                                int LA24_6 = input.LA(3);

                                if ( (LA24_6==RULE_STRING) ) {
                                    int LA24_3 = input.LA(4);

                                    if ( (LA24_3==46) ) {
                                        int LA24_7 = input.LA(5);

                                        if ( ((LA24_7>=RULE_STRING && LA24_7<=RULE_ID)) ) {
                                            alt24=1;
                                        }


                                    }


                                }
                                else if ( (LA24_6==RULE_ID) ) {
                                    int LA24_4 = input.LA(4);

                                    if ( (LA24_4==46) ) {
                                        int LA24_7 = input.LA(5);

                                        if ( ((LA24_7>=RULE_STRING && LA24_7<=RULE_ID)) ) {
                                            alt24=1;
                                        }


                                    }


                                }


                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA24_3 = input.LA(2);

                            if ( (LA24_3==46) ) {
                                int LA24_7 = input.LA(3);

                                if ( ((LA24_7>=RULE_STRING && LA24_7<=RULE_ID)) ) {
                                    alt24=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA24_4 = input.LA(2);

                            if ( (LA24_4==46) ) {
                                int LA24_7 = input.LA(3);

                                if ( ((LA24_7>=RULE_STRING && LA24_7<=RULE_ID)) ) {
                                    alt24=1;
                                }


                            }


                            }
                            break;

                        }

                        switch (alt24) {
                    	case 1 :
                    	    // InternalTyphonML.g:2602:5: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:2602:5: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalTyphonML.g:2603:6: lv_attributes_6_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
                    	    lv_attributes_6_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_6_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Attribute");
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

            // InternalTyphonML.g:2621:3: ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTyphonML.g:2622:4: ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )*
                    {
                    // InternalTyphonML.g:2622:4: ( (lv_fretextAttributes_7_0= ruleFreeText ) )
                    // InternalTyphonML.g:2623:5: (lv_fretextAttributes_7_0= ruleFreeText )
                    {
                    // InternalTyphonML.g:2623:5: (lv_fretextAttributes_7_0= ruleFreeText )
                    // InternalTyphonML.g:2624:6: lv_fretextAttributes_7_0= ruleFreeText
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getFretextAttributesFreeTextParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_fretextAttributes_7_0=ruleFreeText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"fretextAttributes",
                    							lv_fretextAttributes_7_0,
                    							"it.univaq.disim.typhon.TyphonML.FreeText");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2641:4: ( (lv_fretextAttributes_8_0= ruleFreeText ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==47) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTyphonML.g:2642:5: (lv_fretextAttributes_8_0= ruleFreeText )
                    	    {
                    	    // InternalTyphonML.g:2642:5: (lv_fretextAttributes_8_0= ruleFreeText )
                    	    // InternalTyphonML.g:2643:6: lv_fretextAttributes_8_0= ruleFreeText
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getFretextAttributesFreeTextParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
                    	    lv_fretextAttributes_8_0=ruleFreeText();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fretextAttributes",
                    	    							lv_fretextAttributes_8_0,
                    	    							"it.univaq.disim.typhon.TyphonML.FreeText");
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

            // InternalTyphonML.g:2661:3: ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTyphonML.g:2662:4: ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )*
                    {
                    // InternalTyphonML.g:2662:4: ( (lv_relations_9_0= ruleRelation ) )
                    // InternalTyphonML.g:2663:5: (lv_relations_9_0= ruleRelation )
                    {
                    // InternalTyphonML.g:2663:5: (lv_relations_9_0= ruleRelation )
                    // InternalTyphonML.g:2664:6: lv_relations_9_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_relations_9_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relations",
                    							lv_relations_9_0,
                    							"it.univaq.disim.typhon.TyphonML.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2681:4: ( (lv_relations_10_0= ruleRelation ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==44) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalTyphonML.g:2682:5: (lv_relations_10_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:2682:5: (lv_relations_10_0= ruleRelation )
                    	    // InternalTyphonML.g:2683:6: lv_relations_10_0= ruleRelation
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
                    	    lv_relations_10_0=ruleRelation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relations",
                    	    							lv_relations_10_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Relation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleRelation_Impl"
    // InternalTyphonML.g:2709:1: entryRuleRelation_Impl returns [EObject current=null] : iv_ruleRelation_Impl= ruleRelation_Impl EOF ;
    public final EObject entryRuleRelation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation_Impl = null;


        try {
            // InternalTyphonML.g:2709:54: (iv_ruleRelation_Impl= ruleRelation_Impl EOF )
            // InternalTyphonML.g:2710:2: iv_ruleRelation_Impl= ruleRelation_Impl EOF
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
    // InternalTyphonML.g:2716:1: ruleRelation_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) ;
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
            // InternalTyphonML.g:2722:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) )
            // InternalTyphonML.g:2723:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            {
            // InternalTyphonML.g:2723:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            // InternalTyphonML.g:2724:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            {
            // InternalTyphonML.g:2724:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTyphonML.g:2725:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelation_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2729:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2730:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2730:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2731:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            // InternalTyphonML.g:2749:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2750:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2750:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2751:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalTyphonML.g:2768:3: ( (lv_isContainment_3_0= ':' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTyphonML.g:2769:4: (lv_isContainment_3_0= ':' )
                    {
                    // InternalTyphonML.g:2769:4: (lv_isContainment_3_0= ':' )
                    // InternalTyphonML.g:2770:5: lv_isContainment_3_0= ':'
                    {
                    lv_isContainment_3_0=(Token)match(input,46,FOLLOW_45); 

                    					newLeafNode(lv_isContainment_3_0, grammarAccess.getRelation_ImplAccess().getIsContainmentColonKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelation_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRelation_ImplAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTyphonML.g:2786:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2787:4: ( ruleEString )
            {
            // InternalTyphonML.g:2787:4: ( ruleEString )
            // InternalTyphonML.g:2788:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getTypeEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2802:3: (otherlv_6= '.' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTyphonML.g:2803:4: otherlv_6= '.' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelation_ImplAccess().getFullStopKeyword_5_0());
                    			
                    // InternalTyphonML.g:2807:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2808:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2808:5: ( ruleEString )
                    // InternalTyphonML.g:2809:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getOppositeRelationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2824:3: (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTyphonML.g:2825:4: otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelation_ImplAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalTyphonML.g:2829:4: ( (lv_cardinality_9_0= ruleCardinality ) )
                    // InternalTyphonML.g:2830:5: (lv_cardinality_9_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:2830:5: (lv_cardinality_9_0= ruleCardinality )
                    // InternalTyphonML.g:2831:6: lv_cardinality_9_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getCardinalityCardinalityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_36);
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


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalTyphonML.g:2857:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalTyphonML.g:2857:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalTyphonML.g:2858:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalTyphonML.g:2864:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTyphonML.g:2870:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTyphonML.g:2871:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTyphonML.g:2871:2: (kw= 'true' | kw= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            else if ( (LA34_0==53) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalTyphonML.g:2872:3: kw= 'true'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:2878:3: kw= 'false'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTable"
    // InternalTyphonML.g:2887:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:2887:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:2888:2: iv_ruleTable= ruleTable EOF
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
    // InternalTyphonML.g:2894:1: ruleTable returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2900:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2901:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2901:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            // InternalTyphonML.g:2902:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )? (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2902:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTyphonML.g:2903:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getTableAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2907:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2908:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2908:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2909:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2935:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2936:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2936:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2937:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_5=(Token)match(input,46,FOLLOW_48); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:2958:3: ( ( ruleEString ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTyphonML.g:2959:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:2959:4: ( ruleEString )
                    // InternalTyphonML.g:2960:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0());
                    				
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2974:3: (otherlv_7= 'db' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTyphonML.g:2975:4: otherlv_7= 'db' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDbKeyword_6_0());
                    			
                    // InternalTyphonML.g:2979:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2980:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2980:5: ( ruleEString )
                    // InternalTyphonML.g:2981:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableAccess().getDbDatabaseCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2996:3: ( (lv_indexSpec_9_0= ruleIndexSpec ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44||LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTyphonML.g:2997:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:2997:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    // InternalTyphonML.g:2998:5: lv_indexSpec_9_0= ruleIndexSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_51);
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

            // InternalTyphonML.g:3015:3: ( (lv_idSpec_10_0= ruleIdSpec ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==63) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTyphonML.g:3016:4: (lv_idSpec_10_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:3016:4: (lv_idSpec_10_0= ruleIdSpec )
                    // InternalTyphonML.g:3017:5: lv_idSpec_10_0= ruleIdSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:3042:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalTyphonML.g:3042:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalTyphonML.g:3043:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalTyphonML.g:3049:1: ruleCollection returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3055:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:3056:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:3056:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:3057:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:3057:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTyphonML.g:3058:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3062:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3063:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3063:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3064:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            // InternalTyphonML.g:3082:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3083:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3083:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3084:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_3=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:3105:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3106:4: ( ruleEString )
            {
            // InternalTyphonML.g:3106:4: ( ruleEString )
            // InternalTyphonML.g:3107:5: ruleEString
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
    // InternalTyphonML.g:3125:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:3125:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:3126:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
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
    // InternalTyphonML.g:3132:1: ruleKeyValueElement returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3138:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' ) )
            // InternalTyphonML.g:3139:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalTyphonML.g:3139:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' )
            // InternalTyphonML.g:3140:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}'
            {
            // InternalTyphonML.g:3140:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTyphonML.g:3141:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getKeyValueElementAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3145:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3146:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3146:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3147:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            // InternalTyphonML.g:3165:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3166:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3166:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3167:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:3188:3: ( (lv_key_4_0= ruleEString ) )
            // InternalTyphonML.g:3189:4: (lv_key_4_0= ruleEString )
            {
            // InternalTyphonML.g:3189:4: (lv_key_4_0= ruleEString )
            // InternalTyphonML.g:3190:5: lv_key_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_5=(Token)match(input,50,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            otherlv_6=(Token)match(input,55,FOLLOW_53); 

            			newLeafNode(otherlv_6, grammarAccess.getKeyValueElementAccess().getLeftParenthesisKeyword_5());
            		
            // InternalTyphonML.g:3215:3: ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTyphonML.g:3216:4: ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalTyphonML.g:3216:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3217:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3217:5: ( ruleEString )
                    // InternalTyphonML.g:3218:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyValueElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesAttributeCrossReference_6_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3232:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==13) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalTyphonML.g:3233:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getKeyValueElementAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalTyphonML.g:3237:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3238:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3238:6: ( ruleEString )
                    	    // InternalTyphonML.g:3239:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeyValueElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesAttributeCrossReference_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,56,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getKeyValueElementAccess().getRightParenthesisKeyword_7());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:3267:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // InternalTyphonML.g:3267:50: (iv_ruleGraphNode= ruleGraphNode EOF )
            // InternalTyphonML.g:3268:2: iv_ruleGraphNode= ruleGraphNode EOF
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
    // InternalTyphonML.g:3274:1: ruleGraphNode returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3280:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3281:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3281:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3282:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3282:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTyphonML.g:3283:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getGraphNodeAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3287:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3288:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3288:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3289:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            otherlv_2=(Token)match(input,57,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphNodeAccess().getNodeKeyword_1());
            		
            // InternalTyphonML.g:3311:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3312:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3312:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3313:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_4=(Token)match(input,58,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphNodeAccess().getExclamationMarkKeyword_3());
            		
            // InternalTyphonML.g:3334:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3335:4: ( ruleEString )
            {
            // InternalTyphonML.g:3335:4: ( ruleEString )
            // InternalTyphonML.g:3336:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getEntityEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_57);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:3350:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTyphonML.g:3351:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_58); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalTyphonML.g:3355:4: ( (lv_attributes_7_0= ruleGraphAttribute ) )
                    // InternalTyphonML.g:3356:5: (lv_attributes_7_0= ruleGraphAttribute )
                    {
                    // InternalTyphonML.g:3356:5: (lv_attributes_7_0= ruleGraphAttribute )
                    // InternalTyphonML.g:3357:6: lv_attributes_7_0= ruleGraphAttribute
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:3374:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==13) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalTyphonML.g:3375:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_58); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getGraphNodeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalTyphonML.g:3379:5: ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    	    // InternalTyphonML.g:3380:6: (lv_attributes_9_0= ruleGraphAttribute )
                    	    {
                    	    // InternalTyphonML.g:3380:6: (lv_attributes_9_0= ruleGraphAttribute )
                    	    // InternalTyphonML.g:3381:7: lv_attributes_9_0= ruleGraphAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:3412:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTyphonML.g:3412:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTyphonML.g:3413:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalTyphonML.g:3419:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
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
            // InternalTyphonML.g:3425:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:3426:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:3426:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:3427:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:3427:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTyphonML.g:3428:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3432:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3433:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3433:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3434:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_59);
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

            otherlv_2=(Token)match(input,59,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalTyphonML.g:3456:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3457:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3457:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3458:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:3483:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3484:4: ( ruleEString )
            {
            // InternalTyphonML.g:3484:4: ( ruleEString )
            // InternalTyphonML.g:3485:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColumnAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_60);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:3499:3: (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTyphonML.g:3500:4: otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_52); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,55,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:3508:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3509:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3509:5: ( ruleEString )
                    // InternalTyphonML.g:3510:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3524:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==13) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalTyphonML.g:3525:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3529:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3530:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3530:6: ( ruleEString )
                    	    // InternalTyphonML.g:3531:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,56,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getColumnAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:3559:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:3559:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:3560:2: iv_ruleIndexSpec= ruleIndexSpec EOF
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
    // InternalTyphonML.g:3566:1: ruleIndexSpec returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:3572:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:3573:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:3573:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTyphonML.g:3574:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:3574:3: ()
            // InternalTyphonML.g:3575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3581:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTyphonML.g:3582:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3586:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3587:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3587:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3588:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            otherlv_3=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getIndexKeyword_2());
            		
            // InternalTyphonML.g:3610:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3611:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3611:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3612:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexSpecAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_62); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3633:3: (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTyphonML.g:3634:4: otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_52); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexSpecAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,55,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTyphonML.g:3642:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3643:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3643:5: ( ruleEString )
                    // InternalTyphonML.g:3644:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3658:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==13) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalTyphonML.g:3659:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getIndexSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3663:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3664:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3664:6: ( ruleEString )
                    	    // InternalTyphonML.g:3665:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,56,FOLLOW_63); 

                    				newLeafNode(otherlv_11, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3685:3: (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTyphonML.g:3686:4: otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_52); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexSpecAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,55,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:3694:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3695:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3695:5: ( ruleEString )
                    // InternalTyphonML.g:3696:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3710:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==13) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalTyphonML.g:3711:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getIndexSpecAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3715:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3716:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3716:6: ( ruleEString )
                    	    // InternalTyphonML.g:3717:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,56,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:3745:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:3745:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:3746:2: iv_ruleIdSpec= ruleIdSpec EOF
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
    // InternalTyphonML.g:3752:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:3758:2: ( ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalTyphonML.g:3759:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalTyphonML.g:3759:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalTyphonML.g:3760:3: () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalTyphonML.g:3760:3: ()
            // InternalTyphonML.g:3761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdSpecKeyword_1());
            		
            // InternalTyphonML.g:3771:3: (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTyphonML.g:3772:4: otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTyphonML.g:3776:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3777:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3777:5: ( ruleEString )
                    // InternalTyphonML.g:3778:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3792:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==13) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalTyphonML.g:3793:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTyphonML.g:3797:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3798:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3798:6: ( ruleEString )
                    	    // InternalTyphonML.g:3799:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIdSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
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

                    otherlv_6=(Token)match(input,56,FOLLOW_2); 

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
    // InternalTyphonML.g:3823:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:3823:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:3824:2: iv_ruleRelationalDB= ruleRelationalDB EOF
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
    // InternalTyphonML.g:3830:1: ruleRelationalDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3836:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3837:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3837:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3838:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3838:3: ()
            // InternalTyphonML.g:3839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3845:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTyphonML.g:3846:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3850:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3851:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3851:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3852:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            otherlv_3=(Token)match(input,64,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_2());
            		
            // InternalTyphonML.g:3874:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3875:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3875:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3876:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationalDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_66); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3897:3: (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==65) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTyphonML.g:3898:4: otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationalDBAccess().getTablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_67); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3906:4: ( (lv_tables_8_0= ruleTable ) )
                    // InternalTyphonML.g:3907:5: (lv_tables_8_0= ruleTable )
                    {
                    // InternalTyphonML.g:3907:5: (lv_tables_8_0= ruleTable )
                    // InternalTyphonML.g:3908:6: lv_tables_8_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_68);
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

                    // InternalTyphonML.g:3925:4: ( (lv_tables_9_0= ruleTable ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==23||LA58_0==44) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalTyphonML.g:3926:5: (lv_tables_9_0= ruleTable )
                    	    {
                    	    // InternalTyphonML.g:3926:5: (lv_tables_9_0= ruleTable )
                    	    // InternalTyphonML.g:3927:6: lv_tables_9_0= ruleTable
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_68);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:3957:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:3957:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:3958:2: iv_ruleDocumentDB= ruleDocumentDB EOF
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
    // InternalTyphonML.g:3964:1: ruleDocumentDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3970:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3971:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3971:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3972:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3972:3: ()
            // InternalTyphonML.g:3973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3979:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTyphonML.g:3980:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3984:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3985:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3985:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3986:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            otherlv_3=(Token)match(input,66,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_2());
            		
            // InternalTyphonML.g:4008:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4009:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4009:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4010:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_70); 

            			newLeafNode(otherlv_5, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4031:3: (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==67) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTyphonML.g:4032:4: otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentDBAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4040:4: ( (lv_collections_8_0= ruleCollection ) )
                    // InternalTyphonML.g:4041:5: (lv_collections_8_0= ruleCollection )
                    {
                    // InternalTyphonML.g:4041:5: (lv_collections_8_0= ruleCollection )
                    // InternalTyphonML.g:4042:6: lv_collections_8_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalTyphonML.g:4059:4: ( (lv_collections_9_0= ruleCollection ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_ID)||LA61_0==44) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalTyphonML.g:4060:5: (lv_collections_9_0= ruleCollection )
                    	    {
                    	    // InternalTyphonML.g:4060:5: (lv_collections_9_0= ruleCollection )
                    	    // InternalTyphonML.g:4061:6: lv_collections_9_0= ruleCollection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:4091:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:4091:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:4092:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
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
    // InternalTyphonML.g:4098:1: ruleKeyValueDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:4104:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:4105:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:4105:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:4106:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:4106:3: ()
            // InternalTyphonML.g:4107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4113:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==44) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTyphonML.g:4114:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4118:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4119:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4119:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4120:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_71);
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

            otherlv_3=(Token)match(input,68,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_2());
            		
            // InternalTyphonML.g:4142:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4143:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4143:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4144:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4165:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==49) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTyphonML.g:4166:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeyValueDBAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4174:4: ( (lv_elements_8_0= ruleKeyValueElement ) )
                    // InternalTyphonML.g:4175:5: (lv_elements_8_0= ruleKeyValueElement )
                    {
                    // InternalTyphonML.g:4175:5: (lv_elements_8_0= ruleKeyValueElement )
                    // InternalTyphonML.g:4176:6: lv_elements_8_0= ruleKeyValueElement
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:4193:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==13) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalTyphonML.g:4194:5: otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_41); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getKeyValueDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4198:5: ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    // InternalTyphonML.g:4199:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    {
                    	    // InternalTyphonML.g:4199:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    // InternalTyphonML.g:4200:7: lv_elements_10_0= ruleKeyValueElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:4231:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:4231:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:4232:2: iv_ruleGraphDB= ruleGraphDB EOF
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
    // InternalTyphonML.g:4238:1: ruleGraphDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:4244:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:4245:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:4245:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:4246:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:4246:3: ()
            // InternalTyphonML.g:4247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4253:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==44) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTyphonML.g:4254:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4258:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4259:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4259:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4260:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_72);
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

            otherlv_3=(Token)match(input,69,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getGraphdbKeyword_2());
            		
            // InternalTyphonML.g:4282:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4283:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4283:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4284:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_73); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4305:3: (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==70) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTyphonML.g:4306:4: otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,70,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getNodesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_74); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4314:4: ( (lv_nodes_8_0= ruleGraphNode ) )
                    // InternalTyphonML.g:4315:5: (lv_nodes_8_0= ruleGraphNode )
                    {
                    // InternalTyphonML.g:4315:5: (lv_nodes_8_0= ruleGraphNode )
                    // InternalTyphonML.g:4316:6: lv_nodes_8_0= ruleGraphNode
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:4333:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==13) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalTyphonML.g:4334:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_74); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGraphDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4338:5: ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    // InternalTyphonML.g:4339:6: (lv_nodes_10_0= ruleGraphNode )
                    	    {
                    	    // InternalTyphonML.g:4339:6: (lv_nodes_10_0= ruleGraphNode )
                    	    // InternalTyphonML.g:4340:7: lv_nodes_10_0= ruleGraphNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_75); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:4363:3: (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==71) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTyphonML.g:4364:4: otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,71,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphDBAccess().getEdgesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_76); 

                    				newLeafNode(otherlv_13, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:4372:4: ( (lv_edges_14_0= ruleGraphEdge ) )
                    // InternalTyphonML.g:4373:5: (lv_edges_14_0= ruleGraphEdge )
                    {
                    // InternalTyphonML.g:4373:5: (lv_edges_14_0= ruleGraphEdge )
                    // InternalTyphonML.g:4374:6: lv_edges_14_0= ruleGraphEdge
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:4391:4: (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==13) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalTyphonML.g:4392:5: otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_76); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGraphDBAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:4396:5: ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    // InternalTyphonML.g:4397:6: (lv_edges_16_0= ruleGraphEdge )
                    	    {
                    	    // InternalTyphonML.g:4397:6: (lv_edges_16_0= ruleGraphEdge )
                    	    // InternalTyphonML.g:4398:7: lv_edges_16_0= ruleGraphEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:4429:1: entryRuleColumnDB returns [EObject current=null] : iv_ruleColumnDB= ruleColumnDB EOF ;
    public final EObject entryRuleColumnDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDB = null;


        try {
            // InternalTyphonML.g:4429:49: (iv_ruleColumnDB= ruleColumnDB EOF )
            // InternalTyphonML.g:4430:2: iv_ruleColumnDB= ruleColumnDB EOF
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
    // InternalTyphonML.g:4436:1: ruleColumnDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:4442:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:4443:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:4443:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:4444:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:4444:3: ()
            // InternalTyphonML.g:4445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDBAccess().getColumnDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4451:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTyphonML.g:4452:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4456:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4457:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4457:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4458:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_77);
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

            otherlv_3=(Token)match(input,72,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDBAccess().getColumndbKeyword_2());
            		
            // InternalTyphonML.g:4480:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4481:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4481:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4482:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_78); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4503:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==73) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalTyphonML.g:4504:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnDBAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_79); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4512:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalTyphonML.g:4513:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalTyphonML.g:4513:5: (lv_columns_8_0= ruleColumn )
                    // InternalTyphonML.g:4514:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:4531:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==13) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalTyphonML.g:4532:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_79); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getColumnDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4536:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalTyphonML.g:4537:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalTyphonML.g:4537:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalTyphonML.g:4538:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getColumnDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:4569:1: entryRuleGraphEdge_Impl returns [EObject current=null] : iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF ;
    public final EObject entryRuleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge_Impl = null;


        try {
            // InternalTyphonML.g:4569:55: (iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF )
            // InternalTyphonML.g:4570:2: iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF
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
    // InternalTyphonML.g:4576:1: ruleGraphEdge_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:4582:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:4583:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:4583:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:4584:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:4584:3: ()
            // InternalTyphonML.g:4585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4591:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==44) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTyphonML.g:4592:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4596:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4597:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4597:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4598:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            otherlv_3=(Token)match(input,74,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdge_ImplAccess().getEdgeKeyword_2());
            		
            // InternalTyphonML.g:4620:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4621:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4621:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4622:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_81); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4643:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==75) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalTyphonML.g:4644:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdge_ImplAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:4648:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4649:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4649:5: ( ruleEString )
                    // InternalTyphonML.g:4650:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4665:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==30) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalTyphonML.g:4666:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphEdge_ImplAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:4670:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4671:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4671:5: ( ruleEString )
                    // InternalTyphonML.g:4672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4687:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==76) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTyphonML.g:4688:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,76,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphEdge_ImplAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:4696:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:4697:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:4697:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:4698:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:4715:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==13) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalTyphonML.g:4716:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_41); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getGraphEdge_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:4720:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:4721:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:4721:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:4722:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getGraphEdge_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:4753:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:4753:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:4754:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
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
    // InternalTyphonML.g:4760:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4766:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4767:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4767:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4768:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4768:3: ()
            // InternalTyphonML.g:4769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4775:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==44) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTyphonML.g:4776:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4780:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4781:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4781:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4782:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            // InternalTyphonML.g:4800:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4801:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4801:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4802:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:4823:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4824:4: ( ruleEString )
            {
            // InternalTyphonML.g:4824:4: ( ruleEString )
            // InternalTyphonML.g:4825:5: ruleEString
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


    // $ANTLR start "entryRuleAddAttribute"
    // InternalTyphonML.g:4843:1: entryRuleAddAttribute returns [EObject current=null] : iv_ruleAddAttribute= ruleAddAttribute EOF ;
    public final EObject entryRuleAddAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttribute = null;


        try {
            // InternalTyphonML.g:4843:53: (iv_ruleAddAttribute= ruleAddAttribute EOF )
            // InternalTyphonML.g:4844:2: iv_ruleAddAttribute= ruleAddAttribute EOF
            {
             newCompositeNode(grammarAccess.getAddAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddAttribute=ruleAddAttribute();

            state._fsp--;

             current =iv_ruleAddAttribute; 
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
    // $ANTLR end "entryRuleAddAttribute"


    // $ANTLR start "ruleAddAttribute"
    // InternalTyphonML.g:4850:1: ruleAddAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleAddAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4856:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4857:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4857:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4858:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4858:3: ()
            // InternalTyphonML.g:4859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAttributeAccess().getAddAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4865:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==44) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTyphonML.g:4866:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4870:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4871:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4871:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4872:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_84);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddAttributeRule());
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

            otherlv_3=(Token)match(input,77,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributeAccess().getAddKeyword_2());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAttributeAccess().getAttributeKeyword_3());
            		
            // InternalTyphonML.g:4898:3: ( (lv_name_5_0= ruleEString ) )
            // InternalTyphonML.g:4899:4: (lv_name_5_0= ruleEString )
            {
            // InternalTyphonML.g:4899:4: (lv_name_5_0= ruleEString )
            // InternalTyphonML.g:4900:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getAddAttributeAccess().getColonKeyword_5());
            		
            // InternalTyphonML.g:4921:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4922:4: ( ruleEString )
            {
            // InternalTyphonML.g:4922:4: ( ruleEString )
            // InternalTyphonML.g:4923:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getTypeDataTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getAddAttributeAccess().getToKeyword_7());
            		
            // InternalTyphonML.g:4941:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4942:4: ( ruleEString )
            {
            // InternalTyphonML.g:4942:4: ( ruleEString )
            // InternalTyphonML.g:4943:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getOwnerEntityEntityCrossReference_8_0());
            				
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
    // $ANTLR end "ruleAddAttribute"


    // $ANTLR start "entryRuleAddGraphEdge"
    // InternalTyphonML.g:4961:1: entryRuleAddGraphEdge returns [EObject current=null] : iv_ruleAddGraphEdge= ruleAddGraphEdge EOF ;
    public final EObject entryRuleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphEdge = null;


        try {
            // InternalTyphonML.g:4961:53: (iv_ruleAddGraphEdge= ruleAddGraphEdge EOF )
            // InternalTyphonML.g:4962:2: iv_ruleAddGraphEdge= ruleAddGraphEdge EOF
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
    // InternalTyphonML.g:4968:1: ruleAddGraphEdge returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:4974:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:4975:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:4975:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:4976:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:4976:3: ()
            // InternalTyphonML.g:4977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4983:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==44) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTyphonML.g:4984:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4988:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4989:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4989:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4990:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_85);
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

            otherlv_3=(Token)match(input,78,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeKeyword_2());
            		
            // InternalTyphonML.g:5012:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5013:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5013:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5014:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_81); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:5035:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==75) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTyphonML.g:5036:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphEdgeAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:5040:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5041:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5041:5: ( ruleEString )
                    // InternalTyphonML.g:5042:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:5057:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==30) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTyphonML.g:5058:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddGraphEdgeAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:5062:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5063:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5063:5: ( ruleEString )
                    // InternalTyphonML.g:5064:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:5079:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==76) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalTyphonML.g:5080:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,76,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddGraphEdgeAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:5088:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:5089:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:5089:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:5090:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:5107:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==13) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalTyphonML.g:5108:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_41); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAddGraphEdgeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:5112:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:5113:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:5113:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:5114:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getAddGraphEdgeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGraphAttribute_Impl"
    // InternalTyphonML.g:5145:1: entryRuleGraphAttribute_Impl returns [EObject current=null] : iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF ;
    public final EObject entryRuleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute_Impl = null;


        try {
            // InternalTyphonML.g:5145:60: (iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF )
            // InternalTyphonML.g:5146:2: iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF
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
    // InternalTyphonML.g:5152:1: ruleGraphAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) ;
    public final EObject ruleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5158:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:5159:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:5159:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            // InternalTyphonML.g:5160:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:5160:3: ()
            // InternalTyphonML.g:5161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:5167:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==44) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTyphonML.g:5168:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:5172:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:5173:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:5173:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:5174:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            // InternalTyphonML.g:5192:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:5193:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:5193:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:5194:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_86);
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

            otherlv_4=(Token)match(input,79,FOLLOW_87); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAttribute_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalTyphonML.g:5215:3: ( ( ruleEString ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_STRING && LA87_0<=RULE_ID)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalTyphonML.g:5216:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:5216:4: ( ruleEString )
                    // InternalTyphonML.g:5217:5: ruleEString
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


    // $ANTLR start "entryRuleAddGraphAttribute"
    // InternalTyphonML.g:5235:1: entryRuleAddGraphAttribute returns [EObject current=null] : iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF ;
    public final EObject entryRuleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphAttribute = null;


        try {
            // InternalTyphonML.g:5235:58: (iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF )
            // InternalTyphonML.g:5236:2: iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF
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
    // InternalTyphonML.g:5242:1: ruleAddGraphAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalTyphonML.g:5248:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:5249:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:5249:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:5250:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:5250:3: ()
            // InternalTyphonML.g:5251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:5257:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==44) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTyphonML.g:5258:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:5262:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:5263:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:5263:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:5264:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            otherlv_3=(Token)match(input,80,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeKeyword_2());
            		
            // InternalTyphonML.g:5286:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5287:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5287:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5288:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_89); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphAttributeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:5309:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==37) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalTyphonML.g:5310:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:5314:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5315:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5315:5: ( ruleEString )
                    // InternalTyphonML.g:5316:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getValueAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAddEntity"
    // InternalTyphonML.g:5339:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalTyphonML.g:5339:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalTyphonML.g:5340:2: iv_ruleAddEntity= ruleAddEntity EOF
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
    // InternalTyphonML.g:5346:1: ruleAddEntity returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:5352:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:5353:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:5353:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}' )
            // InternalTyphonML.g:5354:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']' )? (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:5354:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==44) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTyphonML.g:5355:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddEntityAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:5359:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:5360:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:5360:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:5361:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_84);
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

            otherlv_2=(Token)match(input,77,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAddEntityAccess().getAddKeyword_1());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddEntityAccess().getEntityKeyword_2());
            		
            // InternalTyphonML.g:5387:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5388:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5388:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5389:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_90); 

            			newLeafNode(otherlv_5, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:5410:3: (otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==60) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalTyphonML.g:5411:4: otherlv_6= 'attributes' otherlv_7= '[' ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )* otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddEntityAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_91); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddEntityAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:5419:4: ( ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )* )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==44||LA92_0==77) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalTyphonML.g:5420:5: ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )*
                    	    {
                    	    // InternalTyphonML.g:5420:5: ( (lv_attributes_8_0= ruleAddAttribute ) )
                    	    // InternalTyphonML.g:5421:6: (lv_attributes_8_0= ruleAddAttribute )
                    	    {
                    	    // InternalTyphonML.g:5421:6: (lv_attributes_8_0= ruleAddAttribute )
                    	    // InternalTyphonML.g:5422:7: lv_attributes_8_0= ruleAddAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAddAttributeParserRuleCall_5_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_92);
                    	    lv_attributes_8_0=ruleAddAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_8_0,
                    	    								"it.univaq.disim.typhon.TyphonML.AddAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalTyphonML.g:5439:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) ) )*
                    	    loop91:
                    	    do {
                    	        int alt91=2;
                    	        int LA91_0 = input.LA(1);

                    	        if ( (LA91_0==13) ) {
                    	            alt91=1;
                    	        }


                    	        switch (alt91) {
                    	    	case 1 :
                    	    	    // InternalTyphonML.g:5440:6: otherlv_9= ',' ( (lv_attributes_10_0= ruleAddAttribute ) )
                    	    	    {
                    	    	    otherlv_9=(Token)match(input,13,FOLLOW_93); 

                    	    	    						newLeafNode(otherlv_9, grammarAccess.getAddEntityAccess().getCommaKeyword_5_2_1_0());
                    	    	    					
                    	    	    // InternalTyphonML.g:5444:6: ( (lv_attributes_10_0= ruleAddAttribute ) )
                    	    	    // InternalTyphonML.g:5445:7: (lv_attributes_10_0= ruleAddAttribute )
                    	    	    {
                    	    	    // InternalTyphonML.g:5445:7: (lv_attributes_10_0= ruleAddAttribute )
                    	    	    // InternalTyphonML.g:5446:8: lv_attributes_10_0= ruleAddAttribute
                    	    	    {

                    	    	    								newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAddAttributeParserRuleCall_5_2_1_1_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_92);
                    	    	    lv_attributes_10_0=ruleAddAttribute();

                    	    	    state._fsp--;


                    	    	    								if (current==null) {
                    	    	    									current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    	    								}
                    	    	    								add(
                    	    	    									current,
                    	    	    									"attributes",
                    	    	    									lv_attributes_10_0,
                    	    	    									"it.univaq.disim.typhon.TyphonML.AddAttribute");
                    	    	    								afterParserOrEnumRuleCall();
                    	    	    							

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop91;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_94); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddEntityAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:5470:3: (otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==81) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalTyphonML.g:5471:4: otherlv_12= 'relations' otherlv_13= '[' ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )* otherlv_17= ']'
                    {
                    otherlv_12=(Token)match(input,81,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddEntityAccess().getRelationsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_91); 

                    				newLeafNode(otherlv_13, grammarAccess.getAddEntityAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:5479:4: ( ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )* )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==44||LA95_0==77) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalTyphonML.g:5480:5: ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )*
                    	    {
                    	    // InternalTyphonML.g:5480:5: ( (lv_relations_14_0= ruleAddRelation ) )
                    	    // InternalTyphonML.g:5481:6: (lv_relations_14_0= ruleAddRelation )
                    	    {
                    	    // InternalTyphonML.g:5481:6: (lv_relations_14_0= ruleAddRelation )
                    	    // InternalTyphonML.g:5482:7: lv_relations_14_0= ruleAddRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsAddRelationParserRuleCall_6_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_92);
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

                    	    // InternalTyphonML.g:5499:5: (otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) ) )*
                    	    loop94:
                    	    do {
                    	        int alt94=2;
                    	        int LA94_0 = input.LA(1);

                    	        if ( (LA94_0==13) ) {
                    	            alt94=1;
                    	        }


                    	        switch (alt94) {
                    	    	case 1 :
                    	    	    // InternalTyphonML.g:5500:6: otherlv_15= ',' ( (lv_relations_16_0= ruleAddRelation ) )
                    	    	    {
                    	    	    otherlv_15=(Token)match(input,13,FOLLOW_93); 

                    	    	    						newLeafNode(otherlv_15, grammarAccess.getAddEntityAccess().getCommaKeyword_6_2_1_0());
                    	    	    					
                    	    	    // InternalTyphonML.g:5504:6: ( (lv_relations_16_0= ruleAddRelation ) )
                    	    	    // InternalTyphonML.g:5505:7: (lv_relations_16_0= ruleAddRelation )
                    	    	    {
                    	    	    // InternalTyphonML.g:5505:7: (lv_relations_16_0= ruleAddRelation )
                    	    	    // InternalTyphonML.g:5506:8: lv_relations_16_0= ruleAddRelation
                    	    	    {

                    	    	    								newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsAddRelationParserRuleCall_6_2_1_1_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_92);
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
                    	    	    break loop94;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getAddEntityAccess().getRightSquareBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAttribute_Impl"
    // InternalTyphonML.g:5538:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalTyphonML.g:5538:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalTyphonML.g:5539:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalTyphonML.g:5545:1: ruleAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5551:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:5552:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:5552:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:5553:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:5553:3: ()
            // InternalTyphonML.g:5554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:5560:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==44) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalTyphonML.g:5561:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:5565:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:5566:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:5566:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:5567:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            // InternalTyphonML.g:5585:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:5586:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:5586:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:5587:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAttribute_ImplAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:5608:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5609:4: ( ruleEString )
            {
            // InternalTyphonML.g:5609:4: ( ruleEString )
            // InternalTyphonML.g:5610:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttribute_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getTypeDataTypeCrossReference_4_0());
            				
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
    // $ANTLR end "ruleAttribute_Impl"


    // $ANTLR start "entryRuleAddRelation"
    // InternalTyphonML.g:5628:1: entryRuleAddRelation returns [EObject current=null] : iv_ruleAddRelation= ruleAddRelation EOF ;
    public final EObject entryRuleAddRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRelation = null;


        try {
            // InternalTyphonML.g:5628:52: (iv_ruleAddRelation= ruleAddRelation EOF )
            // InternalTyphonML.g:5629:2: iv_ruleAddRelation= ruleAddRelation EOF
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
    // InternalTyphonML.g:5635:1: ruleAddRelation returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? ) ;
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
            // InternalTyphonML.g:5641:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? ) )
            // InternalTyphonML.g:5642:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? )
            {
            // InternalTyphonML.g:5642:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? )
            // InternalTyphonML.g:5643:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )?
            {
            // InternalTyphonML.g:5643:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==44) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalTyphonML.g:5644:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddRelationAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:5648:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:5649:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:5649:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:5650:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_84);
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

            otherlv_2=(Token)match(input,77,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getAddRelationAccess().getAddKeyword_1());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddRelationAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:5676:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5677:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5677:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5678:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddRelationAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAddRelationAccess().getToKeyword_4());
            		
            // InternalTyphonML.g:5699:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5700:4: ( ruleEString )
            {
            // InternalTyphonML.g:5700:4: ( ruleEString )
            // InternalTyphonML.g:5701:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getOwnerEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5715:3: ( (lv_isContainment_7_0= ':' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==46) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalTyphonML.g:5716:4: (lv_isContainment_7_0= ':' )
                    {
                    // InternalTyphonML.g:5716:4: (lv_isContainment_7_0= ':' )
                    // InternalTyphonML.g:5717:5: lv_isContainment_7_0= ':'
                    {
                    lv_isContainment_7_0=(Token)match(input,46,FOLLOW_45); 

                    					newLeafNode(lv_isContainment_7_0, grammarAccess.getAddRelationAccess().getIsContainmentColonKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getAddRelationAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalTyphonML.g:5733:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5734:4: ( ruleEString )
            {
            // InternalTyphonML.g:5734:4: ( ruleEString )
            // InternalTyphonML.g:5735:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getTypeEntityCrossReference_8_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5749:3: (otherlv_10= '.' ( ( ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==51) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalTyphonML.g:5750:4: otherlv_10= '.' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddRelationAccess().getFullStopKeyword_9_0());
                    			
                    // InternalTyphonML.g:5754:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5755:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5755:5: ( ruleEString )
                    // InternalTyphonML.g:5756:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getOppositeRelationCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:5771:3: (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==12) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalTyphonML.g:5772:4: otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddRelationAccess().getLeftSquareBracketKeyword_10_0());
                    			
                    // InternalTyphonML.g:5776:4: ( (lv_cardinality_13_0= ruleCardinality ) )
                    // InternalTyphonML.g:5777:5: (lv_cardinality_13_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:5777:5: (lv_cardinality_13_0= ruleCardinality )
                    // InternalTyphonML.g:5778:6: lv_cardinality_13_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getCardinalityCardinalityEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_36);
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


    // $ANTLR start "ruleCardinality"
    // InternalTyphonML.g:5804:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:5810:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) )
            // InternalTyphonML.g:5811:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            {
            // InternalTyphonML.g:5811:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            int alt102=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt102=1;
                }
                break;
            case 83:
                {
                alt102=2;
                }
                break;
            case 84:
                {
                alt102=3;
                }
                break;
            case 85:
                {
                alt102=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalTyphonML.g:5812:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalTyphonML.g:5812:3: (enumLiteral_0= '0..1' )
                    // InternalTyphonML.g:5813:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:5820:3: (enumLiteral_1= '1' )
                    {
                    // InternalTyphonML.g:5820:3: (enumLiteral_1= '1' )
                    // InternalTyphonML.g:5821:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:5828:3: (enumLiteral_2= '0..*' )
                    {
                    // InternalTyphonML.g:5828:3: (enumLiteral_2= '0..*' )
                    // InternalTyphonML.g:5829:4: enumLiteral_2= '0..*'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:5836:3: (enumLiteral_3= '*' )
                    {
                    // InternalTyphonML.g:5836:3: (enumLiteral_3= '*' )
                    // InternalTyphonML.g:5837:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

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
    // InternalTyphonML.g:5847:1: ruleNlpTaskType returns [Enumerator current=null] : ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) ) ;
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
        Token enumLiteral_17=null;


        	enterRule();

        try {
            // InternalTyphonML.g:5853:2: ( ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) ) )
            // InternalTyphonML.g:5854:2: ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) )
            {
            // InternalTyphonML.g:5854:2: ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) )
            int alt103=18;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt103=1;
                }
                break;
            case 87:
                {
                alt103=2;
                }
                break;
            case 88:
                {
                alt103=3;
                }
                break;
            case 89:
                {
                alt103=4;
                }
                break;
            case 90:
                {
                alt103=5;
                }
                break;
            case 91:
                {
                alt103=6;
                }
                break;
            case 92:
                {
                alt103=7;
                }
                break;
            case 93:
                {
                alt103=8;
                }
                break;
            case 94:
                {
                alt103=9;
                }
                break;
            case 95:
                {
                alt103=10;
                }
                break;
            case 96:
                {
                alt103=11;
                }
                break;
            case 97:
                {
                alt103=12;
                }
                break;
            case 98:
                {
                alt103=13;
                }
                break;
            case 99:
                {
                alt103=14;
                }
                break;
            case 100:
                {
                alt103=15;
                }
                break;
            case 101:
                {
                alt103=16;
                }
                break;
            case 102:
                {
                alt103=17;
                }
                break;
            case 103:
                {
                alt103=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalTyphonML.g:5855:3: (enumLiteral_0= 'ParagraphSegmentation' )
                    {
                    // InternalTyphonML.g:5855:3: (enumLiteral_0= 'ParagraphSegmentation' )
                    // InternalTyphonML.g:5856:4: enumLiteral_0= 'ParagraphSegmentation'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getParagraphSegmentationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNlpTaskTypeAccess().getParagraphSegmentationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:5863:3: (enumLiteral_1= 'SentenceSegmentation' )
                    {
                    // InternalTyphonML.g:5863:3: (enumLiteral_1= 'SentenceSegmentation' )
                    // InternalTyphonML.g:5864:4: enumLiteral_1= 'SentenceSegmentation'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getSentenceSegmentationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNlpTaskTypeAccess().getSentenceSegmentationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:5871:3: (enumLiteral_2= 'Tokenisation' )
                    {
                    // InternalTyphonML.g:5871:3: (enumLiteral_2= 'Tokenisation' )
                    // InternalTyphonML.g:5872:4: enumLiteral_2= 'Tokenisation'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTokenisationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNlpTaskTypeAccess().getTokenisationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:5879:3: (enumLiteral_3= 'PhraseExtractor' )
                    {
                    // InternalTyphonML.g:5879:3: (enumLiteral_3= 'PhraseExtractor' )
                    // InternalTyphonML.g:5880:4: enumLiteral_3= 'PhraseExtractor'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getPhraseExtractorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNlpTaskTypeAccess().getPhraseExtractorEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:5887:3: (enumLiteral_4= 'NGramExtractor' )
                    {
                    // InternalTyphonML.g:5887:3: (enumLiteral_4= 'NGramExtractor' )
                    // InternalTyphonML.g:5888:4: enumLiteral_4= 'NGramExtractor'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getNGramExtractorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNlpTaskTypeAccess().getNGramExtractorEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:5895:3: (enumLiteral_5= 'POSTagging' )
                    {
                    // InternalTyphonML.g:5895:3: (enumLiteral_5= 'POSTagging' )
                    // InternalTyphonML.g:5896:4: enumLiteral_5= 'POSTagging'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getPOSTaggingEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNlpTaskTypeAccess().getPOSTaggingEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:5903:3: (enumLiteral_6= 'Lemmatisation' )
                    {
                    // InternalTyphonML.g:5903:3: (enumLiteral_6= 'Lemmatisation' )
                    // InternalTyphonML.g:5904:4: enumLiteral_6= 'Lemmatisation'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getLemmatisationEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNlpTaskTypeAccess().getLemmatisationEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:5911:3: (enumLiteral_7= 'Stemming' )
                    {
                    // InternalTyphonML.g:5911:3: (enumLiteral_7= 'Stemming' )
                    // InternalTyphonML.g:5912:4: enumLiteral_7= 'Stemming'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getStemmingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getNlpTaskTypeAccess().getStemmingEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:5919:3: (enumLiteral_8= 'DependencyParsing' )
                    {
                    // InternalTyphonML.g:5919:3: (enumLiteral_8= 'DependencyParsing' )
                    // InternalTyphonML.g:5920:4: enumLiteral_8= 'DependencyParsing'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getDependencyParsingEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getNlpTaskTypeAccess().getDependencyParsingEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:5927:3: (enumLiteral_9= 'Chunking' )
                    {
                    // InternalTyphonML.g:5927:3: (enumLiteral_9= 'Chunking' )
                    // InternalTyphonML.g:5928:4: enumLiteral_9= 'Chunking'
                    {
                    enumLiteral_9=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getChunkingEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getNlpTaskTypeAccess().getChunkingEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:5935:3: (enumLiteral_10= 'SentimentAnalysis' )
                    {
                    // InternalTyphonML.g:5935:3: (enumLiteral_10= 'SentimentAnalysis' )
                    // InternalTyphonML.g:5936:4: enumLiteral_10= 'SentimentAnalysis'
                    {
                    enumLiteral_10=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getSentimentAnalysisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getNlpTaskTypeAccess().getSentimentAnalysisEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:5943:3: (enumLiteral_11= 'TextClassification' )
                    {
                    // InternalTyphonML.g:5943:3: (enumLiteral_11= 'TextClassification' )
                    // InternalTyphonML.g:5944:4: enumLiteral_11= 'TextClassification'
                    {
                    enumLiteral_11=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTextClassificationEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getNlpTaskTypeAccess().getTextClassificationEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTyphonML.g:5951:3: (enumLiteral_12= 'TopicModelling' )
                    {
                    // InternalTyphonML.g:5951:3: (enumLiteral_12= 'TopicModelling' )
                    // InternalTyphonML.g:5952:4: enumLiteral_12= 'TopicModelling'
                    {
                    enumLiteral_12=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTopicModellingEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getNlpTaskTypeAccess().getTopicModellingEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTyphonML.g:5959:3: (enumLiteral_13= 'TermExtraction' )
                    {
                    // InternalTyphonML.g:5959:3: (enumLiteral_13= 'TermExtraction' )
                    // InternalTyphonML.g:5960:4: enumLiteral_13= 'TermExtraction'
                    {
                    enumLiteral_13=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTermExtractionEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getNlpTaskTypeAccess().getTermExtractionEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTyphonML.g:5967:3: (enumLiteral_14= 'NamedEntityRecognition' )
                    {
                    // InternalTyphonML.g:5967:3: (enumLiteral_14= 'NamedEntityRecognition' )
                    // InternalTyphonML.g:5968:4: enumLiteral_14= 'NamedEntityRecognition'
                    {
                    enumLiteral_14=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getNamedEntityRecognitionEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getNlpTaskTypeAccess().getNamedEntityRecognitionEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTyphonML.g:5975:3: (enumLiteral_15= 'RelationExtraction' )
                    {
                    // InternalTyphonML.g:5975:3: (enumLiteral_15= 'RelationExtraction' )
                    // InternalTyphonML.g:5976:4: enumLiteral_15= 'RelationExtraction'
                    {
                    enumLiteral_15=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getRelationExtractionEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getNlpTaskTypeAccess().getRelationExtractionEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTyphonML.g:5983:3: (enumLiteral_16= 'EventExtraction' )
                    {
                    // InternalTyphonML.g:5983:3: (enumLiteral_16= 'EventExtraction' )
                    // InternalTyphonML.g:5984:4: enumLiteral_16= 'EventExtraction'
                    {
                    enumLiteral_16=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getEventExtractionEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getNlpTaskTypeAccess().getEventExtractionEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTyphonML.g:5991:3: (enumLiteral_17= 'CoreferenceResolution' )
                    {
                    // InternalTyphonML.g:5991:3: (enumLiteral_17= 'CoreferenceResolution' )
                    // InternalTyphonML.g:5992:4: enumLiteral_17= 'CoreferenceResolution'
                    {
                    enumLiteral_17=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getCoreferenceResolutionEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getNlpTaskTypeAccess().getCoreferenceResolutionEnumLiteralDeclaration_17());
                    			

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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\1\17\1\4\2\33\1\20\1\uffff\1\40\1\uffff\1\33\4\uffff\2\115\13\uffff\1\41\5\uffff";
    static final String dfa_3s = "\1\115\1\5\3\50\1\uffff\1\40\1\uffff\1\53\4\uffff\2\115\13\uffff\1\43\5\uffff";
    static final String dfa_4s = "\5\uffff\1\4\1\uffff\1\7\1\uffff\1\21\1\22\1\24\1\25\2\uffff\1\10\1\1\1\11\1\15\1\2\1\14\1\23\1\26\1\3\1\13\1\12\1\uffff\1\16\1\17\1\20\1\5\1\6";
    static final String dfa_5s = "\40\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\2\uffff\1\13\3\uffff\1\14\1\uffff\1\12\1\11\1\10\2\uffff\1\5\1\uffff\1\6\6\uffff\1\7\2\uffff\1\3\2\uffff\1\1\40\uffff\1\2",
            "\1\15\1\16",
            "\1\17\4\uffff\1\20\7\uffff\1\21",
            "\1\24\4\uffff\1\23\7\uffff\1\22",
            "\1\26\6\uffff\1\25\3\uffff\1\31\4\uffff\1\27\7\uffff\1\30",
            "",
            "\1\32",
            "",
            "\1\35\16\uffff\1\33\1\34",
            "",
            "",
            "",
            "",
            "\1\2",
            "\1\2",
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
            "\1\36\1\uffff\1\37",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "246:2: (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntityVertical_4= ruleSplitEntityVertical | this_SplitEntityHorizontal_5= ruleSplitEntityHorizontal | this_MergeEntity_6= ruleMergeEntity | this_AddAttribute_7= ruleAddAttribute | this_AddRelation_8= ruleAddRelation | this_RenameAttribute_9= ruleRenameAttribute | this_RenameRelation_10= ruleRenameRelation | this_RemoveAttribute_11= ruleRemoveAttribute | this_RemoveRelation_12= ruleRemoveRelation | this_ChangeRelationContainement_13= ruleChangeRelationContainement | this_ChangeRelationCardinality_14= ruleChangeRelationCardinality | this_ChangeAttributeType_15= ruleChangeAttributeType | this_AddIndexTable_16= ruleAddIndexTable | this_DropIndexTable_17= ruleDropIndexTable | this_RenameTable_18= ruleRenameTable | this_AddAttributesToIndex_19= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_20= ruleRemoveAttributesToIndex | this_RenameCollection_21= ruleRenameCollection )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001300100000802L,0x0000000000000135L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000802L,0x0000000000000135L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001240A7448000L,0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x000000FFFFC00000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x000000FFFFC00000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000900000200030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000200030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000001002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xA040100000200030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xA040100000200000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xA000100000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000030L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000100000000030L,0x0000000000010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x5000000000200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000008L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000200000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0200100000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000100000000000L,0x0000000000004400L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000040200000L,0x0000000000001800L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000040200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x1000000000200000L,0x0000000000020000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000100000004000L,0x0000000000002000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000100000006000L,0x0000000000002000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000100000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000200000L,0x0000000000020000L});

}