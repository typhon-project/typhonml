package it.univaq.disim.typhon.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTyphonMLLexer extends Lexer {
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

    public InternalTyphonMLLexer() {;} 
    public InternalTyphonMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTyphonMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTyphonML.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:11:7: ( 'AddAttribute' )
            // InternalTyphonML.g:11:9: 'AddAttribute'
            {
            match("AddAttribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:12:7: ( '{' )
            // InternalTyphonML.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:13:7: ( 'importedNamespace' )
            // InternalTyphonML.g:13:9: 'importedNamespace'
            {
            match("importedNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:14:7: ( 'type' )
            // InternalTyphonML.g:14:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:15:7: ( '}' )
            // InternalTyphonML.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:16:7: ( 'AddEntity' )
            // InternalTyphonML.g:16:9: 'AddEntity'
            {
            match("AddEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:17:7: ( 'genericList' )
            // InternalTyphonML.g:17:9: 'genericList'
            {
            match("genericList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:18:7: ( 'attributes' )
            // InternalTyphonML.g:18:9: 'attributes'
            {
            match("attributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:19:7: ( ',' )
            // InternalTyphonML.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:20:7: ( 'relations' )
            // InternalTyphonML.g:20:9: 'relations'
            {
            match("relations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:21:7: ( 'identifer' )
            // InternalTyphonML.g:21:9: 'identifer'
            {
            match("identifer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:22:7: ( 'PrimitiveDataType' )
            // InternalTyphonML.g:22:9: 'PrimitiveDataType'
            {
            match("PrimitiveDataType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:23:7: ( 'FreeText' )
            // InternalTyphonML.g:23:9: 'FreeText'
            {
            match("FreeText"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:24:7: ( 'CustomDataType' )
            // InternalTyphonML.g:24:9: 'CustomDataType'
            {
            match("CustomDataType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:25:7: ( 'elements' )
            // InternalTyphonML.g:25:9: 'elements'
            {
            match("elements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:26:7: ( 'Entity' )
            // InternalTyphonML.g:26:9: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:27:7: ( 'Attribute' )
            // InternalTyphonML.g:27:9: 'Attribute'
            {
            match("Attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:28:7: ( 'isContainment' )
            // InternalTyphonML.g:28:9: 'isContainment'
            {
            match("isContainment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:29:7: ( 'Relation' )
            // InternalTyphonML.g:29:9: 'Relation'
            {
            match("Relation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:30:7: ( 'cardinality' )
            // InternalTyphonML.g:30:9: 'cardinality'
            {
            match("cardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:31:7: ( 'opposite' )
            // InternalTyphonML.g:31:9: 'opposite'
            {
            match("opposite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:32:7: ( 'EntityIdentifier' )
            // InternalTyphonML.g:32:9: 'EntityIdentifier'
            {
            match("EntityIdentifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:33:7: ( '(' )
            // InternalTyphonML.g:33:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:34:7: ( ')' )
            // InternalTyphonML.g:34:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:35:7: ( 'GenericList' )
            // InternalTyphonML.g:35:9: 'GenericList'
            {
            match("GenericList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:36:7: ( 'entity' )
            // InternalTyphonML.g:36:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:37:7: ( 'AddRelation' )
            // InternalTyphonML.g:37:9: 'AddRelation'
            {
            match("AddRelation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:38:7: ( 'Table' )
            // InternalTyphonML.g:38:9: 'Table'
            {
            match("Table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:39:7: ( 'db' )
            // InternalTyphonML.g:39:9: 'db'
            {
            match("db"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:40:7: ( 'indexSpec' )
            // InternalTyphonML.g:40:9: 'indexSpec'
            {
            match("indexSpec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:41:7: ( 'idSpec' )
            // InternalTyphonML.g:41:9: 'idSpec'
            {
            match("idSpec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:42:7: ( 'Collection' )
            // InternalTyphonML.g:42:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:43:7: ( 'KeyValueElement' )
            // InternalTyphonML.g:43:9: 'KeyValueElement'
            {
            match("KeyValueElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:44:7: ( 'key' )
            // InternalTyphonML.g:44:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:45:7: ( 'values' )
            // InternalTyphonML.g:45:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:46:7: ( 'GraphNode' )
            // InternalTyphonML.g:46:9: 'GraphNode'
            {
            match("GraphNode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:47:7: ( 'IndexSpec' )
            // InternalTyphonML.g:47:9: 'IndexSpec'
            {
            match("IndexSpec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:48:7: ( 'references' )
            // InternalTyphonML.g:48:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:49:7: ( 'IdSpec' )
            // InternalTyphonML.g:49:9: 'IdSpec'
            {
            match("IdSpec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:50:7: ( 'RelationalDB' )
            // InternalTyphonML.g:50:9: 'RelationalDB'
            {
            match("RelationalDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:51:7: ( 'tables' )
            // InternalTyphonML.g:51:9: 'tables'
            {
            match("tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:52:7: ( 'DocumentDB' )
            // InternalTyphonML.g:52:9: 'DocumentDB'
            {
            match("DocumentDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:53:7: ( 'collections' )
            // InternalTyphonML.g:53:9: 'collections'
            {
            match("collections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:54:7: ( 'KeyValueDB' )
            // InternalTyphonML.g:54:9: 'KeyValueDB'
            {
            match("KeyValueDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:55:7: ( 'GraphDB' )
            // InternalTyphonML.g:55:9: 'GraphDB'
            {
            match("GraphDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:56:7: ( 'nodes' )
            // InternalTyphonML.g:56:9: 'nodes'
            {
            match("nodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:57:7: ( 'edges' )
            // InternalTyphonML.g:57:9: 'edges'
            {
            match("edges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:58:7: ( 'ColumnDB' )
            // InternalTyphonML.g:58:9: 'ColumnDB'
            {
            match("ColumnDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:59:7: ( 'columns' )
            // InternalTyphonML.g:59:9: 'columns'
            {
            match("columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:60:7: ( 'GraphEdge' )
            // InternalTyphonML.g:60:9: 'GraphEdge'
            {
            match("GraphEdge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:61:7: ( 'from' )
            // InternalTyphonML.g:61:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:62:7: ( 'to' )
            // InternalTyphonML.g:62:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:63:7: ( 'labels' )
            // InternalTyphonML.g:63:9: 'labels'
            {
            match("labels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:64:7: ( 'GraphEdgeLabel' )
            // InternalTyphonML.g:64:9: 'GraphEdgeLabel'
            {
            match("GraphEdgeLabel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:65:7: ( 'AddGraphEdge' )
            // InternalTyphonML.g:65:9: 'AddGraphEdge'
            {
            match("AddGraphEdge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:66:7: ( 'Column' )
            // InternalTyphonML.g:66:9: 'Column'
            {
            match("Column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:67:7: ( 'GraphAttribute' )
            // InternalTyphonML.g:67:9: 'GraphAttribute'
            {
            match("GraphAttribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:68:7: ( 'value' )
            // InternalTyphonML.g:68:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:69:7: ( 'AddGraphAttribute' )
            // InternalTyphonML.g:69:9: 'AddGraphAttribute'
            {
            match("AddGraphAttribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:70:7: ( 'DataTypeItem' )
            // InternalTyphonML.g:70:9: 'DataTypeItem'
            {
            match("DataTypeItem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:71:7: ( 'implementation' )
            // InternalTyphonML.g:71:9: 'implementation'
            {
            match("implementation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:72:7: ( 'DataTypeImplementationPackage' )
            // InternalTyphonML.g:72:9: 'DataTypeImplementationPackage'
            {
            match("DataTypeImplementationPackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:73:7: ( 'location' )
            // InternalTyphonML.g:73:9: 'location'
            {
            match("location"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:74:7: ( 'zero_one' )
            // InternalTyphonML.g:74:9: 'zero_one'
            {
            match("zero_one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:75:7: ( 'one' )
            // InternalTyphonML.g:75:9: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:76:7: ( 'zero_many' )
            // InternalTyphonML.g:76:9: 'zero_many'
            {
            match("zero_many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:77:7: ( 'one_many' )
            // InternalTyphonML.g:77:9: 'one_many'
            {
            match("one_many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4457:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTyphonML.g:4457:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTyphonML.g:4457:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTyphonML.g:4457:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTyphonML.g:4457:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTyphonML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4459:10: ( ( '0' .. '9' )+ )
            // InternalTyphonML.g:4459:12: ( '0' .. '9' )+
            {
            // InternalTyphonML.g:4459:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTyphonML.g:4459:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4461:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTyphonML.g:4461:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTyphonML.g:4461:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTyphonML.g:4461:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTyphonML.g:4461:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTyphonML.g:4461:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTyphonML.g:4461:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTyphonML.g:4461:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTyphonML.g:4461:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTyphonML.g:4461:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTyphonML.g:4461:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4463:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTyphonML.g:4463:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTyphonML.g:4463:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTyphonML.g:4463:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4465:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTyphonML.g:4465:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTyphonML.g:4465:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTyphonML.g:4465:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalTyphonML.g:4465:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTyphonML.g:4465:41: ( '\\r' )? '\\n'
                    {
                    // InternalTyphonML.g:4465:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTyphonML.g:4465:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4467:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTyphonML.g:4467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTyphonML.g:4467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTyphonML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:4469:16: ( . )
            // InternalTyphonML.g:4469:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTyphonML.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=74;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalTyphonML.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalTyphonML.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalTyphonML.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalTyphonML.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalTyphonML.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalTyphonML.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalTyphonML.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalTyphonML.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalTyphonML.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalTyphonML.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalTyphonML.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalTyphonML.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalTyphonML.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalTyphonML.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalTyphonML.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalTyphonML.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalTyphonML.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalTyphonML.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalTyphonML.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalTyphonML.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalTyphonML.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalTyphonML.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalTyphonML.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalTyphonML.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalTyphonML.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalTyphonML.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalTyphonML.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalTyphonML.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalTyphonML.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalTyphonML.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalTyphonML.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalTyphonML.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalTyphonML.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalTyphonML.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalTyphonML.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalTyphonML.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalTyphonML.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalTyphonML.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalTyphonML.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalTyphonML.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalTyphonML.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalTyphonML.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalTyphonML.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalTyphonML.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalTyphonML.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalTyphonML.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalTyphonML.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalTyphonML.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalTyphonML.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalTyphonML.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalTyphonML.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalTyphonML.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalTyphonML.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalTyphonML.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalTyphonML.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalTyphonML.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalTyphonML.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalTyphonML.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalTyphonML.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalTyphonML.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalTyphonML.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalTyphonML.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalTyphonML.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalTyphonML.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalTyphonML.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalTyphonML.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalTyphonML.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalTyphonML.g:1:412: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // InternalTyphonML.g:1:420: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // InternalTyphonML.g:1:429: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // InternalTyphonML.g:1:441: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // InternalTyphonML.g:1:457: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalTyphonML.g:1:473: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // InternalTyphonML.g:1:481: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\52\1\uffff\2\52\1\uffff\2\52\1\uffff\11\52\2\uffff\14\52\1\47\2\uffff\3\47\2\uffff\2\52\2\uffff\6\52\1\145\1\uffff\2\52\1\uffff\16\52\2\uffff\3\52\1\172\14\52\5\uffff\11\52\1\uffff\20\52\1\u00a7\3\52\1\uffff\1\52\1\u00ac\25\52\1\u00c2\24\52\1\uffff\4\52\1\uffff\6\52\1\u00e1\16\52\1\uffff\14\52\1\u00fc\11\52\1\u0109\1\52\1\u010c\4\52\1\u0111\1\uffff\13\52\1\u011e\2\52\1\u0121\10\52\1\u012b\1\52\1\u012d\1\uffff\1\u012f\13\52\1\uffff\1\52\1\u013c\1\uffff\1\52\1\u013e\2\52\1\uffff\1\u0141\13\52\1\uffff\2\52\1\uffff\11\52\1\uffff\1\52\1\uffff\1\52\1\uffff\3\52\1\u015d\4\52\1\u0162\3\52\1\uffff\1\52\1\uffff\2\52\1\uffff\22\52\1\u017c\2\52\1\u017f\1\u0180\1\52\1\u0183\2\52\1\uffff\1\u0186\1\u0187\2\52\1\uffff\6\52\1\u0191\1\u0192\2\52\1\u0195\3\52\1\u0199\2\52\1\u019c\1\52\1\u019e\2\52\1\u01a1\2\52\1\uffff\2\52\2\uffff\2\52\1\uffff\2\52\2\uffff\1\52\1\u01ab\1\u01ad\3\52\1\u01b1\2\52\2\uffff\1\u01b5\1\52\1\uffff\3\52\1\uffff\2\52\1\uffff\1\52\1\uffff\1\52\1\u01be\1\uffff\1\u01bf\2\52\1\u01c2\5\52\1\uffff\1\52\1\uffff\2\52\1\u01cb\1\uffff\1\u01cc\2\52\1\uffff\1\52\1\u01d0\5\52\1\u01d6\2\uffff\2\52\1\uffff\2\52\1\u01db\1\u01dc\1\u01dd\3\52\2\uffff\2\52\1\u01e3\1\uffff\1\u01e4\4\52\1\uffff\3\52\1\u01ec\3\uffff\3\52\1\u01f0\1\52\2\uffff\3\52\1\u01f5\3\52\1\uffff\3\52\1\uffff\3\52\1\u01ff\1\uffff\1\52\1\u0201\1\52\1\u0203\1\u0204\4\52\1\uffff\1\52\1\uffff\1\52\2\uffff\1\u020b\4\52\1\u0210\1\uffff\1\52\1\u0212\1\u0213\1\u0214\1\uffff\1\52\3\uffff\13\52\1\u0221\1\uffff";
    static final String DFA12_eofS =
        "\u0222\uffff";
    static final String DFA12_minS =
        "\1\0\1\144\1\uffff\1\144\1\141\1\uffff\1\145\1\164\1\uffff\1\145\2\162\1\157\1\144\1\156\1\145\1\141\1\156\2\uffff\1\145\1\141\1\142\2\145\1\141\1\144\1\141\1\157\1\162\1\141\1\145\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\164\2\uffff\1\160\1\123\1\103\1\144\1\160\1\142\1\60\1\uffff\1\156\1\164\1\uffff\1\146\1\151\1\145\1\163\1\154\1\145\1\164\1\147\1\164\1\154\1\162\1\154\1\160\1\145\2\uffff\1\156\1\141\1\142\1\60\2\171\1\154\1\144\1\123\1\143\1\164\1\144\1\157\1\142\1\143\1\162\5\uffff\1\101\1\162\1\154\1\156\1\160\1\157\2\145\1\154\1\uffff\1\145\1\162\1\141\1\145\1\155\1\145\1\164\1\154\1\155\1\151\1\145\1\151\1\141\1\144\1\154\1\157\1\60\1\145\1\160\1\154\1\uffff\1\126\1\60\1\165\1\145\1\160\1\165\1\141\1\145\1\155\1\145\1\141\1\157\1\164\1\156\1\145\1\162\1\151\1\162\1\145\1\164\1\145\1\156\1\170\1\60\1\145\1\162\1\151\1\164\1\162\1\151\1\124\1\157\1\145\1\155\1\145\1\164\1\163\2\164\1\151\1\145\1\155\1\163\1\155\1\uffff\1\162\1\150\1\145\1\141\1\uffff\1\145\1\170\1\145\1\155\1\124\1\163\1\60\1\154\1\164\1\137\2\164\1\154\1\141\1\142\1\164\1\155\1\151\1\143\1\164\1\123\1\uffff\1\163\1\151\1\142\1\151\1\145\1\164\1\145\1\155\1\143\2\156\1\171\1\60\1\171\1\151\1\156\1\143\1\156\1\151\1\141\1\151\1\101\1\60\1\154\1\60\1\123\1\143\1\145\1\171\1\60\1\uffff\1\163\1\151\1\155\1\162\1\151\1\141\1\160\1\165\2\145\1\146\1\60\1\141\1\160\1\60\1\143\1\165\1\157\1\156\1\151\1\170\1\104\1\164\1\60\1\164\1\60\1\uffff\1\60\1\157\1\141\1\164\1\163\1\164\1\156\1\143\1\157\1\102\1\144\1\164\1\uffff\1\165\1\60\1\uffff\1\160\1\60\1\156\1\160\1\uffff\1\60\1\157\1\156\1\141\1\151\2\164\1\150\1\164\1\144\1\156\1\145\1\uffff\1\151\1\145\1\uffff\1\114\1\164\1\156\1\143\1\166\1\164\1\141\1\151\1\102\1\uffff\1\163\1\uffff\1\144\1\uffff\1\156\1\154\1\151\1\60\1\145\1\171\1\114\1\144\1\60\1\147\1\164\1\145\1\uffff\1\145\1\uffff\1\164\1\145\1\uffff\1\156\1\145\1\156\1\142\1\171\1\151\1\101\1\145\1\116\1\164\1\162\1\156\1\143\1\151\1\145\1\163\2\145\1\60\1\164\1\157\2\60\1\145\1\60\1\151\1\157\1\uffff\2\60\1\151\1\145\1\uffff\1\145\1\162\1\104\1\143\1\104\1\111\2\60\1\171\1\165\1\60\1\157\1\144\1\164\1\60\2\141\1\60\1\155\1\60\2\163\1\60\1\163\1\104\1\uffff\1\141\1\156\2\uffff\1\156\1\154\1\uffff\1\164\1\156\2\uffff\1\163\2\60\1\151\1\154\1\102\1\60\1\102\1\155\2\uffff\1\60\1\164\1\uffff\1\156\1\147\1\164\1\uffff\1\155\1\164\1\uffff\1\145\1\uffff\1\164\1\60\1\uffff\1\60\1\141\1\124\1\60\1\164\1\104\1\171\1\163\1\164\1\uffff\1\141\1\uffff\1\142\1\145\1\60\1\uffff\1\60\1\145\1\160\1\uffff\1\145\1\60\1\145\1\162\1\145\1\151\1\156\1\60\2\uffff\1\164\1\171\1\uffff\1\151\1\102\3\60\1\142\1\165\1\155\2\uffff\1\155\1\154\1\60\1\uffff\1\60\1\151\1\163\1\157\1\164\1\uffff\1\141\1\160\1\146\1\60\3\uffff\1\145\1\164\1\145\1\60\1\145\2\uffff\1\142\1\160\1\156\1\60\1\124\1\145\1\151\1\uffff\1\154\1\145\1\156\1\uffff\1\155\1\165\1\141\1\60\1\uffff\1\171\1\60\1\145\2\60\1\164\1\145\1\164\1\143\1\uffff\1\160\1\uffff\1\162\2\uffff\1\60\1\156\3\145\1\60\1\uffff\1\164\3\60\1\uffff\1\141\3\uffff\1\164\1\151\1\157\1\156\1\120\1\141\1\143\1\153\1\141\1\147\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\uffff\1\163\1\171\1\uffff\1\145\1\164\1\uffff\1\145\2\162\1\165\2\156\1\145\1\157\1\160\2\uffff\1\162\1\141\1\142\2\145\1\141\1\156\2\157\1\162\1\157\1\145\1\172\2\uffff\2\uffff\1\57\2\uffff\1\144\1\164\2\uffff\1\160\1\145\1\103\1\144\1\160\1\142\1\172\1\uffff\1\156\1\164\1\uffff\1\154\1\151\1\145\1\163\1\154\1\145\1\164\1\147\1\164\1\154\1\162\1\154\1\160\1\145\2\uffff\1\156\1\141\1\142\1\172\2\171\1\154\1\144\1\123\1\143\1\164\1\144\1\157\1\142\1\143\1\162\5\uffff\1\122\1\162\1\157\1\156\1\160\1\157\2\145\1\154\1\uffff\1\145\1\162\1\141\1\145\1\155\1\145\1\164\1\165\1\155\1\151\1\145\1\151\1\141\1\144\1\165\1\157\1\172\1\145\1\160\1\154\1\uffff\1\126\1\172\1\165\1\145\1\160\1\165\1\141\1\145\1\155\1\145\1\141\1\157\1\164\1\156\1\145\1\162\1\151\1\162\1\145\1\164\1\145\1\156\1\170\1\172\1\145\1\162\1\151\1\164\1\162\1\151\1\124\1\157\1\145\1\155\1\145\1\164\1\163\2\164\1\151\1\145\1\155\1\163\1\155\1\uffff\1\162\1\150\1\145\1\141\1\uffff\1\145\1\170\1\145\1\155\1\124\1\163\1\172\1\154\1\164\1\137\2\164\1\154\1\141\1\142\1\164\1\155\1\151\1\143\1\164\1\123\1\uffff\1\163\1\151\1\142\1\151\1\145\1\164\1\145\1\155\1\143\2\156\1\171\1\172\1\171\1\151\1\156\1\143\1\156\1\151\1\141\1\151\1\116\1\172\1\154\1\172\1\123\1\143\1\145\1\171\1\172\1\uffff\1\163\1\151\1\157\1\162\1\151\1\141\1\160\1\165\2\145\1\146\1\172\1\141\1\160\1\172\1\143\1\165\1\157\1\156\1\151\1\170\1\104\1\164\1\172\1\164\1\172\1\uffff\1\172\1\157\1\141\1\164\1\163\1\164\1\156\1\143\1\157\1\102\1\144\1\164\1\uffff\1\165\1\172\1\uffff\1\160\1\172\1\156\1\160\1\uffff\1\172\1\157\1\156\1\141\1\151\2\164\1\150\1\164\1\144\1\156\1\145\1\uffff\1\151\1\145\1\uffff\1\114\1\164\1\156\1\143\1\166\1\164\1\141\1\151\1\102\1\uffff\1\163\1\uffff\1\144\1\uffff\1\156\1\154\1\151\1\172\1\145\1\171\1\114\1\144\1\172\1\147\1\164\1\145\1\uffff\1\145\1\uffff\1\164\1\145\1\uffff\1\156\1\145\1\156\1\142\1\171\1\151\1\105\1\145\1\116\1\164\1\162\1\156\1\143\1\151\1\145\1\163\2\145\1\172\1\164\1\157\2\172\1\145\1\172\1\151\1\157\1\uffff\2\172\1\151\1\145\1\uffff\1\145\1\162\1\105\1\143\1\104\1\111\2\172\1\171\1\165\1\172\1\157\1\144\1\164\1\172\2\141\1\172\1\155\1\172\2\163\1\172\1\163\1\104\1\uffff\1\141\1\156\2\uffff\1\156\1\154\1\uffff\1\164\1\156\2\uffff\1\163\2\172\1\151\1\154\1\102\1\172\1\102\1\164\2\uffff\1\172\1\164\1\uffff\1\156\1\147\1\164\1\uffff\1\155\1\164\1\uffff\1\145\1\uffff\1\164\1\172\1\uffff\1\172\1\141\1\124\1\172\1\164\1\104\1\171\1\163\1\164\1\uffff\1\141\1\uffff\1\142\1\145\1\172\1\uffff\1\172\1\145\1\160\1\uffff\1\145\1\172\1\145\1\162\1\145\1\151\1\156\1\172\2\uffff\1\164\1\171\1\uffff\1\151\1\102\3\172\1\142\1\165\1\155\2\uffff\1\155\1\154\1\172\1\uffff\1\172\1\151\1\163\1\157\1\164\1\uffff\1\141\1\160\1\146\1\172\3\uffff\1\145\1\164\1\145\1\172\1\145\2\uffff\1\142\1\160\1\156\1\172\1\124\1\145\1\151\1\uffff\1\154\1\145\1\156\1\uffff\1\155\1\165\1\141\1\172\1\uffff\1\171\1\172\1\145\2\172\1\164\1\145\1\164\1\143\1\uffff\1\160\1\uffff\1\162\2\uffff\1\172\1\156\3\145\1\172\1\uffff\1\164\3\172\1\uffff\1\141\3\uffff\1\164\1\151\1\157\1\156\1\120\1\141\1\143\1\153\1\141\1\147\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\2\uffff\1\11\11\uffff\1\27\1\30\15\uffff\1\104\1\105\3\uffff\1\111\1\112\2\uffff\1\104\1\2\7\uffff\1\5\2\uffff\1\11\16\uffff\1\27\1\30\20\uffff\1\105\1\106\1\107\1\110\1\111\11\uffff\1\64\24\uffff\1\35\54\uffff\1\101\4\uffff\1\42\25\uffff\1\4\36\uffff\1\63\32\uffff\1\57\14\uffff\1\34\2\uffff\1\72\4\uffff\1\56\14\uffff\1\37\2\uffff\1\51\11\uffff\1\70\1\uffff\1\32\1\uffff\1\20\14\uffff\1\43\1\uffff\1\47\2\uffff\1\65\33\uffff\1\61\4\uffff\1\55\31\uffff\1\15\2\uffff\1\60\1\17\2\uffff\1\23\2\uffff\1\25\1\103\11\uffff\1\77\1\100\2\uffff\1\6\3\uffff\1\21\2\uffff\1\13\1\uffff\1\36\2\uffff\1\12\11\uffff\1\44\1\uffff\1\62\3\uffff\1\45\3\uffff\1\102\10\uffff\1\10\1\46\2\uffff\1\40\10\uffff\1\54\1\52\3\uffff\1\33\5\uffff\1\7\4\uffff\1\24\1\53\1\31\5\uffff\1\1\1\67\7\uffff\1\50\3\uffff\1\74\4\uffff\1\22\11\uffff\1\75\1\uffff\1\16\1\uffff\1\66\1\71\6\uffff\1\41\4\uffff\1\26\1\uffff\1\73\1\3\1\14\14\uffff\1\76";
    static final String DFA12_specialS =
        "\1\0\42\uffff\1\1\1\2\u01fd\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\43\4\47\1\44\1\22\1\23\2\47\1\10\2\47\1\45\12\42\7\47\1\1\1\41\1\14\1\33\1\16\1\13\1\24\1\41\1\32\1\41\1\27\4\41\1\12\1\41\1\17\1\41\1\25\6\41\3\47\1\40\1\41\1\47\1\7\1\41\1\20\1\26\1\15\1\35\1\6\1\41\1\3\1\41\1\30\1\36\1\41\1\34\1\21\2\41\1\11\1\41\1\4\1\41\1\31\3\41\1\37\1\2\1\47\1\5\uff82\47",
            "\1\50\17\uffff\1\51",
            "",
            "\1\55\10\uffff\1\54\1\57\4\uffff\1\56",
            "\1\61\15\uffff\1\62\11\uffff\1\60",
            "",
            "\1\64",
            "\1\65",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73\5\uffff\1\72",
            "\1\76\7\uffff\1\74\1\uffff\1\75",
            "\1\77",
            "\1\100",
            "\1\101\15\uffff\1\102",
            "\1\104\1\uffff\1\103",
            "",
            "",
            "\1\107\14\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\11\uffff\1\116",
            "\1\121\15\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124\15\uffff\1\125",
            "\1\126",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\130",
            "\0\130",
            "\1\131\4\uffff\1\132",
            "",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\140\21\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\146",
            "\1\147",
            "",
            "\1\151\5\uffff\1\150",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087\3\uffff\1\u0088\1\uffff\1\u008a\12\uffff\1\u0089",
            "\1\u008b",
            "\1\u008d\2\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\10\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\10\uffff\1\u00a4",
            "\1\u00a5",
            "\12\52\7\uffff\32\52\4\uffff\1\u00a6\1\uffff\32\52",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0108\2\uffff\1\u0106\1\u0107\10\uffff\1\u0105",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u010b\7\52",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0115\1\uffff\1\u0114",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011f",
            "\1\u0120",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\52\7\uffff\3\52\1\u012a\26\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\10\52\1\u012e\21\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u013d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u013f",
            "\1\u0140",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u0170\3\uffff\1\u016f",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017d",
            "\1\u017e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0181",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0182\31\52",
            "\1\u0184",
            "\1\u0185",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\u018d\1\u018c",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0193",
            "\1\u0194",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019a",
            "\1\u019b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019f",
            "\1\u01a0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "",
            "\1\u01aa",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\13\52\1\u01ac\16\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b2",
            "\1\u01b4\6\uffff\1\u01b3",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c0",
            "\1\u01c1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\1\u01cf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "",
            "",
            "\1\u01e1",
            "\1\u01e2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01f1",
            "",
            "",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0200",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0202",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "",
            "\1\u020a",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0211",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0215",
            "",
            "",
            "",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='t') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='g') ) {s = 6;}

                        else if ( (LA12_0=='a') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0=='r') ) {s = 9;}

                        else if ( (LA12_0=='P') ) {s = 10;}

                        else if ( (LA12_0=='F') ) {s = 11;}

                        else if ( (LA12_0=='C') ) {s = 12;}

                        else if ( (LA12_0=='e') ) {s = 13;}

                        else if ( (LA12_0=='E') ) {s = 14;}

                        else if ( (LA12_0=='R') ) {s = 15;}

                        else if ( (LA12_0=='c') ) {s = 16;}

                        else if ( (LA12_0=='o') ) {s = 17;}

                        else if ( (LA12_0=='(') ) {s = 18;}

                        else if ( (LA12_0==')') ) {s = 19;}

                        else if ( (LA12_0=='G') ) {s = 20;}

                        else if ( (LA12_0=='T') ) {s = 21;}

                        else if ( (LA12_0=='d') ) {s = 22;}

                        else if ( (LA12_0=='K') ) {s = 23;}

                        else if ( (LA12_0=='k') ) {s = 24;}

                        else if ( (LA12_0=='v') ) {s = 25;}

                        else if ( (LA12_0=='I') ) {s = 26;}

                        else if ( (LA12_0=='D') ) {s = 27;}

                        else if ( (LA12_0=='n') ) {s = 28;}

                        else if ( (LA12_0=='f') ) {s = 29;}

                        else if ( (LA12_0=='l') ) {s = 30;}

                        else if ( (LA12_0=='z') ) {s = 31;}

                        else if ( (LA12_0=='^') ) {s = 32;}

                        else if ( (LA12_0=='B'||LA12_0=='H'||LA12_0=='J'||(LA12_0>='L' && LA12_0<='O')||LA12_0=='Q'||LA12_0=='S'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||LA12_0=='j'||LA12_0=='m'||(LA12_0>='p' && LA12_0<='q')||LA12_0=='s'||LA12_0=='u'||(LA12_0>='w' && LA12_0<='y')) ) {s = 33;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 34;}

                        else if ( (LA12_0=='\"') ) {s = 35;}

                        else if ( (LA12_0=='\'') ) {s = 36;}

                        else if ( (LA12_0=='/') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 88;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 88;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}