package assignment5;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scn.nextInt();
		System.out.println("Enter the second number:");
		int b = scn.nextInt();
		System.out.println("Prime numbers between " + a + " and " + b + " are: ");
		for(int i=a+1; i <= b; i++) {
			int c = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.print(i + " ");
		}
		scn.close();
	}

}
