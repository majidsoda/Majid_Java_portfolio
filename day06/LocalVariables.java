package day06;

public class LocalVariables {
	
	public static void main(String[] args) {
		
		int age = 15;
		
		
		// System.out.println(number); // doesn't compile
		// local variables cannot be used before initialization (they don't have default values)
		
		if (age > 10) {
			String str = "apple";
			System.out.println(str);
		}
		
		// System.out.println(str);
	}
	
	public void test() {
		String firstName = "Alex";
		System.out.println(firstName);
	}
}