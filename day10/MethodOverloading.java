package day10;

public class MethodOverloading {
	public static void main(String[] args) {
		// Method overloading is when we have more than one method with
		// the same name but with different arguments

		int res = sum(7, 8, 9);
		System.out.println(res);

		res = sum(1, 2);
		System.out.println(res);

		long lNumOne = 99;
		long lNumTwo = 99;
		long lRes = sum(lNumOne, lNumTwo);
		System.out.println(lRes);
	}

	public static int sum(int numOne, int numTwo) {
		System.out.println("sum with 2 args");
		return numOne + numTwo;
	}

	public static long sum(long lNum, long lNumTwo) {
		System.out.println("sum with 2 args long");
		return lNum + lNumTwo;
	}

	public static int sum(int numOne, int numTwo, int numThree) {
		System.out.println("sum with 3 args");
		return numOne + numTwo + numThree;
	}
}
