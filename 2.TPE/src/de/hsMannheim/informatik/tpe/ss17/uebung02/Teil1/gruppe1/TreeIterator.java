package de.hsMannheim.informatik.tpe.ss17.uebung05.gruppe1;

import java.util.Iterator;

public class TreeIterator implements Iterator {
	Tree btree;
	Comparable[] values;
	int position;

	public TreeIterator(Tree tree) {
		this.btree = tree;
		position = -1;
		values = tree.getRoot().getAll();
	}
	
	

	/**
	 * @returns value of position of the b-tree
	 *
	 */

	@Override
	public Object next() {
		position++;
		return values[position];
	}
	
	/**
	 * check if tree has a next element
	 * @returns true or false
	 */
	
	@Override
	public boolean hasNext() {
		return position < values.length - 1;
	}
	
	/**
	 * removes elements of btree
	 */

	@Override
	public void remove() {
		btree.removeElement(values[position]);
	}

}
