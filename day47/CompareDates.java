 package day47;

import java.time.LocalDate;
import java.time.Month;

public class CompareDates {
	public static void main(String[] args) {
		
	LocalDate today = LocalDate.now();
	System.out.println(today);
	
	LocalDate someDay = LocalDate.of(2022, Month.NOVEMBER, 25);
	System.out.println(someDay);
	
	System.out.println(today.isAfter(someDay));
	System.out.println(today.isBefore(someDay));
	System.out.println(today.equals(someDay));
	
	//Local Dates and times are immutable object 
	someDay = someDay.plusDays(30);
	System.out.println(someDay);
	
	someDay = someDay.plusWeeks(2);
	System.out.println(someDay);
	
	someDay = someDay.minusWeeks(3);
	System.out.println(someDay);
	

	}
}

