package day45;

public class AbstractDemo {
	public static void main(String[] args) {
		// Falcon obj = new Falcon();
			
		Falcon obj = new AmurFalcon();
		obj.age = 2;
		obj.hunt();
		obj.printDetails();
		obj.fly();
		
		System.out.println("----------");
		
		Mammal animal = new Ox();
		animal.eat();
		animal.sleep();
		animal.drinkMilk();
		
	}
}
