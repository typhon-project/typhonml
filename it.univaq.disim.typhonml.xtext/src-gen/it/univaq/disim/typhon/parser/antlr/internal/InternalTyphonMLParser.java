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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'importedNamespace'", "'datatype'", "':'", "'['", "']'", "'FreeText'", "'customdatatype'", "'{'", "'elements'", "','", "'}'", "'entity'", "'genericList'", "'identifer'", "'->'", "'.'", "'('", "')'", "'GenericList'", "'table'", "'db'", "'values'", "'node'", "'attributes'", "'column'", "'index'", "'references'", "'idSpec'", "'relationaldb'", "'tables'", "'documentdb'", "'collections'", "'keyvaluedb'", "'graphdb'", "'nodes'", "'edges'", "'columndb'", "'columns'", "'edge'", "'from'", "'to'", "'labels'", "'AddAttribute'", "'AddGraphEdge'", "'='", "'AddGraphAttribute'", "'value'", "'AddEntity'", "'relations'", "'AddRelation'", "'0..1'", "'1'", "'0..*'", "'*'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    // InternalTyphonML.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypes_1_0 = null;

        EObject lv_databases_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:78:2: ( ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* ) )
            // InternalTyphonML.g:79:2: ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* )
            {
            // InternalTyphonML.g:79:2: ( () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )* )
            // InternalTyphonML.g:80:3: () ( (lv_dataTypes_1_0= ruleDataType ) )* ( (lv_databases_2_0= ruleDatabase ) )*
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

                if ( (LA1_0==11) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_STRING) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==12||(LA1_4>=16 && LA1_4<=17)||LA1_4==22||LA1_4==58) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_1==RULE_ID) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==12||(LA1_5>=16 && LA1_5<=17)||LA1_5==22||LA1_5==58) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==12||(LA1_0>=16 && LA1_0<=17)||LA1_0==22||LA1_0==58) ) {
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

                if ( (LA2_0==11||LA2_0==39||LA2_0==41||(LA2_0>=43 && LA2_0<=44)||LA2_0==47) ) {
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


            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:129:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTyphonML.g:129:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTyphonML.g:130:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalTyphonML.g:136:1: ruleDataType returns [EObject current=null] : (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_AddEntity_0 = null;

        EObject this_PrimitiveDataType_Impl_1 = null;

        EObject this_FreeText_2 = null;

        EObject this_CustomDataType_3 = null;

        EObject this_Entity_Impl_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:142:2: ( (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl ) )
            // InternalTyphonML.g:143:2: (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl )
            {
            // InternalTyphonML.g:143:2: (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 16:
                        {
                        alt3=3;
                        }
                        break;
                    case 12:
                        {
                        alt3=2;
                        }
                        break;
                    case 17:
                        {
                        alt3=4;
                        }
                        break;
                    case 22:
                        {
                        alt3=5;
                        }
                        break;
                    case 58:
                        {
                        alt3=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA3_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 58:
                        {
                        alt3=1;
                        }
                        break;
                    case 16:
                        {
                        alt3=3;
                        }
                        break;
                    case 12:
                        {
                        alt3=2;
                        }
                        break;
                    case 17:
                        {
                        alt3=4;
                        }
                        break;
                    case 22:
                        {
                        alt3=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTyphonML.g:144:3: this_AddEntity_0= ruleAddEntity
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getAddEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddEntity_0=ruleAddEntity();

                    state._fsp--;


                    			current = this_AddEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:153:3: this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getPrimitiveDataType_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveDataType_Impl_1=rulePrimitiveDataType_Impl();

                    state._fsp--;


                    			current = this_PrimitiveDataType_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:162:3: this_FreeText_2= ruleFreeText
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getFreeTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FreeText_2=ruleFreeText();

                    state._fsp--;


                    			current = this_FreeText_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:171:3: this_CustomDataType_3= ruleCustomDataType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getCustomDataTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomDataType_3=ruleCustomDataType();

                    state._fsp--;


                    			current = this_CustomDataType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTyphonML.g:180:3: this_Entity_Impl_4= ruleEntity_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEntity_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_Impl_4=ruleEntity_Impl();

                    state._fsp--;


                    			current = this_Entity_Impl_4;
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


    // $ANTLR start "entryRuleAttribute"
    // InternalTyphonML.g:192:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:192:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:193:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTyphonML.g:199:1: ruleAttribute returns [EObject current=null] : (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;

        EObject this_AddAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:205:2: ( (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) )
            // InternalTyphonML.g:206:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            {
            // InternalTyphonML.g:206:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==53) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==53) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_5>=RULE_STRING && LA4_5<=RULE_ID)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

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
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 53:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTyphonML.g:207:3: this_Attribute_Impl_0= ruleAttribute_Impl
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
                    // InternalTyphonML.g:216:3: this_AddAttribute_1= ruleAddAttribute
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
    // InternalTyphonML.g:228:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:228:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:229:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalTyphonML.g:235:1: ruleRelation returns [EObject current=null] : (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_Impl_0 = null;

        EObject this_AddRelation_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:241:2: ( (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) )
            // InternalTyphonML.g:242:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            {
            // InternalTyphonML.g:242:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==60) ) {
                        alt5=2;
                    }
                    else if ( ((LA5_4>=RULE_STRING && LA5_4<=RULE_ID)) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==RULE_ID) ) {
                    int LA5_5 = input.LA(3);

                    if ( ((LA5_5>=RULE_STRING && LA5_5<=RULE_ID)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_5==60) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

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
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 60:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTyphonML.g:243:3: this_Relation_Impl_0= ruleRelation_Impl
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
                    // InternalTyphonML.g:252:3: this_AddRelation_1= ruleAddRelation
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
    // InternalTyphonML.g:264:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:264:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:265:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalTyphonML.g:271:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_DocumentDB_1 = null;

        EObject this_KeyValueDB_2 = null;

        EObject this_GraphDB_3 = null;

        EObject this_ColumnDB_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:277:2: ( (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) )
            // InternalTyphonML.g:278:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            {
            // InternalTyphonML.g:278:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 44:
                        {
                        alt6=4;
                        }
                        break;
                    case 43:
                        {
                        alt6=3;
                        }
                        break;
                    case 41:
                        {
                        alt6=2;
                        }
                        break;
                    case 47:
                        {
                        alt6=5;
                        }
                        break;
                    case 39:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 7, input);

                        throw nvae;
                    }

                }
                else if ( (LA6_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        alt6=3;
                        }
                        break;
                    case 41:
                        {
                        alt6=2;
                        }
                        break;
                    case 47:
                        {
                        alt6=5;
                        }
                        break;
                    case 39:
                        {
                        alt6=1;
                        }
                        break;
                    case 44:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 8, input);

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
            case 39:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 44:
                {
                alt6=4;
                }
                break;
            case 47:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTyphonML.g:279:3: this_RelationalDB_0= ruleRelationalDB
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
                    // InternalTyphonML.g:288:3: this_DocumentDB_1= ruleDocumentDB
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
                    // InternalTyphonML.g:297:3: this_KeyValueDB_2= ruleKeyValueDB
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
                    // InternalTyphonML.g:306:3: this_GraphDB_3= ruleGraphDB
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
                    // InternalTyphonML.g:315:3: this_ColumnDB_4= ruleColumnDB
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
    // InternalTyphonML.g:327:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:327:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:328:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
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
    // InternalTyphonML.g:334:1: ruleGraphAttribute returns [EObject current=null] : (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_GraphAttribute_Impl_0 = null;

        EObject this_AddGraphAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:340:2: ( (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) )
            // InternalTyphonML.g:341:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            {
            // InternalTyphonML.g:341:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_STRING && LA7_4<=RULE_ID)) ) {
                        alt7=1;
                    }
                    else if ( (LA7_4==56) ) {
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

                    if ( ((LA7_5>=RULE_STRING && LA7_5<=RULE_ID)) ) {
                        alt7=1;
                    }
                    else if ( (LA7_5==56) ) {
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
            case RULE_STRING:
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 56:
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
                    // InternalTyphonML.g:342:3: this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl
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
                    // InternalTyphonML.g:351:3: this_AddGraphAttribute_1= ruleAddGraphAttribute
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
    // InternalTyphonML.g:363:1: entryRuleGraphEdge returns [EObject current=null] : iv_ruleGraphEdge= ruleGraphEdge EOF ;
    public final EObject entryRuleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge = null;


        try {
            // InternalTyphonML.g:363:50: (iv_ruleGraphEdge= ruleGraphEdge EOF )
            // InternalTyphonML.g:364:2: iv_ruleGraphEdge= ruleGraphEdge EOF
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
    // InternalTyphonML.g:370:1: ruleGraphEdge returns [EObject current=null] : (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) ;
    public final EObject ruleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject this_GraphEdge_Impl_0 = null;

        EObject this_AddGraphEdge_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:376:2: ( (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) )
            // InternalTyphonML.g:377:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            {
            // InternalTyphonML.g:377:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==49) ) {
                        alt8=1;
                    }
                    else if ( (LA8_4==54) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==RULE_ID) ) {
                    int LA8_5 = input.LA(3);

                    if ( (LA8_5==54) ) {
                        alt8=2;
                    }
                    else if ( (LA8_5==49) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

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
            case 49:
                {
                alt8=1;
                }
                break;
            case 54:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:378:3: this_GraphEdge_Impl_0= ruleGraphEdge_Impl
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
                    // InternalTyphonML.g:387:3: this_AddGraphEdge_1= ruleAddGraphEdge
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
    // InternalTyphonML.g:399:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:399:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:400:2: iv_ruleEString= ruleEString EOF
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
    // InternalTyphonML.g:406:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:412:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:413:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:413:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:414:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:422:3: this_ID_1= RULE_ID
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
    // InternalTyphonML.g:433:1: entryRulePrimitiveDataType_Impl returns [EObject current=null] : iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF ;
    public final EObject entryRulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType_Impl = null;


        try {
            // InternalTyphonML.g:433:63: (iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF )
            // InternalTyphonML.g:434:2: iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF
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
    // InternalTyphonML.g:440:1: rulePrimitiveDataType_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject rulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:446:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:447:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:447:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) ) )
            // InternalTyphonML.g:448:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'datatype' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalTyphonML.g:448:3: ()
            // InternalTyphonML.g:449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataType_ImplAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:455:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTyphonML.g:456:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:460:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:461:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:461:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:462:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimitiveDataType_ImplAccess().getDatatypeKeyword_2());
            		
            // InternalTyphonML.g:484:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:485:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:485:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:486:5: lv_name_4_0= ruleEString
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
    // InternalTyphonML.g:507:1: entryRuleDataTypeItem returns [EObject current=null] : iv_ruleDataTypeItem= ruleDataTypeItem EOF ;
    public final EObject entryRuleDataTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeItem = null;


        try {
            // InternalTyphonML.g:507:53: (iv_ruleDataTypeItem= ruleDataTypeItem EOF )
            // InternalTyphonML.g:508:2: iv_ruleDataTypeItem= ruleDataTypeItem EOF
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
    // InternalTyphonML.g:514:1: ruleDataTypeItem returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) ;
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
            // InternalTyphonML.g:520:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' ) )
            // InternalTyphonML.g:521:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            {
            // InternalTyphonML.g:521:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']' )
            // InternalTyphonML.g:522:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) ) otherlv_7= ']'
            {
            // InternalTyphonML.g:522:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTyphonML.g:523:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataTypeItemAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:527:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:528:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:528:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:529:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataTypeItemAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:547:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:548:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:548:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:549:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDataTypeItemAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:570:3: ( ( ruleEString ) )
            // InternalTyphonML.g:571:4: ( ruleEString )
            {
            // InternalTyphonML.g:571:4: ( ruleEString )
            // InternalTyphonML.g:572:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeItemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDataTypeItemAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalTyphonML.g:590:3: ( (lv_implementation_6_0= ruleDataTypeImplementationPackage ) )
            // InternalTyphonML.g:591:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            {
            // InternalTyphonML.g:591:4: (lv_implementation_6_0= ruleDataTypeImplementationPackage )
            // InternalTyphonML.g:592:5: lv_implementation_6_0= ruleDataTypeImplementationPackage
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getImplementationDataTypeImplementationPackageParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:617:1: entryRuleDataTypeImplementationPackage returns [EObject current=null] : iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF ;
    public final EObject entryRuleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeImplementationPackage = null;


        try {
            // InternalTyphonML.g:617:70: (iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF )
            // InternalTyphonML.g:618:2: iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF
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
    // InternalTyphonML.g:624:1: ruleDataTypeImplementationPackage returns [EObject current=null] : ( () ( (lv_location_1_0= ruleEString ) ) ) ;
    public final EObject ruleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_location_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:630:2: ( ( () ( (lv_location_1_0= ruleEString ) ) ) )
            // InternalTyphonML.g:631:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:631:2: ( () ( (lv_location_1_0= ruleEString ) ) )
            // InternalTyphonML.g:632:3: () ( (lv_location_1_0= ruleEString ) )
            {
            // InternalTyphonML.g:632:3: ()
            // InternalTyphonML.g:633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeImplementationPackageAccess().getDataTypeImplementationPackageAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:639:3: ( (lv_location_1_0= ruleEString ) )
            // InternalTyphonML.g:640:4: (lv_location_1_0= ruleEString )
            {
            // InternalTyphonML.g:640:4: (lv_location_1_0= ruleEString )
            // InternalTyphonML.g:641:5: lv_location_1_0= ruleEString
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
    // InternalTyphonML.g:662:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalTyphonML.g:662:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalTyphonML.g:663:2: iv_ruleFreeText= ruleFreeText EOF
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
    // InternalTyphonML.g:669:1: ruleFreeText returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:675:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalTyphonML.g:676:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:676:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) ) )
            // InternalTyphonML.g:677:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'FreeText' ( (lv_name_4_0= ruleEString ) )
            {
            // InternalTyphonML.g:677:3: ()
            // InternalTyphonML.g:678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeTextAccess().getFreeTextAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:684:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTyphonML.g:685:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFreeTextAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:689:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:690:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:690:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:691:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFreeTextAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFreeTextAccess().getFreeTextKeyword_2());
            		
            // InternalTyphonML.g:713:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:714:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:714:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:715:5: lv_name_4_0= ruleEString
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
    // InternalTyphonML.g:736:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:736:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:737:2: iv_ruleCustomDataType= ruleCustomDataType EOF
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
    // InternalTyphonML.g:743:1: ruleCustomDataType returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:749:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:750:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:750:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:751:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'customdatatype' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:751:3: ()
            // InternalTyphonML.g:752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:758:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTyphonML.g:759:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:763:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:764:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:764:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:765:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getCustomdatatypeKeyword_2());
            		
            // InternalTyphonML.g:787:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:788:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:788:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:789:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:810:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTyphonML.g:811:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomDataTypeAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:819:4: ( (lv_elements_8_0= ruleDataTypeItem ) )
                    // InternalTyphonML.g:820:5: (lv_elements_8_0= ruleDataTypeItem )
                    {
                    // InternalTyphonML.g:820:5: (lv_elements_8_0= ruleDataTypeItem )
                    // InternalTyphonML.g:821:6: lv_elements_8_0= ruleDataTypeItem
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:838:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTyphonML.g:839:5: otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCustomDataTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:843:5: ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    // InternalTyphonML.g:844:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    {
                    	    // InternalTyphonML.g:844:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    // InternalTyphonML.g:845:7: lv_elements_10_0= ruleDataTypeItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:876:1: entryRuleEntity_Impl returns [EObject current=null] : iv_ruleEntity_Impl= ruleEntity_Impl EOF ;
    public final EObject entryRuleEntity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Impl = null;


        try {
            // InternalTyphonML.g:876:52: (iv_ruleEntity_Impl= ruleEntity_Impl EOF )
            // InternalTyphonML.g:877:2: iv_ruleEntity_Impl= ruleEntity_Impl EOF
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
    // InternalTyphonML.g:883:1: ruleEntity_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) ( ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= 'identifer' ( (lv_identifer_12_0= ruleEntityIdentifier ) ) otherlv_13= '}' ) ;
    public final EObject ruleEntity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_relations_9_0 = null;

        EObject lv_relations_10_0 = null;

        EObject lv_identifer_12_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:889:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) ( ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= 'identifer' ( (lv_identifer_12_0= ruleEntityIdentifier ) ) otherlv_13= '}' ) )
            // InternalTyphonML.g:890:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) ( ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= 'identifer' ( (lv_identifer_12_0= ruleEntityIdentifier ) ) otherlv_13= '}' )
            {
            // InternalTyphonML.g:890:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) ( ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= 'identifer' ( (lv_identifer_12_0= ruleEntityIdentifier ) ) otherlv_13= '}' )
            // InternalTyphonML.g:891:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'entity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) ( ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )* )? ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )? otherlv_11= 'identifer' ( (lv_identifer_12_0= ruleEntityIdentifier ) ) otherlv_13= '}'
            {
            // InternalTyphonML.g:891:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTyphonML.g:892:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntity_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:896:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:897:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:897:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:898:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEntity_ImplAccess().getEntityKeyword_1());
            		
            // InternalTyphonML.g:920:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:921:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:921:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:922:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEntity_ImplAccess().getGenericListKeyword_4());
            		
            // InternalTyphonML.g:947:3: ( ( ruleEString ) )
            // InternalTyphonML.g:948:4: ( ruleEString )
            {
            // InternalTyphonML.g:948:4: ( ruleEString )
            // InternalTyphonML.g:949:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntity_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getGenericListGenericListCrossReference_5_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:963:3: ( ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )* )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_STRING) ) {
                        switch ( input.LA(3) ) {
                            case RULE_STRING:
                                {
                                int LA18_2 = input.LA(4);

                                if ( (LA18_2==13) ) {
                                    int LA18_8 = input.LA(5);

                                    if ( ((LA18_8>=RULE_STRING && LA18_8<=RULE_ID)) ) {
                                        alt18=1;
                                    }
                                }
                                }
                                break;
                            case RULE_ID:
                                {
                                int LA18_3 = input.LA(4);

                                if ( (LA18_3==13) ) {
                                    int LA18_8 = input.LA(5);

                                    if ( ((LA18_8>=RULE_STRING && LA18_8<=RULE_ID)) ) {
                                        alt18=1;
                                    }
                                }
                                }
                                break;
                            case 53:
                                {
                                alt18=1;
                                }
                                break;
                        }

                    }
                    else if ( (LA18_1==RULE_ID) ) {
                        switch ( input.LA(3) ) {
                            case RULE_STRING:
                                {
                                int LA18_2 = input.LA(4);

                                if ( (LA18_2==13) ) {
                                    int LA18_8 = input.LA(5);

                                    if ( ((LA18_8>=RULE_STRING && LA18_8<=RULE_ID)) ) {
                                        alt18=1;
                                    }
                                }
                                }
                                break;
                            case RULE_ID:
                                {
                                int LA18_3 = input.LA(4);

                                if ( (LA18_3==13) ) {
                                    int LA18_8 = input.LA(5);

                                    if ( ((LA18_8>=RULE_STRING && LA18_8<=RULE_ID)) ) {
                                        alt18=1;
                                    }
                                }
                                }
                                break;
                            case 53:
                                {
                                alt18=1;
                                }
                                break;
                        }

                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==13) ) {
                        int LA18_8 = input.LA(3);

                        if ( ((LA18_8>=RULE_STRING && LA18_8<=RULE_ID)) ) {
                            alt18=1;
                        }
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3==13) ) {
                        int LA18_8 = input.LA(3);

                        if ( ((LA18_8>=RULE_STRING && LA18_8<=RULE_ID)) ) {
                            alt18=1;
                        }
                    }
                    }
                    break;
                case 53:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // InternalTyphonML.g:964:4: ( (lv_attributes_7_0= ruleAttribute ) ) ( (lv_attributes_8_0= ruleAttribute ) )*
                    {
                    // InternalTyphonML.g:964:4: ( (lv_attributes_7_0= ruleAttribute ) )
                    // InternalTyphonML.g:965:5: (lv_attributes_7_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:965:5: (lv_attributes_7_0= ruleAttribute )
                    // InternalTyphonML.g:966:6: lv_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_attributes_7_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_7_0,
                    							"it.univaq.disim.typhon.TyphonML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:983:4: ( (lv_attributes_8_0= ruleAttribute ) )*
                    loop17:
                    do {
                        int alt17=2;
                        switch ( input.LA(1) ) {
                        case 11:
                            {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1==RULE_STRING) ) {
                                switch ( input.LA(3) ) {
                                case 53:
                                    {
                                    alt17=1;
                                    }
                                    break;
                                case RULE_STRING:
                                    {
                                    int LA17_2 = input.LA(4);

                                    if ( (LA17_2==13) ) {
                                        int LA17_8 = input.LA(5);

                                        if ( ((LA17_8>=RULE_STRING && LA17_8<=RULE_ID)) ) {
                                            alt17=1;
                                        }


                                    }


                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA17_3 = input.LA(4);

                                    if ( (LA17_3==13) ) {
                                        int LA17_8 = input.LA(5);

                                        if ( ((LA17_8>=RULE_STRING && LA17_8<=RULE_ID)) ) {
                                            alt17=1;
                                        }


                                    }


                                    }
                                    break;

                                }

                            }
                            else if ( (LA17_1==RULE_ID) ) {
                                switch ( input.LA(3) ) {
                                case RULE_STRING:
                                    {
                                    int LA17_2 = input.LA(4);

                                    if ( (LA17_2==13) ) {
                                        int LA17_8 = input.LA(5);

                                        if ( ((LA17_8>=RULE_STRING && LA17_8<=RULE_ID)) ) {
                                            alt17=1;
                                        }


                                    }


                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA17_3 = input.LA(4);

                                    if ( (LA17_3==13) ) {
                                        int LA17_8 = input.LA(5);

                                        if ( ((LA17_8>=RULE_STRING && LA17_8<=RULE_ID)) ) {
                                            alt17=1;
                                        }


                                    }


                                    }
                                    break;
                                case 53:
                                    {
                                    alt17=1;
                                    }
                                    break;

                                }

                            }


                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==13) ) {
                                int LA17_8 = input.LA(3);

                                if ( ((LA17_8>=RULE_STRING && LA17_8<=RULE_ID)) ) {
                                    alt17=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA17_3 = input.LA(2);

                            if ( (LA17_3==13) ) {
                                int LA17_8 = input.LA(3);

                                if ( ((LA17_8>=RULE_STRING && LA17_8<=RULE_ID)) ) {
                                    alt17=1;
                                }


                            }


                            }
                            break;
                        case 53:
                            {
                            alt17=1;
                            }
                            break;

                        }

                        switch (alt17) {
                    	case 1 :
                    	    // InternalTyphonML.g:984:5: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:984:5: (lv_attributes_8_0= ruleAttribute )
                    	    // InternalTyphonML.g:985:6: lv_attributes_8_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_8_0,
                    	    							"it.univaq.disim.typhon.TyphonML.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalTyphonML.g:1003:3: ( ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==11||LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTyphonML.g:1004:4: ( (lv_relations_9_0= ruleRelation ) ) ( (lv_relations_10_0= ruleRelation ) )*
                    {
                    // InternalTyphonML.g:1004:4: ( (lv_relations_9_0= ruleRelation ) )
                    // InternalTyphonML.g:1005:5: (lv_relations_9_0= ruleRelation )
                    {
                    // InternalTyphonML.g:1005:5: (lv_relations_9_0= ruleRelation )
                    // InternalTyphonML.g:1006:6: lv_relations_9_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalTyphonML.g:1023:4: ( (lv_relations_10_0= ruleRelation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||LA19_0==11||LA19_0==60) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTyphonML.g:1024:5: (lv_relations_10_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:1024:5: (lv_relations_10_0= ruleRelation )
                    	    // InternalTyphonML.g:1025:6: lv_relations_10_0= ruleRelation
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_11, grammarAccess.getEntity_ImplAccess().getIdentiferKeyword_8());
            		
            // InternalTyphonML.g:1047:3: ( (lv_identifer_12_0= ruleEntityIdentifier ) )
            // InternalTyphonML.g:1048:4: (lv_identifer_12_0= ruleEntityIdentifier )
            {
            // InternalTyphonML.g:1048:4: (lv_identifer_12_0= ruleEntityIdentifier )
            // InternalTyphonML.g:1049:5: lv_identifer_12_0= ruleEntityIdentifier
            {

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getIdentiferEntityIdentifierParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_16);
            lv_identifer_12_0=ruleEntityIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
            					}
            					set(
            						current,
            						"identifer",
            						lv_identifer_12_0,
            						"it.univaq.disim.typhon.TyphonML.EntityIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:1074:1: entryRuleRelation_Impl returns [EObject current=null] : iv_ruleRelation_Impl= ruleRelation_Impl EOF ;
    public final EObject entryRuleRelation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation_Impl = null;


        try {
            // InternalTyphonML.g:1074:54: (iv_ruleRelation_Impl= ruleRelation_Impl EOF )
            // InternalTyphonML.g:1075:2: iv_ruleRelation_Impl= ruleRelation_Impl EOF
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
    // InternalTyphonML.g:1081:1: ruleRelation_Impl returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) ;
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
            // InternalTyphonML.g:1087:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? ) )
            // InternalTyphonML.g:1088:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            {
            // InternalTyphonML.g:1088:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )? )
            // InternalTyphonML.g:1089:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_isContainment_3_0= ':' ) )? otherlv_4= '->' ( ( ruleEString ) ) (otherlv_6= '.' ( ( ruleEString ) ) )? (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            {
            // InternalTyphonML.g:1089:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTyphonML.g:1090:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelation_ImplAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1094:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1095:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1095:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1096:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:1114:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1115:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1115:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1116:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalTyphonML.g:1133:3: ( (lv_isContainment_3_0= ':' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:1134:4: (lv_isContainment_3_0= ':' )
                    {
                    // InternalTyphonML.g:1134:4: (lv_isContainment_3_0= ':' )
                    // InternalTyphonML.g:1135:5: lv_isContainment_3_0= ':'
                    {
                    lv_isContainment_3_0=(Token)match(input,13,FOLLOW_23); 

                    					newLeafNode(lv_isContainment_3_0, grammarAccess.getRelation_ImplAccess().getIsContainmentColonKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelation_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getRelation_ImplAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTyphonML.g:1151:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1152:4: ( ruleEString )
            {
            // InternalTyphonML.g:1152:4: ( ruleEString )
            // InternalTyphonML.g:1153:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelation_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getTypeEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1167:3: (otherlv_6= '.' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:1168:4: otherlv_6= '.' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelation_ImplAccess().getFullStopKeyword_5_0());
                    			
                    // InternalTyphonML.g:1172:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1173:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1173:5: ( ruleEString )
                    // InternalTyphonML.g:1174:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getOppositeRelationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1189:3: (otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTyphonML.g:1190:4: otherlv_8= '[' ( (lv_cardinality_9_0= ruleCardinality ) ) otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelation_ImplAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalTyphonML.g:1194:4: ( (lv_cardinality_9_0= ruleCardinality ) )
                    // InternalTyphonML.g:1195:5: (lv_cardinality_9_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:1195:5: (lv_cardinality_9_0= ruleCardinality )
                    // InternalTyphonML.g:1196:6: lv_cardinality_9_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getCardinalityCardinalityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_10=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:1222:1: entryRuleEntityIdentifier returns [EObject current=null] : iv_ruleEntityIdentifier= ruleEntityIdentifier EOF ;
    public final EObject entryRuleEntityIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityIdentifier = null;


        try {
            // InternalTyphonML.g:1222:57: (iv_ruleEntityIdentifier= ruleEntityIdentifier EOF )
            // InternalTyphonML.g:1223:2: iv_ruleEntityIdentifier= ruleEntityIdentifier EOF
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
    // InternalTyphonML.g:1229:1: ruleEntityIdentifier returns [EObject current=null] : ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEntityIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1235:2: ( ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? ) )
            // InternalTyphonML.g:1236:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? )
            {
            // InternalTyphonML.g:1236:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? )
            // InternalTyphonML.g:1237:3: () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )?
            {
            // InternalTyphonML.g:1237:3: ()
            // InternalTyphonML.g:1238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityIdentifierAccess().getEntityIdentifierAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1244:3: (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTyphonML.g:1245:4: otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityIdentifierAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTyphonML.g:1249:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1250:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1250:5: ( ruleEString )
                    // InternalTyphonML.g:1251:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityIdentifierRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityIdentifierAccess().getAttributesAttributeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1265:4: (otherlv_3= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalTyphonML.g:1266:5: otherlv_3= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEntityIdentifierAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTyphonML.g:1270:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:1271:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:1271:6: ( ruleEString )
                    	    // InternalTyphonML.g:1272:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntityIdentifierRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntityIdentifierAccess().getAttributesAttributeCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGenericList_Impl"
    // InternalTyphonML.g:1296:1: entryRuleGenericList_Impl returns [EObject current=null] : iv_ruleGenericList_Impl= ruleGenericList_Impl EOF ;
    public final EObject entryRuleGenericList_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericList_Impl = null;


        try {
            // InternalTyphonML.g:1296:57: (iv_ruleGenericList_Impl= ruleGenericList_Impl EOF )
            // InternalTyphonML.g:1297:2: iv_ruleGenericList_Impl= ruleGenericList_Impl EOF
            {
             newCompositeNode(grammarAccess.getGenericList_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericList_Impl=ruleGenericList_Impl();

            state._fsp--;

             current =iv_ruleGenericList_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericList_Impl"


    // $ANTLR start "ruleGenericList_Impl"
    // InternalTyphonML.g:1303:1: ruleGenericList_Impl returns [EObject current=null] : (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleGenericList_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1309:2: ( (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:1310:2: (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:1310:2: (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:1311:3: otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGenericList_ImplAccess().getGenericListKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getGenericList_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGenericList_ImplAccess().getEntityKeyword_2());
            		
            // InternalTyphonML.g:1323:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1324:4: ( ruleEString )
            {
            // InternalTyphonML.g:1324:4: ( ruleEString )
            // InternalTyphonML.g:1325:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenericList_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGenericList_ImplAccess().getEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGenericList_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericList_Impl"


    // $ANTLR start "entryRuleTable"
    // InternalTyphonML.g:1347:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:1347:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:1348:2: iv_ruleTable= ruleTable EOF
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
    // InternalTyphonML.g:1354:1: ruleTable returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:1360:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' ) )
            // InternalTyphonML.g:1361:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:1361:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}' )
            // InternalTyphonML.g:1362:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'table' otherlv_3= '{' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? ( (lv_indexSpec_9_0= ruleIndexSpec ) )? ( (lv_idSpec_10_0= ruleIdSpec ) )? otherlv_11= '}'
            {
            // InternalTyphonML.g:1362:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTyphonML.g:1363:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getTableAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1367:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1368:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1368:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1369:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:1395:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:1396:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:1396:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:1397:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:1418:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1419:4: ( ruleEString )
            {
            // InternalTyphonML.g:1419:4: ( ruleEString )
            // InternalTyphonML.g:1420:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1434:3: (otherlv_7= 'db' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTyphonML.g:1435:4: otherlv_7= 'db' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDbKeyword_6_0());
                    			
                    // InternalTyphonML.g:1439:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1440:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1440:5: ( ruleEString )
                    // InternalTyphonML.g:1441:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTableAccess().getDbDatabaseCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1456:3: ( (lv_indexSpec_9_0= ruleIndexSpec ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==11||LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTyphonML.g:1457:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:1457:4: (lv_indexSpec_9_0= ruleIndexSpec )
                    // InternalTyphonML.g:1458:5: lv_indexSpec_9_0= ruleIndexSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_31);
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

            // InternalTyphonML.g:1475:3: ( (lv_idSpec_10_0= ruleIdSpec ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTyphonML.g:1476:4: (lv_idSpec_10_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:1476:4: (lv_idSpec_10_0= ruleIdSpec )
                    // InternalTyphonML.g:1477:5: lv_idSpec_10_0= ruleIdSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_16);
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
    // InternalTyphonML.g:1502:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalTyphonML.g:1502:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalTyphonML.g:1503:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalTyphonML.g:1509:1: ruleCollection returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1515:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1516:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1516:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1517:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:1517:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==11) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTyphonML.g:1518:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1522:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1523:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1523:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1524:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:1542:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1543:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1543:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1544:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1565:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1566:4: ( ruleEString )
            {
            // InternalTyphonML.g:1566:4: ( ruleEString )
            // InternalTyphonML.g:1567:5: ruleEString
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
    // InternalTyphonML.g:1585:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:1585:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:1586:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
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
    // InternalTyphonML.g:1592:1: ruleKeyValueElement returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
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
            // InternalTyphonML.g:1598:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:1599:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:1599:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:1600:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? ( (lv_key_2_0= ruleEString ) ) otherlv_3= '->' otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:1600:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTyphonML.g:1601:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getKeyValueElementAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1605:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1606:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1606:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1607:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:1625:3: ( (lv_key_2_0= ruleEString ) )
            // InternalTyphonML.g:1626:4: (lv_key_2_0= ruleEString )
            {
            // InternalTyphonML.g:1626:4: (lv_key_2_0= ruleEString )
            // InternalTyphonML.g:1627:5: lv_key_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueElementAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:1656:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1657:4: ( ruleEString )
            {
            // InternalTyphonML.g:1657:4: ( ruleEString )
            // InternalTyphonML.g:1658:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1672:3: (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTyphonML.g:1673:4: otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueElementAccess().getValuesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getKeyValueElementAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:1681:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1682:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1682:5: ( ruleEString )
                    // InternalTyphonML.g:1683:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyValueElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1697:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalTyphonML.g:1698:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getKeyValueElementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:1702:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:1703:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:1703:6: ( ruleEString )
                    	    // InternalTyphonML.g:1704:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeyValueElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getKeyValueElementAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:1732:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // InternalTyphonML.g:1732:50: (iv_ruleGraphNode= ruleGraphNode EOF )
            // InternalTyphonML.g:1733:2: iv_ruleGraphNode= ruleGraphNode EOF
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
    // InternalTyphonML.g:1739:1: ruleGraphNode returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // InternalTyphonML.g:1745:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:1746:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:1746:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalTyphonML.g:1747:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:1747:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==11) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTyphonML.g:1748:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getGraphNodeAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1752:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1753:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1753:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1754:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphNodeAccess().getNodeKeyword_1());
            		
            // InternalTyphonML.g:1776:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:1777:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:1777:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:1778:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphNodeAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:1803:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1804:4: ( ruleEString )
            {
            // InternalTyphonML.g:1804:4: ( ruleEString )
            // InternalTyphonML.g:1805:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1819:3: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTyphonML.g:1820:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphNodeAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:1828:4: ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    // InternalTyphonML.g:1829:5: (lv_attributes_9_0= ruleGraphAttribute )
                    {
                    // InternalTyphonML.g:1829:5: (lv_attributes_9_0= ruleGraphAttribute )
                    // InternalTyphonML.g:1830:6: lv_attributes_9_0= ruleGraphAttribute
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:1847:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalTyphonML.g:1848:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_36); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getGraphNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:1852:5: ( (lv_attributes_11_0= ruleGraphAttribute ) )
                    	    // InternalTyphonML.g:1853:6: (lv_attributes_11_0= ruleGraphAttribute )
                    	    {
                    	    // InternalTyphonML.g:1853:6: (lv_attributes_11_0= ruleGraphAttribute )
                    	    // InternalTyphonML.g:1854:7: lv_attributes_11_0= ruleGraphAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:1885:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTyphonML.g:1885:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTyphonML.g:1886:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalTyphonML.g:1892:1: ruleColumn returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
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
            // InternalTyphonML.g:1898:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:1899:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:1899:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:1900:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalTyphonML.g:1900:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==11) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTyphonML.g:1901:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:1905:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:1906:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:1906:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:1907:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalTyphonML.g:1929:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:1930:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:1930:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:1931:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:1956:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1957:4: ( ruleEString )
            {
            // InternalTyphonML.g:1957:4: ( ruleEString )
            // InternalTyphonML.g:1958:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColumnAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1972:3: (otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTyphonML.g:1973:4: otherlv_7= 'attributes' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:1981:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1982:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1982:5: ( ruleEString )
                    // InternalTyphonML.g:1983:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1997:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTyphonML.g:1998:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2002:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2003:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2003:6: ( ruleEString )
                    	    // InternalTyphonML.g:2004:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_16); 

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
    // InternalTyphonML.g:2032:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:2032:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:2033:2: iv_ruleIndexSpec= ruleIndexSpec EOF
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
    // InternalTyphonML.g:2039:1: ruleIndexSpec returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:2045:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:2046:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:2046:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTyphonML.g:2047:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'index' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:2047:3: ()
            // InternalTyphonML.g:2048:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2054:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTyphonML.g:2055:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2059:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2060:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2060:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2061:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getIndexKeyword_2());
            		
            // InternalTyphonML.g:2083:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2084:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2084:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2085:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2106:3: (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTyphonML.g:2107:4: otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexSpecAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTyphonML.g:2115:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2116:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2116:5: ( ruleEString )
                    // InternalTyphonML.g:2117:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2131:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==20) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalTyphonML.g:2132:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getIndexSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2136:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2137:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2137:6: ( ruleEString )
                    	    // InternalTyphonML.g:2138:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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

                    otherlv_11=(Token)match(input,28,FOLLOW_40); 

                    				newLeafNode(otherlv_11, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:2158:3: (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTyphonML.g:2159:4: otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexSpecAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2167:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2168:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2168:5: ( ruleEString )
                    // InternalTyphonML.g:2169:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2183:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalTyphonML.g:2184:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getIndexSpecAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2188:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2189:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2189:6: ( ruleEString )
                    	    // InternalTyphonML.g:2190:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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

                    otherlv_17=(Token)match(input,28,FOLLOW_16); 

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
    // InternalTyphonML.g:2218:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:2218:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:2219:2: iv_ruleIdSpec= ruleIdSpec EOF
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
    // InternalTyphonML.g:2225:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:2231:2: ( ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalTyphonML.g:2232:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalTyphonML.g:2232:2: ( () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalTyphonML.g:2233:3: () otherlv_1= 'idSpec' (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalTyphonML.g:2233:3: ()
            // InternalTyphonML.g:2234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdSpecKeyword_1());
            		
            // InternalTyphonML.g:2244:3: (otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTyphonML.g:2245:4: otherlv_2= '(' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTyphonML.g:2249:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2250:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2250:5: ( ruleEString )
                    // InternalTyphonML.g:2251:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2265:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==20) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalTyphonML.g:2266:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTyphonML.g:2270:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2271:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2271:6: ( ruleEString )
                    	    // InternalTyphonML.g:2272:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIdSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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

                    otherlv_6=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTyphonML.g:2296:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:2296:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:2297:2: iv_ruleRelationalDB= ruleRelationalDB EOF
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
    // InternalTyphonML.g:2303:1: ruleRelationalDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2309:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2310:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2310:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:2311:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'relationaldb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2311:3: ()
            // InternalTyphonML.g:2312:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2318:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTyphonML.g:2319:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2323:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2324:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2324:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2325:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_2());
            		
            // InternalTyphonML.g:2347:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2348:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2348:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2349:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2370:3: (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTyphonML.g:2371:4: otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) ( (lv_tables_9_0= ruleTable ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationalDBAccess().getTablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2379:4: ( (lv_tables_8_0= ruleTable ) )
                    // InternalTyphonML.g:2380:5: (lv_tables_8_0= ruleTable )
                    {
                    // InternalTyphonML.g:2380:5: (lv_tables_8_0= ruleTable )
                    // InternalTyphonML.g:2381:6: lv_tables_8_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalTyphonML.g:2398:4: ( (lv_tables_9_0= ruleTable ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==11||LA49_0==30) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalTyphonML.g:2399:5: (lv_tables_9_0= ruleTable )
                    	    {
                    	    // InternalTyphonML.g:2399:5: (lv_tables_9_0= ruleTable )
                    	    // InternalTyphonML.g:2400:6: lv_tables_9_0= ruleTable
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_45);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:2430:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:2430:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:2431:2: iv_ruleDocumentDB= ruleDocumentDB EOF
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
    // InternalTyphonML.g:2437:1: ruleDocumentDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalTyphonML.g:2443:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalTyphonML.g:2444:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalTyphonML.g:2444:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalTyphonML.g:2445:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'documentdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalTyphonML.g:2445:3: ()
            // InternalTyphonML.g:2446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2452:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTyphonML.g:2453:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2457:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2458:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2458:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2459:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            otherlv_3=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_2());
            		
            // InternalTyphonML.g:2481:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2482:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2482:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2483:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2504:3: (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTyphonML.g:2505:4: otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) ( (lv_collections_9_0= ruleCollection ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentDBAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2513:4: ( (lv_collections_8_0= ruleCollection ) )
                    // InternalTyphonML.g:2514:5: (lv_collections_8_0= ruleCollection )
                    {
                    // InternalTyphonML.g:2514:5: (lv_collections_8_0= ruleCollection )
                    // InternalTyphonML.g:2515:6: lv_collections_8_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_48);
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

                    // InternalTyphonML.g:2532:4: ( (lv_collections_9_0= ruleCollection ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==11) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalTyphonML.g:2533:5: (lv_collections_9_0= ruleCollection )
                    	    {
                    	    // InternalTyphonML.g:2533:5: (lv_collections_9_0= ruleCollection )
                    	    // InternalTyphonML.g:2534:6: lv_collections_9_0= ruleCollection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:2564:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:2564:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:2565:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
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
    // InternalTyphonML.g:2571:1: ruleKeyValueDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:2577:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2578:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2578:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2579:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'keyvaluedb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2579:3: ()
            // InternalTyphonML.g:2580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2586:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTyphonML.g:2587:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2591:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2592:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2592:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2593:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            otherlv_3=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_2());
            		
            // InternalTyphonML.g:2615:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2616:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2616:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2617:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2638:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTyphonML.g:2639:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeyValueDBAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2647:4: ( (lv_elements_8_0= ruleKeyValueElement ) )
                    // InternalTyphonML.g:2648:5: (lv_elements_8_0= ruleKeyValueElement )
                    {
                    // InternalTyphonML.g:2648:5: (lv_elements_8_0= ruleKeyValueElement )
                    // InternalTyphonML.g:2649:6: lv_elements_8_0= ruleKeyValueElement
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:2666:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==20) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalTyphonML.g:2667:5: otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getKeyValueDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2671:5: ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    // InternalTyphonML.g:2672:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    {
                    	    // InternalTyphonML.g:2672:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    // InternalTyphonML.g:2673:7: lv_elements_10_0= ruleKeyValueElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:2704:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:2704:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:2705:2: iv_ruleGraphDB= ruleGraphDB EOF
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
    // InternalTyphonML.g:2711:1: ruleGraphDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalTyphonML.g:2717:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:2718:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:2718:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:2719:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'graphdb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:2719:3: ()
            // InternalTyphonML.g:2720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2726:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==11) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTyphonML.g:2727:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2731:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2732:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2732:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2733:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

            otherlv_3=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getGraphdbKeyword_2());
            		
            // InternalTyphonML.g:2755:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2756:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2756:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2757:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_51); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2778:3: (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTyphonML.g:2779:4: otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getNodesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_52); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2787:4: ( (lv_nodes_8_0= ruleGraphNode ) )
                    // InternalTyphonML.g:2788:5: (lv_nodes_8_0= ruleGraphNode )
                    {
                    // InternalTyphonML.g:2788:5: (lv_nodes_8_0= ruleGraphNode )
                    // InternalTyphonML.g:2789:6: lv_nodes_8_0= ruleGraphNode
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:2806:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==20) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalTyphonML.g:2807:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_52); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGraphDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2811:5: ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    // InternalTyphonML.g:2812:6: (lv_nodes_10_0= ruleGraphNode )
                    	    {
                    	    // InternalTyphonML.g:2812:6: (lv_nodes_10_0= ruleGraphNode )
                    	    // InternalTyphonML.g:2813:7: lv_nodes_10_0= ruleGraphNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_53); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:2836:3: (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTyphonML.g:2837:4: otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,46,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphDBAccess().getEdgesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_54); 

                    				newLeafNode(otherlv_13, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:2845:4: ( (lv_edges_14_0= ruleGraphEdge ) )
                    // InternalTyphonML.g:2846:5: (lv_edges_14_0= ruleGraphEdge )
                    {
                    // InternalTyphonML.g:2846:5: (lv_edges_14_0= ruleGraphEdge )
                    // InternalTyphonML.g:2847:6: lv_edges_14_0= ruleGraphEdge
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:2864:4: (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==20) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTyphonML.g:2865:5: otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_54); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGraphDBAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2869:5: ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    // InternalTyphonML.g:2870:6: (lv_edges_16_0= ruleGraphEdge )
                    	    {
                    	    // InternalTyphonML.g:2870:6: (lv_edges_16_0= ruleGraphEdge )
                    	    // InternalTyphonML.g:2871:7: lv_edges_16_0= ruleGraphEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:2902:1: entryRuleColumnDB returns [EObject current=null] : iv_ruleColumnDB= ruleColumnDB EOF ;
    public final EObject entryRuleColumnDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDB = null;


        try {
            // InternalTyphonML.g:2902:49: (iv_ruleColumnDB= ruleColumnDB EOF )
            // InternalTyphonML.g:2903:2: iv_ruleColumnDB= ruleColumnDB EOF
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
    // InternalTyphonML.g:2909:1: ruleColumnDB returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:2915:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2916:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2916:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2917:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'columndb' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2917:3: ()
            // InternalTyphonML.g:2918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDBAccess().getColumnDBAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:2924:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==11) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTyphonML.g:2925:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnDBAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:2929:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:2930:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:2930:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:2931:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            otherlv_3=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDBAccess().getColumndbKeyword_2());
            		
            // InternalTyphonML.g:2953:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:2954:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:2954:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:2955:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_56); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:2976:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==48) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTyphonML.g:2977:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnDBAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_57); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2985:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalTyphonML.g:2986:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalTyphonML.g:2986:5: (lv_columns_8_0= ruleColumn )
                    // InternalTyphonML.g:2987:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:3004:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==20) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalTyphonML.g:3005:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_57); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getColumnDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3009:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalTyphonML.g:3010:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalTyphonML.g:3010:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalTyphonML.g:3011:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:3042:1: entryRuleGraphEdge_Impl returns [EObject current=null] : iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF ;
    public final EObject entryRuleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge_Impl = null;


        try {
            // InternalTyphonML.g:3042:55: (iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF )
            // InternalTyphonML.g:3043:2: iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF
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
    // InternalTyphonML.g:3049:1: ruleGraphEdge_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:3055:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3056:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3056:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3057:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'edge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3057:3: ()
            // InternalTyphonML.g:3058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3064:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==11) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTyphonML.g:3065:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3069:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3070:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3070:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3071:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_58);
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

            otherlv_3=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdge_ImplAccess().getEdgeKeyword_2());
            		
            // InternalTyphonML.g:3093:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3094:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3094:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3095:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_59); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3116:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==50) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTyphonML.g:3117:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdge_ImplAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:3121:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3122:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3122:5: ( ruleEString )
                    // InternalTyphonML.g:3123:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3138:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTyphonML.g:3139:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphEdge_ImplAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:3143:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3144:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3144:5: ( ruleEString )
                    // InternalTyphonML.g:3145:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3160:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==52) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTyphonML.g:3161:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphEdge_ImplAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3169:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:3170:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:3170:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:3171:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:3188:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==20) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalTyphonML.g:3189:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getGraphEdge_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3193:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:3194:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:3194:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:3195:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:3226:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:3226:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:3227:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
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
    // InternalTyphonML.g:3233:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3239:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:3240:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:3240:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:3241:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:3241:3: ()
            // InternalTyphonML.g:3242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3248:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==11) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTyphonML.g:3249:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3253:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3254:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3254:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3255:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:3273:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3274:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3274:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3275:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:3296:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3297:4: ( ruleEString )
            {
            // InternalTyphonML.g:3297:4: ( ruleEString )
            // InternalTyphonML.g:3298:5: ruleEString
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
    // InternalTyphonML.g:3316:1: entryRuleAddAttribute returns [EObject current=null] : iv_ruleAddAttribute= ruleAddAttribute EOF ;
    public final EObject entryRuleAddAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttribute = null;


        try {
            // InternalTyphonML.g:3316:53: (iv_ruleAddAttribute= ruleAddAttribute EOF )
            // InternalTyphonML.g:3317:2: iv_ruleAddAttribute= ruleAddAttribute EOF
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
    // InternalTyphonML.g:3323:1: ruleAddAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAddAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3329:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:3330:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:3330:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:3331:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:3331:3: ()
            // InternalTyphonML.g:3332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAttributeAccess().getAddAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3338:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==11) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTyphonML.g:3339:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3343:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3344:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3344:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3345:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_62);
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

            otherlv_3=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributeAccess().getAddAttributeKeyword_2());
            		
            // InternalTyphonML.g:3367:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3368:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3368:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3369:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAddAttributeAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:3390:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3391:4: ( ruleEString )
            {
            // InternalTyphonML.g:3391:4: ( ruleEString )
            // InternalTyphonML.g:3392:5: ruleEString
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
    // InternalTyphonML.g:3410:1: entryRuleAddGraphEdge returns [EObject current=null] : iv_ruleAddGraphEdge= ruleAddGraphEdge EOF ;
    public final EObject entryRuleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphEdge = null;


        try {
            // InternalTyphonML.g:3410:53: (iv_ruleAddGraphEdge= ruleAddGraphEdge EOF )
            // InternalTyphonML.g:3411:2: iv_ruleAddGraphEdge= ruleAddGraphEdge EOF
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
    // InternalTyphonML.g:3417:1: ruleAddGraphEdge returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalTyphonML.g:3423:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3424:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3424:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3425:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphEdge' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3425:3: ()
            // InternalTyphonML.g:3426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3432:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==11) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTyphonML.g:3433:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3437:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3438:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3438:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3439:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            otherlv_3=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeKeyword_2());
            		
            // InternalTyphonML.g:3461:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3462:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3462:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3463:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_59); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3484:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==50) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalTyphonML.g:3485:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphEdgeAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:3489:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3490:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3490:5: ( ruleEString )
                    // InternalTyphonML.g:3491:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3506:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==51) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTyphonML.g:3507:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddGraphEdgeAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:3511:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3512:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3512:5: ( ruleEString )
                    // InternalTyphonML.g:3513:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3528:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==52) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalTyphonML.g:3529:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddGraphEdgeAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3537:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:3538:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:3538:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:3539:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:3556:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==20) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalTyphonML.g:3557:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAddGraphEdgeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3561:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:3562:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:3562:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:3563:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,21,FOLLOW_16); 

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
    // InternalTyphonML.g:3594:1: entryRuleGraphAttribute_Impl returns [EObject current=null] : iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF ;
    public final EObject entryRuleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute_Impl = null;


        try {
            // InternalTyphonML.g:3594:60: (iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF )
            // InternalTyphonML.g:3595:2: iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF
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
    // InternalTyphonML.g:3601:1: ruleGraphAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) ;
    public final EObject ruleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3607:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:3608:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:3608:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )? )
            // InternalTyphonML.g:3609:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '=' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:3609:3: ()
            // InternalTyphonML.g:3610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3616:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==11) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTyphonML.g:3617:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3621:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3622:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3622:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3623:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:3641:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3642:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3642:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3643:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_4=(Token)match(input,55,FOLLOW_65); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAttribute_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalTyphonML.g:3664:3: ( ( ruleEString ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_ID)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTyphonML.g:3665:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:3665:4: ( ruleEString )
                    // InternalTyphonML.g:3666:5: ruleEString
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
    // InternalTyphonML.g:3684:1: entryRuleAddGraphAttribute returns [EObject current=null] : iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF ;
    public final EObject entryRuleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphAttribute = null;


        try {
            // InternalTyphonML.g:3684:58: (iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF )
            // InternalTyphonML.g:3685:2: iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF
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
    // InternalTyphonML.g:3691:1: ruleAddGraphAttribute returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalTyphonML.g:3697:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:3698:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:3698:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:3699:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? otherlv_3= 'AddGraphAttribute' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:3699:3: ()
            // InternalTyphonML.g:3700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:3706:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==11) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTyphonML.g:3707:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:3711:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:3712:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:3712:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:3713:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

            otherlv_3=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeKeyword_2());
            		
            // InternalTyphonML.g:3735:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTyphonML.g:3736:4: (lv_name_4_0= ruleEString )
            {
            // InternalTyphonML.g:3736:4: (lv_name_4_0= ruleEString )
            // InternalTyphonML.g:3737:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,18,FOLLOW_67); 

            			newLeafNode(otherlv_5, grammarAccess.getAddGraphAttributeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:3758:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==57) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTyphonML.g:3759:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:3763:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3764:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3764:5: ( ruleEString )
                    // InternalTyphonML.g:3765:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getValueAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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
    // InternalTyphonML.g:3788:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalTyphonML.g:3788:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalTyphonML.g:3789:2: iv_ruleAddEntity= ruleAddEntity EOF
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
    // InternalTyphonML.g:3795:1: ruleAddEntity returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' ) ;
    public final EObject ruleAddEntity() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_relations_15_0 = null;

        EObject lv_relations_17_0 = null;

        EObject lv_identifer_20_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3801:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' ) )
            // InternalTyphonML.g:3802:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' )
            {
            // InternalTyphonML.g:3802:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' )
            // InternalTyphonML.g:3803:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddEntity' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}'
            {
            // InternalTyphonML.g:3803:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==11) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTyphonML.g:3804:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddEntityAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:3808:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:3809:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:3809:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:3810:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            otherlv_2=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAddEntityAccess().getAddEntityKeyword_1());
            		
            // InternalTyphonML.g:3832:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:3833:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:3833:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:3834:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAddEntityAccess().getGenericListKeyword_4());
            		
            // InternalTyphonML.g:3859:3: ( ( ruleEString ) )
            // InternalTyphonML.g:3860:4: ( ruleEString )
            {
            // InternalTyphonML.g:3860:4: ( ruleEString )
            // InternalTyphonML.g:3861:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddEntityAccess().getGenericListGenericListCrossReference_5_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:3875:3: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==34) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTyphonML.g:3876:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddEntityAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_70); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:3884:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalTyphonML.g:3885:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:3885:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalTyphonML.g:3886:6: lv_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:3903:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==20) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalTyphonML.g:3904:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_70); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAddEntityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3908:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalTyphonML.g:3909:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:3909:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalTyphonML.g:3910:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_11_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,21,FOLLOW_71); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3933:3: (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==59) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalTyphonML.g:3934:4: otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,59,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getAddEntityAccess().getRelationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_72); 

                    				newLeafNode(otherlv_14, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3942:4: ( (lv_relations_15_0= ruleRelation ) )
                    // InternalTyphonML.g:3943:5: (lv_relations_15_0= ruleRelation )
                    {
                    // InternalTyphonML.g:3943:5: (lv_relations_15_0= ruleRelation )
                    // InternalTyphonML.g:3944:6: lv_relations_15_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalTyphonML.g:3961:4: (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==20) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalTyphonML.g:3962:5: otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,20,FOLLOW_72); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getAddEntityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3966:5: ( (lv_relations_17_0= ruleRelation ) )
                    	    // InternalTyphonML.g:3967:6: (lv_relations_17_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:3967:6: (lv_relations_17_0= ruleRelation )
                    	    // InternalTyphonML.g:3968:7: lv_relations_17_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_relations_17_0=ruleRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relations",
                    	    								lv_relations_17_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Relation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_73); 

                    				newLeafNode(otherlv_18, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_19, grammarAccess.getAddEntityAccess().getIdentiferKeyword_8());
            		
            // InternalTyphonML.g:3995:3: ( (lv_identifer_20_0= ruleEntityIdentifier ) )
            // InternalTyphonML.g:3996:4: (lv_identifer_20_0= ruleEntityIdentifier )
            {
            // InternalTyphonML.g:3996:4: (lv_identifer_20_0= ruleEntityIdentifier )
            // InternalTyphonML.g:3997:5: lv_identifer_20_0= ruleEntityIdentifier
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getIdentiferEntityIdentifierParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_16);
            lv_identifer_20_0=ruleEntityIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddEntityRule());
            					}
            					set(
            						current,
            						"identifer",
            						lv_identifer_20_0,
            						"it.univaq.disim.typhon.TyphonML.EntityIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:4022:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalTyphonML.g:4022:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalTyphonML.g:4023:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalTyphonML.g:4029:1: ruleAttribute_Impl returns [EObject current=null] : ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4035:2: ( ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:4036:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:4036:2: ( () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:4037:3: () (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4037:3: ()
            // InternalTyphonML.g:4038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:4044:3: (otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==11) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTyphonML.g:4045:4: otherlv_1= 'importedNamespace' ( (lv_importedNamespace_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttribute_ImplAccess().getImportedNamespaceKeyword_1_0());
                    			
                    // InternalTyphonML.g:4049:4: ( (lv_importedNamespace_2_0= ruleEString ) )
                    // InternalTyphonML.g:4050:5: (lv_importedNamespace_2_0= ruleEString )
                    {
                    // InternalTyphonML.g:4050:5: (lv_importedNamespace_2_0= ruleEString )
                    // InternalTyphonML.g:4051:6: lv_importedNamespace_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalTyphonML.g:4069:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4070:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4070:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4071:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAttribute_ImplAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:4092:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4093:4: ( ruleEString )
            {
            // InternalTyphonML.g:4093:4: ( ruleEString )
            // InternalTyphonML.g:4094:5: ruleEString
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
    // InternalTyphonML.g:4112:1: entryRuleAddRelation returns [EObject current=null] : iv_ruleAddRelation= ruleAddRelation EOF ;
    public final EObject entryRuleAddRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRelation = null;


        try {
            // InternalTyphonML.g:4112:52: (iv_ruleAddRelation= ruleAddRelation EOF )
            // InternalTyphonML.g:4113:2: iv_ruleAddRelation= ruleAddRelation EOF
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
    // InternalTyphonML.g:4119:1: ruleAddRelation returns [EObject current=null] : ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' ) ;
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
            // InternalTyphonML.g:4125:2: ( ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:4126:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:4126:2: ( (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}' )
            // InternalTyphonML.g:4127:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )? otherlv_2= 'AddRelation' ( (lv_name_3_0= ruleEString ) ) ( (lv_isContainment_4_0= ':' ) )? otherlv_5= '->' ( ( ruleEString ) ) (otherlv_7= '.' ( ( ruleEString ) ) )? (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:4127:3: (otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==11) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalTyphonML.g:4128:4: otherlv_0= 'importedNamespace' ( (lv_importedNamespace_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getAddRelationAccess().getImportedNamespaceKeyword_0_0());
                    			
                    // InternalTyphonML.g:4132:4: ( (lv_importedNamespace_1_0= ruleEString ) )
                    // InternalTyphonML.g:4133:5: (lv_importedNamespace_1_0= ruleEString )
                    {
                    // InternalTyphonML.g:4133:5: (lv_importedNamespace_1_0= ruleEString )
                    // InternalTyphonML.g:4134:6: lv_importedNamespace_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getImportedNamespaceEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            otherlv_2=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAddRelationAccess().getAddRelationKeyword_1());
            		
            // InternalTyphonML.g:4156:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTyphonML.g:4157:4: (lv_name_3_0= ruleEString )
            {
            // InternalTyphonML.g:4157:4: (lv_name_3_0= ruleEString )
            // InternalTyphonML.g:4158:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddRelationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalTyphonML.g:4175:3: ( (lv_isContainment_4_0= ':' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==13) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTyphonML.g:4176:4: (lv_isContainment_4_0= ':' )
                    {
                    // InternalTyphonML.g:4176:4: (lv_isContainment_4_0= ':' )
                    // InternalTyphonML.g:4177:5: lv_isContainment_4_0= ':'
                    {
                    lv_isContainment_4_0=(Token)match(input,13,FOLLOW_23); 

                    					newLeafNode(lv_isContainment_4_0, grammarAccess.getAddRelationAccess().getIsContainmentColonKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAddRelationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalTyphonML.g:4193:3: ( ( ruleEString ) )
            // InternalTyphonML.g:4194:4: ( ruleEString )
            {
            // InternalTyphonML.g:4194:4: ( ruleEString )
            // InternalTyphonML.g:4195:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddRelationAccess().getTypeEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_75);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:4209:3: (otherlv_7= '.' ( ( ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==26) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalTyphonML.g:4210:4: otherlv_7= '.' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddRelationAccess().getFullStopKeyword_6_0());
                    			
                    // InternalTyphonML.g:4214:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4215:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4215:5: ( ruleEString )
                    // InternalTyphonML.g:4216:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getOppositeRelationCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4231:3: (otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==14) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTyphonML.g:4232:4: otherlv_9= '[' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ']'
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddRelationAccess().getLeftSquareBracketKeyword_7_0());
                    			
                    // InternalTyphonML.g:4236:4: ( (lv_cardinality_10_0= ruleCardinality ) )
                    // InternalTyphonML.g:4237:5: (lv_cardinality_10_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:4237:5: (lv_cardinality_10_0= ruleCardinality )
                    // InternalTyphonML.g:4238:6: lv_cardinality_10_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getCardinalityCardinalityEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddRelationAccess().getRightSquareBracketKeyword_7_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTyphonML.g:4268:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:4274:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) )
            // InternalTyphonML.g:4275:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            {
            // InternalTyphonML.g:4275:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt91=1;
                }
                break;
            case 62:
                {
                alt91=2;
                }
                break;
            case 63:
                {
                alt91=3;
                }
                break;
            case 64:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalTyphonML.g:4276:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalTyphonML.g:4276:3: (enumLiteral_0= '0..1' )
                    // InternalTyphonML.g:4277:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:4284:3: (enumLiteral_1= '1' )
                    {
                    // InternalTyphonML.g:4284:3: (enumLiteral_1= '1' )
                    // InternalTyphonML.g:4285:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:4292:3: (enumLiteral_2= '0..*' )
                    {
                    // InternalTyphonML.g:4292:3: (enumLiteral_2= '0..*' )
                    // InternalTyphonML.g:4293:4: enumLiteral_2= '0..*'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:4300:3: (enumLiteral_3= '*' )
                    {
                    // InternalTyphonML.g:4300:3: (enumLiteral_3= '*' )
                    // InternalTyphonML.g:4301:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x04009A8000431802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00009A8000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1020000001000830L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1000000001000830L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000005080200800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000005000200800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000830L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002400200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000040200800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000200830L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000600000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000200000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0042000000000800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001000000200000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x001C000000200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0018000000200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000401000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0020000000000830L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0800000001000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1000000000000830L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000004204000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000204000L});

}