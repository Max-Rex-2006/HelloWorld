package assignment3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*
Make a simple game involving a computer and a user. The computer first guesses a 
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and 
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is 
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.  
 
Sample Run: 
Enter user number: 2  
Computer guesses: 3  
“Almost got it”  
 
Enter user number: 4  
Computer guesses: 4 
 “You got it right”  
 
Enter user number: 1  
Computer guesses: 5  
“You got it wrong” 
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter user number:");
		int userguess = scn.nextInt();
		int compguess = (int)(Math.random()*9+1);
		if (userguess==compguess)
		{
			System.out.println("You got it right");
		}
		else
		{
			if (userguess==(compguess+1)|| userguess==(compguess-1))
			{			
				System.out.println("You almost got it right");
			}
			else
			{
				System.out.println("You got it wrong");
			}
							
		}
		scn.close();
	}

}
