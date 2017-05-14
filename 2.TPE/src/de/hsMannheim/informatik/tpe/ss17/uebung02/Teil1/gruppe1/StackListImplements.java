package MyUtil;
/*
 * this class implements the Interface Stack
 */
import java.util.LinkedList;

public class StackListImplements implements Stack {

	LinkedList elements;
	private int size;
	/*
	 * constrauctor with overgived size
	 */
	public StackListImplements(int size) {
		elements = new LinkedList();
		this.size = size;
	}
	/*
	 * method enter element at first position of Stack
	 */
	@Override
	public void push(Object obj) throws OverflowException {
		/*
		 * throw exception
		 */
		if (this.size == elements.size()) {
			throw new OverflowException(obj);
		}
		// lastElement = elements[elements.length-1];

		elements.add(obj);
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
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Object o = elements.getLast();
		elements.remove();
		return o;
	}
	/*
	 * returns first element from Stack
	 */
	@Override
	public Object top() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return elements.getLast();
	}
	/*
	 * check the Stack is empty
	 */
	@Override
	public boolean isEmpty() {
		return elements.isEmpty();
	}
	/*
	 * print All Elements
	 * return the array as String
	 */
	String printElements() {
		String info = "";
		for (int i = 0; i < elements.size(); i++) {
			info = info + elements.get(i);
		}
		return info;
	}
}
