package assignment6;

import java.util.Scanner;

public class Q14 {
	public static String toTitleCase(String str) {
		str = str.trim();
        String result = "";
        boolean cap = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                result += c;
                cap = true;
            } else {
            	if (cap) {
                    result += Character.toUpperCase(c);
                    cap = false;
                } else 
                    result += Character.toLowerCase(c);
            }
        }
        return result;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s = scn.nextLine();
		System.out.println("Converted string: " + toTitleCase(s));
		scn.close();
	}
}
