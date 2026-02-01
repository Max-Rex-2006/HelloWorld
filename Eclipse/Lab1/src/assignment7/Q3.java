package assignment7;

import java.util.Scanner;

public class Q3 {
	public static void readArray(int[] arr) {
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			int n = scn.nextInt();
			arr[i] = n;
		}
		}
	public static int countOccurrences(int[] arr, int key) {
		int c=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten numbers: ");
        readArray(arr);
        System.out.println("Enter the number to search: ");
        int key = scn.nextInt();
        System.out.println("The number " + key + " appears " + countOccurrences(arr, key) + " time(s) in the array.");
        scn.close();
	}
}
