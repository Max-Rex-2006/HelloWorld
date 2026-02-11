package assignment1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		int size = scn.nextInt();
		int arr[][] = new int [size][size];
		System.out.println("Enter elements of the 2D array: ");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int sum = 0;
		System.out.println("The elements of the 2D array are:");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The sum of the elements of the 2D array is " + sum);
		scn.close();
	}

}
