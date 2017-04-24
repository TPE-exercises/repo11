package vererbung;

public class Main {

	public static void main(String[] args) {
		
		SUV bmw = new SUV("X5", 245, 2007, 185000);
//		System.out.println(bmw);  nur Verweis wird ausgegeben.
		
		Cabrio porsche = new Cabrio("918", 900, 2015, 10500);
		porsche.testen("918", 10111);
		
		Auto alles = new Auto("BENZ", 211, 2016);
		alles.testen("GLE");
		

	}

}
