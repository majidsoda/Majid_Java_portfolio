package day33;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		int [][] numArr = new int[2][3];
		
		numArr[0][0]=4; 
		numArr[1][2]=3;
		numArr[0][2]=5;
		numArr[1][1]=2;
		System.out.println(numArr[0][0]);
		System.out.println(Arrays.deepToString(numArr));
		System.out.println("---------------------------");
		
		int[][]numArrTwo = {{1,2,3,5},{2,6},{0,9,7,8,10,11}};
		System.out.println(Arrays.deepToString(numArrTwo));
		System.out.println(numArrTwo[2][2]);
		System.out.println(numArrTwo[0][3]);
		
		}
		
		
	}


