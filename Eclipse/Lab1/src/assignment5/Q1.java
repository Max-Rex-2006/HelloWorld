package assignment5;

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int rev=0, temp=num;
		boolean is_prime = true;
		while(temp!=0) {
			rev = rev*10 + temp%10;
			temp /= 10;
		}
		for (int i=2; (i<num && i<rev); i++) {
			if (num%i==0||rev%i==0)
				is_prime = false;
		}
		if (is_prime==true)
		System.out.println(num + " is a twisted prime.");
		else
		System.out.println(num + " is not a twisted prime.");
		scn.close();
	}

}
