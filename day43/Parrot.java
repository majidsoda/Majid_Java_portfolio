package day43;

public class Parrot extends Bird {
	public static void main(String[] args) {
		Parrot parrot = new Parrot(); 
		parrot.name = "Benji";
		parrot.fly();
		parrot.talk();
	}
	
	@Override
	public void fly() {
		super.fly();
		System.out.println("Parrot "+name+ " is flying");
	}

	public void talk() {
		System.out.println("Parrot is talking");  
	}

}
