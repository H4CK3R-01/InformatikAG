package de.florian.informatik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methoden2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Bitte Namen eingeben: ");
		String meinName = br.readLine();
		System.out.println(combine(meinName));
	}

	
	public static String combine(String namen) {
		String einleitung = "Hallo ich heiﬂe ";
		return einleitung + namen;
	}
}