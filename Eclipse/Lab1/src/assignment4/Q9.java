package assignment4;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*
Write the Java Program to check whether a number is a “Niven number” or not.  
 
A number is called as the Niven number if the number is divisible by its sum.  
 
Example: 18 is a Niven number.  
Sum of the digit of 18 = (1+8) = 9 
18 is divisible by 9 
 
Sample run:  
Enter a number: 18 
18 is a Niven number.
Enter a number: 21 
21 is a Niven number.
				*/
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter a number: ");
				int num = scn.nextInt();
				int temp=num, sum=0, dig;
				while(temp!=0) {
					dig = temp%10;
					sum += dig;
					temp = temp/10;
				}
				if (num%sum==0)
				System.out.println(num + " is a Niven number.");
				else
				System.out.println(num + " is not a Niven number.");
				scn.close();
	}

}
