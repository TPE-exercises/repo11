package arrays;
import static gdi.MakeItSimple.*;

public class Arrayrückwärts {

	public static void main(String[] args) {


		int [] array = {10,20,30,40,50};
		int temp;

		for (int i = 0; i < array.length/2; i++){
			temp = array[i];
			array[i] = array[(array.length - 1-i)];
			array[(array.length - 1-i)] = temp;
			
		}
		
		
			

	}


}

