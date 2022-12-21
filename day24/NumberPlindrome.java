package day24;

public class NumberPlindrome {
	public static void main(String[] args) {
		System.out.println(isNumPal(545)); // true
		System.out.println(isNumPal(1001)); // true
		System.out.println(isNumPal(13)); // false
		System.out.println(isNumPal(33)); // true 
		System.out.println("--------"); 
		System.out.println(isNumPalTwo(545)); // true
		System.out.println(isNumPalTwo(1001)); // true
		System.out.println(isNumPalTwo(13)); // false
		System.out.println(isNumPalTwo(33)); // true 
		System.out.println(isNumPalTwo(7777777)); // true 
		System.out.println(isNumPalTwo(666612)); // false
		System.out.println(isNumPalTwo(1000000001)); // true
		System.out.println(isNumPalTwo(1000300201)); // false 

		
	}
	public static boolean isNumPalTwo(int num) {
		// % and /
		// to get most right number, we can do num % 10
		// to remove most right number, we can do num / 10
		// to add (not plus) 3 2 -> 32, 3 * 10 + 2 -> 32
		
		int original = num; // take a copy of num
		int rev = 0;
		int mostRight;
		
		while (num > 0) {
			mostRight = num % 10; // get right most
			num = num / 10; // remove right most
			rev = rev * 10 + mostRight; // add right most to rev variable
		}
		
		return original == rev; // compare original with reverse
	}
	
	public static boolean isNumPal(int num) {
		String pal = "";		
		String num1 = String.valueOf(num);
		
		for (int i = num1.length()- 1; i >= 0; i--) { 
			pal += num1.charAt(i);
		}
		return pal.equals(num1);		
	}
}
