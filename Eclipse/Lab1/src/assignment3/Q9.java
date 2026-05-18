package assignment3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*
Write a Java program to perform basic arithmetic operations (+, -, *, /) using a switch 
statement.
The user should input two numbers and an operator.
If the operator is invalid or division by zero occurs, display an appropriate message.

Sample Run:
Enter first number: 12
Enter second number: 8
Enter operator (+, -, *, /): +
Result: 20.0
Enter first number: 15
Enter second number: 0
Enter operator (+, -, *, /): /
Error: Division by zero is not allowed!
Enter first number: 7
Enter second number: 3
Enter operator (+, -, *, /): *
Result: 21.0
Enter first number: 10
Enter second number: 5
Enter operator (+, -, *, /): @
Invalid operator! Please use +, -, *, or /.

		*/
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float num1 = scn.nextFloat();
        System.out.println("Enter second number: ");
        float num2 = scn.nextFloat();
        System.out.println("Enter operator (+, -, *, /)");
        char opt = scn.next().charAt(0);
        double res;
        switch(opt){
            case '+': 
            	res = num1 + num2; 
            	System.out.println("Result: " + res); break;
            case '-': 
            	res = num1 - num2; 
            	System.out.println("Result: " + res); break;
            case '*': 
            	res = num1 * num2; 
            	System.out.println("Result: " + res); break;
            case '/': 
            	if (num2==0) {
            	System.out.println("Error: Division by zero is not allowed!");
            	}
            	else {
            	res = num1 / num2;
            	System.out.println("Result: " + res); 
            	}
            	break;
            default: System.out.println("Invalid operator! Please use +, -, *, or /."); break;
        }
        scn.close();
		
	}
}
