package day11;
import util.InputFromUser;

public class LuckyNumbers {
	public static void main(String[] args) {
		int userNumber = Integer.parseInt(InputFromUser.getInput("Enter any number"));
		System.out.println(userNumber);
		
		if ((userNumber ==7 || userNumber ==99 || userNumber ==16)) {
			System.out.println("Lucky Number!");
		}else {
			System.out.println("Not Today!");
		}
	}

	

}
