package assignment3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner (System.in);
			System.out.println("Enter the luckynumber:");
			int n = scn.nextInt();
			scn.close();
			if(n<0) {
				throw new NumberFormatException();
			}
			else
				System.out.println("Ok");
		}
		catch(NumberFormatException e) {
			System.out.println("Ur luck in negative bro?\n" + e);
		}
	}

}
