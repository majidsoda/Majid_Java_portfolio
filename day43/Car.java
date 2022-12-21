package day43;

import java.util.Objects;

public class Car {
	public String model;
	public String color;
	public int year;
	public double price;
	
	public Car(String model, String color, int year, double price) {
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
		
		
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, model, price, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && year == other.year;
	}


}

