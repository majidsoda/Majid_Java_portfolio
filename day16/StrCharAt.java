package day16;

public class StrCharAt {
	public static void main(String[] args) {
		// charAt(int index) gets specific char by index
		//            0123
		String str = "HOME";
		char ch = str.charAt(1);
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(0));
		//System.out.println(str.charAt(4)); Error - String Index is out of Range 
		
		
		
	}

}
