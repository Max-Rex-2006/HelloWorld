package assignment7;

import java.util.Scanner;

public class Q6 {
	public static void readArray(int[] arr) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter " + arr.length + " elements: ");
		for(int i=0; i<arr.length; i++) {
			int n = scn.nextInt();
			arr[i] = n;
		}
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	public static int countOccurrences(int[] arr, int value) {
		int c=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == value)
				c++;
		}
		return c;
	}
	public static int firstPositionOfMax(int[] arr, int max) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == max)
				return i+1;
		}
		return 0;
	}
	public static int lastPositionOfMin(int[] arr, int min) {
		int pos = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == min)
				pos = i;
		}
		return pos+1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scn.nextInt();
		int [] a = new int[size];
		readArray(a);
		System.out.println("The largest element is: " + findMax(a));
		System.out.println("It occurs " + countOccurrences(a,findMax(a)) + " time(s)");
		System.out.println("First position of maximum: " + firstPositionOfMax(a,findMax(a)));
		System.out.println();
		System.out.println("The smallest element is: " + findMin(a));
		System.out.println("It occurs " + countOccurrences(a,findMin(a)) + " time(s)");
		System.out.println("Last position of minimum: " + lastPositionOfMin(a,findMin(a)));
		scn.close();
	}

}
