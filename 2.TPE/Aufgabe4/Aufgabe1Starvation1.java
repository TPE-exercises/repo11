package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

public class Aufgabe1Starvation1 {
int num;
	
	public Aufgabe1Starvation1(int number) {
		num=number;
	}
	
	public synchronized int getNumber() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			return num;
		}
		return num;
	}

}
