package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

public class Ringpuffer extends Thread {

	boolean leer = true;
	private Object array[];
	private int pointer;
	private int counter;

	public Ringpuffer(int size) {

		array = new Object[size];
		pointer = size + 1;
		counter = 0;
	}

	synchronized public void put(Object element) throws InterruptedException {
		pointer--;
		while (array[0] != null) {
			 System.out.println("Ringpuffer ist voll" );
			wait();
		}

		notifyAll();
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == null) {
				array[i] = element;
				break;
			}

		}

	}

	synchronized public Object get() throws InterruptedException {
		Object element = 0;
		while (array[array.length - 1] == null) {
			 System.out.println("Kein element im Ringpuffer");
			wait();
		}

		notifyAll();
		element = array[array.length - 1];

		Object newArray[] = new Object[array.length];
		int c = counter;
		for (int i = pointer; i < array.length; i++, c++) {
			newArray[i] = array[c];
		}
		array = newArray;

		pointer++;
		counter++;

		return element;
	}

	void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" , " + array[i]);
		}
		System.out.println();

	}

	boolean isEmpty() {
		return array[array.length - 1] == null;
	}

}
