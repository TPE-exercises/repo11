package polymo;



public class MakeItSimple {
	
	public static void main(String[] args) {
		
		MakeItSimple.m(3 , 0.0f);
		
	}
	

		static void m ( float p1, String p2 ) {

		System.out.println(p1 + p2 + "1");

		}

		static void m ( int p1, String p2 ) {

			System.out.println(p1 + p2 + "2");

		}

		static void m ( int p1, float p2 ) {

			System.out.println(p1 + p2 + "3");

		}

		static void m ( float p1, int p2 ) {

			System.out.println(p1 + p2 +  "4");

		}



		}


