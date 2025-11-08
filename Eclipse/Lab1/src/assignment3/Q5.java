package assignment3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
Write a Java program to input the three sides of a triangle and determine its type using 
nested if–else statements. 
 
Your program should first check whether the given sides can form a valid triangle using 
the triangle inequality rule: 
 
The sum of any two sides must be greater than the third side. 
 
If the sides form a valid triangle, determine whether it is: 
• Equilateral – all three sides are equal 
• Isosceles – any two sides are equal 
• Scalene – all three sides are different 
 
If the sides do not satisfy the triangle condition, display a message that they do not 
form a valid triangle. 
 
Sample Run: 
Enter first side: 5 
Enter second side: 5 
Enter third side: 5 
The triangle is Equilateral. 
 
Enter first side: 5 
Enter second side: 7 
Enter third side: 5 
The triangle is Isosceles. 
 
Enter first side: 4 
Enter second side: 5 
Enter third side: 6 
The triangle is Scalene. 
 
Enter first side: 2 
Enter second side: 3 
Enter third side: 6 
The given sides do not form a valid triangle. 
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first side:");
		int first = scn.nextInt();
		System.out.println("Enter second side:");
		int second = scn.nextInt();
		System.out.println("Enter third side:");
		int third = scn.nextInt();
		if((first+second<third)||(second+third<first)||(third+first<second))
		{
			System.out.println("The given sides do not form a valid triangle.");
		}
		else
		{
			if(first==second && second==third)
			{
				System.out.println("The triangle is Equilateral.");
			}
			else 
			{
				if (first==second || second == third || third == first) 
				{
					System.out.println("The triangle is Isoscales.");
				}
				else
				{
					System.out.println("The triangle is Scalene.");
				}
				
			}

		}
		scn.close();
								
	}

}
