package assignment7;

import java.util.Scanner;

public class Q1 {
	public static int findSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static double findAverage(int[] arr) {
		return findSum(arr)/arr.length;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scn.nextInt();
		int[] a = new int[size];
		System.out.print("Random values stored in the array: ");
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i] + " ");;
		}
		System.out.println();
		System.out.println("Sum of elements = " + findSum(a));
		System.out.println("Average of elements = " + findAverage(a));
		scn.close();
	}

}
