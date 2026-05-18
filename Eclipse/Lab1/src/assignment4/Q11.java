package assignment4;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*
Write a Java Program to check if a number is perfect number or not.  
Hints: A number N is called perfect number, if the sum of factors except N as a factor 
is equals to the number N.  
Example: N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)  
 
Sample run:  
Enter a number: 496  
496 is a perfect number.  
 
Enter a number: 490  
490 is not a perfect number.
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		int temp=num, sum=1;
		for(int i = 2; i<=(int)(temp/2 + 1); i++) {
			if (num%i==0)
			sum += i;
		}
		if (num==sum)
		System.out.println(num + " is a perfect number.");
		else
		System.out.println(num + " is not a perfect number.");
		scn.close();

	}

}
