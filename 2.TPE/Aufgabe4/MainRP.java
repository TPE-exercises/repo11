package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

public class MainRP {

	public static void main(String[] args) throws InterruptedException {

		Ringpuffer rp = new Ringpuffer(-4);

		rp.put(1);
		rp.put(2);
		rp.put(3);
		rp.put(4);

		 rp.get();
		 rp.get();
		// rp.get();
		// rp.get();
//		rp.put(5);

		rp.printArray();
	}

}
