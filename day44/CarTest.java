package day44;

import util.InputFromUser;

public class CarTest {
	public static void main(String[] args) {
		Car car;

		String carToTest = InputFromUser.getInput("Car to test:");
		carToTest = carToTest.toLowerCase();

		switch (carToTest) {
		case "audi":
			car = new Audi();
			break;
		case "bmw":
			car = new BMW();
			break;
		case "honda":
			car = new Honda();
			break;
		default:
			throw new IllegalArgumentException("Unsupported car: " + carToTest);
		}
			 
		car.drive();
		car.turnLeft();
		car.drive();
		car.turnRight();
		car.stop();
		double speed = car.getSpeed();
		System.out.println(speed);
		
		// more code...

	}

}
