package day39;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {

		int[] arrNums = { 4, 3, 2, 1, 8 };
		int[] arrNumsTwo = { 1, 8, 8, 9 };

		// [4, 3, 2, 1, 8, 1, 8, 8, 9]

		int[] newArr = new int[arrNums.length + arrNumsTwo.length];

		for (int i = 0; i < arrNums.length; i++) {
			newArr[i] = arrNums[i];

		}
		for (int i = 0; i < arrNumsTwo.length; i++) {
			newArr[arrNums.length + i] = arrNumsTwo[i];
		}
		System.out.println(Arrays.toString(newArr));
		int sum = 0;
		for (int num : newArr) {
			sum += num;
		}
		System.out.println("Sum: " + sum);
}
		
}
