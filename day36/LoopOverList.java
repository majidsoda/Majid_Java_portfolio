package day36;

import java.util.ArrayList;
import java.util.List; 
import java.util.Iterator; 

public class LoopOverList {
	public static void main(String[] args) {
		List<String> customers = new ArrayList<>(); 
		customers.add("Majid");
		customers.add("Gina");
		customers.add("Lorena");
		customers.add("Alan");
		
		//1- Loop Over the List by using regular Loop 
		for (int i = 0; i < customers.size(); i++) {
			String eachElement = customers.get(i);
			System.out.println(eachElement);
			customers.set(i, eachElement.toUpperCase());	
		}
		System.out.println(customers);
		System.out.println("----------------------------");
		
		//2- Loop Over the List by using Each Loop 
		for (String element : customers) {
			System.out.println(element+": "+element.length());	
		}
		System.out.println("----------------------------");
		
		//3- Loop Over the List by using Iterator 
		Iterator<String> iterator = customers.iterator();
		
		// hasNext() -> check if iterator has next element
		// next()    -> returns net element and moves th focus to the right 
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}	
	}
}
