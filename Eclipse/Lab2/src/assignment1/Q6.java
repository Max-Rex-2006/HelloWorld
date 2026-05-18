package assignment1;

import java.util.Scanner;

public class Q6 {
	public static boolean isOdd(int n) {
		while(n>=2) {
			n-=2;
		}
		if(n==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		System.out.println(n + " is odd: " + isOdd(n));
		scn.close();
	}

}
