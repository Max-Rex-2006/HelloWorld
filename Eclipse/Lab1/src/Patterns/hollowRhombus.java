package Patterns;

import java.util.Scanner;

public class hollowRhombus {

	public static void main(String[] args) {
		int c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//outer loop for each line
		for(count=1; count<=c; count++) {
			//inner loop for space print
			for(row=1; row<=c-count; row++) {
				System.out.print(" ");
			}
			//inner loop for star print
			for(row=1; row<=c; row++) {
				if (row==1||count==1||row==c||count==c) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scn.close();
	}

}
