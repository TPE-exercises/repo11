package suchen;

public class sequSuche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] F = { 2, 4, 10, 8, 17};
		int gesuchteZahl = 8;
		boolean stimmt = true;
		
		for(int x = 0; x < F.length; x++)
			if (F[x] == gesuchteZahl && stimmt){
				System.out.println("Gesuchte Indexstelle: " + x);
				stimmt = false;
			}
		
		if(stimmt){
			System.out.println("Die Zahl befindet sich nicht im Array");
			
		}

	}

}
