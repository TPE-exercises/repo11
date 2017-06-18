package de.hsMannheim.informatik.tpe.ss17.uebung05.gruppe1;

import java.util.Scanner;

public class MainTree {

	public static void main(String[] args) {
		Tree btree = new Tree(2);

		Tree btree2 = new Tree(2);

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
		btree.removeElement(27);
		btree.removeElement(24);
		btree.printLevelorder();

		TreeIterator iterator = new TreeIterator(btree);

		while (iterator.hasNext()) {
			System.out.println("Aktuelles Element: " + iterator.next().toString());

		}

		// btree2.insert(100);
		// btree2.insert(101);
		// btree2.insert(102);
		// btree2.insert(103);
		// btree2.insert(104);
		// btree2.insert(105);
		// btree2.insert(106);
		// btree2.insert(107);

		// System.out.println(btree.size());
		// System.out.println(btree.isEmpty());
		// System.out.println(btree.getMax());
		// System.out.println(btree.getMin());
		// System.out.println(btree.contains(27));
		// System.out.println(btree.height());

		// btree.printInorder();
		// btree.printLevelorder();
		// btree.printPostorder();
		// btree.printPreorder();

		// btree.addAll(btree2);

		// System.out.println(btree.clone());

		// btree.insert("abc");
		// btree.insert("bcd");
		// btree.insert("afg");
		// btree.insert("hgf");
		// btree.insert("okl");
		// btree.insert("qws");
		// btree.insert("itu");
		// btree.insert("xyt");
		// btree.insert("öpl");
		// btree.insert("awd");
		// btree.insert("lpo");
		// btree.insert("aegj");
		// btree.insert("qpol");
		// btree.insert("ölko");
		// btree.insert("qiux");
		// btree.insert("qosj");
		// btree.insert("qasx");
		// btree.insert("aaaas");

		// btree2.insert("gtdtw");
		// btree2.insert("aaqws");
		// btree2.insert("bbbaa");
		// btree2.insert("kvmwj");
		// btree2.insert("qwra");
		// btree2.insert("abcgs");
		// btree2.insert("aaaaaa");
		// btree2.insert("kkijr");
		// System.out.println(btree.size());

		// System.out.println(btree.size());
		// System.out.println(btree.isEmpty());
		// System.out.println(btree.getMax());
		// System.out.println(btree.getMin());
		// System.out.println(btree.contains("aaaas"));
		// System.out.println(btree.height());

		// btree.printInorder();
		// btree.printLevelorder();
		// btree.printPostorder();
		// btree.printPreorder();

		// btree.addAll(btree2);

		// System.out.println(btree.clone());
	}

}
