package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil1.gruppe1;
import java.util.*;
public abstract class Eisdiele extends Eis{


	void vorbereiten(){
		System.out.println("Ihr Beh�ltnis wird vorbereitet!");
 
	}

	void fuellen(){
		System.out.println("Ihr Beh�ltnis mit Ihrer gew�nschten Sorte und der Art wird gef�llt!");
	}

	void dekorieren(){
		System.out.println("Ihre Eiskreation wird mit Ihrem Extra dekoriert!");


	}



	public void bestellen(String typ){
		boolean nichtEnthalten ;
		System.out.print("Welche Eiskreationen m�chten Sie?");	
		nichtEnthalten = this.scanner(Eiskreationen);

		if(nichtEnthalten == false){
			System.out.print("Welches Beh�ltnis m�chten Sie?");
			nichtEnthalten = this.scanner(Beh�ltnis);
			this.vorbereiten();


		}
		//	nichtEnthalten = this.scanner();

		if(nichtEnthalten == false){
			System.out.print("Welche Art m�chten Sie?");
			nichtEnthalten = this.scanner(Art);

		}

		//	nichtEnthalten = this.scanner();

		if(nichtEnthalten == false){
			System.out.print("Welche Sorte m�chten Sie?");
			nichtEnthalten = this.scanner(this.sorte);
			this.fuellen();
		}
		//	nichtEnthalten = this.scanner();
		if(nichtEnthalten == false){
			System.out.print("Welche Extras m�chten Sie?");
			nichtEnthalten = this.scanner(this.extra);
			this.dekorieren();
			System.out.println();


		}

		System.out.println("Lassen Sie sich ihr Eis schmecken!");

	}

	void begruessen(){
		System.out.println("Hallo!");

	}

	void kassieren(){
		System.out.println(this.preis + " � bitte!");


	}

	void verabschieden(){
		System.out.println("Tsch�ss, auf Wiedersehen!");
	}

	void entschuldigen(){
		System.out.println("Tut mir leid, das haben wir leider nicht, was h�tten Sie stattdessen gerne!");

	}
	boolean scanner(String [] array){
		String eingabe = "";
		Scanner sc = new Scanner(System.in);
		eingabe = sc.nextLine();
		boolean nichtEnthalten = true;
		if (eingabe.equals("nichts")) {
			nichtEnthalten=false;
			return nichtEnthalten=false;
		}

		for (int i = 0; i < array.length; i++) {
			if (eingabe.equals(array[i])){
				nichtEnthalten = false;
				preis++;
				break;
			}
		}
		if(nichtEnthalten){
			this.entschuldigen();
		}


		return nichtEnthalten;	
	}

	public abstract Eis erstellen(String typ);

}

