package assignment2;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
	/*
	Write a Java Program that prompts the user to enter the side of a hexagon and 
	displays its area.  
	Formula:            
	Area of a hexagon is = (3√3/2)(side)^2 	
	*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of one side of hexagon:");
		float side = scn.nextFloat();
		float area = ((float)Math.sqrt(3)*3*side*side)/2;
		System.out.println("The area of the hexagon is " + area);
		scn.close();
	}

}
