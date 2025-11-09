package Patterns;

import java.util.Scanner;

public class reverseHalfPyramid {
	
	public static void main(String args[]) {
		int c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//outer loop for each line
		for(count=c;count>=1;count--) {
			for(row=1; row<=count; row++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scn.close();
	}

}
