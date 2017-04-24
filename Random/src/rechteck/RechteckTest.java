package rechteck;


public class RechteckTest {

	public static void main(String[] args) {
		
		Rechteck ab = new Rechteck();
		ab.Breite(10);
		System.out.println(ab.getLangeSeite());
		System.out.println(ab.getKurzeSeite());
		System.out.println(ab.getDiagonale());
		System.out.println(ab.getFlaeche());
		System.out.println(ab.getUmfang());
		ab.laengeAusgeben();
		

	}

}
