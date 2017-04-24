package vererbung;

public class Auto {
	public String name;
	public int leistung;
	public int erstzulassung;
	
	Auto(String name, int leistung, int erstzulassung){
		this.name = name;
		this.leistung = leistung;
		this.erstzulassung = erstzulassung;
	}
	
	public void testen(String name){
		System.out.println(name);
	}
	
	
	

}
