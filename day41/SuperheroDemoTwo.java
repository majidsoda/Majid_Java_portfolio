package day41;

public class SuperheroDemoTwo {
	public static void main(String[] args) {
		Superhero s1 = new Superhero("Hulk", 3);
		Superhero s2 = s1; 
		
		s2.name = "Flash"; 
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println("-----------------");
		
		Superhero s3 = new Superhero("Mario", 5); 
		System.out.println(s3.name);
		System.out.println(s3.powerLevel);
		
		
	}

}
