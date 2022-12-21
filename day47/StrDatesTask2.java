package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StrDatesTask2 {
	public static void main(String[] args) {

		String str = "Deleted date is 12/01/2022";
		
		// 1. Get date part from str
		String[] parts = str.split(" ");
		str = parts[parts.length - 1];
		System.out.println(str); // 12/01/2022

		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/uuuu");

		LocalDate x = LocalDate.parse(str, f);
		LocalDate today = LocalDate.now();

		System.out.println(today.equals(x));
	}

}
