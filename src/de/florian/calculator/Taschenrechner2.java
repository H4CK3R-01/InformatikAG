package de.florian.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

enum ErgebnisTyp { Unbekannt, ZweiZahlen, Wurzel };

public class Taschenrechner2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char auswahl;
		double zahl1 = 0;
		double zahl2 = 0;
		double ergebnis = 0;
		boolean wiederholen = true;
		boolean okay = false;
		boolean ergebnisverfuegbar = false;
		ErgebnisTyp eErgebnisTyp = ErgebnisTyp.Unbekannt;
		char operator = 0;
		
		while (wiederholen == true) {
			System.out.println("a) Addieren");
			System.out.println("b) Subtrahieren");
			System.out.println("c) Multiplizieren");
			System.out.println("d) Dividieren");
			System.out.println("e) Potenzieren");
			System.out.println("f) Quadratwurzel ziehen");
			System.out.println("g) Beenden");
			System.out.print("Was möchtest du machen? ");
			auswahl = scanner.next().trim().charAt(0);

			// Addieren
			if (auswahl == 'a') {
				eErgebnisTyp = ErgebnisTyp.ZweiZahlen;
				System.out.print("Bitte erste Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl1 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.println("Bitte erste Zahl eingeben: ");						
						okay = false;
					}
				}

				System.out.print("Bitte zweite Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl2 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte zweite Zahl eingeben: ");
						okay = false;
					}
				}
				ergebnis = zahl1 + zahl2;
				ergebnisverfuegbar = true;
				operator = '+';
			}

			// Subtrahieren
			else if (auswahl == 'b') {
				eErgebnisTyp = ErgebnisTyp.ZweiZahlen;
				System.out.print("Bitte erste Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl1 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte erste Zahl eingeben: ");
						okay = false;
					}
				}

				System.out.print("Bitte zweite Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl2 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte zweite Zahl eingeben: ");
						okay = false;
					}
				}
				ergebnis = zahl1 - zahl2;
				ergebnisverfuegbar = true;
				operator = '-';
			}

			// Multiplizieren
			else if (auswahl == 'c') {
				System.out.print("Bitte erste Zahl eingeben: ");
				eErgebnisTyp = ErgebnisTyp.ZweiZahlen;
				okay = false;
				while (okay == false) {
					try {
						zahl1 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte erste Zahl eingeben: ");
						okay = false;
					}
				}

				System.out.print("Bitte zweite Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl2 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte zweite Zahl eingeben: ");
						okay = false;
					}
				}
				ergebnis = zahl1 * zahl2;
				ergebnisverfuegbar = true;
				operator = '*';
			}

			// Dividieren
			else if (auswahl == 'd') {
				eErgebnisTyp = ErgebnisTyp.ZweiZahlen;
				System.out.print("Bitte erste Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl1 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte erste Zahl eingeben: ");
						okay = false;
					}
				}

				System.out.print("Bitte zweite Zahl eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl2 = scanner.nextDouble();
						if (zahl2 == 0) {
							System.out.println("Die zweite Zahl darf nicht Null sein! ");
							do {
								System.out.print("Bitte zweite Zahl erneut eingeben: ");
								zahl2 = scanner.nextDouble();
							} while (zahl2 == 0);
						}
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte zweite Zahl eingeben: ");
						okay = false;
					}
				}
				ergebnis = zahl1 / zahl2;
				ergebnisverfuegbar = true;
				operator = '/';
			}

			// Potenzieren
			else if (auswahl == 'e') {
				eErgebnisTyp = ErgebnisTyp.ZweiZahlen;
				System.out.print("Bitte Basis eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl1 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte Basis eingeben: ");
						okay = false;
					}
				}

				System.out.print("Bitte Exponent eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl2 = scanner.nextDouble();
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte Exponent eingeben: ");
						okay = false;
					}
				}
				ergebnis = Math.pow(zahl1, zahl2);
				ergebnisverfuegbar = true;
				operator = '^';
			}

			// Quadratwurzel ziehen
			else if (auswahl == 'f') {
				eErgebnisTyp = ErgebnisTyp.Wurzel;
				System.out.print("Bitte Radikand eingeben: ");
				okay = false;
				while (okay == false) {
					try {
						zahl1 = scanner.nextDouble();
						if (zahl1 < 0) {
							System.out.println("Radikand darf nicht negativ sein! ");
							do {
								System.out.println("Bitte Radikand erneut eingeben: ");
								zahl1 = scanner.nextDouble();
							} while (zahl1 < 0);
						}
						okay = true;
					} catch (InputMismatchException e) {
						String wert = scanner.next();
						System.out.println("Error! " + wert + " ist keine Zahl!");
						System.out.print("Bitte erste Zahl eingeben: ");
						okay = false;
					}
				}
				ergebnis = Math.sqrt(zahl1);
				ergebnisverfuegbar = true;
			}

			// Programm Beenden
			else if (auswahl == 'g') {
				System.out.println("Das Programm wird beendet...");
				wiederholen = false;
				ergebnisverfuegbar = false;
			}

			// Fehlermeldung bei falscher Eingabe
			else {
				System.out.println("Die Eingabe ist Falsch! ");
				ergebnisverfuegbar = false;

			}

			if ( ergebnisverfuegbar == true )
			{
				switch ( eErgebnisTyp )
				{
					case ZweiZahlen:
						System.out.print( zahl1 );
						System.out.print( operator );
						System.out.print( zahl2 );
						System.out.print( " = ");
						System.out.println( ergebnis );
						System.out.println();
						break;
					case Wurzel:
						System.out.println("Die Wurzel zum Radikant " + zahl1 + " ist " + ergebnis);
						System.out.println();
						break;
                    default:
					   break;
				}
				/*
				if (eErgebnisTyp == ErgebnisTyp.ZweiZahlen) {
					System.out.print( zahl1 );
					System.out.print( operator );
					System.out.print( zahl2 );
					System.out.print( " = ");
					System.out.println( ergebnis );
					System.out.println();
				} else if (eErgebnisTyp == ErgebnisTyp.Wurzel) {
					System.out.println("Die Wurzel zum Radikant " + zahl1 + " ist " + ergebnis);
					System.out.println();
				} else
					System.out.println();
			    */
			}
		}
		scanner.close();
	}
}