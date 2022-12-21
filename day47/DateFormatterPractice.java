package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterPractice {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String todayStr = f.format(today);
		System.out.println(todayStr);
		
		f = DateTimeFormatter.ofPattern("MMM dd, YY");
		todayStr = f.format(today);
		System.out.println(todayStr);
		
		f= DateTimeFormatter.ofPattern("dd/MM/YY");
		todayStr = f.format(today);
		System.out.println(todayStr);
		
	}

}
