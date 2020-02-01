package it.univaq.disim.typhonml.evaluator.wordnet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.dictionary.Dictionary;

public class WordNet {

	private String JWNL_CONFIGURATION_FILEPATH = "configuration/wordnet_config.xml";
	private static Dictionary wordNetDictionary = null;

	/* encapsulate the part-of-speech static variables here */
	public static final POS NOUN = POS.NOUN;
	public static final POS VERB = POS.VERB;
	public static final POS ADJ = POS.ADJECTIVE;
	public static final POS ADV = POS.ADVERB;

	public WordNet() {
		try {
			JWNL.initialize(new FileInputStream(JWNL_CONFIGURATION_FILEPATH));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JWNLException e) {
			e.printStackTrace();
		}
		wordNetDictionary = Dictionary.getInstance();
	}

	public boolean checkifWordExists(String r) {
		boolean flag = false;
		try {
			IndexWord word = wordNetDictionary.getIndexWord(NOUN, r);
			if (word != null) {
				flag = true;
			}
		} catch (JWNLException ex) {
			return false;
		}
		return flag;
	}

	public static void main(String[] args) throws JWNLException {
		WordNet wn = new WordNet();
		String toTest = "house";

		System.out.println(wn.checkifWordExists(toTest));

	}

}
