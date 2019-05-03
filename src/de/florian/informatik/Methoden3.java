package de.florian.informatik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Methoden3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Name 1: ");
		String Name1 = br.readLine();

		System.out.print("Name 2: ");
		String Name2 = br.readLine();

		System.out.print("Name 3: ");
		String Name3 = br.readLine();

		System.out.print("Name 4: ");
		String Name4 = br.readLine();

		List<String> Spieler = new ArrayList<>();
		Spieler.add(Name1);
		Spieler.add(Name2);
		Spieler.add(Name3);
		Spieler.add(Name4);

		printLeaderboard(Spieler);
	}

	public static void printLeaderboard(List<String> namen) {
		for (int i = 0; i < namen.size(); i++) {
			System.out.println(format(i + 1, namen.get(i)));
		}
	}

	public static String format(int platz, String name) {
		return platz + ". Platz: " + name;
	}
}