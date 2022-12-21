package day22;

public class ForLoopStr {
	public static void main(String[] args) {
		
		String str = "wooden spoon";
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("-----------");
		
		String str2 = "Hello";
		for(int i = str2.length()-1; i>=0 ; i--) {
			System.out.print(str2.charAt(i));
	}
}
}
