package assignment4;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
Write a Java Program that gets three integer numbers from the user. Count from the 
first number to the second number increments by the third number.  Use for loop to do 
it.  
 
Also, display the sum of numbers displayed between the first number and second 
number.  
 
Sample run:  
Enter first number: 4  
Enter second number: 13  
Enter third number: 3  
4   7    10    13  
The sum of number displayed is 34 
			*/
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter first number:");
				int a = scn.nextInt();
				System.out.println("Enter second number:");
				int b = scn.nextInt();
				System.out.println("Enter third number:");
				int c = scn.nextInt();
				int sum = 0;
				for(int i =a; i<=b; i+=c) {
					System.out.print(i + " ");
					sum += i;
				}
				System.out.println();
				System.out.println("The sum of numbers displayed is " + sum);
				scn.close();
	}

}

