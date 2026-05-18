package Practice;

import java.util.Scanner;

public class g3_odd_2 {
	public static void readArray(int[] arr) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount of money available in each coach: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}
	public static int arraySum(int[] arr, int n) {
		int sum=0;
		for(int i=n; i<arr.length; i+=2) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = scn.nextInt();
		int [] a = new int[N];
		readArray(a);
		int even = arraySum(a,0);
		int odd = arraySum(a,1);
		System.out.println("The maximum amount of money the thief can steal is " + (even>odd?even:odd));
		scn.close();
	}

}
