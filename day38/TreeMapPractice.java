package day38;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		
		// sorted by key Map implementation
		Map<Integer, Double> items = new TreeMap<>();
		items.put(5, 0.1);
		items.put(3, 0.2);
		items.put(1, 0.3);
		items.put(8, 0.4);
		items.put(12, 0.5);
		items.put(0, 0.6);
		System.out.println(items);	
	}
}
//Map:
//	- key value based data structure 
//	- keys are unique
//
//	1. HashMap
//	   - doesn't maintain insertion order
//	   - it allows one null as key and any number of null as a value
//	   - Unsynchronized (not thread safe)
//
//	2. LinkedHashMap
//	   - it maintains insertion order
//
//	3. Hashtable
//	   - old version of HashMap
//	   - it doesn't allow null key and null values
//	   - syncronyzed (thread safe)
//	   - doesn't maintain insertion order
//
//	4. TreeMap
//	   - the elements of TreeMap are sorted by key

