package day37;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExampleTwo {
	public static void main(String[] args) {
		//HashSet does not maintains insertion order
		// if we really need insertion order we can use LinkedHashSet
		//LinkedHashSet maintains insertion order
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(-8);
		numbers.add(1);
		numbers.add(0);
		System.out.println(numbers); //[3, 4, -8, 1, 0]
		
		Set<String> names = new LinkedHashSet<>();
		names.add("Kuba");
		names.add("John");
		names.add("Alex");
		names.add("John");
		System.out.println(names); //[Kuba, John, Alex]
		
		//remove(value) removes element from set if present
		names.remove("John");
		System.out.println(names); 
		
		System.out.println(names.contains("Alex"));
		System.out.println(names.contains("Bek"));
		
	}

}
