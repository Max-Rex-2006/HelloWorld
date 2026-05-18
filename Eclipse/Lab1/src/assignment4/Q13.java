package assignment4;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
	/*
Write a Java program to find the sum of all natural numbers within a given range
that are multiples of 3 or 5.
For example, if we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6, and 9.
The sum of these multiples is 23.
Your program should accept a positive integer N as input and display the sum of all the 
multiples of 3 or 5 below N.
Sample run: 
Enter the range (N): 10
The sum of all multiples of 3 or 5 below 10 is: 23
Enter the range (N): 1000
The sum of all multiples of 3 or 5 below 1000 is: 233168
	*/
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the range (N): ");
	int N = scn.nextInt();
	int sum=0;
	for (int i = 1; i<N; i++) {
		if(i%3==0||i%5==0)
		sum+=i;
	}
	System.out.println("The sum of all multiples of 3 or 5 below " + N + " is: " + sum);
	scn.close();
	}

}
