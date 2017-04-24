package primzahlen;
import java.util.Scanner;

public class PrimesSimple {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Zu überprüfende Zahl eingeben");
		int i = s.nextInt();
		
		
		//int n = 10;                        // Wenn ein Zahlenbereich überprüft werden soll
		//for (int i = 2; i <= n; i++) {
		
			boolean isPrimzahl = true;
			for (int j = 2; j < i && isPrimzahl; j++) {
				if ((i % j) == 0) {
					isPrimzahl = false;
					System.out.println(i + " Ist keine Primzahl");
				}
			}
			if (isPrimzahl) {
				System.out.println(i + " ist eine Primzahl!");
			}
		}
	}


		
