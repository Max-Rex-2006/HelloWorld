package assignment2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
    /*
Write a Java Program that prompts the user to enter three points (x1, y1), (x2, y2), 
(x3, y3) of a triangle and displays its area. 
Formula:
s = (side1 + side2 + side3)/2; 
area=√𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐)	
	*/
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter three points of a triangle:");
		double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();
        double x3 = scn.nextDouble();
        double y3 = scn.nextDouble();
        double a = Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),0.5);
        double b = Math.pow((Math.pow((x3-x2),2)+Math.pow((y3-y2),2)),0.5);
        double c = Math.pow((Math.pow((x1-x3),2)+Math.pow((y1-y3),2)),0.5);
        double s = (a + b + c)/2;
        double area = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        System.out.println("The area of the triangle is " + area);
        scn.close();
    }
}
