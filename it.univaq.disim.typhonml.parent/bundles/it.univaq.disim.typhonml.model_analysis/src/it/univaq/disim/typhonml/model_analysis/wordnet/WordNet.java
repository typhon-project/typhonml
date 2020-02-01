package it.univaq.disim.typhonml.model_analysis.wordnet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.dictionary.Dictionary;

public class WordNet {

	private String JWNL_CONFIGURATION_FILEPATH = "/configuration/wordnet_config.xml";
	private static Dictionary wordNetDictionary = null;
	private Map<String,String> _nounToLemma;

	/* encapsulate the part-of-speech static variables here */
	public static final POS NOUN = POS.NOUN;
	public static final POS VERB = POS.VERB;
	public static final POS ADJ = POS.ADJECTIVE;
	public static final POS ADV = POS.ADVERB;

	public WordNet() {
		try {
//			JWNL.initialize(new FileInputStream(JWNL_CONFIGURATION_FILEPATH));
			JWNL.initialize(
					new FileInputStream(getFilePath(getBundle().getResource(JWNL_CONFIGURATION_FILEPATH).getPath())));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JWNLException e) {
			e.printStackTrace();
		}
		wordNetDictionary = Dictionary.getInstance();
	}

//	public boolean checkifWordExists(String r) {
//		boolean flag = false;
//		try {
//			IndexWord word = wordNetDictionary.getIndexWord(NOUN, r);
//			if (word != null) {
//				flag = true;
//			}
//		} catch (JWNLException ex) {
//			return false;
//		}
//		return flag;
//	}
	
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
	
	public boolean checkIfWordPlural(String r) {
	    if( _nounToLemma == null ) _nounToLemma = new HashMap<String, String>();

	    // save time with a table lookup
	    if( _nounToLemma.containsKey(r) ) return true;

	    try {
	      // don't return lemmas for hyphenated words
	      if( r.indexOf('-') > -1 || r.indexOf('/') > -1 ) {
	        _nounToLemma.put(r, null);
	        return false;	
	      }

	      // get the lemma
	      IndexWord iword = Dictionary.getInstance().lookupIndexWord(POS.NOUN, r);
	      if( iword == null ) {
	        _nounToLemma.put(r, null);
	        return false;
	      }
	      else {
	        String lemma = iword.getLemma();


	        if( r.equals(lemma) ) {
	          // Some nouns have their plural in WordNet as a strange rare word (e.g. devices).
	          // Here we guess the single form, and return it if the guess exists (e.g. device).
	          if( r.endsWith("es") ) {
	            String guess = r.substring(0, r.length()-1);
	            IndexWord iGuess = Dictionary.getInstance().lookupIndexWord(POS.NOUN, guess);
	            if( iGuess != null && guess.equals(iGuess.getLemma()) ) {
	              lemma = guess;
//	              System.out.println("WORDNET guessed singular: " + lemma + " from " + word);
	            }
	          }
	          
	          // "men" and "businessmen" are in WordNet as lemmas ... we need to get the singular man
	          else if( r.endsWith("men") ) {
	            String guess = r.substring(0, r.length()-2) + "an";
	            IndexWord iGuess = Dictionary.getInstance().lookupIndexWord(POS.NOUN, guess);
	            if( iGuess != null && guess.equals(iGuess.getLemma()) ) {
	              lemma = guess;
//	              System.out.println("WORDNET guessed singular: " + lemma + " from " + word);
	            }
	          }
	          
	          else if( r.equals("people") )
	            return true;
	        }
	        
	        if( lemma.indexOf(' ') != -1 ) // Sometimes it returns a two word phrase
	          lemma = lemma.trim().replace(' ','_');
	        
	        _nounToLemma.put(r, lemma);
	        return true;
	      }
	    } catch( Exception ex ) { ex.printStackTrace(); }

	    return false;
	  }
	
	
	public boolean isPrefix(String s1, String s2) { 
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s2.length() ; i++) {
			sb.append(s2.charAt(i));
			if(count > 1) {
				if(s1.startsWith(sb.toString())) {
					return true;
				}
			}
			count++;
		}
		return false;
	} 
	
	public boolean isSuffix(String s1, String s2) { 
		String s1Reverse = null;
		for(int i = s1.length() - 1; i >= 0; i--){
			s1Reverse = s1Reverse + s1.charAt(i);
        }
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = s2.length()-1; i >=0 ; i--) {
			sb.append(s2.charAt(i));
			if(count > 1) {
				if(s1Reverse.startsWith(sb.toString())){
					return true;
				}
			}
			count++;
		}
		
		return false;
	} 
	
	private String getFilePath(String path) {
		Bundle bundle = getBundle();
		URL fileURL = bundle.getResource(path);
		String finalPath = "";
		try {
			finalPath = FileLocator.resolve(fileURL).getFile();
			return java.nio.file.Paths.get(finalPath).normalize().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finalPath;
	}
	
	private Bundle getBundle() {
		//return Platform.getBundle("TyphonMLWordNetUtility");
		return FrameworkUtil.getBundle(getClass());
	}

	public static void main(String[] args) throws JWNLException {
		WordNet wn = new WordNet();
		String toTest = "house";

		System.out.println(wn.checkifWordExists(toTest));

	}

}
