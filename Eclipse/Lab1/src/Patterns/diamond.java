package Patterns;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        int c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//for first half
		for(count=1; count<=c; count++) {
			//for space print
			for(row=1; row<=c-count; row++) {
				System.out.print(" ");
			}
			//for star print
			for(row=1; row<=count; row++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

        //for second half
		for(count=c; count>=1; count--) {
			//for space print
			for(row=1; row<=c-count; row++) {
				System.out.print(" ");
			}
			//for star print
			for(row=1; row<=count; row++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		scn.close();
    }
}
