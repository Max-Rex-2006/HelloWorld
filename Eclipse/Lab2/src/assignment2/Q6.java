package assignment2;

class Vehicle{
	int year;
	String model;
	public Vehicle(int year, String model) {
		this.year = year;
		this.model = model;
	}
	public void displayDetails() {
		System.out.println("Model: " + model + "; Year: " + year);
	}
}

class Race extends Vehicle{
	int carId;
	double price;
	Race (String model, int year, int carId, double price) {
		super(year, model);
		this.carId = carId;
		this.price = price;
	}
	public void carDisplay() {
		System.out.println("Model: " + model + "; Year: " + year + "; Car ID: " + carId + "; Price: Rs." + price);
	}
}

public class Q6 {
	public static void main(String[] args) {
		Race c1 = new Race("Toyota", 2020, 25, 125000.50);
		c1.carDisplay();
		Race c2 = new Race("Porsche", 2010, 15, 120000.75);
		c2.carDisplay();
	}
}
