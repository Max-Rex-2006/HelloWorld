package assignment6;

import java.util.Scanner;

public class Q9 {
	public static int reverse(int num) {
		int rev=0;
        while(num>0)
        {
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }
	
	public static boolean isPalindrome(int num) {
		if (num==reverse(num))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = scn.nextInt();
		if (isPalindrome(n)==true)
			System.out.println(n + " is a palindrome.");
		else
			System.out.println(n + " is not a palindrome.");
		scn.close();
	}

}
