package day30;

import java.util.Arrays;

public class ArrayRefrences {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		System.out.println(Arrays.toString(numbers));
		
		int[] numbersTwo= numbers;
		System.out.println(Arrays.toString(numbersTwo));
		
		numbers[0]=10;
		numbersTwo[1]=12;
		System.out.println("--------------");
		
		System.out.println(Arrays.toString(numbersTwo));
		System.out.println(Arrays.toString(numbers));
		
	}

}
