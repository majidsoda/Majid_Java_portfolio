package day35;

import java.util.ArrayList;

public class FruitList {
	public static void main(String[] args) {
		// TODO
		// Create ArraList of String
		// Add 5 elements (fruit names)
		// Print each element in the new line from the back of the list by using the
		// loop

		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("kiwi");
		fruit.add("mango");
		fruit.add("orange");
		System.out.println(fruit);

		for (int i = fruit.size() - 1; i >= 0; i--) {
			System.out.println(fruit.get(i));

		}
		System.out.println("----------------------");
		for (int i = 0; i < fruit.size(); i++) {

			fruit.set(i, fruit.get(i).toUpperCase());
		

		}
		System.out.println(fruit);

	}

}
