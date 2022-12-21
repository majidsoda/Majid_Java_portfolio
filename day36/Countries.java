package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Countries {
	public static void main(String[] args) {
		// this is not resizable list (you cannot add new elements and you cannot remove old once)
		List<String> countriesTwo = Arrays.asList("USA", "France", "Brazil");
		// countriesTwo.add("Colombia");
		System.out.println(countriesTwo);
		System.out.println("------------------------");

		List<String> countries = new ArrayList<>(Arrays.asList("USA", "France", "Brazil"));
		countries.add("Colombia");
		System.out.println(countries);

		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));

		}
		System.out.println("------------------------");
		for (String str : countries) {
			System.out.println(str);
		}

		System.out.println("------------------------");
		Iterator<String> name = countries.iterator();

		while (name.hasNext()) {
			System.out.println(name.next());

		}
	}
}
