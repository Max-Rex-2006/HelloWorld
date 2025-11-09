package Patterns;

import java.util.Scanner;

public class palindromePyramid {

	public static void main(String[] args) {
		int c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		
        for(count=1; count<=c; count++) {
           //spaces
           for(row=1; row<=c-count; row++) {
               System.out.print(" ");
           }


           //first part
           for(row=count; row>=1; row--) {
               System.out.print(row);
           }


           //second part
           for(row=2; row<=count; row++) {
               System.out.print(row);
           }
           System.out.println();
        }
        scn.close();
	}
}
