package de.florian.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
	public static void main(String[] args) throws IOException {
		// Buffered Reader erstellen
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Variablen deklarieren und Listen befüllen
		boolean weiter = true;
		String Zeichen2 = "O";
		String Zeichen1 = "X";
		boolean programmschleife = true;
		List<Integer> Punktzahl = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			Punktzahl.add(0);
		}

		List<String> Felder = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			Felder.add(" ");
		}

		// Programmstart
		while (programmschleife == true) {
			while (weiter == true) {
				// Spieler 1
				ausgabe(Felder);

				// Feld auswählen
				System.out.println("Spieler 1");
				System.out.print("Bitte Koordinaten eingeben(xy): ");
				String auswahl = br.readLine();
				char x = auswahl.charAt(0);
				char y = auswahl.charAt(1);

				// Feld verändern
				if (x == '1') {
					if (y == 'a') {
						if (Felder.get(0) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(0, Zeichen1);
							Punktzahl.set(0, 1);
							weiter = false;
						}
					} else if (y == 'b') {
						if (Felder.get(3) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(3, Zeichen1);
							Punktzahl.set(3, 1);
							weiter = false;
						}
					} else if (y == 'c') {
						if (Felder.get(6) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(6, Zeichen1);
							Punktzahl.set(6, 1);
							weiter = false;
						}
					}
				} else if (x == '2') {
					if (y == 'a') {
						if (Felder.get(1) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(1, Zeichen1);
							weiter = false;
							Punktzahl.set(1, 1);
						}
					} else if (y == 'b') {
						if (Felder.get(4) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(4, Zeichen1);
							Punktzahl.set(4, 1);
							weiter = false;
						}
					} else if (y == 'c') {
						if (Felder.get(7) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(7, Zeichen1);
							Punktzahl.set(7, 1);
							weiter = false;
						}
					}
				} else if (x == '3') {
					if (y == 'a') {
						if (Felder.get(2) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(2, Zeichen1);
							Punktzahl.set(2, 1);
							weiter = false;
						}
					} else if (y == 'b') {
						if (Felder.get(5) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(5, Zeichen1);
							Punktzahl.set(5, 1);
							weiter = false;
						}
					} else if (y == 'c') {
						if (Felder.get(8) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(8, Zeichen1);
							Punktzahl.set(8, 1);
							weiter = false;
						}
					}
				} else {
					System.out.println("Die Eingabe ist falsch!");
				}
				ergebnis(Punktzahl);
			}
			weiter = true;
			while (weiter == true) {

				// Spieler 2
				ausgabe(Felder);

				// Feld auswählen
				System.out.println("Spieler 2");
				System.out.print("Bitte Koordinaten eingeben(xy): ");
				String auswahl = br.readLine();
				char x = auswahl.charAt(0);
				char y = auswahl.charAt(1);

				// Feld verändern
				if (x == '1') {
					if (y == 'a') {
						if (Felder.get(0) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(0, Zeichen2);
							Punktzahl.set(0, -1);
							weiter = false;
						}
					} else if (y == 'b') {
						if (Felder.get(3) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(3, Zeichen2);
							Punktzahl.set(3, -1);
							weiter = false;
						}
					} else if (y == 'c') {
						if (Felder.get(6) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(6, Zeichen2);
							Punktzahl.set(6, -1);
							weiter = false;
						}
					}
				} else if (x == '2') {
					if (y == 'a') {
						if (Felder.get(1) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(1, Zeichen2);
							Punktzahl.set(1, -1);
							weiter = false;
						}
					} else if (y == 'b') {
						if (Felder.get(4) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(4, Zeichen2);
							Punktzahl.set(4, -1);
							weiter = false;
						}
					} else if (y == 'c') {
						if (Felder.get(7) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(7, Zeichen2);
							Punktzahl.set(7, -1);
							weiter = false;
						}
					}
				} else if (x == '3') {
					if (y == 'a') {
						if (Felder.get(2) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(2, Zeichen2);
							Punktzahl.set(2, -1);
							weiter = false;
						}
					} else if (y == 'b') {
						if (Felder.get(5) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(5, Zeichen2);
							Punktzahl.set(5, -1);
							weiter = false;
						}
					} else if (y == 'c') {
						if (Felder.get(8) != " ") {
							System.out.println("Das Feld ist berits belegt! ");
						} else {
							Felder.set(8, Zeichen2);
							Punktzahl.set(8, -1);
							weiter = false;
						}
					}
				} else {
					System.out.println("Die Eingabe ist falsch!");
				}
				ergebnis(Punktzahl);
			}
			weiter = true;
		}
	}

	public static void ausgabe(List<String> Felder) {
		System.out.println("    ┌───┬───┬───┐");
		System.out.println("    │ 1 │ 2 │ 3 │");
		System.out.println("┌───┼───┼───┼───┤");
		System.out.println("│ a │ " + Felder.get(0) + " │ " + Felder.get(1) + " │ " + Felder.get(2) + " │");
		System.out.println("├───┼───┼───┼───┤");
		System.out.println("│ b │ " + Felder.get(3) + " │ " + Felder.get(4) + " │ " + Felder.get(5) + " │");
		System.out.println("├───┼───┼───┼───┤");
		System.out.println("│ c │ " + Felder.get(6) + " │ " + Felder.get(7) + " │ " + Felder.get(8) + " │");
		System.out.println("└───┴───┴───┴───┘");

	}

	public static void ergebnis(List<Integer> Punkt) {
		int y = Punkt.get(0) + Punkt.get(1) + Punkt.get(2);
		rechnen(y);
		y = Punkt.get(3) + Punkt.get(4) + Punkt.get(5);
		rechnen(y);
		y = Punkt.get(6) + Punkt.get(7) + Punkt.get(8);
		rechnen(y);
		y = Punkt.get(0) + Punkt.get(3) + Punkt.get(6);
		rechnen(y);
		y = Punkt.get(1) + Punkt.get(4) + Punkt.get(7);
		rechnen(y);
		y = Punkt.get(2) + Punkt.get(5) + Punkt.get(8);
		rechnen(y);
		y = Punkt.get(0) + Punkt.get(4) + Punkt.get(8);
		rechnen(y);
		y = Punkt.get(2) + Punkt.get(4) + Punkt.get(6);
		rechnen(y);
	}

	public static void rechnen(int Punktzahl) {
		if (Punktzahl == 3) {
			System.out.println("Spieler 1 hat gewonnen!");
		} else if (Punktzahl == -3) {
			System.out.println("Spieler 2 hat gewonnen!");
		} else {
			return;
		}
	}
}