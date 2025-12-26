package assignment6;

import java.util.Scanner;

public class Q19 {
	public static Boolean consecutiveOrNot(int x, int y, int z) {
		if(y==(x+1)&&z==(y+1))
			return true;
		else if(y==(x-1)&&z==(y-1))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = scn.nextInt();
		System.out.println("Input the second number: ");
		int b = scn.nextInt();
		System.out.println("Input the third number: ");
		int c = scn.nextInt();
		System.out.println("Check whether the three said numbers are consecutive or not! " + consecutiveOrNot(a,b,c));
		scn.close();
	}
}
