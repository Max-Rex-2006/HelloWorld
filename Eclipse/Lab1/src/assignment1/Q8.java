package assignment1;

public class Q8 {

	public static void main(String[] args) {
		/*
Write a Java Program to exchange the values of two variables of integer type A and B. 
(a) Using third temporary variable C.
(b) Without using third temporary variable.
		 */
		int a = 5, b = 10;
		//Using 3rd variable
		int c;
		System.out.println("Before swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		System.out.println();
		
		//Without using 3rd variable
		System.out.println("Before swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
