package aufgabe5nr3;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class ReadWords {

	private Map<String, Integer> wordmap = new HashMap<>();

	public ReadWords(Path txtfile) throws IOException {
		countingWords(txtfile);
	}

	/**
	 * read the file an put the word in a hashtable
	 * 
	 */
	private void countingWords(Path file) throws IOException {
		Scanner sc = new Scanner(file).useDelimiter(" +|(\r\n|\r|\n)");
		while (sc.hasNext()) {
			String word = sc.next().toLowerCase();
			removePunctuationMarks(word);
			if (isLegalWord(word)) {
				if (wordmap.containsKey(word)) {
					wordmap.put(word, wordmap.get(word) + 1);
				} else {
					wordmap.put(word, 1);
				}
			}
		}
		sc.close();

	}

	/**
	 * Removes all illegal char from the words
	 * 
	 * @param string
	 * 
	 */
	private void removePunctuationMarks(String str) {
		str.replaceAll("(),.:;!?", "");
	}

	/**
	 * @return the new hashmap
	 */
	public Map<String, Integer> getWords() {
		return new HashMap<String, Integer>(wordmap);

	}

	/**
	 * Checks if the Word contains only letter
	 * 
	 */
	public boolean isLegalWord(String word) {
		if (word.length() == 0) {
			return false;
		}
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter < 61 || letter > 122) {
				return false;
			}
		}
		return true;

	}
}
