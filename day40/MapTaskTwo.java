package day40;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTaskTwo {
	public static void main(String[] args) {
		System.out.println(countLetters("hello"));
		System.out.println(countLetters("aaauucchh"));
		System.out.println(countLetters("tttrrtt"));
	}

	public static Map<Character, Integer> countLetters(String str) {
		Map<Character, Integer> letters = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			if (letters.containsKey(ch)) {
				int value = letters.get(ch);
				letters.put(ch, value + 1);
			} else {
			
				letters.put(ch, 1);
			}
		}

		return letters;
	}
}