package interfaces;
public class InterfaceTest4 {

	public static void main(String[] args) {
		
		InterfaceTest2 testen = new InterfaceTest2();
		
		testen.fliegen();
		testen.tanken();
		
		int[] array = {10, 20, 30, 40, 50};
		String [] hey = {"Hallo", "was", "machst", "du"};
		
		for (int funkts : array){
			System.out.println(funkts);
		}
		
		for (String malSchauen : hey){
			System.out.println(malSchauen);
		}
		



	}

}
