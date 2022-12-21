package day15;

public class ChangeStrPractice {
	public static void main(String[] args) {
		System.out.println(changeStr("Abc")); // abc 
		System.out.println(changeStr("Beknazar")); // BEKNAZAR 
		System.out.println(changeStr("John Doe")); // JOHN DOE 
		System.out.println(changeStr("JAVA")); // java
		System.out.println(changeStr("java")); // java
	}
	/*
	 * if name argument length is greater than 5 return it all in upper cases
	 * otherwise return it in all lower cases
	 * - length()
	 * - if else
	 * - toUpperCase() 
	 * - toLowerCase()
	 */	

	public static String changeStr(String name) {
		int numberOfChars = name.length();
		
		String msg = numberOfChars > 5 ? name.toUpperCase(): name.toLowerCase();
		return msg;
	}
	

		//if (numberOfChars > 7) {
		//	return name.toUpperCase();
		//} else {
		//	return name.toLowerCase();
		
	}

