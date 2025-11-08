package assignment3;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*
Write a Java Program to input the age of a person and check if the age of the person 
is greater than or equal to 18 then print the message:  
 
                          “You are eligible to cast your vote”. 
Sample Run: 
Enter the age of the person: 
25 
You are eligible to cast your vote
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the age of the person:");
		int age = scn.nextInt();
		if (age>=18)
		System.out.println("You are eligible to cast your vote.");
		scn.close();
		
	}

}
