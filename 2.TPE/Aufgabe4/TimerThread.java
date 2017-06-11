package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;
/**
 * Zuständig für die Programm Zeit der Threads 
 * @author Acer
 *
 */
public class TimerThread extends Thread{

	private long time;
	private Thread[] threads;

	
	TimerThread(double time, Thread array []) {
		this.time = (long) (time * 60 * 1000);
		threads = array;
	} 
    
	/**
	 * Threads Werden gestartet
	 * 
	 */
	public void run() {
		try {
			System.out.println("Zeit läuft: " + time);
		
			sleep(time);
			
			for (int i = 0; i < threads.length; i++) {
				this.threads[i].interrupt();
			}
			
			for (int i = 0; i < threads.length; i++) {
				this.threads[i].join();
			}
		
			System.out.println();
			System.out.println("Ende");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
