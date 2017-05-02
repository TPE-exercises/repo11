package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil1.gruppe1;

import java.util.Scanner;

public class Köln extends Eisdiele{

	String[] extra = {"Sahne", "Soße", "Bierteig"};
	String [] Eiskreationen = {"Spaghettieis","Bananasplitt", "Dom", "FCK", "Museum Ludwig"};


	void vorbereiten(){
		System.out.println("Ihr Behältnis wird vorbereitet!");

	}

	void fuellen(){
		System.out.println("Ihr Behältnis mit Ihrer gewünschten Sorte und der Art wird gefüllt!");
	}

	void dekorieren(){
		System.out.println("Ihre Eiskreation wird mit Ihrem Extra dekoriert!");


	}



	public void bestellen(String typ){
		boolean nichtEnthalten ;
		System.out.print("Welche Eiskreationen möchten Sie?");	
		nichtEnthalten = this.scanner(Eiskreationen);

		if(nichtEnthalten == false){
			System.out.print("Welches Behältnis möchten Sie?");
			nichtEnthalten = this.scanner(Behältnis);
			this.vorbereiten();
		}
		//	nichtEnthalten = this.scanner();

		if(nichtEnthalten == false){
			System.out.print("Welche Art möchten Sie");
			nichtEnthalten = this.scanner(Art);
 
		}

		//	nichtEnthalten = this.scanner();

		if(nichtEnthalten == false){
			System.out.print("Welche Sorten möchten Sie?");
			nichtEnthalten = this.scanner(this.sorte);
			this.fuellen();
		}
		//	nichtEnthalten = this.scanner();
		if(nichtEnthalten == false){
			System.out.print("Welche Extras möchten Sie?");
			nichtEnthalten = this.scanner(this.extra);
			this.dekorieren();
			System.out.println();


		}

		System.out.println("Lassen Sie sich ihr Eis schmecken!");

	}

	void begruessen(){
		System.out.println("Daach zesamme!");

	}

	void kassieren(){
		System.out.println(this.preis + " € bitte!");


	}

	void verabschieden(){
		System.out.println("Tschö!");
	}

	void entschuldigen(){
		System.out.println("Dat deit mer leid, habe ma ned, stattdess'?");

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

	public Eis erstellen(String typ) {
		return null;
	}

}
