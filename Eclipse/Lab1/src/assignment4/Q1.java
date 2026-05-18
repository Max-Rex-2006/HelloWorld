package assignment4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		/*
Write a Java Program to check whether a number is divisible by 9. Use while loop. 
 
Rule: An integer n is divisible by 9 if the sum of its digits is divisible by 9.  Use this 
concept in your program to determine whether or not the number is divisible by 9.  
 
Test it on the following numbers:  
n = 123456  
n = 154368  
n = 621594  
 
Hint: Use the % operator to get each digit; then use / operator to remove the digit.  
 
Sample run1:  
Enter a number: 154368  
The number 154368 is divisible by 9.  
 
Sample run2:  
Enter a number: 123456  
The number 123456 is not divisible by 9.  
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int temp = num;
		int dig, sum = 0;
		while (temp>0)
		{
			dig = temp%10;
			temp = temp/10;
			sum += dig;
		}
		if ((sum%9)==0)
			System.out.println("The number " + num + " is divisible by 9");
		else
			System.out.println("The number " + num + " is not divisible by 9");
		scn.close();
	}

}
