package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

public class TryCatch {

	// Aufgabe 1 a)

	// Catch-or-throw-Regel

	// Diese Regel besagt, dass eine Ausnahme entweder behandelt oder
	// weitergegeben werden soll. Die Ausnahmebehandlung wird durch
	// try-catch realisiert (siehe Beispiel 2 mit Erläuterung). Wenn eine
	// Ausnahme
	// nicht behandelt sondern weitergegeben werden soll, muss man das 
	// Schlüsselwort throws an das
	// Ende einer Methode schreiben (nach den ()). Im folgenden Beispiel wird
	// das verdeutlicht.

	public static void abc() throws ArithmeticException {
		int zahl = 11;

		for (int i = 10; i <= zahl; i--) {
			int a = zahl / i;
			System.out.println(zahl + "/ " + i + " =" + a);

		}

	}

	// Beispiel 2

	// In unserem Beispiel werden int-Werte mithilfe einer for-Schleife
	// dividiert.
	// Unsere for-Schleife ist im try-Block und unsere ArithmeticException mit
	// den
	// Ausgaben ist im catch-Block.In unserem Fall bzw. Quellcode wird
	// irgendwann durch 0 geteilt,was unsere ArithmeticException,
	// die den Fehler abfängt, auslöst, da keine Zahl durch 0
	// geteilt werden kann. Die letzte Ausgabe,bei der durch 0
	// geteilt werden soll,gibt dann mithilfe der
	// vordefinierten getMessage-Methode den
	// entsprechenden Fehler, bei uns„/by zero“,aus.

	// Beispiel 2

	public static void main(String[] args) {
		int zahl = 11;

		try {
			for (int i = 10; i <= zahl; i--) {
				int a = zahl / i;
				System.out.println(zahl + "/ " + i + " =" + a);

			}
		} catch (ArithmeticException e) {
			System.out.println("Fehler aufgetreten");
			System.out.println("Ursache: " + e.getMessage());

		}  
		   
	}

}
