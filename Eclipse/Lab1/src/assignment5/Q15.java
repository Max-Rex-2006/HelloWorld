package assignment5;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0, b = 1, c = 1, d=0;
		System.out.println("Enter n (n>3): ");
		int n = scn.nextInt();
		System.out.print(a + " " + b + " ");
		if (n>3) {
			for(int i=1;i<n-1;i++) {
				c = a + b + d;
				d = a;
				a = b;
				b = c;
				System.out.print(c + " ");
			}
		}
		else
			System.out.println("n should be greater than 3.");
		scn.close();
	}
}
