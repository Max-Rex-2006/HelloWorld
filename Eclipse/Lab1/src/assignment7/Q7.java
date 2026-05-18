package assignment7;

import java.util.Scanner;

public class Q7 {
	public static void readArray(int[] arr) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter " + arr.length + " elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}
	public static void rotateClockwise(int[] arr) {
		int last = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
	}
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int[] ar = new int[10];
        readArray(ar);
        System.out.println("Array before clockwise rotation: ");
        printArray(ar);
        rotateClockwise(ar);
        System.out.println();
        System.out.println("Array after clockwise rotation: ");
        printArray(ar);
        scn.close();
	}

}
