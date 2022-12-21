package day31;

import java.util.Arrays;

public class StrAndChars {
	public static void main(String[] args) {
		// String method toCharArray()
		// It breaks down String into array of char
		
		String str= "Hello";
		System.out.println(str);
		
		char[] chars = str.toCharArray();
		
		System.out.println(Arrays.toString(chars));
		System.out.println("--------------");
		
		String name = "Majid Sodavi";
		for(char letter : name.toCharArray()) {
			System.out.println(letter);
		
		}
	}

}
