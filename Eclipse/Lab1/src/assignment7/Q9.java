package assignment7;

import java.util.Scanner;

public class Q9 {
	public static void bubbleSort(double[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					double temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double [] ar = new double[10];
		System.out.println("Enter 10 numbers: ");
		for(int i=0; i<ar.length; i++) {
			ar[i] = scn.nextDouble();
		}
		bubbleSort(ar);
		System.out.println("Sorted List: ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		scn.close();
	}

}
