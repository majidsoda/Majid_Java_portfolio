package day32;

public class ArrayPractice {

	public static void main(String[] args) {
		System.out.println(getTotalSum(new int[] { 5, 4, 3, 2 })); // 14
		System.out.println(getTotalSum(new int[] { 1, 1, 3, 2 })); // 7
		System.out.println(getTotalSum(new int[] { 1, 1, 1, 1 })); // 4

		System.out.println("---");

		System.out.println(getTotalOddSum(new int[] { 5, 4, 3, 2 })); // 8
		System.out.println(getTotalOddSum(new int[] { 1, 1, 3, 2 })); // 5
		System.out.println(getTotalOddSum(new int[] { 1, 1, 1, 1 })); // 4

		System.out.println("---");
		System.out.println(getMaxMinSum(new int[] {5, 4, 3,3, 2,6})); // 7
		System.out.println(getMaxMinSum(new int[] {1,1,2,3,2})); // 4
		System.out.println(getMaxMinSum(new int[] {1, 1, 1, 1})); // 2
		System.out.println(getMaxMinSum(new int[] {10, 15, 8, 9})); // 23
	}

	/*
	 * getTotalSum([5, 4, 3, 2]) -> 14 getTotalSum([1, 1, 3, 2]) -> 7
	 * getTotalSum([1, 1, 1, 1]) -> 4
	 */
	public static int getTotalSum(int[] arr) {

		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		return sum;
	}

	public static int getTotalOddSum(int[] arr) {

		int sumOdd = 0;
		for (int b : arr) {
			if (b % 2 == 1) {
				sumOdd = sumOdd + b;
			}
		}
		return sumOdd;
	}

	public static int getMaxMinSum(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		return max + min;
	}
}