package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class NameList {
	public static void main(String[] args) {
		// ArrayList
		
		// Array is fixed sized collection of variables
		// - fixed size
		// - it can work with primitives and objects

		String[] names = new String[3];
		names[0] = "Majid";
		names[1] = "Gina";
		names[2] = "Lorena";
		
		System.out.println(Arrays.toString(names));
		System.out.println(names[0]);
		
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("Majid");
		namesList.add("Gina");
		namesList.add("Lorena");
		namesList.add("Alan");
		System.out.println(namesList);
		
		System.out.println(namesList.get(0));
		String name = namesList.get(3);
		System.out.println(name);
		
		namesList.set(3, "Daniel");
		System.out.println(namesList);
	}

}
