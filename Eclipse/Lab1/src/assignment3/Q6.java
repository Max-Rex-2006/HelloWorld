package assignment3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		/*
The two roots of a quadratic equation 𝑎𝑥2 + 𝑏𝑥 +𝑐 = 0 can be obtained using the 
following formula:  
 
r1 = −𝑏 + √𝑏2−4𝑎𝑐/ 2𝑎, and r2 = −𝑏 − √𝑏2−4𝑎𝑐/ 2𝑎
 
b2 - 4ac is called the discriminant of the quadratic equation.  
 
• If it is positive, the equation has two real roots.  
• If it is zero, the equation has one root.  
• If it is negative, the equation has no real roots.  
 
Write a Java Program that prompts the user to enter values for a, b, and c and displays 
the result based on the discriminant.  
 
If the discriminant is positive, display two roots. If the discriminant is 0, display one 
root. Otherwise, display “The equation has no real roots”  
 
Note that you can use Math.pow(x, 0.5) to compute √x 
 
Sample Run: 
Enter a, b, c: 1.0 3 1  
The equation has two roots -0.381966 and -2.61803  
 
Enter a, b, c: 1 2.0 1  
The equation has one root -1  
 
Enter a, b, c: 1 2 3  
The equation has no real roots  
				*/
				Scanner scn = new Scanner(System.in);
				System.out.print("Enter a, b, c:");
				float a = scn.nextFloat();
				float b = scn.nextFloat();
				float c = scn.nextFloat();
				float dis = (float)Math.pow(Math.pow(b,2)-4*a*c,0.5);
				if (dis>0){
					float r1 = (-b + dis) / (2*a);
					float r2 = (-b - dis) / (2*a);
					System.out.println("The equation has two roots: " + r1 + " and " + r2);
				}
				else if (dis==0){
					float r = -b  / (2*a);
					System.out.println("The equation has one root: " + r);
				}
				else{
					System.out.println("The equation has no real roots ");
				}
				scn.close();
	}

}
