package vererbung;

/*
 * final Klasse, kann also nicht geerbt werden
 */

public final class SUV extends Cabrio {

	SUV(String name, int leistung, int erstzulassung, int laufleistung) {
		super(name, leistung, erstzulassung, laufleistung);
	}
	

}
