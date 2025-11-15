package assignment3;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		/*
Write a Java program to check whether a given year is a leap year or not using the 
following three approaches:
(a) Using nested if–else statements
(b) Using if–else if ladder
(c) Using the conditional (ternary) operator
Note: 
A year is considered a leap year if:
1. It is divisible by 4, and
2. It is not divisible by 100, unless it is also divisible by 400.
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scn.nextInt();
		if ((year%4)==0)
		{
			if ((year%100)==0)
			{
				if ((year%400)==0)
				{
					System.out.println(year + " is a leap year");
				}
				else
				{
					System.out.println(year + " is not a leap year");
				}
			}
			else
			{
				System.out.println(year + " is a leap year");
			}
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
		scn.close();
	}

}
