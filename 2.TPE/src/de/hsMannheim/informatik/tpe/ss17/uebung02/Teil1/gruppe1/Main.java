package aufgabe5nr3;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		Path txtfile = FileSystems.getDefault().getPath("Bibel.txt");

		long starttime = System.currentTimeMillis();
		Map<String, Integer> wordmap = new ReadWords(txtfile).getWords();
		List<NumberOfWords> sortedWords = loadMapIntoList(wordmap);

		Collections.sort(sortedWords, Collections.reverseOrder());

		List<NumberOfWords> cuttedList = cutList(sortedWords, 100);

		sortAlphabetical(cuttedList);

		long endtime = System.currentTimeMillis() - starttime;
      
		printList(cuttedList);

		System.out.println(endtime + "millisekunden");

	}

	public static List<NumberOfWords> cutList(List<NumberOfWords> list, int size) {
		if (list.size() > size) {
			return list = list.subList(0, size);
		}
		return list;
	}

	public static void printList(List<NumberOfWords> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i).getWord() + ": " + list.get(i).getQuantity());
		}
	}

	/**
	 * put the words and the numbers in a List
	 * 
	 */
	public static List<NumberOfWords> loadMapIntoList(Map<String, Integer> map) {
		List<NumberOfWords> list = new LinkedList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			list.add(new NumberOfWords(entry.getKey(), entry.getValue()));
		}
		return list;

	}

	/**
	 * Sorts the List alphabetical
	 * 
	 */
	public static void sortAlphabetical(List<NumberOfWords> list) {
		Collections.sort(list, new Comparator<NumberOfWords>() {

			public int compare(final NumberOfWords object1, final NumberOfWords object2) {
				return object1.getWord().compareTo(object2.getWord());
			}
		});

	}
}
