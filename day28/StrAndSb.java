package day28;

public class StrAndSb {
	public static void main(String[] args) {
		
		// String -> StringBuilder
		String name = "Majid Sodavi";
		// convert String to StringBuilder
		StringBuilder nameSb = new StringBuilder(name);
		nameSb.reverse();
		System.out.println(nameSb);

		// StringBuilder -> String
		StringBuilder sb = new StringBuilder("java is awesome");
		sb.reverse();
		// convert StringBuilder to String
		String str = sb.toString();
		System.out.println(str);
	}
}
//String Pool
//It is a memory for String objects. String reuse the same object in the String Pool. 
//
//Immutable String
//Initial value of String object is not changeable. 
//
//StringBuilder
//Mutable version of the String. When we have to change String many times 
//it is better to use StringBuilder because each change for the String creates new object.

