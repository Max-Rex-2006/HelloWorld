package Practice;

import java.util.Scanner;

public class gcd {
	public static int findGCD(int x, int y) {
	    while (y != 0) {
	        int temp = y;
	        y = x % y;
	        x = temp;
	    }
	    return x;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
		scn.close();
	}

}
