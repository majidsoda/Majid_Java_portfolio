package day08;

import util.InputFromUser;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		

		String numberOfBasketsStr = InputFromUser.getInput("Enter number of basket?");
		String eggsPerBasketStr = InputFromUser.getInput("Enter number of eggs?");
		
		numberOfBaskets = Integer.parseInt(numberOfBasketsStr);
		eggsPerBasket = Integer.parseInt(eggsPerBasketStr);

		totalEggs = numberOfBaskets * eggsPerBasket;

		System.out.println("if you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("The total number of eggs is " + totalEggs);

	}

}
