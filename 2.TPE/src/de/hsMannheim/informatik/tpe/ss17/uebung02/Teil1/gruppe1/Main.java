package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil2.gruppe1;
import static gdi.MakeItSimple.*;
public class Main {


	public static void main(String[] args) {
		CrypterCaesar my = new CrypterCaesar();
		CrypterReverse my1 = new CrypterReverse();
		System.out.println(my.encrypt("xyz"));
	System.out.println(my1.decrypt("XHMSNYYXYJQQJS"));
    System.out.println(my.decrypt(my1.decrypt("XHMSNYYXYJQQJS")));
    System.out.println(my1.decrypt("nelletsttinhcs"));

	}
	
	

}

	

