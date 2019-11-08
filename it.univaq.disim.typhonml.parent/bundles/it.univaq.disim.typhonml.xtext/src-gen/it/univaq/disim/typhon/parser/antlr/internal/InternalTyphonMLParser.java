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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'changeOperators'", "'['", "','", "']'", "'rename'", "'collection'", "'as'", "'extends'", "'tableindex'", "'{'", "'}'", "'reduce'", "'table'", "'drop'", "'create'", "'change'", "'attribute'", "'type'", "'migrate'", "'to'", "'split'", "'entity'", "'left'", "'right'", "'merge'", "'entities'", "'relation'", "'remove'", "'containment'", "'cardinality'", "'importedNamespace'", "'datatype'", "':'", "'freetext'", "'customdatatype'", "'elements'", "'->'", "'.'", "'true'", "'false'", "'db'", "'('", "')'", "'node'", "'!'", "'column'", "'attributes'", "'index'", "'references'", "'idSpec'", "'relationaldb'", "'tables'", "'documentdb'", "'collections'", "'keyvaluedb'", "'graphdb'", "'nodes'", "'edges'", "'columndb'", "'columns'", "'edge'", "'from'", "'labels'", "'add'", "'AddGraphEdge'", "'='", "'AddGraphAttribute'", "'value'", "'relations'", "'0..1'", "'1'", "'0..*'", "'*'", "'ParagraphSegmentation'", "'SentenceSegmentation'", "'Tokenisation'", "'PhraseExtractor'", "'NGramExtractor'", "'POSTagging'", "'Lemmatisation'", "'Stemming'", "'DependencyParsing'", "'Chunking'", "'SentimentAnalysis'", "'TextClassification'", "'TopicModelling'", "'TermExtraction'", "'NamedEntityRecognition'", "'RelationExtraction'", "'EventExtraction'", "'CoreferenceResolution'"
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

                if ( (LA1_0==41) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_STRING) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==32||LA1_4==42||LA1_4==45) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_1==RULE_ID) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==32||LA1_5==42||LA1_5==45) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==32||LA1_0==42||LA1_0==45) ) {
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

                if ( (LA2_0==41||LA2_0==61||LA2_0==63||(LA2_0>=65 && LA2_0<=66)||LA2_0==69) ) {
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
            case 41:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 42:
                        {
                        alt5=1;
                        }
                        break;
                    case 45:
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
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA5_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 42:
                        {
                        alt5=1;
                        }
                        break;
                    case 45:
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
            case 42:
                {
                alt5=1;
                }
                break;
            case 45:
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
    // InternalTyphonML.g:239:1: ruleChangeOperator returns [EObject current=null] : (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntity_4= ruleSplitEntity | this_MergeEntity_5= ruleMergeEntity | this_AddAttribute_6= ruleAddAttribute | this_AddRelation_7= ruleAddRelation | this_RenameAttribute_8= ruleRenameAttribute | this_RenameRelation_9= ruleRenameRelation | this_RemoveAttribute_10= ruleRemoveAttribute | this_RemoveRelation_11= ruleRemoveRelation | this_ChangeRelationContainement_12= ruleChangeRelationContainement | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_ChangeAttributeType_14= ruleChangeAttributeType | this_AddIndexTable_15= ruleAddIndexTable | this_DropIndexTable_16= ruleDropIndexTable | this_RenameTable_17= ruleRenameTable | this_AddAttributesToIndex_18= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_19= ruleRemoveAttributesToIndex | this_RenameCollection_20= ruleRenameCollection ) ;
    public final EObject ruleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AddEntity_0 = null;

        EObject this_RemoveEntity_1 = null;

        EObject this_RenameEntity_2 = null;

        EObject this_MigrateEntity_3 = null;

        EObject this_SplitEntity_4 = null;

        EObject this_MergeEntity_5 = null;

        EObject this_AddAttribute_6 = null;

        EObject this_AddRelation_7 = null;

        EObject this_RenameAttribute_8 = null;

        EObject this_RenameRelation_9 = null;

        EObject this_RemoveAttribute_10 = null;

        EObject this_RemoveRelation_11 = null;

        EObject this_ChangeRelationContainement_12 = null;

        EObject this_ChangeRelationCardinality_13 = null;

        EObject this_ChangeAttributeType_14 = null;

        EObject this_AddIndexTable_15 = null;

        EObject this_DropIndexTable_16 = null;

        EObject this_RenameTable_17 = null;

        EObject this_AddAttributesToIndex_18 = null;

        EObject this_RemoveAttributesToIndex_19 = null;

        EObject this_RenameCollection_20 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:245:2: ( (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntity_4= ruleSplitEntity | this_MergeEntity_5= ruleMergeEntity | this_AddAttribute_6= ruleAddAttribute | this_AddRelation_7= ruleAddRelation | this_RenameAttribute_8= ruleRenameAttribute | this_RenameRelation_9= ruleRenameRelation | this_RemoveAttribute_10= ruleRemoveAttribute | this_RemoveRelation_11= ruleRemoveRelation | this_ChangeRelationContainement_12= ruleChangeRelationContainement | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_ChangeAttributeType_14= ruleChangeAttributeType | this_AddIndexTable_15= ruleAddIndexTable | this_DropIndexTable_16= ruleDropIndexTable | this_RenameTable_17= ruleRenameTable | this_AddAttributesToIndex_18= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_19= ruleRemoveAttributesToIndex | this_RenameCollection_20= ruleRenameCollection ) )
            // InternalTyphonML.g:246:2: (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntity_4= ruleSplitEntity | this_MergeEntity_5= ruleMergeEntity | this_AddAttribute_6= ruleAddAttribute | this_AddRelation_7= ruleAddRelation | this_RenameAttribute_8= ruleRenameAttribute | this_RenameRelation_9= ruleRenameRelation | this_RemoveAttribute_10= ruleRemoveAttribute | this_RemoveRelation_11= ruleRemoveRelation | this_ChangeRelationContainement_12= ruleChangeRelationContainement | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_ChangeAttributeType_14= ruleChangeAttributeType | this_AddIndexTable_15= ruleAddIndexTable | this_DropIndexTable_16= ruleDropIndexTable | this_RenameTable_17= ruleRenameTable | this_AddAttributesToIndex_18= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_19= ruleRemoveAttributesToIndex | this_RenameCollection_20= ruleRenameCollection )
            {
            // InternalTyphonML.g:246:2: (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntity_4= ruleSplitEntity | this_MergeEntity_5= ruleMergeEntity | this_AddAttribute_6= ruleAddAttribute | this_AddRelation_7= ruleAddRelation | this_RenameAttribute_8= ruleRenameAttribute | this_RenameRelation_9= ruleRenameRelation | this_RemoveAttribute_10= ruleRemoveAttribute | this_RemoveRelation_11= ruleRemoveRelation | this_ChangeRelationContainement_12= ruleChangeRelationContainement | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_ChangeAttributeType_14= ruleChangeAttributeType | this_AddIndexTable_15= ruleAddIndexTable | this_DropIndexTable_16= ruleDropIndexTable | this_RenameTable_17= ruleRenameTable | this_AddAttributesToIndex_18= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_19= ruleRemoveAttributesToIndex | this_RenameCollection_20= ruleRenameCollection )
            int alt6=21;
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
                    // InternalTyphonML.g:283:3: this_SplitEntity_4= ruleSplitEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getSplitEntityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntity_4=ruleSplitEntity();

                    state._fsp--;


                    			current = this_SplitEntity_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:292:3: this_MergeEntity_5= ruleMergeEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getMergeEntityParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeEntity_5=ruleMergeEntity();

                    state._fsp--;


                    			current = this_MergeEntity_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:301:3: this_AddAttribute_6= ruleAddAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddAttributeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttribute_6=ruleAddAttribute();

                    state._fsp--;


                    			current = this_AddAttribute_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:310:3: this_AddRelation_7= ruleAddRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddRelationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRelation_7=ruleAddRelation();

                    state._fsp--;


                    			current = this_AddRelation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:319:3: this_RenameAttribute_8= ruleRenameAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameAttributeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameAttribute_8=ruleRenameAttribute();

                    state._fsp--;


                    			current = this_RenameAttribute_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:328:3: this_RenameRelation_9= ruleRenameRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameRelationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameRelation_9=ruleRenameRelation();

                    state._fsp--;


                    			current = this_RenameRelation_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:337:3: this_RemoveAttribute_10= ruleRemoveAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttribute_10=ruleRemoveAttribute();

                    state._fsp--;


                    			current = this_RemoveAttribute_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:346:3: this_RemoveRelation_11= ruleRemoveRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveRelationParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveRelation_11=ruleRemoveRelation();

                    state._fsp--;


                    			current = this_RemoveRelation_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalTyphonML.g:355:3: this_ChangeRelationContainement_12= ruleChangeRelationContainement
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeRelationContainementParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeRelationContainement_12=ruleChangeRelationContainement();

                    state._fsp--;


                    			current = this_ChangeRelationContainement_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalTyphonML.g:364:3: this_ChangeRelationCardinality_13= ruleChangeRelationCardinality
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
                    // InternalTyphonML.g:373:3: this_ChangeAttributeType_14= ruleChangeAttributeType
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getChangeAttributeTypeParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeAttributeType_14=ruleChangeAttributeType();

                    state._fsp--;


                    			current = this_ChangeAttributeType_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalTyphonML.g:382:3: this_AddIndexTable_15= ruleAddIndexTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddIndexTableParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddIndexTable_15=ruleAddIndexTable();

                    state._fsp--;


                    			current = this_AddIndexTable_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalTyphonML.g:391:3: this_DropIndexTable_16= ruleDropIndexTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getDropIndexTableParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropIndexTable_16=ruleDropIndexTable();

                    state._fsp--;


                    			current = this_DropIndexTable_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalTyphonML.g:400:3: this_RenameTable_17= ruleRenameTable
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameTableParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameTable_17=ruleRenameTable();

                    state._fsp--;


                    			current = this_RenameTable_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalTyphonML.g:409:3: this_AddAttributesToIndex_18= ruleAddAttributesToIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddAttributesToIndexParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttributesToIndex_18=ruleAddAttributesToIndex();

                    state._fsp--;


                    			current = this_AddAttributesToIndex_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalTyphonML.g:418:3: this_RemoveAttributesToIndex_19= ruleRemoveAttributesToIndex
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributesToIndexParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttributesToIndex_19=ruleRemoveAttributesToIndex();

                    state._fsp--;


                    			current = this_RemoveAttributesToIndex_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalTyphonML.g:427:3: this_RenameCollection_20= ruleRenameCollection
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameCollectionParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameCollection_20=ruleRenameCollection();

                    state._fsp--;


                    			current = this_RenameCollection_20;
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
    // InternalTyphonML.g:439:1: entryRuleRenameCollection returns [EObject current=null] : iv_ruleRenameCollection= ruleRenameCollection EOF ;
    public final EObject entryRuleRenameCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameCollection = null;


        try {
            // InternalTyphonML.g:439:57: (iv_ruleRenameCollection= ruleRenameCollection EOF )
            // InternalTyphonML.g:440:2: iv_ruleRenameCollection= ruleRenameCollection EOF
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
    // InternalTyphonML.g:446:1: ruleRenameCollection returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:452:2: ( (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:453:2: (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:453:2: (otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:454:3: otherlv_0= 'rename' otherlv_1= 'collection' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameCollectionAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameCollectionAccess().getCollectionKeyword_1());
            		
            // InternalTyphonML.g:462:3: ( ( ruleEString ) )
            // InternalTyphonML.g:463:4: ( ruleEString )
            {
            // InternalTyphonML.g:463:4: ( ruleEString )
            // InternalTyphonML.g:464:5: ruleEString
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
            		
            // InternalTyphonML.g:482:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:483:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:483:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:484:5: lv_newName_4_0= ruleEString
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
    // InternalTyphonML.g:505:1: entryRuleAddAttributesToIndex returns [EObject current=null] : iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF ;
    public final EObject entryRuleAddAttributesToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttributesToIndex = null;


        try {
            // InternalTyphonML.g:505:61: (iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF )
            // InternalTyphonML.g:506:2: iv_ruleAddAttributesToIndex= ruleAddAttributesToIndex EOF
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
    // InternalTyphonML.g:512:1: ruleAddAttributesToIndex returns [EObject current=null] : (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAddAttributesToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:518:2: ( (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:519:2: (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:519:2: (otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:520:3: otherlv_0= 'extends' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAttributesToIndexAccess().getExtendsKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAttributesToIndexAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:528:3: ( ( ruleEString ) )
            // InternalTyphonML.g:529:4: ( ruleEString )
            {
            // InternalTyphonML.g:529:4: ( ruleEString )
            // InternalTyphonML.g:530:5: ruleEString
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
            		
            // InternalTyphonML.g:548:3: ( ( ruleEString ) )
            // InternalTyphonML.g:549:4: ( ruleEString )
            {
            // InternalTyphonML.g:549:4: ( ruleEString )
            // InternalTyphonML.g:550:5: ruleEString
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

            // InternalTyphonML.g:564:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTyphonML.g:565:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddAttributesToIndexAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:569:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:570:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:570:5: ( ruleEString )
                    // InternalTyphonML.g:571:6: ruleEString
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
    // InternalTyphonML.g:594:1: entryRuleRemoveAttributesToIndex returns [EObject current=null] : iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF ;
    public final EObject entryRuleRemoveAttributesToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttributesToIndex = null;


        try {
            // InternalTyphonML.g:594:64: (iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF )
            // InternalTyphonML.g:595:2: iv_ruleRemoveAttributesToIndex= ruleRemoveAttributesToIndex EOF
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
    // InternalTyphonML.g:601:1: ruleRemoveAttributesToIndex returns [EObject current=null] : (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRemoveAttributesToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:607:2: ( (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:608:2: (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:608:2: (otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:609:3: otherlv_0= 'reduce' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributesToIndexAccess().getReduceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributesToIndexAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:617:3: ( ( ruleEString ) )
            // InternalTyphonML.g:618:4: ( ruleEString )
            {
            // InternalTyphonML.g:618:4: ( ruleEString )
            // InternalTyphonML.g:619:5: ruleEString
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
            		
            // InternalTyphonML.g:637:3: ( ( ruleEString ) )
            // InternalTyphonML.g:638:4: ( ruleEString )
            {
            // InternalTyphonML.g:638:4: ( ruleEString )
            // InternalTyphonML.g:639:5: ruleEString
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

            // InternalTyphonML.g:653:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:654:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRemoveAttributesToIndexAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:658:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:659:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:659:5: ( ruleEString )
                    // InternalTyphonML.g:660:6: ruleEString
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
    // InternalTyphonML.g:683:1: entryRuleRenameTable returns [EObject current=null] : iv_ruleRenameTable= ruleRenameTable EOF ;
    public final EObject entryRuleRenameTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameTable = null;


        try {
            // InternalTyphonML.g:683:52: (iv_ruleRenameTable= ruleRenameTable EOF )
            // InternalTyphonML.g:684:2: iv_ruleRenameTable= ruleRenameTable EOF
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
    // InternalTyphonML.g:690:1: ruleRenameTable returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:696:2: ( (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:697:2: (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:697:2: (otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:698:3: otherlv_0= 'rename' otherlv_1= 'table' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameTableAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameTableAccess().getTableKeyword_1());
            		
            // InternalTyphonML.g:706:3: ( ( ruleEString ) )
            // InternalTyphonML.g:707:4: ( ruleEString )
            {
            // InternalTyphonML.g:707:4: ( ruleEString )
            // InternalTyphonML.g:708:5: ruleEString
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
            		
            // InternalTyphonML.g:726:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:727:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:727:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:728:5: lv_newName_4_0= ruleEString
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
    // InternalTyphonML.g:749:1: entryRuleDropIndexTable returns [EObject current=null] : iv_ruleDropIndexTable= ruleDropIndexTable EOF ;
    public final EObject entryRuleDropIndexTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexTable = null;


        try {
            // InternalTyphonML.g:749:55: (iv_ruleDropIndexTable= ruleDropIndexTable EOF )
            // InternalTyphonML.g:750:2: iv_ruleDropIndexTable= ruleDropIndexTable EOF
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
    // InternalTyphonML.g:756:1: ruleDropIndexTable returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) ) ;
    public final EObject ruleDropIndexTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:762:2: ( (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:763:2: (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:763:2: (otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) ) )
            // InternalTyphonML.g:764:3: otherlv_0= 'drop' otherlv_1= 'tableindex' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDropIndexTableAccess().getDropKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDropIndexTableAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:772:3: ( ( ruleEString ) )
            // InternalTyphonML.g:773:4: ( ruleEString )
            {
            // InternalTyphonML.g:773:4: ( ruleEString )
            // InternalTyphonML.g:774:5: ruleEString
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
    // InternalTyphonML.g:792:1: entryRuleAddIndexTable returns [EObject current=null] : iv_ruleAddIndexTable= ruleAddIndexTable EOF ;
    public final EObject entryRuleAddIndexTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddIndexTable = null;


        try {
            // InternalTyphonML.g:792:54: (iv_ruleAddIndexTable= ruleAddIndexTable EOF )
            // InternalTyphonML.g:793:2: iv_ruleAddIndexTable= ruleAddIndexTable EOF
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
    // InternalTyphonML.g:799:1: ruleAddIndexTable returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAddIndexTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTyphonML.g:805:2: ( (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalTyphonML.g:806:2: (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalTyphonML.g:806:2: (otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalTyphonML.g:807:3: otherlv_0= 'create' otherlv_1= 'tableindex' ( ( ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAddIndexTableAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddIndexTableAccess().getTableindexKeyword_1());
            		
            // InternalTyphonML.g:815:3: ( ( ruleEString ) )
            // InternalTyphonML.g:816:4: ( ruleEString )
            {
            // InternalTyphonML.g:816:4: ( ruleEString )
            // InternalTyphonML.g:817:5: ruleEString
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
            		
            // InternalTyphonML.g:835:3: ( ( ruleEString ) )
            // InternalTyphonML.g:836:4: ( ruleEString )
            {
            // InternalTyphonML.g:836:4: ( ruleEString )
            // InternalTyphonML.g:837:5: ruleEString
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

            // InternalTyphonML.g:851:3: (otherlv_5= ',' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:852:4: otherlv_5= ',' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddIndexTableAccess().getCommaKeyword_5_0());
                    			
                    // InternalTyphonML.g:856:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:857:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:857:5: ( ruleEString )
                    // InternalTyphonML.g:858:6: ruleEString
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
    // InternalTyphonML.g:881:1: entryRuleChangeAttributeType returns [EObject current=null] : iv_ruleChangeAttributeType= ruleChangeAttributeType EOF ;
    public final EObject entryRuleChangeAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAttributeType = null;


        try {
            // InternalTyphonML.g:881:60: (iv_ruleChangeAttributeType= ruleChangeAttributeType EOF )
            // InternalTyphonML.g:882:2: iv_ruleChangeAttributeType= ruleChangeAttributeType EOF
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
    // InternalTyphonML.g:888:1: ruleChangeAttributeType returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) ) ;
    public final EObject ruleChangeAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:894:2: ( (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:895:2: (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:895:2: (otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) ) )
            // InternalTyphonML.g:896:3: otherlv_0= 'change' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'type' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAttributeTypeAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAttributeTypeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:904:3: ( ( ruleEString ) )
            // InternalTyphonML.g:905:4: ( ruleEString )
            {
            // InternalTyphonML.g:905:4: ( ruleEString )
            // InternalTyphonML.g:906:5: ruleEString
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
            		
            // InternalTyphonML.g:924:3: ( ( ruleEString ) )
            // InternalTyphonML.g:925:4: ( ruleEString )
            {
            // InternalTyphonML.g:925:4: ( ruleEString )
            // InternalTyphonML.g:926:5: ruleEString
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
    // InternalTyphonML.g:944:1: entryRuleMigrateEntity returns [EObject current=null] : iv_ruleMigrateEntity= ruleMigrateEntity EOF ;
    public final EObject entryRuleMigrateEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrateEntity = null;


        try {
            // InternalTyphonML.g:944:54: (iv_ruleMigrateEntity= ruleMigrateEntity EOF )
            // InternalTyphonML.g:945:2: iv_ruleMigrateEntity= ruleMigrateEntity EOF
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
    // InternalTyphonML.g:951:1: ruleMigrateEntity returns [EObject current=null] : (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleMigrateEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTyphonML.g:957:2: ( (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:958:2: (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:958:2: (otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            // InternalTyphonML.g:959:3: otherlv_0= 'migrate' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMigrateEntityAccess().getMigrateKeyword_0());
            		
            // InternalTyphonML.g:963:3: ( ( ruleEString ) )
            // InternalTyphonML.g:964:4: ( ruleEString )
            {
            // InternalTyphonML.g:964:4: ( ruleEString )
            // InternalTyphonML.g:965:5: ruleEString
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
            		
            // InternalTyphonML.g:983:3: ( ( ruleEString ) )
            // InternalTyphonML.g:984:4: ( ruleEString )
            {
            // InternalTyphonML.g:984:4: ( ruleEString )
            // InternalTyphonML.g:985:5: ruleEString
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


    // $ANTLR start "entryRuleSplitEntity"
    // InternalTyphonML.g:1003:1: entryRuleSplitEntity returns [EObject current=null] : iv_ruleSplitEntity= ruleSplitEntity EOF ;
    public final EObject entryRuleSplitEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntity = null;


        try {
            // InternalTyphonML.g:1003:52: (iv_ruleSplitEntity= ruleSplitEntity EOF )
            // InternalTyphonML.g:1004:2: iv_ruleSplitEntity= ruleSplitEntity EOF
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
    // InternalTyphonML.g:1010:1: ruleSplitEntity returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= '{' otherlv_4= 'left' ( (lv_firstNewEntity_5_0= ruleEntity_Impl ) ) otherlv_6= 'right' ( (lv_secondNewEntity_7_0= ruleEntity_Impl ) ) otherlv_8= '}' ) ;
    public final EObject ruleSplitEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_firstNewEntity_5_0 = null;

        EObject lv_secondNewEntity_7_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1016:2: ( (otherlv_0= 'split' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= '{' otherlv_4= 'left' ( (lv_firstNewEntity_5_0= ruleEntity_Impl ) ) otherlv_6= 'right' ( (lv_secondNewEntity_7_0= ruleEntity_Impl ) ) otherlv_8= '}' ) )
            // InternalTyphonML.g:1017:2: (otherlv_0= 'split' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= '{' otherlv_4= 'left' ( (lv_firstNewEntity_5_0= ruleEntity_Impl ) ) otherlv_6= 'right' ( (lv_secondNewEntity_7_0= ruleEntity_Impl ) ) otherlv_8= '}' )
            {
            // InternalTyphonML.g:1017:2: (otherlv_0= 'split' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= '{' otherlv_4= 'left' ( (lv_firstNewEntity_5_0= ruleEntity_Impl ) ) otherlv_6= 'right' ( (lv_secondNewEntity_7_0= ruleEntity_Impl ) ) otherlv_8= '}' )
            // InternalTyphonML.g:1018:3: otherlv_0= 'split' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= '{' otherlv_4= 'left' ( (lv_firstNewEntity_5_0= ruleEntity_Impl ) ) otherlv_6= 'right' ( (lv_secondNewEntity_7_0= ruleEntity_Impl ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitEntityAccess().getSplitKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSplitEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:1026:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1027:4: ( ruleEString )
            {
            // InternalTyphonML.g:1027:4: ( ruleEString )
            // InternalTyphonML.g:1028:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSplitEntityAccess().getEntityToBeSplitEntityCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitEntityAccess().getLeftKeyword_4());
            		
            // InternalTyphonML.g:1050:3: ( (lv_firstNewEntity_5_0= ruleEntity_Impl ) )
            // InternalTyphonML.g:1051:4: (lv_firstNewEntity_5_0= ruleEntity_Impl )
            {
            // InternalTyphonML.g:1051:4: (lv_firstNewEntity_5_0= ruleEntity_Impl )
            // InternalTyphonML.g:1052:5: lv_firstNewEntity_5_0= ruleEntity_Impl
            {

            					newCompositeNode(grammarAccess.getSplitEntityAccess().getFirstNewEntityEntity_ImplParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_firstNewEntity_5_0=ruleEntity_Impl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitEntityRule());
            					}
            					set(
            						current,
            						"firstNewEntity",
            						lv_firstNewEntity_5_0,
            						"it.univaq.disim.typhon.TyphonML.Entity_Impl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getSplitEntityAccess().getRightKeyword_6());
            		
            // InternalTyphonML.g:1073:3: ( (lv_secondNewEntity_7_0= ruleEntity_Impl ) )
            // InternalTyphonML.g:1074:4: (lv_secondNewEntity_7_0= ruleEntity_Impl )
            {
            // InternalTyphonML.g:1074:4: (lv_secondNewEntity_7_0= ruleEntity_Impl )
            // InternalTyphonML.g:1075:5: lv_secondNewEntity_7_0= ruleEntity_Impl
            {

            					newCompositeNode(grammarAccess.getSplitEntityAccess().getSecondNewEntityEntity_ImplParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_secondNewEntity_7_0=ruleEntity_Impl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitEntityRule());
            					}
            					set(
            						current,
            						"secondNewEntity",
            						lv_secondNewEntity_7_0,
            						"it.univaq.disim.typhon.TyphonML.Entity_Impl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMergeEntity"
    // InternalTyphonML.g:1100:1: entryRuleMergeEntity returns [EObject current=null] : iv_ruleMergeEntity= ruleMergeEntity EOF ;
    public final EObject entryRuleMergeEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeEntity = null;


        try {
            // InternalTyphonML.g:1100:52: (iv_ruleMergeEntity= ruleMergeEntity EOF )
            // InternalTyphonML.g:1101:2: iv_ruleMergeEntity= ruleMergeEntity EOF
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
    // InternalTyphonML.g:1107:1: ruleMergeEntity returns [EObject current=null] : (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) ) ;
    public final EObject ruleMergeEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_newEntityName_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1113:2: ( (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1114:2: (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1114:2: (otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) ) )
            // InternalTyphonML.g:1115:3: otherlv_0= 'merge' otherlv_1= 'entities' ( ( ruleEString ) ) ( ( ruleEString ) ) otherlv_4= 'as' ( (lv_newEntityName_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeEntityAccess().getMergeKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMergeEntityAccess().getEntitiesKeyword_1());
            		
            // InternalTyphonML.g:1123:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1124:4: ( ruleEString )
            {
            // InternalTyphonML.g:1124:4: ( ruleEString )
            // InternalTyphonML.g:1125:5: ruleEString
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

            // InternalTyphonML.g:1139:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1140:4: ( ruleEString )
            {
            // InternalTyphonML.g:1140:4: ( ruleEString )
            // InternalTyphonML.g:1141:5: ruleEString
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
            		
            // InternalTyphonML.g:1159:3: ( (lv_newEntityName_5_0= ruleEString ) )
            // InternalTyphonML.g:1160:4: (lv_newEntityName_5_0= ruleEString )
            {
            // InternalTyphonML.g:1160:4: (lv_newEntityName_5_0= ruleEString )
            // InternalTyphonML.g:1161:5: lv_newEntityName_5_0= ruleEString
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
    // InternalTyphonML.g:1182:1: entryRuleRenameAttribute returns [EObject current=null] : iv_ruleRenameAttribute= ruleRenameAttribute EOF ;
    public final EObject entryRuleRenameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameAttribute = null;


        try {
            // InternalTyphonML.g:1182:56: (iv_ruleRenameAttribute= ruleRenameAttribute EOF )
            // InternalTyphonML.g:1183:2: iv_ruleRenameAttribute= ruleRenameAttribute EOF
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
    // InternalTyphonML.g:1189:1: ruleRenameAttribute returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1195:2: ( (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1196:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1196:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1197:3: otherlv_0= 'rename' otherlv_1= 'attribute' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameAttributeAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:1205:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1206:4: ( ruleEString )
            {
            // InternalTyphonML.g:1206:4: ( ruleEString )
            // InternalTyphonML.g:1207:5: ruleEString
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
            		
            // InternalTyphonML.g:1225:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:1226:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:1226:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:1227:5: lv_newName_4_0= ruleEString
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
    // InternalTyphonML.g:1248:1: entryRuleRenameEntity returns [EObject current=null] : iv_ruleRenameEntity= ruleRenameEntity EOF ;
    public final EObject entryRuleRenameEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEntity = null;


        try {
            // InternalTyphonML.g:1248:53: (iv_ruleRenameEntity= ruleRenameEntity EOF )
            // InternalTyphonML.g:1249:2: iv_ruleRenameEntity= ruleRenameEntity EOF
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
    // InternalTyphonML.g:1255:1: ruleRenameEntity returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newEntityName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1261:2: ( (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1262:2: (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1262:2: (otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1263:3: otherlv_0= 'rename' otherlv_1= 'entity' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameEntityAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:1271:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1272:4: ( ruleEString )
            {
            // InternalTyphonML.g:1272:4: ( ruleEString )
            // InternalTyphonML.g:1273:5: ruleEString
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
            		
            // InternalTyphonML.g:1291:3: ( (lv_newEntityName_4_0= ruleEString ) )
            // InternalTyphonML.g:1292:4: (lv_newEntityName_4_0= ruleEString )
            {
            // InternalTyphonML.g:1292:4: (lv_newEntityName_4_0= ruleEString )
            // InternalTyphonML.g:1293:5: lv_newEntityName_4_0= ruleEString
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
    // InternalTyphonML.g:1314:1: entryRuleRenameRelation returns [EObject current=null] : iv_ruleRenameRelation= ruleRenameRelation EOF ;
    public final EObject entryRuleRenameRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameRelation = null;


        try {
            // InternalTyphonML.g:1314:55: (iv_ruleRenameRelation= ruleRenameRelation EOF )
            // InternalTyphonML.g:1315:2: iv_ruleRenameRelation= ruleRenameRelation EOF
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
    // InternalTyphonML.g:1321:1: ruleRenameRelation returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newRelationName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1327:2: ( (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1328:2: (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1328:2: (otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1329:3: otherlv_0= 'rename' otherlv_1= 'relation' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameRelationAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:1337:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1338:4: ( ruleEString )
            {
            // InternalTyphonML.g:1338:4: ( ruleEString )
            // InternalTyphonML.g:1339:5: ruleEString
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
            		
            // InternalTyphonML.g:1357:3: ( (lv_newRelationName_4_0= ruleEString ) )
            // InternalTyphonML.g:1358:4: (lv_newRelationName_4_0= ruleEString )
            {
            // InternalTyphonML.g:1358:4: (lv_newRelationName_4_0= ruleEString )
            // InternalTyphonML.g:1359:5: lv_newRelationName_4_0= ruleEString
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
    // InternalTyphonML.g:1380:1: entryRuleRemoveAttribute returns [EObject current=null] : iv_ruleRemoveAttribute= ruleRemoveAttribute EOF ;
    public final EObject entryRuleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttribute = null;


        try {
            // InternalTyphonML.g:1380:56: (iv_ruleRemoveAttribute= ruleRemoveAttribute EOF )
            // InternalTyphonML.g:1381:2: iv_ruleRemoveAttribute= ruleRemoveAttribute EOF
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
    // InternalTyphonML.g:1387:1: ruleRemoveAttribute returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1393:2: ( (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1394:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1394:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1395:3: otherlv_0= 'remove' otherlv_1= 'attribute' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributeAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:1403:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1404:4: ( ruleEString )
            {
            // InternalTyphonML.g:1404:4: ( ruleEString )
            // InternalTyphonML.g:1405:5: ruleEString
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
    // InternalTyphonML.g:1423:1: entryRuleRemoveEntity returns [EObject current=null] : iv_ruleRemoveEntity= ruleRemoveEntity EOF ;
    public final EObject entryRuleRemoveEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEntity = null;


        try {
            // InternalTyphonML.g:1423:53: (iv_ruleRemoveEntity= ruleRemoveEntity EOF )
            // InternalTyphonML.g:1424:2: iv_ruleRemoveEntity= ruleRemoveEntity EOF
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
    // InternalTyphonML.g:1430:1: ruleRemoveEntity returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1436:2: ( (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1437:2: (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1437:2: (otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1438:3: otherlv_0= 'remove' otherlv_1= 'entity' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveEntityAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:1446:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1447:4: ( ruleEString )
            {
            // InternalTyphonML.g:1447:4: ( ruleEString )
            // InternalTyphonML.g:1448:5: ruleEString
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
    // InternalTyphonML.g:1466:1: entryRuleRemoveRelation returns [EObject current=null] : iv_ruleRemoveRelation= ruleRemoveRelation EOF ;
    public final EObject entryRuleRemoveRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveRelation = null;


        try {
            // InternalTyphonML.g:1466:55: (iv_ruleRemoveRelation= ruleRemoveRelation EOF )
            // InternalTyphonML.g:1467:2: iv_ruleRemoveRelation= ruleRemoveRelation EOF
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
    // InternalTyphonML.g:1473:1: ruleRemoveRelation returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) ) ;
    public final EObject ruleRemoveRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1479:2: ( (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1480:2: (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1480:2: (otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1481:3: otherlv_0= 'remove' otherlv_1= 'relation' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveRelationAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:1489:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1490:4: ( ruleEString )
            {
            // InternalTyphonML.g:1490:4: ( ruleEString )
            // InternalTyphonML.g:1491:5: ruleEString
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
    // InternalTyphonML.g:1509:1: entryRuleChangeRelationContainement returns [EObject current=null] : iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF ;
    public final EObject entryRuleChangeRelationContainement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRelationContainement = null;


        try {
            // InternalTyphonML.g:1509:67: (iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF )
            // InternalTyphonML.g:1510:2: iv_ruleChangeRelationContainement= ruleChangeRelationContainement EOF
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
    // InternalTyphonML.g:1516:1: ruleChangeRelationContainement returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleChangeRelationContainement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newContainment_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1522:2: ( (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) ) )
            // InternalTyphonML.g:1523:2: (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) )
            {
            // InternalTyphonML.g:1523:2: (otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) ) )
            // InternalTyphonML.g:1524:3: otherlv_0= 'change' otherlv_1= 'containment' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newContainment_4_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRelationContainementAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeRelationContainementAccess().getContainmentKeyword_1());
            		
            // InternalTyphonML.g:1532:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1533:4: ( ruleEString )
            {
            // InternalTyphonML.g:1533:4: ( ruleEString )
            // InternalTyphonML.g:1534:5: ruleEString
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

            otherlv_3=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeRelationContainementAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1552:3: ( (lv_newContainment_4_0= ruleEBooleanObject ) )
            // InternalTyphonML.g:1553:4: (lv_newContainment_4_0= ruleEBooleanObject )
            {
            // InternalTyphonML.g:1553:4: (lv_newContainment_4_0= ruleEBooleanObject )
            // InternalTyphonML.g:1554:5: lv_newContainment_4_0= ruleEBooleanObject
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
    // InternalTyphonML.g:1575:1: entryRuleChangeRelationCardinality returns [EObject current=null] : iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF ;
    public final EObject entryRuleChangeRelationCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeRelationCardinality = null;


        try {
            // InternalTyphonML.g:1575:66: (iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF )
            // InternalTyphonML.g:1576:2: iv_ruleChangeRelationCardinality= ruleChangeRelationCardinality EOF
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
    // InternalTyphonML.g:1582:1: ruleChangeRelationCardinality returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) ) ;
    public final EObject ruleChangeRelationCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_newCardinality_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1588:2: ( (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) ) )
            // InternalTyphonML.g:1589:2: (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) )
            {
            // InternalTyphonML.g:1589:2: (otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) ) )
            // InternalTyphonML.g:1590:3: otherlv_0= 'change' otherlv_1= 'cardinality' ( ( ruleEString ) ) otherlv_3= 'as' ( (lv_newCardinality_4_0= ruleCardinality ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeRelationCardinalityAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeRelationCardinalityAccess().getCardinalityKeyword_1());
            		
            // InternalTyphonML.g:1598:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1599:4: ( ruleEString )
            {
            // InternalTyphonML.g:1599:4: ( ruleEString )
            // InternalTyphonML.g:1600:5: ruleEString
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

            otherlv_3=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeRelationCardinalityAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:1618:3: ( (lv_newCardinality_4_0= ruleCardinality ) )
            // InternalTyphonML.g:1619:4: (lv_newCardinality_4_0= ruleCardinality )
            {
            // InternalTyphonML.g:1619:4: (lv_newCardinality_4_0= ruleCardinality )
            // InternalTyphonML.g:1620:5: lv_newCardinality_4_0= ruleCardinality
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
    // InternalTyphonML.g:1641:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:1641:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:1642:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTyphonML.g:1648:1: ruleAttribute returns [EObject current=null] : (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;

        EObject this_AddAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1654:2: ( (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) )
            // InternalTyphonML.g:1655:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            {
            // InternalTyphonML.g:1655:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_STRING) ) {
                    int LA10_4 = input.LA(3);

                    if ( ((LA10_4>=RULE_STRING && LA10_4<=RULE_ID)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_4==74) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_1==RULE_ID) ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==74) ) {
                        alt10=2;
                    }
                    else if ( ((LA10_5>=RULE_STRING && LA10_5<=RULE_ID)) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 74:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTyphonML.g:1656:3: this_Attribute_Impl_0= ruleAttribute_Impl
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
                    // InternalTyphonML.g:1665:3: this_AddAttribute_1= ruleAddAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getAddAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttribute_1=ruleAddAttribute();

                    state._fsp--;


                    			current = this_AddAttribute_1;
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


    // $ANTLR start "entryRuleRelation"
    // InternalTyphonML.g:1677:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:1677:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:1678:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalTyphonML.g:1684:1: ruleRelation returns [EObject current=null] : (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_Impl_0 = null;

        EObject this_AddRelation_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1690:2: ( (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) )
            // InternalTyphonML.g:1691:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            {
            // InternalTyphonML.g:1691:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    int LA11_4 = input.LA(3);

                    if ( ((LA11_4>=RULE_STRING && LA11_4<=RULE_ID)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_4==74) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_1==RULE_ID) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==74) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_5>=RULE_STRING && LA11_5<=RULE_ID)) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 74:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTyphonML.g:1692:3: this_Relation_Impl_0= ruleRelation_Impl
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getRelation_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_Impl_0=ruleRelation_Impl();

                    state._fsp--;


                    			current = this_Relation_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1701:3: this_AddRelation_1= ruleAddRelation
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getAddRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRelation_1=ruleAddRelation();

                    state._fsp--;


                    			current = this_AddRelation_1;
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleDatabase"
    // InternalTyphonML.g:1713:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:1713:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:1714:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalTyphonML.g:1720:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_DocumentDB_1 = null;

        EObject this_KeyValueDB_2 = null;

        EObject this_GraphDB_3 = null;

        EObject this_ColumnDB_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1726:2: ( (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) )
            // InternalTyphonML.g:1727:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            {
            // InternalTyphonML.g:1727:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 63:
                        {
                        alt12=2;
                        }
                        break;
                    case 69:
                        {
                        alt12=5;
                        }
                        break;
                    case 61:
                        {
                        alt12=1;
                        }
                        break;
                    case 66:
                        {
                        alt12=4;
                        }
                        break;
                    case 65:
                        {
                        alt12=3;
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
                    case 65:
                        {
                        alt12=3;
                        }
                        break;
                    case 63:
                        {
                        alt12=2;
                        }
                        break;
                    case 69:
                        {
                        alt12=5;
                        }
                        break;
                    case 61:
                        {
                        alt12=1;
                        }
                        break;
                    case 66:
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
            case 61:
                {
                alt12=1;
                }
                break;
            case 63:
                {
                alt12=2;
                }
                break;
            case 65:
                {
                alt12=3;
                }
                break;
            case 66:
                {
                alt12=4;
                }
                break;
            case 69:
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
                    // InternalTyphonML.g:1728:3: this_RelationalDB_0= ruleRelationalDB
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
                    // InternalTyphonML.g:1737:3: this_DocumentDB_1= ruleDocumentDB
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
                    // InternalTyphonML.g:1746:3: this_KeyValueDB_2= ruleKeyValueDB
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
                    // InternalTyphonML.g:1755:3: this_GraphDB_3= ruleGraphDB
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
                    // InternalTyphonML.g:1764:3: this_ColumnDB_4= ruleColumnDB
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
    // InternalTyphonML.g:1776:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:1776:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:1777:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
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
    // InternalTyphonML.g:1783:1: ruleGraphAttribute returns [EObject current=null] : (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_GraphAttribute_Impl_0 = null;

        EObject this_AddGraphAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1789:2: ( (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) )
            // InternalTyphonML.g:1790:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            {
            // InternalTyphonML.g:1790:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_STRING) ) {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=RULE_STRING && LA13_4<=RULE_ID)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_4==77) ) {
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
                    else if ( (LA13_5==77) ) {
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
            case 77:
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
                    // InternalTyphonML.g:1791:3: this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl
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
                    // InternalTyphonML.g:1800:3: this_AddGraphAttribute_1= ruleAddGraphAttribute
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
    // InternalTyphonML.g:1812:1: entryRuleGraphEdge returns [EObject current=null] : iv_ruleGraphEdge= ruleGraphEdge EOF ;
    public final EObject entryRuleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge = null;


        try {
            // InternalTyphonML.g:1812:50: (iv_ruleGraphEdge= ruleGraphEdge EOF )
            // InternalTyphonML.g:1813:2: iv_ruleGraphEdge= ruleGraphEdge EOF
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
    // InternalTyphonML.g:1819:1: ruleGraphEdge returns [EObject current=null] : (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) ;
    public final EObject ruleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject this_GraphEdge_Impl_0 = null;

        EObject this_AddGraphEdge_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1825:2: ( (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) )
            // InternalTyphonML.g:1826:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            {
            // InternalTyphonML.g:1826:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            int alt14=2;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_STRING) ) {
                    int LA14_4 = input.LA(3);

                    if ( (LA14_4==75) ) {
                        alt14=2;
                    }
                    else if ( (LA14_4==71) ) {
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

                    if ( (LA14_5==75) ) {
                        alt14=2;
                    }
                    else if ( (LA14_5==71) ) {
                        alt14=1;
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
            case 71:
                {
                alt14=1;
                }
                break;
            case 75:
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
                    // InternalTyphonML.g:1827:3: this_GraphEdge_Impl_0= ruleGraphEdge_Impl
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
                    // InternalTyphonML.g:1836:3: this_AddGraphEdge_1= ruleAddGraphEdge
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
    // InternalTyphonML.g:1848:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:1848:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:1849:2: iv_ruleEString= ruleEString EOF
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
    // InternalTyphonML.g:1855:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1861:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:1862:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:1862:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalTyphonML.g:1863:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1871:3: this_ID_1= RULE_ID
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
    // InternalTyphonML.g:1882:1: entryRulePrimitiveDataType_Impl returns [EObject current=null] : iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF ;
    public final EObject entryRulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType_Impl = null;


        try {
            // InternalTyphonML.g:1882:63: (iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF )
            // InternalTyphonML.g:1883:2: iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF
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
    // InternalTyphonML.g:1889:1: rulePrimitiveDataType_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject rulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1895:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1896:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1896:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1897:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalTyphonML.g:1897:3: ()
            // InternalTyphonML.g:1898:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataType_ImplAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1904:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTyphonML.g:1905:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:1909:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:1910:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:1910:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:1911:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimitiveDataType_ImplAccess().getDatatypeKeyword_2());
            		
            // InternalTyphonML.g:1933:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:1934:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:1934:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:1935:5: lv_name_4_0= ruleEString
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
    // InternalTyphonML.g:1956:1: entryRuleDataTypeItem returns [EObject current=null] : iv_ruleDataTypeItem= ruleDataTypeItem EOF ;
    public final EObject entryRuleDataTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeItem = null;


        try {
            // InternalTyphonML.g:1956:53: (iv_ruleDataTypeItem= ruleDataTypeItem EOF )
            // InternalTyphonML.g:1957:2: iv_ruleDataTypeItem= ruleDataTypeItem EOF
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
    // InternalTyphonML.g:1963:1: ruleDataTypeItem returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) ;
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
            // InternalTyphonML.g:1969:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) )
            // InternalTyphonML.g:1970:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            {
            // InternalTyphonML.g:1970:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            // InternalTyphonML.g:1971:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']'
            {
            // InternalTyphonML.g:1971:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTyphonML.g:1972:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataTypeItemAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1976:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1977:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1977:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1978:6: lv_importedNamespace_1_0= ruleEString
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

            // InternalTyphonML.g:1996:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1997:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1997:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1998:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_3=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeItemAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:2019:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2020:4: ( ruleEString )
            {
            // InternalTyphonML.g:2020:4: ( ruleEString )
            // InternalTyphonML.g:2021:5: ruleEString
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
            		
            // InternalTyphonML.g:2039:3: ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) )
            // InternalTyphonML.g:2040:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            {
            // InternalTyphonML.g:2040:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            // InternalTyphonML.g:2041:5: lv_implementation_6_0= ruleDataTypeImplementationPackage
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getImplementationDataTypeImplementationPackageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
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
    // InternalTyphonML.g:2066:1: entryRuleDataTypeImplementationPackage returns [EObject current=null] : iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF ;
    public final EObject entryRuleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeImplementationPackage = null;


        try {
            // InternalTyphonML.g:2066:70: (iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF )
            // InternalTyphonML.g:2067:2: iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF
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
    // InternalTyphonML.g:2073:1: ruleDataTypeImplementationPackage returns [EObject current=null] : ( () ( (lv_location_1_0= ruleEString ) ) ) ;
    public final EObject ruleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_location_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2079:2: ( ( () ( (lv_location_1_0= ruleEString ) ) ) )
            // InternalTyphonML.g:2080:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:2080:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            // InternalTyphonML.g:2081:3: () ( (lv_location_1_0= ruleEString ) )
            {
            // InternalTyphonML.g:2081:3: ()
            // InternalTyphonML.g:2082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeImplementationPackageAccess().getDataTypeImplementationPackageAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2088:3: ( (lv_location_1_0= ruleEString ) )
            // InternalTyphonML.g:2089:4: (lv_location_1_0= ruleEString )
            {
            // InternalTyphonML.g:2089:4: (lv_location_1_0= ruleEString )
            // InternalTyphonML.g:2090:5: lv_location_1_0= ruleEString
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
    // InternalTyphonML.g:2111:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalTyphonML.g:2111:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalTyphonML.g:2112:2: iv_ruleFreeText= ruleFreeText EOF
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
    // InternalTyphonML.g:2118:1: ruleFreeText returns [EObject current=null] : ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? ) ;
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
            // InternalTyphonML.g:2124:2: ( ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? ) )
            // InternalTyphonML.g:2125:2: ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? )
            {
            // InternalTyphonML.g:2125:2: ( () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )? )
            // InternalTyphonML.g:2126:3: () otherlv_1= 'freetext' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )?
            {
            // InternalTyphonML.g:2126:3: ()
            // InternalTyphonML.g:2127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeTextAccess().getFreeTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFreeTextAccess().getFreetextKeyword_1());
            		
            // InternalTyphonML.g:2137:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2138:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2138:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2139:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFreeTextAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalTyphonML.g:2160:3: ( ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=84 && LA19_0<=101)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTyphonML.g:2161:4: ( (lv_tasks_4_0= ruleNlpTask ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )* otherlv_7= ']'
                    {
                    // InternalTyphonML.g:2161:4: ( (lv_tasks_4_0= ruleNlpTask ) )
                    // InternalTyphonML.g:2162:5: (lv_tasks_4_0= ruleNlpTask )
                    {
                    // InternalTyphonML.g:2162:5: (lv_tasks_4_0= ruleNlpTask )
                    // InternalTyphonML.g:2163:6: lv_tasks_4_0= ruleNlpTask
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

                    // InternalTyphonML.g:2180:4: (otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalTyphonML.g:2181:5: otherlv_5= ',' ( (lv_tasks_6_0= ruleNlpTask ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_34); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFreeTextAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalTyphonML.g:2185:5: ( (lv_tasks_6_0= ruleNlpTask ) )
                    	    // InternalTyphonML.g:2186:6: (lv_tasks_6_0= ruleNlpTask )
                    	    {
                    	    // InternalTyphonML.g:2186:6: (lv_tasks_6_0= ruleNlpTask )
                    	    // InternalTyphonML.g:2187:7: lv_tasks_6_0= ruleNlpTask
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
    // InternalTyphonML.g:2214:1: entryRuleNlpTask returns [EObject current=null] : iv_ruleNlpTask= ruleNlpTask EOF ;
    public final EObject entryRuleNlpTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNlpTask = null;


        try {
            // InternalTyphonML.g:2214:48: (iv_ruleNlpTask= ruleNlpTask EOF )
            // InternalTyphonML.g:2215:2: iv_ruleNlpTask= ruleNlpTask EOF
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
    // InternalTyphonML.g:2221:1: ruleNlpTask returns [EObject current=null] : ( (lv_type_0_0= ruleNlpTaskType ) ) ;
    public final EObject ruleNlpTask() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2227:2: ( ( (lv_type_0_0= ruleNlpTaskType ) ) )
            // InternalTyphonML.g:2228:2: ( (lv_type_0_0= ruleNlpTaskType ) )
            {
            // InternalTyphonML.g:2228:2: ( (lv_type_0_0= ruleNlpTaskType ) )
            // InternalTyphonML.g:2229:3: (lv_type_0_0= ruleNlpTaskType )
            {
            // InternalTyphonML.g:2229:3: (lv_type_0_0= ruleNlpTaskType )
            // InternalTyphonML.g:2230:4: lv_type_0_0= ruleNlpTaskType
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
    // InternalTyphonML.g:2250:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:2250:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:2251:2: iv_ruleCustomDataType= ruleCustomDataType EOF
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
    // InternalTyphonML.g:2257:1: ruleCustomDataType returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:2263:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2264:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2264:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2265:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2265:3: ()
            // InternalTyphonML.g:2266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2272:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTyphonML.g:2273:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2277:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2278:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2278:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2279:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            otherlv_3=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getCustomdatatypeKeyword_2());
            		
            // InternalTyphonML.g:2301:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2302:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2302:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2303:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2324:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:2325:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomDataTypeAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2333:4: ( (lv_elements_8_0= ruleDataTypeItem ) )
                    // InternalTyphonML.g:2334:5: (lv_elements_8_0= ruleDataTypeItem )
                    {
                    // InternalTyphonML.g:2334:5: (lv_elements_8_0= ruleDataTypeItem )
                    // InternalTyphonML.g:2335:6: lv_elements_8_0= ruleDataTypeItem
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

                    // InternalTyphonML.g:2352:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalTyphonML.g:2353:5: otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_37); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCustomDataTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2357:5: ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    // InternalTyphonML.g:2358:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    {
                    	    // InternalTyphonML.g:2358:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    // InternalTyphonML.g:2359:7: lv_elements_10_0= ruleDataTypeItem
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
    // InternalTyphonML.g:2390:1: entryRuleEntity_Impl returns [EObject current=null] : iv_ruleEntity_Impl= ruleEntity_Impl EOF ;
    public final EObject entryRuleEntity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Impl = null;


        try {
            // InternalTyphonML.g:2390:52: (iv_ruleEntity_Impl= ruleEntity_Impl EOF )
            // InternalTyphonML.g:2391:2: iv_ruleEntity_Impl= ruleEntity_Impl EOF
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
    // InternalTyphonML.g:2397:1: ruleEntity_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2403:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2404:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2404:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}' )
            // InternalTyphonML.g:2405:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2405:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:2406:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntity_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2410:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2411:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2411:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2412:6: lv_importedNamespace_1_0= ruleEString
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
            		
            // InternalTyphonML.g:2434:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:2435:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:2435:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:2436:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:2457:3: ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalTyphonML.g:2458:4: ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )*
                    {
                    // InternalTyphonML.g:2458:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalTyphonML.g:2459:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:2459:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalTyphonML.g:2460:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalTyphonML.g:2477:4: ( (lv_attributes_6_0= ruleAttribute ) )*
                    loop24:
                    do {
                        int alt24=2;
                        alt24 = dfa24.predict(input);
                        switch (alt24) {
                    	case 1 :
                    	    // InternalTyphonML.g:2478:5: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:2478:5: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalTyphonML.g:2479:6: lv_attributes_6_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
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

            // InternalTyphonML.g:2497:3: ( ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTyphonML.g:2498:4: ( (lv_fretextAttributes_7_0= ruleFreeText ) ) ( (lv_fretextAttributes_8_0= ruleFreeText ) )*
                    {
                    // InternalTyphonML.g:2498:4: ( (lv_fretextAttributes_7_0= ruleFreeText ) )
                    // InternalTyphonML.g:2499:5: (lv_fretextAttributes_7_0= ruleFreeText )
                    {
                    // InternalTyphonML.g:2499:5: (lv_fretextAttributes_7_0= ruleFreeText )
                    // InternalTyphonML.g:2500:6: lv_fretextAttributes_7_0= ruleFreeText
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getFretextAttributesFreeTextParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalTyphonML.g:2517:4: ( (lv_fretextAttributes_8_0= ruleFreeText ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==44) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalTyphonML.g:2518:5: (lv_fretextAttributes_8_0= ruleFreeText )
                    	    {
                    	    // InternalTyphonML.g:2518:5: (lv_fretextAttributes_8_0= ruleFreeText )
                    	    // InternalTyphonML.g:2519:6: lv_fretextAttributes_8_0= ruleFreeText
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getFretextAttributesFreeTextParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
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

            // InternalTyphonML.g:2537:3: ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||LA29_0==41||LA29_0==74) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTyphonML.g:2538:4: ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )*
                    {
                    // InternalTyphonML.g:2538:4: ( (lv_relations_9_0= ruleRelation ) )
                    // InternalTyphonML.g:2539:5: (lv_relations_9_0= ruleRelation )
                    {
                    // InternalTyphonML.g:2539:5: (lv_relations_9_0= ruleRelation )
                    // InternalTyphonML.g:2540:6: lv_relations_9_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalTyphonML.g:2557:4: ( (lv_relations_10_0= ruleRelation ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==41||LA28_0==74) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalTyphonML.g:2558:5: (lv_relations_10_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:2558:5: (lv_relations_10_0= ruleRelation )
                    	    // InternalTyphonML.g:2559:6: lv_relations_10_0= ruleRelation
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
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
    // InternalTyphonML.g:2585:1: entryRuleRelation_Impl returns [EObject current=null] : iv_ruleRelation_Impl= ruleRelation_Impl EOF ;
    public final EObject entryRuleRelation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation_Impl = null;


        try {
            // InternalTyphonML.g:2585:54: (iv_ruleRelation_Impl= ruleRelation_Impl EOF )
            // InternalTyphonML.g:2586:2: iv_ruleRelation_Impl= ruleRelation_Impl EOF
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
    // InternalTyphonML.g:2592:1: ruleRelation_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) ;
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
            // InternalTyphonML.g:2598:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) )
            // InternalTyphonML.g:2599:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            {
            // InternalTyphonML.g:2599:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            // InternalTyphonML.g:2600:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            {
            // InternalTyphonML.g:2600:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTyphonML.g:2601:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelation_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2605:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2606:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2606:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2607:6: lv_importedNamespace_1_0= ruleEString
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

            // InternalTyphonML.g:2625:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2626:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2626:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2627:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalTyphonML.g:2644:3: ( (lv_isContainment_3_0= ':' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTyphonML.g:2645:4: (lv_isContainment_3_0= ':' )
                    {
                    // InternalTyphonML.g:2645:4: (lv_isContainment_3_0= ':' )
                    // InternalTyphonML.g:2646:5: lv_isContainment_3_0= ':'
                    {
                    lv_isContainment_3_0=(Token)match(input,43,FOLLOW_41); 

                    					newLeafNode(lv_isContainment_3_0, grammarAccess.getRelation_ImplAccess().getIsContainmentColonKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelation_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRelation_ImplAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTyphonML.g:2662:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2663:4: ( ruleEString )
            {
            // InternalTyphonML.g:2663:4: ( ruleEString )
            // InternalTyphonML.g:2664:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getTypeEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2678:3: (otherlv_6= '.' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTyphonML.g:2679:4: otherlv_6= '.' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelation_ImplAccess().getFullStopKeyword_5_0());
                    			
                    // InternalTyphonML.g:2683:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2684:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2684:5: ( ruleEString )
                    // InternalTyphonML.g:2685:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getOppositeRelationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2700:3: (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTyphonML.g:2701:4: otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelation_ImplAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalTyphonML.g:2705:4: ( (lv_cardinality_9_0= ruleCardinality ) )
                    // InternalTyphonML.g:2706:5: (lv_cardinality_9_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:2706:5: (lv_cardinality_9_0= ruleCardinality )
                    // InternalTyphonML.g:2707:6: lv_cardinality_9_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getCardinalityCardinalityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
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
    // InternalTyphonML.g:2733:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalTyphonML.g:2733:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalTyphonML.g:2734:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalTyphonML.g:2740:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTyphonML.g:2746:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTyphonML.g:2747:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTyphonML.g:2747:2: (kw= 'true' | kw= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            else if ( (LA34_0==50) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalTyphonML.g:2748:3: kw= 'true'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:2754:3: kw= 'false'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalTyphonML.g:2763:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:2763:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:2764:2: iv_ruleTable= ruleTable EOF
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
    // InternalTyphonML.g:2770:1: ruleTable returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2776:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2777:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2777:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            // InternalTyphonML.g:2778:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2778:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTyphonML.g:2779:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getTableAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2783:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2784:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2784:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2785:6: lv_importedNamespace_1_0= ruleEString
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
            		
            // InternalTyphonML.g:2811:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2812:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2812:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2813:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_5=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:2834:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2835:4: ( ruleEString )
            {
            // InternalTyphonML.g:2835:4: ( ruleEString )
            // InternalTyphonML.g:2836:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2850:3: (otherlv_7= 'db' ( ( ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTyphonML.g:2851:4: otherlv_7= 'db' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDbKeyword_6_0());
                    			
                    // InternalTyphonML.g:2855:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2856:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2856:5: ( ruleEString )
                    // InternalTyphonML.g:2857:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableAccess().getDbDatabaseCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2872:3: ( (lv_indexSpec_9_0= ruleIndexSpec ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41||LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTyphonML.g:2873:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:2873:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    // InternalTyphonML.g:2874:5: lv_indexSpec_9_0= ruleIndexSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_46);
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

            // InternalTyphonML.g:2891:3: ( (lv_idSpec_10_0= ruleIdSpec ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTyphonML.g:2892:4: (lv_idSpec_10_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:2892:4: (lv_idSpec_10_0= ruleIdSpec )
                    // InternalTyphonML.g:2893:5: lv_idSpec_10_0= ruleIdSpec
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
    // InternalTyphonML.g:2918:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalTyphonML.g:2918:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalTyphonML.g:2919:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalTyphonML.g:2925:1: ruleCollection returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2931:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:2932:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:2932:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:2933:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:2933:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTyphonML.g:2934:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2938:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2939:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2939:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2940:6: lv_importedNamespace_1_0= ruleEString
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

            // InternalTyphonML.g:2958:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2959:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2959:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2960:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_3=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:2981:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2982:4: ( ruleEString )
            {
            // InternalTyphonML.g:2982:4: ( ruleEString )
            // InternalTyphonML.g:2983:5: ruleEString
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
    // InternalTyphonML.g:3001:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:3001:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:3002:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
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
    // InternalTyphonML.g:3008:1: ruleKeyValueElement returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3014:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' ) )
            // InternalTyphonML.g:3015:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalTyphonML.g:3015:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}' )
            // InternalTyphonML.g:3016:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_key_4_0= ruleEString ) ) otherlv_5= '->' otherlv_6= '(' ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= ')' otherlv_11= '}'
            {
            // InternalTyphonML.g:3016:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTyphonML.g:3017:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getKeyValueElementAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3021:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3022:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3022:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3023:6: lv_importedNamespace_1_0= ruleEString
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

            // InternalTyphonML.g:3041:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3042:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3042:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3043:5: lv_name_2_0= ruleEString
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
            		
            // InternalTyphonML.g:3064:3: ( (lv_key_4_0= ruleEString ) )
            // InternalTyphonML.g:3065:4: (lv_key_4_0= ruleEString )
            {
            // InternalTyphonML.g:3065:4: (lv_key_4_0= ruleEString )
            // InternalTyphonML.g:3066:5: lv_key_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_5=(Token)match(input,47,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            otherlv_6=(Token)match(input,52,FOLLOW_48); 

            			newLeafNode(otherlv_6, grammarAccess.getKeyValueElementAccess().getLeftParenthesisKeyword_5());
            		
            // InternalTyphonML.g:3091:3: ( ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTyphonML.g:3092:4: ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalTyphonML.g:3092:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3093:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3093:5: ( ruleEString )
                    // InternalTyphonML.g:3094:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyValueElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesAttributeCrossReference_6_0_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3108:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==13) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalTyphonML.g:3109:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getKeyValueElementAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalTyphonML.g:3113:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3114:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3114:6: ( ruleEString )
                    	    // InternalTyphonML.g:3115:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeyValueElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesAttributeCrossReference_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,53,FOLLOW_14); 

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
    // InternalTyphonML.g:3143:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // InternalTyphonML.g:3143:50: (iv_ruleGraphNode= ruleGraphNode EOF )
            // InternalTyphonML.g:3144:2: iv_ruleGraphNode= ruleGraphNode EOF
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
    // InternalTyphonML.g:3150:1: ruleGraphNode returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3156:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3157:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3157:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3158:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '!' ( ( ruleEString ) ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3158:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTyphonML.g:3159:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getGraphNodeAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3163:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3164:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3164:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3165:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

            otherlv_2=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphNodeAccess().getNodeKeyword_1());
            		
            // InternalTyphonML.g:3187:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3188:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3188:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3189:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_4=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphNodeAccess().getExclamationMarkKeyword_3());
            		
            // InternalTyphonML.g:3210:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3211:4: ( ruleEString )
            {
            // InternalTyphonML.g:3211:4: ( ruleEString )
            // InternalTyphonML.g:3212:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getEntityEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_52);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:3226:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTyphonML.g:3227:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleGraphAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_53); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalTyphonML.g:3231:4: ( (lv_attributes_7_0= ruleGraphAttribute ) )
                    // InternalTyphonML.g:3232:5: (lv_attributes_7_0= ruleGraphAttribute )
                    {
                    // InternalTyphonML.g:3232:5: (lv_attributes_7_0= ruleGraphAttribute )
                    // InternalTyphonML.g:3233:6: lv_attributes_7_0= ruleGraphAttribute
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

                    // InternalTyphonML.g:3250:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==13) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalTyphonML.g:3251:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getGraphNodeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalTyphonML.g:3255:5: ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    	    // InternalTyphonML.g:3256:6: (lv_attributes_9_0= ruleGraphAttribute )
                    	    {
                    	    // InternalTyphonML.g:3256:6: (lv_attributes_9_0= ruleGraphAttribute )
                    	    // InternalTyphonML.g:3257:7: lv_attributes_9_0= ruleGraphAttribute
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
                    	    break loop44;
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
    // InternalTyphonML.g:3288:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTyphonML.g:3288:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTyphonML.g:3289:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalTyphonML.g:3295:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
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
            // InternalTyphonML.g:3301:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:3302:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:3302:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:3303:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:3303:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTyphonML.g:3304:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3308:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3309:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3309:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3310:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_54);
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

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalTyphonML.g:3332:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3333:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3333:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3334:5: lv_name_3_0= ruleEString
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
            		
            // InternalTyphonML.g:3359:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3360:4: ( ruleEString )
            {
            // InternalTyphonML.g:3360:4: ( ruleEString )
            // InternalTyphonML.g:3361:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColumnAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_55);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:3375:3: (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTyphonML.g:3376:4: otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_47); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,52,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:3384:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3385:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3385:5: ( ruleEString )
                    // InternalTyphonML.g:3386:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3400:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==13) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalTyphonML.g:3401:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3405:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3406:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3406:6: ( ruleEString )
                    	    // InternalTyphonML.g:3407:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,53,FOLLOW_14); 

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
    // InternalTyphonML.g:3435:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:3435:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:3436:2: iv_ruleIndexSpec= ruleIndexSpec EOF
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
    // InternalTyphonML.g:3442:1: ruleIndexSpec returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:3448:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:3449:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:3449:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTyphonML.g:3450:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:3450:3: ()
            // InternalTyphonML.g:3451:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3457:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTyphonML.g:3458:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3462:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3463:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3463:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3464:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_56);
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

            otherlv_3=(Token)match(input,58,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getIndexKeyword_2());
            		
            // InternalTyphonML.g:3486:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3487:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3487:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3488:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_57); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3509:3: (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTyphonML.g:3510:4: otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_47); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexSpecAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,52,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTyphonML.g:3518:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3519:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3519:5: ( ruleEString )
                    // InternalTyphonML.g:3520:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3534:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==13) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalTyphonML.g:3535:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getIndexSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3539:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3540:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3540:6: ( ruleEString )
                    	    // InternalTyphonML.g:3541:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,53,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3561:3: (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTyphonML.g:3562:4: otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_47); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexSpecAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,52,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:3570:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3571:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3571:5: ( ruleEString )
                    // InternalTyphonML.g:3572:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3586:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalTyphonML.g:3587:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getIndexSpecAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3591:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3592:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3592:6: ( ruleEString )
                    	    // InternalTyphonML.g:3593:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
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

                    otherlv_17=(Token)match(input,53,FOLLOW_14); 

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
    // InternalTyphonML.g:3621:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:3621:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:3622:2: iv_ruleIdSpec= ruleIdSpec EOF
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
    // InternalTyphonML.g:3628:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:3634:2: ( ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalTyphonML.g:3635:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalTyphonML.g:3635:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalTyphonML.g:3636:3: () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalTyphonML.g:3636:3: ()
            // InternalTyphonML.g:3637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdSpecKeyword_1());
            		
            // InternalTyphonML.g:3647:3: (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTyphonML.g:3648:4: otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTyphonML.g:3652:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3653:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3653:5: ( ruleEString )
                    // InternalTyphonML.g:3654:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3668:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==13) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalTyphonML.g:3669:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTyphonML.g:3673:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3674:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3674:6: ( ruleEString )
                    	    // InternalTyphonML.g:3675:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIdSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_49);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,53,FOLLOW_2); 

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
    // InternalTyphonML.g:3699:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:3699:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:3700:2: iv_ruleRelationalDB= ruleRelationalDB EOF
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
    // InternalTyphonML.g:3706:1: ruleRelationalDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3712:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3713:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3713:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3714:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3714:3: ()
            // InternalTyphonML.g:3715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3721:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTyphonML.g:3722:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3726:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3727:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3727:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3728:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            otherlv_3=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_2());
            		
            // InternalTyphonML.g:3750:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3751:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3751:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3752:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_61); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3773:3: (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTyphonML.g:3774:4: otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationalDBAccess().getTablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_62); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3782:4: ( (lv_tables_8_0= ruleTable ) )
                    // InternalTyphonML.g:3783:5: (lv_tables_8_0= ruleTable )
                    {
                    // InternalTyphonML.g:3783:5: (lv_tables_8_0= ruleTable )
                    // InternalTyphonML.g:3784:6: lv_tables_8_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_63);
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

                    // InternalTyphonML.g:3801:4: ( (lv_tables_9_0= ruleTable ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==23||LA57_0==41) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTyphonML.g:3802:5: (lv_tables_9_0= ruleTable )
                    	    {
                    	    // InternalTyphonML.g:3802:5: (lv_tables_9_0= ruleTable )
                    	    // InternalTyphonML.g:3803:6: lv_tables_9_0= ruleTable
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop57;
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
    // InternalTyphonML.g:3833:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:3833:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:3834:2: iv_ruleDocumentDB= ruleDocumentDB EOF
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
    // InternalTyphonML.g:3840:1: ruleDocumentDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:3846:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:3847:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:3847:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:3848:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:3848:3: ()
            // InternalTyphonML.g:3849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3855:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==41) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTyphonML.g:3856:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3860:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3861:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3861:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3862:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            otherlv_3=(Token)match(input,63,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_2());
            		
            // InternalTyphonML.g:3884:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3885:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3885:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3886:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_65); 

            			newLeafNode(otherlv_5, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3907:3: (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTyphonML.g:3908:4: otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentDBAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3916:4: ( (lv_collections_8_0= ruleCollection ) )
                    // InternalTyphonML.g:3917:5: (lv_collections_8_0= ruleCollection )
                    {
                    // InternalTyphonML.g:3917:5: (lv_collections_8_0= ruleCollection )
                    // InternalTyphonML.g:3918:6: lv_collections_8_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_66);
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

                    // InternalTyphonML.g:3935:4: ( (lv_collections_9_0= ruleCollection ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_ID)||LA60_0==41) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTyphonML.g:3936:5: (lv_collections_9_0= ruleCollection )
                    	    {
                    	    // InternalTyphonML.g:3936:5: (lv_collections_9_0= ruleCollection )
                    	    // InternalTyphonML.g:3937:6: lv_collections_9_0= ruleCollection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_66);
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
                    	    break loop60;
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
    // InternalTyphonML.g:3967:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:3967:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:3968:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
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
    // InternalTyphonML.g:3974:1: ruleKeyValueDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:3980:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:3981:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:3981:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:3982:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:3982:3: ()
            // InternalTyphonML.g:3983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3989:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==41) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTyphonML.g:3990:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3994:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3995:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3995:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3996:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            otherlv_3=(Token)match(input,65,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_2());
            		
            // InternalTyphonML.g:4018:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4019:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4019:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4020:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4041:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==46) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTyphonML.g:4042:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeyValueDBAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4050:4: ( (lv_elements_8_0= ruleKeyValueElement ) )
                    // InternalTyphonML.g:4051:5: (lv_elements_8_0= ruleKeyValueElement )
                    {
                    // InternalTyphonML.g:4051:5: (lv_elements_8_0= ruleKeyValueElement )
                    // InternalTyphonML.g:4052:6: lv_elements_8_0= ruleKeyValueElement
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

                    // InternalTyphonML.g:4069:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==13) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalTyphonML.g:4070:5: otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_37); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getKeyValueDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4074:5: ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    // InternalTyphonML.g:4075:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    {
                    	    // InternalTyphonML.g:4075:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    // InternalTyphonML.g:4076:7: lv_elements_10_0= ruleKeyValueElement
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
                    	    break loop63;
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
    // InternalTyphonML.g:4107:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:4107:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:4108:2: iv_ruleGraphDB= ruleGraphDB EOF
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
    // InternalTyphonML.g:4114:1: ruleGraphDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:4120:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:4121:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:4121:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:4122:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:4122:3: ()
            // InternalTyphonML.g:4123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4129:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==41) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTyphonML.g:4130:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4134:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4135:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4135:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4136:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            otherlv_3=(Token)match(input,66,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getGraphdbKeyword_2());
            		
            // InternalTyphonML.g:4158:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4159:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4159:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4160:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_69); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4181:3: (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==67) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTyphonML.g:4182:4: otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getNodesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_70); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4190:4: ( (lv_nodes_8_0= ruleGraphNode ) )
                    // InternalTyphonML.g:4191:5: (lv_nodes_8_0= ruleGraphNode )
                    {
                    // InternalTyphonML.g:4191:5: (lv_nodes_8_0= ruleGraphNode )
                    // InternalTyphonML.g:4192:6: lv_nodes_8_0= ruleGraphNode
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

                    // InternalTyphonML.g:4209:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==13) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalTyphonML.g:4210:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_70); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGraphDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4214:5: ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    // InternalTyphonML.g:4215:6: (lv_nodes_10_0= ruleGraphNode )
                    	    {
                    	    // InternalTyphonML.g:4215:6: (lv_nodes_10_0= ruleGraphNode )
                    	    // InternalTyphonML.g:4216:7: lv_nodes_10_0= ruleGraphNode
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_71); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:4239:3: (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==68) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTyphonML.g:4240:4: otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,68,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphDBAccess().getEdgesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_72); 

                    				newLeafNode(otherlv_13, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:4248:4: ( (lv_edges_14_0= ruleGraphEdge ) )
                    // InternalTyphonML.g:4249:5: (lv_edges_14_0= ruleGraphEdge )
                    {
                    // InternalTyphonML.g:4249:5: (lv_edges_14_0= ruleGraphEdge )
                    // InternalTyphonML.g:4250:6: lv_edges_14_0= ruleGraphEdge
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

                    // InternalTyphonML.g:4267:4: (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==13) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalTyphonML.g:4268:5: otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_72); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGraphDBAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:4272:5: ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    // InternalTyphonML.g:4273:6: (lv_edges_16_0= ruleGraphEdge )
                    	    {
                    	    // InternalTyphonML.g:4273:6: (lv_edges_16_0= ruleGraphEdge )
                    	    // InternalTyphonML.g:4274:7: lv_edges_16_0= ruleGraphEdge
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
                    	    break loop68;
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
    // InternalTyphonML.g:4305:1: entryRuleColumnDB returns [EObject current=null] : iv_ruleColumnDB= ruleColumnDB EOF ;
    public final EObject entryRuleColumnDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDB = null;


        try {
            // InternalTyphonML.g:4305:49: (iv_ruleColumnDB= ruleColumnDB EOF )
            // InternalTyphonML.g:4306:2: iv_ruleColumnDB= ruleColumnDB EOF
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
    // InternalTyphonML.g:4312:1: ruleColumnDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:4318:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:4319:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:4319:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:4320:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:4320:3: ()
            // InternalTyphonML.g:4321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDBAccess().getColumnDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4327:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==41) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTyphonML.g:4328:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4332:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4333:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4333:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4334:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            otherlv_3=(Token)match(input,69,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDBAccess().getColumndbKeyword_2());
            		
            // InternalTyphonML.g:4356:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4357:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4357:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4358:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_74); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4379:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==70) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTyphonML.g:4380:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,70,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnDBAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_75); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4388:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalTyphonML.g:4389:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalTyphonML.g:4389:5: (lv_columns_8_0= ruleColumn )
                    // InternalTyphonML.g:4390:6: lv_columns_8_0= ruleColumn
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

                    // InternalTyphonML.g:4407:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==13) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalTyphonML.g:4408:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_75); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getColumnDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4412:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalTyphonML.g:4413:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalTyphonML.g:4413:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalTyphonML.g:4414:7: lv_columns_10_0= ruleColumn
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
                    	    break loop71;
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
    // InternalTyphonML.g:4445:1: entryRuleGraphEdge_Impl returns [EObject current=null] : iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF ;
    public final EObject entryRuleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge_Impl = null;


        try {
            // InternalTyphonML.g:4445:55: (iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF )
            // InternalTyphonML.g:4446:2: iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF
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
    // InternalTyphonML.g:4452:1: ruleGraphEdge_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:4458:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:4459:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:4459:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:4460:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:4460:3: ()
            // InternalTyphonML.g:4461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4467:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==41) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalTyphonML.g:4468:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4472:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4473:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4473:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4474:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_76);
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

            otherlv_3=(Token)match(input,71,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdge_ImplAccess().getEdgeKeyword_2());
            		
            // InternalTyphonML.g:4496:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4497:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4497:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4498:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_77); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4519:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==72) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTyphonML.g:4520:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdge_ImplAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:4524:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4525:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4525:5: ( ruleEString )
                    // InternalTyphonML.g:4526:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4541:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==30) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalTyphonML.g:4542:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphEdge_ImplAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:4546:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4547:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4547:5: ( ruleEString )
                    // InternalTyphonML.g:4548:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4563:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==73) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTyphonML.g:4564:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphEdge_ImplAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:4572:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:4573:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:4573:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:4574:6: lv_labels_12_0= ruleGraphEdgeLabel
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

                    // InternalTyphonML.g:4591:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==13) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalTyphonML.g:4592:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_37); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getGraphEdge_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:4596:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:4597:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:4597:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:4598:7: lv_labels_14_0= ruleGraphEdgeLabel
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
                    	    break loop76;
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
    // InternalTyphonML.g:4629:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:4629:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:4630:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
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
    // InternalTyphonML.g:4636:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4642:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4643:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4643:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4644:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4644:3: ()
            // InternalTyphonML.g:4645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4651:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==41) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTyphonML.g:4652:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4656:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4657:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4657:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4658:6: lv_importedNamespace_2_0= ruleEString
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

            // InternalTyphonML.g:4676:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4677:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4677:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4678:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:4699:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4700:4: ( ruleEString )
            {
            // InternalTyphonML.g:4700:4: ( ruleEString )
            // InternalTyphonML.g:4701:5: ruleEString
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
    // InternalTyphonML.g:4719:1: entryRuleAddAttribute returns [EObject current=null] : iv_ruleAddAttribute= ruleAddAttribute EOF ;
    public final EObject entryRuleAddAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttribute = null;


        try {
            // InternalTyphonML.g:4719:53: (iv_ruleAddAttribute= ruleAddAttribute EOF )
            // InternalTyphonML.g:4720:2: iv_ruleAddAttribute= ruleAddAttribute EOF
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
    // InternalTyphonML.g:4726:1: ruleAddAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) ) ;
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
            // InternalTyphonML.g:4732:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4733:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4733:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4734:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'add' otherlv_4= 'attribute' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) otherlv_8= 'to' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4734:3: ()
            // InternalTyphonML.g:4735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAttributeAccess().getAddAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4741:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==41) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTyphonML.g:4742:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4746:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4747:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4747:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4748:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            otherlv_3=(Token)match(input,74,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributeAccess().getAddKeyword_2());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAddAttributeAccess().getAttributeKeyword_3());
            		
            // InternalTyphonML.g:4774:3: ( (lv_name_5_0= ruleEString ) )
            // InternalTyphonML.g:4775:4: (lv_name_5_0= ruleEString )
            {
            // InternalTyphonML.g:4775:4: (lv_name_5_0= ruleEString )
            // InternalTyphonML.g:4776:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_6=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getAddAttributeAccess().getColonKeyword_5());
            		
            // InternalTyphonML.g:4797:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4798:4: ( ruleEString )
            {
            // InternalTyphonML.g:4798:4: ( ruleEString )
            // InternalTyphonML.g:4799:5: ruleEString
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
            		
            // InternalTyphonML.g:4817:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4818:4: ( ruleEString )
            {
            // InternalTyphonML.g:4818:4: ( ruleEString )
            // InternalTyphonML.g:4819:5: ruleEString
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
    // InternalTyphonML.g:4837:1: entryRuleAddGraphEdge returns [EObject current=null] : iv_ruleAddGraphEdge= ruleAddGraphEdge EOF ;
    public final EObject entryRuleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphEdge = null;


        try {
            // InternalTyphonML.g:4837:53: (iv_ruleAddGraphEdge= ruleAddGraphEdge EOF )
            // InternalTyphonML.g:4838:2: iv_ruleAddGraphEdge= ruleAddGraphEdge EOF
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
    // InternalTyphonML.g:4844:1: ruleAddGraphEdge returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:4850:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:4851:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:4851:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:4852:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:4852:3: ()
            // InternalTyphonML.g:4853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4859:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==41) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTyphonML.g:4860:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4864:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4865:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4865:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4866:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_81);
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

            otherlv_3=(Token)match(input,75,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeKeyword_2());
            		
            // InternalTyphonML.g:4888:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4889:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4889:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4890:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_77); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4911:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==72) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTyphonML.g:4912:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphEdgeAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:4916:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4917:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4917:5: ( ruleEString )
                    // InternalTyphonML.g:4918:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4933:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==30) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTyphonML.g:4934:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddGraphEdgeAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:4938:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4939:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4939:5: ( ruleEString )
                    // InternalTyphonML.g:4940:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4955:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==73) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalTyphonML.g:4956:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddGraphEdgeAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:4964:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:4965:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:4965:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:4966:6: lv_labels_12_0= ruleGraphEdgeLabel
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

                    // InternalTyphonML.g:4983:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==13) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalTyphonML.g:4984:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_37); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAddGraphEdgeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:4988:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:4989:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:4989:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:4990:7: lv_labels_14_0= ruleGraphEdgeLabel
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
                    	    break loop83;
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
    // InternalTyphonML.g:5021:1: entryRuleGraphAttribute_Impl returns [EObject current=null] : iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF ;
    public final EObject entryRuleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute_Impl = null;


        try {
            // InternalTyphonML.g:5021:60: (iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF )
            // InternalTyphonML.g:5022:2: iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF
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
    // InternalTyphonML.g:5028:1: ruleGraphAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) ;
    public final EObject ruleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5034:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:5035:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:5035:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            // InternalTyphonML.g:5036:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:5036:3: ()
            // InternalTyphonML.g:5037:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:5043:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==41) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalTyphonML.g:5044:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:5048:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:5049:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:5049:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:5050:6: lv_importedNamespace_2_0= ruleEString
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

            // InternalTyphonML.g:5068:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:5069:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:5069:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:5070:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_82);
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

            otherlv_4=(Token)match(input,76,FOLLOW_83); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAttribute_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalTyphonML.g:5091:3: ( ( ruleEString ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_STRING && LA86_0<=RULE_ID)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTyphonML.g:5092:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:5092:4: ( ruleEString )
                    // InternalTyphonML.g:5093:5: ruleEString
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
    // InternalTyphonML.g:5111:1: entryRuleAddGraphAttribute returns [EObject current=null] : iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF ;
    public final EObject entryRuleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphAttribute = null;


        try {
            // InternalTyphonML.g:5111:58: (iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF )
            // InternalTyphonML.g:5112:2: iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF
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
    // InternalTyphonML.g:5118:1: ruleAddGraphAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalTyphonML.g:5124:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:5125:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:5125:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:5126:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:5126:3: ()
            // InternalTyphonML.g:5127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:5133:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==41) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalTyphonML.g:5134:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:5138:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:5139:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:5139:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:5140:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_84);
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

            otherlv_3=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeKeyword_2());
            		
            // InternalTyphonML.g:5162:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5163:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5163:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5164:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_85); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphAttributeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:5185:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==78) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTyphonML.g:5186:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:5190:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5191:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5191:5: ( ruleEString )
                    // InternalTyphonML.g:5192:6: ruleEString
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
    // InternalTyphonML.g:5215:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalTyphonML.g:5215:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalTyphonML.g:5216:2: iv_ruleAddEntity= ruleAddEntity EOF
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
    // InternalTyphonML.g:5222:1: ruleAddEntity returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:5228:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:5229:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:5229:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:5230:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'entity' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:5230:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==41) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalTyphonML.g:5231:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddEntityAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:5235:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:5236:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:5236:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:5237:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            otherlv_2=(Token)match(input,74,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAddEntityAccess().getAddKeyword_1());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddEntityAccess().getEntityKeyword_2());
            		
            // InternalTyphonML.g:5263:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5264:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5264:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5265:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,20,FOLLOW_86); 

            			newLeafNode(otherlv_5, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:5286:3: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==57) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalTyphonML.g:5287:4: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attributes_8_0= ruleAddAttribute ) ) (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddEntityAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_87); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:5295:4: ( (lv_attributes_8_0= ruleAddAttribute ) )
                    // InternalTyphonML.g:5296:5: (lv_attributes_8_0= ruleAddAttribute )
                    {
                    // InternalTyphonML.g:5296:5: (lv_attributes_8_0= ruleAddAttribute )
                    // InternalTyphonML.g:5297:6: lv_attributes_8_0= ruleAddAttribute
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAddAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:5314:4: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==13) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalTyphonML.g:5315:5: otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FOLLOW_88); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAddEntityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:5319:5: ( (lv_attributes_10_0= ruleAttribute ) )
                    	    // InternalTyphonML.g:5320:6: (lv_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:5320:6: (lv_attributes_10_0= ruleAttribute )
                    	    // InternalTyphonML.g:5321:7: lv_attributes_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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

                    otherlv_11=(Token)match(input,21,FOLLOW_89); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:5344:3: (otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==79) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalTyphonML.g:5345:4: otherlv_12= 'relations' otherlv_13= '{' ( (lv_relations_14_0= ruleAddRelation ) ) (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,79,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddEntityAccess().getRelationsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_87); 

                    				newLeafNode(otherlv_13, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:5353:4: ( (lv_relations_14_0= ruleAddRelation ) )
                    // InternalTyphonML.g:5354:5: (lv_relations_14_0= ruleAddRelation )
                    {
                    // InternalTyphonML.g:5354:5: (lv_relations_14_0= ruleAddRelation )
                    // InternalTyphonML.g:5355:6: lv_relations_14_0= ruleAddRelation
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsAddRelationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalTyphonML.g:5372:4: (otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==13) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalTyphonML.g:5373:5: otherlv_15= ',' ( (lv_relations_16_0= ruleRelation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_88); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAddEntityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:5377:5: ( (lv_relations_16_0= ruleRelation ) )
                    	    // InternalTyphonML.g:5378:6: (lv_relations_16_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:5378:6: (lv_relations_16_0= ruleRelation )
                    	    // InternalTyphonML.g:5379:7: lv_relations_16_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relations_16_0=ruleRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relations",
                    	    								lv_relations_16_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Relation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_6_4());
                    			

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
    // InternalTyphonML.g:5410:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalTyphonML.g:5410:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalTyphonML.g:5411:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalTyphonML.g:5417:1: ruleAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:5423:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:5424:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:5424:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:5425:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:5425:3: ()
            // InternalTyphonML.g:5426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:5432:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==41) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalTyphonML.g:5433:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:5437:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:5438:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:5438:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:5439:6: lv_importedNamespace_2_0= ruleEString
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

            // InternalTyphonML.g:5457:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:5458:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:5458:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:5459:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAttribute_ImplAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:5480:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5481:4: ( ruleEString )
            {
            // InternalTyphonML.g:5481:4: ( ruleEString )
            // InternalTyphonML.g:5482:5: ruleEString
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
    // InternalTyphonML.g:5500:1: entryRuleAddRelation returns [EObject current=null] : iv_ruleAddRelation= ruleAddRelation EOF ;
    public final EObject entryRuleAddRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRelation = null;


        try {
            // InternalTyphonML.g:5500:52: (iv_ruleAddRelation= ruleAddRelation EOF )
            // InternalTyphonML.g:5501:2: iv_ruleAddRelation= ruleAddRelation EOF
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
    // InternalTyphonML.g:5507:1: ruleAddRelation returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? ) ;
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
            // InternalTyphonML.g:5513:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? ) )
            // InternalTyphonML.g:5514:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? )
            {
            // InternalTyphonML.g:5514:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )? )
            // InternalTyphonML.g:5515:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'add' otherlv_3= 'relation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ( (lv_isContainment_7_0= ':' ) )? otherlv_8= '->' ( ( ruleEString ) ) (otherlv_10= '.' ( ( ruleEString ) ) )? (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )?
            {
            // InternalTyphonML.g:5515:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==41) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalTyphonML.g:5516:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddRelationAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:5520:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:5521:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:5521:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:5522:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            otherlv_2=(Token)match(input,74,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getAddRelationAccess().getAddKeyword_1());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddRelationAccess().getRelationKeyword_2());
            		
            // InternalTyphonML.g:5548:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:5549:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:5549:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:5550:5: lv_name_4_0= ruleEString
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
            		
            // InternalTyphonML.g:5571:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5572:4: ( ruleEString )
            {
            // InternalTyphonML.g:5572:4: ( ruleEString )
            // InternalTyphonML.g:5573:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getOwnerEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5587:3: ( (lv_isContainment_7_0= ':' ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==43) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalTyphonML.g:5588:4: (lv_isContainment_7_0= ':' )
                    {
                    // InternalTyphonML.g:5588:4: (lv_isContainment_7_0= ':' )
                    // InternalTyphonML.g:5589:5: lv_isContainment_7_0= ':'
                    {
                    lv_isContainment_7_0=(Token)match(input,43,FOLLOW_41); 

                    					newLeafNode(lv_isContainment_7_0, grammarAccess.getAddRelationAccess().getIsContainmentColonKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getAddRelationAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalTyphonML.g:5605:3: ( ( ruleEString ) )
            // InternalTyphonML.g:5606:4: ( ruleEString )
            {
            // InternalTyphonML.g:5606:4: ( ruleEString )
            // InternalTyphonML.g:5607:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getTypeEntityCrossReference_8_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:5621:3: (otherlv_10= '.' ( ( ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==48) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalTyphonML.g:5622:4: otherlv_10= '.' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,48,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddRelationAccess().getFullStopKeyword_9_0());
                    			
                    // InternalTyphonML.g:5626:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:5627:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:5627:5: ( ruleEString )
                    // InternalTyphonML.g:5628:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getOppositeRelationCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:5643:3: (otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==12) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalTyphonML.g:5644:4: otherlv_12= '[' ( (lv_cardinality_13_0= ruleCardinality ) ) otherlv_14= ']'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddRelationAccess().getLeftSquareBracketKeyword_10_0());
                    			
                    // InternalTyphonML.g:5648:4: ( (lv_cardinality_13_0= ruleCardinality ) )
                    // InternalTyphonML.g:5649:5: (lv_cardinality_13_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:5649:5: (lv_cardinality_13_0= ruleCardinality )
                    // InternalTyphonML.g:5650:6: lv_cardinality_13_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getCardinalityCardinalityEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_32);
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
    // InternalTyphonML.g:5676:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:5682:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) )
            // InternalTyphonML.g:5683:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            {
            // InternalTyphonML.g:5683:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt99=1;
                }
                break;
            case 81:
                {
                alt99=2;
                }
                break;
            case 82:
                {
                alt99=3;
                }
                break;
            case 83:
                {
                alt99=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalTyphonML.g:5684:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalTyphonML.g:5684:3: (enumLiteral_0= '0..1' )
                    // InternalTyphonML.g:5685:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:5692:3: (enumLiteral_1= '1' )
                    {
                    // InternalTyphonML.g:5692:3: (enumLiteral_1= '1' )
                    // InternalTyphonML.g:5693:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:5700:3: (enumLiteral_2= '0..*' )
                    {
                    // InternalTyphonML.g:5700:3: (enumLiteral_2= '0..*' )
                    // InternalTyphonML.g:5701:4: enumLiteral_2= '0..*'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:5708:3: (enumLiteral_3= '*' )
                    {
                    // InternalTyphonML.g:5708:3: (enumLiteral_3= '*' )
                    // InternalTyphonML.g:5709:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

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
    // InternalTyphonML.g:5719:1: ruleNlpTaskType returns [Enumerator current=null] : ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) ) ;
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
            // InternalTyphonML.g:5725:2: ( ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) ) )
            // InternalTyphonML.g:5726:2: ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) )
            {
            // InternalTyphonML.g:5726:2: ( (enumLiteral_0= 'ParagraphSegmentation' ) | (enumLiteral_1= 'SentenceSegmentation' ) | (enumLiteral_2= 'Tokenisation' ) | (enumLiteral_3= 'PhraseExtractor' ) | (enumLiteral_4= 'NGramExtractor' ) | (enumLiteral_5= 'POSTagging' ) | (enumLiteral_6= 'Lemmatisation' ) | (enumLiteral_7= 'Stemming' ) | (enumLiteral_8= 'DependencyParsing' ) | (enumLiteral_9= 'Chunking' ) | (enumLiteral_10= 'SentimentAnalysis' ) | (enumLiteral_11= 'TextClassification' ) | (enumLiteral_12= 'TopicModelling' ) | (enumLiteral_13= 'TermExtraction' ) | (enumLiteral_14= 'NamedEntityRecognition' ) | (enumLiteral_15= 'RelationExtraction' ) | (enumLiteral_16= 'EventExtraction' ) | (enumLiteral_17= 'CoreferenceResolution' ) )
            int alt100=18;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt100=1;
                }
                break;
            case 85:
                {
                alt100=2;
                }
                break;
            case 86:
                {
                alt100=3;
                }
                break;
            case 87:
                {
                alt100=4;
                }
                break;
            case 88:
                {
                alt100=5;
                }
                break;
            case 89:
                {
                alt100=6;
                }
                break;
            case 90:
                {
                alt100=7;
                }
                break;
            case 91:
                {
                alt100=8;
                }
                break;
            case 92:
                {
                alt100=9;
                }
                break;
            case 93:
                {
                alt100=10;
                }
                break;
            case 94:
                {
                alt100=11;
                }
                break;
            case 95:
                {
                alt100=12;
                }
                break;
            case 96:
                {
                alt100=13;
                }
                break;
            case 97:
                {
                alt100=14;
                }
                break;
            case 98:
                {
                alt100=15;
                }
                break;
            case 99:
                {
                alt100=16;
                }
                break;
            case 100:
                {
                alt100=17;
                }
                break;
            case 101:
                {
                alt100=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalTyphonML.g:5727:3: (enumLiteral_0= 'ParagraphSegmentation' )
                    {
                    // InternalTyphonML.g:5727:3: (enumLiteral_0= 'ParagraphSegmentation' )
                    // InternalTyphonML.g:5728:4: enumLiteral_0= 'ParagraphSegmentation'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getParagraphSegmentationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNlpTaskTypeAccess().getParagraphSegmentationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:5735:3: (enumLiteral_1= 'SentenceSegmentation' )
                    {
                    // InternalTyphonML.g:5735:3: (enumLiteral_1= 'SentenceSegmentation' )
                    // InternalTyphonML.g:5736:4: enumLiteral_1= 'SentenceSegmentation'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getSentenceSegmentationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNlpTaskTypeAccess().getSentenceSegmentationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:5743:3: (enumLiteral_2= 'Tokenisation' )
                    {
                    // InternalTyphonML.g:5743:3: (enumLiteral_2= 'Tokenisation' )
                    // InternalTyphonML.g:5744:4: enumLiteral_2= 'Tokenisation'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTokenisationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNlpTaskTypeAccess().getTokenisationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:5751:3: (enumLiteral_3= 'PhraseExtractor' )
                    {
                    // InternalTyphonML.g:5751:3: (enumLiteral_3= 'PhraseExtractor' )
                    // InternalTyphonML.g:5752:4: enumLiteral_3= 'PhraseExtractor'
                    {
                    enumLiteral_3=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getPhraseExtractorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNlpTaskTypeAccess().getPhraseExtractorEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:5759:3: (enumLiteral_4= 'NGramExtractor' )
                    {
                    // InternalTyphonML.g:5759:3: (enumLiteral_4= 'NGramExtractor' )
                    // InternalTyphonML.g:5760:4: enumLiteral_4= 'NGramExtractor'
                    {
                    enumLiteral_4=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getNGramExtractorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNlpTaskTypeAccess().getNGramExtractorEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:5767:3: (enumLiteral_5= 'POSTagging' )
                    {
                    // InternalTyphonML.g:5767:3: (enumLiteral_5= 'POSTagging' )
                    // InternalTyphonML.g:5768:4: enumLiteral_5= 'POSTagging'
                    {
                    enumLiteral_5=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getPOSTaggingEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNlpTaskTypeAccess().getPOSTaggingEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:5775:3: (enumLiteral_6= 'Lemmatisation' )
                    {
                    // InternalTyphonML.g:5775:3: (enumLiteral_6= 'Lemmatisation' )
                    // InternalTyphonML.g:5776:4: enumLiteral_6= 'Lemmatisation'
                    {
                    enumLiteral_6=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getLemmatisationEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNlpTaskTypeAccess().getLemmatisationEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:5783:3: (enumLiteral_7= 'Stemming' )
                    {
                    // InternalTyphonML.g:5783:3: (enumLiteral_7= 'Stemming' )
                    // InternalTyphonML.g:5784:4: enumLiteral_7= 'Stemming'
                    {
                    enumLiteral_7=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getStemmingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getNlpTaskTypeAccess().getStemmingEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:5791:3: (enumLiteral_8= 'DependencyParsing' )
                    {
                    // InternalTyphonML.g:5791:3: (enumLiteral_8= 'DependencyParsing' )
                    // InternalTyphonML.g:5792:4: enumLiteral_8= 'DependencyParsing'
                    {
                    enumLiteral_8=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getDependencyParsingEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getNlpTaskTypeAccess().getDependencyParsingEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTyphonML.g:5799:3: (enumLiteral_9= 'Chunking' )
                    {
                    // InternalTyphonML.g:5799:3: (enumLiteral_9= 'Chunking' )
                    // InternalTyphonML.g:5800:4: enumLiteral_9= 'Chunking'
                    {
                    enumLiteral_9=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getChunkingEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getNlpTaskTypeAccess().getChunkingEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTyphonML.g:5807:3: (enumLiteral_10= 'SentimentAnalysis' )
                    {
                    // InternalTyphonML.g:5807:3: (enumLiteral_10= 'SentimentAnalysis' )
                    // InternalTyphonML.g:5808:4: enumLiteral_10= 'SentimentAnalysis'
                    {
                    enumLiteral_10=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getSentimentAnalysisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getNlpTaskTypeAccess().getSentimentAnalysisEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTyphonML.g:5815:3: (enumLiteral_11= 'TextClassification' )
                    {
                    // InternalTyphonML.g:5815:3: (enumLiteral_11= 'TextClassification' )
                    // InternalTyphonML.g:5816:4: enumLiteral_11= 'TextClassification'
                    {
                    enumLiteral_11=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTextClassificationEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getNlpTaskTypeAccess().getTextClassificationEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalTyphonML.g:5823:3: (enumLiteral_12= 'TopicModelling' )
                    {
                    // InternalTyphonML.g:5823:3: (enumLiteral_12= 'TopicModelling' )
                    // InternalTyphonML.g:5824:4: enumLiteral_12= 'TopicModelling'
                    {
                    enumLiteral_12=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTopicModellingEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getNlpTaskTypeAccess().getTopicModellingEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalTyphonML.g:5831:3: (enumLiteral_13= 'TermExtraction' )
                    {
                    // InternalTyphonML.g:5831:3: (enumLiteral_13= 'TermExtraction' )
                    // InternalTyphonML.g:5832:4: enumLiteral_13= 'TermExtraction'
                    {
                    enumLiteral_13=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getTermExtractionEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getNlpTaskTypeAccess().getTermExtractionEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalTyphonML.g:5839:3: (enumLiteral_14= 'NamedEntityRecognition' )
                    {
                    // InternalTyphonML.g:5839:3: (enumLiteral_14= 'NamedEntityRecognition' )
                    // InternalTyphonML.g:5840:4: enumLiteral_14= 'NamedEntityRecognition'
                    {
                    enumLiteral_14=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getNamedEntityRecognitionEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getNlpTaskTypeAccess().getNamedEntityRecognitionEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalTyphonML.g:5847:3: (enumLiteral_15= 'RelationExtraction' )
                    {
                    // InternalTyphonML.g:5847:3: (enumLiteral_15= 'RelationExtraction' )
                    // InternalTyphonML.g:5848:4: enumLiteral_15= 'RelationExtraction'
                    {
                    enumLiteral_15=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getRelationExtractionEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getNlpTaskTypeAccess().getRelationExtractionEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalTyphonML.g:5855:3: (enumLiteral_16= 'EventExtraction' )
                    {
                    // InternalTyphonML.g:5855:3: (enumLiteral_16= 'EventExtraction' )
                    // InternalTyphonML.g:5856:4: enumLiteral_16= 'EventExtraction'
                    {
                    enumLiteral_16=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getNlpTaskTypeAccess().getEventExtractionEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getNlpTaskTypeAccess().getEventExtractionEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalTyphonML.g:5863:3: (enumLiteral_17= 'CoreferenceResolution' )
                    {
                    // InternalTyphonML.g:5863:3: (enumLiteral_17= 'CoreferenceResolution' )
                    // InternalTyphonML.g:5864:4: enumLiteral_17= 'CoreferenceResolution'
                    {
                    enumLiteral_17=(Token)match(input,101,FOLLOW_2); 

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
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\1\17\1\4\2\33\1\20\3\uffff\1\33\4\uffff\2\112\16\uffff";
    static final String dfa_3s = "\1\112\1\5\3\45\3\uffff\1\50\4\uffff\2\112\16\uffff";
    static final String dfa_4s = "\5\uffff\1\4\1\5\1\6\1\uffff\1\20\1\21\1\23\1\24\2\uffff\1\7\1\10\1\1\1\14\1\2\1\13\1\12\1\11\1\22\1\3\1\25\1\17\1\15\1\16";
    static final String dfa_5s = "\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\2\uffff\1\13\3\uffff\1\14\1\uffff\1\12\1\11\1\10\2\uffff\1\5\1\uffff\1\6\3\uffff\1\7\2\uffff\1\3\2\uffff\1\1\40\uffff\1\2",
            "\1\15\1\16",
            "\1\17\4\uffff\1\21\4\uffff\1\20",
            "\1\24\4\uffff\1\23\4\uffff\1\22",
            "\1\31\6\uffff\1\27\3\uffff\1\26\4\uffff\1\30\4\uffff\1\25",
            "",
            "",
            "",
            "\1\32\13\uffff\1\33\1\34",
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
            return "246:2: (this_AddEntity_0= ruleAddEntity | this_RemoveEntity_1= ruleRemoveEntity | this_RenameEntity_2= ruleRenameEntity | this_MigrateEntity_3= ruleMigrateEntity | this_SplitEntity_4= ruleSplitEntity | this_MergeEntity_5= ruleMergeEntity | this_AddAttribute_6= ruleAddAttribute | this_AddRelation_7= ruleAddRelation | this_RenameAttribute_8= ruleRenameAttribute | this_RenameRelation_9= ruleRenameRelation | this_RemoveAttribute_10= ruleRemoveAttribute | this_RemoveRelation_11= ruleRemoveRelation | this_ChangeRelationContainement_12= ruleChangeRelationContainement | this_ChangeRelationCardinality_13= ruleChangeRelationCardinality | this_ChangeAttributeType_14= ruleChangeAttributeType | this_AddIndexTable_15= ruleAddIndexTable | this_DropIndexTable_16= ruleDropIndexTable | this_RenameTable_17= ruleRenameTable | this_AddAttributesToIndex_18= ruleAddAttributesToIndex | this_RemoveAttributesToIndex_19= ruleRemoveAttributesToIndex | this_RenameCollection_20= ruleRenameCollection )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\4\2\53\1\33\1\uffff\3\4\1\uffff";
    static final String dfa_9s = "\1\112\1\5\2\57\1\45\1\uffff\2\112\1\57\1\uffff";
    static final String dfa_10s = "\5\uffff\1\2\3\uffff\1\1";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\17\uffff\1\5\23\uffff\1\1\2\uffff\1\5\35\uffff\1\4",
            "\1\6\1\7",
            "\1\10\3\uffff\1\5",
            "\1\10\3\uffff\1\5",
            "\1\11\11\uffff\1\5",
            "",
            "\1\2\1\3\104\uffff\1\4",
            "\1\2\1\3\104\uffff\1\4",
            "\2\11\51\uffff\1\5",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2457:3: ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )?";
        }
    }
    static final String dfa_13s = "\1\4\1\uffff\1\4\2\53\1\33\3\4\1\uffff";
    static final String dfa_14s = "\1\112\1\uffff\1\5\2\57\1\45\2\112\1\57\1\uffff";
    static final String dfa_15s = "\1\uffff\1\2\7\uffff\1\1";
    static final String[] dfa_16s = {
            "\1\3\1\4\17\uffff\1\1\23\uffff\1\2\2\uffff\1\1\35\uffff\1\5",
            "",
            "\1\6\1\7",
            "\1\10\3\uffff\1\1",
            "\1\10\3\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\3\1\4\104\uffff\1\5",
            "\1\3\1\4\104\uffff\1\5",
            "\2\11\51\uffff\1\1",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "()* loopback of 2477:4: ( (lv_attributes_6_0= ruleAttribute ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xA000260100000802L,0x0000000000000026L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xA000020000000802L,0x0000000000000026L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000248A7448000L,0x0000000000000400L});
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xA000260500000800L,0x0000000000000026L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xA000260100200800L,0x0000000000000026L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000003FFFF00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFF00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000120000200030L,0x0000000000000400L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000200030L,0x0000000000000400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000001002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1408020000200000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1400020000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000020000000030L,0x0000000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0A00000000200000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000020000200030L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000018L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000880L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000040L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0100020000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000040200000L,0x0000000000000300L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000040200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000200000L,0x0000000000004000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0200000000200000L,0x0000000000008000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000020000000030L,0x0000000000000400L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000200000L,0x0000000000008000L});

}