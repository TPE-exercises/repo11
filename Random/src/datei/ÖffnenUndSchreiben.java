package datei;

import static gdi.MakeItSimple.*;

public class ÷ffnenUndSchreiben {

	public static void main(String[] args) {
		
		String name = "Ayaydin" , vorname = "Ferhat"; 
		int gebTag = 9 , gebMonat = 7 , gebJahr = 1995; 
		boolean verheiratet = false; 
		String strasse = "Weyltraﬂe"; 
		int hausnummer = 28, postleitzahl = 68167; 
		String wohnort = "Mannheim"; 
		
		Object datei = openOutputFile("C:/Users/abc/Desktop/File.txt");
		//WICHTIG
		
		
		//println(datei, name + " " + vorname);
		println(datei, name);
		println(datei, vorname);
		println(datei, gebTag + " " + gebMonat + " " + gebJahr + " " );
		if(verheiratet)
		println(datei, "t");
		else
			println(datei, "f");
		println(datei, strasse + " " + hausnummer + " " + wohnort);
		
		
		// WIVHTIG
		closeOutputFile(datei);
		
		}

}
