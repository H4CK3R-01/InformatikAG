package de.florian.informatik;

import java.util.ArrayList;
import java.util.List;

public class Listen3 {
	public static void main(String[] args) {
		List<Integer> alleInt = new ArrayList<>();

		for (int i = 0; i <= 1000000000; i++) {
			alleInt.add(i);
			System.out.println(alleInt.get(i));
		}
	}
}