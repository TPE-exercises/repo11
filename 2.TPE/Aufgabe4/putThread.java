package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

import java.util.Random;

/**
 * Zust�ndig f�r das einf�gen der Elemente im Ringpuffer
 * 
 * @author repo 11
 *
 */
public class putThread extends Thread {

	Ringpuffer rp;
	private String name;
	private int time;

	putThread(Ringpuffer rp, int time, String name) {
		this.rp = rp;
		this.time = time;
		this.name = name;
	}

	/**
	 * Threads die gestartet werden f�r die putMethode zust�ndig
	 */
	public void run() {
		while (!isInterrupted()) {

			try {
				Object element = (int) (Math.random() * 1000);
				sleep(time);
				rp.put(element);

				System.out.println(name + ":" + element);
			} catch (InterruptedException e) {

				interrupt();
			}
		}
	}
}
