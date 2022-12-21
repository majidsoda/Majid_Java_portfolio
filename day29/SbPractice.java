package day29;

public class SbPractice {
	public static void main(String[] args) {

		System.out.println(buildAlphabet());
		System.out.println("----------------");
		System.out.println(getNum(1, 10));
		System.out.println(getNum(5, 15));
	}

	public static String buildAlphabet() {
		StringBuilder res = new StringBuilder();
		for (char ch = 'A'; ch < 'Z'; ch++) {
			res.append(ch);
		}
		return res.toString();
	}

	public static String getNum(int start, int end) {

		StringBuilder resNumberRange = new StringBuilder();
		for (int i = start; i <= end; i++) {
			resNumberRange.append(i);
		}
		return resNumberRange.toString();

	}
}
