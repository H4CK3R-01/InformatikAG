package de.florian.hangman;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hangman {
	boolean richtig = false;
	int versuche = 0;
	char buchstabe = 0;
	String wort = "Hallo";
	char WortNeu[] = new char[wort.length()];
	char WortNeuUnterstrich[] = new char[wort.length()];

	public Hangman() {

		for (int i = 0; i < wort.length(); i++) {
			WortNeu[i] = wort.charAt(i);
		}

		for (int i = 0; i < wort.length(); i++) {
			WortNeuUnterstrich[i] = '_';
		}

		while (versuche < 10) {
			buchstabe = readChar();
			richtig = false;

			for (int i = 0; i < wort.length(); i++) {
				if (buchstabe == WortNeu[i]) {
					WortNeuUnterstrich[i] = buchstabe;
					richtig = true;
					System.out.println(WortNeuUnterstrich);
					System.out.println("\n\n");
				}
			}
			if (richtig == false) {
				versuche = versuche + 1;
				System.out.println("Noch " + (10 - versuche) + " Versuche");
			}
			if (Arrays.equals(WortNeu, WortNeuUnterstrich)) {
				System.err.println("Alles Richtig!");
				System.exit(0);
			}
		}
		System.err.println("Zu viele falsche Versuche!");

	}

	public static char readChar() {
		System.out.println("Bitte Buchstaben eingeben: ");
		int x = 0;
		InputStreamReader R = new InputStreamReader(System.in);
		try {
			x = R.read();
		} catch (IOException e1) {

		}
		return (char) x;
	}
}
