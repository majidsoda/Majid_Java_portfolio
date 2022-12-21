package day17;

public class StrContains {
	public static void main(String[] args) {
		
		// contains(String str)
		// it checks if your string contains another string
		// if contains returns true, otherwise false
		
		String str= "Majid Sodavi, Gina Avila Sodavi, Benji Sodavi";
		boolean isNotThere = !str.contains("Lorena");
		System.out.println(isNotThere);
		
		boolean isThere = str.contains("Majid");
		System.out.println(isThere);
		
		System.out.println(str.contains("i, "));
		System.out.println(str.contains(", Gina"));
		
		
		String msg = "Hello, Class!";
		String value = "hello";
		System.out.println(msg.contains(value)); // false
		
		// how we can ignore the cases with contains?
		
		//                   "hello, class!".contains("hello") -> true
		System.out.println(msg.toLowerCase().contains(value.toLowerCase())); // true
		
		//                   "HELLO, CLASS!".contains("HELLO") -> true
		System.out.println(msg.toUpperCase().contains(value.toUpperCase())); // true
	} 
}
