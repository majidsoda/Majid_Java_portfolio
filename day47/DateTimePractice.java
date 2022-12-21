package day47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		now = now.plusDays(2).plusHours(5);
		System.out.println(now);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
		System.out.println(f.format(now)); // 12/04/22 06:17 AM
		
	}

}
