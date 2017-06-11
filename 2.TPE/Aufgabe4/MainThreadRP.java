package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

import java.util.Scanner;

public class MainThreadRP {

	public static void main(String[] args) throws InterruptedException {
	
		Ringpuffer rp = new Ringpuffer(4);
	

		putThread put1 = new putThread(rp, 10,"ErzeugerA");
		putThread put2 = new putThread(rp, 200,"ErzeugerB");
		putThread put3 = new putThread(rp, 250,"ErzeugerC");
		getThread get1 = new getThread(rp, 300, "VerbraucherX");
		getThread get2 = new getThread(rp, 450, "VerbraucherY");
        Thread thread[] = {put1,put2,put3,get1,get2};
		TimerThread timer = new TimerThread(0.01,thread);
        timer.start();
		put1.start();
		put2.start();
		put3.start();
		get1.start();
		get2.start();

	}
	}

