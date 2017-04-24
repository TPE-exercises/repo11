package maxMinSuche;
public class ProgrammMaxSuche {

	public static void main(String[] args) {
		
		int [] a = { 10, 5, 17, 12, 9, 11, 3, 20 };
		
		
		int merker = a[0];
		int c = 0;
		while (c < a.length){
			if (a[c] > merker)
				merker = a[c];
			c++;
		}
		
		System.out.println(merker);
	}

}

