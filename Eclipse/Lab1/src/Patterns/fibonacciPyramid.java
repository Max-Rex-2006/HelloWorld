package Patterns;

import java.util.Scanner;

public class fibonacciPyramid {

	public static void main(String[] args) {
		int col,count,row;
		int a=0,b=1,c=a+b;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		col = scn.nextInt();
		//outer loop for each line
		for(count=1; count<=col; count++) {
			//inner loop for space print
			for(row=1; row<=col-count; row++) {
				System.out.print(" ");
			}
			//inner loop for number print
			for(row=1; row<=count; row++) {
				System.out.print(a+ " ");
				c = a+b;
				a = b;
				b = c;
			}
			System.out.println();
		}
		scn.close();
	}

}
