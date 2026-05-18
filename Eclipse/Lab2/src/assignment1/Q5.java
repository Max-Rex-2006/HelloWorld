package assignment1;

import java.util.Scanner;

public class Q5 {
	public static int sum_Of_Digits(int n) {
		if(n==0)
            return 0;
        while(n>=10){
            int sum = 0;
            while (n>0){
                sum += n%10;
                n /=10;
            }
            n = sum;
        }
        return n;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		System.out.println("Sum of digits of " + n + " until the number is single digit is " + sum_Of_Digits(n));
		scn.close();
	}

}
