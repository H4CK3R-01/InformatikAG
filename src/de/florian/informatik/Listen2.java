package de.florian.informatik;


import java.util.ArrayList;
import java.util.List;

public class Listen2 {

	public static void main(String[] args) {
		List<String> alleStrings = new ArrayList<>();

		alleStrings.add("eins");
		alleStrings.add("zwei");
		alleStrings.add("drei");
		alleStrings.add("vier");
		alleStrings.add("fünf");
		alleStrings.add("sechs");
		alleStrings.add("sieben");

		// Liste ausgeben
		for (int i = 0; i < alleStrings.size(); i++) {
			System.out.println(alleStrings.get(i));
		}

		System.out.println(alleStrings);

		// Liste löschen
		for (int i = alleStrings.size(); i > 0; i--) {
			alleStrings.remove(i - 1);
		}

		System.out.println(alleStrings);
	}
}