package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;
/**
 * 
 * Zuständig für das Entfernen der Elemente  im Ringpuffer
 * 
 * @author repo11
 *
 */
public class getThread extends Thread {

	Ringpuffer rp;
	private String name;
	private int time;

	getThread(Ringpuffer rp, int time, String name) {
		this.rp = rp;
		this.time = time;
		this.name = name;
	}
	/**
	 * Threads werden gestartet
	 */
	public void run() {
		while (!isInterrupted()) {
			try {
				System.out.println(name + ":" + rp.get());
			} catch (InterruptedException e) {

				interrupt();
			}
		}
	}

}
