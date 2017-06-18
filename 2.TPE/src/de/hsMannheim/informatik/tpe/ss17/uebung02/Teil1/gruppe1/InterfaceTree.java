package de.hsMannheim.informatik.tpe.ss17.uebung05.gruppe1;

public interface InterfaceTree {


	public void printPostorder();


	public void printPreorder();


	public void printLevelorder();

	public boolean insert(Integer o);


	public boolean insert(String filename);


	public boolean contains(Integer o);


	public int size();


	public int height();


	public Comparable getMax();


	public Comparable getMin();


	public boolean isEmpty();


	public void addAll(Tree otherTree);

	public void printInorder();





}

