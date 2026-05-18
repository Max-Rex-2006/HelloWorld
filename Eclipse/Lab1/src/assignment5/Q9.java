package assignment5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scn.nextInt();
		double sum = 0.0;
		for (int i=1; i<n; i++) {
			sum += ((Math.pow(-1, n+1))*2*n)/(2*n-1);
		}
		System.out.println("Sum: " + sum);
		scn.close();
	}

}
