package MyUtil;

public interface Stack{
	
	public void push(Object obj) throws OverflowException;
	public Object pop() throws UnderflowException;
	public Object top() throws UnderflowException;
	public boolean isEmpty();

}
