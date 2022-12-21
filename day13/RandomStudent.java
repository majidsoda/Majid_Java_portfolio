package day13;

import java.util.Random;
public class RandomStudent {
	public static final int NUMBER_OF_STUDENT = 5;
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int randomNumber = r.nextInt(NUMBER_OF_STUDENT);
		
		if(randomNumber == 0) {
			System.out.println("Majid");
		}else if (randomNumber == 1) {
			System.out.println("Gina");
		}else if (randomNumber == 2) {
			System.out.println("Lorena");
		}else if (randomNumber == 3) {
			System.out.println("Alan");
		}else if (randomNumber == 4) {
			System.out.println("Gustavo");
	
	}
		//Generate numbers in this range: 10-20
		//            2 + 10 = 12
		//            (0-10)+10
		int rNum = r.nextInt(11)+10;
		System.out.println(rNum);
	
	}

}
