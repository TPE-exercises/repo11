package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil1.gruppe1;

import java.util.Scanner;

public class M�nchen extends Eisdiele{

	String[] extra = {"Sahne", "So�e", "Brezle"};
	String [] Eiskreationen = {"Spaghettieis","Bananasplitt", "Allianz Arena", "FCB", "Oktoberfest"};

	void vorbereiten(){
		System.out.println("Dein Beh�ltnis kummt soford!");
 
	}

	void fuellen(){
		System.out.println("Dein Beh�ltnis mit deiner gew�nschten Sort' und Art wird gef�lld!");
	}

	void dekorieren(){
		System.out.println("Dei' Eiskreatio' wird mit Extra dekoriert!");

	}

	public void bestellen(String typ){
		boolean nichtEnthalten ;
		System.out.print("Wad willst f�r Sort' ?");	
		nichtEnthalten = this.scanner(Eiskreationen);

		if(nichtEnthalten == false){
			System.out.print("In was willsch dat?");
			nichtEnthalten = this.scanner(Beh�ltnis);
			this.vorbereiten();
		}
		//	nichtEnthalten = this.scanner();

		if(nichtEnthalten == false){
			System.out.print("Welsche Ard?");
			nichtEnthalten = this.scanner(Art);

		}

		//	nichtEnthalten = this.scanner();

		if(nichtEnthalten == false){
			System.out.print("Welche Sorte' willsch?");
			nichtEnthalten = this.scanner(this.sorte);
			this.fuellen();
		}
		//	nichtEnthalten = this.scanner();
		if(nichtEnthalten == false){
			System.out.print("Was f�r Extra?");
			nichtEnthalten = this.scanner(this.extra);
			this.dekorieren();
			System.out.println();


		}

		System.out.println("Gudden!");

	}

	void begruessen(){
		System.out.println("Gr�� di'!");

	}

	void kassieren(){
		System.out.println(this.preis + " bidde!");


	}

	void verabschieden(){
		System.out.println("Pf�adi!");
	}

	void entschuldigen(){
		System.out.println("Habe ma net, wad anderes?");

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

	@Override
	public Eis erstellen(String typ) {
		// TODO Auto-generated method stub
		return null;
	}

}


