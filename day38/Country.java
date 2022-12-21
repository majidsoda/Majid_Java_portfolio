package day38;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Country {
	public static void main(String[] args) {
		
		Map<String, String> countries = new HashMap<>();
		countries.put("USA", "DC");
		countries.put("Canada", "ottawa");
		countries.put("Brazil", "brasilia");
		
		System.out.println(countries);
		
		Set<String> keys = countries.keySet();
		System.out.println(keys);
		
		for (String key : keys) {
			String value = countries.get(key);
			System.out.println("key: " +key+", Value: "+ value);	
		}
		System.out.println("-------------------------");
		
		for (String key : countries.keySet()) {
			String value = countries.get(key);
			
			value = value.substring(0, 1).toUpperCase() + value.substring(1);
			countries.put(key, value);
		}
		
		// {Canada=Ottawa, USA=Washington, Brazil=Brasilia}
		System.out.println(countries); // {Canada=Ottawa, USA=Washington, Brazil=Brasilia}
		
	}

}
