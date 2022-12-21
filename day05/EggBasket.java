package day05;

public class EggBasket {
	public static void main (String[] vergs) {
		int numberOfBasket, eggPerBasket, totalEgge;
		
		numberOfBasket = 10;
		eggPerBasket = 6;
		
		totalEgge = numberOfBasket * eggPerBasket;
		
		System.out.println("if you have");
		
		System.out.println(numberOfBasket + " baskets, and");
		System.out.println(eggPerBasket + " eggs per basket, then");
		System.out.println("the total number of eggs is " + totalEgge);
		
	}

}
