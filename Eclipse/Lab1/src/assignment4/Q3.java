package assignment4;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		/*
Write a Java program using a do-while loop to repeatedly ask the user to enter a 
number, and display whether it is even or odd. 
 
The program should stop when the user enters 0. 
 
Sample run:  
Enter a number (0 to stop): 5 
5 is an odd number. 
Enter a number (0 to stop): 12 
12 is an even number. 
 
Enter a number (0 to stop): 0 
Program terminated. 
		*/
		Scanner scn = new Scanner(System.in);
		int n;
		do 
		{
			System.out.println("Enter a number:");
			n = scn.nextInt();
			if (n==0)
				break;
			if (n%2==0)
				System.out.println(n + "is an even number");
			else
				System.out.println(n + "is an odd number");
		}while (n!=0);
		System.out.println("Program terminated");
		scn.close();
	}

}
