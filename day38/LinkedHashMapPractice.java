package day38;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
	public static void main(String[] args) {
		// LinkedHashMap maintain insertion order
		Map<String, Double> fruit = new LinkedHashMap<>();
		fruit.put("orange", 1.05);
		fruit.put("mango", 0.5);
		fruit.put("apple", 0.75);
		fruit.put("lemon", 2.05);
		fruit.put("banana", 1.49);
		
		System.out.println(fruit);
	}
}
