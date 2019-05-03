package de.florian.calculator;

import java.util.Scanner;

public class TaschenrechnerSchule {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double zahl1;
		double zahl2;
		double ergebnis = 0;
		String zeichen;
		boolean wiederholen = true;

		while (wiederholen == true) {
			// Erste Zahl angeben
			System.out.print("Bitte erste Zahl eingeben: ");
			zahl1 = scanner.nextDouble();
			scanner.nextLine();

			// Zweite Zahl angeben
			System.out.print("Bitte zweite Zahl eingeben: ");
			zahl2 = scanner.nextDouble();
			scanner.nextLine();

			// Rechenzeichen eingeben
			System.out.println("Bitte Rechenzeichen eingeben ");
			zeichen = scanner.nextLine();
			if (zeichen.equals("+")) {
				ergebnis = zahl1 + zahl2;
			} else if (zeichen.equals("-")) {
				ergebnis = zahl1 - zahl2;
			} else if (zeichen.equals("*")) {
				ergebnis = zahl1 * zahl2;
			} else if (zeichen.equals("/")) {
				ergebnis = zahl1 / zahl2;
			} else {
				System.out.println("Falsche Eingabe");
			}
			System.out.println("Das Ergebnis lautet: " + ergebnis);
		}
		scanner.close();
	}
}