package Patterns;

import java.util.Scanner;

public class floydTriangle {

	public static void main(String[] args) {
		int c,count,row,num=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//outer loop for each line
		for(count=1;count<=c;count += 1) {
			for(row=1; row<=count; row++) {
				num += 1;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		scn.close();
	}

}
