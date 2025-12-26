package assignment6;

import java.util.Scanner;

public class Q10 {
	public static double area(int side) {
		return side*side;
	}
	
	public static double area(int length, int width) {
		return length*width;
	}
	
	public static double area(double radius) {
		return Math.PI*radius*radius;
	}
	
	public static double area(double base, double height) {
		return (0.5)*base*height;
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("=== AREA CALCULATOR (Method Overloading) ===\n1. Area of Square\n2. Area of Rectangle\n3. Area of Circle\n4. Area of Triangle\n5. Exit\nEnter your choice:");
		int opt = scn.nextInt();
		switch(opt)
		{
		case 1: 
			System.out.println("Enter the side:"); int s = scn.nextInt();
			System.out.println("Area of Square: " + area(s));
			break;
		case 2: 
			System.out.println("Enter the length:"); int l = scn.nextInt();
			System.out.println("Enter the width:"); int b = scn.nextInt();
			System.out.println("Area of Rectangle: " + area(l, b));
			break;
		case 3: 
			System.out.println("Enter the radius:"); double r = scn.nextDouble();
			System.out.println("Area of Circle: " + area(r));
			break;
		case 4:
			System.out.println("Enter the base:"); double bs = scn.nextDouble();
			System.out.println("Enter the height:"); double ht = scn.nextDouble();
			System.out.println("Area of Triangle: " + area(bs,ht));
			break;
		case 5: break;
		default: System.out.println("Invalid Choice!");
			
		}
		scn.close();
	}

}
