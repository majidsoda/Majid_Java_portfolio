package day34;

public class VarargsPractice {
	public static void main(String[] args) {
		int res = max(4, 5);
		System.out.println(res); // 5
		
		res = max(9, 7, 3);
		System.out.println(res); // 9
		
		int[] arrNum = {8, 6, 7, 100, 4, 33, 12};
		res = max(arrNum);
		System.out.println(res); // 100	
		
	}
	public static int max(int... num) {
		int max = num[0];

		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}
		
	}

