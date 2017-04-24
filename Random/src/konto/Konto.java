package konto;


public class Konto {
	
	protected static String Kontonummer;
	double Kontostand;
	
	
	// dank this. können wir für die Parameter und Variablen dieselben Namen verwenden
	
	

	Konto(String Kontonummer, double Kontostand){
		this.Kontonummer = Kontonummer;
		this.Kontostand = Kontostand;	
		
		
	}
	
	double getKontostand(){
		return Kontostand;
	}
	
	String getKontonummer(){
		return Kontonummer;
		
		// bei return Datentyp im Methodenkopf angeben, bei void nicht 
	}
	
	void einzahlen(double einzahlen){
		Kontostand += einzahlen;
		
	}
	
	void auszahlen(double auszahlen){
		Kontostand -=  auszahlen;
	}
	
	
	
	
	
	

}
