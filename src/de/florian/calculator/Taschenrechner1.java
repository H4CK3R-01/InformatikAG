package de.florian.calculator;

import java.util.Scanner;

public class Taschenrechner1 {
 static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Variable für die erste Zahl
		double zahl1;

		// Variable für die zweite Zahl
		double zahl2;

		// Variable für das Ergebnis
		double ergebnis = 0;

		// Variable für den Operator
		char operator;

		// Diese Variablen sind für die Abfrage ob noch etwas gerechnet werden soll
		// zustandig
		char JaNein;
		boolean wiederholen = true;

		// Diese Variable wird verwendet, um zu speichern ob die Werte in den Variablen
		// richtig sind
		boolean okay = false;

		while (wiederholen == true) {
			// Erste Zahl angeben
			System.out.print("Bitte erste Zahl eingeben: ");
			zahl1 = scanner.nextDouble();

			// Zweite Zahl angeben
			System.out.print("Bitte zweite Zahl eingeben: ");
			zahl2 = scanner.nextDouble();

			do {
				// Operator angeben
				System.out.print("Bitte den Operator eingeben: ");
				operator = scanner.next().trim().charAt(0);

				// Operator überprüfen und ggf. das Ergebnis ausrechnen
				if (operator == '+') {
					ergebnis = zahl1 + zahl2;
					okay = true;
				} else if (operator == '-') {
					ergebnis = zahl1 - zahl2;
					okay = true;
				} else if (operator == '*') {
					ergebnis = zahl1 * zahl2;
					okay = true;
				} else if (operator == '/') {
					if (zahl2 == 0) {
						System.out.println("Die zweite Zahl darf nicht Null sein! ");
						do {
							System.out.print("Bitte zweite Zahl erneut eingeben: ");
							zahl2 = scanner.nextDouble();
						} while (zahl2 == 0);
						ergebnis = zahl1 / zahl2;
						okay = true;
					}
				} else if (operator == '^') {
					ergebnis = Math.pow(zahl1, zahl2);
					okay = true;
				} else {
					System.out.println("Die Eingabe entspricht keinem der folgenden Operatoren ( + , - , * , / , ^ )");
					okay = false;
				}
			} while (okay == false);

			// Ergebnis ausgeben
			System.out.print("Das Ergebnis lautet: " + ergebnis);
			System.out.println();
			System.out.println();
			System.out.println();

			// Nachfragen ob noch etwas gerechnet werden soll
			do {
				okay = false;
				System.out.print("Möchtest du noch etwas rechnen[J/N]? ");
				JaNein = scanner.next().trim().charAt(0);
				System.out.println();

				if (JaNein == 'J' || JaNein == 'j') {
					wiederholen = true;
				} else if (JaNein == 'N' || JaNein == 'n') {
					wiederholen = false;
					System.out.println();
					System.out.println();
				} else {
					wiederholen = false;
					okay = true;
					System.out.println("Error! ");
				}
			} while (okay == true);
		}
		scanner.close();
	}
}