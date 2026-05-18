package assignment4;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
	/*
Write a Java Program to print the sum of all even numbers and the product of all odd 
numbers from 1 to N. 
Where, N is the input to the program. 
Example: 
For input, N = 10 
Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30 
Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945
Sample run: 
Enter the value of N: 10
Sum of all even numbers = 30
Product of all odd numbers = 945
	*/
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the value of N: ");
	int N = scn.nextInt();
	int sum=0, pdt = 1;
	for (int i = 1; i<=N; i++) {
		if(i%2==0)
		sum+=i;
		else
		pdt*=i;
	}
	System.out.println("Sum of all even numbers = " + sum);
	System.out.println("Product of all odd numbers = " + pdt);
	scn.close();
	}

}
