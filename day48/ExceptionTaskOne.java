package day48;

public class ExceptionTaskOne {
	public static void main(String[] args) {
		String str = null;
		
		try {
			str = str.toLowerCase();			
			
		} catch(NullPointerException e) {
			System.out.println("str was null");
		
		}
		
		System.out.println(str);
	}

}
