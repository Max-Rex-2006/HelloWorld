package assignment6;

import java.util.Scanner;

public class Q18 {
	public static double volume(int side) {
		return side*side*side;
	}
	
	public static double volume(double length, double width, double height) {
		return length*width*height;
	}
	
	public static double volume(double radius) {
		return (4/3)*Math.PI*radius*radius*radius;
	}
	
	public static double volume(double radius, double height) {
		return Math.PI*radius*radius*height;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("=== VOLUME CALCULATOR (Method Overloading) ===\n1. Volume of Cube\n2. Volume of Rectangular Prism (Cuboid)\n3. Volume of Sphere\n4. Volume of Cylinder\n5. Exit\nEnter your choice:");
		int opt = scn.nextInt();
		switch(opt)
		{
		case 1: 
			System.out.println("Enter the side:"); int s = scn.nextInt();
			System.out.println("Volume of Cube: " + volume(s));
			break;
		case 2: 
			System.out.println("Enter the length:"); double l = scn.nextInt();
			System.out.println("Enter the width:"); double b = scn.nextInt();
			System.out.println("Enter the height:"); double h = scn.nextInt();
			System.out.println("Volume of Rectangular Prism: " + volume(l, b, h));
			break;
		case 3: 
			System.out.println("Enter the radius:"); double r = scn.nextInt();
			System.out.println("Volume of Sphere: " + volume(r));
			break;
		case 4:
			System.out.println("Enter the radius:"); double rad = scn.nextInt();
			System.out.println("Enter the height:"); double ht = scn.nextInt();
			System.out.println("Volume of Cylinder: " + volume(rad,ht));
			break;
		case 5: break;
		default: System.out.println("Invalid Choice!");
			
		}
		scn.close();
	}
}
