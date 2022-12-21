package homeWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Project {
	public static void main(String[] args) {

		String[] a = { "aa", "bb", "cc", "aAA", "cCC", "d" };
		word0(a);
		System.out.println(word0(a));
	}
	public static Map<String, String> word0(String[] strings) {
		Map<String, String> x = new LinkedHashMap<>();

		for (String str : strings) {
			String c = str.substring(0, 1);
			if (x.containsKey(c)) {
				x.put(c, x.get(c) + str);

			} else {
				x.put(c, str);
			}
		}
		return x;
	}
}// modified by majid 12/21/22
