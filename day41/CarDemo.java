package day41;

public class CarDemo {
	public static void main(String[] args) {
		
	
	Car car1 = new Car();
	car1.setModel("Fiat");
	car1.setPrice(1100.0);
	car1.setYear(2017);
	
	System.out.println(car1.getModel());
	System.out.println(car1.getPrice());
	System.out.println(car1.getYear());
	
	System.out.println("--------------");
	
	Car carTwo = new Car();
	carTwo.setModel("BMW");
	carTwo.setPrice(35000.0);
	carTwo.setYear(1995);
	System.out.println(carTwo.getModel());
	System.out.println(carTwo.getPrice());
	System.out.println(carTwo.getYear());

	}
}
