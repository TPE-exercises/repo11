package de.hsMannheim.informatik.tpe.ss17.uebung04.gruppe1;

public class Ringpuffer extends Thread {
	
	boolean leer = true;
	private Object array[];
	private int pointer;
	boolean isEmpty(){
		return array[array.length-1]== null;
	}
	public void run(){
		for (int i = 0; i <100; i++) {
			
			try {
				
				while(array[0] == null){
					int randomZahl = (int)(Math.random()*10);
					put(randomZahl);
					printArray();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				while(!isEmpty()){
				get();
				}
				printArray();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public Ringpuffer(int size) {

		array = new Object[size];
		pointer = size + 1;
	}
	
	

	synchronized public void put(Object element) throws InterruptedException {
		pointer--;
		while(array[0] != null){
//			System.out.println("Ringpuffer ist voll" );
			wait();
		}if(array[0]==null){
			 
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == null) {
				array[i] = element;
				
				break;
			}

		}
		notifyAll();
		}
	}

	synchronized public Object get() throws InterruptedException {
		Object element=0;
		while(array[array.length-1]==null){
//			System.out.println("Kein element im Ringpuffer");
			wait();
		}if(array[array.length-1]!=null){
		element = array[array.length - 1];
		notifyAll(); 
		Object newArray[] = new Object[array.length];
		int c = 0;
	
		for (int i = pointer; i < array.length; i++, c++) {
			newArray[i] = array[c];
		}
		array = newArray;
		}
		pointer++;
		return element;
		

	} 

	void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(  " , "+array[i]);
		}
		System.out.println();
		

	}
	void signalfull(){
		
	}
}
