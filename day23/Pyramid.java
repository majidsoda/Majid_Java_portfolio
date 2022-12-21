package day23;

import util.InputFromUser;

public class Pyramid {
	public static void main(String[] args) {
		String inputStr = InputFromUser.getInput("Enter number");
		int pyramid = Integer.parseInt(inputStr);
	

		String hash = "#";
		String pyramidDisplay = hash;
		for(int i = 0; i<pyramid; i++) {
			System.out.println(pyramidDisplay);
			pyramidDisplay= pyramidDisplay+hash;
		}

	}
}
