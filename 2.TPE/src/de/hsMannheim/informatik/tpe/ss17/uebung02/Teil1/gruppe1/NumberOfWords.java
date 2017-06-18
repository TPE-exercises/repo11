package aufgabe5nr3;

public class NumberOfWords implements Comparable<NumberOfWords> {

	private int quantity;
	private String word;

	public NumberOfWords(String w, int q) {
		quantity = q;
		word = w;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getWord() {
		return word;
	}

	/**
	 * compare two words from the class
	 */
	public int compareTo(NumberOfWords o) {
		return Integer.compare(quantity, o.getQuantity());
	}

}