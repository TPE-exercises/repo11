package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil1.gruppe1;

public class Main {

	public static void main(String[] args) {
 
		
		Eiskarte karte = new Eiskarte();
		karte.karte();
		
//		EchteEisdiele eisbestellen = new EchteEisdiele();
//
//		eisbestellen.begruessen();
//		eisbestellen.bestellen("");
//		eisbestellen.kassieren();
//		eisbestellen.verabschieden();
		
		
		
		Mannheim bestellen = new Mannheim();

		bestellen.begruessen();
		bestellen.bestellen("");
		bestellen.kassieren();
		bestellen.verabschieden();
		
		

	}

}
