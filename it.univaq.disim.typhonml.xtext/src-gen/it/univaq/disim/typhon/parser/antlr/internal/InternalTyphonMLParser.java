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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'changeOperators'", "'['", "']'", "'rename'", "'attribute'", "'as'", "'Entity'", "'Relation'", "'remove'", "'importedNamespace'", "'datatype'", "':'", "'FreeText'", "'customdatatype'", "'{'", "'elements'", "','", "'}'", "'entity'", "'identifer'", "'genericList'", "'->'", "'.'", "'('", "')'", "'true'", "'false'", "'table'", "'db'", "'values'", "'node'", "'attributes'", "'column'", "'index'", "'references'", "'idSpec'", "'relationaldb'", "'tables'", "'documentdb'", "'collections'", "'keyvaluedb'", "'graphdb'", "'nodes'", "'edges'", "'columndb'", "'columns'", "'edge'", "'from'", "'to'", "'labels'", "'AddAttribute'", "'AddGraphEdge'", "'='", "'AddGraphAttribute'", "'value'", "'AddEntity'", "'relations'", "'AddRelation'", "'0..1'", "'1'", "'0..*'", "'*'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalTyphonML.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) )* otherlv_6= ']' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dataTypes_1_0 = null;

        EObject lv_databases_2_0 = null;

        EObject lv_changeOperators_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:78:2: ( ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) )* otherlv_6= ']' ) )
            // InternalTyphonML.g:79:2: ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) )* otherlv_6= ']' )
            {
            // InternalTyphonML.g:79:2: ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) )* otherlv_6= ']' )
            // InternalTyphonML.g:80:3: () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* otherlv_3= 'changeOperators' otherlv_4= '[' ( (lv_changeOperators_5_0= ruleChangeOperator ) )* otherlv_6= ']'
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

                if ( (LA1_0==20) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_STRING) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==21||(LA1_4>=23 && LA1_4<=24)||LA1_4==29) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_1==RULE_ID) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==21||(LA1_5>=23 && LA1_5<=24)||LA1_5==29) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==21||(LA1_0>=23 && LA1_0<=24)||LA1_0==29) ) {
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

                if ( (LA2_0==20||LA2_0==47||LA2_0==49||(LA2_0>=51 && LA2_0<=52)||LA2_0==55) ) {
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

            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getChangeOperatorsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalTyphonML.g:133:3: ( (lv_changeOperators_5_0= ruleChangeOperator ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||(LA3_0>=19 && LA3_0<=20)||LA3_0==61||LA3_0==66||LA3_0==68) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTyphonML.g:134:4: (lv_changeOperators_5_0= ruleChangeOperator )
            	    {
            	    // InternalTyphonML.g:134:4: (lv_changeOperators_5_0= ruleChangeOperator )
            	    // InternalTyphonML.g:135:5: lv_changeOperators_5_0= ruleChangeOperator
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getChangeOperatorsChangeOperatorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalTyphonML.g:160:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTyphonML.g:160:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTyphonML.g:161:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalTyphonML.g:167:1: ruleDataType returns [EObject current=null] : (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_FreeText_1= ruleFreeText | this_CustomDataType_2= ruleCustomDataType | this_Entity_Impl_3= ruleEntity_Impl ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveDataType_Impl_0 = null;

        EObject this_FreeText_1 = null;

        EObject this_CustomDataType_2 = null;

        EObject this_Entity_Impl_3 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:173:2: ( (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_FreeText_1= ruleFreeText | this_CustomDataType_2= ruleCustomDataType | this_Entity_Impl_3= ruleEntity_Impl ) )
            // InternalTyphonML.g:174:2: (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_FreeText_1= ruleFreeText | this_CustomDataType_2= ruleCustomDataType | this_Entity_Impl_3= ruleEntity_Impl )
            {
            // InternalTyphonML.g:174:2: (this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl | this_FreeText_1= ruleFreeText | this_CustomDataType_2= ruleCustomDataType | this_Entity_Impl_3= ruleEntity_Impl )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        alt4=2;
                        }
                        break;
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case 24:
                        {
                        alt4=3;
                        }
                        break;
                    case 29:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }

                }
                else if ( (LA4_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 23:
                        {
                        alt4=2;
                        }
                        break;
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case 24:
                        {
                        alt4=3;
                        }
                        break;
                    case 29:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTyphonML.g:175:3: this_PrimitiveDataType_Impl_0= rulePrimitiveDataType_Impl
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
                    // InternalTyphonML.g:184:3: this_FreeText_1= ruleFreeText
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getFreeTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FreeText_1=ruleFreeText();

                    state._fsp--;


                    			current = this_FreeText_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:193:3: this_CustomDataType_2= ruleCustomDataType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getCustomDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomDataType_2=ruleCustomDataType();

                    state._fsp--;


                    			current = this_CustomDataType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:202:3: this_Entity_Impl_3= ruleEntity_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEntity_ImplParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_Impl_3=ruleEntity_Impl();

                    state._fsp--;


                    			current = this_Entity_Impl_3;
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
    // InternalTyphonML.g:214:1: entryRuleChangeOperator returns [EObject current=null] : iv_ruleChangeOperator= ruleChangeOperator EOF ;
    public final EObject entryRuleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeOperator = null;


        try {
            // InternalTyphonML.g:214:55: (iv_ruleChangeOperator= ruleChangeOperator EOF )
            // InternalTyphonML.g:215:2: iv_ruleChangeOperator= ruleChangeOperator EOF
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
    // InternalTyphonML.g:221:1: ruleChangeOperator returns [EObject current=null] : (this_AddAttribute_0= ruleAddAttribute | this_AddEntity_1= ruleAddEntity | this_AddRelation_2= ruleAddRelation | this_RenameAttribute_3= ruleRenameAttribute | this_RenameEntity_4= ruleRenameEntity | this_RenameRelation_5= ruleRenameRelation | this_RemoveAttribute_6= ruleRemoveAttribute | this_RemoveEntity_7= ruleRemoveEntity | this_RemoveRelation_8= ruleRemoveRelation ) ;
    public final EObject ruleChangeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AddAttribute_0 = null;

        EObject this_AddEntity_1 = null;

        EObject this_AddRelation_2 = null;

        EObject this_RenameAttribute_3 = null;

        EObject this_RenameEntity_4 = null;

        EObject this_RenameRelation_5 = null;

        EObject this_RemoveAttribute_6 = null;

        EObject this_RemoveEntity_7 = null;

        EObject this_RemoveRelation_8 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:227:2: ( (this_AddAttribute_0= ruleAddAttribute | this_AddEntity_1= ruleAddEntity | this_AddRelation_2= ruleAddRelation | this_RenameAttribute_3= ruleRenameAttribute | this_RenameEntity_4= ruleRenameEntity | this_RenameRelation_5= ruleRenameRelation | this_RemoveAttribute_6= ruleRemoveAttribute | this_RemoveEntity_7= ruleRemoveEntity | this_RemoveRelation_8= ruleRemoveRelation ) )
            // InternalTyphonML.g:228:2: (this_AddAttribute_0= ruleAddAttribute | this_AddEntity_1= ruleAddEntity | this_AddRelation_2= ruleAddRelation | this_RenameAttribute_3= ruleRenameAttribute | this_RenameEntity_4= ruleRenameEntity | this_RenameRelation_5= ruleRenameRelation | this_RemoveAttribute_6= ruleRemoveAttribute | this_RemoveEntity_7= ruleRemoveEntity | this_RemoveRelation_8= ruleRemoveRelation )
            {
            // InternalTyphonML.g:228:2: (this_AddAttribute_0= ruleAddAttribute | this_AddEntity_1= ruleAddEntity | this_AddRelation_2= ruleAddRelation | this_RenameAttribute_3= ruleRenameAttribute | this_RenameEntity_4= ruleRenameEntity | this_RenameRelation_5= ruleRenameRelation | this_RemoveAttribute_6= ruleRemoveAttribute | this_RemoveEntity_7= ruleRemoveEntity | this_RemoveRelation_8= ruleRemoveRelation )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalTyphonML.g:229:3: this_AddAttribute_0= ruleAddAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddAttribute_0=ruleAddAttribute();

                    state._fsp--;


                    			current = this_AddAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:238:3: this_AddEntity_1= ruleAddEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddEntity_1=ruleAddEntity();

                    state._fsp--;


                    			current = this_AddEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:247:3: this_AddRelation_2= ruleAddRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getAddRelationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRelation_2=ruleAddRelation();

                    state._fsp--;


                    			current = this_AddRelation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:256:3: this_RenameAttribute_3= ruleRenameAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameAttribute_3=ruleRenameAttribute();

                    state._fsp--;


                    			current = this_RenameAttribute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:265:3: this_RenameEntity_4= ruleRenameEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameEntityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameEntity_4=ruleRenameEntity();

                    state._fsp--;


                    			current = this_RenameEntity_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalTyphonML.g:274:3: this_RenameRelation_5= ruleRenameRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRenameRelationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameRelation_5=ruleRenameRelation();

                    state._fsp--;


                    			current = this_RenameRelation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalTyphonML.g:283:3: this_RemoveAttribute_6= ruleRemoveAttribute
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveAttributeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveAttribute_6=ruleRemoveAttribute();

                    state._fsp--;


                    			current = this_RemoveAttribute_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalTyphonML.g:292:3: this_RemoveEntity_7= ruleRemoveEntity
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveEntityParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveEntity_7=ruleRemoveEntity();

                    state._fsp--;


                    			current = this_RemoveEntity_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalTyphonML.g:301:3: this_RemoveRelation_8= ruleRemoveRelation
                    {

                    			newCompositeNode(grammarAccess.getChangeOperatorAccess().getRemoveRelationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveRelation_8=ruleRemoveRelation();

                    state._fsp--;


                    			current = this_RemoveRelation_8;
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


    // $ANTLR start "entryRuleRenameAttribute"
    // InternalTyphonML.g:313:1: entryRuleRenameAttribute returns [EObject current=null] : iv_ruleRenameAttribute= ruleRenameAttribute EOF ;
    public final EObject entryRuleRenameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameAttribute = null;


        try {
            // InternalTyphonML.g:313:56: (iv_ruleRenameAttribute= ruleRenameAttribute EOF )
            // InternalTyphonML.g:314:2: iv_ruleRenameAttribute= ruleRenameAttribute EOF
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
    // InternalTyphonML.g:320:1: ruleRenameAttribute returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:326:2: ( (otherlv_0= 'rename' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:327:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:327:2: (otherlv_0= 'rename' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:328:3: otherlv_0= 'rename' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameAttributeAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:336:3: ( (otherlv_2= RULE_ID ) )
            // InternalTyphonML.g:337:4: (otherlv_2= RULE_ID )
            {
            // InternalTyphonML.g:337:4: (otherlv_2= RULE_ID )
            // InternalTyphonML.g:338:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getRenameAttributeAccess().getAttributeToRenameAttributeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameAttributeAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:353:3: ( (lv_newName_4_0= ruleEString ) )
            // InternalTyphonML.g:354:4: (lv_newName_4_0= ruleEString )
            {
            // InternalTyphonML.g:354:4: (lv_newName_4_0= ruleEString )
            // InternalTyphonML.g:355:5: lv_newName_4_0= ruleEString
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
    // InternalTyphonML.g:376:1: entryRuleRenameEntity returns [EObject current=null] : iv_ruleRenameEntity= ruleRenameEntity EOF ;
    public final EObject entryRuleRenameEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEntity = null;


        try {
            // InternalTyphonML.g:376:53: (iv_ruleRenameEntity= ruleRenameEntity EOF )
            // InternalTyphonML.g:377:2: iv_ruleRenameEntity= ruleRenameEntity EOF
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
    // InternalTyphonML.g:383:1: ruleRenameEntity returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newEntityName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:389:2: ( (otherlv_0= 'rename' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:390:2: (otherlv_0= 'rename' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:390:2: (otherlv_0= 'rename' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:391:3: otherlv_0= 'rename' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newEntityName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameEntityAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:399:3: ( (otherlv_2= RULE_ID ) )
            // InternalTyphonML.g:400:4: (otherlv_2= RULE_ID )
            {
            // InternalTyphonML.g:400:4: (otherlv_2= RULE_ID )
            // InternalTyphonML.g:401:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameEntityRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getRenameEntityAccess().getEntityToRenameEntityCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameEntityAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:416:3: ( (lv_newEntityName_4_0= ruleEString ) )
            // InternalTyphonML.g:417:4: (lv_newEntityName_4_0= ruleEString )
            {
            // InternalTyphonML.g:417:4: (lv_newEntityName_4_0= ruleEString )
            // InternalTyphonML.g:418:5: lv_newEntityName_4_0= ruleEString
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
    // InternalTyphonML.g:439:1: entryRuleRenameRelation returns [EObject current=null] : iv_ruleRenameRelation= ruleRenameRelation EOF ;
    public final EObject entryRuleRenameRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameRelation = null;


        try {
            // InternalTyphonML.g:439:55: (iv_ruleRenameRelation= ruleRenameRelation EOF )
            // InternalTyphonML.g:440:2: iv_ruleRenameRelation= ruleRenameRelation EOF
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
    // InternalTyphonML.g:446:1: ruleRenameRelation returns [EObject current=null] : (otherlv_0= 'rename' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) ;
    public final EObject ruleRenameRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_newRelationName_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:452:2: ( (otherlv_0= 'rename' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:453:2: (otherlv_0= 'rename' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:453:2: (otherlv_0= 'rename' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) ) )
            // InternalTyphonML.g:454:3: otherlv_0= 'rename' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRelationName_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameRelationAccess().getRenameKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:462:3: ( (otherlv_2= RULE_ID ) )
            // InternalTyphonML.g:463:4: (otherlv_2= RULE_ID )
            {
            // InternalTyphonML.g:463:4: (otherlv_2= RULE_ID )
            // InternalTyphonML.g:464:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getRenameRelationAccess().getRelationToRenameRelationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameRelationAccess().getAsKeyword_3());
            		
            // InternalTyphonML.g:479:3: ( (lv_newRelationName_4_0= ruleEString ) )
            // InternalTyphonML.g:480:4: (lv_newRelationName_4_0= ruleEString )
            {
            // InternalTyphonML.g:480:4: (lv_newRelationName_4_0= ruleEString )
            // InternalTyphonML.g:481:5: lv_newRelationName_4_0= ruleEString
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
    // InternalTyphonML.g:502:1: entryRuleRemoveAttribute returns [EObject current=null] : iv_ruleRemoveAttribute= ruleRemoveAttribute EOF ;
    public final EObject entryRuleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAttribute = null;


        try {
            // InternalTyphonML.g:502:56: (iv_ruleRemoveAttribute= ruleRemoveAttribute EOF )
            // InternalTyphonML.g:503:2: iv_ruleRemoveAttribute= ruleRemoveAttribute EOF
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
    // InternalTyphonML.g:509:1: ruleRemoveAttribute returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRemoveAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTyphonML.g:515:2: ( (otherlv_0= 'remove' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTyphonML.g:516:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTyphonML.g:516:2: (otherlv_0= 'remove' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) ) )
            // InternalTyphonML.g:517:3: otherlv_0= 'remove' otherlv_1= 'attribute' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAttributeAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAttributeAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:525:3: ( (otherlv_2= RULE_ID ) )
            // InternalTyphonML.g:526:4: (otherlv_2= RULE_ID )
            {
            // InternalTyphonML.g:526:4: (otherlv_2= RULE_ID )
            // InternalTyphonML.g:527:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRemoveAttributeAccess().getAttributeToRemoveAttributeCrossReference_2_0());
            				

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
    // InternalTyphonML.g:542:1: entryRuleRemoveEntity returns [EObject current=null] : iv_ruleRemoveEntity= ruleRemoveEntity EOF ;
    public final EObject entryRuleRemoveEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEntity = null;


        try {
            // InternalTyphonML.g:542:53: (iv_ruleRemoveEntity= ruleRemoveEntity EOF )
            // InternalTyphonML.g:543:2: iv_ruleRemoveEntity= ruleRemoveEntity EOF
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
    // InternalTyphonML.g:549:1: ruleRemoveEntity returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRemoveEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTyphonML.g:555:2: ( (otherlv_0= 'remove' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTyphonML.g:556:2: (otherlv_0= 'remove' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTyphonML.g:556:2: (otherlv_0= 'remove' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) ) )
            // InternalTyphonML.g:557:3: otherlv_0= 'remove' otherlv_1= 'Entity' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveEntityAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveEntityAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:565:3: ( (otherlv_2= RULE_ID ) )
            // InternalTyphonML.g:566:4: (otherlv_2= RULE_ID )
            {
            // InternalTyphonML.g:566:4: (otherlv_2= RULE_ID )
            // InternalTyphonML.g:567:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveEntityRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRemoveEntityAccess().getEntityToRemoveEntityCrossReference_2_0());
            				

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
    // InternalTyphonML.g:582:1: entryRuleRemoveRelation returns [EObject current=null] : iv_ruleRemoveRelation= ruleRemoveRelation EOF ;
    public final EObject entryRuleRemoveRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveRelation = null;


        try {
            // InternalTyphonML.g:582:55: (iv_ruleRemoveRelation= ruleRemoveRelation EOF )
            // InternalTyphonML.g:583:2: iv_ruleRemoveRelation= ruleRemoveRelation EOF
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
    // InternalTyphonML.g:589:1: ruleRemoveRelation returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRemoveRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTyphonML.g:595:2: ( (otherlv_0= 'remove' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTyphonML.g:596:2: (otherlv_0= 'remove' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTyphonML.g:596:2: (otherlv_0= 'remove' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) ) )
            // InternalTyphonML.g:597:3: otherlv_0= 'remove' otherlv_1= 'Relation' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveRelationAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveRelationAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:605:3: ( (otherlv_2= RULE_ID ) )
            // InternalTyphonML.g:606:4: (otherlv_2= RULE_ID )
            {
            // InternalTyphonML.g:606:4: (otherlv_2= RULE_ID )
            // InternalTyphonML.g:607:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRemoveRelationAccess().getRelationToRemoveRelationCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleAttribute"
    // InternalTyphonML.g:622:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:622:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:623:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTyphonML.g:629:1: ruleAttribute returns [EObject current=null] : (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;

        EObject this_AddAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:635:2: ( (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) )
            // InternalTyphonML.g:636:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            {
            // InternalTyphonML.g:636:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_STRING) ) {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>=RULE_ID && LA6_4<=RULE_STRING)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==61) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==RULE_ID) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==61) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_5>=RULE_ID && LA6_5<=RULE_STRING)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 61:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTyphonML.g:637:3: this_Attribute_Impl_0= ruleAttribute_Impl
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
                    // InternalTyphonML.g:646:3: this_AddAttribute_1= ruleAddAttribute
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
    // InternalTyphonML.g:658:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:658:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:659:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalTyphonML.g:665:1: ruleRelation returns [EObject current=null] : (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_Impl_0 = null;

        EObject this_AddRelation_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:671:2: ( (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) )
            // InternalTyphonML.g:672:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            {
            // InternalTyphonML.g:672:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_STRING)) ) {
                        alt7=1;
                    }
                    else if ( (LA7_4==68) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==RULE_ID) ) {
                    int LA7_5 = input.LA(3);

                    if ( ((LA7_5>=RULE_ID && LA7_5<=RULE_STRING)) ) {
                        alt7=1;
                    }
                    else if ( (LA7_5==68) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 68:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTyphonML.g:673:3: this_Relation_Impl_0= ruleRelation_Impl
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
                    // InternalTyphonML.g:682:3: this_AddRelation_1= ruleAddRelation
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
    // InternalTyphonML.g:694:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:694:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:695:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalTyphonML.g:701:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_DocumentDB_1 = null;

        EObject this_KeyValueDB_2 = null;

        EObject this_GraphDB_3 = null;

        EObject this_ColumnDB_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:707:2: ( (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) )
            // InternalTyphonML.g:708:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            {
            // InternalTyphonML.g:708:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        alt8=3;
                        }
                        break;
                    case 49:
                        {
                        alt8=2;
                        }
                        break;
                    case 55:
                        {
                        alt8=5;
                        }
                        break;
                    case 47:
                        {
                        alt8=1;
                        }
                        break;
                    case 52:
                        {
                        alt8=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA8_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        alt8=3;
                        }
                        break;
                    case 49:
                        {
                        alt8=2;
                        }
                        break;
                    case 55:
                        {
                        alt8=5;
                        }
                        break;
                    case 47:
                        {
                        alt8=1;
                        }
                        break;
                    case 52:
                        {
                        alt8=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt8=1;
                }
                break;
            case 49:
                {
                alt8=2;
                }
                break;
            case 51:
                {
                alt8=3;
                }
                break;
            case 52:
                {
                alt8=4;
                }
                break;
            case 55:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:709:3: this_RelationalDB_0= ruleRelationalDB
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
                    // InternalTyphonML.g:718:3: this_DocumentDB_1= ruleDocumentDB
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
                    // InternalTyphonML.g:727:3: this_KeyValueDB_2= ruleKeyValueDB
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
                    // InternalTyphonML.g:736:3: this_GraphDB_3= ruleGraphDB
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
                    // InternalTyphonML.g:745:3: this_ColumnDB_4= ruleColumnDB
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
    // InternalTyphonML.g:757:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:757:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:758:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
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
    // InternalTyphonML.g:764:1: ruleGraphAttribute returns [EObject current=null] : (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_GraphAttribute_Impl_0 = null;

        EObject this_AddGraphAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:770:2: ( (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) )
            // InternalTyphonML.g:771:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            {
            // InternalTyphonML.g:771:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_STRING) ) {
                    int LA9_4 = input.LA(3);

                    if ( ((LA9_4>=RULE_ID && LA9_4<=RULE_STRING)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_4==64) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==RULE_ID) ) {
                    int LA9_5 = input.LA(3);

                    if ( ((LA9_5>=RULE_ID && LA9_5<=RULE_STRING)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_5==64) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case 64:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:772:3: this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl
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
                    // InternalTyphonML.g:781:3: this_AddGraphAttribute_1= ruleAddGraphAttribute
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
    // InternalTyphonML.g:793:1: entryRuleGraphEdge returns [EObject current=null] : iv_ruleGraphEdge= ruleGraphEdge EOF ;
    public final EObject entryRuleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge = null;


        try {
            // InternalTyphonML.g:793:50: (iv_ruleGraphEdge= ruleGraphEdge EOF )
            // InternalTyphonML.g:794:2: iv_ruleGraphEdge= ruleGraphEdge EOF
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
    // InternalTyphonML.g:800:1: ruleGraphEdge returns [EObject current=null] : (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) ;
    public final EObject ruleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject this_GraphEdge_Impl_0 = null;

        EObject this_AddGraphEdge_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:806:2: ( (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) )
            // InternalTyphonML.g:807:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            {
            // InternalTyphonML.g:807:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_STRING) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==62) ) {
                        alt10=2;
                    }
                    else if ( (LA10_4==57) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_1==RULE_ID) ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==57) ) {
                        alt10=1;
                    }
                    else if ( (LA10_5==62) ) {
                        alt10=2;
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
            case 57:
                {
                alt10=1;
                }
                break;
            case 62:
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
                    // InternalTyphonML.g:808:3: this_GraphEdge_Impl_0= ruleGraphEdge_Impl
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
                    // InternalTyphonML.g:817:3: this_AddGraphEdge_1= ruleAddGraphEdge
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
    // InternalTyphonML.g:829:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:829:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:830:2: iv_ruleEString= ruleEString EOF
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
    // InternalTyphonML.g:836:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:842:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:843:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:843:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTyphonML.g:844:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:852:3: this_ID_1= RULE_ID
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
    // InternalTyphonML.g:863:1: entryRulePrimitiveDataType_Impl returns [EObject current=null] : iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF ;
    public final EObject entryRulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType_Impl = null;


        try {
            // InternalTyphonML.g:863:63: (iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF )
            // InternalTyphonML.g:864:2: iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF
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
    // InternalTyphonML.g:870:1: rulePrimitiveDataType_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject rulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:876:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:877:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:877:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            // InternalTyphonML.g:878:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalTyphonML.g:878:3: ()
            // InternalTyphonML.g:879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataType_ImplAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:885:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTyphonML.g:886:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:890:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:891:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:891:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:892:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimitiveDataType_ImplAccess().getDatatypeKeyword_2());
            		
            // InternalTyphonML.g:914:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:915:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:915:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:916:5: lv_name_4_0= ruleEString
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
    // InternalTyphonML.g:937:1: entryRuleDataTypeItem returns [EObject current=null] : iv_ruleDataTypeItem= ruleDataTypeItem EOF ;
    public final EObject entryRuleDataTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeItem = null;


        try {
            // InternalTyphonML.g:937:53: (iv_ruleDataTypeItem= ruleDataTypeItem EOF )
            // InternalTyphonML.g:938:2: iv_ruleDataTypeItem= ruleDataTypeItem EOF
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
    // InternalTyphonML.g:944:1: ruleDataTypeItem returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) ;
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
            // InternalTyphonML.g:950:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) )
            // InternalTyphonML.g:951:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            {
            // InternalTyphonML.g:951:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            // InternalTyphonML.g:952:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']'
            {
            // InternalTyphonML.g:952:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTyphonML.g:953:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataTypeItemAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:957:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:958:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:958:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:959:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataTypeItemAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:977:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:978:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:978:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:979:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeItemAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1000:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1001:4: ( ruleEString )
            {
            // InternalTyphonML.g:1001:4: ( ruleEString )
            // InternalTyphonML.g:1002:5: ruleEString
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

            otherlv_5=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDataTypeItemAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalTyphonML.g:1020:3: ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) )
            // InternalTyphonML.g:1021:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            {
            // InternalTyphonML.g:1021:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            // InternalTyphonML.g:1022:5: lv_implementation_6_0= ruleDataTypeImplementationPackage
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getImplementationDataTypeImplementationPackageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

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
    // InternalTyphonML.g:1047:1: entryRuleDataTypeImplementationPackage returns [EObject current=null] : iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF ;
    public final EObject entryRuleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeImplementationPackage = null;


        try {
            // InternalTyphonML.g:1047:70: (iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF )
            // InternalTyphonML.g:1048:2: iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF
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
    // InternalTyphonML.g:1054:1: ruleDataTypeImplementationPackage returns [EObject current=null] : ( () ( (lv_location_1_0= ruleEString ) ) ) ;
    public final EObject ruleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_location_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1060:2: ( ( () ( (lv_location_1_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1061:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1061:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            // InternalTyphonML.g:1062:3: () ( (lv_location_1_0= ruleEString ) )
            {
            // InternalTyphonML.g:1062:3: ()
            // InternalTyphonML.g:1063:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeImplementationPackageAccess().getDataTypeImplementationPackageAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1069:3: ( (lv_location_1_0= ruleEString ) )
            // InternalTyphonML.g:1070:4: (lv_location_1_0= ruleEString )
            {
            // InternalTyphonML.g:1070:4: (lv_location_1_0= ruleEString )
            // InternalTyphonML.g:1071:5: lv_location_1_0= ruleEString
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
    // InternalTyphonML.g:1092:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalTyphonML.g:1092:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalTyphonML.g:1093:2: iv_ruleFreeText= ruleFreeText EOF
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
    // InternalTyphonML.g:1099:1: ruleFreeText returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1105:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1106:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1106:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) )
            // InternalTyphonML.g:1107:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalTyphonML.g:1107:3: ()
            // InternalTyphonML.g:1108:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeTextAccess().getFreeTextAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1114:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTyphonML.g:1115:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getFreeTextAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:1119:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:1120:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:1120:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:1121:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFreeTextAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_importedNamespace_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFreeTextRule());
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

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFreeTextAccess().getFreeTextKeyword_2());
            		
            // InternalTyphonML.g:1143:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:1144:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:1144:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:1145:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFreeTextAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFreeTextRule());
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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleCustomDataType"
    // InternalTyphonML.g:1166:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:1166:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:1167:2: iv_ruleCustomDataType= ruleCustomDataType EOF
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
    // InternalTyphonML.g:1173:1: ruleCustomDataType returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:1179:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:1180:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:1180:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:1181:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:1181:3: ()
            // InternalTyphonML.g:1182:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1188:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTyphonML.g:1189:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:1193:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:1194:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:1194:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:1195:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getCustomdatatypeKeyword_2());
            		
            // InternalTyphonML.g:1217:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:1218:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:1218:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:1219:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDataTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:1240:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTyphonML.g:1241:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomDataTypeAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:1249:4: ( (lv_elements_8_0= ruleDataTypeItem ) )
                    // InternalTyphonML.g:1250:5: (lv_elements_8_0= ruleDataTypeItem )
                    {
                    // InternalTyphonML.g:1250:5: (lv_elements_8_0= ruleDataTypeItem )
                    // InternalTyphonML.g:1251:6: lv_elements_8_0= ruleDataTypeItem
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:1268:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalTyphonML.g:1269:5: otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCustomDataTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:1273:5: ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    // InternalTyphonML.g:1274:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    {
                    	    // InternalTyphonML.g:1274:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    // InternalTyphonML.g:1275:7: lv_elements_10_0= ruleDataTypeItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:1306:1: entryRuleEntity_Impl returns [EObject current=null] : iv_ruleEntity_Impl= ruleEntity_Impl EOF ;
    public final EObject entryRuleEntity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Impl = null;


        try {
            // InternalTyphonML.g:1306:52: (iv_ruleEntity_Impl= ruleEntity_Impl EOF )
            // InternalTyphonML.g:1307:2: iv_ruleEntity_Impl= ruleEntity_Impl EOF
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
    // InternalTyphonML.g:1313:1: ruleEntity_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )* )? (otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) ) )? (otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleEntity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_relations_7_0 = null;

        EObject lv_relations_8_0 = null;

        EObject lv_identifer_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1319:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )* )? (otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) ) )? (otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalTyphonML.g:1320:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )* )? (otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) ) )? (otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalTyphonML.g:1320:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )* )? (otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) ) )? (otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}' )? otherlv_15= '}' )
            // InternalTyphonML.g:1321:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )? ( ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )* )? (otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) ) )? (otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalTyphonML.g:1321:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTyphonML.g:1322:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntity_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1326:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1327:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1327:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1328:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEntity_ImplAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:1350:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:1351:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:1351:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:1352:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:1373:3: ( ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )* )?
            int alt20=2;
            switch ( input.LA(1) ) {
                case 20:
                    {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_STRING) ) {
                        switch ( input.LA(3) ) {
                            case 61:
                                {
                                alt20=1;
                                }
                                break;
                            case RULE_STRING:
                                {
                                int LA20_2 = input.LA(4);

                                if ( (LA20_2==22) ) {
                                    int LA20_8 = input.LA(5);

                                    if ( ((LA20_8>=RULE_ID && LA20_8<=RULE_STRING)) ) {
                                        alt20=1;
                                    }
                                }
                                }
                                break;
                            case RULE_ID:
                                {
                                int LA20_3 = input.LA(4);

                                if ( (LA20_3==22) ) {
                                    int LA20_8 = input.LA(5);

                                    if ( ((LA20_8>=RULE_ID && LA20_8<=RULE_STRING)) ) {
                                        alt20=1;
                                    }
                                }
                                }
                                break;
                        }

                    }
                    else if ( (LA20_1==RULE_ID) ) {
                        switch ( input.LA(3) ) {
                            case RULE_STRING:
                                {
                                int LA20_2 = input.LA(4);

                                if ( (LA20_2==22) ) {
                                    int LA20_8 = input.LA(5);

                                    if ( ((LA20_8>=RULE_ID && LA20_8<=RULE_STRING)) ) {
                                        alt20=1;
                                    }
                                }
                                }
                                break;
                            case RULE_ID:
                                {
                                int LA20_3 = input.LA(4);

                                if ( (LA20_3==22) ) {
                                    int LA20_8 = input.LA(5);

                                    if ( ((LA20_8>=RULE_ID && LA20_8<=RULE_STRING)) ) {
                                        alt20=1;
                                    }
                                }
                                }
                                break;
                            case 61:
                                {
                                alt20=1;
                                }
                                break;
                        }

                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==22) ) {
                        int LA20_8 = input.LA(3);

                        if ( ((LA20_8>=RULE_ID && LA20_8<=RULE_STRING)) ) {
                            alt20=1;
                        }
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (LA20_3==22) ) {
                        int LA20_8 = input.LA(3);

                        if ( ((LA20_8>=RULE_ID && LA20_8<=RULE_STRING)) ) {
                            alt20=1;
                        }
                    }
                    }
                    break;
                case 61:
                    {
                    alt20=1;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // InternalTyphonML.g:1374:4: ( (lv_attributes_5_0= ruleAttribute ) ) ( (lv_attributes_6_0= ruleAttribute ) )*
                    {
                    // InternalTyphonML.g:1374:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalTyphonML.g:1375:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:1375:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalTyphonML.g:1376:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalTyphonML.g:1393:4: ( (lv_attributes_6_0= ruleAttribute ) )*
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case 20:
                            {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==RULE_STRING) ) {
                                switch ( input.LA(3) ) {
                                case 61:
                                    {
                                    alt19=1;
                                    }
                                    break;
                                case RULE_STRING:
                                    {
                                    int LA19_2 = input.LA(4);

                                    if ( (LA19_2==22) ) {
                                        int LA19_8 = input.LA(5);

                                        if ( ((LA19_8>=RULE_ID && LA19_8<=RULE_STRING)) ) {
                                            alt19=1;
                                        }


                                    }


                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA19_3 = input.LA(4);

                                    if ( (LA19_3==22) ) {
                                        int LA19_8 = input.LA(5);

                                        if ( ((LA19_8>=RULE_ID && LA19_8<=RULE_STRING)) ) {
                                            alt19=1;
                                        }


                                    }


                                    }
                                    break;

                                }

                            }
                            else if ( (LA19_1==RULE_ID) ) {
                                switch ( input.LA(3) ) {
                                case 61:
                                    {
                                    alt19=1;
                                    }
                                    break;
                                case RULE_STRING:
                                    {
                                    int LA19_2 = input.LA(4);

                                    if ( (LA19_2==22) ) {
                                        int LA19_8 = input.LA(5);

                                        if ( ((LA19_8>=RULE_ID && LA19_8<=RULE_STRING)) ) {
                                            alt19=1;
                                        }


                                    }


                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA19_3 = input.LA(4);

                                    if ( (LA19_3==22) ) {
                                        int LA19_8 = input.LA(5);

                                        if ( ((LA19_8>=RULE_ID && LA19_8<=RULE_STRING)) ) {
                                            alt19=1;
                                        }


                                    }


                                    }
                                    break;

                                }

                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==22) ) {
                                int LA19_8 = input.LA(3);

                                if ( ((LA19_8>=RULE_ID && LA19_8<=RULE_STRING)) ) {
                                    alt19=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA19_3 = input.LA(2);

                            if ( (LA19_3==22) ) {
                                int LA19_8 = input.LA(3);

                                if ( ((LA19_8>=RULE_ID && LA19_8<=RULE_STRING)) ) {
                                    alt19=1;
                                }


                            }


                            }
                            break;
                        case 61:
                            {
                            alt19=1;
                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // InternalTyphonML.g:1394:5: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:1394:5: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalTyphonML.g:1395:6: lv_attributes_6_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTyphonML.g:1413:3: ( ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==20||LA22_0==68) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:1414:4: ( (lv_relations_7_0= ruleRelation ) ) ( (lv_relations_8_0= ruleRelation ) )*
                    {
                    // InternalTyphonML.g:1414:4: ( (lv_relations_7_0= ruleRelation ) )
                    // InternalTyphonML.g:1415:5: (lv_relations_7_0= ruleRelation )
                    {
                    // InternalTyphonML.g:1415:5: (lv_relations_7_0= ruleRelation )
                    // InternalTyphonML.g:1416:6: lv_relations_7_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_relations_7_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relations",
                    							lv_relations_7_0,
                    							"it.univaq.disim.typhon.TyphonML.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1433:4: ( (lv_relations_8_0= ruleRelation ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==20||LA21_0==68) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalTyphonML.g:1434:5: (lv_relations_8_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:1434:5: (lv_relations_8_0= ruleRelation )
                    	    // InternalTyphonML.g:1435:6: lv_relations_8_0= ruleRelation
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_relations_8_0=ruleRelation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"relations",
                    	    							lv_relations_8_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Relation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTyphonML.g:1453:3: (otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:1454:4: otherlv_9= 'identifer' ( (lv_identifer_10_0= ruleEntityIdentifier ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntity_ImplAccess().getIdentiferKeyword_6_0());
                    			
                    // InternalTyphonML.g:1458:4: ( (lv_identifer_10_0= ruleEntityIdentifier ) )
                    // InternalTyphonML.g:1459:5: (lv_identifer_10_0= ruleEntityIdentifier )
                    {
                    // InternalTyphonML.g:1459:5: (lv_identifer_10_0= ruleEntityIdentifier )
                    // InternalTyphonML.g:1460:6: lv_identifer_10_0= ruleEntityIdentifier
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getIdentiferEntityIdentifierParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_identifer_10_0=ruleEntityIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						set(
                    							current,
                    							"identifer",
                    							lv_identifer_10_0,
                    							"it.univaq.disim.typhon.TyphonML.EntityIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1478:3: (otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTyphonML.g:1479:4: otherlv_11= 'genericList' otherlv_12= '{' ( ( ruleEString ) ) otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntity_ImplAccess().getGenericListKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:1487:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1488:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1488:5: ( ruleEString )
                    // InternalTyphonML.g:1489:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntity_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getGenericListGenericListCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalTyphonML.g:1516:1: entryRuleRelation_Impl returns [EObject current=null] : iv_ruleRelation_Impl= ruleRelation_Impl EOF ;
    public final EObject entryRuleRelation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation_Impl = null;


        try {
            // InternalTyphonML.g:1516:54: (iv_ruleRelation_Impl= ruleRelation_Impl EOF )
            // InternalTyphonML.g:1517:2: iv_ruleRelation_Impl= ruleRelation_Impl EOF
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
    // InternalTyphonML.g:1523:1: ruleRelation_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) ;
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
            // InternalTyphonML.g:1529:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) )
            // InternalTyphonML.g:1530:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            {
            // InternalTyphonML.g:1530:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            // InternalTyphonML.g:1531:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            {
            // InternalTyphonML.g:1531:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTyphonML.g:1532:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelation_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1536:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1537:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1537:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1538:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:1556:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1557:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1557:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1558:5: lv_name_2_0= ruleEString
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

            // InternalTyphonML.g:1575:3: ( (lv_isContainment_3_0= ':' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTyphonML.g:1576:4: (lv_isContainment_3_0= ':' )
                    {
                    // InternalTyphonML.g:1576:4: (lv_isContainment_3_0= ':' )
                    // InternalTyphonML.g:1577:5: lv_isContainment_3_0= ':'
                    {
                    lv_isContainment_3_0=(Token)match(input,22,FOLLOW_29); 

                    					newLeafNode(lv_isContainment_3_0, grammarAccess.getRelation_ImplAccess().getIsContainmentColonKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelation_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getRelation_ImplAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTyphonML.g:1593:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1594:4: ( ruleEString )
            {
            // InternalTyphonML.g:1594:4: ( ruleEString )
            // InternalTyphonML.g:1595:5: ruleEString
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

            // InternalTyphonML.g:1609:3: (otherlv_6= '.' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTyphonML.g:1610:4: otherlv_6= '.' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelation_ImplAccess().getFullStopKeyword_5_0());
                    			
                    // InternalTyphonML.g:1614:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1615:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1615:5: ( ruleEString )
                    // InternalTyphonML.g:1616:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getOppositeRelationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1631:3: (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTyphonML.g:1632:4: otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelation_ImplAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalTyphonML.g:1636:4: ( (lv_cardinality_9_0= ruleCardinality ) )
                    // InternalTyphonML.g:1637:5: (lv_cardinality_9_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:1637:5: (lv_cardinality_9_0= ruleCardinality )
                    // InternalTyphonML.g:1638:6: lv_cardinality_9_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getCardinalityCardinalityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEntityIdentifier"
    // InternalTyphonML.g:1664:1: entryRuleEntityIdentifier returns [EObject current=null] : iv_ruleEntityIdentifier= ruleEntityIdentifier EOF ;
    public final EObject entryRuleEntityIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityIdentifier = null;


        try {
            // InternalTyphonML.g:1664:57: (iv_ruleEntityIdentifier= ruleEntityIdentifier EOF )
            // InternalTyphonML.g:1665:2: iv_ruleEntityIdentifier= ruleEntityIdentifier EOF
            {
             newCompositeNode(grammarAccess.getEntityIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityIdentifier=ruleEntityIdentifier();

            state._fsp--;

             current =iv_ruleEntityIdentifier; 
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
    // $ANTLR end "entryRuleEntityIdentifier"


    // $ANTLR start "ruleEntityIdentifier"
    // InternalTyphonML.g:1671:1: ruleEntityIdentifier returns [EObject current=null] : ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEntityIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1677:2: ( ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? ) )
            // InternalTyphonML.g:1678:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? )
            {
            // InternalTyphonML.g:1678:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? )
            // InternalTyphonML.g:1679:3: () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )?
            {
            // InternalTyphonML.g:1679:3: ()
            // InternalTyphonML.g:1680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityIdentifierAccess().getEntityIdentifierAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1686:3: (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTyphonML.g:1687:4: otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityIdentifierAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTyphonML.g:1691:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1692:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1692:5: ( ruleEString )
                    // InternalTyphonML.g:1693:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityIdentifierRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityIdentifierAccess().getAttributesAttributeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1707:4: (otherlv_3= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==27) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalTyphonML.g:1708:5: otherlv_3= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEntityIdentifierAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTyphonML.g:1712:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:1713:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:1713:6: ( ruleEString )
                    	    // InternalTyphonML.g:1714:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntityIdentifierRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntityIdentifierAccess().getAttributesAttributeCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityIdentifierAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleEntityIdentifier"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalTyphonML.g:1738:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalTyphonML.g:1738:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalTyphonML.g:1739:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalTyphonML.g:1745:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1751:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTyphonML.g:1752:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTyphonML.g:1752:2: (kw= 'true' | kw= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            else if ( (LA31_0==37) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalTyphonML.g:1753:3: kw= 'true'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1759:3: kw= 'false'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalTyphonML.g:1768:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:1768:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:1769:2: iv_ruleTable= ruleTable EOF
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
    // InternalTyphonML.g:1775:1: ruleTable returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:1781:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) )
            // InternalTyphonML.g:1782:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:1782:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            // InternalTyphonML.g:1783:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}'
            {
            // InternalTyphonML.g:1783:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTyphonML.g:1784:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getTableAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1788:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1789:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1789:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1790:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:1816:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:1817:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:1817:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:1818:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:1839:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1840:4: ( ruleEString )
            {
            // InternalTyphonML.g:1840:4: ( ruleEString )
            // InternalTyphonML.g:1841:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1855:3: (otherlv_7= 'db' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTyphonML.g:1856:4: otherlv_7= 'db' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDbKeyword_6_0());
                    			
                    // InternalTyphonML.g:1860:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1861:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1861:5: ( ruleEString )
                    // InternalTyphonML.g:1862:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableAccess().getDbDatabaseCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1877:3: ( (lv_indexSpec_9_0= ruleIndexSpec ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20||LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTyphonML.g:1878:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:1878:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    // InternalTyphonML.g:1879:5: lv_indexSpec_9_0= ruleIndexSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_37);
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

            // InternalTyphonML.g:1896:3: ( (lv_idSpec_10_0= ruleIdSpec ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTyphonML.g:1897:4: (lv_idSpec_10_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:1897:4: (lv_idSpec_10_0= ruleIdSpec )
                    // InternalTyphonML.g:1898:5: lv_idSpec_10_0= ruleIdSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_22);
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

            otherlv_11=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:1923:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalTyphonML.g:1923:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalTyphonML.g:1924:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalTyphonML.g:1930:1: ruleCollection returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1936:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1937:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1937:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1938:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:1938:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTyphonML.g:1939:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1943:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1944:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1944:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1945:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:1963:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1964:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1964:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1965:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1986:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1987:4: ( ruleEString )
            {
            // InternalTyphonML.g:1987:4: ( ruleEString )
            // InternalTyphonML.g:1988:5: ruleEString
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
    // InternalTyphonML.g:2006:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:2006:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:2007:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
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
    // InternalTyphonML.g:2013:1: ruleKeyValueElement returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
    public final EObject ruleKeyValueElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_key_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2019:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:2020:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:2020:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:2021:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:2021:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTyphonML.g:2022:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getKeyValueElementAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2026:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2027:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2027:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2028:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:2046:3: ( (lv_key_2_0= ruleEString ) )
            // InternalTyphonML.g:2047:4: (lv_key_2_0= ruleEString )
            {
            // InternalTyphonML.g:2047:4: (lv_key_2_0= ruleEString )
            // InternalTyphonML.g:2048:5: lv_key_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_key_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueElementRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueElementAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2077:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2078:4: ( ruleEString )
            {
            // InternalTyphonML.g:2078:4: ( ruleEString )
            // InternalTyphonML.g:2079:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2093:3: (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTyphonML.g:2094:4: otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueElementAccess().getValuesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getKeyValueElementAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2102:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2103:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2103:5: ( ruleEString )
                    // InternalTyphonML.g:2104:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyValueElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2118:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalTyphonML.g:2119:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_10); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getKeyValueElementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2123:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2124:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2124:6: ( ruleEString )
                    	    // InternalTyphonML.g:2125:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeyValueElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getKeyValueElementAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getKeyValueElementAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalTyphonML.g:2153:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // InternalTyphonML.g:2153:50: (iv_ruleGraphNode= ruleGraphNode EOF )
            // InternalTyphonML.g:2154:2: iv_ruleGraphNode= ruleGraphNode EOF
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
    // InternalTyphonML.g:2160:1: ruleGraphNode returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleGraphNode() throws RecognitionException {
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

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2166:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:2167:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:2167:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalTyphonML.g:2168:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:2168:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTyphonML.g:2169:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getGraphNodeAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2173:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2174:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2174:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2175:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            otherlv_2=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphNodeAccess().getNodeKeyword_1());
            		
            // InternalTyphonML.g:2197:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:2198:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:2198:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:2199:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphNodeAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2224:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2225:4: ( ruleEString )
            {
            // InternalTyphonML.g:2225:4: ( ruleEString )
            // InternalTyphonML.g:2226:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_41);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2240:3: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTyphonML.g:2241:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphNodeAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,25,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:2249:4: ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    // InternalTyphonML.g:2250:5: (lv_attributes_9_0= ruleGraphAttribute )
                    {
                    // InternalTyphonML.g:2250:5: (lv_attributes_9_0= ruleGraphAttribute )
                    // InternalTyphonML.g:2251:6: lv_attributes_9_0= ruleGraphAttribute
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:2268:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==27) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalTyphonML.g:2269:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_42); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getGraphNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2273:5: ( (lv_attributes_11_0= ruleGraphAttribute ) )
                    	    // InternalTyphonML.g:2274:6: (lv_attributes_11_0= ruleGraphAttribute )
                    	    {
                    	    // InternalTyphonML.g:2274:6: (lv_attributes_11_0= ruleGraphAttribute )
                    	    // InternalTyphonML.g:2275:7: lv_attributes_11_0= ruleGraphAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_attributes_11_0=ruleGraphAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGraphNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_11_0,
                    	    								"it.univaq.disim.typhon.TyphonML.GraphAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalTyphonML.g:2306:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTyphonML.g:2306:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTyphonML.g:2307:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalTyphonML.g:2313:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
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
            // InternalTyphonML.g:2319:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:2320:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:2320:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:2321:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:2321:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTyphonML.g:2322:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:2326:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:2327:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:2327:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:2328:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

            otherlv_2=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalTyphonML.g:2350:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:2351:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:2351:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:2352:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2377:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2378:4: ( ruleEString )
            {
            // InternalTyphonML.g:2378:4: ( ruleEString )
            // InternalTyphonML.g:2379:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColumnAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_41);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2393:3: (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTyphonML.g:2394:4: otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2402:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2403:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2403:5: ( ruleEString )
                    // InternalTyphonML.g:2404:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2418:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==27) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalTyphonML.g:2419:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_10); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2423:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2424:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2424:6: ( ruleEString )
                    	    // InternalTyphonML.g:2425:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getColumnAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:2453:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:2453:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:2454:2: iv_ruleIndexSpec= ruleIndexSpec EOF
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
    // InternalTyphonML.g:2460:1: ruleIndexSpec returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:2466:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:2467:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:2467:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTyphonML.g:2468:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:2468:3: ()
            // InternalTyphonML.g:2469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2475:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTyphonML.g:2476:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2480:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2481:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2481:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2482:6: lv_importedNamespace_2_0= ruleEString
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

            otherlv_3=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getIndexKeyword_2());
            		
            // InternalTyphonML.g:2504:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2505:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2505:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2506:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexSpecAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2527:3: (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTyphonML.g:2528:4: otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexSpecAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTyphonML.g:2536:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2537:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2537:5: ( ruleEString )
                    // InternalTyphonML.g:2538:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2552:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalTyphonML.g:2553:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_10); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getIndexSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2557:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2558:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2558:6: ( ruleEString )
                    	    // InternalTyphonML.g:2559:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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

                    otherlv_11=(Token)match(input,35,FOLLOW_46); 

                    				newLeafNode(otherlv_11, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:2579:3: (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTyphonML.g:2580:4: otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_39); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexSpecAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2588:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2589:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2589:5: ( ruleEString )
                    // InternalTyphonML.g:2590:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2604:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==27) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalTyphonML.g:2605:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getIndexSpecAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2609:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2610:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2610:6: ( ruleEString )
                    	    // InternalTyphonML.g:2611:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:2639:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:2639:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:2640:2: iv_ruleIdSpec= ruleIdSpec EOF
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
    // InternalTyphonML.g:2646:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:2652:2: ( ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalTyphonML.g:2653:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalTyphonML.g:2653:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalTyphonML.g:2654:3: () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalTyphonML.g:2654:3: ()
            // InternalTyphonML.g:2655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdSpecKeyword_1());
            		
            // InternalTyphonML.g:2665:3: (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTyphonML.g:2666:4: otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTyphonML.g:2670:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2671:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2671:5: ( ruleEString )
                    // InternalTyphonML.g:2672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2686:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==27) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalTyphonML.g:2687:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTyphonML.g:2691:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2692:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2692:6: ( ruleEString )
                    	    // InternalTyphonML.g:2693:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIdSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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

                    otherlv_6=(Token)match(input,35,FOLLOW_2); 

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
    // InternalTyphonML.g:2717:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:2717:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:2718:2: iv_ruleRelationalDB= ruleRelationalDB EOF
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
    // InternalTyphonML.g:2724:1: ruleRelationalDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2730:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2731:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2731:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:2732:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2732:3: ()
            // InternalTyphonML.g:2733:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2739:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTyphonML.g:2740:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2744:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2745:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2745:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2746:6: lv_importedNamespace_2_0= ruleEString
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

            otherlv_3=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_2());
            		
            // InternalTyphonML.g:2768:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2769:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2769:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2770:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationalDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2791:3: (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTyphonML.g:2792:4: otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationalDBAccess().getTablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2800:4: ( (lv_tables_8_0= ruleTable ) )
                    // InternalTyphonML.g:2801:5: (lv_tables_8_0= ruleTable )
                    {
                    // InternalTyphonML.g:2801:5: (lv_tables_8_0= ruleTable )
                    // InternalTyphonML.g:2802:6: lv_tables_8_0= ruleTable
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

                    // InternalTyphonML.g:2819:4: ( (lv_tables_9_0= ruleTable ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==20||LA54_0==38) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalTyphonML.g:2820:5: (lv_tables_9_0= ruleTable )
                    	    {
                    	    // InternalTyphonML.g:2820:5: (lv_tables_9_0= ruleTable )
                    	    // InternalTyphonML.g:2821:6: lv_tables_9_0= ruleTable
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:2851:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:2851:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:2852:2: iv_ruleDocumentDB= ruleDocumentDB EOF
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
    // InternalTyphonML.g:2858:1: ruleDocumentDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2864:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2865:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2865:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:2866:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2866:3: ()
            // InternalTyphonML.g:2867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2873:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTyphonML.g:2874:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2878:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2879:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2879:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2880:6: lv_importedNamespace_2_0= ruleEString
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

            otherlv_3=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_2());
            		
            // InternalTyphonML.g:2902:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2903:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2903:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2904:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_53); 

            			newLeafNode(otherlv_5, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2925:3: (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTyphonML.g:2926:4: otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentDBAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2934:4: ( (lv_collections_8_0= ruleCollection ) )
                    // InternalTyphonML.g:2935:5: (lv_collections_8_0= ruleCollection )
                    {
                    // InternalTyphonML.g:2935:5: (lv_collections_8_0= ruleCollection )
                    // InternalTyphonML.g:2936:6: lv_collections_8_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_54);
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

                    // InternalTyphonML.g:2953:4: ( (lv_collections_9_0= ruleCollection ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==20) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTyphonML.g:2954:5: (lv_collections_9_0= ruleCollection )
                    	    {
                    	    // InternalTyphonML.g:2954:5: (lv_collections_9_0= ruleCollection )
                    	    // InternalTyphonML.g:2955:6: lv_collections_9_0= ruleCollection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_54);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:2985:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:2985:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:2986:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
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
    // InternalTyphonML.g:2992:1: ruleKeyValueDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:2998:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2999:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2999:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:3000:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:3000:3: ()
            // InternalTyphonML.g:3001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3007:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==20) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTyphonML.g:3008:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3012:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3013:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3013:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3014:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            otherlv_3=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_2());
            		
            // InternalTyphonML.g:3036:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3037:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3037:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3038:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3059:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==26) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTyphonML.g:3060:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeyValueDBAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3068:4: ( (lv_elements_8_0= ruleKeyValueElement ) )
                    // InternalTyphonML.g:3069:5: (lv_elements_8_0= ruleKeyValueElement )
                    {
                    // InternalTyphonML.g:3069:5: (lv_elements_8_0= ruleKeyValueElement )
                    // InternalTyphonML.g:3070:6: lv_elements_8_0= ruleKeyValueElement
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:3087:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==27) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTyphonML.g:3088:5: otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getKeyValueDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3092:5: ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    // InternalTyphonML.g:3093:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    {
                    	    // InternalTyphonML.g:3093:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    // InternalTyphonML.g:3094:7: lv_elements_10_0= ruleKeyValueElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:3125:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:3125:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:3126:2: iv_ruleGraphDB= ruleGraphDB EOF
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
    // InternalTyphonML.g:3132:1: ruleGraphDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:3138:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:3139:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:3139:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:3140:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:3140:3: ()
            // InternalTyphonML.g:3141:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3147:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==20) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTyphonML.g:3148:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3152:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3153:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3153:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3154:6: lv_importedNamespace_2_0= ruleEString
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

            otherlv_3=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getGraphdbKeyword_2());
            		
            // InternalTyphonML.g:3176:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3177:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3177:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3178:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_57); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3199:3: (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTyphonML.g:3200:4: otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getNodesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3208:4: ( (lv_nodes_8_0= ruleGraphNode ) )
                    // InternalTyphonML.g:3209:5: (lv_nodes_8_0= ruleGraphNode )
                    {
                    // InternalTyphonML.g:3209:5: (lv_nodes_8_0= ruleGraphNode )
                    // InternalTyphonML.g:3210:6: lv_nodes_8_0= ruleGraphNode
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:3227:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==27) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalTyphonML.g:3228:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_58); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGraphDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3232:5: ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    // InternalTyphonML.g:3233:6: (lv_nodes_10_0= ruleGraphNode )
                    	    {
                    	    // InternalTyphonML.g:3233:6: (lv_nodes_10_0= ruleGraphNode )
                    	    // InternalTyphonML.g:3234:7: lv_nodes_10_0= ruleGraphNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3257:3: (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==54) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTyphonML.g:3258:4: otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,54,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphDBAccess().getEdgesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,25,FOLLOW_60); 

                    				newLeafNode(otherlv_13, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:3266:4: ( (lv_edges_14_0= ruleGraphEdge ) )
                    // InternalTyphonML.g:3267:5: (lv_edges_14_0= ruleGraphEdge )
                    {
                    // InternalTyphonML.g:3267:5: (lv_edges_14_0= ruleGraphEdge )
                    // InternalTyphonML.g:3268:6: lv_edges_14_0= ruleGraphEdge
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:3285:4: (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==27) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalTyphonML.g:3286:5: otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_60); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGraphDBAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3290:5: ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    // InternalTyphonML.g:3291:6: (lv_edges_16_0= ruleGraphEdge )
                    	    {
                    	    // InternalTyphonML.g:3291:6: (lv_edges_16_0= ruleGraphEdge )
                    	    // InternalTyphonML.g:3292:7: lv_edges_16_0= ruleGraphEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:3323:1: entryRuleColumnDB returns [EObject current=null] : iv_ruleColumnDB= ruleColumnDB EOF ;
    public final EObject entryRuleColumnDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDB = null;


        try {
            // InternalTyphonML.g:3323:49: (iv_ruleColumnDB= ruleColumnDB EOF )
            // InternalTyphonML.g:3324:2: iv_ruleColumnDB= ruleColumnDB EOF
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
    // InternalTyphonML.g:3330:1: ruleColumnDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:3336:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:3337:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:3337:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:3338:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:3338:3: ()
            // InternalTyphonML.g:3339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDBAccess().getColumnDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3345:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==20) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTyphonML.g:3346:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3350:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3351:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3351:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3352:6: lv_importedNamespace_2_0= ruleEString
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

            otherlv_3=(Token)match(input,55,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDBAccess().getColumndbKeyword_2());
            		
            // InternalTyphonML.g:3374:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3375:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3375:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3376:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnDBAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_62); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3397:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==56) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTyphonML.g:3398:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnDBAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_63); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3406:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalTyphonML.g:3407:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalTyphonML.g:3407:5: (lv_columns_8_0= ruleColumn )
                    // InternalTyphonML.g:3408:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:3425:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==27) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalTyphonML.g:3426:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_63); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getColumnDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3430:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalTyphonML.g:3431:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalTyphonML.g:3431:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalTyphonML.g:3432:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getColumnDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:3463:1: entryRuleGraphEdge_Impl returns [EObject current=null] : iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF ;
    public final EObject entryRuleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge_Impl = null;


        try {
            // InternalTyphonML.g:3463:55: (iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF )
            // InternalTyphonML.g:3464:2: iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF
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
    // InternalTyphonML.g:3470:1: ruleGraphEdge_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:3476:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3477:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3477:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3478:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3478:3: ()
            // InternalTyphonML.g:3479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3485:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==20) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTyphonML.g:3486:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3490:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3491:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3491:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3492:6: lv_importedNamespace_2_0= ruleEString
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

            otherlv_3=(Token)match(input,57,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdge_ImplAccess().getEdgeKeyword_2());
            		
            // InternalTyphonML.g:3514:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3515:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3515:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3516:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_65); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3537:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==58) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTyphonML.g:3538:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdge_ImplAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:3542:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3543:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3543:5: ( ruleEString )
                    // InternalTyphonML.g:3544:6: ruleEString
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

            // InternalTyphonML.g:3559:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==59) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTyphonML.g:3560:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphEdge_ImplAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:3564:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3565:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3565:5: ( ruleEString )
                    // InternalTyphonML.g:3566:6: ruleEString
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

            // InternalTyphonML.g:3581:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==60) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTyphonML.g:3582:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphEdge_ImplAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3590:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:3591:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:3591:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:3592:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:3609:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==27) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalTyphonML.g:3610:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getGraphEdge_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3614:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:3615:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:3615:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:3616:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getGraphEdge_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:3647:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:3647:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:3648:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
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
    // InternalTyphonML.g:3654:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3660:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:3661:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:3661:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:3662:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:3662:3: ()
            // InternalTyphonML.g:3663:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3669:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==20) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalTyphonML.g:3670:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3674:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3675:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3675:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3676:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:3694:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3695:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3695:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3696:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:3717:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3718:4: ( ruleEString )
            {
            // InternalTyphonML.g:3718:4: ( ruleEString )
            // InternalTyphonML.g:3719:5: ruleEString
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
    // InternalTyphonML.g:3737:1: entryRuleAddAttribute returns [EObject current=null] : iv_ruleAddAttribute= ruleAddAttribute EOF ;
    public final EObject entryRuleAddAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttribute = null;


        try {
            // InternalTyphonML.g:3737:53: (iv_ruleAddAttribute= ruleAddAttribute EOF )
            // InternalTyphonML.g:3738:2: iv_ruleAddAttribute= ruleAddAttribute EOF
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
    // InternalTyphonML.g:3744:1: ruleAddAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAddAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3750:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:3751:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:3751:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:3752:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:3752:3: ()
            // InternalTyphonML.g:3753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAttributeAccess().getAddAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3759:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==20) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalTyphonML.g:3760:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3764:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3765:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3765:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3766:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            otherlv_3=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributeAccess().getAddAttributeKeyword_2());
            		
            // InternalTyphonML.g:3788:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3789:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3789:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3790:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAddAttributeAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:3811:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3812:4: ( ruleEString )
            {
            // InternalTyphonML.g:3812:4: ( ruleEString )
            // InternalTyphonML.g:3813:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getTypeDataTypeCrossReference_5_0());
            				
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
    // InternalTyphonML.g:3831:1: entryRuleAddGraphEdge returns [EObject current=null] : iv_ruleAddGraphEdge= ruleAddGraphEdge EOF ;
    public final EObject entryRuleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphEdge = null;


        try {
            // InternalTyphonML.g:3831:53: (iv_ruleAddGraphEdge= ruleAddGraphEdge EOF )
            // InternalTyphonML.g:3832:2: iv_ruleAddGraphEdge= ruleAddGraphEdge EOF
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
    // InternalTyphonML.g:3838:1: ruleAddGraphEdge returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:3844:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3845:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3845:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3846:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3846:3: ()
            // InternalTyphonML.g:3847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3853:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==20) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTyphonML.g:3854:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3858:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3859:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3859:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3860:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            otherlv_3=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeKeyword_2());
            		
            // InternalTyphonML.g:3882:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3883:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3883:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3884:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_65); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3905:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==58) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTyphonML.g:3906:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphEdgeAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:3910:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3911:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3911:5: ( ruleEString )
                    // InternalTyphonML.g:3912:6: ruleEString
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

            // InternalTyphonML.g:3927:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==59) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTyphonML.g:3928:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddGraphEdgeAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:3932:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3933:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3933:5: ( ruleEString )
                    // InternalTyphonML.g:3934:6: ruleEString
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

            // InternalTyphonML.g:3949:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==60) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTyphonML.g:3950:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddGraphEdgeAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3958:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:3959:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:3959:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:3960:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalTyphonML.g:3977:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==27) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalTyphonML.g:3978:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,27,FOLLOW_20); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAddGraphEdgeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3982:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:3983:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:3983:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:3984:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getAddGraphEdgeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:4015:1: entryRuleGraphAttribute_Impl returns [EObject current=null] : iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF ;
    public final EObject entryRuleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute_Impl = null;


        try {
            // InternalTyphonML.g:4015:60: (iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF )
            // InternalTyphonML.g:4016:2: iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF
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
    // InternalTyphonML.g:4022:1: ruleGraphAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) ;
    public final EObject ruleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4028:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:4029:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:4029:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            // InternalTyphonML.g:4030:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:4030:3: ()
            // InternalTyphonML.g:4031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4037:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==20) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTyphonML.g:4038:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4042:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4043:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4043:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4044:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:4062:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4063:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4063:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4064:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_70);
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

            otherlv_4=(Token)match(input,63,FOLLOW_71); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAttribute_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalTyphonML.g:4085:3: ( ( ruleEString ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_STRING)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTyphonML.g:4086:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:4086:4: ( ruleEString )
                    // InternalTyphonML.g:4087:5: ruleEString
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
    // InternalTyphonML.g:4105:1: entryRuleAddGraphAttribute returns [EObject current=null] : iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF ;
    public final EObject entryRuleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphAttribute = null;


        try {
            // InternalTyphonML.g:4105:58: (iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF )
            // InternalTyphonML.g:4106:2: iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF
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
    // InternalTyphonML.g:4112:1: ruleAddGraphAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalTyphonML.g:4118:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:4119:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:4119:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:4120:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:4120:3: ()
            // InternalTyphonML.g:4121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4127:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==20) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalTyphonML.g:4128:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4132:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4133:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4133:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4134:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_72);
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

            otherlv_3=(Token)match(input,64,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeKeyword_2());
            		
            // InternalTyphonML.g:4156:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:4157:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:4157:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:4158:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,25,FOLLOW_73); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphAttributeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:4179:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==65) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalTyphonML.g:4180:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:4184:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4185:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4185:5: ( ruleEString )
                    // InternalTyphonML.g:4186:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getValueAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:4209:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalTyphonML.g:4209:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalTyphonML.g:4210:2: iv_ruleAddEntity= ruleAddEntity EOF
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
    // InternalTyphonML.g:4216:1: ruleAddEntity returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}' )? otherlv_17= 'identifer' ( (lv_identifer_18_0= ruleEntityIdentifier ) ) otherlv_19= '}' ) ;
    public final EObject ruleAddEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_relations_13_0 = null;

        EObject lv_relations_15_0 = null;

        EObject lv_identifer_18_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4222:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}' )? otherlv_17= 'identifer' ( (lv_identifer_18_0= ruleEntityIdentifier ) ) otherlv_19= '}' ) )
            // InternalTyphonML.g:4223:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}' )? otherlv_17= 'identifer' ( (lv_identifer_18_0= ruleEntityIdentifier ) ) otherlv_19= '}' )
            {
            // InternalTyphonML.g:4223:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}' )? otherlv_17= 'identifer' ( (lv_identifer_18_0= ruleEntityIdentifier ) ) otherlv_19= '}' )
            // InternalTyphonML.g:4224:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? (otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}' )? otherlv_17= 'identifer' ( (lv_identifer_18_0= ruleEntityIdentifier ) ) otherlv_19= '}'
            {
            // InternalTyphonML.g:4224:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==20) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTyphonML.g:4225:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddEntityAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:4229:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:4230:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:4230:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:4231:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            otherlv_2=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAddEntityAccess().getAddEntityKeyword_1());
            		
            // InternalTyphonML.g:4253:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4254:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4254:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4255:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_75); 

            			newLeafNode(otherlv_4, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:4276:3: (otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==42) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTyphonML.g:4277:4: otherlv_5= 'attributes' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddEntityAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,25,FOLLOW_76); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTyphonML.g:4285:4: ( (lv_attributes_7_0= ruleAttribute ) )
                    // InternalTyphonML.g:4286:5: (lv_attributes_7_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:4286:5: (lv_attributes_7_0= ruleAttribute )
                    // InternalTyphonML.g:4287:6: lv_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_attributes_7_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_7_0,
                    							"it.univaq.disim.typhon.TyphonML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:4304:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==27) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalTyphonML.g:4305:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,27,FOLLOW_76); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAddEntityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTyphonML.g:4309:5: ( (lv_attributes_9_0= ruleAttribute ) )
                    	    // InternalTyphonML.g:4310:6: (lv_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:4310:6: (lv_attributes_9_0= ruleAttribute )
                    	    // InternalTyphonML.g:4311:7: lv_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_9_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FOLLOW_77); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:4334:3: (otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==67) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTyphonML.g:4335:4: otherlv_11= 'relations' otherlv_12= '{' ( (lv_relations_13_0= ruleRelation ) ) (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,67,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddEntityAccess().getRelationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,25,FOLLOW_78); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:4343:4: ( (lv_relations_13_0= ruleRelation ) )
                    // InternalTyphonML.g:4344:5: (lv_relations_13_0= ruleRelation )
                    {
                    // InternalTyphonML.g:4344:5: (lv_relations_13_0= ruleRelation )
                    // InternalTyphonML.g:4345:6: lv_relations_13_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_relations_13_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    						}
                    						add(
                    							current,
                    							"relations",
                    							lv_relations_13_0,
                    							"it.univaq.disim.typhon.TyphonML.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:4362:4: (otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==27) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalTyphonML.g:4363:5: otherlv_14= ',' ( (lv_relations_15_0= ruleRelation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,27,FOLLOW_78); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAddEntityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:4367:5: ( (lv_relations_15_0= ruleRelation ) )
                    	    // InternalTyphonML.g:4368:6: (lv_relations_15_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:4368:6: (lv_relations_15_0= ruleRelation )
                    	    // InternalTyphonML.g:4369:7: lv_relations_15_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_relations_15_0=ruleRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relations",
                    	    								lv_relations_15_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Relation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_79); 

                    				newLeafNode(otherlv_16, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,30,FOLLOW_80); 

            			newLeafNode(otherlv_17, grammarAccess.getAddEntityAccess().getIdentiferKeyword_6());
            		
            // InternalTyphonML.g:4396:3: ( (lv_identifer_18_0= ruleEntityIdentifier ) )
            // InternalTyphonML.g:4397:4: (lv_identifer_18_0= ruleEntityIdentifier )
            {
            // InternalTyphonML.g:4397:4: (lv_identifer_18_0= ruleEntityIdentifier )
            // InternalTyphonML.g:4398:5: lv_identifer_18_0= ruleEntityIdentifier
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getIdentiferEntityIdentifierParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_identifer_18_0=ruleEntityIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddEntityRule());
            					}
            					set(
            						current,
            						"identifer",
            						lv_identifer_18_0,
            						"it.univaq.disim.typhon.TyphonML.EntityIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalTyphonML.g:4423:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalTyphonML.g:4423:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalTyphonML.g:4424:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalTyphonML.g:4430:1: ruleAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4436:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4437:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4437:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4438:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4438:3: ()
            // InternalTyphonML.g:4439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4445:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==20) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalTyphonML.g:4446:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4450:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4451:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4451:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4452:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            // InternalTyphonML.g:4470:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4471:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4471:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4472:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAttribute_ImplAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:4493:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4494:4: ( ruleEString )
            {
            // InternalTyphonML.g:4494:4: ( ruleEString )
            // InternalTyphonML.g:4495:5: ruleEString
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
    // InternalTyphonML.g:4513:1: entryRuleAddRelation returns [EObject current=null] : iv_ruleAddRelation= ruleAddRelation EOF ;
    public final EObject entryRuleAddRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRelation = null;


        try {
            // InternalTyphonML.g:4513:52: (iv_ruleAddRelation= ruleAddRelation EOF )
            // InternalTyphonML.g:4514:2: iv_ruleAddRelation= ruleAddRelation EOF
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
    // InternalTyphonML.g:4520:1: ruleAddRelation returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' ) ;
    public final EObject ruleAddRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_isContainment_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_cardinality_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4526:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:4527:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:4527:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' )
            // InternalTyphonML.g:4528:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:4528:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==20) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalTyphonML.g:4529:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddRelationAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:4533:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:4534:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:4534:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:4535:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_81);
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

            otherlv_2=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAddRelationAccess().getAddRelationKeyword_1());
            		
            // InternalTyphonML.g:4557:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4558:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4558:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4559:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddRelationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:4576:3: ( (lv_isContainment_4_0= ':' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==22) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalTyphonML.g:4577:4: (lv_isContainment_4_0= ':' )
                    {
                    // InternalTyphonML.g:4577:4: (lv_isContainment_4_0= ':' )
                    // InternalTyphonML.g:4578:5: lv_isContainment_4_0= ':'
                    {
                    lv_isContainment_4_0=(Token)match(input,22,FOLLOW_29); 

                    					newLeafNode(lv_isContainment_4_0, grammarAccess.getAddRelationAccess().getIsContainmentColonKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAddRelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalTyphonML.g:4594:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4595:4: ( ruleEString )
            {
            // InternalTyphonML.g:4595:4: ( ruleEString )
            // InternalTyphonML.g:4596:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getTypeEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_82);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:4610:3: (otherlv_7= '.' ( ( ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==33) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalTyphonML.g:4611:4: otherlv_7= '.' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddRelationAccess().getFullStopKeyword_6_0());
                    			
                    // InternalTyphonML.g:4615:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4616:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4616:5: ( ruleEString )
                    // InternalTyphonML.g:4617:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getOppositeRelationCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4632:3: (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==12) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalTyphonML.g:4633:4: otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddRelationAccess().getLeftSquareBracketKeyword_7_0());
                    			
                    // InternalTyphonML.g:4637:4: ( (lv_cardinality_10_0= ruleCardinality ) )
                    // InternalTyphonML.g:4638:5: (lv_cardinality_10_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:4638:5: (lv_cardinality_10_0= ruleCardinality )
                    // InternalTyphonML.g:4639:6: lv_cardinality_10_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getCardinalityCardinalityEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_cardinality_10_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddRelationRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_10_0,
                    							"it.univaq.disim.typhon.TyphonML.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddRelationAccess().getRightSquareBracketKeyword_7_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAddRelationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalTyphonML.g:4669:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:4675:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) )
            // InternalTyphonML.g:4676:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            {
            // InternalTyphonML.g:4676:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt96=1;
                }
                break;
            case 70:
                {
                alt96=2;
                }
                break;
            case 71:
                {
                alt96=3;
                }
                break;
            case 72:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalTyphonML.g:4677:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalTyphonML.g:4677:3: (enumLiteral_0= '0..1' )
                    // InternalTyphonML.g:4678:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:4685:3: (enumLiteral_1= '1' )
                    {
                    // InternalTyphonML.g:4685:3: (enumLiteral_1= '1' )
                    // InternalTyphonML.g:4686:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:4693:3: (enumLiteral_2= '0..*' )
                    {
                    // InternalTyphonML.g:4693:3: (enumLiteral_2= '0..*' )
                    // InternalTyphonML.g:4694:4: enumLiteral_2= '0..*'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:4701:3: (enumLiteral_3= '*' )
                    {
                    // InternalTyphonML.g:4701:3: (enumLiteral_3= '*' )
                    // InternalTyphonML.g:4702:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\16\1\4\3\uffff\2\17\2\75\6\uffff";
    static final String dfa_3s = "\1\104\1\5\3\uffff\2\22\2\104\6\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\4\uffff\1\5\1\6\1\4\1\7\1\10\1\11";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\4\uffff\1\6\1\1\50\uffff\1\2\4\uffff\1\3\1\uffff\1\4",
            "\1\10\1\7",
            "",
            "",
            "",
            "\1\13\1\uffff\1\11\1\12",
            "\1\14\1\uffff\1\15\1\16",
            "\1\2\4\uffff\1\3\1\uffff\1\4",
            "\1\2\4\uffff\1\3\1\uffff\1\4",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "228:2: (this_AddAttribute_0= ruleAddAttribute | this_AddEntity_1= ruleAddEntity | this_AddRelation_2= ruleAddRelation | this_RenameAttribute_3= ruleRenameAttribute | this_RenameEntity_4= ruleRenameEntity | this_RenameRelation_5= ruleRenameRelation | this_RemoveAttribute_6= ruleRemoveAttribute | this_RemoveEntity_7= ruleRemoveEntity | this_RemoveRelation_8= ruleRemoveRelation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x009A800021B00800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x009A800000100800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000186000L,0x0000000000000014L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x20000000D0100030L,0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000D0100030L,0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000490000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200001002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000508010100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000500010100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100030L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000240010000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004010100000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000010100030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0060000010000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000010000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4200000000100000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000010000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1C00000010000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1800000010000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000010000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000040040000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x2000000000100030L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000100030L,0x0000000000000010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000210001000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000010001000L});

}