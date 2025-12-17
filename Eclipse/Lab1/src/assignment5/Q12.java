package assignment5;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of m:");
		int m = scn.nextInt();
		System.out.println("Enter the value of n:");
		int n = scn.nextInt();
		for(int i=m; i <= n; i++) {
			int f = 1;
			for(int j = 1; j<=i; j++) {
				f *= j;
			}
			System.out.println("The factorial of " + i + " is: " + f);
		}
		scn.close();
	}

}
