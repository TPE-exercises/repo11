package rechteck;

import java.util.Scanner;

public class Rechteck {
	
	double laenge;
	double breite;
	
	{
	
	System.out.println("Länge eingeben:");
	Scanner scan = new Scanner (System.in);
	laenge = scan.nextInt();
	
	System.out.println("Breite eingeben:");
	Scanner scani = new Scanner(System.in);
	breite = scani.nextInt();
	
	}
	
	// ich könnte auch void setBreite, also Setter verwenden, aber was hab ich davon?	
	void Breite(double a){
		breite = a;
	}
	
	double getLangeSeite(){
		if (laenge > breite)
			return laenge;
		else return breite;
	}	
		
	double getKurzeSeite(){
		if (laenge < breite)
			return laenge;
		else return breite;
	}
	
	double getDiagonale(){
		return Math.sqrt(laenge*laenge + breite*breite);
		
	}
	
	double getFlaeche(){
		return breite * laenge;
	}
	
	double getUmfang(){
		return ((laenge*2) + (breite*2));
		
	}
	
	void laengeAusgeben(){
		double laenge = 5.4;
		System.out.println("Länge: " + laenge);
		
	}
	
}