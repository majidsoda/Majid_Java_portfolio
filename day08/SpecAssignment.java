package day08;

public class SpecAssignment {
	public static void main(String[] args) {
		int number = 100;
		System.out.println(number);
		// increase value of number by 10
		number = number + 10;
		System.out.println(number); // 110

		number += 10;
		System.out.println(number); // 120

		// = 120 - 20
		// number = number - 20;
		number -= 20;
		System.out.println(number); // 100
		System.out.println("---");

		// = 100 * 2
		// number = number * 2;
		number *= 2;
		System.out.println(number); // 200

		// number = number / 4;
		number /= 4;
		System.out.println(number); // 50

		double dNum = 9.9;
		dNum += 5.5;
		dNum *= 3;
		System.out.println(dNum);

		int num = 100;
		num /= 3.3;
		System.out.println(num);

	}

}
