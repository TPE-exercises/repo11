package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;
/**
 * 
 * starvation(aushungern) bedeutet, dass ein thread vernachlässigt wird,
 * weil der andere thread bevorzugt wird.
 * Der Grund dafür ist das der andere thread eine höhere priorität besitzt
 * und dadurch dieser bevorzugt wird.
 * 
 * 
 *
 */
public class Aufgabe1Starvation3 {

	public static void main(String[] args) {
		Aufgabe1Starvation1 nummber = new Aufgabe1Starvation1(25);

		Aufgabe1Starvation2 thread1 = new Aufgabe1Starvation2(nummber, "Thread1");
		Aufgabe1Starvation2 thread2 = new Aufgabe1Starvation2(nummber, "Thread2 Starvation");

		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);

		thread1.start();
		thread2.start();

	}

}
