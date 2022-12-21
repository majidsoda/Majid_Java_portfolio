package day41;

public class Superhero {
	public String name;
	public int powerLevel; 
	
	public Superhero() {
		
	}
	public Superhero(String name) {
		this.name = name;
	}
	public Superhero(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel; 
	}
	public String obj() {
		return name+" "+powerLevel; 
	}
	
	
	
	

}
