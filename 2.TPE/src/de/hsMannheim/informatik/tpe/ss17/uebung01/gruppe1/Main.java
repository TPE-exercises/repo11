package de.hsMannheim.informatik.tpe.ss17.uebung01.gruppe1;

public class Main {

	public static void main(String[] args) {
	
		
		Bbaum btree = new Bbaum(2);
		
		Bbaum btree2= new Bbaum(2);
//		
		btree.insert(19);
		btree.insert(12);
		btree.insert(16);
		btree.insert(22);
		btree.insert(25);
		btree.insert(10);
		btree.insert(11);
		btree.insert(13);
		btree.insert(14);
		btree.insert(15);
		btree.insert(17);
		btree.insert(18);
		btree.insert(20);
		btree.insert(21);
		btree.insert(23);
		btree.insert(24);
		btree.insert(26);
		btree.insert(27);
		
		btree2.insert(100);
		btree2.insert(101);
		btree2.insert(102);
		btree2.insert(103);
		btree2.insert(104);
		btree2.insert(105);
		btree2.insert(106);
		btree2.insert(107);
		btree2.insert(10);
//
//		System.out.println(btree.size());
//		System.out.println(btree.isEmpty());
//		System.out.println(btree.getMax());
//		System.out.println(btree.getMin());
//		System.out.println(btree.contains(21));
//	    System.out.println(btree.height());
	    
	    
	    
	    
	    
	    
//	    btree.printLevelorder();
//	    btree.printPostorder();
//	    btree.printPreorder();
	    
//	    btree.addAll(btree2);
//	    btree.printInorder();
	 System.out.println(btree.clone());

	    
	    
	    
	}

}
