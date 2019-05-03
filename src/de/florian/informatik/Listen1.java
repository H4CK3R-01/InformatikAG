package de.florian.informatik;

import java.util.ArrayList;
import java.util.List;

public class Listen1 {
	public static void main(String[] args) {
		List<String> alleStrings = new ArrayList<>();
		int x = 0;
		String a;

		while (x <= 1000) {
			a = String.valueOf(x);
			alleStrings.add(a);
			System.out.println(alleStrings.get(x));
			x = x + 1;
		}
		System.out.println(alleStrings);
	}
}