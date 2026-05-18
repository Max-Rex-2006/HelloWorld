package assignment1;

import java.util.Scanner;

public class Q10 {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(j==columnIndex)
					sum+=m[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double arr[][] = new double [3][4];
		System.out.println("Enter a 3X4 matrix row by row: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scn.nextDouble();
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of the elements at column 0 is " + sumColumn(arr,0));
		System.out.println("Sum of the elements at column 1 is " + sumColumn(arr,1));
		System.out.println("Sum of the elements at column 2 is " + sumColumn(arr,2));
		System.out.println("Sum of the elements at column 3 is " + sumColumn(arr,3));
		scn.close();
	}

}
