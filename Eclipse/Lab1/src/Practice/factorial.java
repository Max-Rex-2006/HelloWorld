package Practice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the factorial: ");
		int num = scn.nextInt();
		int fac = 1, temp = num;
		while(temp!=1) {
			if(temp%fac!=0) {
				System.out.println(num + " is not a factorial");
				break;
			}
			else 
			temp /= fac;
			fac++;
		}
		if(temp==1)
			System.out.println(num + " is a factorial of " + (fac-1));
		scn.close();
	}

}
