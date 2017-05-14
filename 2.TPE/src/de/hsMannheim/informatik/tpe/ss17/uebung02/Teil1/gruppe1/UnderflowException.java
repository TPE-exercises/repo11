package MyUtil;
/*
 * This class extends exception
 * own Exception
 */
public class UnderflowException extends Exception{
	/*
	 * constructor call constructor of subclass
	 */
	public UnderflowException(){
		super("es sind keine Elemente auf dem Stack vorhanden");
	}

}
