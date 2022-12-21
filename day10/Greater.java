package day10;

public class Greater {

	public static void main(String[] args) {

		double res = greater100(555);
		System.out.println(res);

	}

	public static double greater100(double number) {
		if (number > 100) {
			return number;
		} else {
			return 100;
		}

	}
}
