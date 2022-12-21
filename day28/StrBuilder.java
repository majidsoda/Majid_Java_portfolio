package day28;

public class StrBuilder {
	public static void main(String[] args) {

		// create StringBuilder with empty value
		StringBuilder sb = new StringBuilder();

		// add the value to StringBuilder by using append() method
		sb.append("hello");
		System.out.println(sb);

		sb.append(", world.");
		System.out.println(sb);

		sb.append(" Welcome to Java class");
		System.out.println(sb);
		System.out.println("---------------");

		// create StringBuilder with initial value
		StringBuilder city = new StringBuilder("Tokyo");
		System.out.println(city);
		city.append(" - population 37,400,068");
		System.out.println(city);

		// Why do we need StringBuilder if we already have a String?
		// Changing String requires new object creation. In the scenarios where
		// we change String a lot, it is better to use StringBuilder

		System.out.println("---------------");

		StringBuilder alphabet = new StringBuilder();
		for (char letter = 'a'; letter <= 'z'; letter++) {
			alphabet.append(letter);
		}
		System.out.println(alphabet);
		// The number of StringBuilder objects created is 1

	}
}
