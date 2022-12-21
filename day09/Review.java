package day09;

public class Review {
	public static void main(String[] args) {
		// Increment and decrement operators
		int age = 10;
		
		age++; // by using increment operator increase value by one
		System.out.println(age); // 11
		
		age--; // by using decrement operator decrement value by one
		System.out.println(age); // 10
		
		// post vs pre
		// post decrement/increment - the effect of incr/decr will be next time when 
		//                            we use our variable
		// pre decrement/increment  - the effect of incr/decr will be applied right away.
		
		int number = 77;
		System.out.println(number++ + " " + number); // 77 78
		
		System.out.println(++number); // 79
		System.out.println(number); // 79
		System.out.println("----------------");
		
		// Spec assignment operators
				int num = 20;
				System.out.println(num); // 20

				num = num + 10;
				System.out.println(num); // 30
				
				num += 10;
				System.out.println(num); // 40
				
				num -= 5;
				System.out.println(num); // 35
				
				//                 35 - 10 = 25
				System.out.println(num - 10); // 25
				System.out.println(num); // 35
		
		
	}
}