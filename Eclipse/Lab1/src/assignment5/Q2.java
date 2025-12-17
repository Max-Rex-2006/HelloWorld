package assignment5;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scn.nextInt();
		System.out.println("Enter second number:");
		int b = scn.nextInt();
		int sum = 0;
		for(int i=1; i<a; i++) {
			if(a%i==0)
				sum +=i;
		}
		boolean res = sum==b;
		sum=0;
		for(int i=1; i<b; i++) {
			if(b%i==0)
				sum +=i;
		}
		if (res&&(a==sum))
		System.out.println(a + " and " + b + " are amicable numbers.");
		else
		System.out.println(a + " and " + b + " are not amicable numbers.");
		scn.close();
	}

}

