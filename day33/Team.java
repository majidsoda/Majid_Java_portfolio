package day33;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		String[][] teams = { { "Alex", "Mark", "Akyl", "Daniel" }, 
				{ "Ari", "Frank", "Nurik", "Anna" },
				{ "Selvin", "Meerim", "GG" }, 
				{ "Job", "Edil", "Evelyn", "Rocio" } };

		System.out.println(Arrays.deepToString(teams));

		for (String[] innerArray : teams) {
			//for (String name : innerArray) {
			for (int i = 0; i < innerArray.length; i++) {

				System.out.print(innerArray[i].toUpperCase()+" ");
			}
		}

	}
}