package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

public class Aufgabe1Starvation2 extends Thread{

	Aufgabe1Starvation1 number;
	String name;

	public Aufgabe1Starvation2(Aufgabe1Starvation1 r, String n) {
		number = r;
		name = n;
	}

	public void run() {
		while (true) {
			synchronized (number) {
				System.out.println(name + ": "+number.getNumber());
			}
		}
	}
}
