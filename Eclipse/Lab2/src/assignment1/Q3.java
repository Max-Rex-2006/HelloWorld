package assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		int temp=num, sum=0, pdt=1;
		while(temp>0) {
			sum += temp%10;
			pdt *= temp%10;
			temp/=10;
		}
		if(sum==pdt)
			System.out.println(num + " is a spy number.");
		else
			System.out.println(num + " is not a spy number.");
		scn.close();
		
	}

}
