package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {
	public static void main(String[] args) {
		List<String> list = new ArrayList<> (Arrays.asList("apple","kiwi","orange","banana","mango"));
		System.out.println(list);
		
		Map<String,Integer> map = new HashMap<>();
		for (String str : list) {
			int value = str.length();
			map.put(str, value);
		}
		System.out.println(map);
	}

}
