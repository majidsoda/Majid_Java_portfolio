package day36;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<>();
		books.add("Java101");
		
		// another way of creating ArrayList
		List<String> bookTwo = new ArrayList<>();
		bookTwo.add("Java101");
		bookTwo.add("OCA");
		bookTwo.add("OCP");
		
		System.out.println(bookTwo.size());
		System.out.println(bookTwo.get(0));
		
	}

}
