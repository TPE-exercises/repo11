package maxMinSuche;

public class ProgrammMinSuche {

	public static void main(String[] args) {

		int [] a = { 11, 7, 8, 3, 15, 13, 9, 19, 18, 10, 4 };
		int merker = a[0];
		int i = 0;
		while (i < a.length) {
			if (a[i] < merker)
				merker = a[i];
			i = i + 1;
		}
		
			System.out.println(merker);
		}

}
