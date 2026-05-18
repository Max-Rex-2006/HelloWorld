package assignment6;

import java.util.Scanner;

public class Q4 {
		public static double area(int n, double side) 
		{
			double res = (n*side*side)/(4*Math.tan((Math.PI)/n));
			return res;
		}
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			double res;
			System.out.println("Enter the number of sides: ");
			int n = scn.nextInt();
			System.out.println("Enter the length of each side: ");
			double side = scn.nextDouble();
			res = area(n,side);
			System.out.print(res);
			scn.close();
		}

}
