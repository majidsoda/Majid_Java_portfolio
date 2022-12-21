package day49;

public class ErrorExample {
	public static void main(String[] args) {
		// we don't handle error
		// we don't throw them
		myMethod(10254, 2545698.3256);
	}
	public static void myMethod(long lNum, double dNumArg) {
		System.out.println("in the method");
		myMethod(lNum, dNumArg);
	}

}
