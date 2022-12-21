package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		// removing duplicates
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 1))));
		// [1, 2, 3]

		System.out.println(removeDup(new ArrayList<>(Arrays.asList(1, 1))));
		// [1]

		System.out.println(removeDup(new ArrayList<>(Arrays.asList(5, 4, 6))));
		// [5, 4, 6]

		System.out.println("---");

		System.out.println(removeDupStr("aaabbccaa")); // abc
		System.out.println(removeDupStr("hello")); // helo
		System.out.println(removeDupStr("java")); // java
	}
	public static List<Integer> removeDup(List<Integer> list) {
		// TODO load to set and convert back to ask data type
		
		Set<Integer> x = new LinkedHashSet<>(list);
		return new ArrayList<>(x);
	}
	public static String removeDupStr(String str) {
		// TODO load to set and convert back to ask data type
		Set<Character> y = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			y.add(ch);
		}
		StringBuilder res = new StringBuilder(); 
		for (char ch : y) {
			res.append(ch);
		}
		return res.toString();
	}
}
