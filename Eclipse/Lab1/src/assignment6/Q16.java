package assignment6;

import java.util.Scanner;

public class Q16 {
	public static boolean isValidPassword(String password) {
		if (password.length()<8)
			return false;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
            if(Character.isLetterOrDigit(c)==false)
            	return false;
        }
		int c = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
            if(Character.isDigit(ch))
            	c++;
        }
        if (c<2)
        	return false;
        return true;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter password: ");
		String s = scn.nextLine();
		boolean res = isValidPassword(s);
		if (res)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		scn.close();
	}
}
