package assignment2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
    /*
Write a Java Program that prompts the user to enter two points (x1, y1) and (x2, y2) 
and displays their distance between them. 
Formula:
distance = √(𝒙𝟐 − 𝒙𝟏)^𝟐 + (𝒚𝟐 − 𝒚𝟏)^𝟐
Note: 
Use Math.pow (a, 0.5) to compute √a 	
	*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter x1 and y1:");
		double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        System.out.println("Enter x2 and y2:");
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
        double dist = Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),0.5);
		System.out.println("The distance between the two points is " + dist);
		scn.close();
    }
}
