package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassScore {
	public static void main(String[] args) {
		List<Double> classScore = new ArrayList<>(Arrays.asList(1.5, 2.1, 3.4));
		double averageRes = getAverage(classScore);
		System.out.println(averageRes); // 2.

		List<Integer> listInput = new ArrayList<>(Arrays.asList(1, 2, 100, 50, 71, 70));
		int sumRes = sum70(listInput);
		System.out.println(sumRes); // 171

		sumRes = sum70(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
		System.out.println(sumRes); // 0

		sumRes = sum70(new ArrayList<>(Arrays.asList(250, 100, 75, 85)));
		System.out.println(sumRes); // 500

	}

	public static double getAverage(List<Double> classScore) {
		double count = 0;
		for (Double num : classScore) {
			count += num;
		}
		return count / classScore.size();
	}

	public static int sum70(List<Integer> listD) {
		int sum = 0;
		for (int d : listD) {

			if (d > 70) {
				sum += d;
			}
		}
		return sum;

	}
}
