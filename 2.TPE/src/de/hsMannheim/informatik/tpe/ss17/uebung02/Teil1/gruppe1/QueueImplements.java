/*This class imlpments Queue Interface
 */

package MyUtil;

public class QueueImplements implements Queue{
	
	private Object[] elements;
	private int l = 0, u = 0;
	private boolean flag = true; 
	/*
	 * constrauctor with overgived size
	 */
	public QueueImplements(int size){
		elements = new Object [size];
		
	}
	/*
	 * constructor with default size
	 */
	public QueueImplements(){
		elements = new Object [0];
	}
	/*
	 * method enter element at first position of Queue
	 */
	@Override
	public void enter(Object obj) throws OverflowException {
		/*
		 * method overflowException double the size
		 */
		if ((elements.length - l + u) % elements.length == elements.length - 1&& this.flag){
		elements = this.overflowException(elements);
	}
		/*
		 * throw exception
		 */
	if ((elements.length - l + u) % elements.length == elements.length - 1){
		throw new OverflowException(obj);
	}
		elements [u] = obj;
		u = (u + 1) % elements.length;
		
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
		 
		obj = elements [l];
		elements [l] = null;
		
		l = (l + 1) % elements.length;
		return obj;
	}
	/*
	 * returns first element from queue
	 */
	@Override
	public Object front() {
		return elements[0];
	}
	/*
	 * check the queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return elements[0] == null;
	}
	/*
	 * print All Elements
	 * return the array as String
	 */
	String printElements(){
		String info = "";
		for (int i = 0; i < elements.length; i++) {
			 info = info +" " + elements[i];
		}
		return info;
	}
	/*
	 * double size of the array
	 * return an array from type Object
	 */
	Object [] overflowException(Object []array){
		Object [] array2 = new Object [(elements.length)*2];
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i]; 
		}
		this.flag= false;
		return array2;
		
	}
}
