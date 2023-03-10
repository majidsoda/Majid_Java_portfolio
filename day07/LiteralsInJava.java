package day07;

public class LiteralsInJava {
	public static void main(String[] args) {
		// Literals are fixed values that can be used directly in the code
		// without a variable.

		// What's the data type of these literals?
		System.out.println("Hello"); // String
		System.out.println('A'); // char
		System.out.println(true); // boolean

		// The default literal data type for whole numbers is int
		System.out.println(10); // int

		// The default literal data type for floating number is double
		System.out.println(5.5); // double

		long lNumber = 10000000000L;
		float shNumber = 9.9F;
		System.out.println(lNumber); // String
		System.out.println(shNumber); // char
	}
}