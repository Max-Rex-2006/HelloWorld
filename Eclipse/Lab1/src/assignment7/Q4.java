package assignment7;

import java.util.Scanner;

public class Q4 {
	public static double min(double[] array) {
		double min=array[0];
		for(int i=0; i<array.length; i++) {
			if (min>array[i])
				min = i;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Enter ten numbers: ");
        for(int i=0; i<arr.length; i++) {
        	arr[i] = scn.nextDouble();
        }
        System.out.println("The minimum number is: " + min(arr));
        scn.close();
	}
}
