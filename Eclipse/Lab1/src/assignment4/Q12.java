package assignment4;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
	/*
Write a Java program that accepts two numbers from the user — a base and an 
exponent.
The program should calculate the result of raising the base to the power of the exponent
(i.e., base Exponent) without using any built-in power functions such as Math.pow().
Use a loop to perform the repeated multiplication.
Sample run: 
Enter the base: 5 
Enter the power: 4 
5 to the power 4 is: 625
	*/
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the base: ");
	int base = scn.nextInt();
	System.out.println("Enter the power: ");
	int pow = scn.nextInt();
	int res=1;
	for (int i = 1; i<=pow; i++)
	res = res*base ;
	System.out.println(base + " to the power " + pow + " is: " + res);
	scn.close();
	}

}
