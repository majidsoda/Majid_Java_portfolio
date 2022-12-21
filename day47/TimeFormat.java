package day47;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println("Time: "+now);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
		String timeStr = f.format(now);
		System.out.println("Time: "+timeStr);
		
		f= DateTimeFormatter.ofPattern("hh:mm a");
		timeStr = f.format(now);
		System.out.println("Time: "+timeStr);
		
		LocalTime breakTill = now.plusMinutes(10);
		timeStr = f.format(breakTill);
		System.out.println("BREAK TILL " + timeStr); // BREAK TILL 08:12 PM
	}

}
