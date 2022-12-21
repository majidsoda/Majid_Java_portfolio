package day09;

public class MethodArguments2 {
	public static void main(String[] args) {
		int number = 55;
		number = plusTen(number);//65
		System.out.println(number);
		
		int res = plusTen(99);
		System.out.println(res); // 109
		
		String returnResult = join("A", "B");
		System.out.println(returnResult);
		
		System.out.println(join("A", "B"));
		System.out.println("---------");
		
		String nameInput = "John Doe";
		int ageInput = 26;
		String addressInput = "101 Main st";
		printInfo(nameInput, ageInput, addressInput);
		System.out.println("---------");
		
		String name = "Alex";
		int age = 36;
		String address = "102 North st";
		
		
		printInfo(name, age, address);
	}
	
	// if we specified argument/s for our method
	// we need to provide value for them when we call our method
	public static int plusTen(int numInput) {
		return numInput + 10;
	}
	
	public static String join(String str, String str1) {
		String res = str + " " + str1;
		return res;
	}
	
	public static void printInfo(String name, int age, String address) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
}
