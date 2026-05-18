package assignment6;

import java.util.Scanner;

public class Q12 {
	public static int countVowels(String str) {
		int c = 0;
		str = str.toLowerCase();
		for(int i = 0; i <= str.length()-1; i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s = scn.next();
		int res = countVowels(s);
		System.out.println("The number of vowels in \"" + s + "\" is " + res);
		scn.close();
	}

}
