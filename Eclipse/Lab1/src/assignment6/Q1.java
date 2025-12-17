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
        System.out.println("Error! Can't divide anything by 0!");
        return 0;
        }
        else
        return (x+y);
    }

    public static double rem(double x, double y){
        return (x%y);
    }

    public static double sqrt(double x){
        if (x<0){
        System.out.println("Error! A negative number can't have a real root! Please enter a valid number!");
        return 0;
        }
        else
        return (Math.sqrt(x));
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Remainder \n 6. Square Root \n 7. Exit");
        byte opt = scn.nextByte();
        switch(opt){
            case 1: {
            System.out.println("Enter first number:"); double a = scn.nextDouble();
            System.out.println("Enter second number:"); double b = scn.nextDouble();
            double sum = add(a,b);
            System.out.println("The sum is: " + sum);break;
            }
            case 2: {
            System.out.println("Enter first number:"); double a = scn.nextDouble();
            System.out.println("Enter second number:"); double b = scn.nextDouble();
            double diff = sub(a,b);
            System.out.println("The difference is: " + diff);break;
            }
            case 3: {
            System.out.println("Enter first number:"); double a = scn.nextDouble();
            System.out.println("Enter second number:"); double b = scn.nextDouble();
            double mult = mult(a,b);
            System.out.println("The product is: " + mult);break;
            }
            case 4: {
            System.out.println("Enter first number:"); double a = scn.nextDouble();
            System.out.println("Enter second number:"); double b = scn.nextDouble();
            double div = div(a,b);
            System.out.println("The quotient is: " + div);break;
            }
            case 5: {
            System.out.println("Enter first number:"); double a = scn.nextDouble();
            System.out.println("Enter second number:"); double b = scn.nextDouble();
            double rem = rem(a,b);
            System.out.println("The remainder is: " + rem);break;
            }
            case 6: {
            System.out.println("Enter first number:"); double a = scn.nextDouble();
            double sqrt = sqrt(a);
            System.out.println("The squareroot is: " + sqrt);break;
            }
            default:
            System.out.println("Please enter a valid method");
        }
        scn.close();
    }
	
}