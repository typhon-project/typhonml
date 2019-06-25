/**
 */
package typhonml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nlp Task Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see typhonml.TyphonmlPackage#getNlpTaskType()
 * @model
 * @generated
 */
public enum NlpTaskType implements Enumerator {
	/**
	 * The '<em><b>Paragraph Segmentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_SEGMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH_SEGMENTATION(0, "ParagraphSegmentation", "ParagraphSegmentation"),

	/**
	 * The '<em><b>Sentence Segmentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCE_SEGMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	SENTENCE_SEGMENTATION(1, "SentenceSegmentation", "SentenceSegmentation"),

	/**
	 * The '<em><b>Tokenisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKENISATION_VALUE
	 * @generated
	 * @ordered
	 */
	TOKENISATION(2, "Tokenisation", "Tokenisation"),

	/**
	 * The '<em><b>Phrase Extractor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHRASE_EXTRACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PHRASE_EXTRACTOR(3, "PhraseExtractor", "PhraseExtractor"),

	/**
	 * The '<em><b>NGram Extractor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGRAM_EXTRACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	NGRAM_EXTRACTOR(4, "NGramExtractor", "NGramExtractor"),

	/**
	 * The '<em><b>POS Tagging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POS_TAGGING_VALUE
	 * @generated
	 * @ordered
	 */
	POS_TAGGING(5, "POSTagging", "POSTagging"),

	/**
	 * The '<em><b>Lemmatisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEMMATISATION_VALUE
	 * @generated
	 * @ordered
	 */
	LEMMATISATION(6, "Lemmatisation", "Lemmatisation"),

	/**
	 * The '<em><b>Stemming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEMMING_VALUE
	 * @generated
	 * @ordered
	 */
	STEMMING(7, "Stemming", "Stemming"),

	/**
	 * The '<em><b>Dependency Parsing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_PARSING_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCY_PARSING(8, "DependencyParsing", "DependencyParsing"),

	/**
	 * The '<em><b>Chunking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHUNKING_VALUE
	 * @generated
	 * @ordered
	 */
	CHUNKING(9, "Chunking", "Chunking"),

	/**
	 * The '<em><b>Sentiment Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTIMENT_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	SENTIMENT_ANALYSIS(10, "SentimentAnalysis", "SentimentAnalysis"),

	/**
	 * The '<em><b>Text Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_CLASSIFICATION(11, "TextClassification", "TextClassification"),

	/**
	 * The '<em><b>Topic Modelling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOPIC_MODELLING_VALUE
	 * @generated
	 * @ordered
	 */
	TOPIC_MODELLING(12, "TopicModelling", "TopicModelling"),

	/**
	 * The '<em><b>Term Extraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERM_EXTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	TERM_EXTRACTION(13, "TermExtraction", "TermExtraction"),

	/**
	 * The '<em><b>Named Entity Recognition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMED_ENTITY_RECOGNITION_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED_ENTITY_RECOGNITION(14, "NamedEntityRecognition", "NamedEntityRecognition"),

	/**
	 * The '<em><b>Relation Extraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATION_EXTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	RELATION_EXTRACTION(15, "RelationExtraction", "RelationExtraction"),

	/**
	 * The '<em><b>Event Extraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_EXTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_EXTRACTION(16, "EventExtraction", "EventExtraction"),

	/**
	 * The '<em><b>Coreference Resolution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COREFERENCE_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	COREFERENCE_RESOLUTION(17, "CoreferenceResolution", "CoreferenceResolution");

	/**
	 * The '<em><b>Paragraph Segmentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_SEGMENTATION
	 * @model name="ParagraphSegmentation"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_SEGMENTATION_VALUE = 0;

	/**
	 * The '<em><b>Sentence Segmentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTENCE_SEGMENTATION
	 * @model name="SentenceSegmentation"
	 * @generated
	 * @ordered
	 */
	public static final int SENTENCE_SEGMENTATION_VALUE = 1;

	/**
	 * The '<em><b>Tokenisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKENISATION
	 * @model name="Tokenisation"
	 * @generated
	 * @ordered
	 */
	public static final int TOKENISATION_VALUE = 2;

	/**
	 * The '<em><b>Phrase Extractor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHRASE_EXTRACTOR
	 * @model name="PhraseExtractor"
	 * @generated
	 * @ordered
	 */
	public static final int PHRASE_EXTRACTOR_VALUE = 3;

	/**
	 * The '<em><b>NGram Extractor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGRAM_EXTRACTOR
	 * @model name="NGramExtractor"
	 * @generated
	 * @ordered
	 */
	public static final int NGRAM_EXTRACTOR_VALUE = 4;

	/**
	 * The '<em><b>POS Tagging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POS_TAGGING
	 * @model name="POSTagging"
	 * @generated
	 * @ordered
	 */
	public static final int POS_TAGGING_VALUE = 5;

	/**
	 * The '<em><b>Lemmatisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEMMATISATION
	 * @model name="Lemmatisation"
	 * @generated
	 * @ordered
	 */
	public static final int LEMMATISATION_VALUE = 6;

	/**
	 * The '<em><b>Stemming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEMMING
	 * @model name="Stemming"
	 * @generated
	 * @ordered
	 */
	public static final int STEMMING_VALUE = 7;

	/**
	 * The '<em><b>Dependency Parsing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_PARSING
	 * @model name="DependencyParsing"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_PARSING_VALUE = 8;

	/**
	 * The '<em><b>Chunking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHUNKING
	 * @model name="Chunking"
	 * @generated
	 * @ordered
	 */
	public static final int CHUNKING_VALUE = 9;

	/**
	 * The '<em><b>Sentiment Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTIMENT_ANALYSIS
	 * @model name="SentimentAnalysis"
	 * @generated
	 * @ordered
	 */
	public static final int SENTIMENT_ANALYSIS_VALUE = 10;

	/**
	 * The '<em><b>Text Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_CLASSIFICATION
	 * @model name="TextClassification"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_CLASSIFICATION_VALUE = 11;

	/**
	 * The '<em><b>Topic Modelling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOPIC_MODELLING
	 * @model name="TopicModelling"
	 * @generated
	 * @ordered
	 */
	public static final int TOPIC_MODELLING_VALUE = 12;

	/**
	 * The '<em><b>Term Extraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERM_EXTRACTION
	 * @model name="TermExtraction"
	 * @generated
	 * @ordered
	 */
	public static final int TERM_EXTRACTION_VALUE = 13;

	/**
	 * The '<em><b>Named Entity Recognition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMED_ENTITY_RECOGNITION
	 * @model name="NamedEntityRecognition"
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_ENTITY_RECOGNITION_VALUE = 14;

	/**
	 * The '<em><b>Relation Extraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATION_EXTRACTION
	 * @model name="RelationExtraction"
	 * @generated
	 * @ordered
	 */
	public static final int RELATION_EXTRACTION_VALUE = 15;

	/**
	 * The '<em><b>Event Extraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_EXTRACTION
	 * @model name="EventExtraction"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_EXTRACTION_VALUE = 16;

	/**
	 * The '<em><b>Coreference Resolution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COREFERENCE_RESOLUTION
	 * @model name="CoreferenceResolution"
	 * @generated
	 * @ordered
	 */
	public static final int COREFERENCE_RESOLUTION_VALUE = 17;

	/**
	 * An array of all the '<em><b>Nlp Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NlpTaskType[] VALUES_ARRAY =
		new NlpTaskType[] {
			PARAGRAPH_SEGMENTATION,
			SENTENCE_SEGMENTATION,
			TOKENISATION,
			PHRASE_EXTRACTOR,
			NGRAM_EXTRACTOR,
			POS_TAGGING,
			LEMMATISATION,
			STEMMING,
			DEPENDENCY_PARSING,
			CHUNKING,
			SENTIMENT_ANALYSIS,
			TEXT_CLASSIFICATION,
			TOPIC_MODELLING,
			TERM_EXTRACTION,
			NAMED_ENTITY_RECOGNITION,
			RELATION_EXTRACTION,
			EVENT_EXTRACTION,
			COREFERENCE_RESOLUTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Nlp Task Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NlpTaskType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nlp Task Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NlpTaskType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NlpTaskType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nlp Task Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NlpTaskType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NlpTaskType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nlp Task Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NlpTaskType get(int value) {
		switch (value) {
			case PARAGRAPH_SEGMENTATION_VALUE: return PARAGRAPH_SEGMENTATION;
			case SENTENCE_SEGMENTATION_VALUE: return SENTENCE_SEGMENTATION;
			case TOKENISATION_VALUE: return TOKENISATION;
			case PHRASE_EXTRACTOR_VALUE: return PHRASE_EXTRACTOR;
			case NGRAM_EXTRACTOR_VALUE: return NGRAM_EXTRACTOR;
			case POS_TAGGING_VALUE: return POS_TAGGING;
			case LEMMATISATION_VALUE: return LEMMATISATION;
			case STEMMING_VALUE: return STEMMING;
			case DEPENDENCY_PARSING_VALUE: return DEPENDENCY_PARSING;
			case CHUNKING_VALUE: return CHUNKING;
			case SENTIMENT_ANALYSIS_VALUE: return SENTIMENT_ANALYSIS;
			case TEXT_CLASSIFICATION_VALUE: return TEXT_CLASSIFICATION;
			case TOPIC_MODELLING_VALUE: return TOPIC_MODELLING;
			case TERM_EXTRACTION_VALUE: return TERM_EXTRACTION;
			case NAMED_ENTITY_RECOGNITION_VALUE: return NAMED_ENTITY_RECOGNITION;
			case RELATION_EXTRACTION_VALUE: return RELATION_EXTRACTION;
			case EVENT_EXTRACTION_VALUE: return EVENT_EXTRACTION;
			case COREFERENCE_RESOLUTION_VALUE: return COREFERENCE_RESOLUTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NlpTaskType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NlpTaskType
