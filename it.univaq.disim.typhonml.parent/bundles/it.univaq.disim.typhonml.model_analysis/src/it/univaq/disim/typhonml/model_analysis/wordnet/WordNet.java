package it.univaq.disim.typhonml.model_analysis.wordnet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.DictionaryElement;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;

public class WordNet {

	private static Dictionary wordNetDictionary = null;
	private Map<String, String> _nounToLemma;

	/* encapsulate the part-of-speech static variables here */
	public static final POS NOUN = POS.NOUN;
	public static final POS VERB = POS.VERB;
	public static final POS ADJ = POS.ADJECTIVE;
	public static final POS ADV = POS.ADVERB;

	public WordNet() {
		try {
			wordNetDictionary = Dictionary.getDefaultResourceInstance();
		} catch (JWNLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws JWNLException {
		String lemmaToTest = "OrderProduct";
		boolean exists = new WordNet().checkifWordExists(lemmaToTest);
		System.out.println(exists);
	}
	
	private String[] splitCamelCaseString(String wordToSplit){
		return wordToSplit.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");
	}

	public boolean checkifWordExists(String r) {
		String[] splittedString = splitCamelCaseString(r);
		boolean flag = false;
		for(String stringToCheck : splittedString) {
			try {
				IndexWord word = wordNetDictionary.getIndexWord(NOUN, stringToCheck);
				if (word != null) {
					flag = true;
				}else {
					flag = false;
				}
			} catch (JWNLException ex) {
				return false;
			}
		}
		return flag;
	}

	public boolean checkIfWordPlural(String r) {
		if (_nounToLemma == null)
			_nounToLemma = new HashMap<String, String>();

		// save time with a table lookup
		if (_nounToLemma.containsKey(r))
			return true;

		try {
			// don't return lemmas for hyphenated words
			if (r.indexOf('-') > -1 || r.indexOf('/') > -1) {
				_nounToLemma.put(r, null);
				return false;
			}

			// get the lemma
			IndexWord iword = wordNetDictionary.lookupIndexWord(POS.NOUN, r);
			if (iword == null) {
				_nounToLemma.put(r, null);
				return false;
			} else {
				String lemma = iword.getLemma();

				if (r.equals(lemma)) {
					// Some nouns have their plural in WordNet as a strange rare word (e.g.
					// devices).
					// Here we guess the single form, and return it if the guess exists (e.g.
					// device).
					if (r.endsWith("es")) {
						String guess = r.substring(0, r.length() - 1);
						IndexWord iGuess = wordNetDictionary.lookupIndexWord(POS.NOUN, guess);
						if (iGuess != null && guess.equals(iGuess.getLemma())) {
							lemma = guess;
//	              System.out.println("WORDNET guessed singular: " + lemma + " from " + word);
						}
					}

					// "men" and "businessmen" are in WordNet as lemmas ... we need to get the
					// singular man
					else if (r.endsWith("men")) {
						String guess = r.substring(0, r.length() - 2) + "an";
						IndexWord iGuess = wordNetDictionary.lookupIndexWord(POS.NOUN, guess);
						if (iGuess != null && guess.equals(iGuess.getLemma())) {
							lemma = guess;
//	              System.out.println("WORDNET guessed singular: " + lemma + " from " + word);
						}
					}

					else if (r.equals("people"))
						return true;
				}

				if (lemma.indexOf(' ') != -1) // Sometimes it returns a two word phrase
					lemma = lemma.trim().replace(' ', '_');

				_nounToLemma.put(r, lemma);
				return true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return false;
	}

	public boolean isPrefix(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s2.length(); i++) {
			sb.append(s2.charAt(i));
			if (count > 1) {
				if (s1.startsWith(sb.toString())) {
					return true;
				}
			}
			count++;
		}
		return false;
	}

	public boolean isSuffix(String s1, String s2) {
		String s1Reverse = null;
		for (int i = s1.length() - 1; i >= 0; i--) {
			s1Reverse = s1Reverse + s1.charAt(i);
		}

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = s2.length() - 1; i >= 0; i--) {
			sb.append(s2.charAt(i));
			if (count > 1) {
				if (s1Reverse.startsWith(sb.toString())) {
					return true;
				}
			}
			count++;
		}

		return false;
	}

}
