package assignment1;

import java.util.Scanner;

public class Q7 {

	public static void readArray(int[] arr) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the elements of the Array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
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
	public static int count(int[] arr, int value) {
		int c=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == value)
				c++;
		}
		return c;
	}
	public static int posOfMax(int[] arr, int max) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == max)
				return i+1;
		}
		return 0;
	}
	public static int lastPositionOfMin(int[] arr, int min) {
		int pos = 0;
		for(int i=arr.length-1; i>=0; i--) {
			if (arr[i] == min)
				pos = i;
		}
		return pos+1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int size = scn.nextInt();
		int [] a = new int[size];
		readArray(a);
		System.out.println("Maximum element of Array is " + findMax(a) + " and occurs " + count(a,findMax(a)) + " time(s)");
		System.out.println("Minimum element of Array is " + findMin(a) + " and occurs " + count(a,findMin(a)) + " time(s)");
		System.out.println("First occurrence of maximum element is at position " + posOfMax(a,findMax(a)));
		System.out.println("Last occurrence of minimum element is at position " + lastPositionOfMin(a,findMin(a)));
		scn.close();
	}
}
