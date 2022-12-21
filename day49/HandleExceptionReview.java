package day49;

import java.util.Arrays;

public class HandleExceptionReview {
	public static void main(String[] args) {
		
		System.out.println("Creating new array");
		int[] nums = new int[3];
		
		try {			
			nums[1] = 7;
			nums[2] = 9;
			 nums[3] = 13;
			System.out.println("My array: " + Arrays.toString(nums));
			
			nums = null;
			System.out.println("Size: " + nums.length);
			
		} catch(RuntimeException e) {
			System.out.println("Exception was handled: " + e.getMessage());
			System.out.println(e.getClass());
		}
		
		System.out.println("The end of the program");

	}
}
