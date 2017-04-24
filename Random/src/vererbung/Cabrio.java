package vererbung;

public class Cabrio extends Auto{
	public int laufleistung;
	
	
	Cabrio(String name, int leistung, int erstzulassung, int laufleistung) {
		super(name, leistung, erstzulassung);
		this.laufleistung = laufleistung;
		
	}
	
	
	
	public void testen(String name, int laufleistung){
		System.out.println(name + " " + laufleistung);
	}

	
	
	

}
