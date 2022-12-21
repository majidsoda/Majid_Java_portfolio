package day25;

public class Car {

	public String make;
	public String model;
	public int year;
	public String color;

	public Car(String make, String model, int year, String color) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	public void display() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		
		
	}

}
