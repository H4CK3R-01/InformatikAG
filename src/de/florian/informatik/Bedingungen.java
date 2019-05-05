package de.florian.informatik;

public class Bedingungen {
	public static void main(String[] args) {
		int alter1 = 15;
		int alter2 = 16;
		int ergebnis = alter1 - alter2;
		// System.out.println("Ergebnis: " + ergebnis);
		
		if (ergebnis > 5) {
			System.out.println("Das Ergebnis ist größer als 10");
		} else if(ergebnis > 3){
			System.out.println("Das Ergebnis ist größer als 3");
		} else if(ergebnis < 0) {
			System.out.println("das Ergebnis ist kleiner als 0");
		} else {
			System.out.println("Dein Ergebnis ist zwischen 0 und 3");
		}
	}
}