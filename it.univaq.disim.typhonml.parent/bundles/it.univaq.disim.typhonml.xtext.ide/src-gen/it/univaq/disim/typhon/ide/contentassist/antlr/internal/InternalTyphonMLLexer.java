package it.univaq.disim.typhon.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTyphonMLLexer extends Lexer {
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
            // InternalTyphonML.g:11:7: ( 'true' )
            // InternalTyphonML.g:11:9: 'true'
            {
            match("true"); 


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
            // InternalTyphonML.g:12:7: ( 'false' )
            // InternalTyphonML.g:12:9: 'false'
            {
            match("false"); 


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
            // InternalTyphonML.g:13:7: ( '0..1' )
            // InternalTyphonML.g:13:9: '0..1'
            {
            match("0..1"); 


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
            // InternalTyphonML.g:14:7: ( '1' )
            // InternalTyphonML.g:14:9: '1'
            {
            match('1'); 

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
            // InternalTyphonML.g:15:7: ( '0..*' )
            // InternalTyphonML.g:15:9: '0..*'
            {
            match("0..*"); 


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
            // InternalTyphonML.g:16:7: ( '*' )
            // InternalTyphonML.g:16:9: '*'
            {
            match('*'); 

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
            // InternalTyphonML.g:17:7: ( 'ParagraphSegmentation' )
            // InternalTyphonML.g:17:9: 'ParagraphSegmentation'
            {
            match("ParagraphSegmentation"); 


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
            // InternalTyphonML.g:18:7: ( 'SentenceSegmentation' )
            // InternalTyphonML.g:18:9: 'SentenceSegmentation'
            {
            match("SentenceSegmentation"); 


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
            // InternalTyphonML.g:19:7: ( 'Tokenisation' )
            // InternalTyphonML.g:19:9: 'Tokenisation'
            {
            match("Tokenisation"); 


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
            // InternalTyphonML.g:20:7: ( 'PhraseExtractor' )
            // InternalTyphonML.g:20:9: 'PhraseExtractor'
            {
            match("PhraseExtractor"); 


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
            // InternalTyphonML.g:21:7: ( 'NGramExtractor' )
            // InternalTyphonML.g:21:9: 'NGramExtractor'
            {
            match("NGramExtractor"); 


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
            // InternalTyphonML.g:22:7: ( 'POSTagging' )
            // InternalTyphonML.g:22:9: 'POSTagging'
            {
            match("POSTagging"); 


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
            // InternalTyphonML.g:23:7: ( 'Lemmatisation' )
            // InternalTyphonML.g:23:9: 'Lemmatisation'
            {
            match("Lemmatisation"); 


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
            // InternalTyphonML.g:24:7: ( 'Stemming' )
            // InternalTyphonML.g:24:9: 'Stemming'
            {
            match("Stemming"); 


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
            // InternalTyphonML.g:25:7: ( 'DependencyParsing' )
            // InternalTyphonML.g:25:9: 'DependencyParsing'
            {
            match("DependencyParsing"); 


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
            // InternalTyphonML.g:26:7: ( 'Chunking' )
            // InternalTyphonML.g:26:9: 'Chunking'
            {
            match("Chunking"); 


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
            // InternalTyphonML.g:27:7: ( 'SentimentAnalysis' )
            // InternalTyphonML.g:27:9: 'SentimentAnalysis'
            {
            match("SentimentAnalysis"); 


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
            // InternalTyphonML.g:28:7: ( 'TextClassification' )
            // InternalTyphonML.g:28:9: 'TextClassification'
            {
            match("TextClassification"); 


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
            // InternalTyphonML.g:29:7: ( 'TopicModelling' )
            // InternalTyphonML.g:29:9: 'TopicModelling'
            {
            match("TopicModelling"); 


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
            // InternalTyphonML.g:30:7: ( 'TermExtraction' )
            // InternalTyphonML.g:30:9: 'TermExtraction'
            {
            match("TermExtraction"); 


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
            // InternalTyphonML.g:31:7: ( 'NamedEntityRecognition' )
            // InternalTyphonML.g:31:9: 'NamedEntityRecognition'
            {
            match("NamedEntityRecognition"); 


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
            // InternalTyphonML.g:32:7: ( 'RelationExtraction' )
            // InternalTyphonML.g:32:9: 'RelationExtraction'
            {
            match("RelationExtraction"); 


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
            // InternalTyphonML.g:33:7: ( 'EventExtraction' )
            // InternalTyphonML.g:33:9: 'EventExtraction'
            {
            match("EventExtraction"); 


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
            // InternalTyphonML.g:34:7: ( 'CoreferenceResolution' )
            // InternalTyphonML.g:34:9: 'CoreferenceResolution'
            {
            match("CoreferenceResolution"); 


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
            // InternalTyphonML.g:35:7: ( 'changeOperators' )
            // InternalTyphonML.g:35:9: 'changeOperators'
            {
            match("changeOperators"); 


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
            // InternalTyphonML.g:36:7: ( '[' )
            // InternalTyphonML.g:36:9: '['
            {
            match('['); 

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
            // InternalTyphonML.g:37:7: ( ']' )
            // InternalTyphonML.g:37:9: ']'
            {
            match(']'); 

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
            // InternalTyphonML.g:38:7: ( ',' )
            // InternalTyphonML.g:38:9: ','
            {
            match(','); 

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
            // InternalTyphonML.g:39:7: ( 'rename' )
            // InternalTyphonML.g:39:9: 'rename'
            {
            match("rename"); 


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
            // InternalTyphonML.g:40:7: ( 'collection' )
            // InternalTyphonML.g:40:9: 'collection'
            {
            match("collection"); 


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
            // InternalTyphonML.g:41:7: ( 'as' )
            // InternalTyphonML.g:41:9: 'as'
            {
            match("as"); 


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
            // InternalTyphonML.g:42:7: ( 'extends' )
            // InternalTyphonML.g:42:9: 'extends'
            {
            match("extends"); 


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
            // InternalTyphonML.g:43:7: ( 'tableindex' )
            // InternalTyphonML.g:43:9: 'tableindex'
            {
            match("tableindex"); 


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
            // InternalTyphonML.g:44:7: ( '{' )
            // InternalTyphonML.g:44:9: '{'
            {
            match('{'); 

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
            // InternalTyphonML.g:45:7: ( '}' )
            // InternalTyphonML.g:45:9: '}'
            {
            match('}'); 

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
            // InternalTyphonML.g:46:7: ( 'reduce' )
            // InternalTyphonML.g:46:9: 'reduce'
            {
            match("reduce"); 


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
            // InternalTyphonML.g:47:7: ( 'table' )
            // InternalTyphonML.g:47:9: 'table'
            {
            match("table"); 


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
            // InternalTyphonML.g:48:7: ( 'drop' )
            // InternalTyphonML.g:48:9: 'drop'
            {
            match("drop"); 


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
            // InternalTyphonML.g:49:7: ( 'create' )
            // InternalTyphonML.g:49:9: 'create'
            {
            match("create"); 


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
            // InternalTyphonML.g:50:7: ( 'change' )
            // InternalTyphonML.g:50:9: 'change'
            {
            match("change"); 


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
            // InternalTyphonML.g:51:7: ( 'attribute' )
            // InternalTyphonML.g:51:9: 'attribute'
            {
            match("attribute"); 


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
            // InternalTyphonML.g:52:7: ( 'type' )
            // InternalTyphonML.g:52:9: 'type'
            {
            match("type"); 


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
            // InternalTyphonML.g:53:7: ( 'migrate' )
            // InternalTyphonML.g:53:9: 'migrate'
            {
            match("migrate"); 


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
            // InternalTyphonML.g:54:7: ( 'to' )
            // InternalTyphonML.g:54:9: 'to'
            {
            match("to"); 


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
            // InternalTyphonML.g:55:7: ( 'split' )
            // InternalTyphonML.g:55:9: 'split'
            {
            match("split"); 


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
            // InternalTyphonML.g:56:7: ( 'entity' )
            // InternalTyphonML.g:56:9: 'entity'
            {
            match("entity"); 


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
            // InternalTyphonML.g:57:7: ( 'left' )
            // InternalTyphonML.g:57:9: 'left'
            {
            match("left"); 


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
            // InternalTyphonML.g:58:7: ( 'right' )
            // InternalTyphonML.g:58:9: 'right'
            {
            match("right"); 


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
            // InternalTyphonML.g:59:7: ( 'merge' )
            // InternalTyphonML.g:59:9: 'merge'
            {
            match("merge"); 


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
            // InternalTyphonML.g:60:7: ( 'entities' )
            // InternalTyphonML.g:60:9: 'entities'
            {
            match("entities"); 


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
            // InternalTyphonML.g:61:7: ( 'relation' )
            // InternalTyphonML.g:61:9: 'relation'
            {
            match("relation"); 


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
            // InternalTyphonML.g:62:7: ( 'remove' )
            // InternalTyphonML.g:62:9: 'remove'
            {
            match("remove"); 


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
            // InternalTyphonML.g:63:7: ( 'containment' )
            // InternalTyphonML.g:63:9: 'containment'
            {
            match("containment"); 


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
            // InternalTyphonML.g:64:7: ( 'cardinality' )
            // InternalTyphonML.g:64:9: 'cardinality'
            {
            match("cardinality"); 


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
            // InternalTyphonML.g:65:7: ( 'datatype' )
            // InternalTyphonML.g:65:9: 'datatype'
            {
            match("datatype"); 


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
            // InternalTyphonML.g:66:7: ( 'importedNamespace' )
            // InternalTyphonML.g:66:9: 'importedNamespace'
            {
            match("importedNamespace"); 


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
            // InternalTyphonML.g:67:7: ( ':' )
            // InternalTyphonML.g:67:9: ':'
            {
            match(':'); 

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
            // InternalTyphonML.g:68:7: ( 'freetext' )
            // InternalTyphonML.g:68:9: 'freetext'
            {
            match("freetext"); 


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
            // InternalTyphonML.g:69:7: ( 'customdatatype' )
            // InternalTyphonML.g:69:9: 'customdatatype'
            {
            match("customdatatype"); 


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
            // InternalTyphonML.g:70:7: ( 'elements' )
            // InternalTyphonML.g:70:9: 'elements'
            {
            match("elements"); 


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
            // InternalTyphonML.g:71:7: ( '->' )
            // InternalTyphonML.g:71:9: '->'
            {
            match("->"); 


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
            // InternalTyphonML.g:72:7: ( '.' )
            // InternalTyphonML.g:72:9: '.'
            {
            match('.'); 

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
            // InternalTyphonML.g:73:7: ( 'db' )
            // InternalTyphonML.g:73:9: 'db'
            {
            match("db"); 


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
            // InternalTyphonML.g:74:7: ( '(' )
            // InternalTyphonML.g:74:9: '('
            {
            match('('); 

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
            // InternalTyphonML.g:75:7: ( ')' )
            // InternalTyphonML.g:75:9: ')'
            {
            match(')'); 

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
            // InternalTyphonML.g:76:7: ( 'node' )
            // InternalTyphonML.g:76:9: 'node'
            {
            match("node"); 


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
            // InternalTyphonML.g:77:7: ( '!' )
            // InternalTyphonML.g:77:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:78:7: ( 'column' )
            // InternalTyphonML.g:78:9: 'column'
            {
            match("column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:79:7: ( 'attributes' )
            // InternalTyphonML.g:79:9: 'attributes'
            {
            match("attributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:80:7: ( 'index' )
            // InternalTyphonML.g:80:9: 'index'
            {
            match("index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:81:7: ( 'references' )
            // InternalTyphonML.g:81:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:82:7: ( 'idSpec' )
            // InternalTyphonML.g:82:9: 'idSpec'
            {
            match("idSpec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:83:7: ( 'relationaldb' )
            // InternalTyphonML.g:83:9: 'relationaldb'
            {
            match("relationaldb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:84:7: ( 'tables' )
            // InternalTyphonML.g:84:9: 'tables'
            {
            match("tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:85:7: ( 'documentdb' )
            // InternalTyphonML.g:85:9: 'documentdb'
            {
            match("documentdb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:86:7: ( 'collections' )
            // InternalTyphonML.g:86:9: 'collections'
            {
            match("collections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:87:7: ( 'keyvaluedb' )
            // InternalTyphonML.g:87:9: 'keyvaluedb'
            {
            match("keyvaluedb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:88:7: ( 'graphdb' )
            // InternalTyphonML.g:88:9: 'graphdb'
            {
            match("graphdb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:89:7: ( 'nodes' )
            // InternalTyphonML.g:89:9: 'nodes'
            {
            match("nodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:90:7: ( 'edges' )
            // InternalTyphonML.g:90:9: 'edges'
            {
            match("edges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:91:7: ( 'columndb' )
            // InternalTyphonML.g:91:9: 'columndb'
            {
            match("columndb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:92:7: ( 'columns' )
            // InternalTyphonML.g:92:9: 'columns'
            {
            match("columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:93:7: ( 'edge' )
            // InternalTyphonML.g:93:9: 'edge'
            {
            match("edge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:94:7: ( 'from' )
            // InternalTyphonML.g:94:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:95:7: ( 'labels' )
            // InternalTyphonML.g:95:9: 'labels'
            {
            match("labels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:96:7: ( 'add' )
            // InternalTyphonML.g:96:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:97:7: ( 'AddGraphEdge' )
            // InternalTyphonML.g:97:9: 'AddGraphEdge'
            {
            match("AddGraphEdge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:98:7: ( '=' )
            // InternalTyphonML.g:98:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:99:7: ( 'AddGraphAttribute' )
            // InternalTyphonML.g:99:9: 'AddGraphAttribute'
            {
            match("AddGraphAttribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:100:8: ( 'value' )
            // InternalTyphonML.g:100:10: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:101:8: ( 'relations' )
            // InternalTyphonML.g:101:10: 'relations'
            {
            match("relations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTyphonML.g:18066:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTyphonML.g:18066:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTyphonML.g:18066:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTyphonML.g:18066:11: '^'
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

            // InternalTyphonML.g:18066:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTyphonML.g:18068:10: ( ( '0' .. '9' )+ )
            // InternalTyphonML.g:18068:12: ( '0' .. '9' )+
            {
            // InternalTyphonML.g:18068:12: ( '0' .. '9' )+
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
            	    // InternalTyphonML.g:18068:13: '0' .. '9'
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
            // InternalTyphonML.g:18070:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTyphonML.g:18070:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTyphonML.g:18070:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTyphonML.g:18070:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTyphonML.g:18070:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTyphonML.g:18070:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTyphonML.g:18070:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTyphonML.g:18070:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTyphonML.g:18070:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTyphonML.g:18070:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTyphonML.g:18070:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTyphonML.g:18072:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTyphonML.g:18072:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTyphonML.g:18072:24: ( options {greedy=false; } : . )*
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
            	    // InternalTyphonML.g:18072:52: .
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
            // InternalTyphonML.g:18074:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTyphonML.g:18074:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTyphonML.g:18074:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTyphonML.g:18074:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTyphonML.g:18074:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTyphonML.g:18074:41: ( '\\r' )? '\\n'
                    {
                    // InternalTyphonML.g:18074:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTyphonML.g:18074:41: '\\r'
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
            // InternalTyphonML.g:18076:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTyphonML.g:18076:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTyphonML.g:18076:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTyphonML.g:18078:16: ( . )
            // InternalTyphonML.g:18078:18: .
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
        // InternalTyphonML.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=98;
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
                // InternalTyphonML.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalTyphonML.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalTyphonML.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalTyphonML.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalTyphonML.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalTyphonML.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalTyphonML.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalTyphonML.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalTyphonML.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalTyphonML.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalTyphonML.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalTyphonML.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalTyphonML.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalTyphonML.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalTyphonML.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalTyphonML.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalTyphonML.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalTyphonML.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalTyphonML.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalTyphonML.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalTyphonML.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalTyphonML.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalTyphonML.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalTyphonML.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalTyphonML.g:1:558: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 93 :
                // InternalTyphonML.g:1:566: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 94 :
                // InternalTyphonML.g:1:575: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 95 :
                // InternalTyphonML.g:1:587: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 96 :
                // InternalTyphonML.g:1:603: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 97 :
                // InternalTyphonML.g:1:619: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 98 :
                // InternalTyphonML.g:1:627: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\65\1\71\1\72\1\uffff\12\65\3\uffff\3\65\2\uffff\5\65\1\uffff\1\60\3\uffff\1\65\1\uffff\3\65\1\uffff\1\65\1\60\2\uffff\3\60\2\uffff\3\65\1\175\1\uffff\2\65\4\uffff\24\65\3\uffff\2\65\1\u009f\6\65\2\uffff\2\65\1\u00a8\11\65\5\uffff\1\65\1\uffff\3\65\1\uffff\1\65\4\uffff\3\65\1\uffff\3\65\1\uffff\35\65\1\uffff\1\65\1\u00de\6\65\1\uffff\16\65\1\u00f3\1\65\1\u00f5\2\65\1\u00f8\2\uffff\37\65\1\uffff\3\65\1\u011d\1\u011e\5\65\1\u0124\4\65\1\u012a\4\65\1\uffff\1\u0131\1\uffff\1\u0132\1\65\1\uffff\36\65\1\u0152\4\65\1\u0158\2\uffff\3\65\1\u015c\1\u015d\1\uffff\2\65\1\u0160\1\65\1\u0162\1\uffff\3\65\1\u0166\1\65\1\u0168\2\uffff\23\65\1\u017d\1\65\1\u0181\1\65\1\u0183\2\65\1\u0186\1\u0187\1\65\1\u0189\1\65\1\uffff\2\65\1\u018d\2\65\1\uffff\3\65\2\uffff\1\u0193\1\65\1\uffff\1\u0195\1\uffff\3\65\1\uffff\1\65\1\uffff\24\65\1\uffff\2\65\1\u01b0\1\uffff\1\65\1\uffff\2\65\2\uffff\1\65\1\uffff\2\65\1\u01b7\1\uffff\4\65\1\u01bc\1\uffff\1\65\1\uffff\1\65\1\u01bf\2\65\1\u01c2\5\65\1\u01c8\10\65\1\u01d1\5\65\1\u01d7\1\uffff\3\65\1\u01dd\2\65\1\uffff\1\u01e0\1\u01e1\1\u01e2\1\65\1\uffff\2\65\1\uffff\2\65\1\uffff\5\65\1\uffff\10\65\1\uffff\5\65\1\uffff\4\65\1\u01ff\1\uffff\1\65\1\u0202\3\uffff\5\65\1\u0208\2\65\1\u020b\16\65\1\u021b\4\65\1\uffff\1\u0220\1\u0221\1\uffff\1\u0222\1\65\1\u0224\2\65\1\uffff\2\65\1\uffff\16\65\1\u0237\1\uffff\1\u0238\1\u0239\2\65\3\uffff\1\65\1\uffff\6\65\1\u0243\13\65\3\uffff\1\65\1\u0250\1\65\1\u0252\5\65\1\uffff\5\65\1\u025d\6\65\1\uffff\1\65\1\uffff\5\65\1\u026a\1\65\1\u026c\1\u026d\1\65\1\uffff\5\65\1\u0274\3\65\1\u0278\2\65\1\uffff\1\65\2\uffff\4\65\1\u0280\1\u0281\1\uffff\3\65\1\uffff\7\65\2\uffff\4\65\1\u0290\2\65\1\u0293\2\65\1\u0296\1\u0297\2\65\1\uffff\1\u029a\1\65\1\uffff\1\65\1\u029d\2\uffff\2\65\1\uffff\2\65\1\uffff\1\65\1\u02a3\2\65\1\u02a6\1\uffff\1\65\1\u02a8\1\uffff\1\u02a9\2\uffff";
    static final String DFA12_eofS =
        "\u02aa\uffff";
    static final String DFA12_minS =
        "\1\0\2\141\1\56\1\60\1\uffff\1\117\2\145\1\107\2\145\1\150\1\145\1\166\1\141\3\uffff\1\145\2\144\2\uffff\1\141\1\145\1\160\1\141\1\144\1\uffff\1\76\3\uffff\1\157\1\uffff\1\145\1\162\1\144\1\uffff\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\165\1\142\1\160\1\60\1\uffff\1\154\1\145\1\56\3\uffff\2\162\1\123\1\156\1\145\1\153\2\162\2\155\1\160\1\165\1\162\1\154\1\145\1\141\1\154\1\145\1\162\1\163\3\uffff\1\144\1\147\1\60\1\164\1\144\2\164\1\145\1\147\2\uffff\1\157\1\164\1\60\1\143\1\147\1\162\1\154\1\146\1\142\1\160\1\144\1\123\5\uffff\1\144\1\uffff\1\171\1\141\1\144\1\uffff\1\154\4\uffff\1\145\1\154\1\145\1\uffff\1\163\1\145\1\155\1\52\2\141\1\124\1\164\1\155\1\145\1\151\1\164\1\155\1\141\1\145\1\155\1\145\1\156\1\145\1\141\2\156\1\154\1\164\1\141\1\144\1\164\1\141\1\165\1\141\1\157\1\145\1\150\1\uffff\1\162\1\60\1\145\1\151\1\155\1\145\1\160\1\141\1\uffff\1\165\1\162\1\147\1\151\1\164\1\145\1\157\1\145\1\160\1\145\1\166\1\160\1\107\1\165\1\60\1\145\1\60\1\145\1\164\1\60\2\uffff\1\147\1\163\1\141\1\145\1\155\1\156\1\143\1\103\1\105\1\155\1\144\1\141\1\156\1\153\1\146\2\164\1\147\1\145\1\155\1\141\1\164\1\151\1\157\1\155\1\143\1\164\1\166\1\162\1\164\1\151\1\uffff\1\156\1\164\1\145\2\60\1\164\1\155\1\141\1\145\1\164\1\60\1\154\1\162\1\170\1\145\1\60\1\141\1\150\1\162\1\145\1\uffff\1\60\1\uffff\1\60\1\145\1\uffff\1\162\1\145\1\147\1\156\1\155\2\151\1\115\1\154\1\170\2\105\1\164\1\144\1\151\1\145\1\151\1\105\1\145\1\143\1\156\1\151\1\145\1\156\1\155\2\145\1\151\2\145\1\60\1\142\1\144\1\151\1\156\1\60\2\uffff\1\171\1\145\1\164\2\60\1\uffff\1\163\1\164\1\60\1\143\1\60\1\uffff\1\154\1\144\1\141\1\60\1\156\1\60\2\uffff\1\170\1\141\1\105\1\147\1\143\1\145\1\156\1\163\1\157\1\141\1\164\1\170\1\156\1\151\1\145\1\156\1\162\1\157\1\170\1\60\1\164\1\60\1\156\1\60\1\141\1\144\2\60\1\157\1\60\1\156\1\uffff\1\165\1\163\1\60\1\145\1\164\1\uffff\1\160\1\156\1\145\2\uffff\1\60\1\145\1\uffff\1\60\1\uffff\1\165\1\142\1\160\1\uffff\1\144\1\uffff\1\164\1\160\1\170\1\151\1\145\1\156\1\147\1\141\1\144\1\163\1\162\2\164\1\163\1\156\1\147\1\145\1\156\1\164\1\160\1\uffff\1\151\1\142\1\60\1\uffff\1\155\1\uffff\1\154\1\141\2\uffff\1\156\1\uffff\1\143\1\164\1\60\1\uffff\2\163\1\145\1\164\1\60\1\uffff\1\144\1\uffff\1\145\1\60\1\150\1\145\1\60\1\150\1\164\1\156\1\123\1\164\1\60\1\164\1\145\1\163\1\141\1\162\1\151\1\141\1\143\1\60\1\156\1\105\1\162\1\145\1\157\1\60\1\uffff\1\145\1\151\1\164\1\60\2\145\1\uffff\3\60\1\144\1\uffff\1\116\1\144\1\uffff\1\101\1\170\1\uffff\1\123\1\162\1\147\1\145\1\101\1\uffff\1\151\1\154\1\151\1\143\1\141\2\164\1\171\1\uffff\1\143\1\170\1\141\1\162\1\156\1\uffff\1\156\1\164\1\141\1\154\1\60\1\uffff\1\163\1\60\3\uffff\1\142\1\141\1\142\1\144\1\164\1\60\1\145\1\141\1\60\1\147\1\156\1\157\1\154\1\146\1\164\1\143\1\171\1\151\1\120\1\145\1\164\1\143\1\141\1\60\1\164\1\171\1\164\1\144\1\uffff\2\60\1\uffff\1\60\1\155\1\60\1\147\1\164\1\uffff\1\147\1\143\1\uffff\1\155\1\141\1\156\3\151\1\164\1\122\1\157\1\141\1\122\1\162\2\164\1\60\1\uffff\2\60\1\171\1\142\3\uffff\1\145\1\uffff\1\145\1\162\1\155\1\164\1\145\1\154\1\60\1\156\1\143\2\157\1\145\1\156\1\162\1\145\1\141\1\151\1\157\3\uffff\1\160\1\60\1\163\1\60\1\151\1\145\1\157\1\156\1\171\1\uffff\1\147\1\141\1\156\1\162\1\143\1\60\2\163\1\143\1\157\1\162\1\145\1\uffff\1\160\1\uffff\1\142\1\156\1\162\1\164\1\163\1\60\1\164\2\60\1\157\1\uffff\1\151\1\157\1\164\1\156\1\163\1\60\1\141\1\165\1\164\1\60\1\141\1\151\1\uffff\1\151\2\uffff\1\147\1\156\1\154\1\151\2\60\1\uffff\1\143\1\164\1\141\1\uffff\1\164\1\163\1\157\1\156\1\147\1\165\1\157\2\uffff\2\145\1\164\1\151\1\60\1\156\1\151\1\60\1\164\1\156\2\60\1\151\1\157\1\uffff\1\60\1\164\1\uffff\1\151\1\60\2\uffff\1\157\1\156\1\uffff\1\151\1\157\1\uffff\1\156\1\60\1\157\1\156\1\60\1\uffff\1\156\1\60\1\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\171\1\162\1\56\1\71\1\uffff\1\150\1\164\1\157\1\141\2\145\1\157\1\145\1\166\1\165\3\uffff\1\151\1\164\1\170\2\uffff\1\162\1\151\1\160\1\145\1\156\1\uffff\1\76\3\uffff\1\157\1\uffff\1\145\1\162\1\144\1\uffff\1\141\1\172\2\uffff\2\uffff\1\57\2\uffff\1\165\1\142\1\160\1\172\1\uffff\1\154\1\157\1\56\3\uffff\2\162\1\123\1\156\1\145\1\160\1\170\1\162\2\155\1\160\1\165\1\162\1\154\1\145\1\141\1\156\1\145\1\162\1\163\3\uffff\1\156\1\147\1\172\1\164\1\144\2\164\1\145\1\147\2\uffff\1\157\1\164\1\172\1\143\1\147\1\162\1\154\1\146\1\142\1\160\1\144\1\123\5\uffff\1\144\1\uffff\1\171\1\141\1\144\1\uffff\1\154\4\uffff\1\145\1\154\1\145\1\uffff\1\163\1\145\1\155\1\61\2\141\1\124\1\164\1\155\1\145\1\151\1\164\1\155\1\141\1\145\1\155\1\145\1\156\1\145\1\141\2\156\1\165\1\164\1\141\1\144\1\164\1\141\1\165\1\141\1\157\1\145\1\150\1\uffff\1\162\1\172\1\145\1\151\1\155\1\145\1\160\1\141\1\uffff\1\165\1\162\1\147\1\151\1\164\1\145\1\157\1\145\1\160\1\145\1\166\1\160\1\107\1\165\1\172\1\145\1\172\1\145\1\164\1\172\2\uffff\1\147\1\163\1\141\1\151\1\155\1\156\1\143\1\103\1\105\1\155\1\144\1\141\1\156\1\153\1\146\2\164\1\147\1\145\1\155\1\141\1\164\1\151\1\157\1\155\1\143\1\164\1\166\1\162\1\164\1\151\1\uffff\1\156\1\164\1\145\2\172\1\164\1\155\1\141\1\145\1\164\1\172\1\154\1\162\1\170\1\145\1\172\1\141\1\150\1\162\1\145\1\uffff\1\172\1\uffff\1\172\1\145\1\uffff\1\162\1\145\1\147\1\156\1\155\2\151\1\115\1\154\1\170\2\105\1\164\1\144\1\151\1\145\1\151\1\105\1\145\1\143\1\156\1\151\1\145\1\156\1\155\2\145\1\151\2\145\1\172\1\142\1\144\1\171\1\156\1\172\2\uffff\1\171\1\145\1\164\2\172\1\uffff\1\163\1\164\1\172\1\143\1\172\1\uffff\1\154\1\144\1\141\1\172\1\156\1\172\2\uffff\1\170\1\141\1\105\1\147\1\143\1\145\1\156\1\163\1\157\1\141\1\164\1\170\1\156\1\151\1\145\1\156\1\162\1\157\1\170\1\172\1\164\1\172\1\156\1\172\1\141\1\144\2\172\1\157\1\172\1\156\1\uffff\1\165\1\163\1\172\1\145\1\164\1\uffff\1\160\1\156\1\145\2\uffff\1\172\1\145\1\uffff\1\172\1\uffff\1\165\1\142\1\160\1\uffff\1\144\1\uffff\1\164\1\160\1\170\1\151\1\145\1\156\1\147\1\141\1\144\1\163\1\162\2\164\1\163\1\156\1\147\1\145\1\156\1\164\1\160\1\uffff\1\151\1\142\1\172\1\uffff\1\155\1\uffff\1\154\1\141\2\uffff\1\156\1\uffff\1\143\1\164\1\172\1\uffff\2\163\1\145\1\164\1\172\1\uffff\1\144\1\uffff\1\145\1\172\1\150\1\145\1\172\1\150\1\164\1\156\1\123\1\164\1\172\1\164\1\145\1\163\1\141\1\162\1\151\1\141\1\143\1\172\1\156\1\105\1\162\1\145\1\157\1\172\1\uffff\1\145\1\151\1\164\1\172\2\145\1\uffff\3\172\1\144\1\uffff\1\116\1\144\1\uffff\1\105\1\170\1\uffff\1\123\1\162\1\147\1\145\1\101\1\uffff\1\151\1\154\1\151\1\143\1\141\2\164\1\171\1\uffff\1\143\1\170\1\141\1\162\1\156\1\uffff\1\156\1\164\1\141\1\154\1\172\1\uffff\1\163\1\172\3\uffff\1\142\1\141\1\142\1\144\1\164\1\172\1\145\1\141\1\172\1\147\1\156\1\157\1\154\1\146\1\164\1\143\1\171\1\151\1\120\1\145\1\164\1\143\1\141\1\172\1\164\1\171\1\164\1\144\1\uffff\2\172\1\uffff\1\172\1\155\1\172\1\147\1\164\1\uffff\1\147\1\143\1\uffff\1\155\1\141\1\156\3\151\1\164\1\122\1\157\1\141\1\122\1\162\2\164\1\172\1\uffff\2\172\1\171\1\142\3\uffff\1\145\1\uffff\1\145\1\162\1\155\1\164\1\145\1\154\1\172\1\156\1\143\2\157\1\145\1\156\1\162\1\145\1\141\1\151\1\157\3\uffff\1\160\1\172\1\163\1\172\1\151\1\145\1\157\1\156\1\171\1\uffff\1\147\1\141\1\156\1\162\1\143\1\172\2\163\1\143\1\157\1\162\1\145\1\uffff\1\160\1\uffff\1\142\1\156\1\162\1\164\1\163\1\172\1\164\2\172\1\157\1\uffff\1\151\1\157\1\164\1\156\1\163\1\172\1\141\1\165\1\164\1\172\1\141\1\151\1\uffff\1\151\2\uffff\1\147\1\156\1\154\1\151\2\172\1\uffff\1\143\1\164\1\141\1\uffff\1\164\1\163\1\157\1\156\1\147\1\165\1\157\2\uffff\2\145\1\164\1\151\1\172\1\156\1\151\1\172\1\164\1\156\2\172\1\151\1\157\1\uffff\1\172\1\164\1\uffff\1\151\1\172\2\uffff\1\157\1\156\1\uffff\1\151\1\157\1\uffff\1\156\1\172\1\157\1\156\1\172\1\uffff\1\156\1\172\1\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\6\12\uffff\1\32\1\33\1\34\3\uffff\1\42\1\43\5\uffff\1\71\1\uffff\1\76\1\100\1\101\1\uffff\1\103\3\uffff\1\130\2\uffff\1\134\1\135\3\uffff\1\141\1\142\4\uffff\1\134\3\uffff\1\135\1\4\1\6\24\uffff\1\32\1\33\1\34\11\uffff\1\42\1\43\14\uffff\1\71\1\75\1\76\1\100\1\101\1\uffff\1\103\3\uffff\1\130\1\uffff\1\136\1\137\1\140\1\141\3\uffff\1\54\41\uffff\1\37\10\uffff\1\77\24\uffff\1\3\1\5\37\uffff\1\126\24\uffff\1\1\1\uffff\1\52\2\uffff\1\124\44\uffff\1\123\1\46\5\uffff\1\57\5\uffff\1\102\6\uffff\1\45\1\2\37\uffff\1\60\5\uffff\1\120\3\uffff\1\61\1\55\2\uffff\1\106\1\uffff\1\117\3\uffff\1\132\1\uffff\1\112\24\uffff\1\50\3\uffff\1\104\1\uffff\1\47\2\uffff\1\35\1\44\1\uffff\1\64\3\uffff\1\56\5\uffff\1\125\1\uffff\1\110\32\uffff\1\122\6\uffff\1\40\4\uffff\1\53\2\uffff\1\116\2\uffff\1\72\5\uffff\1\16\10\uffff\1\20\5\uffff\1\121\5\uffff\1\63\2\uffff\1\62\1\74\1\67\34\uffff\1\133\2\uffff\1\51\5\uffff\1\41\2\uffff\1\14\17\uffff\1\36\4\uffff\1\107\1\105\1\113\1\uffff\1\115\22\uffff\1\114\1\65\1\66\11\uffff\1\11\14\uffff\1\111\1\uffff\1\127\12\uffff\1\15\14\uffff\1\23\1\uffff\1\24\1\13\6\uffff\1\73\3\uffff\1\12\7\uffff\1\27\1\31\16\uffff\1\21\2\uffff\1\17\2\uffff\1\70\1\131\2\uffff\1\22\2\uffff\1\26\5\uffff\1\10\2\uffff\1\7\1\uffff\1\30\1\25";
    static final String DFA12_specialS =
        "\1\0\53\uffff\1\1\1\2\u027c\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\43\1\54\4\60\1\55\1\40\1\41\1\5\1\60\1\22\1\36\1\37\1\56\1\3\1\4\10\53\1\35\2\60\1\47\3\60\1\46\1\52\1\14\1\13\1\16\6\52\1\12\1\52\1\11\1\52\1\6\1\52\1\15\1\7\1\10\6\52\1\20\1\60\1\21\1\51\1\52\1\60\1\24\1\52\1\17\1\30\1\25\1\2\1\45\1\52\1\34\1\52\1\44\1\33\1\31\1\42\3\52\1\23\1\32\1\1\1\52\1\50\4\52\1\26\1\60\1\27\uff82\60",
            "\1\62\15\uffff\1\64\2\uffff\1\61\6\uffff\1\63",
            "\1\66\20\uffff\1\67",
            "\1\70",
            "\12\71",
            "",
            "\1\76\21\uffff\1\74\6\uffff\1\75",
            "\1\77\16\uffff\1\100",
            "\1\102\11\uffff\1\101",
            "\1\103\31\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107\6\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\116\6\uffff\1\113\6\uffff\1\114\2\uffff\1\115\2\uffff\1\117",
            "",
            "",
            "",
            "\1\123\3\uffff\1\124",
            "\1\127\16\uffff\1\125\1\126",
            "\1\133\7\uffff\1\132\1\uffff\1\131\11\uffff\1\130",
            "",
            "",
            "\1\137\1\140\14\uffff\1\141\2\uffff\1\136",
            "\1\143\3\uffff\1\142",
            "\1\144",
            "\1\146\3\uffff\1\145",
            "\1\151\10\uffff\1\147\1\150",
            "",
            "\1\153",
            "",
            "",
            "",
            "\1\157",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\165",
            "\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\0\166",
            "\0\166",
            "\1\167\4\uffff\1\170",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\176",
            "\1\177\11\uffff\1\u0080",
            "\1\u0081",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\4\uffff\1\u0088",
            "\1\u008a\5\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\1\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "",
            "\1\u009a\1\uffff\1\u009d\5\uffff\1\u009b\1\u009c\1\u0099",
            "\1\u009e",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\6\uffff\1\u00bd",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
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
            "\1\u00d1\10\uffff\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
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
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00f4",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00f6",
            "\1\u00f7",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc\3\uffff\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u011c\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0129\7\65",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u012f\11\65\1\u0130\7\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
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
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0153",
            "\1\u0154",
            "\1\u0156\17\uffff\1\u0155",
            "\1\u0157",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u015e",
            "\1\u015f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0161",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0167",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
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
            "\12\65\7\uffff\16\65\1\u017c\13\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017e",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u017f\16\65\1\u0180\7\65",
            "\1\u0182",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0184",
            "\1\u0185",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0188",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u018a",
            "",
            "\1\u018b",
            "\1\u018c",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0194",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01c0",
            "\1\u01c1",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u01db\21\65\1\u01dc\7\65",
            "\1\u01de",
            "\1\u01df",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01e3",
            "",
            "\1\u01e4",
            "\1\u01e5",
            "",
            "\1\u01e7\3\uffff\1\u01e6",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0200",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0201\7\65",
            "",
            "",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0209",
            "\1\u020a",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u021a\7\65",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0223",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0225",
            "\1\u0226",
            "",
            "\1\u0227",
            "\1\u0228",
            "",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u023a",
            "\1\u023b",
            "",
            "",
            "",
            "\1\u023c",
            "",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "",
            "",
            "",
            "\1\u024f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0251",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "",
            "\1\u0264",
            "",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u026b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u026e",
            "",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0279",
            "\1\u027a",
            "",
            "\1\u027b",
            "",
            "",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "",
            "",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0291",
            "\1\u0292",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0294",
            "\1\u0295",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0298",
            "\1\u0299",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u029b",
            "",
            "\1\u029c",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u029e",
            "\1\u029f",
            "",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "\1\u02a2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u02a4",
            "\1\u02a5",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u02a7",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='t') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='0') ) {s = 3;}

                        else if ( (LA12_0=='1') ) {s = 4;}

                        else if ( (LA12_0=='*') ) {s = 5;}

                        else if ( (LA12_0=='P') ) {s = 6;}

                        else if ( (LA12_0=='S') ) {s = 7;}

                        else if ( (LA12_0=='T') ) {s = 8;}

                        else if ( (LA12_0=='N') ) {s = 9;}

                        else if ( (LA12_0=='L') ) {s = 10;}

                        else if ( (LA12_0=='D') ) {s = 11;}

                        else if ( (LA12_0=='C') ) {s = 12;}

                        else if ( (LA12_0=='R') ) {s = 13;}

                        else if ( (LA12_0=='E') ) {s = 14;}

                        else if ( (LA12_0=='c') ) {s = 15;}

                        else if ( (LA12_0=='[') ) {s = 16;}

                        else if ( (LA12_0==']') ) {s = 17;}

                        else if ( (LA12_0==',') ) {s = 18;}

                        else if ( (LA12_0=='r') ) {s = 19;}

                        else if ( (LA12_0=='a') ) {s = 20;}

                        else if ( (LA12_0=='e') ) {s = 21;}

                        else if ( (LA12_0=='{') ) {s = 22;}

                        else if ( (LA12_0=='}') ) {s = 23;}

                        else if ( (LA12_0=='d') ) {s = 24;}

                        else if ( (LA12_0=='m') ) {s = 25;}

                        else if ( (LA12_0=='s') ) {s = 26;}

                        else if ( (LA12_0=='l') ) {s = 27;}

                        else if ( (LA12_0=='i') ) {s = 28;}

                        else if ( (LA12_0==':') ) {s = 29;}

                        else if ( (LA12_0=='-') ) {s = 30;}

                        else if ( (LA12_0=='.') ) {s = 31;}

                        else if ( (LA12_0=='(') ) {s = 32;}

                        else if ( (LA12_0==')') ) {s = 33;}

                        else if ( (LA12_0=='n') ) {s = 34;}

                        else if ( (LA12_0=='!') ) {s = 35;}

                        else if ( (LA12_0=='k') ) {s = 36;}

                        else if ( (LA12_0=='g') ) {s = 37;}

                        else if ( (LA12_0=='A') ) {s = 38;}

                        else if ( (LA12_0=='=') ) {s = 39;}

                        else if ( (LA12_0=='v') ) {s = 40;}

                        else if ( (LA12_0=='^') ) {s = 41;}

                        else if ( (LA12_0=='B'||(LA12_0>='F' && LA12_0<='K')||LA12_0=='M'||LA12_0=='O'||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||LA12_0=='j'||(LA12_0>='o' && LA12_0<='q')||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 42;}

                        else if ( ((LA12_0>='2' && LA12_0<='9')) ) {s = 43;}

                        else if ( (LA12_0=='\"') ) {s = 44;}

                        else if ( (LA12_0=='\'') ) {s = 45;}

                        else if ( (LA12_0=='/') ) {s = 46;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 47;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||LA12_0=='+'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 118;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( ((LA12_45>='\u0000' && LA12_45<='\uFFFF')) ) {s = 118;}

                        else s = 48;

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