package assignment4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*
Write a Java program that generates a random integer number between 1 and 10. 
 
The program should repeatedly ask the user to guess the number until the correct guess 
is made. 
 
• If the user’s guess is greater than the random number, display the message: 
"Too high, try again." 
• If the user’s guess is less than the random number, display the message: 
"Too low, try again." 
• If the user guesses correctly, display the message: 
"Good guess!" 
 
The program must use a do-while loop to continue prompting the user until the correct 
number is guessed. 
 
Sample run:  
Guess the number between 1 and 10! 
Enter your guess: 7 
Too high, try again. 
Enter your guess: 3 
Too low, try again. 
Enter your guess: 5 
Good guess!
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Guess the number between 1 and 10!");
		int compguess = (int)(Math.random()*10+1);
		int userguess;
		do 
		{
			System.out.println("Enter your guess:");
			userguess = scn.nextInt();
			if (userguess==compguess)
				System.out.println("Good Guess!");
			else if (userguess<compguess)			
				System.out.println("Too low, try again");
			else
				System.out.println("Too high, try again");
		}while(userguess!=compguess);
		scn.close();
	}

}
