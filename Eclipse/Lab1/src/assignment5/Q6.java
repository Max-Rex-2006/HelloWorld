package assignment5;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scn.nextInt();
		double sum = 0.0;
		for (int i=1; i<=n; i++) {
			sum += 1/(Math.pow(i, 2));
		}
		System.out.println("Sum: " + sum);
		scn.close();
	}

}
