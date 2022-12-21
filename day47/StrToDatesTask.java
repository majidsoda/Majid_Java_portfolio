package day47;

import java.time.LocalDate;

public class StrToDatesTask {
	public static void main(String[] args) {

		String str = "Order date 2022-02-08";
		
		int a = str.indexOf("2");
		
		str = str.substring(a);

		LocalDate x = LocalDate.parse(str);

		LocalDate today = LocalDate.now();
		boolean isBefore = x.isBefore(today);
		if (isBefore) {
			System.out.println("Pass");
		} else {
			System.out.println("Faild");
		}

	}

}
