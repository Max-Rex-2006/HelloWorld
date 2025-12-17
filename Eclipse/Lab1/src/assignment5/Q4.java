package assignment5;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scn.nextInt();
		System.out.println("Enter second number:");
		int b = scn.nextInt();
		int count=0,max=1,num=a;
		int i,j;
		for(i=a; i<=b; i++) {
			count = 0;
			for (j=1; j<=i; j++)
			{
				if (i%j==0)
				count += 1;
			}
			if (count>=max)
			{
			max = count;
			num = i;
			}
		}
		System.out.println("The number with the most divisors is " + num);
		System.out.println("Number of divisors: " + max);
		scn.close();
	}

}
