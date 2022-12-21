package day29;

import java.util.Arrays;

public class Price {
	public static void main(String[] args) {
		
		double[] price = new double[3];
		price[0]=14.99;
		price[1]=9.99;
		price[2]=5.99;	
		
		System.out.println(Arrays.toString(price));
		double sum = price[0]+price[1]+price[2];
		System.out.println(sum);
		
		
	}
}
