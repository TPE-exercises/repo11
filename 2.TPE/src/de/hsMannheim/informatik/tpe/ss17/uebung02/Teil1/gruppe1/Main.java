package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil1.gruppe1;

public class Main {

	public static void main(String[] args) {

		String[] sorte = { "Vanille" };
		
		Eiskarte karte = new Eiskarte();
		karte.karte();

		Eisdiele eisbestellen = new Eisdiele();
		
		eisbestellen.behaeltnis("Waffel");
		eisbestellen.sorten(sorte);
		eisbestellen.art("Bälle");
		eisbestellen.name("Spaghettieis");
		
		eisbestellen.vorbereiten();
		eisbestellen.fuellen();
		eisbestellen.dekorieren();
		
		eisbestellen.begruessen();
		eisbestellen.bestellen("");
		eisbestellen.kassieren();
		eisbestellen.verabschieden();
		
		

	}

}
