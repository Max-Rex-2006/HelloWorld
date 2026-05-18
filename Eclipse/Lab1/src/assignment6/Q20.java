package assignment6;

import java.util.Scanner;

public class Q20 {
	public static int countSpaces(String str) {
		str = str.strip();
		int c = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter a sentence: ");
		String s = scn.nextLine();
		int res = countSpaces(s);
		System.out.println("The number of spaces in the sentence is " + res);
		scn.close();
	}
}
