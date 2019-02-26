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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AddAttribute'", "'{'", "'importedNamespace'", "'type'", "'}'", "'AddEntity'", "'genericList'", "'attributes'", "','", "'relations'", "'identifer'", "'PrimitiveDataType'", "'FreeText'", "'CustomDataType'", "'elements'", "'Entity'", "'Attribute'", "'isContainment'", "'Relation'", "'cardinality'", "'opposite'", "'EntityIdentifier'", "'('", "')'", "'GenericList'", "'entity'", "'AddRelation'", "'Table'", "'db'", "'indexSpec'", "'idSpec'", "'Collection'", "'KeyValueElement'", "'key'", "'values'", "'GraphNode'", "'IndexSpec'", "'references'", "'IdSpec'", "'RelationalDB'", "'tables'", "'DocumentDB'", "'collections'", "'KeyValueDB'", "'GraphDB'", "'nodes'", "'edges'", "'ColumnDB'", "'columns'", "'GraphEdge'", "'from'", "'to'", "'labels'", "'GraphEdgeLabel'", "'AddGraphEdge'", "'Column'", "'GraphAttribute'", "'value'", "'AddGraphAttribute'", "'DataTypeItem'", "'implementation'", "'DataTypeImplementationPackage'", "'location'", "'zero_one'", "'one'", "'zero_many'", "'one_many'"
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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

                if ( (LA1_0==16||(LA1_0>=22 && LA1_0<=24)||LA1_0==26) ) {
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

                if ( (LA2_0==50||LA2_0==52||(LA2_0>=54 && LA2_0<=55)||LA2_0==58) ) {
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


    // $ANTLR start "entryRuleAddAttribute"
    // InternalTyphonML.g:129:1: entryRuleAddAttribute returns [EObject current=null] : iv_ruleAddAttribute= ruleAddAttribute EOF ;
    public final EObject entryRuleAddAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAttribute = null;


        try {
            // InternalTyphonML.g:129:53: (iv_ruleAddAttribute= ruleAddAttribute EOF )
            // InternalTyphonML.g:130:2: iv_ruleAddAttribute= ruleAddAttribute EOF
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
    // InternalTyphonML.g:136:1: ruleAddAttribute returns [EObject current=null] : ( () otherlv_1= 'AddAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAddAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:142:2: ( ( () otherlv_1= 'AddAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:143:2: ( () otherlv_1= 'AddAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:143:2: ( () otherlv_1= 'AddAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:144:3: () otherlv_1= 'AddAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:144:3: ()
            // InternalTyphonML.g:145:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAttributeAccess().getAddAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAttributeAccess().getAddAttributeKeyword_1());
            		
            // InternalTyphonML.g:155:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:156:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:156:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:157:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:178:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTyphonML.g:179:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddAttributeAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:183:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:184:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:184:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:185:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddAttributeAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddAttributeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:203:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTyphonML.g:204:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddAttributeAccess().getTypeKeyword_5_0());
                    			
                    // InternalTyphonML.g:208:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:209:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:209:5: ( ruleEString )
                    // InternalTyphonML.g:210:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddAttributeAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAddAttributeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDataType"
    // InternalTyphonML.g:233:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTyphonML.g:233:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTyphonML.g:234:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalTyphonML.g:240:1: ruleDataType returns [EObject current=null] : (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_AddEntity_0 = null;

        EObject this_PrimitiveDataType_Impl_1 = null;

        EObject this_FreeText_2 = null;

        EObject this_CustomDataType_3 = null;

        EObject this_Entity_Impl_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:246:2: ( (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl ) )
            // InternalTyphonML.g:247:2: (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl )
            {
            // InternalTyphonML.g:247:2: (this_AddEntity_0= ruleAddEntity | this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl | this_FreeText_2= ruleFreeText | this_CustomDataType_3= ruleCustomDataType | this_Entity_Impl_4= ruleEntity_Impl )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 26:
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
                    // InternalTyphonML.g:248:3: this_AddEntity_0= ruleAddEntity
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
                    // InternalTyphonML.g:257:3: this_PrimitiveDataType_Impl_1= rulePrimitiveDataType_Impl
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
                    // InternalTyphonML.g:266:3: this_FreeText_2= ruleFreeText
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
                    // InternalTyphonML.g:275:3: this_CustomDataType_3= ruleCustomDataType
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
                    // InternalTyphonML.g:284:3: this_Entity_Impl_4= ruleEntity_Impl
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
    // InternalTyphonML.g:296:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:296:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:297:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTyphonML.g:303:1: ruleAttribute returns [EObject current=null] : (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_Impl_0 = null;

        EObject this_AddAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:309:2: ( (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute ) )
            // InternalTyphonML.g:310:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            {
            // InternalTyphonML.g:310:2: (this_Attribute_Impl_0= ruleAttribute_Impl | this_AddAttribute_1= ruleAddAttribute )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTyphonML.g:311:3: this_Attribute_Impl_0= ruleAttribute_Impl
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
                    // InternalTyphonML.g:320:3: this_AddAttribute_1= ruleAddAttribute
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
    // InternalTyphonML.g:332:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:332:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:333:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalTyphonML.g:339:1: ruleRelation returns [EObject current=null] : (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_Impl_0 = null;

        EObject this_AddRelation_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:345:2: ( (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation ) )
            // InternalTyphonML.g:346:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            {
            // InternalTyphonML.g:346:2: (this_Relation_Impl_0= ruleRelation_Impl | this_AddRelation_1= ruleAddRelation )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==29) ) {
                    alt7=1;
                }
                else if ( (LA7_1==37) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt7=1;
                }
                break;
            case 37:
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
                    // InternalTyphonML.g:347:3: this_Relation_Impl_0= ruleRelation_Impl
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
                    // InternalTyphonML.g:356:3: this_AddRelation_1= ruleAddRelation
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
    // InternalTyphonML.g:368:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:368:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:369:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalTyphonML.g:375:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_DocumentDB_1 = null;

        EObject this_KeyValueDB_2 = null;

        EObject this_GraphDB_3 = null;

        EObject this_ColumnDB_4 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:381:2: ( (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB ) )
            // InternalTyphonML.g:382:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            {
            // InternalTyphonML.g:382:2: (this_RelationalDB_0= ruleRelationalDB | this_DocumentDB_1= ruleDocumentDB | this_KeyValueDB_2= ruleKeyValueDB | this_GraphDB_3= ruleGraphDB | this_ColumnDB_4= ruleColumnDB )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 52:
                {
                alt8=2;
                }
                break;
            case 54:
                {
                alt8=3;
                }
                break;
            case 55:
                {
                alt8=4;
                }
                break;
            case 58:
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
                    // InternalTyphonML.g:383:3: this_RelationalDB_0= ruleRelationalDB
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
                    // InternalTyphonML.g:392:3: this_DocumentDB_1= ruleDocumentDB
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
                    // InternalTyphonML.g:401:3: this_KeyValueDB_2= ruleKeyValueDB
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
                    // InternalTyphonML.g:410:3: this_GraphDB_3= ruleGraphDB
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
                    // InternalTyphonML.g:419:3: this_ColumnDB_4= ruleColumnDB
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
    // InternalTyphonML.g:431:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:431:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:432:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
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
    // InternalTyphonML.g:438:1: ruleGraphAttribute returns [EObject current=null] : (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_GraphAttribute_Impl_0 = null;

        EObject this_AddGraphAttribute_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:444:2: ( (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute ) )
            // InternalTyphonML.g:445:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            {
            // InternalTyphonML.g:445:2: (this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl | this_AddGraphAttribute_1= ruleAddGraphAttribute )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==67) ) {
                alt9=1;
            }
            else if ( (LA9_0==69) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:446:3: this_GraphAttribute_Impl_0= ruleGraphAttribute_Impl
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
                    // InternalTyphonML.g:455:3: this_AddGraphAttribute_1= ruleAddGraphAttribute
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
    // InternalTyphonML.g:467:1: entryRuleGraphEdge returns [EObject current=null] : iv_ruleGraphEdge= ruleGraphEdge EOF ;
    public final EObject entryRuleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge = null;


        try {
            // InternalTyphonML.g:467:50: (iv_ruleGraphEdge= ruleGraphEdge EOF )
            // InternalTyphonML.g:468:2: iv_ruleGraphEdge= ruleGraphEdge EOF
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
    // InternalTyphonML.g:474:1: ruleGraphEdge returns [EObject current=null] : (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) ;
    public final EObject ruleGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject this_GraphEdge_Impl_0 = null;

        EObject this_AddGraphEdge_1 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:480:2: ( (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge ) )
            // InternalTyphonML.g:481:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            {
            // InternalTyphonML.g:481:2: (this_GraphEdge_Impl_0= ruleGraphEdge_Impl | this_AddGraphEdge_1= ruleAddGraphEdge )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==60) ) {
                alt10=1;
            }
            else if ( (LA10_0==65) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTyphonML.g:482:3: this_GraphEdge_Impl_0= ruleGraphEdge_Impl
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
                    // InternalTyphonML.g:491:3: this_AddGraphEdge_1= ruleAddGraphEdge
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
    // InternalTyphonML.g:503:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:503:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:504:2: iv_ruleEString= ruleEString EOF
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
    // InternalTyphonML.g:510:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:516:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:517:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:517:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalTyphonML.g:518:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:526:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAddEntity"
    // InternalTyphonML.g:537:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalTyphonML.g:537:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalTyphonML.g:538:2: iv_ruleAddEntity= ruleAddEntity EOF
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
    // InternalTyphonML.g:544:1: ruleAddEntity returns [EObject current=null] : (otherlv_0= 'AddEntity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' ) ;
    public final EObject ruleAddEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_relations_15_0 = null;

        EObject lv_relations_17_0 = null;

        EObject lv_identifer_20_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:550:2: ( (otherlv_0= 'AddEntity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' ) )
            // InternalTyphonML.g:551:2: (otherlv_0= 'AddEntity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' )
            {
            // InternalTyphonML.g:551:2: (otherlv_0= 'AddEntity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' )
            // InternalTyphonML.g:552:3: otherlv_0= 'AddEntity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAddEntityAccess().getAddEntityKeyword_0());
            		
            // InternalTyphonML.g:556:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:557:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:557:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:558:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:579:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTyphonML.g:580:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddEntityAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:584:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:585:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:585:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:586:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddEntityRule());
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

            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAddEntityAccess().getGenericListKeyword_4());
            		
            // InternalTyphonML.g:608:3: ( ( ruleEString ) )
            // InternalTyphonML.g:609:4: ( ruleEString )
            {
            // InternalTyphonML.g:609:4: ( ruleEString )
            // InternalTyphonML.g:610:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEntityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddEntityAccess().getGenericListGenericListCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:624:3: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTyphonML.g:625:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddEntityAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:633:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalTyphonML.g:634:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:634:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalTyphonML.g:635:6: lv_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:652:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTyphonML.g:653:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_13); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAddEntityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:657:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalTyphonML.g:658:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:658:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalTyphonML.g:659:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:682:3: (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTyphonML.g:683:4: otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getAddEntityAccess().getRelationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getAddEntityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:691:4: ( (lv_relations_15_0= ruleRelation ) )
                    // InternalTyphonML.g:692:5: (lv_relations_15_0= ruleRelation )
                    {
                    // InternalTyphonML.g:692:5: (lv_relations_15_0= ruleRelation )
                    // InternalTyphonML.g:693:6: lv_relations_15_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:710:4: (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTyphonML.g:711:5: otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getAddEntityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:715:5: ( (lv_relations_17_0= ruleRelation ) )
                    	    // InternalTyphonML.g:716:6: (lv_relations_17_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:716:6: (lv_relations_17_0= ruleRelation )
                    	    // InternalTyphonML.g:717:7: lv_relations_17_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddEntityAccess().getRelationsRelationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getAddEntityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_19, grammarAccess.getAddEntityAccess().getIdentiferKeyword_8());
            		
            // InternalTyphonML.g:744:3: ( (lv_identifer_20_0= ruleEntityIdentifier ) )
            // InternalTyphonML.g:745:4: (lv_identifer_20_0= ruleEntityIdentifier )
            {
            // InternalTyphonML.g:745:4: (lv_identifer_20_0= ruleEntityIdentifier )
            // InternalTyphonML.g:746:5: lv_identifer_20_0= ruleEntityIdentifier
            {

            					newCompositeNode(grammarAccess.getAddEntityAccess().getIdentiferEntityIdentifierParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRulePrimitiveDataType_Impl"
    // InternalTyphonML.g:771:1: entryRulePrimitiveDataType_Impl returns [EObject current=null] : iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF ;
    public final EObject entryRulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType_Impl = null;


        try {
            // InternalTyphonML.g:771:63: (iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF )
            // InternalTyphonML.g:772:2: iv_rulePrimitiveDataType_Impl= rulePrimitiveDataType_Impl EOF
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
    // InternalTyphonML.g:778:1: rulePrimitiveDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'PrimitiveDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePrimitiveDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:784:2: ( ( () otherlv_1= 'PrimitiveDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalTyphonML.g:785:2: ( () otherlv_1= 'PrimitiveDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalTyphonML.g:785:2: ( () otherlv_1= 'PrimitiveDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalTyphonML.g:786:3: () otherlv_1= 'PrimitiveDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalTyphonML.g:786:3: ()
            // InternalTyphonML.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataType_ImplAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveDataType_ImplAccess().getPrimitiveDataTypeKeyword_1());
            		
            // InternalTyphonML.g:797:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:798:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:798:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:799:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveDataType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimitiveDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:820:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTyphonML.g:821:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:825:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:826:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:826:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:827:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrimitiveDataType_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleFreeText"
    // InternalTyphonML.g:853:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalTyphonML.g:853:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalTyphonML.g:854:2: iv_ruleFreeText= ruleFreeText EOF
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
    // InternalTyphonML.g:860:1: ruleFreeText returns [EObject current=null] : ( () otherlv_1= 'FreeText' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:866:2: ( ( () otherlv_1= 'FreeText' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalTyphonML.g:867:2: ( () otherlv_1= 'FreeText' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalTyphonML.g:867:2: ( () otherlv_1= 'FreeText' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalTyphonML.g:868:3: () otherlv_1= 'FreeText' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalTyphonML.g:868:3: ()
            // InternalTyphonML.g:869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFreeTextAccess().getFreeTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFreeTextAccess().getFreeTextKeyword_1());
            		
            // InternalTyphonML.g:879:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:880:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:880:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:881:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFreeTextAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFreeTextAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:902:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTyphonML.g:903:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFreeTextAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:907:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:908:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:908:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:909:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFreeTextAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFreeTextRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFreeTextAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:935:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:935:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:936:2: iv_ruleCustomDataType= ruleCustomDataType EOF
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
    // InternalTyphonML.g:942:1: ruleCustomDataType returns [EObject current=null] : ( () otherlv_1= 'CustomDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleCustomDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:948:2: ( ( () otherlv_1= 'CustomDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:949:2: ( () otherlv_1= 'CustomDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:949:2: ( () otherlv_1= 'CustomDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:950:3: () otherlv_1= 'CustomDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:950:3: ()
            // InternalTyphonML.g:951:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getCustomDataTypeKeyword_1());
            		
            // InternalTyphonML.g:961:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:962:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:962:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:963:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDataTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:984:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTyphonML.g:985:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomDataTypeAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:989:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:990:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:990:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:991:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1009:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTyphonML.g:1010:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleDataTypeItem ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomDataTypeAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:1018:4: ( (lv_elements_8_0= ruleDataTypeItem ) )
                    // InternalTyphonML.g:1019:5: (lv_elements_8_0= ruleDataTypeItem )
                    {
                    // InternalTyphonML.g:1019:5: (lv_elements_8_0= ruleDataTypeItem )
                    // InternalTyphonML.g:1020:6: lv_elements_8_0= ruleDataTypeItem
                    {

                    						newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:1037:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalTyphonML.g:1038:5: otherlv_9= ',' ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_22); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCustomDataTypeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:1042:5: ( (lv_elements_10_0= ruleDataTypeItem ) )
                    	    // InternalTyphonML.g:1043:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    {
                    	    // InternalTyphonML.g:1043:6: (lv_elements_10_0= ruleDataTypeItem )
                    	    // InternalTyphonML.g:1044:7: lv_elements_10_0= ruleDataTypeItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:1075:1: entryRuleEntity_Impl returns [EObject current=null] : iv_ruleEntity_Impl= ruleEntity_Impl EOF ;
    public final EObject entryRuleEntity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Impl = null;


        try {
            // InternalTyphonML.g:1075:52: (iv_ruleEntity_Impl= ruleEntity_Impl EOF )
            // InternalTyphonML.g:1076:2: iv_ruleEntity_Impl= ruleEntity_Impl EOF
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
    // InternalTyphonML.g:1082:1: ruleEntity_Impl returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' ) ;
    public final EObject ruleEntity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_relations_15_0 = null;

        EObject lv_relations_17_0 = null;

        EObject lv_identifer_20_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1088:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' ) )
            // InternalTyphonML.g:1089:2: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' )
            {
            // InternalTyphonML.g:1089:2: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}' )
            // InternalTyphonML.g:1090:3: otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'genericList' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )? otherlv_19= 'identifer' ( (lv_identifer_20_0= ruleEntityIdentifier ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntity_ImplAccess().getEntityKeyword_0());
            		
            // InternalTyphonML.g:1094:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1095:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1095:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1096:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:1117:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:1118:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntity_ImplAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:1122:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:1123:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:1123:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:1124:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
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

            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEntity_ImplAccess().getGenericListKeyword_4());
            		
            // InternalTyphonML.g:1146:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1147:4: ( ruleEString )
            {
            // InternalTyphonML.g:1147:4: ( ruleEString )
            // InternalTyphonML.g:1148:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntity_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getGenericListGenericListCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1162:3: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTyphonML.g:1163:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntity_ImplAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:1171:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalTyphonML.g:1172:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalTyphonML.g:1172:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalTyphonML.g:1173:6: lv_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_attributes_9_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_9_0,
                    							"it.univaq.disim.typhon.TyphonML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1190:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==19) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalTyphonML.g:1191:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_13); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getEntity_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:1195:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalTyphonML.g:1196:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalTyphonML.g:1196:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalTyphonML.g:1197:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntity_ImplAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:1220:3: (otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTyphonML.g:1221:4: otherlv_13= 'relations' otherlv_14= '{' ( (lv_relations_15_0= ruleRelation ) ) (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntity_ImplAccess().getRelationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntity_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:1229:4: ( (lv_relations_15_0= ruleRelation ) )
                    // InternalTyphonML.g:1230:5: (lv_relations_15_0= ruleRelation )
                    {
                    // InternalTyphonML.g:1230:5: (lv_relations_15_0= ruleRelation )
                    // InternalTyphonML.g:1231:6: lv_relations_15_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_relations_15_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relations",
                    							lv_relations_15_0,
                    							"it.univaq.disim.typhon.TyphonML.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1248:4: (otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalTyphonML.g:1249:5: otherlv_16= ',' ( (lv_relations_17_0= ruleRelation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEntity_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:1253:5: ( (lv_relations_17_0= ruleRelation ) )
                    	    // InternalTyphonML.g:1254:6: (lv_relations_17_0= ruleRelation )
                    	    {
                    	    // InternalTyphonML.g:1254:6: (lv_relations_17_0= ruleRelation )
                    	    // InternalTyphonML.g:1255:7: lv_relations_17_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntity_ImplAccess().getRelationsRelationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_relations_17_0=ruleRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_19, grammarAccess.getEntity_ImplAccess().getIdentiferKeyword_8());
            		
            // InternalTyphonML.g:1282:3: ( (lv_identifer_20_0= ruleEntityIdentifier ) )
            // InternalTyphonML.g:1283:4: (lv_identifer_20_0= ruleEntityIdentifier )
            {
            // InternalTyphonML.g:1283:4: (lv_identifer_20_0= ruleEntityIdentifier )
            // InternalTyphonML.g:1284:5: lv_identifer_20_0= ruleEntityIdentifier
            {

            					newCompositeNode(grammarAccess.getEntity_ImplAccess().getIdentiferEntityIdentifierParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_identifer_20_0=ruleEntityIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntity_ImplRule());
            					}
            					set(
            						current,
            						"identifer",
            						lv_identifer_20_0,
            						"it.univaq.disim.typhon.TyphonML.EntityIdentifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getEntity_ImplAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAttribute_Impl"
    // InternalTyphonML.g:1309:1: entryRuleAttribute_Impl returns [EObject current=null] : iv_ruleAttribute_Impl= ruleAttribute_Impl EOF ;
    public final EObject entryRuleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute_Impl = null;


        try {
            // InternalTyphonML.g:1309:55: (iv_ruleAttribute_Impl= ruleAttribute_Impl EOF )
            // InternalTyphonML.g:1310:2: iv_ruleAttribute_Impl= ruleAttribute_Impl EOF
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
    // InternalTyphonML.g:1316:1: ruleAttribute_Impl returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1322:2: ( ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:1323:2: ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:1323:2: ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:1324:3: () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:1324:3: ()
            // InternalTyphonML.g:1325:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttribute_ImplAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAttribute_ImplAccess().getAttributeKeyword_1());
            		
            // InternalTyphonML.g:1335:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1336:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1336:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1337:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAttribute_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:1358:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTyphonML.g:1359:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttribute_ImplAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:1363:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:1364:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:1364:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:1365:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttribute_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1383:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTyphonML.g:1384:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttribute_ImplAccess().getTypeKeyword_5_0());
                    			
                    // InternalTyphonML.g:1388:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1389:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1389:5: ( ruleEString )
                    // InternalTyphonML.g:1390:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttribute_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttribute_ImplAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAttribute_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRelation_Impl"
    // InternalTyphonML.g:1413:1: entryRuleRelation_Impl returns [EObject current=null] : iv_ruleRelation_Impl= ruleRelation_Impl EOF ;
    public final EObject entryRuleRelation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation_Impl = null;


        try {
            // InternalTyphonML.g:1413:54: (iv_ruleRelation_Impl= ruleRelation_Impl EOF )
            // InternalTyphonML.g:1414:2: iv_ruleRelation_Impl= ruleRelation_Impl EOF
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
    // InternalTyphonML.g:1420:1: ruleRelation_Impl returns [EObject current=null] : ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'Relation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleRelation_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isContainment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        Enumerator lv_cardinality_7_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1426:2: ( ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'Relation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalTyphonML.g:1427:2: ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'Relation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:1427:2: ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'Relation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalTyphonML.g:1428:3: ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'Relation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalTyphonML.g:1428:3: ( (lv_isContainment_0_0= 'isContainment' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTyphonML.g:1429:4: (lv_isContainment_0_0= 'isContainment' )
                    {
                    // InternalTyphonML.g:1429:4: (lv_isContainment_0_0= 'isContainment' )
                    // InternalTyphonML.g:1430:5: lv_isContainment_0_0= 'isContainment'
                    {
                    lv_isContainment_0_0=(Token)match(input,28,FOLLOW_23); 

                    					newLeafNode(lv_isContainment_0_0, grammarAccess.getRelation_ImplAccess().getIsContainmentIsContainmentKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelation_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, "isContainment");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRelation_ImplAccess().getRelationKeyword_1());
            		
            // InternalTyphonML.g:1446:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1447:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1447:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1448:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRelation_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:1469:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTyphonML.g:1470:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelation_ImplAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:1474:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:1475:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:1475:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:1476:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getRelation_ImplAccess().getCardinalityKeyword_5());
            		
            // InternalTyphonML.g:1498:3: ( (lv_cardinality_7_0= ruleCardinality ) )
            // InternalTyphonML.g:1499:4: (lv_cardinality_7_0= ruleCardinality )
            {
            // InternalTyphonML.g:1499:4: (lv_cardinality_7_0= ruleCardinality )
            // InternalTyphonML.g:1500:5: lv_cardinality_7_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelation_ImplAccess().getCardinalityCardinalityEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_cardinality_7_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelation_ImplRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_7_0,
            						"it.univaq.disim.typhon.TyphonML.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1517:3: (otherlv_8= 'type' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTyphonML.g:1518:4: otherlv_8= 'type' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelation_ImplAccess().getTypeKeyword_7_0());
                    			
                    // InternalTyphonML.g:1522:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1523:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1523:5: ( ruleEString )
                    // InternalTyphonML.g:1524:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getTypeEntityCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1539:3: (otherlv_10= 'opposite' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTyphonML.g:1540:4: otherlv_10= 'opposite' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelation_ImplAccess().getOppositeKeyword_8_0());
                    			
                    // InternalTyphonML.g:1544:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1545:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1545:5: ( ruleEString )
                    // InternalTyphonML.g:1546:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelation_ImplAccess().getOppositeRelationCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRelation_ImplAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:1569:1: entryRuleEntityIdentifier returns [EObject current=null] : iv_ruleEntityIdentifier= ruleEntityIdentifier EOF ;
    public final EObject entryRuleEntityIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityIdentifier = null;


        try {
            // InternalTyphonML.g:1569:57: (iv_ruleEntityIdentifier= ruleEntityIdentifier EOF )
            // InternalTyphonML.g:1570:2: iv_ruleEntityIdentifier= ruleEntityIdentifier EOF
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
    // InternalTyphonML.g:1576:1: ruleEntityIdentifier returns [EObject current=null] : ( () otherlv_1= 'EntityIdentifier' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleEntityIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1582:2: ( ( () otherlv_1= 'EntityIdentifier' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalTyphonML.g:1583:2: ( () otherlv_1= 'EntityIdentifier' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalTyphonML.g:1583:2: ( () otherlv_1= 'EntityIdentifier' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalTyphonML.g:1584:3: () otherlv_1= 'EntityIdentifier' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalTyphonML.g:1584:3: ()
            // InternalTyphonML.g:1585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityIdentifierAccess().getEntityIdentifierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityIdentifierAccess().getEntityIdentifierKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityIdentifierAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:1599:3: (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTyphonML.g:1600:4: otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityIdentifierAccess().getAttributesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityIdentifierAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalTyphonML.g:1608:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1609:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1609:5: ( ruleEString )
                    // InternalTyphonML.g:1610:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityIdentifierRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityIdentifierAccess().getAttributesAttributeCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:1624:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==19) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalTyphonML.g:1625:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntityIdentifierAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTyphonML.g:1629:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:1630:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:1630:6: ( ruleEString )
                    	    // InternalTyphonML.g:1631:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEntityIdentifierRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEntityIdentifierAccess().getAttributesAttributeCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

                    otherlv_8=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityIdentifierAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityIdentifierAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:1659:1: entryRuleGenericList_Impl returns [EObject current=null] : iv_ruleGenericList_Impl= ruleGenericList_Impl EOF ;
    public final EObject entryRuleGenericList_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericList_Impl = null;


        try {
            // InternalTyphonML.g:1659:57: (iv_ruleGenericList_Impl= ruleGenericList_Impl EOF )
            // InternalTyphonML.g:1660:2: iv_ruleGenericList_Impl= ruleGenericList_Impl EOF
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
    // InternalTyphonML.g:1666:1: ruleGenericList_Impl returns [EObject current=null] : (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleGenericList_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1672:2: ( (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalTyphonML.g:1673:2: (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalTyphonML.g:1673:2: (otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalTyphonML.g:1674:3: otherlv_0= 'GenericList' otherlv_1= '{' otherlv_2= 'entity' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGenericList_ImplAccess().getGenericListKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getGenericList_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGenericList_ImplAccess().getEntityKeyword_2());
            		
            // InternalTyphonML.g:1686:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1687:4: ( ruleEString )
            {
            // InternalTyphonML.g:1687:4: ( ruleEString )
            // InternalTyphonML.g:1688:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenericList_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGenericList_ImplAccess().getEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAddRelation"
    // InternalTyphonML.g:1710:1: entryRuleAddRelation returns [EObject current=null] : iv_ruleAddRelation= ruleAddRelation EOF ;
    public final EObject entryRuleAddRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRelation = null;


        try {
            // InternalTyphonML.g:1710:52: (iv_ruleAddRelation= ruleAddRelation EOF )
            // InternalTyphonML.g:1711:2: iv_ruleAddRelation= ruleAddRelation EOF
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
    // InternalTyphonML.g:1717:1: ruleAddRelation returns [EObject current=null] : ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'AddRelation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleAddRelation() throws RecognitionException {
        EObject current = null;

        Token lv_isContainment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        Enumerator lv_cardinality_7_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1723:2: ( ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'AddRelation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalTyphonML.g:1724:2: ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'AddRelation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:1724:2: ( ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'AddRelation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalTyphonML.g:1725:3: ( (lv_isContainment_0_0= 'isContainment' ) )? otherlv_1= 'AddRelation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) (otherlv_8= 'type' ( ( ruleEString ) ) )? (otherlv_10= 'opposite' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalTyphonML.g:1725:3: ( (lv_isContainment_0_0= 'isContainment' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTyphonML.g:1726:4: (lv_isContainment_0_0= 'isContainment' )
                    {
                    // InternalTyphonML.g:1726:4: (lv_isContainment_0_0= 'isContainment' )
                    // InternalTyphonML.g:1727:5: lv_isContainment_0_0= 'isContainment'
                    {
                    lv_isContainment_0_0=(Token)match(input,28,FOLLOW_33); 

                    					newLeafNode(lv_isContainment_0_0, grammarAccess.getAddRelationAccess().getIsContainmentIsContainmentKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, "isContainment");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddRelationAccess().getAddRelationKeyword_1());
            		
            // InternalTyphonML.g:1743:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1744:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1744:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1745:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddRelationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getAddRelationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:1766:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTyphonML.g:1767:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddRelationAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:1771:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:1772:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:1772:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:1773:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddRelationRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getAddRelationAccess().getCardinalityKeyword_5());
            		
            // InternalTyphonML.g:1795:3: ( (lv_cardinality_7_0= ruleCardinality ) )
            // InternalTyphonML.g:1796:4: (lv_cardinality_7_0= ruleCardinality )
            {
            // InternalTyphonML.g:1796:4: (lv_cardinality_7_0= ruleCardinality )
            // InternalTyphonML.g:1797:5: lv_cardinality_7_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getAddRelationAccess().getCardinalityCardinalityEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_cardinality_7_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRelationRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_7_0,
            						"it.univaq.disim.typhon.TyphonML.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1814:3: (otherlv_8= 'type' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTyphonML.g:1815:4: otherlv_8= 'type' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddRelationAccess().getTypeKeyword_7_0());
                    			
                    // InternalTyphonML.g:1819:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1820:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1820:5: ( ruleEString )
                    // InternalTyphonML.g:1821:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getTypeEntityCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1836:3: (otherlv_10= 'opposite' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTyphonML.g:1837:4: otherlv_10= 'opposite' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddRelationAccess().getOppositeKeyword_8_0());
                    			
                    // InternalTyphonML.g:1841:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1842:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1842:5: ( ruleEString )
                    // InternalTyphonML.g:1843:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddRelationAccess().getOppositeRelationCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAddRelationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTable"
    // InternalTyphonML.g:1866:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:1866:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:1867:2: iv_ruleTable= ruleTable EOF
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
    // InternalTyphonML.g:1873:1: ruleTable returns [EObject current=null] : (otherlv_0= 'Table' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? (otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) ) )? (otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;

        EObject lv_indexSpec_10_0 = null;

        EObject lv_idSpec_12_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1879:2: ( (otherlv_0= 'Table' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? (otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) ) )? (otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) ) )? otherlv_13= '}' ) )
            // InternalTyphonML.g:1880:2: (otherlv_0= 'Table' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? (otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) ) )? (otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) ) )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:1880:2: (otherlv_0= 'Table' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? (otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) ) )? (otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) ) )? otherlv_13= '}' )
            // InternalTyphonML.g:1881:3: otherlv_0= 'Table' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'db' ( ( ruleEString ) ) )? (otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) ) )? (otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalTyphonML.g:1885:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1886:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1886:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1887:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:1908:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTyphonML.g:1909:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTableAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:1913:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:1914:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:1914:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:1915:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
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

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:1937:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1938:4: ( ruleEString )
            {
            // InternalTyphonML.g:1938:4: ( ruleEString )
            // InternalTyphonML.g:1939:5: ruleEString
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

            // InternalTyphonML.g:1953:3: (otherlv_7= 'db' ( ( ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTyphonML.g:1954:4: otherlv_7= 'db' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDbKeyword_6_0());
                    			
                    // InternalTyphonML.g:1958:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1959:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1959:5: ( ruleEString )
                    // InternalTyphonML.g:1960:6: ruleEString
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

            // InternalTyphonML.g:1975:3: (otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTyphonML.g:1976:4: otherlv_9= 'indexSpec' ( (lv_indexSpec_10_0= ruleIndexSpec ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getIndexSpecKeyword_7_0());
                    			
                    // InternalTyphonML.g:1980:4: ( (lv_indexSpec_10_0= ruleIndexSpec ) )
                    // InternalTyphonML.g:1981:5: (lv_indexSpec_10_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:1981:5: (lv_indexSpec_10_0= ruleIndexSpec )
                    // InternalTyphonML.g:1982:6: lv_indexSpec_10_0= ruleIndexSpec
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_indexSpec_10_0=ruleIndexSpec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"indexSpec",
                    							lv_indexSpec_10_0,
                    							"it.univaq.disim.typhon.TyphonML.IndexSpec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2000:3: (otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTyphonML.g:2001:4: otherlv_11= 'idSpec' ( (lv_idSpec_12_0= ruleIdSpec ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_39); 

                    				newLeafNode(otherlv_11, grammarAccess.getTableAccess().getIdSpecKeyword_8_0());
                    			
                    // InternalTyphonML.g:2005:4: ( (lv_idSpec_12_0= ruleIdSpec ) )
                    // InternalTyphonML.g:2006:5: (lv_idSpec_12_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:2006:5: (lv_idSpec_12_0= ruleIdSpec )
                    // InternalTyphonML.g:2007:6: lv_idSpec_12_0= ruleIdSpec
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_idSpec_12_0=ruleIdSpec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"idSpec",
                    							lv_idSpec_12_0,
                    							"it.univaq.disim.typhon.TyphonML.IdSpec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:2033:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalTyphonML.g:2033:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalTyphonML.g:2034:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalTyphonML.g:2040:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2046:2: ( (otherlv_0= 'Collection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalTyphonML.g:2047:2: (otherlv_0= 'Collection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalTyphonML.g:2047:2: (otherlv_0= 'Collection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalTyphonML.g:2048:3: otherlv_0= 'Collection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
            		
            // InternalTyphonML.g:2052:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:2053:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:2053:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:2054:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2075:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTyphonML.g:2076:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:2080:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:2081:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:2081:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:2082:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionRule());
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

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2104:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2105:4: ( ruleEString )
            {
            // InternalTyphonML.g:2105:4: ( ruleEString )
            // InternalTyphonML.g:2106:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCollectionAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCollectionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:2128:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:2128:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:2129:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
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
    // InternalTyphonML.g:2135:1: ruleKeyValueElement returns [EObject current=null] : (otherlv_0= 'KeyValueElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) ;
    public final EObject ruleKeyValueElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_key_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2141:2: ( (otherlv_0= 'KeyValueElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:2142:2: (otherlv_0= 'KeyValueElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:2142:2: (otherlv_0= 'KeyValueElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}' )
            // InternalTyphonML.g:2143:3: otherlv_0= 'KeyValueElement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getKeyValueElementAccess().getKeyValueElementKeyword_0());
            		
            // InternalTyphonML.g:2147:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:2148:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:2148:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:2149:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2170:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTyphonML.g:2171:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getKeyValueElementAccess().getKeyKeyword_3_0());
                    			
                    // InternalTyphonML.g:2175:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalTyphonML.g:2176:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:2176:5: (lv_key_4_0= ruleEString )
                    // InternalTyphonML.g:2177:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueElementAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2199:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2200:4: ( ruleEString )
            {
            // InternalTyphonML.g:2200:4: ( ruleEString )
            // InternalTyphonML.g:2201:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getKeyValueElementAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_41);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2215:3: (otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTyphonML.g:2216:4: otherlv_7= 'values' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueElementAccess().getValuesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getKeyValueElementAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2224:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2225:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2225:5: ( ruleEString )
                    // InternalTyphonML.g:2226:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyValueElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2240:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalTyphonML.g:2241:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getKeyValueElementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2245:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2246:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2246:6: ( ruleEString )
                    	    // InternalTyphonML.g:2247:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getKeyValueElementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getKeyValueElementAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:2275:1: entryRuleGraphNode returns [EObject current=null] : iv_ruleGraphNode= ruleGraphNode EOF ;
    public final EObject entryRuleGraphNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphNode = null;


        try {
            // InternalTyphonML.g:2275:50: (iv_ruleGraphNode= ruleGraphNode EOF )
            // InternalTyphonML.g:2276:2: iv_ruleGraphNode= ruleGraphNode EOF
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
    // InternalTyphonML.g:2282:1: ruleGraphNode returns [EObject current=null] : (otherlv_0= 'GraphNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleGraphNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2288:2: ( (otherlv_0= 'GraphNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalTyphonML.g:2289:2: (otherlv_0= 'GraphNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalTyphonML.g:2289:2: (otherlv_0= 'GraphNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalTyphonML.g:2290:3: otherlv_0= 'GraphNode' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? otherlv_5= 'entity' ( ( ruleEString ) ) (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphNodeAccess().getGraphNodeKeyword_0());
            		
            // InternalTyphonML.g:2294:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:2295:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:2295:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:2296:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2317:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTyphonML.g:2318:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getGraphNodeAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:2322:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:2323:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:2323:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:2324:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphNodeRule());
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

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphNodeAccess().getEntityKeyword_4());
            		
            // InternalTyphonML.g:2346:3: ( ( ruleEString ) )
            // InternalTyphonML.g:2347:4: ( ruleEString )
            {
            // InternalTyphonML.g:2347:4: ( ruleEString )
            // InternalTyphonML.g:2348:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphNodeAccess().getEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:2362:3: (otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==18) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTyphonML.g:2363:4: otherlv_7= 'attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleGraphAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphNodeAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:2371:4: ( (lv_attributes_9_0= ruleGraphAttribute ) )
                    // InternalTyphonML.g:2372:5: (lv_attributes_9_0= ruleGraphAttribute )
                    {
                    // InternalTyphonML.g:2372:5: (lv_attributes_9_0= ruleGraphAttribute )
                    // InternalTyphonML.g:2373:6: lv_attributes_9_0= ruleGraphAttribute
                    {

                    						newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:2390:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==19) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalTyphonML.g:2391:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleGraphAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_42); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getGraphNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2395:5: ( (lv_attributes_11_0= ruleGraphAttribute ) )
                    	    // InternalTyphonML.g:2396:6: (lv_attributes_11_0= ruleGraphAttribute )
                    	    {
                    	    // InternalTyphonML.g:2396:6: (lv_attributes_11_0= ruleGraphAttribute )
                    	    // InternalTyphonML.g:2397:7: lv_attributes_11_0= ruleGraphAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphNodeAccess().getAttributesGraphAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleIndexSpec"
    // InternalTyphonML.g:2428:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:2428:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:2429:2: iv_ruleIndexSpec= ruleIndexSpec EOF
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
    // InternalTyphonML.g:2435:1: ruleIndexSpec returns [EObject current=null] : ( () otherlv_1= 'IndexSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) ;
    public final EObject ruleIndexSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2441:2: ( ( () otherlv_1= 'IndexSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:2442:2: ( () otherlv_1= 'IndexSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:2442:2: ( () otherlv_1= 'IndexSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}' )
            // InternalTyphonML.g:2443:3: () otherlv_1= 'IndexSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:2443:3: ()
            // InternalTyphonML.g:2444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getIndexSpecKeyword_1());
            		
            // InternalTyphonML.g:2454:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2455:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2455:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2456:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:2477:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==13) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTyphonML.g:2478:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getIndexSpecAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:2482:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:2483:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:2483:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:2484:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexSpecRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2502:3: (otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTyphonML.g:2503:4: otherlv_6= 'attributes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getIndexSpecAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalTyphonML.g:2511:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2512:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2512:5: ( ruleEString )
                    // InternalTyphonML.g:2513:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2527:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==19) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalTyphonML.g:2528:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getIndexSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2532:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2533:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2533:6: ( ruleEString )
                    	    // InternalTyphonML.g:2534:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

                    otherlv_11=(Token)match(input,34,FOLLOW_45); 

                    				newLeafNode(otherlv_11, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:2554:3: (otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==48) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTyphonML.g:2555:4: otherlv_12= 'references' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getIndexSpecAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getIndexSpecAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalTyphonML.g:2563:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2564:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2564:5: ( ruleEString )
                    // InternalTyphonML.g:2565:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIndexSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2579:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==19) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalTyphonML.g:2580:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getIndexSpecAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:2584:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2585:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2585:6: ( ruleEString )
                    	    // InternalTyphonML.g:2586:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIndexSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIndexSpecAccess().getReferencesRelationCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

                    otherlv_17=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getIndexSpecAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:2614:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:2614:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:2615:2: iv_ruleIdSpec= ruleIdSpec EOF
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
    // InternalTyphonML.g:2621:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'IdSpec' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalTyphonML.g:2627:2: ( ( () otherlv_1= 'IdSpec' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalTyphonML.g:2628:2: ( () otherlv_1= 'IdSpec' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalTyphonML.g:2628:2: ( () otherlv_1= 'IdSpec' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalTyphonML.g:2629:3: () otherlv_1= 'IdSpec' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalTyphonML.g:2629:3: ()
            // InternalTyphonML.g:2630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdSpecKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:2644:3: (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==18) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTyphonML.g:2645:4: otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getIdSpecAccess().getAttributesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalTyphonML.g:2653:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:2654:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:2654:5: ( ruleEString )
                    // InternalTyphonML.g:2655:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdSpecRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:2669:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==19) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalTyphonML.g:2670:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getIdSpecAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTyphonML.g:2674:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:2675:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:2675:6: ( ruleEString )
                    	    // InternalTyphonML.g:2676:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIdSpecRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

                    otherlv_8=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getIdSpecAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIdSpecAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:2704:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:2704:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:2705:2: iv_ruleRelationalDB= ruleRelationalDB EOF
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
    // InternalTyphonML.g:2711:1: ruleRelationalDB returns [EObject current=null] : ( () otherlv_1= 'RelationalDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleRelationalDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_tables_8_0 = null;

        EObject lv_tables_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2717:2: ( ( () otherlv_1= 'RelationalDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2718:2: ( () otherlv_1= 'RelationalDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2718:2: ( () otherlv_1= 'RelationalDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2719:3: () otherlv_1= 'RelationalDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2719:3: ()
            // InternalTyphonML.g:2720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getRelationalDBKeyword_1());
            		
            // InternalTyphonML.g:2730:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2731:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2731:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2732:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationalDBAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationalDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:2753:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==13) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTyphonML.g:2754:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationalDBAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:2758:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:2759:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:2759:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:2760:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationalDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2778:3: (otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==51) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTyphonML.g:2779:4: otherlv_6= 'tables' otherlv_7= '{' ( (lv_tables_8_0= ruleTable ) ) (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationalDBAccess().getTablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2787:4: ( (lv_tables_8_0= ruleTable ) )
                    // InternalTyphonML.g:2788:5: (lv_tables_8_0= ruleTable )
                    {
                    // InternalTyphonML.g:2788:5: (lv_tables_8_0= ruleTable )
                    // InternalTyphonML.g:2789:6: lv_tables_8_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:2806:4: (otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==19) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalTyphonML.g:2807:5: otherlv_9= ',' ( (lv_tables_10_0= ruleTable ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_48); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRelationalDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2811:5: ( (lv_tables_10_0= ruleTable ) )
                    	    // InternalTyphonML.g:2812:6: (lv_tables_10_0= ruleTable )
                    	    {
                    	    // InternalTyphonML.g:2812:6: (lv_tables_10_0= ruleTable )
                    	    // InternalTyphonML.g:2813:7: lv_tables_10_0= ruleTable
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_tables_10_0=ruleTable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationalDBRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tables",
                    	    								lv_tables_10_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Table");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:2844:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:2844:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:2845:2: iv_ruleDocumentDB= ruleDocumentDB EOF
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
    // InternalTyphonML.g:2851:1: ruleDocumentDB returns [EObject current=null] : ( () otherlv_1= 'DocumentDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleDocumentDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_collections_8_0 = null;

        EObject lv_collections_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2857:2: ( ( () otherlv_1= 'DocumentDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2858:2: ( () otherlv_1= 'DocumentDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2858:2: ( () otherlv_1= 'DocumentDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2859:3: () otherlv_1= 'DocumentDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2859:3: ()
            // InternalTyphonML.g:2860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getDocumentDBKeyword_1());
            		
            // InternalTyphonML.g:2870:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:2871:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:2871:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:2872:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentDBAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:2893:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTyphonML.g:2894:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDocumentDBAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:2898:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:2899:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:2899:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:2900:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDocumentDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:2918:3: (otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTyphonML.g:2919:4: otherlv_6= 'collections' otherlv_7= '{' ( (lv_collections_8_0= ruleCollection ) ) (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getDocumentDBAccess().getCollectionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_7, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:2927:4: ( (lv_collections_8_0= ruleCollection ) )
                    // InternalTyphonML.g:2928:5: (lv_collections_8_0= ruleCollection )
                    {
                    // InternalTyphonML.g:2928:5: (lv_collections_8_0= ruleCollection )
                    // InternalTyphonML.g:2929:6: lv_collections_8_0= ruleCollection
                    {

                    						newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:2946:4: (otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==19) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalTyphonML.g:2947:5: otherlv_9= ',' ( (lv_collections_10_0= ruleCollection ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_51); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDocumentDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:2951:5: ( (lv_collections_10_0= ruleCollection ) )
                    	    // InternalTyphonML.g:2952:6: (lv_collections_10_0= ruleCollection )
                    	    {
                    	    // InternalTyphonML.g:2952:6: (lv_collections_10_0= ruleCollection )
                    	    // InternalTyphonML.g:2953:7: lv_collections_10_0= ruleCollection
                    	    {

                    	    							newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsCollectionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_collections_10_0=ruleCollection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDocumentDBRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collections",
                    	    								lv_collections_10_0,
                    	    								"it.univaq.disim.typhon.TyphonML.Collection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:2984:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:2984:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:2985:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
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
    // InternalTyphonML.g:2991:1: ruleKeyValueDB returns [EObject current=null] : ( () otherlv_1= 'KeyValueDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleKeyValueDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:2997:2: ( ( () otherlv_1= 'KeyValueDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:2998:2: ( () otherlv_1= 'KeyValueDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:2998:2: ( () otherlv_1= 'KeyValueDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:2999:3: () otherlv_1= 'KeyValueDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:2999:3: ()
            // InternalTyphonML.g:3000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getKeyValueDBKeyword_1());
            		
            // InternalTyphonML.g:3010:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3011:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3011:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3012:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValueDBAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:3033:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==13) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTyphonML.g:3034:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getKeyValueDBAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:3038:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:3039:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:3039:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:3040:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3058:3: (otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTyphonML.g:3059:4: otherlv_6= 'elements' otherlv_7= '{' ( (lv_elements_8_0= ruleKeyValueElement ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeyValueDBAccess().getElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_7, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3067:4: ( (lv_elements_8_0= ruleKeyValueElement ) )
                    // InternalTyphonML.g:3068:5: (lv_elements_8_0= ruleKeyValueElement )
                    {
                    // InternalTyphonML.g:3068:5: (lv_elements_8_0= ruleKeyValueElement )
                    // InternalTyphonML.g:3069:6: lv_elements_8_0= ruleKeyValueElement
                    {

                    						newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:3086:4: (otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==19) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalTyphonML.g:3087:5: otherlv_9= ',' ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_52); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getKeyValueDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3091:5: ( (lv_elements_10_0= ruleKeyValueElement ) )
                    	    // InternalTyphonML.g:3092:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    {
                    	    // InternalTyphonML.g:3092:6: (lv_elements_10_0= ruleKeyValueElement )
                    	    // InternalTyphonML.g:3093:7: lv_elements_10_0= ruleKeyValueElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:3124:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:3124:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:3125:2: iv_ruleGraphDB= ruleGraphDB EOF
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
    // InternalTyphonML.g:3131:1: ruleGraphDB returns [EObject current=null] : ( () otherlv_1= 'GraphDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleGraphDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_nodes_8_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_edges_14_0 = null;

        EObject lv_edges_16_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3137:2: ( ( () otherlv_1= 'GraphDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalTyphonML.g:3138:2: ( () otherlv_1= 'GraphDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalTyphonML.g:3138:2: ( () otherlv_1= 'GraphDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalTyphonML.g:3139:3: () otherlv_1= 'GraphDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )? (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalTyphonML.g:3139:3: ()
            // InternalTyphonML.g:3140:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getGraphDBKeyword_1());
            		
            // InternalTyphonML.g:3150:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3151:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3151:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3152:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDBAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:3173:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==13) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTyphonML.g:3174:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphDBAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:3178:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:3179:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:3179:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:3180:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3198:3: (otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==56) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTyphonML.g:3199:4: otherlv_6= 'nodes' otherlv_7= '{' ( (lv_nodes_8_0= ruleGraphNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getNodesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3207:4: ( (lv_nodes_8_0= ruleGraphNode ) )
                    // InternalTyphonML.g:3208:5: (lv_nodes_8_0= ruleGraphNode )
                    {
                    // InternalTyphonML.g:3208:5: (lv_nodes_8_0= ruleGraphNode )
                    // InternalTyphonML.g:3209:6: lv_nodes_8_0= ruleGraphNode
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:3226:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==19) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalTyphonML.g:3227:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_55); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGraphDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3231:5: ( (lv_nodes_10_0= ruleGraphNode ) )
                    	    // InternalTyphonML.g:3232:6: (lv_nodes_10_0= ruleGraphNode )
                    	    {
                    	    // InternalTyphonML.g:3232:6: (lv_nodes_10_0= ruleGraphNode )
                    	    // InternalTyphonML.g:3233:7: lv_nodes_10_0= ruleGraphNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getNodesGraphNodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_56); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalTyphonML.g:3256:3: (otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==57) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTyphonML.g:3257:4: otherlv_12= 'edges' otherlv_13= '{' ( (lv_edges_14_0= ruleGraphEdge ) ) (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getGraphDBAccess().getEdgesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_13, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTyphonML.g:3265:4: ( (lv_edges_14_0= ruleGraphEdge ) )
                    // InternalTyphonML.g:3266:5: (lv_edges_14_0= ruleGraphEdge )
                    {
                    // InternalTyphonML.g:3266:5: (lv_edges_14_0= ruleGraphEdge )
                    // InternalTyphonML.g:3267:6: lv_edges_14_0= ruleGraphEdge
                    {

                    						newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:3284:4: (otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==19) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalTyphonML.g:3285:5: otherlv_15= ',' ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_57); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGraphDBAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTyphonML.g:3289:5: ( (lv_edges_16_0= ruleGraphEdge ) )
                    	    // InternalTyphonML.g:3290:6: (lv_edges_16_0= ruleGraphEdge )
                    	    {
                    	    // InternalTyphonML.g:3290:6: (lv_edges_16_0= ruleGraphEdge )
                    	    // InternalTyphonML.g:3291:7: lv_edges_16_0= ruleGraphEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesGraphEdgeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_17=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:3322:1: entryRuleColumnDB returns [EObject current=null] : iv_ruleColumnDB= ruleColumnDB EOF ;
    public final EObject entryRuleColumnDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDB = null;


        try {
            // InternalTyphonML.g:3322:49: (iv_ruleColumnDB= ruleColumnDB EOF )
            // InternalTyphonML.g:3323:2: iv_ruleColumnDB= ruleColumnDB EOF
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
    // InternalTyphonML.g:3329:1: ruleColumnDB returns [EObject current=null] : ( () otherlv_1= 'ColumnDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleColumnDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_columns_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3335:2: ( ( () otherlv_1= 'ColumnDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTyphonML.g:3336:2: ( () otherlv_1= 'ColumnDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTyphonML.g:3336:2: ( () otherlv_1= 'ColumnDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTyphonML.g:3337:3: () otherlv_1= 'ColumnDB' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalTyphonML.g:3337:3: ()
            // InternalTyphonML.g:3338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnDBAccess().getColumnDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnDBAccess().getColumnDBKeyword_1());
            		
            // InternalTyphonML.g:3348:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3349:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3349:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3350:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnDBAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDBRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:3371:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==13) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTyphonML.g:3372:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnDBAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:3376:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:3377:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:3377:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:3378:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnDBRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3396:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==59) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalTyphonML.g:3397:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnDBAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_60); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnDBAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTyphonML.g:3405:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalTyphonML.g:3406:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalTyphonML.g:3406:5: (lv_columns_8_0= ruleColumn )
                    // InternalTyphonML.g:3407:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:3424:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==19) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalTyphonML.g:3425:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_60); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getColumnDBAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTyphonML.g:3429:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalTyphonML.g:3430:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalTyphonML.g:3430:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalTyphonML.g:3431:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnDBAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getColumnDBAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:3462:1: entryRuleGraphEdge_Impl returns [EObject current=null] : iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF ;
    public final EObject entryRuleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdge_Impl = null;


        try {
            // InternalTyphonML.g:3462:55: (iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF )
            // InternalTyphonML.g:3463:2: iv_ruleGraphEdge_Impl= ruleGraphEdge_Impl EOF
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
    // InternalTyphonML.g:3469:1: ruleGraphEdge_Impl returns [EObject current=null] : ( () otherlv_1= 'GraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleGraphEdge_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_labels_12_0 = null;

        EObject lv_labels_14_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3475:2: ( ( () otherlv_1= 'GraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3476:2: ( () otherlv_1= 'GraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3476:2: ( () otherlv_1= 'GraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3477:3: () otherlv_1= 'GraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3477:3: ()
            // InternalTyphonML.g:3478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphEdge_ImplAccess().getGraphEdgeKeyword_1());
            		
            // InternalTyphonML.g:3488:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3489:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3489:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3490:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphEdge_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:3511:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==13) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTyphonML.g:3512:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:3516:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:3517:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:3517:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:3518:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3536:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==61) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalTyphonML.g:3537:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdge_ImplAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:3541:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3542:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3542:5: ( ruleEString )
                    // InternalTyphonML.g:3543:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3558:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==62) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalTyphonML.g:3559:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getGraphEdge_ImplAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:3563:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3564:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3564:5: ( ruleEString )
                    // InternalTyphonML.g:3565:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdge_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3580:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==63) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTyphonML.g:3581:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraphEdge_ImplAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_11, grammarAccess.getGraphEdge_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3589:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:3590:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:3590:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:3591:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:3608:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==19) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalTyphonML.g:3609:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_65); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getGraphEdge_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3613:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:3614:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:3614:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:3615:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getGraphEdge_ImplAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getGraphEdge_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

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
    // InternalTyphonML.g:3646:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:3646:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:3647:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
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
    // InternalTyphonML.g:3653:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () otherlv_1= 'GraphEdgeLabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3659:2: ( ( () otherlv_1= 'GraphEdgeLabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:3660:2: ( () otherlv_1= 'GraphEdgeLabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:3660:2: ( () otherlv_1= 'GraphEdgeLabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:3661:3: () otherlv_1= 'GraphEdgeLabel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:3661:3: ()
            // InternalTyphonML.g:3662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelKeyword_1());
            		
            // InternalTyphonML.g:3672:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3673:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3673:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3674:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphEdgeLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphEdgeLabelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:3695:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==13) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTyphonML.g:3696:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:3700:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:3701:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:3701:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:3702:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphEdgeLabelRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3720:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==14) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTyphonML.g:3721:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphEdgeLabelAccess().getTypeKeyword_5_0());
                    			
                    // InternalTyphonML.g:3725:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3726:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3726:5: ( ruleEString )
                    // InternalTyphonML.g:3727:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphEdgeLabelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphEdgeLabelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAddGraphEdge"
    // InternalTyphonML.g:3750:1: entryRuleAddGraphEdge returns [EObject current=null] : iv_ruleAddGraphEdge= ruleAddGraphEdge EOF ;
    public final EObject entryRuleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphEdge = null;


        try {
            // InternalTyphonML.g:3750:53: (iv_ruleAddGraphEdge= ruleAddGraphEdge EOF )
            // InternalTyphonML.g:3751:2: iv_ruleAddGraphEdge= ruleAddGraphEdge EOF
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
    // InternalTyphonML.g:3757:1: ruleAddGraphEdge returns [EObject current=null] : ( () otherlv_1= 'AddGraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleAddGraphEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        EObject lv_labels_12_0 = null;

        EObject lv_labels_14_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:3763:2: ( ( () otherlv_1= 'AddGraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTyphonML.g:3764:2: ( () otherlv_1= 'AddGraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTyphonML.g:3764:2: ( () otherlv_1= 'AddGraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTyphonML.g:3765:3: () otherlv_1= 'AddGraphEdge' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'from' ( ( ruleEString ) ) )? (otherlv_8= 'to' ( ( ruleEString ) ) )? (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTyphonML.g:3765:3: ()
            // InternalTyphonML.g:3766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddGraphEdgeAccess().getAddGraphEdgeKeyword_1());
            		
            // InternalTyphonML.g:3776:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:3777:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:3777:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:3778:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddGraphEdgeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:3799:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==13) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTyphonML.g:3800:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:3804:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:3805:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:3805:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:3806:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddGraphEdgeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3824:3: (otherlv_6= 'from' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==61) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTyphonML.g:3825:4: otherlv_6= 'from' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphEdgeAccess().getFromKeyword_5_0());
                    			
                    // InternalTyphonML.g:3829:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3830:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3830:5: ( ruleEString )
                    // InternalTyphonML.g:3831:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getFromGraphNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3846:3: (otherlv_8= 'to' ( ( ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==62) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTyphonML.g:3847:4: otherlv_8= 'to' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddGraphEdgeAccess().getToKeyword_6_0());
                    			
                    // InternalTyphonML.g:3851:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3852:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3852:5: ( ruleEString )
                    // InternalTyphonML.g:3853:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphEdgeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getToGraphNodeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:3868:3: (otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==63) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalTyphonML.g:3869:4: otherlv_10= 'labels' otherlv_11= '{' ( (lv_labels_12_0= ruleGraphEdgeLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddGraphEdgeAccess().getLabelsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_11, grammarAccess.getAddGraphEdgeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalTyphonML.g:3877:4: ( (lv_labels_12_0= ruleGraphEdgeLabel ) )
                    // InternalTyphonML.g:3878:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    {
                    // InternalTyphonML.g:3878:5: (lv_labels_12_0= ruleGraphEdgeLabel )
                    // InternalTyphonML.g:3879:6: lv_labels_12_0= ruleGraphEdgeLabel
                    {

                    						newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalTyphonML.g:3896:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==19) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalTyphonML.g:3897:5: otherlv_13= ',' ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_65); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAddGraphEdgeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalTyphonML.g:3901:5: ( (lv_labels_14_0= ruleGraphEdgeLabel ) )
                    	    // InternalTyphonML.g:3902:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    {
                    	    // InternalTyphonML.g:3902:6: (lv_labels_14_0= ruleGraphEdgeLabel )
                    	    // InternalTyphonML.g:3903:7: lv_labels_14_0= ruleGraphEdgeLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddGraphEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getAddGraphEdgeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleColumn"
    // InternalTyphonML.g:3934:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalTyphonML.g:3934:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalTyphonML.g:3935:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalTyphonML.g:3941:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalTyphonML.g:3947:2: ( ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' ) )
            // InternalTyphonML.g:3948:2: ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            {
            // InternalTyphonML.g:3948:2: ( () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}' )
            // InternalTyphonML.g:3949:3: () otherlv_1= 'Column' otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= '}'
            {
            // InternalTyphonML.g:3949:3: ()
            // InternalTyphonML.g:3950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:3964:3: (otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==18) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalTyphonML.g:3965:4: otherlv_3= 'attributes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getAttributesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalTyphonML.g:3973:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:3974:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:3974:5: ( ruleEString )
                    // InternalTyphonML.g:3975:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTyphonML.g:3989:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==19) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalTyphonML.g:3990:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTyphonML.g:3994:5: ( ( ruleEString ) )
                    	    // InternalTyphonML.g:3995:6: ( ruleEString )
                    	    {
                    	    // InternalTyphonML.g:3995:6: ( ruleEString )
                    	    // InternalTyphonML.g:3996:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getColumnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getAttributesAttributeCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGraphAttribute_Impl"
    // InternalTyphonML.g:4024:1: entryRuleGraphAttribute_Impl returns [EObject current=null] : iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF ;
    public final EObject entryRuleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute_Impl = null;


        try {
            // InternalTyphonML.g:4024:60: (iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF )
            // InternalTyphonML.g:4025:2: iv_ruleGraphAttribute_Impl= ruleGraphAttribute_Impl EOF
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
    // InternalTyphonML.g:4031:1: ruleGraphAttribute_Impl returns [EObject current=null] : ( () otherlv_1= 'GraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGraphAttribute_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4037:2: ( ( () otherlv_1= 'GraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:4038:2: ( () otherlv_1= 'GraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:4038:2: ( () otherlv_1= 'GraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:4039:3: () otherlv_1= 'GraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:4039:3: ()
            // InternalTyphonML.g:4040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphAttribute_ImplAccess().getGraphAttributeKeyword_1());
            		
            // InternalTyphonML.g:4050:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:4051:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:4051:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:4052:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphAttribute_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAttribute_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:4073:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==13) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTyphonML.g:4074:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:4078:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:4079:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:4079:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:4080:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphAttribute_ImplRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4098:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==68) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalTyphonML.g:4099:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphAttribute_ImplAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:4103:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4104:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4104:5: ( ruleEString )
                    // InternalTyphonML.g:4105:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphAttribute_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphAttribute_ImplAccess().getValueAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAttribute_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:4128:1: entryRuleAddGraphAttribute returns [EObject current=null] : iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF ;
    public final EObject entryRuleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddGraphAttribute = null;


        try {
            // InternalTyphonML.g:4128:58: (iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF )
            // InternalTyphonML.g:4129:2: iv_ruleAddGraphAttribute= ruleAddGraphAttribute EOF
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
    // InternalTyphonML.g:4135:1: ruleAddGraphAttribute returns [EObject current=null] : ( () otherlv_1= 'AddGraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAddGraphAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4141:2: ( ( () otherlv_1= 'AddGraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:4142:2: ( () otherlv_1= 'AddGraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:4142:2: ( () otherlv_1= 'AddGraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalTyphonML.g:4143:3: () otherlv_1= 'AddGraphAttribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:4143:3: ()
            // InternalTyphonML.g:4144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddGraphAttributeAccess().getAddGraphAttributeKeyword_1());
            		
            // InternalTyphonML.g:4154:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:4155:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:4155:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:4156:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddGraphAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getAddGraphAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:4177:3: (otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==13) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTyphonML.g:4178:4: otherlv_4= 'importedNamespace' ( (lv_importedNamespace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceKeyword_4_0());
                    			
                    // InternalTyphonML.g:4182:4: ( (lv_importedNamespace_5_0= ruleEString ) )
                    // InternalTyphonML.g:4183:5: (lv_importedNamespace_5_0= ruleEString )
                    {
                    // InternalTyphonML.g:4183:5: (lv_importedNamespace_5_0= ruleEString )
                    // InternalTyphonML.g:4184:6: lv_importedNamespace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_importedNamespace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddGraphAttributeRule());
                    						}
                    						set(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:4202:3: (otherlv_6= 'value' ( ( ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==68) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalTyphonML.g:4203:4: otherlv_6= 'value' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddGraphAttributeAccess().getValueKeyword_5_0());
                    			
                    // InternalTyphonML.g:4207:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4208:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4208:5: ( ruleEString )
                    // InternalTyphonML.g:4209:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddGraphAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddGraphAttributeAccess().getValueAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDataTypeItem"
    // InternalTyphonML.g:4232:1: entryRuleDataTypeItem returns [EObject current=null] : iv_ruleDataTypeItem= ruleDataTypeItem EOF ;
    public final EObject entryRuleDataTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeItem = null;


        try {
            // InternalTyphonML.g:4232:53: (iv_ruleDataTypeItem= ruleDataTypeItem EOF )
            // InternalTyphonML.g:4233:2: iv_ruleDataTypeItem= ruleDataTypeItem EOF
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
    // InternalTyphonML.g:4239:1: ruleDataTypeItem returns [EObject current=null] : (otherlv_0= 'DataTypeItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= 'implementation' ( (lv_implementation_8_0= ruleDataTypeImplementationPackage ) ) otherlv_9= '}' ) ;
    public final EObject ruleDataTypeItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_4_0 = null;

        EObject lv_implementation_8_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4245:2: ( (otherlv_0= 'DataTypeItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= 'implementation' ( (lv_implementation_8_0= ruleDataTypeImplementationPackage ) ) otherlv_9= '}' ) )
            // InternalTyphonML.g:4246:2: (otherlv_0= 'DataTypeItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= 'implementation' ( (lv_implementation_8_0= ruleDataTypeImplementationPackage ) ) otherlv_9= '}' )
            {
            // InternalTyphonML.g:4246:2: (otherlv_0= 'DataTypeItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= 'implementation' ( (lv_implementation_8_0= ruleDataTypeImplementationPackage ) ) otherlv_9= '}' )
            // InternalTyphonML.g:4247:3: otherlv_0= 'DataTypeItem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= 'implementation' ( (lv_implementation_8_0= ruleDataTypeImplementationPackage ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeItemAccess().getDataTypeItemKeyword_0());
            		
            // InternalTyphonML.g:4251:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:4252:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:4252:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:4253:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeItemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:4274:3: (otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==13) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalTyphonML.g:4275:4: otherlv_3= 'importedNamespace' ( (lv_importedNamespace_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataTypeItemAccess().getImportedNamespaceKeyword_3_0());
                    			
                    // InternalTyphonML.g:4279:4: ( (lv_importedNamespace_4_0= ruleEString ) )
                    // InternalTyphonML.g:4280:5: (lv_importedNamespace_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:4280:5: (lv_importedNamespace_4_0= ruleEString )
                    // InternalTyphonML.g:4281:6: lv_importedNamespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataTypeItemAccess().getImportedNamespaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_importedNamespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeItemRule());
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

            // InternalTyphonML.g:4299:3: (otherlv_5= 'type' ( ( ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==14) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalTyphonML.g:4300:4: otherlv_5= 'type' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataTypeItemAccess().getTypeKeyword_4_0());
                    			
                    // InternalTyphonML.g:4304:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:4305:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:4305:5: ( ruleEString )
                    // InternalTyphonML.g:4306:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeItemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataTypeItemAccess().getTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,71,FOLLOW_71); 

            			newLeafNode(otherlv_7, grammarAccess.getDataTypeItemAccess().getImplementationKeyword_5());
            		
            // InternalTyphonML.g:4325:3: ( (lv_implementation_8_0= ruleDataTypeImplementationPackage ) )
            // InternalTyphonML.g:4326:4: (lv_implementation_8_0= ruleDataTypeImplementationPackage )
            {
            // InternalTyphonML.g:4326:4: (lv_implementation_8_0= ruleDataTypeImplementationPackage )
            // InternalTyphonML.g:4327:5: lv_implementation_8_0= ruleDataTypeImplementationPackage
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getImplementationDataTypeImplementationPackageParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_implementation_8_0=ruleDataTypeImplementationPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeItemRule());
            					}
            					set(
            						current,
            						"implementation",
            						lv_implementation_8_0,
            						"it.univaq.disim.typhon.TyphonML.DataTypeImplementationPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDataTypeItemAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:4352:1: entryRuleDataTypeImplementationPackage returns [EObject current=null] : iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF ;
    public final EObject entryRuleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeImplementationPackage = null;


        try {
            // InternalTyphonML.g:4352:70: (iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF )
            // InternalTyphonML.g:4353:2: iv_ruleDataTypeImplementationPackage= ruleDataTypeImplementationPackage EOF
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
    // InternalTyphonML.g:4359:1: ruleDataTypeImplementationPackage returns [EObject current=null] : ( () otherlv_1= 'DataTypeImplementationPackage' otherlv_2= '{' (otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleDataTypeImplementationPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_location_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:4365:2: ( ( () otherlv_1= 'DataTypeImplementationPackage' otherlv_2= '{' (otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalTyphonML.g:4366:2: ( () otherlv_1= 'DataTypeImplementationPackage' otherlv_2= '{' (otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalTyphonML.g:4366:2: ( () otherlv_1= 'DataTypeImplementationPackage' otherlv_2= '{' (otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalTyphonML.g:4367:3: () otherlv_1= 'DataTypeImplementationPackage' otherlv_2= '{' (otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalTyphonML.g:4367:3: ()
            // InternalTyphonML.g:4368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeImplementationPackageAccess().getDataTypeImplementationPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeImplementationPackageAccess().getDataTypeImplementationPackageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeImplementationPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:4382:3: (otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==73) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalTyphonML.g:4383:4: otherlv_3= 'location' ( (lv_location_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataTypeImplementationPackageAccess().getLocationKeyword_3_0());
                    			
                    // InternalTyphonML.g:4387:4: ( (lv_location_4_0= ruleEString ) )
                    // InternalTyphonML.g:4388:5: (lv_location_4_0= ruleEString )
                    {
                    // InternalTyphonML.g:4388:5: (lv_location_4_0= ruleEString )
                    // InternalTyphonML.g:4389:6: lv_location_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataTypeImplementationPackageAccess().getLocationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_location_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeImplementationPackageRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_4_0,
                    							"it.univaq.disim.typhon.TyphonML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataTypeImplementationPackageAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "ruleCardinality"
    // InternalTyphonML.g:4415:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= 'zero_one' ) | (enumLiteral_1= 'one' ) | (enumLiteral_2= 'zero_many' ) | (enumLiteral_3= 'one_many' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:4421:2: ( ( (enumLiteral_0= 'zero_one' ) | (enumLiteral_1= 'one' ) | (enumLiteral_2= 'zero_many' ) | (enumLiteral_3= 'one_many' ) ) )
            // InternalTyphonML.g:4422:2: ( (enumLiteral_0= 'zero_one' ) | (enumLiteral_1= 'one' ) | (enumLiteral_2= 'zero_many' ) | (enumLiteral_3= 'one_many' ) )
            {
            // InternalTyphonML.g:4422:2: ( (enumLiteral_0= 'zero_one' ) | (enumLiteral_1= 'one' ) | (enumLiteral_2= 'zero_many' ) | (enumLiteral_3= 'one_many' ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt95=1;
                }
                break;
            case 75:
                {
                alt95=2;
                }
                break;
            case 76:
                {
                alt95=3;
                }
                break;
            case 77:
                {
                alt95=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalTyphonML.g:4423:3: (enumLiteral_0= 'zero_one' )
                    {
                    // InternalTyphonML.g:4423:3: (enumLiteral_0= 'zero_one' )
                    // InternalTyphonML.g:4424:4: enumLiteral_0= 'zero_one'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:4431:3: (enumLiteral_1= 'one' )
                    {
                    // InternalTyphonML.g:4431:3: (enumLiteral_1= 'one' )
                    // InternalTyphonML.g:4432:4: enumLiteral_1= 'one'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:4439:3: (enumLiteral_2= 'zero_many' )
                    {
                    // InternalTyphonML.g:4439:3: (enumLiteral_2= 'zero_many' )
                    // InternalTyphonML.g:4440:4: enumLiteral_2= 'zero_many'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:4447:3: (enumLiteral_3= 'one_many' )
                    {
                    // InternalTyphonML.g:4447:3: (enumLiteral_3= 'one_many' )
                    // InternalTyphonML.g:4448:4: enumLiteral_3= 'one_many'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x04D4000005C10002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x04D4000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000200A000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000008000C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000038000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000030000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000100000004A000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000048000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000800000000A000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x002000000000A000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x030000000000A000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0300000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x080000000000A000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000008000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xE00000000000A000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xE000000000008000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xC000000000008000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x000000000000A000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000006000L,0x0000000000000080L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});

}