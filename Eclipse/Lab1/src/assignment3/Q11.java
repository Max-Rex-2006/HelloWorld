package assignment3;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
	/*
Write a Java Program that prompts the user to enter an integer and determines whether 
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 
5 or 6, but not both. 
Sample Run:
Enter an integer: 10 
Is 10 divisible by 5 and 6? false 
Is 10 divisible by 5 or 6? true 
Is 10 divisible by 5 or 6, but not both? True
	*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scn.nextInt();
		System.out.println("Is " + num + " divisible by 5 and 6? " + (num%5==0 && num%6==0));
		System.out.println("Is " + num + " divisible by 5 or 6? " + (num%5==0 || num%6==0));
		System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + ((num%5!=0 && num%6!=0)^(num%5==0 || num%6==0)));
		scn.close();
				
	}

}
