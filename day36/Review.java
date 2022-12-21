package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class Review {
	public static void main(String[] args) {
		// The difference between array and ArrayList?
		// 1. Array is fixed size and ArrayList is dynamic sized collection.
		// 2. Array can work with primitives and objects, when ArrayList works with
		// objects only.

		// ArrayList is dynamic sized collection of data. ArrayList is based on array
		// internally.

		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);

		names.add("Majid");
		names.add("Majid");
		names.add("Gina");
		names.add("Lorena");
		names.add("Alan");

		System.out.println(names); 
		// get(index) read element from list based on the index
		String name = names.get(2);
		System.out.println(name); // Abby

		// change first element value to Kuba
		names.set(0, "Kuba");
		System.out.println(name); // 

		int numberOfElements = names.size();
		System.out.println("Size: " + numberOfElements);
		System.out.println("---");

		// I want to create list that holds these values ['A', 'B', 'C', 'D']
		ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
		System.out.println(letters);
	}
}
