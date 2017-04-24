package konto;

public class Girokontotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Girokonto extendsKonto = new Girokonto("00001", 751, -100);
		


		extendsKonto.einzahlen(500);
		extendsKonto.auszahlen(50);
		
		System.out.println(extendsKonto.getKontostand());
		System.out.println(extendsKonto.getLimit());
		
		



	}

}

