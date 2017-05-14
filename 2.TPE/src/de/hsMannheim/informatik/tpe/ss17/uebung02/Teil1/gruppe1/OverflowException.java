/*This class extends Exception
 * own Exception
 * 
 */

package MyUtil;

/*This constructor call the sub class
 * @ param reason last element pushed or entered
 */

class OverflowException extends Exception {
	public OverflowException(Object reason){
		super("es sind zu viele Elemente im Stack ; Letztes Element: "+ reason);
		Exception e = null;
		e.printStackTrace();

	}
	

}
