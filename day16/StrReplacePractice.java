package day16;

public class StrReplacePractice {
	public static void main(String[] args) {
		String str = "Apple.Banana.Kiwi.Orange";
		System.out.println(str); // Apple.Banana.Kiwi.Orange
		
		// TODO 
		// replace(oldValue, newValue)
		// toLowerCase();
		
		System.out.println(str); // apple, banana, kiwi, orange
		str = str.replace(".", ",");
		System.out.println(str);
		System.out.println(str.toLowerCase());
	}
}
