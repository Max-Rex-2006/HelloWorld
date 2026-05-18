package assignment4;

public class Q15 {

	public static void main(String[] args) {
	/*
Write a Java Program to find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum.
Example: 
The sum of the squares of the first ten natural numbers is 1^2 + 2^2 + ... + 10^2 = 385 
The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025 
Hence the difference between the sum of the squares of the first ten natural numbers 
and the square of the sum is 3025 − 385 = 2640.
Sample run: 
Sum of squares of first 100 natural numbers = 338350
Square of the sum of first 100 natural numbers = 25502500
Difference = 25164150
	*/
	int N = 100, sum=0, sqr = 0, temp=0;
	for (int i = 1; i<=N; i++)
		sum += i*i;
	for (int i = 1; i<=N; i++)
		temp += i;
	sqr = temp*temp;
	System.out.println("Sum of squares of first 100 natural numbers = " + sum);
	System.out.println("Square of the sum of first 100 natural numbers = " + sqr);
	System.out.println("Difference = " + (sqr - sum));
	}
}
