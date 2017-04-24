package konto;

public class Kontotest {

	public static void main(String[] args) {
		
		
		/**
		 * test ist vom Typ Klasse, aber kann es auﬂer null einen anderen Wert annehmen?
		 */
		Konto test = null;
		
		System.out.println(test);

		String [] names = {"Peter", "Ali"};
		searchName("Peter", names);


		Konto Anlegen = new Konto("0000000001", 10000);

		System.out.println(Anlegen.getKontonummer());
		System.out.println(Anlegen.getKontostand());
		Anlegen.einzahlen(500);
		Anlegen.auszahlen(750.50);
		System.out.println(Anlegen.getKontostand());

		// ist static 
		System.out.println(Konto.Kontonummer);

		// wurde in derselben Klasse initalisiert, siehe unten
		System.out.println(gut);


	}

	static int gut = 10;
	
	

	static int searchName(String name, String [] names){

		for(int i = 0; i<names.length; i++)
		if(name.equals(names[i])){
			
			System.out.println("Den Namen gibt es schon");	

			return i;
			}
		System.out.println("Den Namen gibts es nicht");
		return 0;

	}

}
