package day48;

import java.util.ArrayList;
import java.util.List;

public class OutOfBoundExceptions {
	public static void main(String[] args) {

		String str = "apple";
		// str = str.substring(0, 10); // java.lang.StringIndexOutOfBoundsException
		System.out.println(str);

		int[] arr = new int[10];
		// arr[10] = 7; // java.lang.ArrayIndexOutOfBoundsException
		System.out.println(arr);

		List<Integer> list = new ArrayList<>();
		list.get(2); // java.lang.IndexOutOfBoundsException:
		System.out.println(list);

	}

}
