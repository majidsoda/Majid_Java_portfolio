package day11;

import util.InputFromUser;

public class BadNumber {
	public static void main(String[] args) {
		int number = Integer.parseInt(InputFromUser.getInput("Enter Number"));
		System.out.println("Number "+number);
		badNumber(number);
		
	}
	public static void badNumber(int number) {
		if (number == 13) {
			System.out.println(number + " is bad number"); 
		} else {
			System.out.println(number +" is regular number"); 
		}
		
	}

}
