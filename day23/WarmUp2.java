package day23;

public class WarmUp2 {
	public static void main(String[] args) {
		
		printLetters("apple");	
		System.out.println("---");
		printRevLetters("java");
	}
	public static void printRevLetters(String str) {
		
		for (int i = str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			System.out.println(ch);		
		}
	}
	public static void printLetters(String str) {
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
