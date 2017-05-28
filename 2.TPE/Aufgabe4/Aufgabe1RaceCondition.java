package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

/**
 * Unser Beispiel bezieht sich auf das Problem von Safety Hazards, in
 * unserem Fall race condition. 
 * Zwei Threads versuchen gleichzeitig, eine Variable hochzuzählen und arbeiten somit mit
 * falschen Werten. Das Ergebnis beim Ausführen derselben Methode bei derselben Variablen
 * ist unterschieldich.
 * 
 * @author Gruppe 1,1
 */

public class Aufgabe1RaceCondition extends Thread {

	String name;
	static int x = 0;
	/**
	 * 
	 * @param s wird Konstruktor übergeben
	 */


	public Aufgabe1RaceCondition(String s) {
		this.name = s;
	}

	public void run(){
		for (int i = 0; i < 10000000; i++) {
			x = x + 1;
		}

		System.out.println(x + " name");
	}

	public static void main(String[] args) {

		Aufgabe1RaceCondition t1 = new Aufgabe1RaceCondition("a");
		Aufgabe1RaceCondition t2 = new Aufgabe1RaceCondition("b");

		t1.start();
		t2.start();

	}
	
}
