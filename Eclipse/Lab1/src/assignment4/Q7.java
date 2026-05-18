package assignment4;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*
Write a Java Program to display the multiplication table of a number entered by the 
user. 
The program should use three different types of loops to print the table in parts as 
follows: 
• Use a for loop to print the table from 1 to 3 
• Use a while loop to print the table from 4 to 6 
• Use a do-while loop to print the table from 7 to 10 
 
Sample run:  
Enter a number: 5 
 
Using for loop (1 to 3): 
5 x 1 = 5 
5 x 2 = 10 
5 x 3 = 15 
 
Using while loop (4 to 6): 
5 x 4 = 20 
5 x 5 = 25 
5 x 6 = 30 
 
Using do-while loop (7 to 10): 
5 x 7 = 35 
5 x 8 = 40 
5 x 9 = 45 
5 x 10 = 50
		*/
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter a number: ");
				int num = scn.nextInt();
				System.out.println("Using for loop (1 to 3): ");
				for (int i = 1; i<=3; i++)
				System.out.println(num + " X " + i + " = " + num*i);
				System.out.println("Using while loop (4 to 6): ");
				int i = 4;
				while (i<=6) {
					System.out.println(num + " X " + i + " = " + num*i);
					i++;
				}
				System.out.println("Using do-while loop (7 to 10): ");
				i = 7;
				do{
					System.out.println(num + " X " + i + " = " + num*i);
					i++;
				}while (i<=10);
				scn.close();
	}

}
