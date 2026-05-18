package assignment3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		/*
A person should walk at least 10,000 steps daily for good health. Write a Java Program 
to input the steps walked.  
 
If the steps are greater than or equal to 10,000, print  
"Good job! You are active today". 
Otherwise, print 
"You need to walk more for good health" 
 
Sample Run: 
Enter the number of steps walked:  
12000 
Good job! You are active today 
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of steps walked:");
		int steps = scn.nextInt();
		if (steps>=10000)
		System.out.println("Good job! You are active today");
		else
		System.out.println("You need to walk more for good health");
		scn.close();
	}

}
