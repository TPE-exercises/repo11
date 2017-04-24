package interfaces;

public interface Date {
	/**
	 * Diese Methode liefert den Tag des Datums
	 */
	int getDay();
	/**
	 * Diese Methoden den Monat des Datums
	 */
	int getMonth();
	/**
	 * Diese Methoden das Jahr des Datums
	 */
	int getYear();
	/**
	 * Liefert true genau dann, wenn das vorliegende
	 * Datum gleich dem als Parameter �bergebenen Datum ist,
	 * sonst false.
	 */
	boolean equals(Date obj);
	/**
	 * Die Methode liefert genau dann true, wenn das 
	 * vorliegende Datum gr��er ist als das �bergebene
	 * Datum, sonst false.
	 */
	boolean laterThan( Date d2 );
	/**
	 * Die Methode addiert die als Parameter angegebene Anzahl Tage
	 * auf das vorliegende Datum und gibt das sich ergebende Datum zur�ck.
	 * Das vorliegende Datum wird nicht ver�ndert, die Anzahl darf
	 * positiv oder negativ sein.
	 */
	Date add(int numberOfDays);
	/**
	 * Die Methode liefert die Anzahl Tage, die zwischen dem
	 * vorliegenden und dem als Parameter angegebenen Datum liegen
	 * als positive Zahl.
	 */
	int differenceInDays( Date d2 );
	/**
	 * Die Methode liefert den Wochentag zum vorliegenden Datum.
	 */
	//	Weekday getWeekday();
	/**
	 * Liefert eine String-Darstellung des Datums in der Form "5.5.2016".
	 */
	public String toString();


}
