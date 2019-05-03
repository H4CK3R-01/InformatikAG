package de.florian.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Taschenrechner3{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double zahl1 = 0;
		double zahl2 = 0;
		double ergebnis = 0;
		boolean wiederholen = true;
		boolean okay = true;
		String operator = "+";

		while (wiederholen == true) {
			System.out.print("Bitte Rechnung eingeben: ");
			while (okay == true) {
				try {
					zahl1 = scanner.nextDouble();
					okay = false;
				} catch (InputMismatchException e) {
					String wert = scanner.next();
					System.out.println("Error! " + wert + " ist keine Zahl!");
					System.out.println("Bitte Rechnung eingeben: ");
					okay = true;
				}
				okay = true;
			}
			operator = scanner.next();
			scanner.nextLine();

			while (okay == true) {
				try {
					zahl2 = scanner.nextDouble();
					okay = false;
				} catch (InputMismatchException e) {
					String wert = scanner.next();
					System.out.println("Error! " + wert + " ist keine Zahl!");
					System.out.println("Bitte Rechnung eingeben: ");
					okay = true;
				}
			}

			if (operator.equals("+")) {
				ergebnis = zahl1 + zahl2;
				System.out.println(zahl1 + " + " + zahl2 + " = " + ergebnis);
			} else if (operator.equals("-")) {
				ergebnis = zahl1 - zahl2;
				System.out.println(zahl1 + " - " + zahl2 + " = " + ergebnis);
			} else if (operator.equals("*")) {
				ergebnis = zahl1 * zahl2;
				System.out.println(zahl1 + " * " + zahl2 + " = " + ergebnis);
			} else if (operator.equals("/")) {
				ergebnis = zahl1 / zahl2;
				System.out.println(zahl1 + " / " + zahl2 + " = " + ergebnis);
			} else {
				System.out.println("Falsche Eingabe");
			}

		}
		scanner.close();

	}
}