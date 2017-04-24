package fakultät;

public class Fakultät {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fakultät(4));
		System.out.println(fakul(4));

	

	}
	// Fakultät rukrusiv berechnen

	public static int fakultät(int a){

		if(a>1){
			return a * fakultät(a - 1);
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