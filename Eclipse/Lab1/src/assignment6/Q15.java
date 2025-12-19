package assignment6;

import java.util.Scanner;

public class Q15 {
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
        String s = "";
        for (int i = str.length()-1; i >= 0; i--) {
            s += str.charAt(i);
        }
        if (s.equals(str))
        	return true;
        else
        	return false;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter a sentence: ");
		String s = scn.nextLine();
		boolean res = isPalindrome(s);
		if (res)
			System.out.println(s + " is a palindrome.");
		else
			System.out.println(s + " is not a palindrome.");
		scn.close();
	}
}
