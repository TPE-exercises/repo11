package interfaces;

public class DateMain {

	public static void main(String[] args) {

		Date2 datum = new Date2(23, 1, 2017);
		Date2 datum2 = new Date2(23, 1, 2016);

		System.out.println(datum.laterThan(datum2));
		System.out.println(datum.toString());
		System.out.println(datum.getDay());
		System.out.println(datum.equals(datum2));
		
		int[] a1 = {10,20,50};
		datum.array(a1);




	}

}
