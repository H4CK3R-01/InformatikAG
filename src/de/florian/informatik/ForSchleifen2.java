package de.florian.informatik;

public class ForSchleifen2 {
	public static void main(String[] args) {
		int ergebnis = 0;
		
		for (int i = 1; i <= 100; i++) {
			ergebnis = ergebnis + i;
		}
		System.out.println("Ergebnis: " + ergebnis);
	}
}