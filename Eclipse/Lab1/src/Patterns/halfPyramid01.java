package Patterns;

import java.util.Scanner;

public class halfPyramid01 {

	public static void main(String[] args) {
		int c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//outer loop
		for(count=1;count<=c;count += 1) {
			//inner loop
			for(row=1; row<=count; row++) {
				//cell ->(count,row)
				if (((row+count)%2)==0) {
					System.out.print(1 + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}

	}

}
