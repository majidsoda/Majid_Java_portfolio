package day38;

import java.util.HashMap;
import java.util.Map;

public class City {
	public static void main(String[] args) {
		
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		System.out.println(cities);
		
		for (String city : cities.keySet()) {
			Integer value = cities.get(city);
			System.out.println("city: " +city+ ", population: " + value);
		}
		System.out.println("---------------------");
		Integer totalPopulation = 0; 
		for (String city : cities.keySet()) { // or for(Integer value : cities.values()) 
			Integer value = cities.get(city);
			totalPopulation +=value;	
		}
		Integer averagePopulation = totalPopulation / cities.size();
		System.out.println("Total population: " + totalPopulation);
		System.out.println("Average population: " + averagePopulation);
			
	}
}
