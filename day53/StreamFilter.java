package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,8,6,3,7,2,1));
		System.out.println(numbers);
		
		List<Integer> evens = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println(evens);
		System.out.println("------------------");
		
		List<Integer> resOne = numbers.stream().filter(n -> n>5).collect(Collectors.toList());
		System.out.println(resOne);
		System.out.println("------------------");
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Bek", "Kuba", "Alex", "Misha", "Ramesh", "Vlijay"));
		System.out.println(names); 
		
		List<String> res = names.stream().filter(name -> name.length()>4).collect(Collectors.toList());
		System.out.println(res);
		
		
		
		
		
		
	}

}
