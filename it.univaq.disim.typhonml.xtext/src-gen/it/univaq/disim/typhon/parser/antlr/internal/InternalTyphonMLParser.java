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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'keyvaluedb'", "'{'", "'}'", "'->'", "'documentdb'", "':'", "'relationaldb'", "'table'", "'index'", "'id'", "'graphdb'", "'node'", "'='", "'edge'", "'from'", "'to'", "'label'", "'datatype'", "'custom-datatype'", "'entity'", "'.'", "'['", "']'", "'0..1'", "'1'", "'0..*'", "'*'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( ((LA1_0>=28 && LA1_0<=30)) ) {
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

                if ( (LA2_0==11||LA2_0==15||LA2_0==17||LA2_0==21) ) {
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


    // $ANTLR start "entryRuleDatabase"
    // InternalTyphonML.g:129:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalTyphonML.g:129:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalTyphonML.g:130:2: iv_ruleDatabase= ruleDatabase EOF
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
    // InternalTyphonML.g:136:1: ruleDatabase returns [EObject current=null] : (this_RelationalDB_0= ruleRelationalDB | this_GraphDB_1= ruleGraphDB | this_DocumentDB_2= ruleDocumentDB | this_KeyValueDB_3= ruleKeyValueDB ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalDB_0 = null;

        EObject this_GraphDB_1 = null;

        EObject this_DocumentDB_2 = null;

        EObject this_KeyValueDB_3 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:142:2: ( (this_RelationalDB_0= ruleRelationalDB | this_GraphDB_1= ruleGraphDB | this_DocumentDB_2= ruleDocumentDB | this_KeyValueDB_3= ruleKeyValueDB ) )
            // InternalTyphonML.g:143:2: (this_RelationalDB_0= ruleRelationalDB | this_GraphDB_1= ruleGraphDB | this_DocumentDB_2= ruleDocumentDB | this_KeyValueDB_3= ruleKeyValueDB )
            {
            // InternalTyphonML.g:143:2: (this_RelationalDB_0= ruleRelationalDB | this_GraphDB_1= ruleGraphDB | this_DocumentDB_2= ruleDocumentDB | this_KeyValueDB_3= ruleKeyValueDB )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 11:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTyphonML.g:144:3: this_RelationalDB_0= ruleRelationalDB
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
                    // InternalTyphonML.g:153:3: this_GraphDB_1= ruleGraphDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getGraphDBParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphDB_1=ruleGraphDB();

                    state._fsp--;


                    			current = this_GraphDB_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:162:3: this_DocumentDB_2= ruleDocumentDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getDocumentDBParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentDB_2=ruleDocumentDB();

                    state._fsp--;


                    			current = this_DocumentDB_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:171:3: this_KeyValueDB_3= ruleKeyValueDB
                    {

                    			newCompositeNode(grammarAccess.getDatabaseAccess().getKeyValueDBParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyValueDB_3=ruleKeyValueDB();

                    state._fsp--;


                    			current = this_KeyValueDB_3;
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


    // $ANTLR start "entryRuleKeyValueDB"
    // InternalTyphonML.g:183:1: entryRuleKeyValueDB returns [EObject current=null] : iv_ruleKeyValueDB= ruleKeyValueDB EOF ;
    public final EObject entryRuleKeyValueDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueDB = null;


        try {
            // InternalTyphonML.g:183:51: (iv_ruleKeyValueDB= ruleKeyValueDB EOF )
            // InternalTyphonML.g:184:2: iv_ruleKeyValueDB= ruleKeyValueDB EOF
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
    // InternalTyphonML.g:190:1: ruleKeyValueDB returns [EObject current=null] : ( () otherlv_1= 'keyvaluedb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleKeyValueElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleKeyValueDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:196:2: ( ( () otherlv_1= 'keyvaluedb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleKeyValueElement ) )* otherlv_5= '}' ) )
            // InternalTyphonML.g:197:2: ( () otherlv_1= 'keyvaluedb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleKeyValueElement ) )* otherlv_5= '}' )
            {
            // InternalTyphonML.g:197:2: ( () otherlv_1= 'keyvaluedb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleKeyValueElement ) )* otherlv_5= '}' )
            // InternalTyphonML.g:198:3: () otherlv_1= 'keyvaluedb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleKeyValueElement ) )* otherlv_5= '}'
            {
            // InternalTyphonML.g:198:3: ()
            // InternalTyphonML.g:199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_1());
            		
            // InternalTyphonML.g:209:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:210:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:210:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:211:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getKeyValueDBAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueDBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:231:3: ( (lv_elements_4_0= ruleKeyValueElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTyphonML.g:232:4: (lv_elements_4_0= ruleKeyValueElement )
            	    {
            	    // InternalTyphonML.g:232:4: (lv_elements_4_0= ruleKeyValueElement )
            	    // InternalTyphonML.g:233:5: lv_elements_4_0= ruleKeyValueElement
            	    {

            	    					newCompositeNode(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_4_0=ruleKeyValueElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKeyValueDBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"it.univaq.disim.typhon.TyphonML.KeyValueElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleKeyValueElement"
    // InternalTyphonML.g:258:1: entryRuleKeyValueElement returns [EObject current=null] : iv_ruleKeyValueElement= ruleKeyValueElement EOF ;
    public final EObject entryRuleKeyValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueElement = null;


        try {
            // InternalTyphonML.g:258:56: (iv_ruleKeyValueElement= ruleKeyValueElement EOF )
            // InternalTyphonML.g:259:2: iv_ruleKeyValueElement= ruleKeyValueElement EOF
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
    // InternalTyphonML.g:265:1: ruleKeyValueElement returns [EObject current=null] : ( () ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( ruleEString ) )? otherlv_6= '}' ) ;
    public final EObject ruleKeyValueElement() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalTyphonML.g:271:2: ( ( () ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( ruleEString ) )? otherlv_6= '}' ) )
            // InternalTyphonML.g:272:2: ( () ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( ruleEString ) )? otherlv_6= '}' )
            {
            // InternalTyphonML.g:272:2: ( () ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( ruleEString ) )? otherlv_6= '}' )
            // InternalTyphonML.g:273:3: () ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( ruleEString ) )? otherlv_6= '}'
            {
            // InternalTyphonML.g:273:3: ()
            // InternalTyphonML.g:274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyValueElementAccess().getKeyValueElementAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:280:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalTyphonML.g:281:4: (lv_key_1_0= RULE_ID )
            {
            // InternalTyphonML.g:281:4: (lv_key_1_0= RULE_ID )
            // InternalTyphonML.g:282:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_1_0, grammarAccess.getKeyValueElementAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalTyphonML.g:302:3: ( (otherlv_3= RULE_ID ) )
            // InternalTyphonML.g:303:4: (otherlv_3= RULE_ID )
            {
            // InternalTyphonML.g:303:4: (otherlv_3= RULE_ID )
            // InternalTyphonML.g:304:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValueElementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getKeyValueElementAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTyphonML.g:319:3: ( ( ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTyphonML.g:320:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:320:4: ( ruleEString )
                    // InternalTyphonML.g:321:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKeyValueElementRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_5_0());
                    				
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getKeyValueElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDocumentDB"
    // InternalTyphonML.g:343:1: entryRuleDocumentDB returns [EObject current=null] : iv_ruleDocumentDB= ruleDocumentDB EOF ;
    public final EObject entryRuleDocumentDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDB = null;


        try {
            // InternalTyphonML.g:343:51: (iv_ruleDocumentDB= ruleDocumentDB EOF )
            // InternalTyphonML.g:344:2: iv_ruleDocumentDB= ruleDocumentDB EOF
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
    // InternalTyphonML.g:350:1: ruleDocumentDB returns [EObject current=null] : ( () otherlv_1= 'documentdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleDocumentDBCollection ) )* otherlv_5= '}' ) ;
    public final EObject ruleDocumentDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_collections_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:356:2: ( ( () otherlv_1= 'documentdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleDocumentDBCollection ) )* otherlv_5= '}' ) )
            // InternalTyphonML.g:357:2: ( () otherlv_1= 'documentdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleDocumentDBCollection ) )* otherlv_5= '}' )
            {
            // InternalTyphonML.g:357:2: ( () otherlv_1= 'documentdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleDocumentDBCollection ) )* otherlv_5= '}' )
            // InternalTyphonML.g:358:3: () otherlv_1= 'documentdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_collections_4_0= ruleDocumentDBCollection ) )* otherlv_5= '}'
            {
            // InternalTyphonML.g:358:3: ()
            // InternalTyphonML.g:359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBAccess().getDocumentDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_1());
            		
            // InternalTyphonML.g:369:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:370:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:370:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:371:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDocumentDBAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentDBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:391:3: ( (lv_collections_4_0= ruleDocumentDBCollection ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTyphonML.g:392:4: (lv_collections_4_0= ruleDocumentDBCollection )
            	    {
            	    // InternalTyphonML.g:392:4: (lv_collections_4_0= ruleDocumentDBCollection )
            	    // InternalTyphonML.g:393:5: lv_collections_4_0= ruleDocumentDBCollection
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentDBAccess().getCollectionsDocumentDBCollectionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_collections_4_0=ruleDocumentDBCollection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentDBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"collections",
            	    						lv_collections_4_0,
            	    						"it.univaq.disim.typhon.TyphonML.DocumentDBCollection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDocumentDBCollection"
    // InternalTyphonML.g:418:1: entryRuleDocumentDBCollection returns [EObject current=null] : iv_ruleDocumentDBCollection= ruleDocumentDBCollection EOF ;
    public final EObject entryRuleDocumentDBCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentDBCollection = null;


        try {
            // InternalTyphonML.g:418:61: (iv_ruleDocumentDBCollection= ruleDocumentDBCollection EOF )
            // InternalTyphonML.g:419:2: iv_ruleDocumentDBCollection= ruleDocumentDBCollection EOF
            {
             newCompositeNode(grammarAccess.getDocumentDBCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentDBCollection=ruleDocumentDBCollection();

            state._fsp--;

             current =iv_ruleDocumentDBCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentDBCollection"


    // $ANTLR start "ruleDocumentDBCollection"
    // InternalTyphonML.g:425:1: ruleDocumentDBCollection returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDocumentDBCollection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:431:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTyphonML.g:432:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTyphonML.g:432:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalTyphonML.g:433:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalTyphonML.g:433:3: ()
            // InternalTyphonML.g:434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentDBCollectionAccess().getCollectionAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTyphonML.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTyphonML.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalTyphonML.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDocumentDBCollectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentDBCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentDBCollectionAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:462:3: ( (otherlv_3= RULE_ID ) )
            // InternalTyphonML.g:463:4: (otherlv_3= RULE_ID )
            {
            // InternalTyphonML.g:463:4: (otherlv_3= RULE_ID )
            // InternalTyphonML.g:464:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentDBCollectionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getDocumentDBCollectionAccess().getEntityEntityCrossReference_3_0());
            				

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
    // $ANTLR end "ruleDocumentDBCollection"


    // $ANTLR start "entryRuleRelationalDB"
    // InternalTyphonML.g:479:1: entryRuleRelationalDB returns [EObject current=null] : iv_ruleRelationalDB= ruleRelationalDB EOF ;
    public final EObject entryRuleRelationalDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDB = null;


        try {
            // InternalTyphonML.g:479:53: (iv_ruleRelationalDB= ruleRelationalDB EOF )
            // InternalTyphonML.g:480:2: iv_ruleRelationalDB= ruleRelationalDB EOF
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
    // InternalTyphonML.g:486:1: ruleRelationalDB returns [EObject current=null] : ( () otherlv_1= 'relationaldb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_tables_4_0= ruleTable ) )* otherlv_5= '}' ) ;
    public final EObject ruleRelationalDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tables_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:492:2: ( ( () otherlv_1= 'relationaldb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_tables_4_0= ruleTable ) )* otherlv_5= '}' ) )
            // InternalTyphonML.g:493:2: ( () otherlv_1= 'relationaldb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_tables_4_0= ruleTable ) )* otherlv_5= '}' )
            {
            // InternalTyphonML.g:493:2: ( () otherlv_1= 'relationaldb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_tables_4_0= ruleTable ) )* otherlv_5= '}' )
            // InternalTyphonML.g:494:3: () otherlv_1= 'relationaldb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_tables_4_0= ruleTable ) )* otherlv_5= '}'
            {
            // InternalTyphonML.g:494:3: ()
            // InternalTyphonML.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationalDBAccess().getRelationalDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_1());
            		
            // InternalTyphonML.g:505:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:506:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:506:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:507:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRelationalDBAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationalDBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:527:3: ( (lv_tables_4_0= ruleTable ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTyphonML.g:528:4: (lv_tables_4_0= ruleTable )
            	    {
            	    // InternalTyphonML.g:528:4: (lv_tables_4_0= ruleTable )
            	    // InternalTyphonML.g:529:5: lv_tables_4_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_tables_4_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationalDBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_4_0,
            	    						"it.univaq.disim.typhon.TyphonML.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTable"
    // InternalTyphonML.g:554:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalTyphonML.g:554:46: (iv_ruleTable= ruleTable EOF )
            // InternalTyphonML.g:555:2: iv_ruleTable= ruleTable EOF
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
    // InternalTyphonML.g:561:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_indexSpec_6_0= ruleIndexSpec ) )? ( (lv_idSpec_7_0= ruleIdSpec ) )? otherlv_8= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_indexSpec_6_0 = null;

        EObject lv_idSpec_7_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:567:2: ( ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_indexSpec_6_0= ruleIndexSpec ) )? ( (lv_idSpec_7_0= ruleIdSpec ) )? otherlv_8= '}' ) )
            // InternalTyphonML.g:568:2: ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_indexSpec_6_0= ruleIndexSpec ) )? ( (lv_idSpec_7_0= ruleIdSpec ) )? otherlv_8= '}' )
            {
            // InternalTyphonML.g:568:2: ( () otherlv_1= 'table' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_indexSpec_6_0= ruleIndexSpec ) )? ( (lv_idSpec_7_0= ruleIdSpec ) )? otherlv_8= '}' )
            // InternalTyphonML.g:569:3: () otherlv_1= 'table' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (lv_indexSpec_6_0= ruleIndexSpec ) )? ( (lv_idSpec_7_0= ruleIdSpec ) )? otherlv_8= '}'
            {
            // InternalTyphonML.g:569:3: ()
            // InternalTyphonML.g:570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:584:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalTyphonML.g:585:4: (lv_name_3_0= RULE_ID )
            {
            // InternalTyphonML.g:585:4: (lv_name_3_0= RULE_ID )
            // InternalTyphonML.g:586:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getColonKeyword_4());
            		
            // InternalTyphonML.g:606:3: ( (otherlv_5= RULE_ID ) )
            // InternalTyphonML.g:607:4: (otherlv_5= RULE_ID )
            {
            // InternalTyphonML.g:607:4: (otherlv_5= RULE_ID )
            // InternalTyphonML.g:608:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0());
            				

            }


            }

            // InternalTyphonML.g:619:3: ( (lv_indexSpec_6_0= ruleIndexSpec ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:620:4: (lv_indexSpec_6_0= ruleIndexSpec )
                    {
                    // InternalTyphonML.g:620:4: (lv_indexSpec_6_0= ruleIndexSpec )
                    // InternalTyphonML.g:621:5: lv_indexSpec_6_0= ruleIndexSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_indexSpec_6_0=ruleIndexSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"indexSpec",
                    						lv_indexSpec_6_0,
                    						"it.univaq.disim.typhon.TyphonML.IndexSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTyphonML.g:638:3: ( (lv_idSpec_7_0= ruleIdSpec ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTyphonML.g:639:4: (lv_idSpec_7_0= ruleIdSpec )
                    {
                    // InternalTyphonML.g:639:4: (lv_idSpec_7_0= ruleIdSpec )
                    // InternalTyphonML.g:640:5: lv_idSpec_7_0= ruleIdSpec
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_idSpec_7_0=ruleIdSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"idSpec",
                    						lv_idSpec_7_0,
                    						"it.univaq.disim.typhon.TyphonML.IdSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleIndexSpec"
    // InternalTyphonML.g:665:1: entryRuleIndexSpec returns [EObject current=null] : iv_ruleIndexSpec= ruleIndexSpec EOF ;
    public final EObject entryRuleIndexSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSpec = null;


        try {
            // InternalTyphonML.g:665:50: (iv_ruleIndexSpec= ruleIndexSpec EOF )
            // InternalTyphonML.g:666:2: iv_ruleIndexSpec= ruleIndexSpec EOF
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
    // InternalTyphonML.g:672:1: ruleIndexSpec returns [EObject current=null] : ( () otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_STRING ) )* otherlv_5= '}' ) ;
    public final EObject ruleIndexSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTyphonML.g:678:2: ( ( () otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_STRING ) )* otherlv_5= '}' ) )
            // InternalTyphonML.g:679:2: ( () otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_STRING ) )* otherlv_5= '}' )
            {
            // InternalTyphonML.g:679:2: ( () otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_STRING ) )* otherlv_5= '}' )
            // InternalTyphonML.g:680:3: () otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= RULE_STRING ) )* otherlv_5= '}'
            {
            // InternalTyphonML.g:680:3: ()
            // InternalTyphonML.g:681:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexSpecAccess().getIndexSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexSpecAccess().getIndexKeyword_1());
            		
            // InternalTyphonML.g:691:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:692:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:692:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:693:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIndexSpecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:713:3: ( (otherlv_4= RULE_STRING ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTyphonML.g:714:4: (otherlv_4= RULE_STRING )
            	    {
            	    // InternalTyphonML.g:714:4: (otherlv_4= RULE_STRING )
            	    // InternalTyphonML.g:715:5: otherlv_4= RULE_STRING
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIndexSpecRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    					newLeafNode(otherlv_4, grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIndexSpecAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalTyphonML.g:734:1: entryRuleIdSpec returns [EObject current=null] : iv_ruleIdSpec= ruleIdSpec EOF ;
    public final EObject entryRuleIdSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSpec = null;


        try {
            // InternalTyphonML.g:734:47: (iv_ruleIdSpec= ruleIdSpec EOF )
            // InternalTyphonML.g:735:2: iv_ruleIdSpec= ruleIdSpec EOF
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
    // InternalTyphonML.g:741:1: ruleIdSpec returns [EObject current=null] : ( () otherlv_1= 'id' otherlv_2= '{' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '}' ) ;
    public final EObject ruleIdSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTyphonML.g:747:2: ( ( () otherlv_1= 'id' otherlv_2= '{' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '}' ) )
            // InternalTyphonML.g:748:2: ( () otherlv_1= 'id' otherlv_2= '{' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '}' )
            {
            // InternalTyphonML.g:748:2: ( () otherlv_1= 'id' otherlv_2= '{' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '}' )
            // InternalTyphonML.g:749:3: () otherlv_1= 'id' otherlv_2= '{' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '}'
            {
            // InternalTyphonML.g:749:3: ()
            // InternalTyphonML.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdSpecAccess().getIdSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSpecAccess().getIdKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getIdSpecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:764:3: ( (otherlv_3= RULE_STRING ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTyphonML.g:765:4: (otherlv_3= RULE_STRING )
            	    {
            	    // InternalTyphonML.g:765:4: (otherlv_3= RULE_STRING )
            	    // InternalTyphonML.g:766:5: otherlv_3= RULE_STRING
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIdSpecRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    					newLeafNode(otherlv_3, grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIdSpecAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGraphDB"
    // InternalTyphonML.g:785:1: entryRuleGraphDB returns [EObject current=null] : iv_ruleGraphDB= ruleGraphDB EOF ;
    public final EObject entryRuleGraphDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDB = null;


        try {
            // InternalTyphonML.g:785:48: (iv_ruleGraphDB= ruleGraphDB EOF )
            // InternalTyphonML.g:786:2: iv_ruleGraphDB= ruleGraphDB EOF
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
    // InternalTyphonML.g:792:1: ruleGraphDB returns [EObject current=null] : ( () otherlv_1= 'graphdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= '}' ) ;
    public final EObject ruleGraphDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_edges_5_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:798:2: ( ( () otherlv_1= 'graphdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= '}' ) )
            // InternalTyphonML.g:799:2: ( () otherlv_1= 'graphdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= '}' )
            {
            // InternalTyphonML.g:799:2: ( () otherlv_1= 'graphdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= '}' )
            // InternalTyphonML.g:800:3: () otherlv_1= 'graphdb' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= '}'
            {
            // InternalTyphonML.g:800:3: ()
            // InternalTyphonML.g:801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphDBAccess().getGraphDBAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphDBAccess().getGraphdbKeyword_1());
            		
            // InternalTyphonML.g:811:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:812:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:812:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:813:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGraphDBAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphDBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:833:3: ( (lv_nodes_4_0= ruleNode ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTyphonML.g:834:4: (lv_nodes_4_0= ruleNode )
            	    {
            	    // InternalTyphonML.g:834:4: (lv_nodes_4_0= ruleNode )
            	    // InternalTyphonML.g:835:5: lv_nodes_4_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getGraphDBAccess().getNodesNodeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_nodes_4_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphDBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_4_0,
            	    						"it.univaq.disim.typhon.TyphonML.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalTyphonML.g:852:3: ( (lv_edges_5_0= ruleEdge ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTyphonML.g:853:4: (lv_edges_5_0= ruleEdge )
            	    {
            	    // InternalTyphonML.g:853:4: (lv_edges_5_0= ruleEdge )
            	    // InternalTyphonML.g:854:5: lv_edges_5_0= ruleEdge
            	    {

            	    					newCompositeNode(grammarAccess.getGraphDBAccess().getEdgesEdgeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_edges_5_0=ruleEdge();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphDBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edges",
            	    						lv_edges_5_0,
            	    						"it.univaq.disim.typhon.TyphonML.Edge");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleNode"
    // InternalTyphonML.g:879:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalTyphonML.g:879:45: (iv_ruleNode= ruleNode EOF )
            // InternalTyphonML.g:880:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalTyphonML.g:886:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_attributes_6_0= ruleGraphAttribute ) )* otherlv_7= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:892:2: ( ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_attributes_6_0= ruleGraphAttribute ) )* otherlv_7= '}' ) )
            // InternalTyphonML.g:893:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_attributes_6_0= ruleGraphAttribute ) )* otherlv_7= '}' )
            {
            // InternalTyphonML.g:893:2: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_attributes_6_0= ruleGraphAttribute ) )* otherlv_7= '}' )
            // InternalTyphonML.g:894:3: () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_attributes_6_0= ruleGraphAttribute ) )* otherlv_7= '}'
            {
            // InternalTyphonML.g:894:3: ()
            // InternalTyphonML.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeAccess().getGraphNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalTyphonML.g:905:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:906:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:906:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:907:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getColonKeyword_3());
            		
            // InternalTyphonML.g:927:3: ( (otherlv_4= RULE_ID ) )
            // InternalTyphonML.g:928:4: (otherlv_4= RULE_ID )
            {
            // InternalTyphonML.g:928:4: (otherlv_4= RULE_ID )
            // InternalTyphonML.g:929:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getEntityEntityCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalTyphonML.g:944:3: ( (lv_attributes_6_0= ruleGraphAttribute ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTyphonML.g:945:4: (lv_attributes_6_0= ruleGraphAttribute )
            	    {
            	    // InternalTyphonML.g:945:4: (lv_attributes_6_0= ruleGraphAttribute )
            	    // InternalTyphonML.g:946:5: lv_attributes_6_0= ruleGraphAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getAttributesGraphAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_6_0=ruleGraphAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_6_0,
            	    						"it.univaq.disim.typhon.TyphonML.GraphAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleGraphAttribute"
    // InternalTyphonML.g:971:1: entryRuleGraphAttribute returns [EObject current=null] : iv_ruleGraphAttribute= ruleGraphAttribute EOF ;
    public final EObject entryRuleGraphAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphAttribute = null;


        try {
            // InternalTyphonML.g:971:55: (iv_ruleGraphAttribute= ruleGraphAttribute EOF )
            // InternalTyphonML.g:972:2: iv_ruleGraphAttribute= ruleGraphAttribute EOF
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
    // InternalTyphonML.g:978:1: ruleGraphAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleGraphAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:984:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (otherlv_3= RULE_STRING ) ) ) )
            // InternalTyphonML.g:985:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (otherlv_3= RULE_STRING ) ) )
            {
            // InternalTyphonML.g:985:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (otherlv_3= RULE_STRING ) ) )
            // InternalTyphonML.g:986:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (otherlv_3= RULE_STRING ) )
            {
            // InternalTyphonML.g:986:3: ()
            // InternalTyphonML.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphAttributeAccess().getGraphAttributeAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:993:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:994:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:994:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:995:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAttributeAccess().getEqualsSignKeyword_2());
            		
            // InternalTyphonML.g:1016:3: ( (otherlv_3= RULE_STRING ) )
            // InternalTyphonML.g:1017:4: (otherlv_3= RULE_STRING )
            {
            // InternalTyphonML.g:1017:4: (otherlv_3= RULE_STRING )
            // InternalTyphonML.g:1018:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getGraphAttributeAccess().getValueAttributeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleGraphAttribute"


    // $ANTLR start "entryRuleEdge"
    // InternalTyphonML.g:1033:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalTyphonML.g:1033:45: (iv_ruleEdge= ruleEdge EOF )
            // InternalTyphonML.g:1034:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalTyphonML.g:1040:1: ruleEdge returns [EObject current=null] : ( () otherlv_1= 'edge' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'label' otherlv_9= '{' ( (lv_labels_10_0= ruleGraphEdgeLabel ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_labels_10_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1046:2: ( ( () otherlv_1= 'edge' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'label' otherlv_9= '{' ( (lv_labels_10_0= ruleGraphEdgeLabel ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalTyphonML.g:1047:2: ( () otherlv_1= 'edge' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'label' otherlv_9= '{' ( (lv_labels_10_0= ruleGraphEdgeLabel ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalTyphonML.g:1047:2: ( () otherlv_1= 'edge' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'label' otherlv_9= '{' ( (lv_labels_10_0= ruleGraphEdgeLabel ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalTyphonML.g:1048:3: () otherlv_1= 'edge' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'label' otherlv_9= '{' ( (lv_labels_10_0= ruleGraphEdgeLabel ) )* otherlv_11= '}' otherlv_12= '}'
            {
            // InternalTyphonML.g:1048:3: ()
            // InternalTyphonML.g:1049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEdgeAccess().getGraphEdgeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEdgeAccess().getEdgeKeyword_1());
            		
            // InternalTyphonML.g:1059:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTyphonML.g:1060:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTyphonML.g:1060:4: (lv_name_2_0= RULE_ID )
            // InternalTyphonML.g:1061:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getEdgeAccess().getFromKeyword_4());
            		
            // InternalTyphonML.g:1085:3: ( (otherlv_5= RULE_ID ) )
            // InternalTyphonML.g:1086:4: (otherlv_5= RULE_ID )
            {
            // InternalTyphonML.g:1086:4: (otherlv_5= RULE_ID )
            // InternalTyphonML.g:1087:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_5, grammarAccess.getEdgeAccess().getFromGraphNodeCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getEdgeAccess().getToKeyword_6());
            		
            // InternalTyphonML.g:1102:3: ( (otherlv_7= RULE_ID ) )
            // InternalTyphonML.g:1103:4: (otherlv_7= RULE_ID )
            {
            // InternalTyphonML.g:1103:4: (otherlv_7= RULE_ID )
            // InternalTyphonML.g:1104:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEdgeRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_7, grammarAccess.getEdgeAccess().getToGraphNodeCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getEdgeAccess().getLabelKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalTyphonML.g:1123:3: ( (lv_labels_10_0= ruleGraphEdgeLabel ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTyphonML.g:1124:4: (lv_labels_10_0= ruleGraphEdgeLabel )
            	    {
            	    // InternalTyphonML.g:1124:4: (lv_labels_10_0= ruleGraphEdgeLabel )
            	    // InternalTyphonML.g:1125:5: lv_labels_10_0= ruleGraphEdgeLabel
            	    {

            	    					newCompositeNode(grammarAccess.getEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_labels_10_0=ruleGraphEdgeLabel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEdgeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"labels",
            	    						lv_labels_10_0,
            	    						"it.univaq.disim.typhon.TyphonML.GraphEdgeLabel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleGraphEdgeLabel"
    // InternalTyphonML.g:1154:1: entryRuleGraphEdgeLabel returns [EObject current=null] : iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF ;
    public final EObject entryRuleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphEdgeLabel = null;


        try {
            // InternalTyphonML.g:1154:55: (iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:1155:2: iv_ruleGraphEdgeLabel= ruleGraphEdgeLabel EOF
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
    // InternalTyphonML.g:1161:1: ruleGraphEdgeLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )? ) ;
    public final EObject ruleGraphEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1167:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:1168:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:1168:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )? )
            // InternalTyphonML.g:1169:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:1169:3: ()
            // InternalTyphonML.g:1170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1176:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1177:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1177:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1178:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphEdgeLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1199:3: ( ( ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||(LA16_1>=RULE_ID && LA16_1<=RULE_STRING)||LA16_1==13) ) {
                    alt16=1;
                }
            }
            else if ( (LA16_0==RULE_ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||(LA16_2>=RULE_ID && LA16_2<=RULE_STRING)||LA16_2==13) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalTyphonML.g:1200:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:1200:4: ( ruleEString )
                    // InternalTyphonML.g:1201:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGraphEdgeLabelRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeCrossReference_3_0());
                    				
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
    // $ANTLR end "ruleGraphEdgeLabel"


    // $ANTLR start "entryRuleDataType"
    // InternalTyphonML.g:1219:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalTyphonML.g:1219:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalTyphonML.g:1220:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalTyphonML.g:1226:1: ruleDataType returns [EObject current=null] : (this_PrimitiveDataType_0= rulePrimitiveDataType | this_CustomDataType_1= ruleCustomDataType | this_Entity_2= ruleEntity ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveDataType_0 = null;

        EObject this_CustomDataType_1 = null;

        EObject this_Entity_2 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1232:2: ( (this_PrimitiveDataType_0= rulePrimitiveDataType | this_CustomDataType_1= ruleCustomDataType | this_Entity_2= ruleEntity ) )
            // InternalTyphonML.g:1233:2: (this_PrimitiveDataType_0= rulePrimitiveDataType | this_CustomDataType_1= ruleCustomDataType | this_Entity_2= ruleEntity )
            {
            // InternalTyphonML.g:1233:2: (this_PrimitiveDataType_0= rulePrimitiveDataType | this_CustomDataType_1= ruleCustomDataType | this_Entity_2= ruleEntity )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalTyphonML.g:1234:3: this_PrimitiveDataType_0= rulePrimitiveDataType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getPrimitiveDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveDataType_0=rulePrimitiveDataType();

                    state._fsp--;


                    			current = this_PrimitiveDataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1243:3: this_CustomDataType_1= ruleCustomDataType
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
                    // InternalTyphonML.g:1252:3: this_Entity_2= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEntityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_2=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_2;
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


    // $ANTLR start "entryRuleEString"
    // InternalTyphonML.g:1264:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTyphonML.g:1264:47: (iv_ruleEString= ruleEString EOF )
            // InternalTyphonML.g:1265:2: iv_ruleEString= ruleEString EOF
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
    // InternalTyphonML.g:1271:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1277:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTyphonML.g:1278:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTyphonML.g:1278:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTyphonML.g:1279:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1287:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRulePrimitiveDataType"
    // InternalTyphonML.g:1298:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // InternalTyphonML.g:1298:58: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // InternalTyphonML.g:1299:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // InternalTyphonML.g:1305:1: rulePrimitiveDataType returns [EObject current=null] : ( () otherlv_1= 'datatype' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1311:2: ( ( () otherlv_1= 'datatype' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTyphonML.g:1312:2: ( () otherlv_1= 'datatype' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTyphonML.g:1312:2: ( () otherlv_1= 'datatype' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTyphonML.g:1313:3: () otherlv_1= 'datatype' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTyphonML.g:1313:3: ()
            // InternalTyphonML.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveDataTypeAccess().getDatatypeKeyword_1());
            		
            // InternalTyphonML.g:1324:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1325:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1325:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1326:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveDataTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleCustomDataType"
    // InternalTyphonML.g:1347:1: entryRuleCustomDataType returns [EObject current=null] : iv_ruleCustomDataType= ruleCustomDataType EOF ;
    public final EObject entryRuleCustomDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDataType = null;


        try {
            // InternalTyphonML.g:1347:55: (iv_ruleCustomDataType= ruleCustomDataType EOF )
            // InternalTyphonML.g:1348:2: iv_ruleCustomDataType= ruleCustomDataType EOF
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
    // InternalTyphonML.g:1354:1: ruleCustomDataType returns [EObject current=null] : ( () otherlv_1= 'custom-datatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleDataTypeItem ) )* otherlv_5= '}' ) ;
    public final EObject ruleCustomDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1360:2: ( ( () otherlv_1= 'custom-datatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleDataTypeItem ) )* otherlv_5= '}' ) )
            // InternalTyphonML.g:1361:2: ( () otherlv_1= 'custom-datatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleDataTypeItem ) )* otherlv_5= '}' )
            {
            // InternalTyphonML.g:1361:2: ( () otherlv_1= 'custom-datatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleDataTypeItem ) )* otherlv_5= '}' )
            // InternalTyphonML.g:1362:3: () otherlv_1= 'custom-datatype' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleDataTypeItem ) )* otherlv_5= '}'
            {
            // InternalTyphonML.g:1362:3: ()
            // InternalTyphonML.g:1363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomDataTypeAccess().getCustomDatatypeKeyword_1());
            		
            // InternalTyphonML.g:1373:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTyphonML.g:1374:4: (lv_name_2_0= ruleEString )
            {
            // InternalTyphonML.g:1374:4: (lv_name_2_0= ruleEString )
            // InternalTyphonML.g:1375:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTyphonML.g:1396:3: ( (lv_elements_4_0= ruleDataTypeItem ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTyphonML.g:1397:4: (lv_elements_4_0= ruleDataTypeItem )
            	    {
            	    // InternalTyphonML.g:1397:4: (lv_elements_4_0= ruleDataTypeItem )
            	    // InternalTyphonML.g:1398:5: lv_elements_4_0= ruleDataTypeItem
            	    {

            	    					newCompositeNode(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_4_0=ruleDataTypeItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomDataTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"it.univaq.disim.typhon.TyphonML.DataTypeItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEntity"
    // InternalTyphonML.g:1423:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalTyphonML.g:1423:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalTyphonML.g:1424:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalTyphonML.g:1430:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1436:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' ) )
            // InternalTyphonML.g:1437:2: (otherlv_0= 'entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            {
            // InternalTyphonML.g:1437:2: (otherlv_0= 'entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}' )
            // InternalTyphonML.g:1438:3: otherlv_0= 'entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_relations_4_0= ruleRelation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalTyphonML.g:1442:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1443:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1443:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1444:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTyphonML.g:1465:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==16) ) {
                        int LA20_4 = input.LA(3);

                        if ( ((LA20_4>=RULE_ID && LA20_4<=RULE_STRING)||LA20_4==13) ) {
                            alt20=1;
                        }


                    }


                }
                else if ( (LA20_0==RULE_ID) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==16) ) {
                        int LA20_4 = input.LA(3);

                        if ( ((LA20_4>=RULE_ID && LA20_4<=RULE_STRING)||LA20_4==13) ) {
                            alt20=1;
                        }


                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalTyphonML.g:1466:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalTyphonML.g:1466:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalTyphonML.g:1467:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"it.univaq.disim.typhon.TyphonML.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalTyphonML.g:1484:3: ( (lv_relations_4_0= ruleRelation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTyphonML.g:1485:4: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalTyphonML.g:1485:4: (lv_relations_4_0= ruleRelation )
            	    // InternalTyphonML.g:1486:5: lv_relations_4_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getRelationsRelationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_relations_4_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"it.univaq.disim.typhon.TyphonML.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAttribute"
    // InternalTyphonML.g:1511:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTyphonML.g:1511:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTyphonML.g:1512:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTyphonML.g:1518:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1524:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )? ) )
            // InternalTyphonML.g:1525:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )? )
            {
            // InternalTyphonML.g:1525:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )? )
            // InternalTyphonML.g:1526:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )?
            {
            // InternalTyphonML.g:1526:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTyphonML.g:1527:4: (lv_name_0_0= ruleEString )
            {
            // InternalTyphonML.g:1527:4: (lv_name_0_0= ruleEString )
            // InternalTyphonML.g:1528:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalTyphonML.g:1549:3: ( ( ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||(LA22_1>=RULE_ID && LA22_1<=RULE_STRING)||LA22_1==13) ) {
                    alt22=1;
                }
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||(LA22_2>=RULE_ID && LA22_2<=RULE_STRING)||LA22_2==13) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalTyphonML.g:1550:4: ( ruleEString )
                    {
                    // InternalTyphonML.g:1550:4: ( ruleEString )
                    // InternalTyphonML.g:1551:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_2_0());
                    				
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataTypeItem"
    // InternalTyphonML.g:1569:1: entryRuleDataTypeItem returns [EObject current=null] : iv_ruleDataTypeItem= ruleDataTypeItem EOF ;
    public final EObject entryRuleDataTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeItem = null;


        try {
            // InternalTyphonML.g:1569:53: (iv_ruleDataTypeItem= ruleDataTypeItem EOF )
            // InternalTyphonML.g:1570:2: iv_ruleDataTypeItem= ruleDataTypeItem EOF
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
    // InternalTyphonML.g:1576:1: ruleDataTypeItem returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleDataTypeItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1582:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) ) )
            // InternalTyphonML.g:1583:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            {
            // InternalTyphonML.g:1583:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalTyphonML.g:1584:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )
            {
            // InternalTyphonML.g:1584:3: ()
            // InternalTyphonML.g:1585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeItemAccess().getDataTypeItemAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1591:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1592:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1592:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1593:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeItemAccess().getColonKeyword_2());
            		
            // InternalTyphonML.g:1614:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1615:4: ( ruleEString )
            {
            // InternalTyphonML.g:1615:4: ( ruleEString )
            // InternalTyphonML.g:1616:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeItemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataTypeItemAccess().getTypeDataTypeCrossReference_3_0());
            				
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
    // $ANTLR end "ruleDataTypeItem"


    // $ANTLR start "entryRuleRelation"
    // InternalTyphonML.g:1634:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalTyphonML.g:1634:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalTyphonML.g:1635:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalTyphonML.g:1641:1: ruleRelation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_isContainment_2_0= ':' ) )? otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= '.' ( ( ruleEString ) ) )? (otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']' )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_isContainment_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_cardinality_8_0 = null;



        	enterRule();

        try {
            // InternalTyphonML.g:1647:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_isContainment_2_0= ':' ) )? otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= '.' ( ( ruleEString ) ) )? (otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']' )? ) )
            // InternalTyphonML.g:1648:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_isContainment_2_0= ':' ) )? otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= '.' ( ( ruleEString ) ) )? (otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']' )? )
            {
            // InternalTyphonML.g:1648:2: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_isContainment_2_0= ':' ) )? otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= '.' ( ( ruleEString ) ) )? (otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']' )? )
            // InternalTyphonML.g:1649:3: () ( (lv_name_1_0= ruleEString ) ) ( (lv_isContainment_2_0= ':' ) )? otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= '.' ( ( ruleEString ) ) )? (otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']' )?
            {
            // InternalTyphonML.g:1649:3: ()
            // InternalTyphonML.g:1650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationAccess().getRelationAction_0(),
            					current);
            			

            }

            // InternalTyphonML.g:1656:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTyphonML.g:1657:4: (lv_name_1_0= ruleEString )
            {
            // InternalTyphonML.g:1657:4: (lv_name_1_0= ruleEString )
            // InternalTyphonML.g:1658:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.typhon.TyphonML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1675:3: ( (lv_isContainment_2_0= ':' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:1676:4: (lv_isContainment_2_0= ':' )
                    {
                    // InternalTyphonML.g:1676:4: (lv_isContainment_2_0= ':' )
                    // InternalTyphonML.g:1677:5: lv_isContainment_2_0= ':'
                    {
                    lv_isContainment_2_0=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(lv_isContainment_2_0, grammarAccess.getRelationAccess().getIsContainmentColonKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationRule());
                    					}
                    					setWithLastConsumed(current, "isContainment", true, ":");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalTyphonML.g:1693:3: ( ( ruleEString ) )
            // InternalTyphonML.g:1694:4: ( ruleEString )
            {
            // InternalTyphonML.g:1694:4: ( ruleEString )
            // InternalTyphonML.g:1695:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationAccess().getTypeEntityCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTyphonML.g:1709:3: (otherlv_5= '.' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTyphonML.g:1710:4: otherlv_5= '.' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getFullStopKeyword_5_0());
                    			
                    // InternalTyphonML.g:1714:4: ( ( ruleEString ) )
                    // InternalTyphonML.g:1715:5: ( ruleEString )
                    {
                    // InternalTyphonML.g:1715:5: ( ruleEString )
                    // InternalTyphonML.g:1716:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelationAccess().getOppositeRelationCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTyphonML.g:1731:3: (otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTyphonML.g:1732:4: otherlv_7= '[' ( (lv_cardinality_8_0= ruleCardinality ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalTyphonML.g:1736:4: ( (lv_cardinality_8_0= ruleCardinality ) )
                    // InternalTyphonML.g:1737:5: (lv_cardinality_8_0= ruleCardinality )
                    {
                    // InternalTyphonML.g:1737:5: (lv_cardinality_8_0= ruleCardinality )
                    // InternalTyphonML.g:1738:6: lv_cardinality_8_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getCardinalityCardinalityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_cardinality_8_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_8_0,
                    							"it.univaq.disim.typhon.TyphonML.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_6_2());
                    			

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "ruleCardinality"
    // InternalTyphonML.g:1764:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTyphonML.g:1770:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) ) )
            // InternalTyphonML.g:1771:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            {
            // InternalTyphonML.g:1771:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '0..*' ) | (enumLiteral_3= '*' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt26=1;
                }
                break;
            case 35:
                {
                alt26=2;
                }
                break;
            case 36:
                {
                alt26=3;
                }
                break;
            case 37:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalTyphonML.g:1772:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalTyphonML.g:1772:3: (enumLiteral_0= '0..1' )
                    // InternalTyphonML.g:1773:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:1780:3: (enumLiteral_1= '1' )
                    {
                    // InternalTyphonML.g:1780:3: (enumLiteral_1= '1' )
                    // InternalTyphonML.g:1781:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:1788:3: (enumLiteral_2= '0..*' )
                    {
                    // InternalTyphonML.g:1788:3: (enumLiteral_2= '0..*' )
                    // InternalTyphonML.g:1789:4: enumLiteral_2= '0..*'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:1796:3: (enumLiteral_3= '*' )
                    {
                    // InternalTyphonML.g:1796:3: (enumLiteral_3= '*' )
                    // InternalTyphonML.g:1797:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000070228802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000228802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001402000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});

}