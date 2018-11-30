package it.univaq.disim.typhon.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.univaq.disim.typhon.services.TyphonMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTyphonMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'0..1'", "'1'", "'0..*'", "'*'", "'keyvaluedb'", "'{'", "'}'", "'->'", "'documentdb'", "':'", "'relationaldb'", "'table'", "'index'", "'id'", "'graphdb'", "'node'", "'='", "'edge'", "'from'", "'to'", "'label'", "'datatype'", "'custom-datatype'", "'entity'", "'.'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(TyphonMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalTyphonML.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTyphonML.g:54:1: ( ruleModel EOF )
            // InternalTyphonML.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTyphonML.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalTyphonML.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalTyphonML.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalTyphonML.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalTyphonML.g:69:3: ( rule__Model__Group__0 )
            // InternalTyphonML.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDatabase"
    // InternalTyphonML.g:78:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalTyphonML.g:79:1: ( ruleDatabase EOF )
            // InternalTyphonML.g:80:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalTyphonML.g:87:1: ruleDatabase : ( ( rule__Database__Alternatives ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:91:2: ( ( ( rule__Database__Alternatives ) ) )
            // InternalTyphonML.g:92:2: ( ( rule__Database__Alternatives ) )
            {
            // InternalTyphonML.g:92:2: ( ( rule__Database__Alternatives ) )
            // InternalTyphonML.g:93:3: ( rule__Database__Alternatives )
            {
             before(grammarAccess.getDatabaseAccess().getAlternatives()); 
            // InternalTyphonML.g:94:3: ( rule__Database__Alternatives )
            // InternalTyphonML.g:94:4: rule__Database__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Database__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleKeyValueDB"
    // InternalTyphonML.g:103:1: entryRuleKeyValueDB : ruleKeyValueDB EOF ;
    public final void entryRuleKeyValueDB() throws RecognitionException {
        try {
            // InternalTyphonML.g:104:1: ( ruleKeyValueDB EOF )
            // InternalTyphonML.g:105:1: ruleKeyValueDB EOF
            {
             before(grammarAccess.getKeyValueDBRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyValueDB();

            state._fsp--;

             after(grammarAccess.getKeyValueDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyValueDB"


    // $ANTLR start "ruleKeyValueDB"
    // InternalTyphonML.g:112:1: ruleKeyValueDB : ( ( rule__KeyValueDB__Group__0 ) ) ;
    public final void ruleKeyValueDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:116:2: ( ( ( rule__KeyValueDB__Group__0 ) ) )
            // InternalTyphonML.g:117:2: ( ( rule__KeyValueDB__Group__0 ) )
            {
            // InternalTyphonML.g:117:2: ( ( rule__KeyValueDB__Group__0 ) )
            // InternalTyphonML.g:118:3: ( rule__KeyValueDB__Group__0 )
            {
             before(grammarAccess.getKeyValueDBAccess().getGroup()); 
            // InternalTyphonML.g:119:3: ( rule__KeyValueDB__Group__0 )
            // InternalTyphonML.g:119:4: rule__KeyValueDB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyValueDB"


    // $ANTLR start "entryRuleKeyValueElement"
    // InternalTyphonML.g:128:1: entryRuleKeyValueElement : ruleKeyValueElement EOF ;
    public final void entryRuleKeyValueElement() throws RecognitionException {
        try {
            // InternalTyphonML.g:129:1: ( ruleKeyValueElement EOF )
            // InternalTyphonML.g:130:1: ruleKeyValueElement EOF
            {
             before(grammarAccess.getKeyValueElementRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyValueElement();

            state._fsp--;

             after(grammarAccess.getKeyValueElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyValueElement"


    // $ANTLR start "ruleKeyValueElement"
    // InternalTyphonML.g:137:1: ruleKeyValueElement : ( ( rule__KeyValueElement__Group__0 ) ) ;
    public final void ruleKeyValueElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:141:2: ( ( ( rule__KeyValueElement__Group__0 ) ) )
            // InternalTyphonML.g:142:2: ( ( rule__KeyValueElement__Group__0 ) )
            {
            // InternalTyphonML.g:142:2: ( ( rule__KeyValueElement__Group__0 ) )
            // InternalTyphonML.g:143:3: ( rule__KeyValueElement__Group__0 )
            {
             before(grammarAccess.getKeyValueElementAccess().getGroup()); 
            // InternalTyphonML.g:144:3: ( rule__KeyValueElement__Group__0 )
            // InternalTyphonML.g:144:4: rule__KeyValueElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyValueElement"


    // $ANTLR start "entryRuleDocumentDB"
    // InternalTyphonML.g:153:1: entryRuleDocumentDB : ruleDocumentDB EOF ;
    public final void entryRuleDocumentDB() throws RecognitionException {
        try {
            // InternalTyphonML.g:154:1: ( ruleDocumentDB EOF )
            // InternalTyphonML.g:155:1: ruleDocumentDB EOF
            {
             before(grammarAccess.getDocumentDBRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumentDB();

            state._fsp--;

             after(grammarAccess.getDocumentDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentDB"


    // $ANTLR start "ruleDocumentDB"
    // InternalTyphonML.g:162:1: ruleDocumentDB : ( ( rule__DocumentDB__Group__0 ) ) ;
    public final void ruleDocumentDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:166:2: ( ( ( rule__DocumentDB__Group__0 ) ) )
            // InternalTyphonML.g:167:2: ( ( rule__DocumentDB__Group__0 ) )
            {
            // InternalTyphonML.g:167:2: ( ( rule__DocumentDB__Group__0 ) )
            // InternalTyphonML.g:168:3: ( rule__DocumentDB__Group__0 )
            {
             before(grammarAccess.getDocumentDBAccess().getGroup()); 
            // InternalTyphonML.g:169:3: ( rule__DocumentDB__Group__0 )
            // InternalTyphonML.g:169:4: rule__DocumentDB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentDB"


    // $ANTLR start "entryRuleDocumentDBCollection"
    // InternalTyphonML.g:178:1: entryRuleDocumentDBCollection : ruleDocumentDBCollection EOF ;
    public final void entryRuleDocumentDBCollection() throws RecognitionException {
        try {
            // InternalTyphonML.g:179:1: ( ruleDocumentDBCollection EOF )
            // InternalTyphonML.g:180:1: ruleDocumentDBCollection EOF
            {
             before(grammarAccess.getDocumentDBCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumentDBCollection();

            state._fsp--;

             after(grammarAccess.getDocumentDBCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentDBCollection"


    // $ANTLR start "ruleDocumentDBCollection"
    // InternalTyphonML.g:187:1: ruleDocumentDBCollection : ( ( rule__DocumentDBCollection__Group__0 ) ) ;
    public final void ruleDocumentDBCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:191:2: ( ( ( rule__DocumentDBCollection__Group__0 ) ) )
            // InternalTyphonML.g:192:2: ( ( rule__DocumentDBCollection__Group__0 ) )
            {
            // InternalTyphonML.g:192:2: ( ( rule__DocumentDBCollection__Group__0 ) )
            // InternalTyphonML.g:193:3: ( rule__DocumentDBCollection__Group__0 )
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getGroup()); 
            // InternalTyphonML.g:194:3: ( rule__DocumentDBCollection__Group__0 )
            // InternalTyphonML.g:194:4: rule__DocumentDBCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentDBCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentDBCollection"


    // $ANTLR start "entryRuleRelationalDB"
    // InternalTyphonML.g:203:1: entryRuleRelationalDB : ruleRelationalDB EOF ;
    public final void entryRuleRelationalDB() throws RecognitionException {
        try {
            // InternalTyphonML.g:204:1: ( ruleRelationalDB EOF )
            // InternalTyphonML.g:205:1: ruleRelationalDB EOF
            {
             before(grammarAccess.getRelationalDBRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationalDB();

            state._fsp--;

             after(grammarAccess.getRelationalDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalDB"


    // $ANTLR start "ruleRelationalDB"
    // InternalTyphonML.g:212:1: ruleRelationalDB : ( ( rule__RelationalDB__Group__0 ) ) ;
    public final void ruleRelationalDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:216:2: ( ( ( rule__RelationalDB__Group__0 ) ) )
            // InternalTyphonML.g:217:2: ( ( rule__RelationalDB__Group__0 ) )
            {
            // InternalTyphonML.g:217:2: ( ( rule__RelationalDB__Group__0 ) )
            // InternalTyphonML.g:218:3: ( rule__RelationalDB__Group__0 )
            {
             before(grammarAccess.getRelationalDBAccess().getGroup()); 
            // InternalTyphonML.g:219:3: ( rule__RelationalDB__Group__0 )
            // InternalTyphonML.g:219:4: rule__RelationalDB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalDB"


    // $ANTLR start "entryRuleTable"
    // InternalTyphonML.g:228:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalTyphonML.g:229:1: ( ruleTable EOF )
            // InternalTyphonML.g:230:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalTyphonML.g:237:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:241:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalTyphonML.g:242:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalTyphonML.g:242:2: ( ( rule__Table__Group__0 ) )
            // InternalTyphonML.g:243:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalTyphonML.g:244:3: ( rule__Table__Group__0 )
            // InternalTyphonML.g:244:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleIndexSpec"
    // InternalTyphonML.g:253:1: entryRuleIndexSpec : ruleIndexSpec EOF ;
    public final void entryRuleIndexSpec() throws RecognitionException {
        try {
            // InternalTyphonML.g:254:1: ( ruleIndexSpec EOF )
            // InternalTyphonML.g:255:1: ruleIndexSpec EOF
            {
             before(grammarAccess.getIndexSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleIndexSpec();

            state._fsp--;

             after(grammarAccess.getIndexSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexSpec"


    // $ANTLR start "ruleIndexSpec"
    // InternalTyphonML.g:262:1: ruleIndexSpec : ( ( rule__IndexSpec__Group__0 ) ) ;
    public final void ruleIndexSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:266:2: ( ( ( rule__IndexSpec__Group__0 ) ) )
            // InternalTyphonML.g:267:2: ( ( rule__IndexSpec__Group__0 ) )
            {
            // InternalTyphonML.g:267:2: ( ( rule__IndexSpec__Group__0 ) )
            // InternalTyphonML.g:268:3: ( rule__IndexSpec__Group__0 )
            {
             before(grammarAccess.getIndexSpecAccess().getGroup()); 
            // InternalTyphonML.g:269:3: ( rule__IndexSpec__Group__0 )
            // InternalTyphonML.g:269:4: rule__IndexSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexSpec"


    // $ANTLR start "entryRuleIdSpec"
    // InternalTyphonML.g:278:1: entryRuleIdSpec : ruleIdSpec EOF ;
    public final void entryRuleIdSpec() throws RecognitionException {
        try {
            // InternalTyphonML.g:279:1: ( ruleIdSpec EOF )
            // InternalTyphonML.g:280:1: ruleIdSpec EOF
            {
             before(grammarAccess.getIdSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleIdSpec();

            state._fsp--;

             after(grammarAccess.getIdSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdSpec"


    // $ANTLR start "ruleIdSpec"
    // InternalTyphonML.g:287:1: ruleIdSpec : ( ( rule__IdSpec__Group__0 ) ) ;
    public final void ruleIdSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:291:2: ( ( ( rule__IdSpec__Group__0 ) ) )
            // InternalTyphonML.g:292:2: ( ( rule__IdSpec__Group__0 ) )
            {
            // InternalTyphonML.g:292:2: ( ( rule__IdSpec__Group__0 ) )
            // InternalTyphonML.g:293:3: ( rule__IdSpec__Group__0 )
            {
             before(grammarAccess.getIdSpecAccess().getGroup()); 
            // InternalTyphonML.g:294:3: ( rule__IdSpec__Group__0 )
            // InternalTyphonML.g:294:4: rule__IdSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdSpec"


    // $ANTLR start "entryRuleGraphDB"
    // InternalTyphonML.g:303:1: entryRuleGraphDB : ruleGraphDB EOF ;
    public final void entryRuleGraphDB() throws RecognitionException {
        try {
            // InternalTyphonML.g:304:1: ( ruleGraphDB EOF )
            // InternalTyphonML.g:305:1: ruleGraphDB EOF
            {
             before(grammarAccess.getGraphDBRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphDB();

            state._fsp--;

             after(grammarAccess.getGraphDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphDB"


    // $ANTLR start "ruleGraphDB"
    // InternalTyphonML.g:312:1: ruleGraphDB : ( ( rule__GraphDB__Group__0 ) ) ;
    public final void ruleGraphDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:316:2: ( ( ( rule__GraphDB__Group__0 ) ) )
            // InternalTyphonML.g:317:2: ( ( rule__GraphDB__Group__0 ) )
            {
            // InternalTyphonML.g:317:2: ( ( rule__GraphDB__Group__0 ) )
            // InternalTyphonML.g:318:3: ( rule__GraphDB__Group__0 )
            {
             before(grammarAccess.getGraphDBAccess().getGroup()); 
            // InternalTyphonML.g:319:3: ( rule__GraphDB__Group__0 )
            // InternalTyphonML.g:319:4: rule__GraphDB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphDB"


    // $ANTLR start "entryRuleNode"
    // InternalTyphonML.g:328:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalTyphonML.g:329:1: ( ruleNode EOF )
            // InternalTyphonML.g:330:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalTyphonML.g:337:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:341:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalTyphonML.g:342:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalTyphonML.g:342:2: ( ( rule__Node__Group__0 ) )
            // InternalTyphonML.g:343:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalTyphonML.g:344:3: ( rule__Node__Group__0 )
            // InternalTyphonML.g:344:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleGraphAttribute"
    // InternalTyphonML.g:353:1: entryRuleGraphAttribute : ruleGraphAttribute EOF ;
    public final void entryRuleGraphAttribute() throws RecognitionException {
        try {
            // InternalTyphonML.g:354:1: ( ruleGraphAttribute EOF )
            // InternalTyphonML.g:355:1: ruleGraphAttribute EOF
            {
             before(grammarAccess.getGraphAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphAttribute();

            state._fsp--;

             after(grammarAccess.getGraphAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphAttribute"


    // $ANTLR start "ruleGraphAttribute"
    // InternalTyphonML.g:362:1: ruleGraphAttribute : ( ( rule__GraphAttribute__Group__0 ) ) ;
    public final void ruleGraphAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:366:2: ( ( ( rule__GraphAttribute__Group__0 ) ) )
            // InternalTyphonML.g:367:2: ( ( rule__GraphAttribute__Group__0 ) )
            {
            // InternalTyphonML.g:367:2: ( ( rule__GraphAttribute__Group__0 ) )
            // InternalTyphonML.g:368:3: ( rule__GraphAttribute__Group__0 )
            {
             before(grammarAccess.getGraphAttributeAccess().getGroup()); 
            // InternalTyphonML.g:369:3: ( rule__GraphAttribute__Group__0 )
            // InternalTyphonML.g:369:4: rule__GraphAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphAttribute"


    // $ANTLR start "entryRuleEdge"
    // InternalTyphonML.g:378:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // InternalTyphonML.g:379:1: ( ruleEdge EOF )
            // InternalTyphonML.g:380:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalTyphonML.g:387:1: ruleEdge : ( ( rule__Edge__Group__0 ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:391:2: ( ( ( rule__Edge__Group__0 ) ) )
            // InternalTyphonML.g:392:2: ( ( rule__Edge__Group__0 ) )
            {
            // InternalTyphonML.g:392:2: ( ( rule__Edge__Group__0 ) )
            // InternalTyphonML.g:393:3: ( rule__Edge__Group__0 )
            {
             before(grammarAccess.getEdgeAccess().getGroup()); 
            // InternalTyphonML.g:394:3: ( rule__Edge__Group__0 )
            // InternalTyphonML.g:394:4: rule__Edge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleGraphEdgeLabel"
    // InternalTyphonML.g:403:1: entryRuleGraphEdgeLabel : ruleGraphEdgeLabel EOF ;
    public final void entryRuleGraphEdgeLabel() throws RecognitionException {
        try {
            // InternalTyphonML.g:404:1: ( ruleGraphEdgeLabel EOF )
            // InternalTyphonML.g:405:1: ruleGraphEdgeLabel EOF
            {
             before(grammarAccess.getGraphEdgeLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphEdgeLabel();

            state._fsp--;

             after(grammarAccess.getGraphEdgeLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphEdgeLabel"


    // $ANTLR start "ruleGraphEdgeLabel"
    // InternalTyphonML.g:412:1: ruleGraphEdgeLabel : ( ( rule__GraphEdgeLabel__Group__0 ) ) ;
    public final void ruleGraphEdgeLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:416:2: ( ( ( rule__GraphEdgeLabel__Group__0 ) ) )
            // InternalTyphonML.g:417:2: ( ( rule__GraphEdgeLabel__Group__0 ) )
            {
            // InternalTyphonML.g:417:2: ( ( rule__GraphEdgeLabel__Group__0 ) )
            // InternalTyphonML.g:418:3: ( rule__GraphEdgeLabel__Group__0 )
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getGroup()); 
            // InternalTyphonML.g:419:3: ( rule__GraphEdgeLabel__Group__0 )
            // InternalTyphonML.g:419:4: rule__GraphEdgeLabel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphEdgeLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphEdgeLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphEdgeLabel"


    // $ANTLR start "entryRuleDataType"
    // InternalTyphonML.g:428:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalTyphonML.g:429:1: ( ruleDataType EOF )
            // InternalTyphonML.g:430:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalTyphonML.g:437:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:441:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalTyphonML.g:442:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalTyphonML.g:442:2: ( ( rule__DataType__Alternatives ) )
            // InternalTyphonML.g:443:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalTyphonML.g:444:3: ( rule__DataType__Alternatives )
            // InternalTyphonML.g:444:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEString"
    // InternalTyphonML.g:453:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTyphonML.g:454:1: ( ruleEString EOF )
            // InternalTyphonML.g:455:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTyphonML.g:462:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:466:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTyphonML.g:467:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTyphonML.g:467:2: ( ( rule__EString__Alternatives ) )
            // InternalTyphonML.g:468:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTyphonML.g:469:3: ( rule__EString__Alternatives )
            // InternalTyphonML.g:469:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePrimitiveDataType"
    // InternalTyphonML.g:478:1: entryRulePrimitiveDataType : rulePrimitiveDataType EOF ;
    public final void entryRulePrimitiveDataType() throws RecognitionException {
        try {
            // InternalTyphonML.g:479:1: ( rulePrimitiveDataType EOF )
            // InternalTyphonML.g:480:1: rulePrimitiveDataType EOF
            {
             before(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveDataType();

            state._fsp--;

             after(grammarAccess.getPrimitiveDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // InternalTyphonML.g:487:1: rulePrimitiveDataType : ( ( rule__PrimitiveDataType__Group__0 ) ) ;
    public final void rulePrimitiveDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:491:2: ( ( ( rule__PrimitiveDataType__Group__0 ) ) )
            // InternalTyphonML.g:492:2: ( ( rule__PrimitiveDataType__Group__0 ) )
            {
            // InternalTyphonML.g:492:2: ( ( rule__PrimitiveDataType__Group__0 ) )
            // InternalTyphonML.g:493:3: ( rule__PrimitiveDataType__Group__0 )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getGroup()); 
            // InternalTyphonML.g:494:3: ( rule__PrimitiveDataType__Group__0 )
            // InternalTyphonML.g:494:4: rule__PrimitiveDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleCustomDataType"
    // InternalTyphonML.g:503:1: entryRuleCustomDataType : ruleCustomDataType EOF ;
    public final void entryRuleCustomDataType() throws RecognitionException {
        try {
            // InternalTyphonML.g:504:1: ( ruleCustomDataType EOF )
            // InternalTyphonML.g:505:1: ruleCustomDataType EOF
            {
             before(grammarAccess.getCustomDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomDataType();

            state._fsp--;

             after(grammarAccess.getCustomDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomDataType"


    // $ANTLR start "ruleCustomDataType"
    // InternalTyphonML.g:512:1: ruleCustomDataType : ( ( rule__CustomDataType__Group__0 ) ) ;
    public final void ruleCustomDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:516:2: ( ( ( rule__CustomDataType__Group__0 ) ) )
            // InternalTyphonML.g:517:2: ( ( rule__CustomDataType__Group__0 ) )
            {
            // InternalTyphonML.g:517:2: ( ( rule__CustomDataType__Group__0 ) )
            // InternalTyphonML.g:518:3: ( rule__CustomDataType__Group__0 )
            {
             before(grammarAccess.getCustomDataTypeAccess().getGroup()); 
            // InternalTyphonML.g:519:3: ( rule__CustomDataType__Group__0 )
            // InternalTyphonML.g:519:4: rule__CustomDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalTyphonML.g:528:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalTyphonML.g:529:1: ( ruleEntity EOF )
            // InternalTyphonML.g:530:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalTyphonML.g:537:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:541:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalTyphonML.g:542:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalTyphonML.g:542:2: ( ( rule__Entity__Group__0 ) )
            // InternalTyphonML.g:543:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalTyphonML.g:544:3: ( rule__Entity__Group__0 )
            // InternalTyphonML.g:544:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalTyphonML.g:553:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTyphonML.g:554:1: ( ruleAttribute EOF )
            // InternalTyphonML.g:555:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTyphonML.g:562:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:566:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalTyphonML.g:567:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalTyphonML.g:567:2: ( ( rule__Attribute__Group__0 ) )
            // InternalTyphonML.g:568:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalTyphonML.g:569:3: ( rule__Attribute__Group__0 )
            // InternalTyphonML.g:569:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataTypeItem"
    // InternalTyphonML.g:578:1: entryRuleDataTypeItem : ruleDataTypeItem EOF ;
    public final void entryRuleDataTypeItem() throws RecognitionException {
        try {
            // InternalTyphonML.g:579:1: ( ruleDataTypeItem EOF )
            // InternalTyphonML.g:580:1: ruleDataTypeItem EOF
            {
             before(grammarAccess.getDataTypeItemRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeItem();

            state._fsp--;

             after(grammarAccess.getDataTypeItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeItem"


    // $ANTLR start "ruleDataTypeItem"
    // InternalTyphonML.g:587:1: ruleDataTypeItem : ( ( rule__DataTypeItem__Group__0 ) ) ;
    public final void ruleDataTypeItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:591:2: ( ( ( rule__DataTypeItem__Group__0 ) ) )
            // InternalTyphonML.g:592:2: ( ( rule__DataTypeItem__Group__0 ) )
            {
            // InternalTyphonML.g:592:2: ( ( rule__DataTypeItem__Group__0 ) )
            // InternalTyphonML.g:593:3: ( rule__DataTypeItem__Group__0 )
            {
             before(grammarAccess.getDataTypeItemAccess().getGroup()); 
            // InternalTyphonML.g:594:3: ( rule__DataTypeItem__Group__0 )
            // InternalTyphonML.g:594:4: rule__DataTypeItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeItem"


    // $ANTLR start "entryRuleRelation"
    // InternalTyphonML.g:603:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalTyphonML.g:604:1: ( ruleRelation EOF )
            // InternalTyphonML.g:605:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalTyphonML.g:612:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:616:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalTyphonML.g:617:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalTyphonML.g:617:2: ( ( rule__Relation__Group__0 ) )
            // InternalTyphonML.g:618:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalTyphonML.g:619:3: ( rule__Relation__Group__0 )
            // InternalTyphonML.g:619:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "ruleCardinality"
    // InternalTyphonML.g:628:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:632:1: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalTyphonML.g:633:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalTyphonML.g:633:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalTyphonML.g:634:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalTyphonML.g:635:3: ( rule__Cardinality__Alternatives )
            // InternalTyphonML.g:635:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "rule__Database__Alternatives"
    // InternalTyphonML.g:643:1: rule__Database__Alternatives : ( ( ruleRelationalDB ) | ( ruleGraphDB ) | ( ruleDocumentDB ) | ( ruleKeyValueDB ) );
    public final void rule__Database__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:647:1: ( ( ruleRelationalDB ) | ( ruleGraphDB ) | ( ruleDocumentDB ) | ( ruleKeyValueDB ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTyphonML.g:648:2: ( ruleRelationalDB )
                    {
                    // InternalTyphonML.g:648:2: ( ruleRelationalDB )
                    // InternalTyphonML.g:649:3: ruleRelationalDB
                    {
                     before(grammarAccess.getDatabaseAccess().getRelationalDBParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationalDB();

                    state._fsp--;

                     after(grammarAccess.getDatabaseAccess().getRelationalDBParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:654:2: ( ruleGraphDB )
                    {
                    // InternalTyphonML.g:654:2: ( ruleGraphDB )
                    // InternalTyphonML.g:655:3: ruleGraphDB
                    {
                     before(grammarAccess.getDatabaseAccess().getGraphDBParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphDB();

                    state._fsp--;

                     after(grammarAccess.getDatabaseAccess().getGraphDBParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:660:2: ( ruleDocumentDB )
                    {
                    // InternalTyphonML.g:660:2: ( ruleDocumentDB )
                    // InternalTyphonML.g:661:3: ruleDocumentDB
                    {
                     before(grammarAccess.getDatabaseAccess().getDocumentDBParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDocumentDB();

                    state._fsp--;

                     after(grammarAccess.getDatabaseAccess().getDocumentDBParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:666:2: ( ruleKeyValueDB )
                    {
                    // InternalTyphonML.g:666:2: ( ruleKeyValueDB )
                    // InternalTyphonML.g:667:3: ruleKeyValueDB
                    {
                     before(grammarAccess.getDatabaseAccess().getKeyValueDBParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyValueDB();

                    state._fsp--;

                     after(grammarAccess.getDatabaseAccess().getKeyValueDBParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalTyphonML.g:676:1: rule__DataType__Alternatives : ( ( rulePrimitiveDataType ) | ( ruleCustomDataType ) | ( ruleEntity ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:680:1: ( ( rulePrimitiveDataType ) | ( ruleCustomDataType ) | ( ruleEntity ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTyphonML.g:681:2: ( rulePrimitiveDataType )
                    {
                    // InternalTyphonML.g:681:2: ( rulePrimitiveDataType )
                    // InternalTyphonML.g:682:3: rulePrimitiveDataType
                    {
                     before(grammarAccess.getDataTypeAccess().getPrimitiveDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveDataType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getPrimitiveDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:687:2: ( ruleCustomDataType )
                    {
                    // InternalTyphonML.g:687:2: ( ruleCustomDataType )
                    // InternalTyphonML.g:688:3: ruleCustomDataType
                    {
                     before(grammarAccess.getDataTypeAccess().getCustomDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomDataType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getCustomDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:693:2: ( ruleEntity )
                    {
                    // InternalTyphonML.g:693:2: ( ruleEntity )
                    // InternalTyphonML.g:694:3: ruleEntity
                    {
                     before(grammarAccess.getDataTypeAccess().getEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getEntityParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTyphonML.g:703:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:707:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTyphonML.g:708:2: ( RULE_STRING )
                    {
                    // InternalTyphonML.g:708:2: ( RULE_STRING )
                    // InternalTyphonML.g:709:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:714:2: ( RULE_ID )
                    {
                    // InternalTyphonML.g:714:2: ( RULE_ID )
                    // InternalTyphonML.g:715:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalTyphonML.g:724:1: rule__Cardinality__Alternatives : ( ( ( '0..1' ) ) | ( ( '1' ) ) | ( ( '0..*' ) ) | ( ( '*' ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:728:1: ( ( ( '0..1' ) ) | ( ( '1' ) ) | ( ( '0..*' ) ) | ( ( '*' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
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
                    // InternalTyphonML.g:729:2: ( ( '0..1' ) )
                    {
                    // InternalTyphonML.g:729:2: ( ( '0..1' ) )
                    // InternalTyphonML.g:730:3: ( '0..1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0()); 
                    // InternalTyphonML.g:731:3: ( '0..1' )
                    // InternalTyphonML.g:731:4: '0..1'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getZero_oneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:735:2: ( ( '1' ) )
                    {
                    // InternalTyphonML.g:735:2: ( ( '1' ) )
                    // InternalTyphonML.g:736:3: ( '1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1()); 
                    // InternalTyphonML.g:737:3: ( '1' )
                    // InternalTyphonML.g:737:4: '1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTyphonML.g:741:2: ( ( '0..*' ) )
                    {
                    // InternalTyphonML.g:741:2: ( ( '0..*' ) )
                    // InternalTyphonML.g:742:3: ( '0..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2()); 
                    // InternalTyphonML.g:743:3: ( '0..*' )
                    // InternalTyphonML.g:743:4: '0..*'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getZero_manyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTyphonML.g:747:2: ( ( '*' ) )
                    {
                    // InternalTyphonML.g:747:2: ( ( '*' ) )
                    // InternalTyphonML.g:748:3: ( '*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOne_manyEnumLiteralDeclaration_3()); 
                    // InternalTyphonML.g:749:3: ( '*' )
                    // InternalTyphonML.g:749:4: '*'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOne_manyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalTyphonML.g:757:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:761:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalTyphonML.g:762:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalTyphonML.g:769:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:773:1: ( ( () ) )
            // InternalTyphonML.g:774:1: ( () )
            {
            // InternalTyphonML.g:774:1: ( () )
            // InternalTyphonML.g:775:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalTyphonML.g:776:2: ()
            // InternalTyphonML.g:776:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalTyphonML.g:784:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:788:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalTyphonML.g:789:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalTyphonML.g:796:1: rule__Model__Group__1__Impl : ( ( rule__Model__DataTypesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:800:1: ( ( ( rule__Model__DataTypesAssignment_1 )* ) )
            // InternalTyphonML.g:801:1: ( ( rule__Model__DataTypesAssignment_1 )* )
            {
            // InternalTyphonML.g:801:1: ( ( rule__Model__DataTypesAssignment_1 )* )
            // InternalTyphonML.g:802:2: ( rule__Model__DataTypesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDataTypesAssignment_1()); 
            // InternalTyphonML.g:803:2: ( rule__Model__DataTypesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=32 && LA5_0<=34)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTyphonML.g:803:3: rule__Model__DataTypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DataTypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDataTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalTyphonML.g:811:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:815:1: ( rule__Model__Group__2__Impl )
            // InternalTyphonML.g:816:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalTyphonML.g:822:1: rule__Model__Group__2__Impl : ( ( rule__Model__DatabasesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:826:1: ( ( ( rule__Model__DatabasesAssignment_2 )* ) )
            // InternalTyphonML.g:827:1: ( ( rule__Model__DatabasesAssignment_2 )* )
            {
            // InternalTyphonML.g:827:1: ( ( rule__Model__DatabasesAssignment_2 )* )
            // InternalTyphonML.g:828:2: ( rule__Model__DatabasesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDatabasesAssignment_2()); 
            // InternalTyphonML.g:829:2: ( rule__Model__DatabasesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||LA6_0==19||LA6_0==21||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTyphonML.g:829:3: rule__Model__DatabasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__DatabasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDatabasesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__KeyValueDB__Group__0"
    // InternalTyphonML.g:838:1: rule__KeyValueDB__Group__0 : rule__KeyValueDB__Group__0__Impl rule__KeyValueDB__Group__1 ;
    public final void rule__KeyValueDB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:842:1: ( rule__KeyValueDB__Group__0__Impl rule__KeyValueDB__Group__1 )
            // InternalTyphonML.g:843:2: rule__KeyValueDB__Group__0__Impl rule__KeyValueDB__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__KeyValueDB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__0"


    // $ANTLR start "rule__KeyValueDB__Group__0__Impl"
    // InternalTyphonML.g:850:1: rule__KeyValueDB__Group__0__Impl : ( () ) ;
    public final void rule__KeyValueDB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:854:1: ( ( () ) )
            // InternalTyphonML.g:855:1: ( () )
            {
            // InternalTyphonML.g:855:1: ( () )
            // InternalTyphonML.g:856:2: ()
            {
             before(grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0()); 
            // InternalTyphonML.g:857:2: ()
            // InternalTyphonML.g:857:3: 
            {
            }

             after(grammarAccess.getKeyValueDBAccess().getKeyValueDBAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__0__Impl"


    // $ANTLR start "rule__KeyValueDB__Group__1"
    // InternalTyphonML.g:865:1: rule__KeyValueDB__Group__1 : rule__KeyValueDB__Group__1__Impl rule__KeyValueDB__Group__2 ;
    public final void rule__KeyValueDB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:869:1: ( rule__KeyValueDB__Group__1__Impl rule__KeyValueDB__Group__2 )
            // InternalTyphonML.g:870:2: rule__KeyValueDB__Group__1__Impl rule__KeyValueDB__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__KeyValueDB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__1"


    // $ANTLR start "rule__KeyValueDB__Group__1__Impl"
    // InternalTyphonML.g:877:1: rule__KeyValueDB__Group__1__Impl : ( 'keyvaluedb' ) ;
    public final void rule__KeyValueDB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:881:1: ( ( 'keyvaluedb' ) )
            // InternalTyphonML.g:882:1: ( 'keyvaluedb' )
            {
            // InternalTyphonML.g:882:1: ( 'keyvaluedb' )
            // InternalTyphonML.g:883:2: 'keyvaluedb'
            {
             before(grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getKeyValueDBAccess().getKeyvaluedbKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__1__Impl"


    // $ANTLR start "rule__KeyValueDB__Group__2"
    // InternalTyphonML.g:892:1: rule__KeyValueDB__Group__2 : rule__KeyValueDB__Group__2__Impl rule__KeyValueDB__Group__3 ;
    public final void rule__KeyValueDB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:896:1: ( rule__KeyValueDB__Group__2__Impl rule__KeyValueDB__Group__3 )
            // InternalTyphonML.g:897:2: rule__KeyValueDB__Group__2__Impl rule__KeyValueDB__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__KeyValueDB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__2"


    // $ANTLR start "rule__KeyValueDB__Group__2__Impl"
    // InternalTyphonML.g:904:1: rule__KeyValueDB__Group__2__Impl : ( ( rule__KeyValueDB__NameAssignment_2 ) ) ;
    public final void rule__KeyValueDB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:908:1: ( ( ( rule__KeyValueDB__NameAssignment_2 ) ) )
            // InternalTyphonML.g:909:1: ( ( rule__KeyValueDB__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:909:1: ( ( rule__KeyValueDB__NameAssignment_2 ) )
            // InternalTyphonML.g:910:2: ( rule__KeyValueDB__NameAssignment_2 )
            {
             before(grammarAccess.getKeyValueDBAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:911:2: ( rule__KeyValueDB__NameAssignment_2 )
            // InternalTyphonML.g:911:3: rule__KeyValueDB__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueDB__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueDBAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__2__Impl"


    // $ANTLR start "rule__KeyValueDB__Group__3"
    // InternalTyphonML.g:919:1: rule__KeyValueDB__Group__3 : rule__KeyValueDB__Group__3__Impl rule__KeyValueDB__Group__4 ;
    public final void rule__KeyValueDB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:923:1: ( rule__KeyValueDB__Group__3__Impl rule__KeyValueDB__Group__4 )
            // InternalTyphonML.g:924:2: rule__KeyValueDB__Group__3__Impl rule__KeyValueDB__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__KeyValueDB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__3"


    // $ANTLR start "rule__KeyValueDB__Group__3__Impl"
    // InternalTyphonML.g:931:1: rule__KeyValueDB__Group__3__Impl : ( '{' ) ;
    public final void rule__KeyValueDB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:935:1: ( ( '{' ) )
            // InternalTyphonML.g:936:1: ( '{' )
            {
            // InternalTyphonML.g:936:1: ( '{' )
            // InternalTyphonML.g:937:2: '{'
            {
             before(grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getKeyValueDBAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__3__Impl"


    // $ANTLR start "rule__KeyValueDB__Group__4"
    // InternalTyphonML.g:946:1: rule__KeyValueDB__Group__4 : rule__KeyValueDB__Group__4__Impl rule__KeyValueDB__Group__5 ;
    public final void rule__KeyValueDB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:950:1: ( rule__KeyValueDB__Group__4__Impl rule__KeyValueDB__Group__5 )
            // InternalTyphonML.g:951:2: rule__KeyValueDB__Group__4__Impl rule__KeyValueDB__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__KeyValueDB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__4"


    // $ANTLR start "rule__KeyValueDB__Group__4__Impl"
    // InternalTyphonML.g:958:1: rule__KeyValueDB__Group__4__Impl : ( ( rule__KeyValueDB__ElementsAssignment_4 )* ) ;
    public final void rule__KeyValueDB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:962:1: ( ( ( rule__KeyValueDB__ElementsAssignment_4 )* ) )
            // InternalTyphonML.g:963:1: ( ( rule__KeyValueDB__ElementsAssignment_4 )* )
            {
            // InternalTyphonML.g:963:1: ( ( rule__KeyValueDB__ElementsAssignment_4 )* )
            // InternalTyphonML.g:964:2: ( rule__KeyValueDB__ElementsAssignment_4 )*
            {
             before(grammarAccess.getKeyValueDBAccess().getElementsAssignment_4()); 
            // InternalTyphonML.g:965:2: ( rule__KeyValueDB__ElementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTyphonML.g:965:3: rule__KeyValueDB__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__KeyValueDB__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getKeyValueDBAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__4__Impl"


    // $ANTLR start "rule__KeyValueDB__Group__5"
    // InternalTyphonML.g:973:1: rule__KeyValueDB__Group__5 : rule__KeyValueDB__Group__5__Impl ;
    public final void rule__KeyValueDB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:977:1: ( rule__KeyValueDB__Group__5__Impl )
            // InternalTyphonML.g:978:2: rule__KeyValueDB__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueDB__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__5"


    // $ANTLR start "rule__KeyValueDB__Group__5__Impl"
    // InternalTyphonML.g:984:1: rule__KeyValueDB__Group__5__Impl : ( '}' ) ;
    public final void rule__KeyValueDB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:988:1: ( ( '}' ) )
            // InternalTyphonML.g:989:1: ( '}' )
            {
            // InternalTyphonML.g:989:1: ( '}' )
            // InternalTyphonML.g:990:2: '}'
            {
             before(grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getKeyValueDBAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__Group__5__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__0"
    // InternalTyphonML.g:1000:1: rule__KeyValueElement__Group__0 : rule__KeyValueElement__Group__0__Impl rule__KeyValueElement__Group__1 ;
    public final void rule__KeyValueElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1004:1: ( rule__KeyValueElement__Group__0__Impl rule__KeyValueElement__Group__1 )
            // InternalTyphonML.g:1005:2: rule__KeyValueElement__Group__0__Impl rule__KeyValueElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__KeyValueElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__0"


    // $ANTLR start "rule__KeyValueElement__Group__0__Impl"
    // InternalTyphonML.g:1012:1: rule__KeyValueElement__Group__0__Impl : ( () ) ;
    public final void rule__KeyValueElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1016:1: ( ( () ) )
            // InternalTyphonML.g:1017:1: ( () )
            {
            // InternalTyphonML.g:1017:1: ( () )
            // InternalTyphonML.g:1018:2: ()
            {
             before(grammarAccess.getKeyValueElementAccess().getKeyValueElementAction_0()); 
            // InternalTyphonML.g:1019:2: ()
            // InternalTyphonML.g:1019:3: 
            {
            }

             after(grammarAccess.getKeyValueElementAccess().getKeyValueElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__0__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__1"
    // InternalTyphonML.g:1027:1: rule__KeyValueElement__Group__1 : rule__KeyValueElement__Group__1__Impl rule__KeyValueElement__Group__2 ;
    public final void rule__KeyValueElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1031:1: ( rule__KeyValueElement__Group__1__Impl rule__KeyValueElement__Group__2 )
            // InternalTyphonML.g:1032:2: rule__KeyValueElement__Group__1__Impl rule__KeyValueElement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__KeyValueElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__1"


    // $ANTLR start "rule__KeyValueElement__Group__1__Impl"
    // InternalTyphonML.g:1039:1: rule__KeyValueElement__Group__1__Impl : ( ( rule__KeyValueElement__KeyAssignment_1 ) ) ;
    public final void rule__KeyValueElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1043:1: ( ( ( rule__KeyValueElement__KeyAssignment_1 ) ) )
            // InternalTyphonML.g:1044:1: ( ( rule__KeyValueElement__KeyAssignment_1 ) )
            {
            // InternalTyphonML.g:1044:1: ( ( rule__KeyValueElement__KeyAssignment_1 ) )
            // InternalTyphonML.g:1045:2: ( rule__KeyValueElement__KeyAssignment_1 )
            {
             before(grammarAccess.getKeyValueElementAccess().getKeyAssignment_1()); 
            // InternalTyphonML.g:1046:2: ( rule__KeyValueElement__KeyAssignment_1 )
            // InternalTyphonML.g:1046:3: rule__KeyValueElement__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueElement__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueElementAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__1__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__2"
    // InternalTyphonML.g:1054:1: rule__KeyValueElement__Group__2 : rule__KeyValueElement__Group__2__Impl rule__KeyValueElement__Group__3 ;
    public final void rule__KeyValueElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1058:1: ( rule__KeyValueElement__Group__2__Impl rule__KeyValueElement__Group__3 )
            // InternalTyphonML.g:1059:2: rule__KeyValueElement__Group__2__Impl rule__KeyValueElement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__KeyValueElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__2"


    // $ANTLR start "rule__KeyValueElement__Group__2__Impl"
    // InternalTyphonML.g:1066:1: rule__KeyValueElement__Group__2__Impl : ( '->' ) ;
    public final void rule__KeyValueElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1070:1: ( ( '->' ) )
            // InternalTyphonML.g:1071:1: ( '->' )
            {
            // InternalTyphonML.g:1071:1: ( '->' )
            // InternalTyphonML.g:1072:2: '->'
            {
             before(grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getKeyValueElementAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__2__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__3"
    // InternalTyphonML.g:1081:1: rule__KeyValueElement__Group__3 : rule__KeyValueElement__Group__3__Impl rule__KeyValueElement__Group__4 ;
    public final void rule__KeyValueElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1085:1: ( rule__KeyValueElement__Group__3__Impl rule__KeyValueElement__Group__4 )
            // InternalTyphonML.g:1086:2: rule__KeyValueElement__Group__3__Impl rule__KeyValueElement__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__KeyValueElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__3"


    // $ANTLR start "rule__KeyValueElement__Group__3__Impl"
    // InternalTyphonML.g:1093:1: rule__KeyValueElement__Group__3__Impl : ( ( rule__KeyValueElement__EntityAssignment_3 ) ) ;
    public final void rule__KeyValueElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1097:1: ( ( ( rule__KeyValueElement__EntityAssignment_3 ) ) )
            // InternalTyphonML.g:1098:1: ( ( rule__KeyValueElement__EntityAssignment_3 ) )
            {
            // InternalTyphonML.g:1098:1: ( ( rule__KeyValueElement__EntityAssignment_3 ) )
            // InternalTyphonML.g:1099:2: ( rule__KeyValueElement__EntityAssignment_3 )
            {
             before(grammarAccess.getKeyValueElementAccess().getEntityAssignment_3()); 
            // InternalTyphonML.g:1100:2: ( rule__KeyValueElement__EntityAssignment_3 )
            // InternalTyphonML.g:1100:3: rule__KeyValueElement__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueElement__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueElementAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__3__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__4"
    // InternalTyphonML.g:1108:1: rule__KeyValueElement__Group__4 : rule__KeyValueElement__Group__4__Impl rule__KeyValueElement__Group__5 ;
    public final void rule__KeyValueElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1112:1: ( rule__KeyValueElement__Group__4__Impl rule__KeyValueElement__Group__5 )
            // InternalTyphonML.g:1113:2: rule__KeyValueElement__Group__4__Impl rule__KeyValueElement__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__KeyValueElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__4"


    // $ANTLR start "rule__KeyValueElement__Group__4__Impl"
    // InternalTyphonML.g:1120:1: rule__KeyValueElement__Group__4__Impl : ( '{' ) ;
    public final void rule__KeyValueElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1124:1: ( ( '{' ) )
            // InternalTyphonML.g:1125:1: ( '{' )
            {
            // InternalTyphonML.g:1125:1: ( '{' )
            // InternalTyphonML.g:1126:2: '{'
            {
             before(grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getKeyValueElementAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__4__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__5"
    // InternalTyphonML.g:1135:1: rule__KeyValueElement__Group__5 : rule__KeyValueElement__Group__5__Impl rule__KeyValueElement__Group__6 ;
    public final void rule__KeyValueElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1139:1: ( rule__KeyValueElement__Group__5__Impl rule__KeyValueElement__Group__6 )
            // InternalTyphonML.g:1140:2: rule__KeyValueElement__Group__5__Impl rule__KeyValueElement__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__KeyValueElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__5"


    // $ANTLR start "rule__KeyValueElement__Group__5__Impl"
    // InternalTyphonML.g:1147:1: rule__KeyValueElement__Group__5__Impl : ( ( rule__KeyValueElement__ValuesAssignment_5 )? ) ;
    public final void rule__KeyValueElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1151:1: ( ( ( rule__KeyValueElement__ValuesAssignment_5 )? ) )
            // InternalTyphonML.g:1152:1: ( ( rule__KeyValueElement__ValuesAssignment_5 )? )
            {
            // InternalTyphonML.g:1152:1: ( ( rule__KeyValueElement__ValuesAssignment_5 )? )
            // InternalTyphonML.g:1153:2: ( rule__KeyValueElement__ValuesAssignment_5 )?
            {
             before(grammarAccess.getKeyValueElementAccess().getValuesAssignment_5()); 
            // InternalTyphonML.g:1154:2: ( rule__KeyValueElement__ValuesAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTyphonML.g:1154:3: rule__KeyValueElement__ValuesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyValueElement__ValuesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeyValueElementAccess().getValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__5__Impl"


    // $ANTLR start "rule__KeyValueElement__Group__6"
    // InternalTyphonML.g:1162:1: rule__KeyValueElement__Group__6 : rule__KeyValueElement__Group__6__Impl ;
    public final void rule__KeyValueElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1166:1: ( rule__KeyValueElement__Group__6__Impl )
            // InternalTyphonML.g:1167:2: rule__KeyValueElement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValueElement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__6"


    // $ANTLR start "rule__KeyValueElement__Group__6__Impl"
    // InternalTyphonML.g:1173:1: rule__KeyValueElement__Group__6__Impl : ( '}' ) ;
    public final void rule__KeyValueElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1177:1: ( ( '}' ) )
            // InternalTyphonML.g:1178:1: ( '}' )
            {
            // InternalTyphonML.g:1178:1: ( '}' )
            // InternalTyphonML.g:1179:2: '}'
            {
             before(grammarAccess.getKeyValueElementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getKeyValueElementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__Group__6__Impl"


    // $ANTLR start "rule__DocumentDB__Group__0"
    // InternalTyphonML.g:1189:1: rule__DocumentDB__Group__0 : rule__DocumentDB__Group__0__Impl rule__DocumentDB__Group__1 ;
    public final void rule__DocumentDB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1193:1: ( rule__DocumentDB__Group__0__Impl rule__DocumentDB__Group__1 )
            // InternalTyphonML.g:1194:2: rule__DocumentDB__Group__0__Impl rule__DocumentDB__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DocumentDB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__0"


    // $ANTLR start "rule__DocumentDB__Group__0__Impl"
    // InternalTyphonML.g:1201:1: rule__DocumentDB__Group__0__Impl : ( () ) ;
    public final void rule__DocumentDB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1205:1: ( ( () ) )
            // InternalTyphonML.g:1206:1: ( () )
            {
            // InternalTyphonML.g:1206:1: ( () )
            // InternalTyphonML.g:1207:2: ()
            {
             before(grammarAccess.getDocumentDBAccess().getDocumentDBAction_0()); 
            // InternalTyphonML.g:1208:2: ()
            // InternalTyphonML.g:1208:3: 
            {
            }

             after(grammarAccess.getDocumentDBAccess().getDocumentDBAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__0__Impl"


    // $ANTLR start "rule__DocumentDB__Group__1"
    // InternalTyphonML.g:1216:1: rule__DocumentDB__Group__1 : rule__DocumentDB__Group__1__Impl rule__DocumentDB__Group__2 ;
    public final void rule__DocumentDB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1220:1: ( rule__DocumentDB__Group__1__Impl rule__DocumentDB__Group__2 )
            // InternalTyphonML.g:1221:2: rule__DocumentDB__Group__1__Impl rule__DocumentDB__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DocumentDB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__1"


    // $ANTLR start "rule__DocumentDB__Group__1__Impl"
    // InternalTyphonML.g:1228:1: rule__DocumentDB__Group__1__Impl : ( 'documentdb' ) ;
    public final void rule__DocumentDB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1232:1: ( ( 'documentdb' ) )
            // InternalTyphonML.g:1233:1: ( 'documentdb' )
            {
            // InternalTyphonML.g:1233:1: ( 'documentdb' )
            // InternalTyphonML.g:1234:2: 'documentdb'
            {
             before(grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDocumentDBAccess().getDocumentdbKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__1__Impl"


    // $ANTLR start "rule__DocumentDB__Group__2"
    // InternalTyphonML.g:1243:1: rule__DocumentDB__Group__2 : rule__DocumentDB__Group__2__Impl rule__DocumentDB__Group__3 ;
    public final void rule__DocumentDB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1247:1: ( rule__DocumentDB__Group__2__Impl rule__DocumentDB__Group__3 )
            // InternalTyphonML.g:1248:2: rule__DocumentDB__Group__2__Impl rule__DocumentDB__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DocumentDB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__2"


    // $ANTLR start "rule__DocumentDB__Group__2__Impl"
    // InternalTyphonML.g:1255:1: rule__DocumentDB__Group__2__Impl : ( ( rule__DocumentDB__NameAssignment_2 ) ) ;
    public final void rule__DocumentDB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1259:1: ( ( ( rule__DocumentDB__NameAssignment_2 ) ) )
            // InternalTyphonML.g:1260:1: ( ( rule__DocumentDB__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:1260:1: ( ( rule__DocumentDB__NameAssignment_2 ) )
            // InternalTyphonML.g:1261:2: ( rule__DocumentDB__NameAssignment_2 )
            {
             before(grammarAccess.getDocumentDBAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:1262:2: ( rule__DocumentDB__NameAssignment_2 )
            // InternalTyphonML.g:1262:3: rule__DocumentDB__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDB__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentDBAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__2__Impl"


    // $ANTLR start "rule__DocumentDB__Group__3"
    // InternalTyphonML.g:1270:1: rule__DocumentDB__Group__3 : rule__DocumentDB__Group__3__Impl rule__DocumentDB__Group__4 ;
    public final void rule__DocumentDB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1274:1: ( rule__DocumentDB__Group__3__Impl rule__DocumentDB__Group__4 )
            // InternalTyphonML.g:1275:2: rule__DocumentDB__Group__3__Impl rule__DocumentDB__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DocumentDB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__3"


    // $ANTLR start "rule__DocumentDB__Group__3__Impl"
    // InternalTyphonML.g:1282:1: rule__DocumentDB__Group__3__Impl : ( '{' ) ;
    public final void rule__DocumentDB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1286:1: ( ( '{' ) )
            // InternalTyphonML.g:1287:1: ( '{' )
            {
            // InternalTyphonML.g:1287:1: ( '{' )
            // InternalTyphonML.g:1288:2: '{'
            {
             before(grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDocumentDBAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__3__Impl"


    // $ANTLR start "rule__DocumentDB__Group__4"
    // InternalTyphonML.g:1297:1: rule__DocumentDB__Group__4 : rule__DocumentDB__Group__4__Impl rule__DocumentDB__Group__5 ;
    public final void rule__DocumentDB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1301:1: ( rule__DocumentDB__Group__4__Impl rule__DocumentDB__Group__5 )
            // InternalTyphonML.g:1302:2: rule__DocumentDB__Group__4__Impl rule__DocumentDB__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__DocumentDB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__4"


    // $ANTLR start "rule__DocumentDB__Group__4__Impl"
    // InternalTyphonML.g:1309:1: rule__DocumentDB__Group__4__Impl : ( ( rule__DocumentDB__CollectionsAssignment_4 )* ) ;
    public final void rule__DocumentDB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1313:1: ( ( ( rule__DocumentDB__CollectionsAssignment_4 )* ) )
            // InternalTyphonML.g:1314:1: ( ( rule__DocumentDB__CollectionsAssignment_4 )* )
            {
            // InternalTyphonML.g:1314:1: ( ( rule__DocumentDB__CollectionsAssignment_4 )* )
            // InternalTyphonML.g:1315:2: ( rule__DocumentDB__CollectionsAssignment_4 )*
            {
             before(grammarAccess.getDocumentDBAccess().getCollectionsAssignment_4()); 
            // InternalTyphonML.g:1316:2: ( rule__DocumentDB__CollectionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTyphonML.g:1316:3: rule__DocumentDB__CollectionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DocumentDB__CollectionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDocumentDBAccess().getCollectionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__4__Impl"


    // $ANTLR start "rule__DocumentDB__Group__5"
    // InternalTyphonML.g:1324:1: rule__DocumentDB__Group__5 : rule__DocumentDB__Group__5__Impl ;
    public final void rule__DocumentDB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1328:1: ( rule__DocumentDB__Group__5__Impl )
            // InternalTyphonML.g:1329:2: rule__DocumentDB__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDB__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__5"


    // $ANTLR start "rule__DocumentDB__Group__5__Impl"
    // InternalTyphonML.g:1335:1: rule__DocumentDB__Group__5__Impl : ( '}' ) ;
    public final void rule__DocumentDB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1339:1: ( ( '}' ) )
            // InternalTyphonML.g:1340:1: ( '}' )
            {
            // InternalTyphonML.g:1340:1: ( '}' )
            // InternalTyphonML.g:1341:2: '}'
            {
             before(grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDocumentDBAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__Group__5__Impl"


    // $ANTLR start "rule__DocumentDBCollection__Group__0"
    // InternalTyphonML.g:1351:1: rule__DocumentDBCollection__Group__0 : rule__DocumentDBCollection__Group__0__Impl rule__DocumentDBCollection__Group__1 ;
    public final void rule__DocumentDBCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1355:1: ( rule__DocumentDBCollection__Group__0__Impl rule__DocumentDBCollection__Group__1 )
            // InternalTyphonML.g:1356:2: rule__DocumentDBCollection__Group__0__Impl rule__DocumentDBCollection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DocumentDBCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__0"


    // $ANTLR start "rule__DocumentDBCollection__Group__0__Impl"
    // InternalTyphonML.g:1363:1: rule__DocumentDBCollection__Group__0__Impl : ( () ) ;
    public final void rule__DocumentDBCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1367:1: ( ( () ) )
            // InternalTyphonML.g:1368:1: ( () )
            {
            // InternalTyphonML.g:1368:1: ( () )
            // InternalTyphonML.g:1369:2: ()
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getCollectionAction_0()); 
            // InternalTyphonML.g:1370:2: ()
            // InternalTyphonML.g:1370:3: 
            {
            }

             after(grammarAccess.getDocumentDBCollectionAccess().getCollectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__0__Impl"


    // $ANTLR start "rule__DocumentDBCollection__Group__1"
    // InternalTyphonML.g:1378:1: rule__DocumentDBCollection__Group__1 : rule__DocumentDBCollection__Group__1__Impl rule__DocumentDBCollection__Group__2 ;
    public final void rule__DocumentDBCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1382:1: ( rule__DocumentDBCollection__Group__1__Impl rule__DocumentDBCollection__Group__2 )
            // InternalTyphonML.g:1383:2: rule__DocumentDBCollection__Group__1__Impl rule__DocumentDBCollection__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DocumentDBCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__1"


    // $ANTLR start "rule__DocumentDBCollection__Group__1__Impl"
    // InternalTyphonML.g:1390:1: rule__DocumentDBCollection__Group__1__Impl : ( ( rule__DocumentDBCollection__NameAssignment_1 ) ) ;
    public final void rule__DocumentDBCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1394:1: ( ( ( rule__DocumentDBCollection__NameAssignment_1 ) ) )
            // InternalTyphonML.g:1395:1: ( ( rule__DocumentDBCollection__NameAssignment_1 ) )
            {
            // InternalTyphonML.g:1395:1: ( ( rule__DocumentDBCollection__NameAssignment_1 ) )
            // InternalTyphonML.g:1396:2: ( rule__DocumentDBCollection__NameAssignment_1 )
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getNameAssignment_1()); 
            // InternalTyphonML.g:1397:2: ( rule__DocumentDBCollection__NameAssignment_1 )
            // InternalTyphonML.g:1397:3: rule__DocumentDBCollection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentDBCollectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__1__Impl"


    // $ANTLR start "rule__DocumentDBCollection__Group__2"
    // InternalTyphonML.g:1405:1: rule__DocumentDBCollection__Group__2 : rule__DocumentDBCollection__Group__2__Impl rule__DocumentDBCollection__Group__3 ;
    public final void rule__DocumentDBCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1409:1: ( rule__DocumentDBCollection__Group__2__Impl rule__DocumentDBCollection__Group__3 )
            // InternalTyphonML.g:1410:2: rule__DocumentDBCollection__Group__2__Impl rule__DocumentDBCollection__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DocumentDBCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__2"


    // $ANTLR start "rule__DocumentDBCollection__Group__2__Impl"
    // InternalTyphonML.g:1417:1: rule__DocumentDBCollection__Group__2__Impl : ( ':' ) ;
    public final void rule__DocumentDBCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1421:1: ( ( ':' ) )
            // InternalTyphonML.g:1422:1: ( ':' )
            {
            // InternalTyphonML.g:1422:1: ( ':' )
            // InternalTyphonML.g:1423:2: ':'
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDocumentDBCollectionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__2__Impl"


    // $ANTLR start "rule__DocumentDBCollection__Group__3"
    // InternalTyphonML.g:1432:1: rule__DocumentDBCollection__Group__3 : rule__DocumentDBCollection__Group__3__Impl ;
    public final void rule__DocumentDBCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1436:1: ( rule__DocumentDBCollection__Group__3__Impl )
            // InternalTyphonML.g:1437:2: rule__DocumentDBCollection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__3"


    // $ANTLR start "rule__DocumentDBCollection__Group__3__Impl"
    // InternalTyphonML.g:1443:1: rule__DocumentDBCollection__Group__3__Impl : ( ( rule__DocumentDBCollection__EntityAssignment_3 ) ) ;
    public final void rule__DocumentDBCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1447:1: ( ( ( rule__DocumentDBCollection__EntityAssignment_3 ) ) )
            // InternalTyphonML.g:1448:1: ( ( rule__DocumentDBCollection__EntityAssignment_3 ) )
            {
            // InternalTyphonML.g:1448:1: ( ( rule__DocumentDBCollection__EntityAssignment_3 ) )
            // InternalTyphonML.g:1449:2: ( rule__DocumentDBCollection__EntityAssignment_3 )
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getEntityAssignment_3()); 
            // InternalTyphonML.g:1450:2: ( rule__DocumentDBCollection__EntityAssignment_3 )
            // InternalTyphonML.g:1450:3: rule__DocumentDBCollection__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DocumentDBCollection__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDocumentDBCollectionAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__Group__3__Impl"


    // $ANTLR start "rule__RelationalDB__Group__0"
    // InternalTyphonML.g:1459:1: rule__RelationalDB__Group__0 : rule__RelationalDB__Group__0__Impl rule__RelationalDB__Group__1 ;
    public final void rule__RelationalDB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1463:1: ( rule__RelationalDB__Group__0__Impl rule__RelationalDB__Group__1 )
            // InternalTyphonML.g:1464:2: rule__RelationalDB__Group__0__Impl rule__RelationalDB__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__RelationalDB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__0"


    // $ANTLR start "rule__RelationalDB__Group__0__Impl"
    // InternalTyphonML.g:1471:1: rule__RelationalDB__Group__0__Impl : ( () ) ;
    public final void rule__RelationalDB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1475:1: ( ( () ) )
            // InternalTyphonML.g:1476:1: ( () )
            {
            // InternalTyphonML.g:1476:1: ( () )
            // InternalTyphonML.g:1477:2: ()
            {
             before(grammarAccess.getRelationalDBAccess().getRelationalDBAction_0()); 
            // InternalTyphonML.g:1478:2: ()
            // InternalTyphonML.g:1478:3: 
            {
            }

             after(grammarAccess.getRelationalDBAccess().getRelationalDBAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__0__Impl"


    // $ANTLR start "rule__RelationalDB__Group__1"
    // InternalTyphonML.g:1486:1: rule__RelationalDB__Group__1 : rule__RelationalDB__Group__1__Impl rule__RelationalDB__Group__2 ;
    public final void rule__RelationalDB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1490:1: ( rule__RelationalDB__Group__1__Impl rule__RelationalDB__Group__2 )
            // InternalTyphonML.g:1491:2: rule__RelationalDB__Group__1__Impl rule__RelationalDB__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RelationalDB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__1"


    // $ANTLR start "rule__RelationalDB__Group__1__Impl"
    // InternalTyphonML.g:1498:1: rule__RelationalDB__Group__1__Impl : ( 'relationaldb' ) ;
    public final void rule__RelationalDB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1502:1: ( ( 'relationaldb' ) )
            // InternalTyphonML.g:1503:1: ( 'relationaldb' )
            {
            // InternalTyphonML.g:1503:1: ( 'relationaldb' )
            // InternalTyphonML.g:1504:2: 'relationaldb'
            {
             before(grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationalDBAccess().getRelationaldbKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__1__Impl"


    // $ANTLR start "rule__RelationalDB__Group__2"
    // InternalTyphonML.g:1513:1: rule__RelationalDB__Group__2 : rule__RelationalDB__Group__2__Impl rule__RelationalDB__Group__3 ;
    public final void rule__RelationalDB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1517:1: ( rule__RelationalDB__Group__2__Impl rule__RelationalDB__Group__3 )
            // InternalTyphonML.g:1518:2: rule__RelationalDB__Group__2__Impl rule__RelationalDB__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RelationalDB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__2"


    // $ANTLR start "rule__RelationalDB__Group__2__Impl"
    // InternalTyphonML.g:1525:1: rule__RelationalDB__Group__2__Impl : ( ( rule__RelationalDB__NameAssignment_2 ) ) ;
    public final void rule__RelationalDB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1529:1: ( ( ( rule__RelationalDB__NameAssignment_2 ) ) )
            // InternalTyphonML.g:1530:1: ( ( rule__RelationalDB__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:1530:1: ( ( rule__RelationalDB__NameAssignment_2 ) )
            // InternalTyphonML.g:1531:2: ( rule__RelationalDB__NameAssignment_2 )
            {
             before(grammarAccess.getRelationalDBAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:1532:2: ( rule__RelationalDB__NameAssignment_2 )
            // InternalTyphonML.g:1532:3: rule__RelationalDB__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationalDB__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationalDBAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__2__Impl"


    // $ANTLR start "rule__RelationalDB__Group__3"
    // InternalTyphonML.g:1540:1: rule__RelationalDB__Group__3 : rule__RelationalDB__Group__3__Impl rule__RelationalDB__Group__4 ;
    public final void rule__RelationalDB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1544:1: ( rule__RelationalDB__Group__3__Impl rule__RelationalDB__Group__4 )
            // InternalTyphonML.g:1545:2: rule__RelationalDB__Group__3__Impl rule__RelationalDB__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__RelationalDB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__3"


    // $ANTLR start "rule__RelationalDB__Group__3__Impl"
    // InternalTyphonML.g:1552:1: rule__RelationalDB__Group__3__Impl : ( '{' ) ;
    public final void rule__RelationalDB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1556:1: ( ( '{' ) )
            // InternalTyphonML.g:1557:1: ( '{' )
            {
            // InternalTyphonML.g:1557:1: ( '{' )
            // InternalTyphonML.g:1558:2: '{'
            {
             before(grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationalDBAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__3__Impl"


    // $ANTLR start "rule__RelationalDB__Group__4"
    // InternalTyphonML.g:1567:1: rule__RelationalDB__Group__4 : rule__RelationalDB__Group__4__Impl rule__RelationalDB__Group__5 ;
    public final void rule__RelationalDB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1571:1: ( rule__RelationalDB__Group__4__Impl rule__RelationalDB__Group__5 )
            // InternalTyphonML.g:1572:2: rule__RelationalDB__Group__4__Impl rule__RelationalDB__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__RelationalDB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__4"


    // $ANTLR start "rule__RelationalDB__Group__4__Impl"
    // InternalTyphonML.g:1579:1: rule__RelationalDB__Group__4__Impl : ( ( rule__RelationalDB__TablesAssignment_4 )* ) ;
    public final void rule__RelationalDB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1583:1: ( ( ( rule__RelationalDB__TablesAssignment_4 )* ) )
            // InternalTyphonML.g:1584:1: ( ( rule__RelationalDB__TablesAssignment_4 )* )
            {
            // InternalTyphonML.g:1584:1: ( ( rule__RelationalDB__TablesAssignment_4 )* )
            // InternalTyphonML.g:1585:2: ( rule__RelationalDB__TablesAssignment_4 )*
            {
             before(grammarAccess.getRelationalDBAccess().getTablesAssignment_4()); 
            // InternalTyphonML.g:1586:2: ( rule__RelationalDB__TablesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTyphonML.g:1586:3: rule__RelationalDB__TablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RelationalDB__TablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRelationalDBAccess().getTablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__4__Impl"


    // $ANTLR start "rule__RelationalDB__Group__5"
    // InternalTyphonML.g:1594:1: rule__RelationalDB__Group__5 : rule__RelationalDB__Group__5__Impl ;
    public final void rule__RelationalDB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1598:1: ( rule__RelationalDB__Group__5__Impl )
            // InternalTyphonML.g:1599:2: rule__RelationalDB__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalDB__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__5"


    // $ANTLR start "rule__RelationalDB__Group__5__Impl"
    // InternalTyphonML.g:1605:1: rule__RelationalDB__Group__5__Impl : ( '}' ) ;
    public final void rule__RelationalDB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1609:1: ( ( '}' ) )
            // InternalTyphonML.g:1610:1: ( '}' )
            {
            // InternalTyphonML.g:1610:1: ( '}' )
            // InternalTyphonML.g:1611:2: '}'
            {
             before(grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationalDBAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalTyphonML.g:1621:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1625:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalTyphonML.g:1626:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalTyphonML.g:1633:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1637:1: ( ( () ) )
            // InternalTyphonML.g:1638:1: ( () )
            {
            // InternalTyphonML.g:1638:1: ( () )
            // InternalTyphonML.g:1639:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalTyphonML.g:1640:2: ()
            // InternalTyphonML.g:1640:3: 
            {
            }

             after(grammarAccess.getTableAccess().getTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalTyphonML.g:1648:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1652:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalTyphonML.g:1653:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalTyphonML.g:1660:1: rule__Table__Group__1__Impl : ( 'table' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1664:1: ( ( 'table' ) )
            // InternalTyphonML.g:1665:1: ( 'table' )
            {
            // InternalTyphonML.g:1665:1: ( 'table' )
            // InternalTyphonML.g:1666:2: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalTyphonML.g:1675:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1679:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalTyphonML.g:1680:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalTyphonML.g:1687:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1691:1: ( ( '{' ) )
            // InternalTyphonML.g:1692:1: ( '{' )
            {
            // InternalTyphonML.g:1692:1: ( '{' )
            // InternalTyphonML.g:1693:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalTyphonML.g:1702:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1706:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalTyphonML.g:1707:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalTyphonML.g:1714:1: rule__Table__Group__3__Impl : ( ( rule__Table__NameAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1718:1: ( ( ( rule__Table__NameAssignment_3 ) ) )
            // InternalTyphonML.g:1719:1: ( ( rule__Table__NameAssignment_3 ) )
            {
            // InternalTyphonML.g:1719:1: ( ( rule__Table__NameAssignment_3 ) )
            // InternalTyphonML.g:1720:2: ( rule__Table__NameAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_3()); 
            // InternalTyphonML.g:1721:2: ( rule__Table__NameAssignment_3 )
            // InternalTyphonML.g:1721:3: rule__Table__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalTyphonML.g:1729:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1733:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalTyphonML.g:1734:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalTyphonML.g:1741:1: rule__Table__Group__4__Impl : ( ':' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1745:1: ( ( ':' ) )
            // InternalTyphonML.g:1746:1: ( ':' )
            {
            // InternalTyphonML.g:1746:1: ( ':' )
            // InternalTyphonML.g:1747:2: ':'
            {
             before(grammarAccess.getTableAccess().getColonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalTyphonML.g:1756:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1760:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalTyphonML.g:1761:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalTyphonML.g:1768:1: rule__Table__Group__5__Impl : ( ( rule__Table__EntityAssignment_5 ) ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1772:1: ( ( ( rule__Table__EntityAssignment_5 ) ) )
            // InternalTyphonML.g:1773:1: ( ( rule__Table__EntityAssignment_5 ) )
            {
            // InternalTyphonML.g:1773:1: ( ( rule__Table__EntityAssignment_5 ) )
            // InternalTyphonML.g:1774:2: ( rule__Table__EntityAssignment_5 )
            {
             before(grammarAccess.getTableAccess().getEntityAssignment_5()); 
            // InternalTyphonML.g:1775:2: ( rule__Table__EntityAssignment_5 )
            // InternalTyphonML.g:1775:3: rule__Table__EntityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Table__EntityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getEntityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalTyphonML.g:1783:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1787:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalTyphonML.g:1788:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Table__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalTyphonML.g:1795:1: rule__Table__Group__6__Impl : ( ( rule__Table__IndexSpecAssignment_6 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1799:1: ( ( ( rule__Table__IndexSpecAssignment_6 )? ) )
            // InternalTyphonML.g:1800:1: ( ( rule__Table__IndexSpecAssignment_6 )? )
            {
            // InternalTyphonML.g:1800:1: ( ( rule__Table__IndexSpecAssignment_6 )? )
            // InternalTyphonML.g:1801:2: ( rule__Table__IndexSpecAssignment_6 )?
            {
             before(grammarAccess.getTableAccess().getIndexSpecAssignment_6()); 
            // InternalTyphonML.g:1802:2: ( rule__Table__IndexSpecAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTyphonML.g:1802:3: rule__Table__IndexSpecAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__IndexSpecAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getIndexSpecAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // InternalTyphonML.g:1810:1: rule__Table__Group__7 : rule__Table__Group__7__Impl rule__Table__Group__8 ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1814:1: ( rule__Table__Group__7__Impl rule__Table__Group__8 )
            // InternalTyphonML.g:1815:2: rule__Table__Group__7__Impl rule__Table__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Table__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // InternalTyphonML.g:1822:1: rule__Table__Group__7__Impl : ( ( rule__Table__IdSpecAssignment_7 )? ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1826:1: ( ( ( rule__Table__IdSpecAssignment_7 )? ) )
            // InternalTyphonML.g:1827:1: ( ( rule__Table__IdSpecAssignment_7 )? )
            {
            // InternalTyphonML.g:1827:1: ( ( rule__Table__IdSpecAssignment_7 )? )
            // InternalTyphonML.g:1828:2: ( rule__Table__IdSpecAssignment_7 )?
            {
             before(grammarAccess.getTableAccess().getIdSpecAssignment_7()); 
            // InternalTyphonML.g:1829:2: ( rule__Table__IdSpecAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTyphonML.g:1829:3: rule__Table__IdSpecAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__IdSpecAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getIdSpecAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__8"
    // InternalTyphonML.g:1837:1: rule__Table__Group__8 : rule__Table__Group__8__Impl ;
    public final void rule__Table__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1841:1: ( rule__Table__Group__8__Impl )
            // InternalTyphonML.g:1842:2: rule__Table__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8"


    // $ANTLR start "rule__Table__Group__8__Impl"
    // InternalTyphonML.g:1848:1: rule__Table__Group__8__Impl : ( '}' ) ;
    public final void rule__Table__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1852:1: ( ( '}' ) )
            // InternalTyphonML.g:1853:1: ( '}' )
            {
            // InternalTyphonML.g:1853:1: ( '}' )
            // InternalTyphonML.g:1854:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8__Impl"


    // $ANTLR start "rule__IndexSpec__Group__0"
    // InternalTyphonML.g:1864:1: rule__IndexSpec__Group__0 : rule__IndexSpec__Group__0__Impl rule__IndexSpec__Group__1 ;
    public final void rule__IndexSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1868:1: ( rule__IndexSpec__Group__0__Impl rule__IndexSpec__Group__1 )
            // InternalTyphonML.g:1869:2: rule__IndexSpec__Group__0__Impl rule__IndexSpec__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__IndexSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__0"


    // $ANTLR start "rule__IndexSpec__Group__0__Impl"
    // InternalTyphonML.g:1876:1: rule__IndexSpec__Group__0__Impl : ( () ) ;
    public final void rule__IndexSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1880:1: ( ( () ) )
            // InternalTyphonML.g:1881:1: ( () )
            {
            // InternalTyphonML.g:1881:1: ( () )
            // InternalTyphonML.g:1882:2: ()
            {
             before(grammarAccess.getIndexSpecAccess().getIndexSpecAction_0()); 
            // InternalTyphonML.g:1883:2: ()
            // InternalTyphonML.g:1883:3: 
            {
            }

             after(grammarAccess.getIndexSpecAccess().getIndexSpecAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__0__Impl"


    // $ANTLR start "rule__IndexSpec__Group__1"
    // InternalTyphonML.g:1891:1: rule__IndexSpec__Group__1 : rule__IndexSpec__Group__1__Impl rule__IndexSpec__Group__2 ;
    public final void rule__IndexSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1895:1: ( rule__IndexSpec__Group__1__Impl rule__IndexSpec__Group__2 )
            // InternalTyphonML.g:1896:2: rule__IndexSpec__Group__1__Impl rule__IndexSpec__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__IndexSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__1"


    // $ANTLR start "rule__IndexSpec__Group__1__Impl"
    // InternalTyphonML.g:1903:1: rule__IndexSpec__Group__1__Impl : ( 'index' ) ;
    public final void rule__IndexSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1907:1: ( ( 'index' ) )
            // InternalTyphonML.g:1908:1: ( 'index' )
            {
            // InternalTyphonML.g:1908:1: ( 'index' )
            // InternalTyphonML.g:1909:2: 'index'
            {
             before(grammarAccess.getIndexSpecAccess().getIndexKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIndexSpecAccess().getIndexKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__1__Impl"


    // $ANTLR start "rule__IndexSpec__Group__2"
    // InternalTyphonML.g:1918:1: rule__IndexSpec__Group__2 : rule__IndexSpec__Group__2__Impl rule__IndexSpec__Group__3 ;
    public final void rule__IndexSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1922:1: ( rule__IndexSpec__Group__2__Impl rule__IndexSpec__Group__3 )
            // InternalTyphonML.g:1923:2: rule__IndexSpec__Group__2__Impl rule__IndexSpec__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__IndexSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__2"


    // $ANTLR start "rule__IndexSpec__Group__2__Impl"
    // InternalTyphonML.g:1930:1: rule__IndexSpec__Group__2__Impl : ( ( rule__IndexSpec__NameAssignment_2 ) ) ;
    public final void rule__IndexSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1934:1: ( ( ( rule__IndexSpec__NameAssignment_2 ) ) )
            // InternalTyphonML.g:1935:1: ( ( rule__IndexSpec__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:1935:1: ( ( rule__IndexSpec__NameAssignment_2 ) )
            // InternalTyphonML.g:1936:2: ( rule__IndexSpec__NameAssignment_2 )
            {
             before(grammarAccess.getIndexSpecAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:1937:2: ( rule__IndexSpec__NameAssignment_2 )
            // InternalTyphonML.g:1937:3: rule__IndexSpec__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IndexSpec__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIndexSpecAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__2__Impl"


    // $ANTLR start "rule__IndexSpec__Group__3"
    // InternalTyphonML.g:1945:1: rule__IndexSpec__Group__3 : rule__IndexSpec__Group__3__Impl rule__IndexSpec__Group__4 ;
    public final void rule__IndexSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1949:1: ( rule__IndexSpec__Group__3__Impl rule__IndexSpec__Group__4 )
            // InternalTyphonML.g:1950:2: rule__IndexSpec__Group__3__Impl rule__IndexSpec__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__IndexSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__3"


    // $ANTLR start "rule__IndexSpec__Group__3__Impl"
    // InternalTyphonML.g:1957:1: rule__IndexSpec__Group__3__Impl : ( '{' ) ;
    public final void rule__IndexSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1961:1: ( ( '{' ) )
            // InternalTyphonML.g:1962:1: ( '{' )
            {
            // InternalTyphonML.g:1962:1: ( '{' )
            // InternalTyphonML.g:1963:2: '{'
            {
             before(grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIndexSpecAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__3__Impl"


    // $ANTLR start "rule__IndexSpec__Group__4"
    // InternalTyphonML.g:1972:1: rule__IndexSpec__Group__4 : rule__IndexSpec__Group__4__Impl rule__IndexSpec__Group__5 ;
    public final void rule__IndexSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1976:1: ( rule__IndexSpec__Group__4__Impl rule__IndexSpec__Group__5 )
            // InternalTyphonML.g:1977:2: rule__IndexSpec__Group__4__Impl rule__IndexSpec__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__IndexSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__4"


    // $ANTLR start "rule__IndexSpec__Group__4__Impl"
    // InternalTyphonML.g:1984:1: rule__IndexSpec__Group__4__Impl : ( ( rule__IndexSpec__AttributesAssignment_4 )* ) ;
    public final void rule__IndexSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:1988:1: ( ( ( rule__IndexSpec__AttributesAssignment_4 )* ) )
            // InternalTyphonML.g:1989:1: ( ( rule__IndexSpec__AttributesAssignment_4 )* )
            {
            // InternalTyphonML.g:1989:1: ( ( rule__IndexSpec__AttributesAssignment_4 )* )
            // InternalTyphonML.g:1990:2: ( rule__IndexSpec__AttributesAssignment_4 )*
            {
             before(grammarAccess.getIndexSpecAccess().getAttributesAssignment_4()); 
            // InternalTyphonML.g:1991:2: ( rule__IndexSpec__AttributesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTyphonML.g:1991:3: rule__IndexSpec__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__IndexSpec__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getIndexSpecAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__4__Impl"


    // $ANTLR start "rule__IndexSpec__Group__5"
    // InternalTyphonML.g:1999:1: rule__IndexSpec__Group__5 : rule__IndexSpec__Group__5__Impl ;
    public final void rule__IndexSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2003:1: ( rule__IndexSpec__Group__5__Impl )
            // InternalTyphonML.g:2004:2: rule__IndexSpec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexSpec__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__5"


    // $ANTLR start "rule__IndexSpec__Group__5__Impl"
    // InternalTyphonML.g:2010:1: rule__IndexSpec__Group__5__Impl : ( '}' ) ;
    public final void rule__IndexSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2014:1: ( ( '}' ) )
            // InternalTyphonML.g:2015:1: ( '}' )
            {
            // InternalTyphonML.g:2015:1: ( '}' )
            // InternalTyphonML.g:2016:2: '}'
            {
             before(grammarAccess.getIndexSpecAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIndexSpecAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__Group__5__Impl"


    // $ANTLR start "rule__IdSpec__Group__0"
    // InternalTyphonML.g:2026:1: rule__IdSpec__Group__0 : rule__IdSpec__Group__0__Impl rule__IdSpec__Group__1 ;
    public final void rule__IdSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2030:1: ( rule__IdSpec__Group__0__Impl rule__IdSpec__Group__1 )
            // InternalTyphonML.g:2031:2: rule__IdSpec__Group__0__Impl rule__IdSpec__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__IdSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__0"


    // $ANTLR start "rule__IdSpec__Group__0__Impl"
    // InternalTyphonML.g:2038:1: rule__IdSpec__Group__0__Impl : ( () ) ;
    public final void rule__IdSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2042:1: ( ( () ) )
            // InternalTyphonML.g:2043:1: ( () )
            {
            // InternalTyphonML.g:2043:1: ( () )
            // InternalTyphonML.g:2044:2: ()
            {
             before(grammarAccess.getIdSpecAccess().getIdSpecAction_0()); 
            // InternalTyphonML.g:2045:2: ()
            // InternalTyphonML.g:2045:3: 
            {
            }

             after(grammarAccess.getIdSpecAccess().getIdSpecAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__0__Impl"


    // $ANTLR start "rule__IdSpec__Group__1"
    // InternalTyphonML.g:2053:1: rule__IdSpec__Group__1 : rule__IdSpec__Group__1__Impl rule__IdSpec__Group__2 ;
    public final void rule__IdSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2057:1: ( rule__IdSpec__Group__1__Impl rule__IdSpec__Group__2 )
            // InternalTyphonML.g:2058:2: rule__IdSpec__Group__1__Impl rule__IdSpec__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__IdSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__1"


    // $ANTLR start "rule__IdSpec__Group__1__Impl"
    // InternalTyphonML.g:2065:1: rule__IdSpec__Group__1__Impl : ( 'id' ) ;
    public final void rule__IdSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2069:1: ( ( 'id' ) )
            // InternalTyphonML.g:2070:1: ( 'id' )
            {
            // InternalTyphonML.g:2070:1: ( 'id' )
            // InternalTyphonML.g:2071:2: 'id'
            {
             before(grammarAccess.getIdSpecAccess().getIdKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIdSpecAccess().getIdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__1__Impl"


    // $ANTLR start "rule__IdSpec__Group__2"
    // InternalTyphonML.g:2080:1: rule__IdSpec__Group__2 : rule__IdSpec__Group__2__Impl rule__IdSpec__Group__3 ;
    public final void rule__IdSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2084:1: ( rule__IdSpec__Group__2__Impl rule__IdSpec__Group__3 )
            // InternalTyphonML.g:2085:2: rule__IdSpec__Group__2__Impl rule__IdSpec__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__IdSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__2"


    // $ANTLR start "rule__IdSpec__Group__2__Impl"
    // InternalTyphonML.g:2092:1: rule__IdSpec__Group__2__Impl : ( '{' ) ;
    public final void rule__IdSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2096:1: ( ( '{' ) )
            // InternalTyphonML.g:2097:1: ( '{' )
            {
            // InternalTyphonML.g:2097:1: ( '{' )
            // InternalTyphonML.g:2098:2: '{'
            {
             before(grammarAccess.getIdSpecAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIdSpecAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__2__Impl"


    // $ANTLR start "rule__IdSpec__Group__3"
    // InternalTyphonML.g:2107:1: rule__IdSpec__Group__3 : rule__IdSpec__Group__3__Impl rule__IdSpec__Group__4 ;
    public final void rule__IdSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2111:1: ( rule__IdSpec__Group__3__Impl rule__IdSpec__Group__4 )
            // InternalTyphonML.g:2112:2: rule__IdSpec__Group__3__Impl rule__IdSpec__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__IdSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__3"


    // $ANTLR start "rule__IdSpec__Group__3__Impl"
    // InternalTyphonML.g:2119:1: rule__IdSpec__Group__3__Impl : ( ( rule__IdSpec__AttributesAssignment_3 )* ) ;
    public final void rule__IdSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2123:1: ( ( ( rule__IdSpec__AttributesAssignment_3 )* ) )
            // InternalTyphonML.g:2124:1: ( ( rule__IdSpec__AttributesAssignment_3 )* )
            {
            // InternalTyphonML.g:2124:1: ( ( rule__IdSpec__AttributesAssignment_3 )* )
            // InternalTyphonML.g:2125:2: ( rule__IdSpec__AttributesAssignment_3 )*
            {
             before(grammarAccess.getIdSpecAccess().getAttributesAssignment_3()); 
            // InternalTyphonML.g:2126:2: ( rule__IdSpec__AttributesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTyphonML.g:2126:3: rule__IdSpec__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__IdSpec__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIdSpecAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__3__Impl"


    // $ANTLR start "rule__IdSpec__Group__4"
    // InternalTyphonML.g:2134:1: rule__IdSpec__Group__4 : rule__IdSpec__Group__4__Impl ;
    public final void rule__IdSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2138:1: ( rule__IdSpec__Group__4__Impl )
            // InternalTyphonML.g:2139:2: rule__IdSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdSpec__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__4"


    // $ANTLR start "rule__IdSpec__Group__4__Impl"
    // InternalTyphonML.g:2145:1: rule__IdSpec__Group__4__Impl : ( '}' ) ;
    public final void rule__IdSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2149:1: ( ( '}' ) )
            // InternalTyphonML.g:2150:1: ( '}' )
            {
            // InternalTyphonML.g:2150:1: ( '}' )
            // InternalTyphonML.g:2151:2: '}'
            {
             before(grammarAccess.getIdSpecAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIdSpecAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__Group__4__Impl"


    // $ANTLR start "rule__GraphDB__Group__0"
    // InternalTyphonML.g:2161:1: rule__GraphDB__Group__0 : rule__GraphDB__Group__0__Impl rule__GraphDB__Group__1 ;
    public final void rule__GraphDB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2165:1: ( rule__GraphDB__Group__0__Impl rule__GraphDB__Group__1 )
            // InternalTyphonML.g:2166:2: rule__GraphDB__Group__0__Impl rule__GraphDB__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__GraphDB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__0"


    // $ANTLR start "rule__GraphDB__Group__0__Impl"
    // InternalTyphonML.g:2173:1: rule__GraphDB__Group__0__Impl : ( () ) ;
    public final void rule__GraphDB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2177:1: ( ( () ) )
            // InternalTyphonML.g:2178:1: ( () )
            {
            // InternalTyphonML.g:2178:1: ( () )
            // InternalTyphonML.g:2179:2: ()
            {
             before(grammarAccess.getGraphDBAccess().getGraphDBAction_0()); 
            // InternalTyphonML.g:2180:2: ()
            // InternalTyphonML.g:2180:3: 
            {
            }

             after(grammarAccess.getGraphDBAccess().getGraphDBAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__0__Impl"


    // $ANTLR start "rule__GraphDB__Group__1"
    // InternalTyphonML.g:2188:1: rule__GraphDB__Group__1 : rule__GraphDB__Group__1__Impl rule__GraphDB__Group__2 ;
    public final void rule__GraphDB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2192:1: ( rule__GraphDB__Group__1__Impl rule__GraphDB__Group__2 )
            // InternalTyphonML.g:2193:2: rule__GraphDB__Group__1__Impl rule__GraphDB__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__GraphDB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__1"


    // $ANTLR start "rule__GraphDB__Group__1__Impl"
    // InternalTyphonML.g:2200:1: rule__GraphDB__Group__1__Impl : ( 'graphdb' ) ;
    public final void rule__GraphDB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2204:1: ( ( 'graphdb' ) )
            // InternalTyphonML.g:2205:1: ( 'graphdb' )
            {
            // InternalTyphonML.g:2205:1: ( 'graphdb' )
            // InternalTyphonML.g:2206:2: 'graphdb'
            {
             before(grammarAccess.getGraphDBAccess().getGraphdbKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGraphDBAccess().getGraphdbKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__1__Impl"


    // $ANTLR start "rule__GraphDB__Group__2"
    // InternalTyphonML.g:2215:1: rule__GraphDB__Group__2 : rule__GraphDB__Group__2__Impl rule__GraphDB__Group__3 ;
    public final void rule__GraphDB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2219:1: ( rule__GraphDB__Group__2__Impl rule__GraphDB__Group__3 )
            // InternalTyphonML.g:2220:2: rule__GraphDB__Group__2__Impl rule__GraphDB__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__GraphDB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__2"


    // $ANTLR start "rule__GraphDB__Group__2__Impl"
    // InternalTyphonML.g:2227:1: rule__GraphDB__Group__2__Impl : ( ( rule__GraphDB__NameAssignment_2 ) ) ;
    public final void rule__GraphDB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2231:1: ( ( ( rule__GraphDB__NameAssignment_2 ) ) )
            // InternalTyphonML.g:2232:1: ( ( rule__GraphDB__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:2232:1: ( ( rule__GraphDB__NameAssignment_2 ) )
            // InternalTyphonML.g:2233:2: ( rule__GraphDB__NameAssignment_2 )
            {
             before(grammarAccess.getGraphDBAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:2234:2: ( rule__GraphDB__NameAssignment_2 )
            // InternalTyphonML.g:2234:3: rule__GraphDB__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphDB__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphDBAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__2__Impl"


    // $ANTLR start "rule__GraphDB__Group__3"
    // InternalTyphonML.g:2242:1: rule__GraphDB__Group__3 : rule__GraphDB__Group__3__Impl rule__GraphDB__Group__4 ;
    public final void rule__GraphDB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2246:1: ( rule__GraphDB__Group__3__Impl rule__GraphDB__Group__4 )
            // InternalTyphonML.g:2247:2: rule__GraphDB__Group__3__Impl rule__GraphDB__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__GraphDB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__3"


    // $ANTLR start "rule__GraphDB__Group__3__Impl"
    // InternalTyphonML.g:2254:1: rule__GraphDB__Group__3__Impl : ( '{' ) ;
    public final void rule__GraphDB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2258:1: ( ( '{' ) )
            // InternalTyphonML.g:2259:1: ( '{' )
            {
            // InternalTyphonML.g:2259:1: ( '{' )
            // InternalTyphonML.g:2260:2: '{'
            {
             before(grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGraphDBAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__3__Impl"


    // $ANTLR start "rule__GraphDB__Group__4"
    // InternalTyphonML.g:2269:1: rule__GraphDB__Group__4 : rule__GraphDB__Group__4__Impl rule__GraphDB__Group__5 ;
    public final void rule__GraphDB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2273:1: ( rule__GraphDB__Group__4__Impl rule__GraphDB__Group__5 )
            // InternalTyphonML.g:2274:2: rule__GraphDB__Group__4__Impl rule__GraphDB__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__GraphDB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__4"


    // $ANTLR start "rule__GraphDB__Group__4__Impl"
    // InternalTyphonML.g:2281:1: rule__GraphDB__Group__4__Impl : ( ( rule__GraphDB__NodesAssignment_4 )* ) ;
    public final void rule__GraphDB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2285:1: ( ( ( rule__GraphDB__NodesAssignment_4 )* ) )
            // InternalTyphonML.g:2286:1: ( ( rule__GraphDB__NodesAssignment_4 )* )
            {
            // InternalTyphonML.g:2286:1: ( ( rule__GraphDB__NodesAssignment_4 )* )
            // InternalTyphonML.g:2287:2: ( rule__GraphDB__NodesAssignment_4 )*
            {
             before(grammarAccess.getGraphDBAccess().getNodesAssignment_4()); 
            // InternalTyphonML.g:2288:2: ( rule__GraphDB__NodesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTyphonML.g:2288:3: rule__GraphDB__NodesAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__GraphDB__NodesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getGraphDBAccess().getNodesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__4__Impl"


    // $ANTLR start "rule__GraphDB__Group__5"
    // InternalTyphonML.g:2296:1: rule__GraphDB__Group__5 : rule__GraphDB__Group__5__Impl rule__GraphDB__Group__6 ;
    public final void rule__GraphDB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2300:1: ( rule__GraphDB__Group__5__Impl rule__GraphDB__Group__6 )
            // InternalTyphonML.g:2301:2: rule__GraphDB__Group__5__Impl rule__GraphDB__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__GraphDB__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__5"


    // $ANTLR start "rule__GraphDB__Group__5__Impl"
    // InternalTyphonML.g:2308:1: rule__GraphDB__Group__5__Impl : ( ( rule__GraphDB__EdgesAssignment_5 )* ) ;
    public final void rule__GraphDB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2312:1: ( ( ( rule__GraphDB__EdgesAssignment_5 )* ) )
            // InternalTyphonML.g:2313:1: ( ( rule__GraphDB__EdgesAssignment_5 )* )
            {
            // InternalTyphonML.g:2313:1: ( ( rule__GraphDB__EdgesAssignment_5 )* )
            // InternalTyphonML.g:2314:2: ( rule__GraphDB__EdgesAssignment_5 )*
            {
             before(grammarAccess.getGraphDBAccess().getEdgesAssignment_5()); 
            // InternalTyphonML.g:2315:2: ( rule__GraphDB__EdgesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTyphonML.g:2315:3: rule__GraphDB__EdgesAssignment_5
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__GraphDB__EdgesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getGraphDBAccess().getEdgesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__5__Impl"


    // $ANTLR start "rule__GraphDB__Group__6"
    // InternalTyphonML.g:2323:1: rule__GraphDB__Group__6 : rule__GraphDB__Group__6__Impl ;
    public final void rule__GraphDB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2327:1: ( rule__GraphDB__Group__6__Impl )
            // InternalTyphonML.g:2328:2: rule__GraphDB__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDB__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__6"


    // $ANTLR start "rule__GraphDB__Group__6__Impl"
    // InternalTyphonML.g:2334:1: rule__GraphDB__Group__6__Impl : ( '}' ) ;
    public final void rule__GraphDB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2338:1: ( ( '}' ) )
            // InternalTyphonML.g:2339:1: ( '}' )
            {
            // InternalTyphonML.g:2339:1: ( '}' )
            // InternalTyphonML.g:2340:2: '}'
            {
             before(grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphDBAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalTyphonML.g:2350:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2354:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalTyphonML.g:2355:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalTyphonML.g:2362:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2366:1: ( ( () ) )
            // InternalTyphonML.g:2367:1: ( () )
            {
            // InternalTyphonML.g:2367:1: ( () )
            // InternalTyphonML.g:2368:2: ()
            {
             before(grammarAccess.getNodeAccess().getGraphNodeAction_0()); 
            // InternalTyphonML.g:2369:2: ()
            // InternalTyphonML.g:2369:3: 
            {
            }

             after(grammarAccess.getNodeAccess().getGraphNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalTyphonML.g:2377:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2381:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalTyphonML.g:2382:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalTyphonML.g:2389:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2393:1: ( ( 'node' ) )
            // InternalTyphonML.g:2394:1: ( 'node' )
            {
            // InternalTyphonML.g:2394:1: ( 'node' )
            // InternalTyphonML.g:2395:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalTyphonML.g:2404:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2408:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalTyphonML.g:2409:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalTyphonML.g:2416:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2420:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalTyphonML.g:2421:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:2421:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalTyphonML.g:2422:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:2423:2: ( rule__Node__NameAssignment_2 )
            // InternalTyphonML.g:2423:3: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalTyphonML.g:2431:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2435:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalTyphonML.g:2436:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalTyphonML.g:2443:1: rule__Node__Group__3__Impl : ( ':' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2447:1: ( ( ':' ) )
            // InternalTyphonML.g:2448:1: ( ':' )
            {
            // InternalTyphonML.g:2448:1: ( ':' )
            // InternalTyphonML.g:2449:2: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalTyphonML.g:2458:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2462:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalTyphonML.g:2463:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalTyphonML.g:2470:1: rule__Node__Group__4__Impl : ( ( rule__Node__EntityAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2474:1: ( ( ( rule__Node__EntityAssignment_4 ) ) )
            // InternalTyphonML.g:2475:1: ( ( rule__Node__EntityAssignment_4 ) )
            {
            // InternalTyphonML.g:2475:1: ( ( rule__Node__EntityAssignment_4 ) )
            // InternalTyphonML.g:2476:2: ( rule__Node__EntityAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getEntityAssignment_4()); 
            // InternalTyphonML.g:2477:2: ( rule__Node__EntityAssignment_4 )
            // InternalTyphonML.g:2477:3: rule__Node__EntityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Node__EntityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getEntityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // InternalTyphonML.g:2485:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2489:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // InternalTyphonML.g:2490:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // InternalTyphonML.g:2497:1: rule__Node__Group__5__Impl : ( '{' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2501:1: ( ( '{' ) )
            // InternalTyphonML.g:2502:1: ( '{' )
            {
            // InternalTyphonML.g:2502:1: ( '{' )
            // InternalTyphonML.g:2503:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // InternalTyphonML.g:2512:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2516:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // InternalTyphonML.g:2517:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // InternalTyphonML.g:2524:1: rule__Node__Group__6__Impl : ( ( rule__Node__AttributesAssignment_6 )* ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2528:1: ( ( ( rule__Node__AttributesAssignment_6 )* ) )
            // InternalTyphonML.g:2529:1: ( ( rule__Node__AttributesAssignment_6 )* )
            {
            // InternalTyphonML.g:2529:1: ( ( rule__Node__AttributesAssignment_6 )* )
            // InternalTyphonML.g:2530:2: ( rule__Node__AttributesAssignment_6 )*
            {
             before(grammarAccess.getNodeAccess().getAttributesAssignment_6()); 
            // InternalTyphonML.g:2531:2: ( rule__Node__AttributesAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTyphonML.g:2531:3: rule__Node__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Node__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getAttributesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // InternalTyphonML.g:2539:1: rule__Node__Group__7 : rule__Node__Group__7__Impl ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2543:1: ( rule__Node__Group__7__Impl )
            // InternalTyphonML.g:2544:2: rule__Node__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // InternalTyphonML.g:2550:1: rule__Node__Group__7__Impl : ( '}' ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2554:1: ( ( '}' ) )
            // InternalTyphonML.g:2555:1: ( '}' )
            {
            // InternalTyphonML.g:2555:1: ( '}' )
            // InternalTyphonML.g:2556:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__GraphAttribute__Group__0"
    // InternalTyphonML.g:2566:1: rule__GraphAttribute__Group__0 : rule__GraphAttribute__Group__0__Impl rule__GraphAttribute__Group__1 ;
    public final void rule__GraphAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2570:1: ( rule__GraphAttribute__Group__0__Impl rule__GraphAttribute__Group__1 )
            // InternalTyphonML.g:2571:2: rule__GraphAttribute__Group__0__Impl rule__GraphAttribute__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__GraphAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__0"


    // $ANTLR start "rule__GraphAttribute__Group__0__Impl"
    // InternalTyphonML.g:2578:1: rule__GraphAttribute__Group__0__Impl : ( () ) ;
    public final void rule__GraphAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2582:1: ( ( () ) )
            // InternalTyphonML.g:2583:1: ( () )
            {
            // InternalTyphonML.g:2583:1: ( () )
            // InternalTyphonML.g:2584:2: ()
            {
             before(grammarAccess.getGraphAttributeAccess().getGraphAttributeAction_0()); 
            // InternalTyphonML.g:2585:2: ()
            // InternalTyphonML.g:2585:3: 
            {
            }

             after(grammarAccess.getGraphAttributeAccess().getGraphAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__0__Impl"


    // $ANTLR start "rule__GraphAttribute__Group__1"
    // InternalTyphonML.g:2593:1: rule__GraphAttribute__Group__1 : rule__GraphAttribute__Group__1__Impl rule__GraphAttribute__Group__2 ;
    public final void rule__GraphAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2597:1: ( rule__GraphAttribute__Group__1__Impl rule__GraphAttribute__Group__2 )
            // InternalTyphonML.g:2598:2: rule__GraphAttribute__Group__1__Impl rule__GraphAttribute__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__GraphAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__1"


    // $ANTLR start "rule__GraphAttribute__Group__1__Impl"
    // InternalTyphonML.g:2605:1: rule__GraphAttribute__Group__1__Impl : ( ( rule__GraphAttribute__NameAssignment_1 ) ) ;
    public final void rule__GraphAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2609:1: ( ( ( rule__GraphAttribute__NameAssignment_1 ) ) )
            // InternalTyphonML.g:2610:1: ( ( rule__GraphAttribute__NameAssignment_1 ) )
            {
            // InternalTyphonML.g:2610:1: ( ( rule__GraphAttribute__NameAssignment_1 ) )
            // InternalTyphonML.g:2611:2: ( rule__GraphAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAttributeAccess().getNameAssignment_1()); 
            // InternalTyphonML.g:2612:2: ( rule__GraphAttribute__NameAssignment_1 )
            // InternalTyphonML.g:2612:3: rule__GraphAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__1__Impl"


    // $ANTLR start "rule__GraphAttribute__Group__2"
    // InternalTyphonML.g:2620:1: rule__GraphAttribute__Group__2 : rule__GraphAttribute__Group__2__Impl rule__GraphAttribute__Group__3 ;
    public final void rule__GraphAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2624:1: ( rule__GraphAttribute__Group__2__Impl rule__GraphAttribute__Group__3 )
            // InternalTyphonML.g:2625:2: rule__GraphAttribute__Group__2__Impl rule__GraphAttribute__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__GraphAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__2"


    // $ANTLR start "rule__GraphAttribute__Group__2__Impl"
    // InternalTyphonML.g:2632:1: rule__GraphAttribute__Group__2__Impl : ( '=' ) ;
    public final void rule__GraphAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2636:1: ( ( '=' ) )
            // InternalTyphonML.g:2637:1: ( '=' )
            {
            // InternalTyphonML.g:2637:1: ( '=' )
            // InternalTyphonML.g:2638:2: '='
            {
             before(grammarAccess.getGraphAttributeAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGraphAttributeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__2__Impl"


    // $ANTLR start "rule__GraphAttribute__Group__3"
    // InternalTyphonML.g:2647:1: rule__GraphAttribute__Group__3 : rule__GraphAttribute__Group__3__Impl ;
    public final void rule__GraphAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2651:1: ( rule__GraphAttribute__Group__3__Impl )
            // InternalTyphonML.g:2652:2: rule__GraphAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphAttribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__3"


    // $ANTLR start "rule__GraphAttribute__Group__3__Impl"
    // InternalTyphonML.g:2658:1: rule__GraphAttribute__Group__3__Impl : ( ( rule__GraphAttribute__ValueAssignment_3 ) ) ;
    public final void rule__GraphAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2662:1: ( ( ( rule__GraphAttribute__ValueAssignment_3 ) ) )
            // InternalTyphonML.g:2663:1: ( ( rule__GraphAttribute__ValueAssignment_3 ) )
            {
            // InternalTyphonML.g:2663:1: ( ( rule__GraphAttribute__ValueAssignment_3 ) )
            // InternalTyphonML.g:2664:2: ( rule__GraphAttribute__ValueAssignment_3 )
            {
             before(grammarAccess.getGraphAttributeAccess().getValueAssignment_3()); 
            // InternalTyphonML.g:2665:2: ( rule__GraphAttribute__ValueAssignment_3 )
            // InternalTyphonML.g:2665:3: rule__GraphAttribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphAttribute__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphAttributeAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__Group__3__Impl"


    // $ANTLR start "rule__Edge__Group__0"
    // InternalTyphonML.g:2674:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2678:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // InternalTyphonML.g:2679:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Edge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__0"


    // $ANTLR start "rule__Edge__Group__0__Impl"
    // InternalTyphonML.g:2686:1: rule__Edge__Group__0__Impl : ( () ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2690:1: ( ( () ) )
            // InternalTyphonML.g:2691:1: ( () )
            {
            // InternalTyphonML.g:2691:1: ( () )
            // InternalTyphonML.g:2692:2: ()
            {
             before(grammarAccess.getEdgeAccess().getGraphEdgeAction_0()); 
            // InternalTyphonML.g:2693:2: ()
            // InternalTyphonML.g:2693:3: 
            {
            }

             after(grammarAccess.getEdgeAccess().getGraphEdgeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__0__Impl"


    // $ANTLR start "rule__Edge__Group__1"
    // InternalTyphonML.g:2701:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2705:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // InternalTyphonML.g:2706:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Edge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__1"


    // $ANTLR start "rule__Edge__Group__1__Impl"
    // InternalTyphonML.g:2713:1: rule__Edge__Group__1__Impl : ( 'edge' ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2717:1: ( ( 'edge' ) )
            // InternalTyphonML.g:2718:1: ( 'edge' )
            {
            // InternalTyphonML.g:2718:1: ( 'edge' )
            // InternalTyphonML.g:2719:2: 'edge'
            {
             before(grammarAccess.getEdgeAccess().getEdgeKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getEdgeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__2"
    // InternalTyphonML.g:2728:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl rule__Edge__Group__3 ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2732:1: ( rule__Edge__Group__2__Impl rule__Edge__Group__3 )
            // InternalTyphonML.g:2733:2: rule__Edge__Group__2__Impl rule__Edge__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Edge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__2"


    // $ANTLR start "rule__Edge__Group__2__Impl"
    // InternalTyphonML.g:2740:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__NameAssignment_2 ) ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2744:1: ( ( ( rule__Edge__NameAssignment_2 ) ) )
            // InternalTyphonML.g:2745:1: ( ( rule__Edge__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:2745:1: ( ( rule__Edge__NameAssignment_2 ) )
            // InternalTyphonML.g:2746:2: ( rule__Edge__NameAssignment_2 )
            {
             before(grammarAccess.getEdgeAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:2747:2: ( rule__Edge__NameAssignment_2 )
            // InternalTyphonML.g:2747:3: rule__Edge__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Edge__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__2__Impl"


    // $ANTLR start "rule__Edge__Group__3"
    // InternalTyphonML.g:2755:1: rule__Edge__Group__3 : rule__Edge__Group__3__Impl rule__Edge__Group__4 ;
    public final void rule__Edge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2759:1: ( rule__Edge__Group__3__Impl rule__Edge__Group__4 )
            // InternalTyphonML.g:2760:2: rule__Edge__Group__3__Impl rule__Edge__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Edge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__3"


    // $ANTLR start "rule__Edge__Group__3__Impl"
    // InternalTyphonML.g:2767:1: rule__Edge__Group__3__Impl : ( '{' ) ;
    public final void rule__Edge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2771:1: ( ( '{' ) )
            // InternalTyphonML.g:2772:1: ( '{' )
            {
            // InternalTyphonML.g:2772:1: ( '{' )
            // InternalTyphonML.g:2773:2: '{'
            {
             before(grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__3__Impl"


    // $ANTLR start "rule__Edge__Group__4"
    // InternalTyphonML.g:2782:1: rule__Edge__Group__4 : rule__Edge__Group__4__Impl rule__Edge__Group__5 ;
    public final void rule__Edge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2786:1: ( rule__Edge__Group__4__Impl rule__Edge__Group__5 )
            // InternalTyphonML.g:2787:2: rule__Edge__Group__4__Impl rule__Edge__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Edge__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__4"


    // $ANTLR start "rule__Edge__Group__4__Impl"
    // InternalTyphonML.g:2794:1: rule__Edge__Group__4__Impl : ( 'from' ) ;
    public final void rule__Edge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2798:1: ( ( 'from' ) )
            // InternalTyphonML.g:2799:1: ( 'from' )
            {
            // InternalTyphonML.g:2799:1: ( 'from' )
            // InternalTyphonML.g:2800:2: 'from'
            {
             before(grammarAccess.getEdgeAccess().getFromKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__4__Impl"


    // $ANTLR start "rule__Edge__Group__5"
    // InternalTyphonML.g:2809:1: rule__Edge__Group__5 : rule__Edge__Group__5__Impl rule__Edge__Group__6 ;
    public final void rule__Edge__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2813:1: ( rule__Edge__Group__5__Impl rule__Edge__Group__6 )
            // InternalTyphonML.g:2814:2: rule__Edge__Group__5__Impl rule__Edge__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Edge__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__5"


    // $ANTLR start "rule__Edge__Group__5__Impl"
    // InternalTyphonML.g:2821:1: rule__Edge__Group__5__Impl : ( ( rule__Edge__FromAssignment_5 ) ) ;
    public final void rule__Edge__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2825:1: ( ( ( rule__Edge__FromAssignment_5 ) ) )
            // InternalTyphonML.g:2826:1: ( ( rule__Edge__FromAssignment_5 ) )
            {
            // InternalTyphonML.g:2826:1: ( ( rule__Edge__FromAssignment_5 ) )
            // InternalTyphonML.g:2827:2: ( rule__Edge__FromAssignment_5 )
            {
             before(grammarAccess.getEdgeAccess().getFromAssignment_5()); 
            // InternalTyphonML.g:2828:2: ( rule__Edge__FromAssignment_5 )
            // InternalTyphonML.g:2828:3: rule__Edge__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Edge__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__5__Impl"


    // $ANTLR start "rule__Edge__Group__6"
    // InternalTyphonML.g:2836:1: rule__Edge__Group__6 : rule__Edge__Group__6__Impl rule__Edge__Group__7 ;
    public final void rule__Edge__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2840:1: ( rule__Edge__Group__6__Impl rule__Edge__Group__7 )
            // InternalTyphonML.g:2841:2: rule__Edge__Group__6__Impl rule__Edge__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Edge__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__6"


    // $ANTLR start "rule__Edge__Group__6__Impl"
    // InternalTyphonML.g:2848:1: rule__Edge__Group__6__Impl : ( 'to' ) ;
    public final void rule__Edge__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2852:1: ( ( 'to' ) )
            // InternalTyphonML.g:2853:1: ( 'to' )
            {
            // InternalTyphonML.g:2853:1: ( 'to' )
            // InternalTyphonML.g:2854:2: 'to'
            {
             before(grammarAccess.getEdgeAccess().getToKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__6__Impl"


    // $ANTLR start "rule__Edge__Group__7"
    // InternalTyphonML.g:2863:1: rule__Edge__Group__7 : rule__Edge__Group__7__Impl rule__Edge__Group__8 ;
    public final void rule__Edge__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2867:1: ( rule__Edge__Group__7__Impl rule__Edge__Group__8 )
            // InternalTyphonML.g:2868:2: rule__Edge__Group__7__Impl rule__Edge__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Edge__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__7"


    // $ANTLR start "rule__Edge__Group__7__Impl"
    // InternalTyphonML.g:2875:1: rule__Edge__Group__7__Impl : ( ( rule__Edge__ToAssignment_7 ) ) ;
    public final void rule__Edge__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2879:1: ( ( ( rule__Edge__ToAssignment_7 ) ) )
            // InternalTyphonML.g:2880:1: ( ( rule__Edge__ToAssignment_7 ) )
            {
            // InternalTyphonML.g:2880:1: ( ( rule__Edge__ToAssignment_7 ) )
            // InternalTyphonML.g:2881:2: ( rule__Edge__ToAssignment_7 )
            {
             before(grammarAccess.getEdgeAccess().getToAssignment_7()); 
            // InternalTyphonML.g:2882:2: ( rule__Edge__ToAssignment_7 )
            // InternalTyphonML.g:2882:3: rule__Edge__ToAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Edge__ToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getToAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__7__Impl"


    // $ANTLR start "rule__Edge__Group__8"
    // InternalTyphonML.g:2890:1: rule__Edge__Group__8 : rule__Edge__Group__8__Impl rule__Edge__Group__9 ;
    public final void rule__Edge__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2894:1: ( rule__Edge__Group__8__Impl rule__Edge__Group__9 )
            // InternalTyphonML.g:2895:2: rule__Edge__Group__8__Impl rule__Edge__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Edge__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__8"


    // $ANTLR start "rule__Edge__Group__8__Impl"
    // InternalTyphonML.g:2902:1: rule__Edge__Group__8__Impl : ( 'label' ) ;
    public final void rule__Edge__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2906:1: ( ( 'label' ) )
            // InternalTyphonML.g:2907:1: ( 'label' )
            {
            // InternalTyphonML.g:2907:1: ( 'label' )
            // InternalTyphonML.g:2908:2: 'label'
            {
             before(grammarAccess.getEdgeAccess().getLabelKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getLabelKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__8__Impl"


    // $ANTLR start "rule__Edge__Group__9"
    // InternalTyphonML.g:2917:1: rule__Edge__Group__9 : rule__Edge__Group__9__Impl rule__Edge__Group__10 ;
    public final void rule__Edge__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2921:1: ( rule__Edge__Group__9__Impl rule__Edge__Group__10 )
            // InternalTyphonML.g:2922:2: rule__Edge__Group__9__Impl rule__Edge__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Edge__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__9"


    // $ANTLR start "rule__Edge__Group__9__Impl"
    // InternalTyphonML.g:2929:1: rule__Edge__Group__9__Impl : ( '{' ) ;
    public final void rule__Edge__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2933:1: ( ( '{' ) )
            // InternalTyphonML.g:2934:1: ( '{' )
            {
            // InternalTyphonML.g:2934:1: ( '{' )
            // InternalTyphonML.g:2935:2: '{'
            {
             before(grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__9__Impl"


    // $ANTLR start "rule__Edge__Group__10"
    // InternalTyphonML.g:2944:1: rule__Edge__Group__10 : rule__Edge__Group__10__Impl rule__Edge__Group__11 ;
    public final void rule__Edge__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2948:1: ( rule__Edge__Group__10__Impl rule__Edge__Group__11 )
            // InternalTyphonML.g:2949:2: rule__Edge__Group__10__Impl rule__Edge__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Edge__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__10"


    // $ANTLR start "rule__Edge__Group__10__Impl"
    // InternalTyphonML.g:2956:1: rule__Edge__Group__10__Impl : ( ( rule__Edge__LabelsAssignment_10 )* ) ;
    public final void rule__Edge__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2960:1: ( ( ( rule__Edge__LabelsAssignment_10 )* ) )
            // InternalTyphonML.g:2961:1: ( ( rule__Edge__LabelsAssignment_10 )* )
            {
            // InternalTyphonML.g:2961:1: ( ( rule__Edge__LabelsAssignment_10 )* )
            // InternalTyphonML.g:2962:2: ( rule__Edge__LabelsAssignment_10 )*
            {
             before(grammarAccess.getEdgeAccess().getLabelsAssignment_10()); 
            // InternalTyphonML.g:2963:2: ( rule__Edge__LabelsAssignment_10 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTyphonML.g:2963:3: rule__Edge__LabelsAssignment_10
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Edge__LabelsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getLabelsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__10__Impl"


    // $ANTLR start "rule__Edge__Group__11"
    // InternalTyphonML.g:2971:1: rule__Edge__Group__11 : rule__Edge__Group__11__Impl rule__Edge__Group__12 ;
    public final void rule__Edge__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2975:1: ( rule__Edge__Group__11__Impl rule__Edge__Group__12 )
            // InternalTyphonML.g:2976:2: rule__Edge__Group__11__Impl rule__Edge__Group__12
            {
            pushFollow(FOLLOW_37);
            rule__Edge__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Edge__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__11"


    // $ANTLR start "rule__Edge__Group__11__Impl"
    // InternalTyphonML.g:2983:1: rule__Edge__Group__11__Impl : ( '}' ) ;
    public final void rule__Edge__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:2987:1: ( ( '}' ) )
            // InternalTyphonML.g:2988:1: ( '}' )
            {
            // InternalTyphonML.g:2988:1: ( '}' )
            // InternalTyphonML.g:2989:2: '}'
            {
             before(grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__11__Impl"


    // $ANTLR start "rule__Edge__Group__12"
    // InternalTyphonML.g:2998:1: rule__Edge__Group__12 : rule__Edge__Group__12__Impl ;
    public final void rule__Edge__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3002:1: ( rule__Edge__Group__12__Impl )
            // InternalTyphonML.g:3003:2: rule__Edge__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Edge__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__12"


    // $ANTLR start "rule__Edge__Group__12__Impl"
    // InternalTyphonML.g:3009:1: rule__Edge__Group__12__Impl : ( '}' ) ;
    public final void rule__Edge__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3013:1: ( ( '}' ) )
            // InternalTyphonML.g:3014:1: ( '}' )
            {
            // InternalTyphonML.g:3014:1: ( '}' )
            // InternalTyphonML.g:3015:2: '}'
            {
             before(grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__12__Impl"


    // $ANTLR start "rule__GraphEdgeLabel__Group__0"
    // InternalTyphonML.g:3025:1: rule__GraphEdgeLabel__Group__0 : rule__GraphEdgeLabel__Group__0__Impl rule__GraphEdgeLabel__Group__1 ;
    public final void rule__GraphEdgeLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3029:1: ( rule__GraphEdgeLabel__Group__0__Impl rule__GraphEdgeLabel__Group__1 )
            // InternalTyphonML.g:3030:2: rule__GraphEdgeLabel__Group__0__Impl rule__GraphEdgeLabel__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__GraphEdgeLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphEdgeLabel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__0"


    // $ANTLR start "rule__GraphEdgeLabel__Group__0__Impl"
    // InternalTyphonML.g:3037:1: rule__GraphEdgeLabel__Group__0__Impl : ( () ) ;
    public final void rule__GraphEdgeLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3041:1: ( ( () ) )
            // InternalTyphonML.g:3042:1: ( () )
            {
            // InternalTyphonML.g:3042:1: ( () )
            // InternalTyphonML.g:3043:2: ()
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0()); 
            // InternalTyphonML.g:3044:2: ()
            // InternalTyphonML.g:3044:3: 
            {
            }

             after(grammarAccess.getGraphEdgeLabelAccess().getGraphEdgeLabelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__0__Impl"


    // $ANTLR start "rule__GraphEdgeLabel__Group__1"
    // InternalTyphonML.g:3052:1: rule__GraphEdgeLabel__Group__1 : rule__GraphEdgeLabel__Group__1__Impl rule__GraphEdgeLabel__Group__2 ;
    public final void rule__GraphEdgeLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3056:1: ( rule__GraphEdgeLabel__Group__1__Impl rule__GraphEdgeLabel__Group__2 )
            // InternalTyphonML.g:3057:2: rule__GraphEdgeLabel__Group__1__Impl rule__GraphEdgeLabel__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__GraphEdgeLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphEdgeLabel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__1"


    // $ANTLR start "rule__GraphEdgeLabel__Group__1__Impl"
    // InternalTyphonML.g:3064:1: rule__GraphEdgeLabel__Group__1__Impl : ( ( rule__GraphEdgeLabel__NameAssignment_1 ) ) ;
    public final void rule__GraphEdgeLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3068:1: ( ( ( rule__GraphEdgeLabel__NameAssignment_1 ) ) )
            // InternalTyphonML.g:3069:1: ( ( rule__GraphEdgeLabel__NameAssignment_1 ) )
            {
            // InternalTyphonML.g:3069:1: ( ( rule__GraphEdgeLabel__NameAssignment_1 ) )
            // InternalTyphonML.g:3070:2: ( rule__GraphEdgeLabel__NameAssignment_1 )
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getNameAssignment_1()); 
            // InternalTyphonML.g:3071:2: ( rule__GraphEdgeLabel__NameAssignment_1 )
            // InternalTyphonML.g:3071:3: rule__GraphEdgeLabel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphEdgeLabel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphEdgeLabelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__1__Impl"


    // $ANTLR start "rule__GraphEdgeLabel__Group__2"
    // InternalTyphonML.g:3079:1: rule__GraphEdgeLabel__Group__2 : rule__GraphEdgeLabel__Group__2__Impl rule__GraphEdgeLabel__Group__3 ;
    public final void rule__GraphEdgeLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3083:1: ( rule__GraphEdgeLabel__Group__2__Impl rule__GraphEdgeLabel__Group__3 )
            // InternalTyphonML.g:3084:2: rule__GraphEdgeLabel__Group__2__Impl rule__GraphEdgeLabel__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__GraphEdgeLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphEdgeLabel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__2"


    // $ANTLR start "rule__GraphEdgeLabel__Group__2__Impl"
    // InternalTyphonML.g:3091:1: rule__GraphEdgeLabel__Group__2__Impl : ( ':' ) ;
    public final void rule__GraphEdgeLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3095:1: ( ( ':' ) )
            // InternalTyphonML.g:3096:1: ( ':' )
            {
            // InternalTyphonML.g:3096:1: ( ':' )
            // InternalTyphonML.g:3097:2: ':'
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGraphEdgeLabelAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__2__Impl"


    // $ANTLR start "rule__GraphEdgeLabel__Group__3"
    // InternalTyphonML.g:3106:1: rule__GraphEdgeLabel__Group__3 : rule__GraphEdgeLabel__Group__3__Impl ;
    public final void rule__GraphEdgeLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3110:1: ( rule__GraphEdgeLabel__Group__3__Impl )
            // InternalTyphonML.g:3111:2: rule__GraphEdgeLabel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphEdgeLabel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__3"


    // $ANTLR start "rule__GraphEdgeLabel__Group__3__Impl"
    // InternalTyphonML.g:3117:1: rule__GraphEdgeLabel__Group__3__Impl : ( ( rule__GraphEdgeLabel__TypeAssignment_3 )? ) ;
    public final void rule__GraphEdgeLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3121:1: ( ( ( rule__GraphEdgeLabel__TypeAssignment_3 )? ) )
            // InternalTyphonML.g:3122:1: ( ( rule__GraphEdgeLabel__TypeAssignment_3 )? )
            {
            // InternalTyphonML.g:3122:1: ( ( rule__GraphEdgeLabel__TypeAssignment_3 )? )
            // InternalTyphonML.g:3123:2: ( rule__GraphEdgeLabel__TypeAssignment_3 )?
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getTypeAssignment_3()); 
            // InternalTyphonML.g:3124:2: ( rule__GraphEdgeLabel__TypeAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=RULE_STRING && LA19_1<=RULE_ID)||LA19_1==17) ) {
                    alt19=1;
                }
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==EOF||(LA19_2>=RULE_STRING && LA19_2<=RULE_ID)||LA19_2==17) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalTyphonML.g:3124:3: rule__GraphEdgeLabel__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphEdgeLabel__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphEdgeLabelAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveDataType__Group__0"
    // InternalTyphonML.g:3133:1: rule__PrimitiveDataType__Group__0 : rule__PrimitiveDataType__Group__0__Impl rule__PrimitiveDataType__Group__1 ;
    public final void rule__PrimitiveDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3137:1: ( rule__PrimitiveDataType__Group__0__Impl rule__PrimitiveDataType__Group__1 )
            // InternalTyphonML.g:3138:2: rule__PrimitiveDataType__Group__0__Impl rule__PrimitiveDataType__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__PrimitiveDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Group__0"


    // $ANTLR start "rule__PrimitiveDataType__Group__0__Impl"
    // InternalTyphonML.g:3145:1: rule__PrimitiveDataType__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3149:1: ( ( () ) )
            // InternalTyphonML.g:3150:1: ( () )
            {
            // InternalTyphonML.g:3150:1: ( () )
            // InternalTyphonML.g:3151:2: ()
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeAction_0()); 
            // InternalTyphonML.g:3152:2: ()
            // InternalTyphonML.g:3152:3: 
            {
            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveDataType__Group__1"
    // InternalTyphonML.g:3160:1: rule__PrimitiveDataType__Group__1 : rule__PrimitiveDataType__Group__1__Impl rule__PrimitiveDataType__Group__2 ;
    public final void rule__PrimitiveDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3164:1: ( rule__PrimitiveDataType__Group__1__Impl rule__PrimitiveDataType__Group__2 )
            // InternalTyphonML.g:3165:2: rule__PrimitiveDataType__Group__1__Impl rule__PrimitiveDataType__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__PrimitiveDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Group__1"


    // $ANTLR start "rule__PrimitiveDataType__Group__1__Impl"
    // InternalTyphonML.g:3172:1: rule__PrimitiveDataType__Group__1__Impl : ( 'datatype' ) ;
    public final void rule__PrimitiveDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3176:1: ( ( 'datatype' ) )
            // InternalTyphonML.g:3177:1: ( 'datatype' )
            {
            // InternalTyphonML.g:3177:1: ( 'datatype' )
            // InternalTyphonML.g:3178:2: 'datatype'
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getDatatypeKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimitiveDataTypeAccess().getDatatypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveDataType__Group__2"
    // InternalTyphonML.g:3187:1: rule__PrimitiveDataType__Group__2 : rule__PrimitiveDataType__Group__2__Impl ;
    public final void rule__PrimitiveDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3191:1: ( rule__PrimitiveDataType__Group__2__Impl )
            // InternalTyphonML.g:3192:2: rule__PrimitiveDataType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveDataType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Group__2"


    // $ANTLR start "rule__PrimitiveDataType__Group__2__Impl"
    // InternalTyphonML.g:3198:1: rule__PrimitiveDataType__Group__2__Impl : ( ( rule__PrimitiveDataType__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3202:1: ( ( ( rule__PrimitiveDataType__NameAssignment_2 ) ) )
            // InternalTyphonML.g:3203:1: ( ( rule__PrimitiveDataType__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:3203:1: ( ( rule__PrimitiveDataType__NameAssignment_2 ) )
            // InternalTyphonML.g:3204:2: ( rule__PrimitiveDataType__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:3205:2: ( rule__PrimitiveDataType__NameAssignment_2 )
            // InternalTyphonML.g:3205:3: rule__PrimitiveDataType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveDataType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveDataTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__Group__2__Impl"


    // $ANTLR start "rule__CustomDataType__Group__0"
    // InternalTyphonML.g:3214:1: rule__CustomDataType__Group__0 : rule__CustomDataType__Group__0__Impl rule__CustomDataType__Group__1 ;
    public final void rule__CustomDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3218:1: ( rule__CustomDataType__Group__0__Impl rule__CustomDataType__Group__1 )
            // InternalTyphonML.g:3219:2: rule__CustomDataType__Group__0__Impl rule__CustomDataType__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__CustomDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__0"


    // $ANTLR start "rule__CustomDataType__Group__0__Impl"
    // InternalTyphonML.g:3226:1: rule__CustomDataType__Group__0__Impl : ( () ) ;
    public final void rule__CustomDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3230:1: ( ( () ) )
            // InternalTyphonML.g:3231:1: ( () )
            {
            // InternalTyphonML.g:3231:1: ( () )
            // InternalTyphonML.g:3232:2: ()
            {
             before(grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0()); 
            // InternalTyphonML.g:3233:2: ()
            // InternalTyphonML.g:3233:3: 
            {
            }

             after(grammarAccess.getCustomDataTypeAccess().getCustomDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__0__Impl"


    // $ANTLR start "rule__CustomDataType__Group__1"
    // InternalTyphonML.g:3241:1: rule__CustomDataType__Group__1 : rule__CustomDataType__Group__1__Impl rule__CustomDataType__Group__2 ;
    public final void rule__CustomDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3245:1: ( rule__CustomDataType__Group__1__Impl rule__CustomDataType__Group__2 )
            // InternalTyphonML.g:3246:2: rule__CustomDataType__Group__1__Impl rule__CustomDataType__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__CustomDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__1"


    // $ANTLR start "rule__CustomDataType__Group__1__Impl"
    // InternalTyphonML.g:3253:1: rule__CustomDataType__Group__1__Impl : ( 'custom-datatype' ) ;
    public final void rule__CustomDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3257:1: ( ( 'custom-datatype' ) )
            // InternalTyphonML.g:3258:1: ( 'custom-datatype' )
            {
            // InternalTyphonML.g:3258:1: ( 'custom-datatype' )
            // InternalTyphonML.g:3259:2: 'custom-datatype'
            {
             before(grammarAccess.getCustomDataTypeAccess().getCustomDatatypeKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomDataTypeAccess().getCustomDatatypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__1__Impl"


    // $ANTLR start "rule__CustomDataType__Group__2"
    // InternalTyphonML.g:3268:1: rule__CustomDataType__Group__2 : rule__CustomDataType__Group__2__Impl rule__CustomDataType__Group__3 ;
    public final void rule__CustomDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3272:1: ( rule__CustomDataType__Group__2__Impl rule__CustomDataType__Group__3 )
            // InternalTyphonML.g:3273:2: rule__CustomDataType__Group__2__Impl rule__CustomDataType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CustomDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__2"


    // $ANTLR start "rule__CustomDataType__Group__2__Impl"
    // InternalTyphonML.g:3280:1: rule__CustomDataType__Group__2__Impl : ( ( rule__CustomDataType__NameAssignment_2 ) ) ;
    public final void rule__CustomDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3284:1: ( ( ( rule__CustomDataType__NameAssignment_2 ) ) )
            // InternalTyphonML.g:3285:1: ( ( rule__CustomDataType__NameAssignment_2 ) )
            {
            // InternalTyphonML.g:3285:1: ( ( rule__CustomDataType__NameAssignment_2 ) )
            // InternalTyphonML.g:3286:2: ( rule__CustomDataType__NameAssignment_2 )
            {
             before(grammarAccess.getCustomDataTypeAccess().getNameAssignment_2()); 
            // InternalTyphonML.g:3287:2: ( rule__CustomDataType__NameAssignment_2 )
            // InternalTyphonML.g:3287:3: rule__CustomDataType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomDataType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomDataTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__2__Impl"


    // $ANTLR start "rule__CustomDataType__Group__3"
    // InternalTyphonML.g:3295:1: rule__CustomDataType__Group__3 : rule__CustomDataType__Group__3__Impl rule__CustomDataType__Group__4 ;
    public final void rule__CustomDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3299:1: ( rule__CustomDataType__Group__3__Impl rule__CustomDataType__Group__4 )
            // InternalTyphonML.g:3300:2: rule__CustomDataType__Group__3__Impl rule__CustomDataType__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__CustomDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__3"


    // $ANTLR start "rule__CustomDataType__Group__3__Impl"
    // InternalTyphonML.g:3307:1: rule__CustomDataType__Group__3__Impl : ( '{' ) ;
    public final void rule__CustomDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3311:1: ( ( '{' ) )
            // InternalTyphonML.g:3312:1: ( '{' )
            {
            // InternalTyphonML.g:3312:1: ( '{' )
            // InternalTyphonML.g:3313:2: '{'
            {
             before(grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomDataTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__3__Impl"


    // $ANTLR start "rule__CustomDataType__Group__4"
    // InternalTyphonML.g:3322:1: rule__CustomDataType__Group__4 : rule__CustomDataType__Group__4__Impl rule__CustomDataType__Group__5 ;
    public final void rule__CustomDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3326:1: ( rule__CustomDataType__Group__4__Impl rule__CustomDataType__Group__5 )
            // InternalTyphonML.g:3327:2: rule__CustomDataType__Group__4__Impl rule__CustomDataType__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CustomDataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__4"


    // $ANTLR start "rule__CustomDataType__Group__4__Impl"
    // InternalTyphonML.g:3334:1: rule__CustomDataType__Group__4__Impl : ( ( rule__CustomDataType__ElementsAssignment_4 )* ) ;
    public final void rule__CustomDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3338:1: ( ( ( rule__CustomDataType__ElementsAssignment_4 )* ) )
            // InternalTyphonML.g:3339:1: ( ( rule__CustomDataType__ElementsAssignment_4 )* )
            {
            // InternalTyphonML.g:3339:1: ( ( rule__CustomDataType__ElementsAssignment_4 )* )
            // InternalTyphonML.g:3340:2: ( rule__CustomDataType__ElementsAssignment_4 )*
            {
             before(grammarAccess.getCustomDataTypeAccess().getElementsAssignment_4()); 
            // InternalTyphonML.g:3341:2: ( rule__CustomDataType__ElementsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTyphonML.g:3341:3: rule__CustomDataType__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__CustomDataType__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCustomDataTypeAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__4__Impl"


    // $ANTLR start "rule__CustomDataType__Group__5"
    // InternalTyphonML.g:3349:1: rule__CustomDataType__Group__5 : rule__CustomDataType__Group__5__Impl ;
    public final void rule__CustomDataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3353:1: ( rule__CustomDataType__Group__5__Impl )
            // InternalTyphonML.g:3354:2: rule__CustomDataType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomDataType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__5"


    // $ANTLR start "rule__CustomDataType__Group__5__Impl"
    // InternalTyphonML.g:3360:1: rule__CustomDataType__Group__5__Impl : ( '}' ) ;
    public final void rule__CustomDataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3364:1: ( ( '}' ) )
            // InternalTyphonML.g:3365:1: ( '}' )
            {
            // InternalTyphonML.g:3365:1: ( '}' )
            // InternalTyphonML.g:3366:2: '}'
            {
             before(grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCustomDataTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalTyphonML.g:3376:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3380:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalTyphonML.g:3381:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalTyphonML.g:3388:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3392:1: ( ( 'entity' ) )
            // InternalTyphonML.g:3393:1: ( 'entity' )
            {
            // InternalTyphonML.g:3393:1: ( 'entity' )
            // InternalTyphonML.g:3394:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalTyphonML.g:3403:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3407:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalTyphonML.g:3408:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalTyphonML.g:3415:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3419:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalTyphonML.g:3420:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalTyphonML.g:3420:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalTyphonML.g:3421:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalTyphonML.g:3422:2: ( rule__Entity__NameAssignment_1 )
            // InternalTyphonML.g:3422:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalTyphonML.g:3430:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3434:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalTyphonML.g:3435:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalTyphonML.g:3442:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3446:1: ( ( '{' ) )
            // InternalTyphonML.g:3447:1: ( '{' )
            {
            // InternalTyphonML.g:3447:1: ( '{' )
            // InternalTyphonML.g:3448:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalTyphonML.g:3457:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3461:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalTyphonML.g:3462:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalTyphonML.g:3469:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3473:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalTyphonML.g:3474:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalTyphonML.g:3474:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalTyphonML.g:3475:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalTyphonML.g:3476:2: ( rule__Entity__AttributesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==20) ) {
                        int LA21_4 = input.LA(3);

                        if ( ((LA21_4>=RULE_STRING && LA21_4<=RULE_ID)||LA21_4==17) ) {
                            alt21=1;
                        }


                    }


                }
                else if ( (LA21_0==RULE_ID) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==20) ) {
                        int LA21_4 = input.LA(3);

                        if ( ((LA21_4>=RULE_STRING && LA21_4<=RULE_ID)||LA21_4==17) ) {
                            alt21=1;
                        }


                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalTyphonML.g:3476:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalTyphonML.g:3484:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3488:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalTyphonML.g:3489:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalTyphonML.g:3496:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__RelationsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3500:1: ( ( ( rule__Entity__RelationsAssignment_4 )* ) )
            // InternalTyphonML.g:3501:1: ( ( rule__Entity__RelationsAssignment_4 )* )
            {
            // InternalTyphonML.g:3501:1: ( ( rule__Entity__RelationsAssignment_4 )* )
            // InternalTyphonML.g:3502:2: ( rule__Entity__RelationsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getRelationsAssignment_4()); 
            // InternalTyphonML.g:3503:2: ( rule__Entity__RelationsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTyphonML.g:3503:3: rule__Entity__RelationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Entity__RelationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getRelationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalTyphonML.g:3511:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3515:1: ( rule__Entity__Group__5__Impl )
            // InternalTyphonML.g:3516:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalTyphonML.g:3522:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3526:1: ( ( '}' ) )
            // InternalTyphonML.g:3527:1: ( '}' )
            {
            // InternalTyphonML.g:3527:1: ( '}' )
            // InternalTyphonML.g:3528:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalTyphonML.g:3538:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3542:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalTyphonML.g:3543:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalTyphonML.g:3550:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3554:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalTyphonML.g:3555:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalTyphonML.g:3555:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalTyphonML.g:3556:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalTyphonML.g:3557:2: ( rule__Attribute__NameAssignment_0 )
            // InternalTyphonML.g:3557:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalTyphonML.g:3565:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3569:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalTyphonML.g:3570:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalTyphonML.g:3577:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3581:1: ( ( ':' ) )
            // InternalTyphonML.g:3582:1: ( ':' )
            {
            // InternalTyphonML.g:3582:1: ( ':' )
            // InternalTyphonML.g:3583:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalTyphonML.g:3592:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3596:1: ( rule__Attribute__Group__2__Impl )
            // InternalTyphonML.g:3597:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalTyphonML.g:3603:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3607:1: ( ( ( rule__Attribute__TypeAssignment_2 )? ) )
            // InternalTyphonML.g:3608:1: ( ( rule__Attribute__TypeAssignment_2 )? )
            {
            // InternalTyphonML.g:3608:1: ( ( rule__Attribute__TypeAssignment_2 )? )
            // InternalTyphonML.g:3609:2: ( rule__Attribute__TypeAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalTyphonML.g:3610:2: ( rule__Attribute__TypeAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||(LA23_1>=RULE_STRING && LA23_1<=RULE_ID)||LA23_1==17) ) {
                    alt23=1;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==EOF||(LA23_2>=RULE_STRING && LA23_2<=RULE_ID)||LA23_2==17) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalTyphonML.g:3610:3: rule__Attribute__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__DataTypeItem__Group__0"
    // InternalTyphonML.g:3619:1: rule__DataTypeItem__Group__0 : rule__DataTypeItem__Group__0__Impl rule__DataTypeItem__Group__1 ;
    public final void rule__DataTypeItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3623:1: ( rule__DataTypeItem__Group__0__Impl rule__DataTypeItem__Group__1 )
            // InternalTyphonML.g:3624:2: rule__DataTypeItem__Group__0__Impl rule__DataTypeItem__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__DataTypeItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__0"


    // $ANTLR start "rule__DataTypeItem__Group__0__Impl"
    // InternalTyphonML.g:3631:1: rule__DataTypeItem__Group__0__Impl : ( () ) ;
    public final void rule__DataTypeItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3635:1: ( ( () ) )
            // InternalTyphonML.g:3636:1: ( () )
            {
            // InternalTyphonML.g:3636:1: ( () )
            // InternalTyphonML.g:3637:2: ()
            {
             before(grammarAccess.getDataTypeItemAccess().getDataTypeItemAction_0()); 
            // InternalTyphonML.g:3638:2: ()
            // InternalTyphonML.g:3638:3: 
            {
            }

             after(grammarAccess.getDataTypeItemAccess().getDataTypeItemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__0__Impl"


    // $ANTLR start "rule__DataTypeItem__Group__1"
    // InternalTyphonML.g:3646:1: rule__DataTypeItem__Group__1 : rule__DataTypeItem__Group__1__Impl rule__DataTypeItem__Group__2 ;
    public final void rule__DataTypeItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3650:1: ( rule__DataTypeItem__Group__1__Impl rule__DataTypeItem__Group__2 )
            // InternalTyphonML.g:3651:2: rule__DataTypeItem__Group__1__Impl rule__DataTypeItem__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DataTypeItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__1"


    // $ANTLR start "rule__DataTypeItem__Group__1__Impl"
    // InternalTyphonML.g:3658:1: rule__DataTypeItem__Group__1__Impl : ( ( rule__DataTypeItem__NameAssignment_1 ) ) ;
    public final void rule__DataTypeItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3662:1: ( ( ( rule__DataTypeItem__NameAssignment_1 ) ) )
            // InternalTyphonML.g:3663:1: ( ( rule__DataTypeItem__NameAssignment_1 ) )
            {
            // InternalTyphonML.g:3663:1: ( ( rule__DataTypeItem__NameAssignment_1 ) )
            // InternalTyphonML.g:3664:2: ( rule__DataTypeItem__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeItemAccess().getNameAssignment_1()); 
            // InternalTyphonML.g:3665:2: ( rule__DataTypeItem__NameAssignment_1 )
            // InternalTyphonML.g:3665:3: rule__DataTypeItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__1__Impl"


    // $ANTLR start "rule__DataTypeItem__Group__2"
    // InternalTyphonML.g:3673:1: rule__DataTypeItem__Group__2 : rule__DataTypeItem__Group__2__Impl rule__DataTypeItem__Group__3 ;
    public final void rule__DataTypeItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3677:1: ( rule__DataTypeItem__Group__2__Impl rule__DataTypeItem__Group__3 )
            // InternalTyphonML.g:3678:2: rule__DataTypeItem__Group__2__Impl rule__DataTypeItem__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__DataTypeItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__2"


    // $ANTLR start "rule__DataTypeItem__Group__2__Impl"
    // InternalTyphonML.g:3685:1: rule__DataTypeItem__Group__2__Impl : ( ':' ) ;
    public final void rule__DataTypeItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3689:1: ( ( ':' ) )
            // InternalTyphonML.g:3690:1: ( ':' )
            {
            // InternalTyphonML.g:3690:1: ( ':' )
            // InternalTyphonML.g:3691:2: ':'
            {
             before(grammarAccess.getDataTypeItemAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataTypeItemAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__2__Impl"


    // $ANTLR start "rule__DataTypeItem__Group__3"
    // InternalTyphonML.g:3700:1: rule__DataTypeItem__Group__3 : rule__DataTypeItem__Group__3__Impl ;
    public final void rule__DataTypeItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3704:1: ( rule__DataTypeItem__Group__3__Impl )
            // InternalTyphonML.g:3705:2: rule__DataTypeItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeItem__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__3"


    // $ANTLR start "rule__DataTypeItem__Group__3__Impl"
    // InternalTyphonML.g:3711:1: rule__DataTypeItem__Group__3__Impl : ( ( rule__DataTypeItem__TypeAssignment_3 ) ) ;
    public final void rule__DataTypeItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3715:1: ( ( ( rule__DataTypeItem__TypeAssignment_3 ) ) )
            // InternalTyphonML.g:3716:1: ( ( rule__DataTypeItem__TypeAssignment_3 ) )
            {
            // InternalTyphonML.g:3716:1: ( ( rule__DataTypeItem__TypeAssignment_3 ) )
            // InternalTyphonML.g:3717:2: ( rule__DataTypeItem__TypeAssignment_3 )
            {
             before(grammarAccess.getDataTypeItemAccess().getTypeAssignment_3()); 
            // InternalTyphonML.g:3718:2: ( rule__DataTypeItem__TypeAssignment_3 )
            // InternalTyphonML.g:3718:3: rule__DataTypeItem__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeItem__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeItemAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalTyphonML.g:3727:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3731:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalTyphonML.g:3732:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalTyphonML.g:3739:1: rule__Relation__Group__0__Impl : ( () ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3743:1: ( ( () ) )
            // InternalTyphonML.g:3744:1: ( () )
            {
            // InternalTyphonML.g:3744:1: ( () )
            // InternalTyphonML.g:3745:2: ()
            {
             before(grammarAccess.getRelationAccess().getRelationAction_0()); 
            // InternalTyphonML.g:3746:2: ()
            // InternalTyphonML.g:3746:3: 
            {
            }

             after(grammarAccess.getRelationAccess().getRelationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalTyphonML.g:3754:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3758:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalTyphonML.g:3759:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalTyphonML.g:3766:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3770:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalTyphonML.g:3771:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalTyphonML.g:3771:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalTyphonML.g:3772:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalTyphonML.g:3773:2: ( rule__Relation__NameAssignment_1 )
            // InternalTyphonML.g:3773:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalTyphonML.g:3781:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3785:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalTyphonML.g:3786:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalTyphonML.g:3793:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__IsContainmentAssignment_2 )? ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3797:1: ( ( ( rule__Relation__IsContainmentAssignment_2 )? ) )
            // InternalTyphonML.g:3798:1: ( ( rule__Relation__IsContainmentAssignment_2 )? )
            {
            // InternalTyphonML.g:3798:1: ( ( rule__Relation__IsContainmentAssignment_2 )? )
            // InternalTyphonML.g:3799:2: ( rule__Relation__IsContainmentAssignment_2 )?
            {
             before(grammarAccess.getRelationAccess().getIsContainmentAssignment_2()); 
            // InternalTyphonML.g:3800:2: ( rule__Relation__IsContainmentAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTyphonML.g:3800:3: rule__Relation__IsContainmentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__IsContainmentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getIsContainmentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalTyphonML.g:3808:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3812:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalTyphonML.g:3813:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalTyphonML.g:3820:1: rule__Relation__Group__3__Impl : ( '->' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3824:1: ( ( '->' ) )
            // InternalTyphonML.g:3825:1: ( '->' )
            {
            // InternalTyphonML.g:3825:1: ( '->' )
            // InternalTyphonML.g:3826:2: '->'
            {
             before(grammarAccess.getRelationAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalTyphonML.g:3835:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3839:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalTyphonML.g:3840:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalTyphonML.g:3847:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__TypeAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3851:1: ( ( ( rule__Relation__TypeAssignment_4 ) ) )
            // InternalTyphonML.g:3852:1: ( ( rule__Relation__TypeAssignment_4 ) )
            {
            // InternalTyphonML.g:3852:1: ( ( rule__Relation__TypeAssignment_4 ) )
            // InternalTyphonML.g:3853:2: ( rule__Relation__TypeAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_4()); 
            // InternalTyphonML.g:3854:2: ( rule__Relation__TypeAssignment_4 )
            // InternalTyphonML.g:3854:3: rule__Relation__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalTyphonML.g:3862:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3866:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalTyphonML.g:3867:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalTyphonML.g:3874:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__Group_5__0 )? ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3878:1: ( ( ( rule__Relation__Group_5__0 )? ) )
            // InternalTyphonML.g:3879:1: ( ( rule__Relation__Group_5__0 )? )
            {
            // InternalTyphonML.g:3879:1: ( ( rule__Relation__Group_5__0 )? )
            // InternalTyphonML.g:3880:2: ( rule__Relation__Group_5__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_5()); 
            // InternalTyphonML.g:3881:2: ( rule__Relation__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTyphonML.g:3881:3: rule__Relation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalTyphonML.g:3889:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3893:1: ( rule__Relation__Group__6__Impl )
            // InternalTyphonML.g:3894:2: rule__Relation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalTyphonML.g:3900:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__Group_6__0 )? ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3904:1: ( ( ( rule__Relation__Group_6__0 )? ) )
            // InternalTyphonML.g:3905:1: ( ( rule__Relation__Group_6__0 )? )
            {
            // InternalTyphonML.g:3905:1: ( ( rule__Relation__Group_6__0 )? )
            // InternalTyphonML.g:3906:2: ( rule__Relation__Group_6__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_6()); 
            // InternalTyphonML.g:3907:2: ( rule__Relation__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTyphonML.g:3907:3: rule__Relation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group_5__0"
    // InternalTyphonML.g:3916:1: rule__Relation__Group_5__0 : rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 ;
    public final void rule__Relation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3920:1: ( rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 )
            // InternalTyphonML.g:3921:2: rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1
            {
            pushFollow(FOLLOW_30);
            rule__Relation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__0"


    // $ANTLR start "rule__Relation__Group_5__0__Impl"
    // InternalTyphonML.g:3928:1: rule__Relation__Group_5__0__Impl : ( '.' ) ;
    public final void rule__Relation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3932:1: ( ( '.' ) )
            // InternalTyphonML.g:3933:1: ( '.' )
            {
            // InternalTyphonML.g:3933:1: ( '.' )
            // InternalTyphonML.g:3934:2: '.'
            {
             before(grammarAccess.getRelationAccess().getFullStopKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFullStopKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__0__Impl"


    // $ANTLR start "rule__Relation__Group_5__1"
    // InternalTyphonML.g:3943:1: rule__Relation__Group_5__1 : rule__Relation__Group_5__1__Impl ;
    public final void rule__Relation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3947:1: ( rule__Relation__Group_5__1__Impl )
            // InternalTyphonML.g:3948:2: rule__Relation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__1"


    // $ANTLR start "rule__Relation__Group_5__1__Impl"
    // InternalTyphonML.g:3954:1: rule__Relation__Group_5__1__Impl : ( ( rule__Relation__OppositeAssignment_5_1 ) ) ;
    public final void rule__Relation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3958:1: ( ( ( rule__Relation__OppositeAssignment_5_1 ) ) )
            // InternalTyphonML.g:3959:1: ( ( rule__Relation__OppositeAssignment_5_1 ) )
            {
            // InternalTyphonML.g:3959:1: ( ( rule__Relation__OppositeAssignment_5_1 ) )
            // InternalTyphonML.g:3960:2: ( rule__Relation__OppositeAssignment_5_1 )
            {
             before(grammarAccess.getRelationAccess().getOppositeAssignment_5_1()); 
            // InternalTyphonML.g:3961:2: ( rule__Relation__OppositeAssignment_5_1 )
            // InternalTyphonML.g:3961:3: rule__Relation__OppositeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__OppositeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getOppositeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__1__Impl"


    // $ANTLR start "rule__Relation__Group_6__0"
    // InternalTyphonML.g:3970:1: rule__Relation__Group_6__0 : rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1 ;
    public final void rule__Relation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3974:1: ( rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1 )
            // InternalTyphonML.g:3975:2: rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1
            {
            pushFollow(FOLLOW_42);
            rule__Relation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__0"


    // $ANTLR start "rule__Relation__Group_6__0__Impl"
    // InternalTyphonML.g:3982:1: rule__Relation__Group_6__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:3986:1: ( ( '[' ) )
            // InternalTyphonML.g:3987:1: ( '[' )
            {
            // InternalTyphonML.g:3987:1: ( '[' )
            // InternalTyphonML.g:3988:2: '['
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__0__Impl"


    // $ANTLR start "rule__Relation__Group_6__1"
    // InternalTyphonML.g:3997:1: rule__Relation__Group_6__1 : rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2 ;
    public final void rule__Relation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4001:1: ( rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2 )
            // InternalTyphonML.g:4002:2: rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2
            {
            pushFollow(FOLLOW_43);
            rule__Relation__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__1"


    // $ANTLR start "rule__Relation__Group_6__1__Impl"
    // InternalTyphonML.g:4009:1: rule__Relation__Group_6__1__Impl : ( ( rule__Relation__CardinalityAssignment_6_1 ) ) ;
    public final void rule__Relation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4013:1: ( ( ( rule__Relation__CardinalityAssignment_6_1 ) ) )
            // InternalTyphonML.g:4014:1: ( ( rule__Relation__CardinalityAssignment_6_1 ) )
            {
            // InternalTyphonML.g:4014:1: ( ( rule__Relation__CardinalityAssignment_6_1 ) )
            // InternalTyphonML.g:4015:2: ( rule__Relation__CardinalityAssignment_6_1 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_6_1()); 
            // InternalTyphonML.g:4016:2: ( rule__Relation__CardinalityAssignment_6_1 )
            // InternalTyphonML.g:4016:3: rule__Relation__CardinalityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__CardinalityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getCardinalityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__1__Impl"


    // $ANTLR start "rule__Relation__Group_6__2"
    // InternalTyphonML.g:4024:1: rule__Relation__Group_6__2 : rule__Relation__Group_6__2__Impl ;
    public final void rule__Relation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4028:1: ( rule__Relation__Group_6__2__Impl )
            // InternalTyphonML.g:4029:2: rule__Relation__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__2"


    // $ANTLR start "rule__Relation__Group_6__2__Impl"
    // InternalTyphonML.g:4035:1: rule__Relation__Group_6__2__Impl : ( ']' ) ;
    public final void rule__Relation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4039:1: ( ( ']' ) )
            // InternalTyphonML.g:4040:1: ( ']' )
            {
            // InternalTyphonML.g:4040:1: ( ']' )
            // InternalTyphonML.g:4041:2: ']'
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_6_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__2__Impl"


    // $ANTLR start "rule__Model__DataTypesAssignment_1"
    // InternalTyphonML.g:4051:1: rule__Model__DataTypesAssignment_1 : ( ruleDataType ) ;
    public final void rule__Model__DataTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4055:1: ( ( ruleDataType ) )
            // InternalTyphonML.g:4056:2: ( ruleDataType )
            {
            // InternalTyphonML.g:4056:2: ( ruleDataType )
            // InternalTyphonML.g:4057:3: ruleDataType
            {
             before(grammarAccess.getModelAccess().getDataTypesDataTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDataTypesDataTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DataTypesAssignment_1"


    // $ANTLR start "rule__Model__DatabasesAssignment_2"
    // InternalTyphonML.g:4066:1: rule__Model__DatabasesAssignment_2 : ( ruleDatabase ) ;
    public final void rule__Model__DatabasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4070:1: ( ( ruleDatabase ) )
            // InternalTyphonML.g:4071:2: ( ruleDatabase )
            {
            // InternalTyphonML.g:4071:2: ( ruleDatabase )
            // InternalTyphonML.g:4072:3: ruleDatabase
            {
             before(grammarAccess.getModelAccess().getDatabasesDatabaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDatabasesDatabaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DatabasesAssignment_2"


    // $ANTLR start "rule__KeyValueDB__NameAssignment_2"
    // InternalTyphonML.g:4081:1: rule__KeyValueDB__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__KeyValueDB__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4085:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4086:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4086:2: ( RULE_ID )
            // InternalTyphonML.g:4087:3: RULE_ID
            {
             before(grammarAccess.getKeyValueDBAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyValueDBAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__NameAssignment_2"


    // $ANTLR start "rule__KeyValueDB__ElementsAssignment_4"
    // InternalTyphonML.g:4096:1: rule__KeyValueDB__ElementsAssignment_4 : ( ruleKeyValueElement ) ;
    public final void rule__KeyValueDB__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4100:1: ( ( ruleKeyValueElement ) )
            // InternalTyphonML.g:4101:2: ( ruleKeyValueElement )
            {
            // InternalTyphonML.g:4101:2: ( ruleKeyValueElement )
            // InternalTyphonML.g:4102:3: ruleKeyValueElement
            {
             before(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyValueElement();

            state._fsp--;

             after(grammarAccess.getKeyValueDBAccess().getElementsKeyValueElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueDB__ElementsAssignment_4"


    // $ANTLR start "rule__KeyValueElement__KeyAssignment_1"
    // InternalTyphonML.g:4111:1: rule__KeyValueElement__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyValueElement__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4115:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4116:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4116:2: ( RULE_ID )
            // InternalTyphonML.g:4117:3: RULE_ID
            {
             before(grammarAccess.getKeyValueElementAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyValueElementAccess().getKeyIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__KeyAssignment_1"


    // $ANTLR start "rule__KeyValueElement__EntityAssignment_3"
    // InternalTyphonML.g:4126:1: rule__KeyValueElement__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__KeyValueElement__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4130:1: ( ( ( RULE_ID ) ) )
            // InternalTyphonML.g:4131:2: ( ( RULE_ID ) )
            {
            // InternalTyphonML.g:4131:2: ( ( RULE_ID ) )
            // InternalTyphonML.g:4132:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyValueElementAccess().getEntityEntityCrossReference_3_0()); 
            // InternalTyphonML.g:4133:3: ( RULE_ID )
            // InternalTyphonML.g:4134:4: RULE_ID
            {
             before(grammarAccess.getKeyValueElementAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyValueElementAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getKeyValueElementAccess().getEntityEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__EntityAssignment_3"


    // $ANTLR start "rule__KeyValueElement__ValuesAssignment_5"
    // InternalTyphonML.g:4145:1: rule__KeyValueElement__ValuesAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__KeyValueElement__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4149:1: ( ( ( ruleEString ) ) )
            // InternalTyphonML.g:4150:2: ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4150:2: ( ( ruleEString ) )
            // InternalTyphonML.g:4151:3: ( ruleEString )
            {
             before(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_5_0()); 
            // InternalTyphonML.g:4152:3: ( ruleEString )
            // InternalTyphonML.g:4153:4: ruleEString
            {
             before(grammarAccess.getKeyValueElementAccess().getValuesDataTypeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyValueElementAccess().getValuesDataTypeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getKeyValueElementAccess().getValuesDataTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValueElement__ValuesAssignment_5"


    // $ANTLR start "rule__DocumentDB__NameAssignment_2"
    // InternalTyphonML.g:4164:1: rule__DocumentDB__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DocumentDB__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4168:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4169:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4169:2: ( RULE_ID )
            // InternalTyphonML.g:4170:3: RULE_ID
            {
             before(grammarAccess.getDocumentDBAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDocumentDBAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__NameAssignment_2"


    // $ANTLR start "rule__DocumentDB__CollectionsAssignment_4"
    // InternalTyphonML.g:4179:1: rule__DocumentDB__CollectionsAssignment_4 : ( ruleDocumentDBCollection ) ;
    public final void rule__DocumentDB__CollectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4183:1: ( ( ruleDocumentDBCollection ) )
            // InternalTyphonML.g:4184:2: ( ruleDocumentDBCollection )
            {
            // InternalTyphonML.g:4184:2: ( ruleDocumentDBCollection )
            // InternalTyphonML.g:4185:3: ruleDocumentDBCollection
            {
             before(grammarAccess.getDocumentDBAccess().getCollectionsDocumentDBCollectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDocumentDBCollection();

            state._fsp--;

             after(grammarAccess.getDocumentDBAccess().getCollectionsDocumentDBCollectionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDB__CollectionsAssignment_4"


    // $ANTLR start "rule__DocumentDBCollection__NameAssignment_1"
    // InternalTyphonML.g:4194:1: rule__DocumentDBCollection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DocumentDBCollection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4198:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4199:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4199:2: ( RULE_ID )
            // InternalTyphonML.g:4200:3: RULE_ID
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDocumentDBCollectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__NameAssignment_1"


    // $ANTLR start "rule__DocumentDBCollection__EntityAssignment_3"
    // InternalTyphonML.g:4209:1: rule__DocumentDBCollection__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DocumentDBCollection__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4213:1: ( ( ( RULE_ID ) ) )
            // InternalTyphonML.g:4214:2: ( ( RULE_ID ) )
            {
            // InternalTyphonML.g:4214:2: ( ( RULE_ID ) )
            // InternalTyphonML.g:4215:3: ( RULE_ID )
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getEntityEntityCrossReference_3_0()); 
            // InternalTyphonML.g:4216:3: ( RULE_ID )
            // InternalTyphonML.g:4217:4: RULE_ID
            {
             before(grammarAccess.getDocumentDBCollectionAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDocumentDBCollectionAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDocumentDBCollectionAccess().getEntityEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentDBCollection__EntityAssignment_3"


    // $ANTLR start "rule__RelationalDB__NameAssignment_2"
    // InternalTyphonML.g:4228:1: rule__RelationalDB__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RelationalDB__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4232:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4233:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4233:2: ( RULE_ID )
            // InternalTyphonML.g:4234:3: RULE_ID
            {
             before(grammarAccess.getRelationalDBAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationalDBAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__NameAssignment_2"


    // $ANTLR start "rule__RelationalDB__TablesAssignment_4"
    // InternalTyphonML.g:4243:1: rule__RelationalDB__TablesAssignment_4 : ( ruleTable ) ;
    public final void rule__RelationalDB__TablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4247:1: ( ( ruleTable ) )
            // InternalTyphonML.g:4248:2: ( ruleTable )
            {
            // InternalTyphonML.g:4248:2: ( ruleTable )
            // InternalTyphonML.g:4249:3: ruleTable
            {
             before(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getRelationalDBAccess().getTablesTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalDB__TablesAssignment_4"


    // $ANTLR start "rule__Table__NameAssignment_3"
    // InternalTyphonML.g:4258:1: rule__Table__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4262:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4263:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4263:2: ( RULE_ID )
            // InternalTyphonML.g:4264:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_3"


    // $ANTLR start "rule__Table__EntityAssignment_5"
    // InternalTyphonML.g:4273:1: rule__Table__EntityAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Table__EntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4277:1: ( ( ( RULE_ID ) ) )
            // InternalTyphonML.g:4278:2: ( ( RULE_ID ) )
            {
            // InternalTyphonML.g:4278:2: ( ( RULE_ID ) )
            // InternalTyphonML.g:4279:3: ( RULE_ID )
            {
             before(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0()); 
            // InternalTyphonML.g:4280:3: ( RULE_ID )
            // InternalTyphonML.g:4281:4: RULE_ID
            {
             before(grammarAccess.getTableAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEntityEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTableAccess().getEntityEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__EntityAssignment_5"


    // $ANTLR start "rule__Table__IndexSpecAssignment_6"
    // InternalTyphonML.g:4292:1: rule__Table__IndexSpecAssignment_6 : ( ruleIndexSpec ) ;
    public final void rule__Table__IndexSpecAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4296:1: ( ( ruleIndexSpec ) )
            // InternalTyphonML.g:4297:2: ( ruleIndexSpec )
            {
            // InternalTyphonML.g:4297:2: ( ruleIndexSpec )
            // InternalTyphonML.g:4298:3: ruleIndexSpec
            {
             before(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIndexSpec();

            state._fsp--;

             after(grammarAccess.getTableAccess().getIndexSpecIndexSpecParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__IndexSpecAssignment_6"


    // $ANTLR start "rule__Table__IdSpecAssignment_7"
    // InternalTyphonML.g:4307:1: rule__Table__IdSpecAssignment_7 : ( ruleIdSpec ) ;
    public final void rule__Table__IdSpecAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4311:1: ( ( ruleIdSpec ) )
            // InternalTyphonML.g:4312:2: ( ruleIdSpec )
            {
            // InternalTyphonML.g:4312:2: ( ruleIdSpec )
            // InternalTyphonML.g:4313:3: ruleIdSpec
            {
             before(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleIdSpec();

            state._fsp--;

             after(grammarAccess.getTableAccess().getIdSpecIdSpecParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__IdSpecAssignment_7"


    // $ANTLR start "rule__IndexSpec__NameAssignment_2"
    // InternalTyphonML.g:4322:1: rule__IndexSpec__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IndexSpec__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4326:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4327:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4327:2: ( RULE_ID )
            // InternalTyphonML.g:4328:3: RULE_ID
            {
             before(grammarAccess.getIndexSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIndexSpecAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__NameAssignment_2"


    // $ANTLR start "rule__IndexSpec__AttributesAssignment_4"
    // InternalTyphonML.g:4337:1: rule__IndexSpec__AttributesAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__IndexSpec__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4341:1: ( ( ( RULE_STRING ) ) )
            // InternalTyphonML.g:4342:2: ( ( RULE_STRING ) )
            {
            // InternalTyphonML.g:4342:2: ( ( RULE_STRING ) )
            // InternalTyphonML.g:4343:3: ( RULE_STRING )
            {
             before(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_4_0()); 
            // InternalTyphonML.g:4344:3: ( RULE_STRING )
            // InternalTyphonML.g:4345:4: RULE_STRING
            {
             before(grammarAccess.getIndexSpecAccess().getAttributesAttributeSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIndexSpecAccess().getAttributesAttributeSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getIndexSpecAccess().getAttributesAttributeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexSpec__AttributesAssignment_4"


    // $ANTLR start "rule__IdSpec__AttributesAssignment_3"
    // InternalTyphonML.g:4356:1: rule__IdSpec__AttributesAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__IdSpec__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4360:1: ( ( ( RULE_STRING ) ) )
            // InternalTyphonML.g:4361:2: ( ( RULE_STRING ) )
            {
            // InternalTyphonML.g:4361:2: ( ( RULE_STRING ) )
            // InternalTyphonML.g:4362:3: ( RULE_STRING )
            {
             before(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_3_0()); 
            // InternalTyphonML.g:4363:3: ( RULE_STRING )
            // InternalTyphonML.g:4364:4: RULE_STRING
            {
             before(grammarAccess.getIdSpecAccess().getAttributesAttributeSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIdSpecAccess().getAttributesAttributeSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIdSpecAccess().getAttributesAttributeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSpec__AttributesAssignment_3"


    // $ANTLR start "rule__GraphDB__NameAssignment_2"
    // InternalTyphonML.g:4375:1: rule__GraphDB__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GraphDB__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4379:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4380:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4380:2: ( RULE_ID )
            // InternalTyphonML.g:4381:3: RULE_ID
            {
             before(grammarAccess.getGraphDBAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGraphDBAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__NameAssignment_2"


    // $ANTLR start "rule__GraphDB__NodesAssignment_4"
    // InternalTyphonML.g:4390:1: rule__GraphDB__NodesAssignment_4 : ( ruleNode ) ;
    public final void rule__GraphDB__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4394:1: ( ( ruleNode ) )
            // InternalTyphonML.g:4395:2: ( ruleNode )
            {
            // InternalTyphonML.g:4395:2: ( ruleNode )
            // InternalTyphonML.g:4396:3: ruleNode
            {
             before(grammarAccess.getGraphDBAccess().getNodesNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getGraphDBAccess().getNodesNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__NodesAssignment_4"


    // $ANTLR start "rule__GraphDB__EdgesAssignment_5"
    // InternalTyphonML.g:4405:1: rule__GraphDB__EdgesAssignment_5 : ( ruleEdge ) ;
    public final void rule__GraphDB__EdgesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4409:1: ( ( ruleEdge ) )
            // InternalTyphonML.g:4410:2: ( ruleEdge )
            {
            // InternalTyphonML.g:4410:2: ( ruleEdge )
            // InternalTyphonML.g:4411:3: ruleEdge
            {
             before(grammarAccess.getGraphDBAccess().getEdgesEdgeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getGraphDBAccess().getEdgesEdgeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDB__EdgesAssignment_5"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // InternalTyphonML.g:4420:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4424:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4425:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4425:2: ( RULE_ID )
            // InternalTyphonML.g:4426:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_2"


    // $ANTLR start "rule__Node__EntityAssignment_4"
    // InternalTyphonML.g:4435:1: rule__Node__EntityAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Node__EntityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4439:1: ( ( ( RULE_ID ) ) )
            // InternalTyphonML.g:4440:2: ( ( RULE_ID ) )
            {
            // InternalTyphonML.g:4440:2: ( ( RULE_ID ) )
            // InternalTyphonML.g:4441:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getEntityEntityCrossReference_4_0()); 
            // InternalTyphonML.g:4442:3: ( RULE_ID )
            // InternalTyphonML.g:4443:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getEntityEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getEntityEntityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getEntityEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__EntityAssignment_4"


    // $ANTLR start "rule__Node__AttributesAssignment_6"
    // InternalTyphonML.g:4454:1: rule__Node__AttributesAssignment_6 : ( ruleGraphAttribute ) ;
    public final void rule__Node__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4458:1: ( ( ruleGraphAttribute ) )
            // InternalTyphonML.g:4459:2: ( ruleGraphAttribute )
            {
            // InternalTyphonML.g:4459:2: ( ruleGraphAttribute )
            // InternalTyphonML.g:4460:3: ruleGraphAttribute
            {
             before(grammarAccess.getNodeAccess().getAttributesGraphAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphAttribute();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getAttributesGraphAttributeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__AttributesAssignment_6"


    // $ANTLR start "rule__GraphAttribute__NameAssignment_1"
    // InternalTyphonML.g:4469:1: rule__GraphAttribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GraphAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4473:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4474:2: ( ruleEString )
            {
            // InternalTyphonML.g:4474:2: ( ruleEString )
            // InternalTyphonML.g:4475:3: ruleEString
            {
             before(grammarAccess.getGraphAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__NameAssignment_1"


    // $ANTLR start "rule__GraphAttribute__ValueAssignment_3"
    // InternalTyphonML.g:4484:1: rule__GraphAttribute__ValueAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__GraphAttribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4488:1: ( ( ( RULE_STRING ) ) )
            // InternalTyphonML.g:4489:2: ( ( RULE_STRING ) )
            {
            // InternalTyphonML.g:4489:2: ( ( RULE_STRING ) )
            // InternalTyphonML.g:4490:3: ( RULE_STRING )
            {
             before(grammarAccess.getGraphAttributeAccess().getValueAttributeCrossReference_3_0()); 
            // InternalTyphonML.g:4491:3: ( RULE_STRING )
            // InternalTyphonML.g:4492:4: RULE_STRING
            {
             before(grammarAccess.getGraphAttributeAccess().getValueAttributeSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGraphAttributeAccess().getValueAttributeSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGraphAttributeAccess().getValueAttributeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphAttribute__ValueAssignment_3"


    // $ANTLR start "rule__Edge__NameAssignment_2"
    // InternalTyphonML.g:4503:1: rule__Edge__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Edge__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4507:1: ( ( RULE_ID ) )
            // InternalTyphonML.g:4508:2: ( RULE_ID )
            {
            // InternalTyphonML.g:4508:2: ( RULE_ID )
            // InternalTyphonML.g:4509:3: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__NameAssignment_2"


    // $ANTLR start "rule__Edge__FromAssignment_5"
    // InternalTyphonML.g:4518:1: rule__Edge__FromAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4522:1: ( ( ( RULE_ID ) ) )
            // InternalTyphonML.g:4523:2: ( ( RULE_ID ) )
            {
            // InternalTyphonML.g:4523:2: ( ( RULE_ID ) )
            // InternalTyphonML.g:4524:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getFromGraphNodeCrossReference_5_0()); 
            // InternalTyphonML.g:4525:3: ( RULE_ID )
            // InternalTyphonML.g:4526:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getFromGraphNodeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getFromGraphNodeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getFromGraphNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__FromAssignment_5"


    // $ANTLR start "rule__Edge__ToAssignment_7"
    // InternalTyphonML.g:4537:1: rule__Edge__ToAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Edge__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4541:1: ( ( ( RULE_ID ) ) )
            // InternalTyphonML.g:4542:2: ( ( RULE_ID ) )
            {
            // InternalTyphonML.g:4542:2: ( ( RULE_ID ) )
            // InternalTyphonML.g:4543:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeAccess().getToGraphNodeCrossReference_7_0()); 
            // InternalTyphonML.g:4544:3: ( RULE_ID )
            // InternalTyphonML.g:4545:4: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getToGraphNodeIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeAccess().getToGraphNodeIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getToGraphNodeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__ToAssignment_7"


    // $ANTLR start "rule__Edge__LabelsAssignment_10"
    // InternalTyphonML.g:4556:1: rule__Edge__LabelsAssignment_10 : ( ruleGraphEdgeLabel ) ;
    public final void rule__Edge__LabelsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4560:1: ( ( ruleGraphEdgeLabel ) )
            // InternalTyphonML.g:4561:2: ( ruleGraphEdgeLabel )
            {
            // InternalTyphonML.g:4561:2: ( ruleGraphEdgeLabel )
            // InternalTyphonML.g:4562:3: ruleGraphEdgeLabel
            {
             before(grammarAccess.getEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphEdgeLabel();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getLabelsGraphEdgeLabelParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__LabelsAssignment_10"


    // $ANTLR start "rule__GraphEdgeLabel__NameAssignment_1"
    // InternalTyphonML.g:4571:1: rule__GraphEdgeLabel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GraphEdgeLabel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4575:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4576:2: ( ruleEString )
            {
            // InternalTyphonML.g:4576:2: ( ruleEString )
            // InternalTyphonML.g:4577:3: ruleEString
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphEdgeLabelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__NameAssignment_1"


    // $ANTLR start "rule__GraphEdgeLabel__TypeAssignment_3"
    // InternalTyphonML.g:4586:1: rule__GraphEdgeLabel__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__GraphEdgeLabel__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4590:1: ( ( ( ruleEString ) ) )
            // InternalTyphonML.g:4591:2: ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4591:2: ( ( ruleEString ) )
            // InternalTyphonML.g:4592:3: ( ruleEString )
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeCrossReference_3_0()); 
            // InternalTyphonML.g:4593:3: ( ruleEString )
            // InternalTyphonML.g:4594:4: ruleEString
            {
             before(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGraphEdgeLabelAccess().getTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphEdgeLabel__TypeAssignment_3"


    // $ANTLR start "rule__PrimitiveDataType__NameAssignment_2"
    // InternalTyphonML.g:4605:1: rule__PrimitiveDataType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PrimitiveDataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4609:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4610:2: ( ruleEString )
            {
            // InternalTyphonML.g:4610:2: ( ruleEString )
            // InternalTyphonML.g:4611:3: ruleEString
            {
             before(grammarAccess.getPrimitiveDataTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitiveDataTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDataType__NameAssignment_2"


    // $ANTLR start "rule__CustomDataType__NameAssignment_2"
    // InternalTyphonML.g:4620:1: rule__CustomDataType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CustomDataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4624:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4625:2: ( ruleEString )
            {
            // InternalTyphonML.g:4625:2: ( ruleEString )
            // InternalTyphonML.g:4626:3: ruleEString
            {
             before(grammarAccess.getCustomDataTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomDataTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__NameAssignment_2"


    // $ANTLR start "rule__CustomDataType__ElementsAssignment_4"
    // InternalTyphonML.g:4635:1: rule__CustomDataType__ElementsAssignment_4 : ( ruleDataTypeItem ) ;
    public final void rule__CustomDataType__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4639:1: ( ( ruleDataTypeItem ) )
            // InternalTyphonML.g:4640:2: ( ruleDataTypeItem )
            {
            // InternalTyphonML.g:4640:2: ( ruleDataTypeItem )
            // InternalTyphonML.g:4641:3: ruleDataTypeItem
            {
             before(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeItem();

            state._fsp--;

             after(grammarAccess.getCustomDataTypeAccess().getElementsDataTypeItemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomDataType__ElementsAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalTyphonML.g:4650:1: rule__Entity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4654:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4655:2: ( ruleEString )
            {
            // InternalTyphonML.g:4655:2: ( ruleEString )
            // InternalTyphonML.g:4656:3: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalTyphonML.g:4665:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4669:1: ( ( ruleAttribute ) )
            // InternalTyphonML.g:4670:2: ( ruleAttribute )
            {
            // InternalTyphonML.g:4670:2: ( ruleAttribute )
            // InternalTyphonML.g:4671:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Entity__RelationsAssignment_4"
    // InternalTyphonML.g:4680:1: rule__Entity__RelationsAssignment_4 : ( ruleRelation ) ;
    public final void rule__Entity__RelationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4684:1: ( ( ruleRelation ) )
            // InternalTyphonML.g:4685:2: ( ruleRelation )
            {
            // InternalTyphonML.g:4685:2: ( ruleRelation )
            // InternalTyphonML.g:4686:3: ruleRelation
            {
             before(grammarAccess.getEntityAccess().getRelationsRelationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getRelationsRelationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__RelationsAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalTyphonML.g:4695:1: rule__Attribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4699:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4700:2: ( ruleEString )
            {
            // InternalTyphonML.g:4700:2: ( ruleEString )
            // InternalTyphonML.g:4701:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalTyphonML.g:4710:1: rule__Attribute__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4714:1: ( ( ( ruleEString ) ) )
            // InternalTyphonML.g:4715:2: ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4715:2: ( ( ruleEString ) )
            // InternalTyphonML.g:4716:3: ( ruleEString )
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_2_0()); 
            // InternalTyphonML.g:4717:3: ( ruleEString )
            // InternalTyphonML.g:4718:4: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__DataTypeItem__NameAssignment_1"
    // InternalTyphonML.g:4729:1: rule__DataTypeItem__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DataTypeItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4733:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4734:2: ( ruleEString )
            {
            // InternalTyphonML.g:4734:2: ( ruleEString )
            // InternalTyphonML.g:4735:3: ruleEString
            {
             before(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataTypeItemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__NameAssignment_1"


    // $ANTLR start "rule__DataTypeItem__TypeAssignment_3"
    // InternalTyphonML.g:4744:1: rule__DataTypeItem__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__DataTypeItem__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4748:1: ( ( ( ruleEString ) ) )
            // InternalTyphonML.g:4749:2: ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4749:2: ( ( ruleEString ) )
            // InternalTyphonML.g:4750:3: ( ruleEString )
            {
             before(grammarAccess.getDataTypeItemAccess().getTypeDataTypeCrossReference_3_0()); 
            // InternalTyphonML.g:4751:3: ( ruleEString )
            // InternalTyphonML.g:4752:4: ruleEString
            {
             before(grammarAccess.getDataTypeItemAccess().getTypeDataTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataTypeItemAccess().getTypeDataTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDataTypeItemAccess().getTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeItem__TypeAssignment_3"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalTyphonML.g:4763:1: rule__Relation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4767:1: ( ( ruleEString ) )
            // InternalTyphonML.g:4768:2: ( ruleEString )
            {
            // InternalTyphonML.g:4768:2: ( ruleEString )
            // InternalTyphonML.g:4769:3: ruleEString
            {
             before(grammarAccess.getRelationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__IsContainmentAssignment_2"
    // InternalTyphonML.g:4778:1: rule__Relation__IsContainmentAssignment_2 : ( ( ':' ) ) ;
    public final void rule__Relation__IsContainmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4782:1: ( ( ( ':' ) ) )
            // InternalTyphonML.g:4783:2: ( ( ':' ) )
            {
            // InternalTyphonML.g:4783:2: ( ( ':' ) )
            // InternalTyphonML.g:4784:3: ( ':' )
            {
             before(grammarAccess.getRelationAccess().getIsContainmentColonKeyword_2_0()); 
            // InternalTyphonML.g:4785:3: ( ':' )
            // InternalTyphonML.g:4786:4: ':'
            {
             before(grammarAccess.getRelationAccess().getIsContainmentColonKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsContainmentColonKeyword_2_0()); 

            }

             after(grammarAccess.getRelationAccess().getIsContainmentColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__IsContainmentAssignment_2"


    // $ANTLR start "rule__Relation__TypeAssignment_4"
    // InternalTyphonML.g:4797:1: rule__Relation__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Relation__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4801:1: ( ( ( ruleEString ) ) )
            // InternalTyphonML.g:4802:2: ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4802:2: ( ( ruleEString ) )
            // InternalTyphonML.g:4803:3: ( ruleEString )
            {
             before(grammarAccess.getRelationAccess().getTypeEntityCrossReference_4_0()); 
            // InternalTyphonML.g:4804:3: ( ruleEString )
            // InternalTyphonML.g:4805:4: ruleEString
            {
             before(grammarAccess.getRelationAccess().getTypeEntityEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getTypeEntityEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTypeEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_4"


    // $ANTLR start "rule__Relation__OppositeAssignment_5_1"
    // InternalTyphonML.g:4816:1: rule__Relation__OppositeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Relation__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4820:1: ( ( ( ruleEString ) ) )
            // InternalTyphonML.g:4821:2: ( ( ruleEString ) )
            {
            // InternalTyphonML.g:4821:2: ( ( ruleEString ) )
            // InternalTyphonML.g:4822:3: ( ruleEString )
            {
             before(grammarAccess.getRelationAccess().getOppositeRelationCrossReference_5_1_0()); 
            // InternalTyphonML.g:4823:3: ( ruleEString )
            // InternalTyphonML.g:4824:4: ruleEString
            {
             before(grammarAccess.getRelationAccess().getOppositeRelationEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getOppositeRelationEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getOppositeRelationCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OppositeAssignment_5_1"


    // $ANTLR start "rule__Relation__CardinalityAssignment_6_1"
    // InternalTyphonML.g:4835:1: rule__Relation__CardinalityAssignment_6_1 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTyphonML.g:4839:1: ( ( ruleCardinality ) )
            // InternalTyphonML.g:4840:2: ( ruleCardinality )
            {
            // InternalTyphonML.g:4840:2: ( ruleCardinality )
            // InternalTyphonML.g:4841:3: ruleCardinality
            {
             before(grammarAccess.getRelationAccess().getCardinalityCardinalityEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getCardinalityCardinalityEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000702288000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002288002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002288000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000014020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000000L});

}