package de.florian.informatik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zahl1;
		int zahl2;

		try {
			zahl1 = scanner.nextInt();
			System.out.println("Meine erste Zahl ist " + zahl1);
			zahl2 = scanner.nextInt();
			System.out.println("Meine zweite Zahl ist " + zahl2);
		} catch (InputMismatchException e) {
			System.out.println("Du hast keine Zahl eingegeben! " + e);
		}
		scanner.close();
	}
}