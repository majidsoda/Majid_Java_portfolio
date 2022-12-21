package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 2, 1));
		System.out.println(numbers); // [4, 5, 2, 1]
		// Get new List where each element of numbers multiplied by 3

		// Object oriented way
		List<Integer> res = new ArrayList<>();
		for (Integer num : numbers) {
			res.add(num * 3);
		}
		System.out.println(res); // [12, 15, 6, 3]
		System.out.println("----------------------");

		// Functional way by using streams
		// data source -> stream -> result
		List<Integer> resTwo = numbers.stream().map(number -> number * 3).collect(Collectors.toList());
		System.out.println(resTwo); // [12, 15, 6, 3]
		System.out.println("----------------------");
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Gina", "Majid", "Alan", "Lorena", "Daniel"));
		List<Integer> resThree = names.stream().map(n -> n.length()).collect(Collectors.toList());
		System.out.println(resThree);
		
		List<String> namesUpper = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesUpper);

	}

}
