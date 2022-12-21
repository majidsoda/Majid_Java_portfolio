package day21;

public class MyNumbers {
	public static void main(String[] args) {
		print100(); // 1 ... 100
		printReverse100(); // 100 ... 1
		
		printTill(5); // 0 1 2 3 4 5
		printTill(3); // 0 1 2 3
		printTill(0); // 0
		printTill(2); // 0 1 2
		printTill(7); // 0 1 2 3 4 5 6 7
		
		System.out.println(totalSum(5)); // 15
		System.out.println(totalSum(3)); // 6
		System.out.println(totalSum(6)); // 21
		System.out.println(totalSum(1)); // 1
	}
	
	/*
	 * 1. Create new variable in the method - res
	 * 2. Iterate from 1 till number inclusive
	 * 3. Inside the loop keep adding value of i to res
	 * 4. Return res
	 */
	public static int totalSum(int number) {
		int res = 0;
		for (int i = 1; i <= number; i++) { 
			// res = res + i;
			res += i;
		}
		
		return res;
	}
	
	/*
	 * print numbers from 0 till number inclusive
	 * printTill(5) -> 0 1 2 3 4 5
	 * printTill(3) -> 0 1 2 3
	 * printTill(2) -> 0 1 2
	 * printTill(7) -> 0 1 2 3 4 5 6 7
	 */
	public static void printTill(int number) {
		for (int i = 0; i <= number; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/*
	 * print numbers from 1 to 100 inclusive
	 */
	public static void print100() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	/*
	 * print numbers from 100 to 1 inclusive
	 */
	public static void printReverse100() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}