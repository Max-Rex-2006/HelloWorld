package assignment4;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		/*
Write a Java Program that finds greatest common divisor (GCD) of two numbers 
using Euclid's algorithm, which is an iterative computation based on the following 
observation:  
If y divides x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD 
of x % y and y.  
 
Sample run:  
Enter the first number: 56  
Enter the second number: 98  
GCD of 56 and 98 is 14. 
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scn.nextInt();
		System.out.println("Enter the second number:");
		int b = scn.nextInt();
		int temp;
		while(b>0)
		{
			temp=a%b;
			a=b;
			b=temp;
		}
		System.out.println("GCD of " + a + " and " + b + " is " + a);
		scn.close();
		
	}

}
