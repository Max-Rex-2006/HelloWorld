package assignment2;

import java.util.Scanner;

class Car{
	int year;
	String model;
	public Car() {
		year = 0;
		model = null;
	}
	public void setDetails(int year, String model) {
		this.year = year;
		this.model = model;
	}
	public void displayDetails() {
		System.out.println("Model: " + model + "; Year: " + year);
	}
}
public class Q1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setDetails(2020, "Toyota");
		c1.displayDetails();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the model: ");
		String model = scn.next();
		System.out.println("Enter the year: ");
		int year = scn.nextInt();
		Car c2 = new Car();
		c2.setDetails(year, model);
		c1.displayDetails();
		c2.displayDetails();
		System.out.println("The "+ (c2.year>c1.year?c2.model:c1.model) + " is newer.");
	}
}
