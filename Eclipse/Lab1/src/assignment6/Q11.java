package assignment6;

import java.util.Scanner;

public class Q11 {
	public static int count(String str, char a) {
		int c = 0;
		for(int i = 0; i <= str.length()-1; i++) {
			if(str.charAt(i)==a)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s = scn.next();
		System.out.println("Enter a character: ");
		char ch = scn.next().charAt(0);
		int res = count(s,ch);
		System.out.println("The number of occurrences of '" + ch + "' in \"" + s + "\" is " + res);
		scn.close();
	}

}
