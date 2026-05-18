package assignment3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*
Write a Java program that reads three integers from the user and prints "Increasing" 
if the numbers are in increasing order, "Decreasing" if the numbers are in decreasing 
order, and "Neither increasing nor decreasing order" otherwise. 
 
Sample Run: 
Input first number: 241  
Input second number:345  
Input third number: 4563  
“Increasing”  
 
Input first number: 345  
Input second number:145  
Input third number: 563  
“Neither Increasing nor decreasing”  
 
Input first number: 45  
Input second number:14  
Input third number: 3  
“Decreasing”
				*/
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter first number:");
				int first = scn.nextInt();
				System.out.println("Enter second number:");
				int second = scn.nextInt();
				System.out.println("Enter third number:");
				int third = scn.nextInt();
				if (first>second)
				{
					if (second>third)
					{
						System.out.println("Increasing");
					}
					else
					{
						System.out.println("Neither Increasing nor Decreasing");
					}
				
				}
				if (third>second)
				{
					if (second>first)
					{
						System.out.println("Increasing");
					}
					else
					{
						System.out.println("Neither Increasing nor Decreasing");
					}
				}
				scn.close();
	}

}
