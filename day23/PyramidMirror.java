package day23;

import util.InputFromUser;

public class PyramidMirror {

	public static void main(String[] args) {
		String inputStr = InputFromUser.getInput("Enter number:");
		int pyramidLevel = Integer.parseInt(inputStr);

		String hash = "#";
		for (int i = pyramidLevel; i >= 1; i--) {
				System.out.println(hash.repeat(i));		
		}
	
	for (int i=2; i<=pyramidLevel; i++) {
		
			System.out.println(hash.repeat(i));

	}
}}

