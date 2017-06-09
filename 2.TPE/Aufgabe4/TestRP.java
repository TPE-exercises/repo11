package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

import java.util.Scanner;

public class TestRP {

	public static void main(String[] args) throws InterruptedException {

		Ringpuffer rp = new Ringpuffer(4);
		rp.put(7);
		rp.put(10);
		rp.put(15);
		rp.put(20);

		rp.get();
		rp.get();
		rp.get();
		rp.get();
		rp.get();
		
		
		rp.printArray();

	}

}
