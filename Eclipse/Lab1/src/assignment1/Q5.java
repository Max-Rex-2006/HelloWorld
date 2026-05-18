package assignment1;

public class Q5 {

	public static void main(String[] args) {
		/*

Write a Java program to initialize the variable radius of the circle, compute the 
perimeter and area of the circle. [Use Math.PI]
(Assume radius, perimeter, area as double type variable.)
Sample Run:
Radius = 7
Perimeter of circle = 43.982297150257104
Area of the circle = 153.93804002589985

		 */
		double rad=7, per, ar;
		per = 2*Math.PI*rad;
		ar = Math.PI*rad*rad;
		System.out.println("Radius = " + (int)rad);
		System.out.println("Perimeter of the circle = " + per);
		System.out.println("Area of the circle = " + ar);
	}

}
