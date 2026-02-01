package Practice;

import java.util.Scanner;

public class primefactor {
	public static boolean isPrime(int num) {
		boolean prime = true;
		for(int i=2; i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	public static int maxPrimefactor(int num) {
		int max = 1;
		for(int i=1; i<(num/2)+1; i++) {
			if(num%i==0) {
				if(isPrime(i)) {
					if(i>max)
						max =i;
				}
					
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scn.nextInt();
		System.out.println("The greatest prime factor of " + num + " is " + (maxPrimefactor(num)==1?num:maxPrimefactor(num)));
	}

}
