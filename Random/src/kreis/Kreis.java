package kreis;

import java.util.Scanner;

public class Kreis {
	
	double radius;

	
	Kreis (){
		radius = 0;	
		System.out.println("Bitte den Radius eingeben:");
		Scanner scan = new Scanner (System.in);
		radius = scan.nextInt();
	}
		
//	//Kreis(double r){
//	//	radius = r;	
//		
//	}
	
	double getRadius(){
		return radius;
	}
	
	//void setRadius(double r ){
	//	radius = r;
	//}
		
	double getUmfang(){
		return 2 * Math.PI * radius;
	}
	
	double getFlaeche(){
		return Math.PI * radius * radius;
	}

}
