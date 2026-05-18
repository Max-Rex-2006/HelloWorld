package assignment2;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
	/*
	Enter the basic salary of an employee of an organization through the keyboard. 
	His dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 
	20% of basic salary. Write a Java Program to calculate his gross salary. Print the DA, 
	HRA and Gross salary. 	 
	*/
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your basic salary:");
		float sal = scn.nextFloat();
		float DA = sal*0.4f;
		float HRA = sal*0.2f;
		System.out.println("His DA is " + DA);
		System.out.println("His HRA is " + HRA);
		System.out.println("Hence, his gross salary is " + (sal+DA+HRA));
		scn.close();
	}

}
