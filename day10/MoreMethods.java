package day10;

public class MoreMethods {
	public static void main(String[] args) {
	
		
		// TODO big number
		// Create a method that accepts one int argument
		// if argument is bigger than 1000 print "<argument> is big number"
		// otherwise print "<argument> is regular number"
		
		bigNumber(1200); // 1200 is big number
		bigNumber(542);  // 542 is regular number
	}
	
	public static void bigNumber(int number) {
		if (number > 1000) {
			System.out.println(number + " is big number");
		} else {
			System.out.println(number + " is regular number");
		}
	}
	
}

