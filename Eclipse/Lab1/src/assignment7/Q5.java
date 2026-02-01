package assignment7;

import java.util.Scanner;

public class Q5 {
	public static int findSecondLargest(int[] arr) {
		int max=0, s_max=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				s_max = max;
				max = arr[i];
			}
			else if(arr[i]>s_max && max!=arr[i])
				s_max=arr[i];
		}
		return s_max;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scn.nextInt();
		System.out.println("Enter the elements:");
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]= scn.nextInt();
		}
		System.out.println("Second Largest Value: " + findSecondLargest(a));
		scn.close();
	}
}
