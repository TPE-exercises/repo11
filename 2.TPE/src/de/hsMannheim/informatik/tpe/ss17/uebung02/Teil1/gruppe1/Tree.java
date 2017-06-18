package de.hsMannheim.informatik.tpe.ss17.uebung05.gruppe1;

import static gdi.MakeItSimple.closeInputFile;
import static gdi.MakeItSimple.isEndOfInputFile;
import static gdi.MakeItSimple.isFilePresent;
import static gdi.MakeItSimple.openInputFile;
import static gdi.MakeItSimple.print;
import static gdi.MakeItSimple.println;
import static gdi.MakeItSimple.readInt;

import MyUtil.ArrayStack;
import gdi.MakeItSimple.GDIException;





	
	import static gdi.MakeItSimple.*;

	/**
	 *
	 * @author Gruppe 1-1
	 */
	
	public class Tree implements InterfaceTree {

	    private static final char SPACECHARACTER = ' ';

	    private TreeNode root;
	    private int order;

	    /**
	     * Constructor of B-tree with order
	     *
	     * @param order
	     */
	    public Tree(int o) {
	        if (o<= 0) {
	            throw new GDIException("order must be positive");
	        } else {
	            order = o;
	        }
	    }
	    
	    public TreeNode getRoot(){
	    	return this.root;
	    }

	   
	    public int getOrder() {
	        return this.order;
	    }

	    /**
	     * insert a element in the tree
	     * @param o Object 
	     */
	    public boolean insert(Comparable o) {
	        if (o == null || contains(o)) {
	            return false;
	        }

	        if (root == null) {

	            root = new TreeNode(order);
	            root.insert(o);

	        } else if ((root.getValues()[0]).getClass() != o.getClass()) {

	            return false;
	        } else {
	            TreeNode newRoot = new TreeNode(order);
	            insertRecursive(o, root, newRoot);

	            if (!newRoot.isEmpty()) {
	                root = newRoot;
	            }

	        }

	        return true;
	    }

	    /**
	     * insert recursive a element in the btree
	     */
	    private void insertRecursive(Comparable o, TreeNode currentNode, TreeNode previousNode) {
	        if (currentNode.isLeaf()) {
	            currentNode.insert(o);
	        } else {
	            insertRecursive(o, currentNode.getNextNodeToSearch(o), currentNode);
	        }

	        if (currentNode.isOverFilled()) {
	            currentNode.split(previousNode);
	        }
	    }

	    /**
	     * @param o insert
	     * @return Returns true
	     */
	    @Override
	    public boolean insert(Integer o) {
	        return insert((Comparable) o);
	    }

	    @Override
	    public boolean insert(String filename) { 
	        if (!isFilePresent(filename)) {
	            throw new GDIException("File not exist");
	        }

	        int[] values = new int[0];
	        Object file = openInputFile(filename);
	        while (!isEndOfInputFile(filename)) {
	            int val = readInt(file);
	            int[] copy = new int[values.length + 1];
	            for (int i = 0; i < values.length; i++) {
	                copy[i] = values[i];
	            }
	            copy[copy.length - 1] = val;
	            values = copy;
	        }

	        closeInputFile(file);

	        if (values.length <= 0) {
	            throw new GDIException("error");
	        } else {
	            boolean success = true;
	            for (int i = 0; i < values.length; i++) {
	                if (!insert(values[i])) {
	                    success = false;
	                }
	            }
	            return success;
	        }
	    }

	    /**
	     * check if the elements contains in the btree
	     * @return t or f
	     */
	    @Override
	    public boolean contains(Integer o) {
	        return contains((Comparable) o);
	    }

	    /**
	     * check if the elements contains in the btree
	     * @return t or f
	     */
	    public boolean contains(Comparable o) {
	        if (o == null) {
	            return false;
	        }
	        if (isEmpty()) {
	            return false;
	        } else if ((root.getValues()[0]).getClass() != o.getClass()) {
	           
	            return false;
	        }
	        TreeNode currentNode = root;

	        while (currentNode != null) {
	            if (currentNode.contains(o)) {
	                return true;
	            } else {
	                currentNode = currentNode.getNextNodeToSearch(o);
	            }
	        }

	        return false;
	    }

	    /**
	     * Returns tree-size.
	     *
	     * @return 
	     */
	    public int size() {
	        if (root == null) {
	            return 0;
	        } else {
	            return root.size();
	        }
	    }

	    /**
	     * @return length
	     */
	    public int height() {
	        if (root == null) {
	            return 0;
	        } else {
	            return height(root, 0);
	        }
	    }

	    /**
	     * 
	     * @param currentNode
	     * @param currentHeight
	     * @return
	     */
	    private int height(TreeNode currentNode, int currentHeight) {
	        if (currentNode.isLeaf()) {
	            return currentHeight + 1;
	        } else {
	            return height(currentNode.getMinNext(), currentHeight + 1);
	        }
	    }

	    /**
	     * @return Integer object
	     */
	    @Override
	    public Comparable getMax() {
	        if (root == null) {
	            throw new GDIException("No maximum element");
	        } else {
	            return (Comparable) root.getMax();
	        }
	    }

	    /**
	     * @return Integer object
	     */
	    public Comparable getMin() {
	        if (root == null) {
	            throw new GDIException("No minimum element");
	        } else {
	            return (Comparable) root.getMin();
	        }
	    }

	    /**
	     * @return t or false
	     */
	    public boolean isEmpty() {
	        return root == null;
	    }
	   
	    public void printInorder() {
	        println(toStringInorder(root));
	    }

	    /**
	     * put the tree nodes in a String
	     * @return string
	     */
	    private String toStringInorder(TreeNode node) {
	        if (node == null) {
	            return new String();
	        }
	        if (node.isLeaf()) {
	            return node.toString();
	        } else {
	            String string = new String();
	            Object[] values = node.getValues();
	            TreeNode[] next = node.getNext();
	            boolean hasEnded = false;
	            int lastElement = 0;

	            for (int i = 0; i < values.length && !hasEnded; i++) {
	                if (values[i] == null) {
	                    hasEnded = true;
	                    lastElement = i;
	                } else {
	                    if (i != 0) {
	                        string += ", ";
	                    }
	                    string += toStringInorder(next[i]);
	                    string += ", ";
	                    string += values[i];
	                }
	            }
	            string += toStringInorder(next[lastElement]);

	            return string;
	        }
	    }

	    /**
	     * removes an element of the tree
	     * @param o
	     */
	    public void removeElement(Comparable o) {
	        if (contains(o)) {
	            ArrayStack stack = new ArrayStack(size() * 2);
	            pushElementsToStack(root, stack);
	            Tree bTree = new Tree(this.order);
	            while (!stack.isEmpty()) {
	                Comparable temp = (Comparable) stack.pop();
	                if (o != temp) {
	                    bTree.insert(temp);
	                }
	            }
	            this.root = bTree.root;
	        }
	    }

	    /**
	     * 
	     * @param node
	     * @param stack
	     */
	    private void pushElementsToStack(TreeNode node, ArrayStack stack) {
	        if (node == null) {
	            return;
	        }
	        if (node.isLeaf()) {
	            Object temp[] = node.getValues();
	            for (int i = 0; i < temp.length; i++) {
	                stack.push(temp[i]);
	            }
	        } else {
	            Object temp[] = node.getValues();
	            for (int i = 0; i < temp.length; i++) {
	                stack.push(temp[i]);
	            }
	            for (int i = 0; i < temp.length - 1; i++) {
	                
	                pushElementsToStack(node.getNext()[i], stack);
	            }
	        }
	    }

	    /**
	     * Prints postorder
	     */
	    @Override
	    public void printPostorder() {
	        println(toStringPostorder(root));
	    }

	    /**
	     * @param node
	     * @return String
	     */
	    private String toStringPostorder(TreeNode node) { 
	        if (node == null) {
	            return "";
	        }
	        if (node.isLeaf()) {
	            return node.toString();
	        } else {
	            String string = "";
	         
	            TreeNode[] next = node.getNext();
	            for (int i = 0; (i < next.length && next[i] != null); i++) {
	                if (i > 0) {
	                    string += ", ";
	                }
	                string += toStringPostorder(next[i]);
	            }

	           
	            string += node.toString();

	            return string;
	        }
	    }

	    /**
	     * Prints preorder
	     */
	    @Override
	    public void printPreorder() {
	        println(toStringPreorder(root));
	    }

	    /**
	     * 
	     * @param node
	     * @return
	     */
	    private String toStringPreorder(TreeNode node) { 
	        if (node == null) {
	            return "";
	        }
	        if (node.isLeaf()) {
	            return node.toString();
	        } else {
	            String string = "";
	            
	            string += node.toString();

	            
	            TreeNode[] next = node.getNext();
	            for (int i = 0; (i < next.length && next[i] != null); i++) {
	                if (i > 0) {
	                    string += ", ";
	                }
	                string += toStringPreorder(next[i]);
	            }

	            return string;
	        }
	    }

	    /**
	     * Prints levelorder 
	     */
	    @Override
	    public void printLevelorder() {
	        println(toStringLevelorder());
	    }

	    /**
	     * 
	     * @return
	     */
	    private String toStringLevelorder() {
	        String elements = "";
	        
	        
	        java.util.Queue<TreeNode> queue = new java.util.LinkedList<TreeNode>();
	     
	        queue.add(root);
	       
	        while (!queue.isEmpty()) {
	            TreeNode node = queue.remove();
	           
	            if (node != null) {
	                elements += node + " ";
	                TreeNode[] next = node.getNext();
	                for (TreeNode currentNext : next) {
	                    queue.add(currentNext);
	                   
	                }
	            }
	        }
	        return elements;
	    }


	    /**
	     * Returns String
	     */
	    @Override
	    public String toString() {
	        return toStringLevelorder();
	    }

	    /**
	     *
	     * @return values
	     */
	    public Object[] values() {
	        return root.getAll();
	    }

	    /**
	     * @param otherTree A 
	     */
	    @Override
	    public void addAll(Tree otherTree) {
	        if (otherTree == null) {
	            throw new GDIException("tree is null, not possible");
	        }
	        Comparable[] otherValues = (Comparable[]) otherTree.values();

	        for (Comparable o : otherValues) {
	            insert(o);
	        }
	    }

	    private String createNumberOfTabs(int nr) {
	        String tabs = new String();
	        for (int i = 0; i < nr; i++) {
	            tabs += '\t';
	        }
	        return tabs;
	    }

	    private int pow(int base, int exponent) {
	        if (exponent == 0) {
	            return 1;
	        } else if (exponent < 0) {
	            throw new GDIException("Error.");
	        } else {
	            return (base * pow(base, exponent - 1));
	        }
	    }

	    private static String trim(String stringToRemoveLastSpaceCharacters) {
	        String newString = stringToRemoveLastSpaceCharacters;
	        for (int i = 1; (int) stringToRemoveLastSpaceCharacters.charAt(stringToRemoveLastSpaceCharacters.length() - i) == SPACECHARACTER; i++) {
	            newString = "";
	            for (int j = 0; j < stringToRemoveLastSpaceCharacters.length() - i; j++) {
	                newString += stringToRemoveLastSpaceCharacters.charAt(j);
	            }
	        }
	        return newString;
	    }

	    public void sketchElementsOnConsole() {
	        String levelorderElements = toStringLevelorder();

	        int maxAssignments = 2 * order + 1;
	        int currentAmount = 1;
	        int currentAssignment = 0;

	        levelorderElements = trim(levelorderElements);

	        for (int i = 0; i < levelorderElements.length(); i++) {
	            if ((int) levelorderElements.charAt(i) == SPACECHARACTER && (int) levelorderElements.charAt(i + 1) == SPACECHARACTER) {
	                i++;
	                currentAssignment++;
	                if (currentAmount == 1) {
	                    currentAmount++;
	                }
	                if (currentAssignment - 1 == pow(maxAssignments, currentAmount - 1)) {
	                    currentAmount++;
	                    currentAssignment = 1;
	                }
	            }
	        }
	        int maxAmount = currentAmount;

	        println(levelorderElements);
	        currentAssignment = 0;
	        currentAmount = 1;
	        final int maxfields = 2 * pow(2 * order + 1, maxAmount - 1) - 1;
	        int maxBlocks = pow(2 * order + 1, currentAmount - 1);
	        int freeFields = maxfields - maxBlocks;
	        final int center = freeFields / 2;

	        int innerDistance = (freeFields + 1) / maxBlocks;
	        int border = (innerDistance - 1) / 2;

	       
	        for (int i = 0; i < levelorderElements.length(); i++) {
	            if (currentAmount == 1 && i == 0) {
	                println("Amount" + createNumberOfTabs(center) + "Elements");
	                print(currentAmount + createNumberOfTabs(center) + "\t");
	            }
	            if ((int) levelorderElements.charAt(i) == SPACECHARACTER && (int) levelorderElements.charAt(i + 1) == SPACECHARACTER) {
	                currentAssignment++;
	                
	                if (currentAmount == 1) {
	                    currentAmount++;
	                    print("\n" + currentAmount + "\t");
	                   
	                    maxBlocks = pow(2 * order + 1, currentAmount - 1);
	                    freeFields = maxfields - maxBlocks;
	                    innerDistance = (freeFields + 1) / maxBlocks;
	                    border = (innerDistance - 1) / 2;
	                  
	                    print(createNumberOfTabs(border));
	                }
	               
	                if (currentAssignment - 1 == pow(maxAssignments, currentAmount - 1)) {
	                    currentAmount++;
	                    currentAssignment = 1;
	                  
	                    maxBlocks = pow(2 * order + 1, currentAmount - 1);
	                    freeFields = maxfields - maxBlocks;
	                    innerDistance = (freeFields + 1) / maxBlocks;
	                    border = (innerDistance - 1) / 2;
	                
	                    print("\n" + currentAmount + "\t");
	                    print(createNumberOfTabs(border));
	                } else {
	                    print(createNumberOfTabs(innerDistance));
	                }
	            } else if ((int) levelorderElements.charAt(i) != SPACECHARACTER) {
	                print(levelorderElements.charAt(i));
	            } else {
	                print(" ");
	            }
	        }
	    }
	}


