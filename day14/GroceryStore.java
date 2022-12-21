package day14;

import util.InputFromUser;

public class GroceryStore {

	public static void main(String[] args) {
		/*
		 * bread - 4.99 water - 2.99 apple - 1.5 red bull -> 2.59
		 */

		String item = InputFromUser.getInput("Enter item name:");
		// What data types switch support?
		// byte and Byte
		// short and Short
		// char and Character
		// int and Integer
		// String
		// Enum

		double price = 0.0;
		// "apple"
		switch (item) {
		case "bread":
			price = 4.99;
			break;
		case "water":
			price = 2.99;
			break;
		case "apple":
			price = 1.5;
			break;
		case "red bull":
			price = 2.59;
			break;
		default:
			System.out.println("Invalid item name: " + item);
		}

		System.out.println("Item: " + item);
		System.out.println("Price: $" + price);
	}
	// How do you know when to use switch and when to use if - else if?
	// If we have simple comparison and direct mapping on the single value
	// switch is the best option
}