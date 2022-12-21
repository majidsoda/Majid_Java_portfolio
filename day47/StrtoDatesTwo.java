package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StrtoDatesTwo {
	
	public static void main(String[] args) {

	String str = "Today is March 8, 2023";
	System.out.println(str);
	
	str = str.substring(9);
	System.out.println(str);
	
	DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM d, uuuu");
	LocalDate date = LocalDate.parse(str, f);
	
	System.out.println(date);
	
	}

}
