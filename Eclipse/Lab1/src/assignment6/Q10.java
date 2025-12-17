package assignment6;

import java.util.Scanner;

public class Q10 {
	public static int area(int side){
		return side*side;
	}
	public static double area(int length, int breadth){
		return length*breadth;
	}
	public static double area(Double radius){
		return Math.PI*radius*radius;
	}
	public static double area(Double base, Double height){
		return 0.5*base*height;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("=== AREA CALCULATOR (Method Overloading) ===");
		System.out.println(" 1. Area of Square\n 2. Area of Rectangle\n 3. Area of Circle\n 4. Area of Triangle\n 5. Exit\n Enter your choice: ");
		int opt = scn.nextInt();
		switch(opt)
		{
			case 1: System.out.println("Enter side:");
					int s = scn.nextInt(); System.out.println("Area: " + area(s)); break;
			case 2: System.out.println("Enter length:"); int l = scn.nextInt(); 
					System.out.println("Enter breadth:"); int b = scn.nextInt();
					System.out.println("Area: " + area(l,b)); break;
			case 3: System.out.println("Enter radius:");
					double r = scn.nextDouble(); System.out.println("Area: " + area(r)); break;
			case 4: System.out.println("Enter base:"); double bs = scn.nextInt(); 
					System.out.println("Enter height:"); double ht = scn.nextInt();
					System.out.println("Area: " + area(bs,ht)); break;
			default:System.out.println("Please enter a valid choice.");
		}
		scn.close();
	}

}
