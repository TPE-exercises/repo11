package fakult�t;

public class Fakult�t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fakult�t(4));
		System.out.println(fakul(4));

	

	}
	// Fakult�t rukrusiv berechnen

	public static int fakult�t(int a){

		if(a>1){
			return a * fakult�t(a - 1);
		}else{ 
			return 1;
		}
		
	}

	public static int fakul(int b){

		int c = b; 
		while(b>1){
			c *= b - 1;
			b--;

		}

		return c;


	}

}