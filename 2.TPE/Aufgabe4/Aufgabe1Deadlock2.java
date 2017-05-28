package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

/**
 * @author Gruppe 1,1
 */

public class Aufgabe1Deadlock2 {
	boolean flag = false;
	boolean flag2 = true;
	
	/**
	 * Überprüfen von Threads
	 */
	public synchronized void first(){
		if(flag2){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			if(flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Erster");
			flag2 = true;
			flag = true;
			notify();
			
	}
	
	/**
	 * Überprüfen von Threads
	 */
	public synchronized void second(){
		if(!flag2){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			if(!flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Zweiter");
			flag2 = false;
			flag = false;
			notify();
			
	}
	
	

}
