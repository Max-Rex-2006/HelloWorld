package assignment4;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
Write a Java Program to take an integer input from the user and print the input by 
removing all zeros.  
Example:  
Input = 10200 then Output = 12.  
 
Sample run:  
Enter an integer number: 10203040  
After removing 0 from number 10203040, the new number is 1234. 
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int num = scn.nextInt();
		int result = 0, place = 1;
		int temp = num;
		while (temp>0) {
			int digit = temp%10;
			if (digit!=0) {
				result = digit*place + result;
				place *= 10;
			}
			temp /=10;
		}
		System.out.println("After removing 0 from number " + num + ", the new number is " + result);
		scn.close();
	}

}
