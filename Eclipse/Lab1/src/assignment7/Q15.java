package assignment7;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] ar = new int[10];
		System.out.println("Enter 10 integers: ");
		for(int i=0; i<ar.length; i++) {
			ar[i] = scn.nextInt();
		}
		System.out.println("After moving all zeros to the beginning: ");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==0)
				System.out.print(ar[i] + " ");
		}
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=0)
				System.out.print(ar[i] + " ");
		}
		scn.close();
	}

}
