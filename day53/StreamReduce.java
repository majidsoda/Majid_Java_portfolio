package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamReduce {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,8,6,3,7,2,1));
		System.out.println(numbers);
		int sum = numbers.stream().reduce(0, (res, e)-> res + e);
		System.out.println("sum: "+ sum);
		System.out.println("-----------------");
		
		int sumOfEven = numbers.stream().filter(e->e%2==0).reduce(0,(res,e)->res+e);
		System.out.println(sumOfEven);
		System.out.println("-----------------");
		
		List<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Bek", "Kuba", "Neeru", "Misha", "Alex", "Ikbol"));
		System.out.println(names); // [Bek, Kuba, Neeru, Misha, Alex, Ikbol]
		
		// find out total sum of odd length names
		int sumOfOdds = names.stream().map(e -> e.length()).filter(e -> e % 2 == 1).reduce(0, (res, e) -> res + e);
		
		// T identity, BinaryOperator<T> accumulator)
		// T identity - initial value
		// BinaryOperator<T> accumulator) -> (T one, T two)
		System.out.println("sum of odds: " + sumOfOdds);
		
		String resStr = names.stream()
				.map(e -> e.toUpperCase())
				.filter(e -> e.length() < 5)
				.reduce("", (res, e) -> res + e);
		
		System.out.println(resStr); // BEKKUBAALEX
		
		
		
	}

}
