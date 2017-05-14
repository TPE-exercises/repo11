package MyUtil;
/*
 * this class implements the Interface Stack
 */

public class StackImplements implements Stack{
	
	private int num = 0; 
	Object elements [];
	boolean flag = true; 
	/*
	 * constrauctor with overgived size
	 */
	public StackImplements(int size){
		elements = new Object [size];
	}
	/*
	 * constructor with default size
	 */
	public StackImplements(){
		elements = new Object [0];
	}
	/*
	 * method enter element at first position of Stack
	 */
	@Override
	public void push(Object obj) throws OverflowException {
		/*
		 * method overflowException double the size
		 */
		if (num == elements.length&&flag){
			elements = this.overflowException(elements);
		}
		/*
		 * throw exception
		 */
		if (num == elements.length){
			throw new OverflowException(obj);
		}
			elements [num++] = obj;
	}
	/*
	 * delete the first element in Stack
	 * return delete element 
	 */
	@Override
	public Object pop() throws UnderflowException {
		/*
		 * throw UnderflowException		
		 */
		if(isEmpty()){
			throw new UnderflowException();
		}
		Object o = elements [--num];
		elements [num] = null;
		return o;
	}
	/*
	 * returns first element from Stack
	 */
	@Override
	public Object top() throws UnderflowException {
		if(isEmpty()){
			throw new UnderflowException();
		}
		return elements[num-1];
	}
	/*
	 * check the Stack is empty
	 */
	@Override
	public boolean isEmpty() {
		return num == 0;
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
	/*
	 * print All Elements
	 * return the array as String
	 */
	String printElements(){
		String info = "";
		for (int i = 0; i < elements.length; i++) {
			 info = info + elements[i];
		}
		return info;
	}
	
	

}
