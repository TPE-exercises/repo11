package konto;


public class Girokonto extends Konto {

	double Kreditlimit;
	

	Girokonto(String Kontonummer, double Kontostand, double Kreditlimit) {
		super(Kontonummer, Kontostand);

		this.Kreditlimit = Kreditlimit;

	}


	// mit get-Methoden geben wir aus

	double getLimit(){
		return Kreditlimit;
	}

	// mit set-Methoden setzen wir 

	void setLimit(double neuesLimit){
		Kreditlimit = neuesLimit;
	}

	// die Methode void auszahlen mit einem Parameter (double auszahlen) wurde überschrieben,
	// wenn man mehr Paramter als in der eigentlichen Methode setzt, ensteht eine eigene Methode 
	// und es werden falsche Ergebnisse geliefert
	
	
	void auszahlen(double auszahlen, double d){
		super.auszahlen(auszahlen);
		if(Kontostand - auszahlen>=Kreditlimit)
			Kontostand -=  auszahlen;
		else 
			System.out.println("Limit überschritten" + "(" + Kreditlimit + ")" + "," + "keine Geldauszahlung möglich!");

	}




}


