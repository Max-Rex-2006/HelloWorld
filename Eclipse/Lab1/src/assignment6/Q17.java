package assignment6;

import java.util.Scanner;

public class Q17 {
	public static char middleChar(String str) {
		char c;
		int n = str.length();
		if(n%2==0)
			c = str.charAt(n/2);
		else
			c = str.charAt(((n+1)/2)-1);
		return c;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Input a string: ");
		String s = scn.nextLine();
		System.out.println("The middle character in the string: " + middleChar(s));
		scn.close();
	}
}
