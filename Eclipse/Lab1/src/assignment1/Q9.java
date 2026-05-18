package assignment1;

public class Q9 {

	public static void main(String[] args) {
		/*
		Write a Java Program to exchange the values of three variables of integer type A, B and C. 
		(a) Using third temporary variable D.
		(b) Without using third temporary variable.
		*/
		int a = 10, b = 20, c = 30;
		//Using 4th variable
		int d;
		System.out.println("Before swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		d = a;
		a = b;
		b = c;
		c = d;
		System.out.println("After swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		
		System.out.println();
		
		//Without using 4th variable
		System.out.println("Before swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		a = a + b + c;
		b = a - b - c;
		c = a - b - c;
		a = a - b - c;
		System.out.println("After swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
	}

}
