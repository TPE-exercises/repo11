package MyUtil;

public interface Queue {
	
	public void enter(Object obj) throws OverflowException;
	public Object leave() throws UnderflowException;
	public Object front();
	public boolean isEmpty();

}
