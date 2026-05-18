package assignment5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		int temp = num, sum=0, fact=1;
		while(temp>0) {
			int dig=temp%10;
			fact = 1;
			for(int i=1; i<=dig; i++)
			fact*=i;
			sum = fact + sum;
			temp/=10;
		}
		if (num==sum)
		System.out.println(num + " is a Strong number. ");
		else
		System.out.println(num + " is not a Strong number. ");
		scn.close();
	}

}
