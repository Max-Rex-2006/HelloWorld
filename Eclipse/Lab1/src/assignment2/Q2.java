package assignment2;

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
	
	/*
	Write a Java Program that reads the radius and length of a cylinder 
	and computes the area and volume using the following formulas: [Use 
	Math.PI]  
	Formula:                 
	Area = PI * radius * radius       
	Volume = Area * Length 
	 */
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the length and radius of the cylinder:");
	double len = scn.nextDouble();
	double r = scn.nextDouble();
	double area = Math.PI*r*r;
	double vol = Math.PI*r*r*len;
	System.out.println("The area of the open cylinder is:" + area);
	System.out.println("The volume of the open cylinder is:" + vol);
	scn.close();
	}

}
