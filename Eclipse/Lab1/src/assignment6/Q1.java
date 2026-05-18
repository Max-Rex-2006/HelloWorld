package assignment6;

import java.util.Scanner;

public class Q1 {
    public static double add(double x, double y){
        return (x+y);
    }
    
    public static double sub(double x, double y){
        return (x-y);
    }

    public static double mult(double x, double y){
        return (x*y);
    }

    public static double div(double x, double y){
        if (y==0){
        System.out.println("Error! Division by zero is not allowed.");
        return 0;
        }
        else
        return (x/y);
    }

    public static double rem(double x, double y){
        return (x%y);
    }

    public static double sqrt(double x){
        return (Math.sqrt(x));
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("----- SIMPLE CALCULATOR -----");
        System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Remainder \n 6. Square Root \n 7. Exit\nChoose an option: ");
        byte opt = scn.nextByte();
        while(opt!=7)
        {
        switch(opt)
            {
            case 1: {
                    System.out.println("Enter first number:"); double a = scn.nextDouble();
                    System.out.println("Enter second number:"); double b = scn.nextDouble();
                    double sum = add(a,b);
                    System.out.println("Result(x+y): " + sum);break;
                    }
            case 2: {
                    System.out.println("Enter first number:"); double a = scn.nextDouble();
                    System.out.println("Enter second number:"); double b = scn.nextDouble();
                    double diff = sub(a,b);
                    System.out.println("Result(x-y): " + diff);break;
                    }
            case 3: {
                    System.out.println("Enter first number:"); double a = scn.nextDouble();
                    System.out.println("Enter second number:"); double b = scn.nextDouble();
                    double mult = mult(a,b);
                    System.out.println("Result(x*y): " + mult);break;
                    }
            case 4: {
                    System.out.println("Enter first number:"); double a = scn.nextDouble();
                    System.out.println("Enter second number:"); double b = scn.nextDouble();
                    double div = div(a,b);
                    System.out.println("Result(x/y): " + div);break;
                    }
            case 5: {
                    System.out.println("Enter first number:"); double a = scn.nextDouble();
                    System.out.println("Enter second number:"); double b = scn.nextDouble();
                    double rem = rem(a,b);
                    System.out.println("Result(x%y): " + rem);break;
                    }
            case 6: {
                    System.out.println("Enter number for square root:"); double a = scn.nextDouble();
                    if (a<0){
                    System.out.println("Error! Square root of a negative number is not allowed."); break;
                    }
                    else{
                    double sqrt = sqrt(a);
                    System.out.println("Result = " + sqrt);break;
                    }
                    }
            default:
                    System.out.println("Please enter a valid method");
            }
        System.out.println("----- SIMPLE CALCULATOR -----");
        System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Remainder \n 6. Square Root \n 7. Exit\nChoose an option: ");
        opt = scn.nextByte();
        }
        System.out.println("Exiting.....Thank you!");
        scn.close();
    }
	
}