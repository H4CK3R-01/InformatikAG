package de.florian.informatik;

import java.util.ArrayList;
import java.util.List;

public class Methoden1 {
	public static void main(String[] args) {
		List<Integer> Zahlen = new ArrayList<>();
		for (int i = 0; i < 10000000; i++) {
			Zahlen.add(i);
		}
		printList(Zahlen);
	}

	
	public static void printList(List<Integer> list) {
		for (int i = list.size(); i > 0; i--) {
			System.out.println(list.get(i - 1));
		}
	}
}