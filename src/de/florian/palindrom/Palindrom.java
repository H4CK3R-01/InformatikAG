package de.florian.palindrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		
		while (x == 0) {
			String wort;
			String wortNeu = "";
			
			System.out.println("Bitte Wort eingeben! ");
			wort = br.readLine();
			System.out.println();
			int laenge = wort.length();

			for (int i = laenge - 1; i >= 0; i--)
				wortNeu = wortNeu + wort.charAt(i);

			if (wort.equals(wortNeu)) {
				System.out.println("'" + wort + "'" + " ist ein Palindrom!");
			} else {
				System.out.println("'" + wort + "'" + " ist kein Palindrom!");
			}
		}
	}
}