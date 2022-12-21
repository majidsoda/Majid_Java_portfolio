package day30;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
	//Array is fixed size collection of data (of the same type).
	//-Array works with refrences similarly as objects do.
	//-Array's elements will have default values if nothing was assigned.
		int[] numArr = new int[3];
		System.out.println(numArr);
		String arrStr = Arrays.toString(numArr);
		System.out.println(arrStr);
		System.out.println("------------------");
		
		String [] strArr = new String [] {"Majid", "Gina", "Alan", "Lore"};
		System.out.println(Arrays.toString(strArr));
		System.out.println("------------------");
		
		double[] dNumsArr = {1.5, 2.5, 3.5, 4.5, 5.5};
		System.out.println(Arrays.toString(dNumsArr));
		
		dNumsArr = new double[] {6.5,7.5,8.5};
		System.out.println(Arrays.toString(dNumsArr));
		
		//length-instance variable
		int size = dNumsArr.length;
		System.out.println("size: "+size);
		
	}

}
