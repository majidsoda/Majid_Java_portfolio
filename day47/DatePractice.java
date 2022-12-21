package day47;

import java.time.LocalDate;
import java.time.Period;

public class DatePractice {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.isLeapYear());
		System.out.println("----------------------");
		
		LocalDate birthday = LocalDate.of(1984,1,13);
		System.out.println(birthday);
		System.out.println(birthday.getDayOfWeek());
		System.out.println(birthday.isLeapYear());
		System.out.println(Period.between(birthday, today).getYears());
		System.out.println("----------------------");
		
		LocalDate someHappyDay = LocalDate.of(2025, 12, 1);
 		System.out.println(someHappyDay.getDayOfWeek());
 		System.out.println(someHappyDay.isLeapYear());
		
	}

}
