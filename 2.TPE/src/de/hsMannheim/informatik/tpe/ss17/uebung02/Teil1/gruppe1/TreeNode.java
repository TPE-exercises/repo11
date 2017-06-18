package de.hsMannheim.informatik.tpe.ss17.uebung05.gruppe1;

import gdi.MakeItSimple.GDIException;

	/**
	 * 
	 * @author Gruppe 1-1
	 *
	 */

	public class TreeNode {

	    private Comparable[] elements;
	    private TreeNode[] next;
	    private TreeNode parent;
	    private int order;

	    /**
	     *
	     * @param o
	     */
	    public TreeNode(int o) {
	        if (o <= 0) {
	            throw new GDIException("only positive order");
	        }
	        elements = new Comparable[(o * 2) + 1];
	        next = new TreeNode[(o * 2) + 2];
	        order = o;
	    }

	    /**
	     * check if is full
	     * @return true or false 
	     */
	    public boolean isOverFilled() {
	        return elements[elements.length - 1] != null;
	    }

	    /**
	     * @return t or f
	     */
	    public boolean isLeaf() {
	        return next[0] == null;
	    }

	    /**
	     *
	     *check if is empty
	     * @return t or f
	     */
	    public boolean isEmpty() {
	        return elements[0] == null;
	    }

	    @Override
	    public String toString() {
	        String value = "[";
	        int nr = 0;

	        for (int i = 0; i < elements.length; i++) {
	            if (elements[i] != null) {
	                if (nr != 0) {
	                    value += " ";
	                }
	                value += elements[i].toString();
	                nr++;
	            }
	        }

	        value += "]";

	        return value;
	    }

	    /**
	     * @return min value
	     */
	    public Comparable getMin() {
	        if (next[0] == null) {
	            return elements[0];
	        } else {
	            return next[0].getMin();
	        }
	    }

	    /**
	     * @return max value
	     */
	    public Comparable getMax() {
	        for (int i = next.length - 1; i >= 0; i--) {
	            if (next[i] != null) {
	                return next[i].getMax();
	            }
	        }

	        for (int i = elements.length - 1; i >= 0; i--) {
	            if (elements[i] != null) {
	                return elements[i];
	            }
	        }

	        return null;
	    }

	    /**
	     * @return Returns elements.
	     */
	    public int size() {
	        int size = 0;
	        for (Comparable value : elements) {
	            if (value != null) {
	                size++;
	            }
	        }

	        for (TreeNode node : next) {
	            if (node != null) {
	                size += node.size();
	            }
	        }

	        return size;
	    }

	    /**
	     * get child
	     * @return child
	     */
	    public TreeNode getMinNext() {
	        return next[0];
	    }

	    /**
	     * get elements
	     * @return values
	     */
	    public Comparable[] getValues() {
	        return elements;
	    }

	    /**
	     * 
	     * @return returns array
	     */
	    public Comparable[] getAll() {
	        Comparable[] all = new Comparable[0];
	        for (int i = 0; i < elements.length; i++) {
	            if (elements[i] != null) {
	                Comparable[] val = new Comparable[1];
	                val[0] = elements[i];
	                all = mergeArrays(all, val);
	            }
	        }

	        for (int i = 0; i < next.length; i++) {
	            if (next[i] != null) {
	                Comparable[] nextArray = next[i].getAll();
	                all = mergeArrays(all, nextArray);
	            }
	        }

	        return all;
	    }

	   
	    private Comparable[] mergeArrays(Comparable[] a1, Comparable[] a2) {
	        Comparable[] merged = new Comparable[a1.length + a2.length];

	        for (int i = 0; i < a1.length; i++) {
	            merged[i] = a1[i];
	        }
	        for (int i = a1.length, j = 0; j < a2.length; i++, j++) {
	            merged[i] = a2[j];
	        }

	        return merged;
	    }

	    /**
	     * @return children
	     */
	    public TreeNode[] getNext() {
	        return next;
	    }

	    /**
	     * check if the elements contains in the btree 
	     * @return t or f
	     */
	    public boolean contains(Comparable obj) {
	        for (int i = 0; i < elements.length; i++) {
	            if (elements[i] != null && elements[i].equals(obj)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    /**
	     * insert elemnet in right positin
	     * @param o
	     * @param rightPart
	     * @param leftPart
	     */
	    
	    public void insert(Comparable o, TreeNode rightPart, TreeNode leftPart) {
	        if (elements[elements.length - 1] != null) {
	            throw new GDIException("Node filled");
	        }

	        for (int i = elements.length - 1; i >= 0; i--) {
	           
	            if (elements[i] != null) {
	                
	                if (elements[i].compareTo(o) >= 1) {
	                    elements[i + 1] = elements[i];
	                    next[i + 2] = next[i + 1];
	                } else if (elements[i].compareTo(o) == 0) {
	                    throw new GDIException("Double not allowed.");
	                } else {
	                    elements[i + 1] = o;
	                    next[i + 2] = rightPart;
	                    return;
	                }
	            }

	        }
	        elements[0] = o;
	        next[1] = rightPart;
	        if (leftPart != null) {
	            next[0] = leftPart;
	        }
	        return;
	    }

	    /**
	     * @param o Element insert.
	     */
	    public void insert(Comparable o) {
	        insert(o, null, null);
	    }

	    /**
	     * @param o Element
	     */
	    public TreeNode getNextNodeToSearch(Comparable o) {
	        TreeNode nextNode = next[elements.length - 1];
	        boolean found = false;

	        for (int i = 0; i < elements.length - 1; i++) {
	            if (elements[i] == null || o.compareTo(elements[i]) <= -1) {
	                if (!found) {
	                    nextNode = next[i];
	                    found = true;
	                }
	            }
	        }

	        return nextNode;
	    }

	    /**
	     * @param parent
	     */
	    public void split(TreeNode parent) {
	        TreeNode rightNode = new TreeNode((elements.length - 1) / 2);

	        int middlePosition = elements.length / 2;

	        for (int i = middlePosition + 1; i < elements.length; i++) {
	            rightNode.insert(elements[i], next[i + 1], null);
	        }
	        rightNode.next[0] = next[middlePosition + 1];

	        parent.insert(elements[middlePosition], rightNode, this);

	      
	        for (int i = middlePosition; i < elements.length; i++) {
	            elements[i] = null;
	        }
	        for (int i = middlePosition + 1; i < next.length; i++) {
	            next[i] = null;
	        }

	       
	    }

	 
	}


