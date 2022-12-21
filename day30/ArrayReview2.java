package day30;

import java.util.Arrays;

public class ArrayReview2 {
	public static void main(String[] args) {
		
		String[] names = {"Majid", "Gina", "lorena", "Alan", "Gustavo"};
		System.out.println(Arrays.toString(names));
		int num = 0;
		for(int i=0; i<names.length; i++) {
			String element = names[i];
			int size = element.length();
			num += size;
			}
		System.out.println("Total number of chars: "+num);
	}

}
