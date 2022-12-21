package day14;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		
		// if y is greater than 5, assign x as y * 2 otherwise y * 3
//		if (y > 5) {
//			x = y * 2;
//		} else {
//			x = y * 3;
//		}
		
		// ternary operator is good when we need to assign some value based on the condition
		// = condition ? trueValue : falseValue  
		x = y > 5 ? y * 2 : y * 3;
		
		System.out.println("y: " + y);
		System.out.println("x: " + x);
		System.out.println("--------------");
		
		boolean b = false;
		//           F
		String str = b ? "left value" : "right value";
		System.out.println(str); // right value
		
		int value = 12;
		
		String msg = value % 2 == 0 ? "even" : "odd";
		System.out.println(msg); // even
		

	}
}