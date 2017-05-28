package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

/**
 * Das Beispiel bezieht sich auf Deadlock, einen Fall von liveness hazards.
 * Das Problem bei unserem Beispiel und Deadlocks ist, dass z.B. zwei Threads
 * aufeinander warten, um weitermachen zu können. Jedoch befinden sich 
 * bei unseren Methoden first und second in wait und kommen deshalb nie aus 
 * diesem Zustand raus, es führt zu einer Endlosschleife, das Programm terminert
 * nicht.
 * @author Gruppe 1,1
 *
 */

public class Aufgabe1Deadlock extends Thread {
	String name;
	Aufgabe1Deadlock2 abc;
	boolean flag;
	
	
	
	public Aufgabe1Deadlock(String a, Aufgabe1Deadlock2 b, boolean c) {
		name = a;
		abc = b;
		flag = c;
	}

	public void run() {
		System.out.println("Thread " + name + " starten");
		for (int i = 0; i < 3; i++) {
			if (flag) {
				abc.first();
			} else {
				abc.second();
			}
		}
		System.out.println("Thread " + name + " beenden");
	}

	public static void main(String[] args) {
		Aufgabe1Deadlock2 b = new Aufgabe1Deadlock2();

		Aufgabe1Deadlock thread1 = new Aufgabe1Deadlock("Eins", b, true);
		Aufgabe1Deadlock thread2 = new Aufgabe1Deadlock("Zwei", b, false);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Programm ist fertig");

	}
}
