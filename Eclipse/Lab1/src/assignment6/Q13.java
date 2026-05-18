package assignment6;

import java.util.Scanner;

public class Q13 {
	public static int countWords(String str) {
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
		int res = countWords(s);
		System.out.println("The number of words in the sentence is " + (res+1));
		scn.close();
	}

}
