package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil1.gruppe1;

public class Eis {wcwec
	String name;
	double preis;
	String behaeltnis;
	String art;
	String[] sorte = {"Vanille","Schoko","Muffin"};
	String[] extra = {"Vanille", "Schoko"};
	
	/*
	 *  Konstruktor eigentlich unnötig oder ?
	 */

		Eis(String name, String behaeltnis, String art, String[] sorte, String[] extra){
			this.name = name;
			this.behaeltnis = behaeltnis;
			this.art = art;
			this.sorte = sorte;
			this.extra = extra;
		}

	String name(String name){
		this.name = name;
		return name;
	}

	double preis(double preis){
		this.preis = preis;
		return preis;
	}

	String behaeltnis(String behaeltnis){
		this.behaeltnis = behaeltnis;
		return behaeltnis;
	}

	String art(String art){
		this.art = art;
		return art;
	}

	String [] sorten(String [] sorte){
		this.sorte = sorte;
		return sorte;
			
	}

	String [] extras(String[] extra){
		this.extra = extra;
		return extra;
	}
	
	void vorbereiten(){
		System.out.println("Ihr " + this.behaeltnis + " wird vorbereitet!");
		
	}
	
	void fuellen(){
		System.out.println("Ihr " + this.behaeltnis + " mit der Sorte " + this.sorte + " und der Art " + this.art + " gefüllt!");
	}
	
	void dekorieren(){
		
	}


}
