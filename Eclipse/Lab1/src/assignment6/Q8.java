package assignment6;

import java.util.Scanner;

public class Q8 {
	public static int largestDigit(int n) {
		int l = 0;
		while(n>0) {
			if(l<(n%10))
				l = n%10;
			n /= 10;
		}
		return l;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scn.nextInt();
		System.out.println("Largest digit: " + largestDigit(num));
		scn.close();
	}
}
