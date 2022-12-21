package day15;
public class StrNumbers {
	public static void main(String[] args) {
		int res1 = getNumericValue("three");
		int res2 = getNumericValue("five");
		System.out.println(res1*res2);
		System.out.println(getNumericValue("five"));
		System.out.println("-----");
		
		System.out.println(getStrValue(2)); // two
		System.out.println(getStrValue(1)); // one
		System.out.println(getStrValue(4)); // four
		System.out.println(getStrValue(5)); // five
		System.out.println(getStrValue(7)); // not supported number
	}
	
	
	
	/*
	 * if number is 1, return "one"
	 * if number is 2, return "two"
	 * if number is 3, return "three"
	 * if number is 4, return "four"
	 * if number is 5, return "five"
	 * otherwise return "not supported number"
	 */
	public static String getStrValue(int number) {
		switch(number) {
		case 1:
			return "one";
		case 2:	
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		default:
		return "not supported number";
	}}
	
	/*
	 *	if strNumber "one" or "ONE",   return 1
	 *  if strNumber "two" or "TWO",   return 2
	 *  if strNumber "three" or "THREE", return 3
	 *  if strNumber "four" or "FOUR",  return 4
	 *  if strNumber "five" or "FIVE",  return 5
	 *  otherwise return -1
	 */
	public static int getNumericValue(String strNumber) {
		switch(strNumber) {
		case "one","1","One", "ONE":
			return 1;
		case "two":
		case "TWO":	
			return 2;
		case "three", "THREE":
			return 3;
		case "four", "FOUR":
			return 4;
		case "five", "FIVE":
			return 5;
		default:
			return -1;
		}
	}
}