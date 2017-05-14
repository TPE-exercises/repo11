package MyUtil;

import java.util.LinkedList;
public class QueueLinkedList implements Queue{

	LinkedList elements;
	private int size;
	private int l = 0, u = 0;
	boolean flag = true; 
	/*
	 * constrauctor with overgived size
	 */
	public QueueLinkedList(int size) {
		elements = new LinkedList();
		this.size = size;
	}
	/*
	 * method enter element at first position of Queue
	 */
	@Override
	public void enter(Object obj) throws OverflowException {
		/*
		 * throw exception
		 */
		if (this.size == elements.size() ){
			throw new OverflowException(obj);
		}
			elements.add(elements.size()-l, obj);
			u = (u + 1) % elements.size();
			
		}
		
	/*
	 * delete the first element in queue
	 * return delete element 
	 */

	@Override
	public Object leave() throws UnderflowException {
		/*
		 * throw UnderflowException		
		 */
		if(this.isEmpty()){
			throw new UnderflowException();
		}
		Object obj = null;
		if (isEmpty())
		 obj = elements.get(l);
		elements.remove(l);
		
		l = (l + 1) % elements.size();
		return obj;
	}
	/*
	 * returns first element from queue
	 */

	@Override
	public Object front() {
		return elements.get(0);
	}
	/*
	 * check the queue is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return elements.isEmpty();
	}
	/*
	 * print All Elements
	 * return the array as String
	 */
	String printElements(){
		String info = "";
		for (int i = 0; i < elements.size(); i++) {
			 info = info +" " + elements.get(i);
		}
		return info;
	}

}
