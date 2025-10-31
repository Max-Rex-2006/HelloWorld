package ARC.Gitdemo.helloworld.Java;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle:");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        if ((a+b)<c||(b+c)<a||(c+a)<b)
        {
            System.out.println("The sides you have entered don't form a triangle.");
        }
        else
        {
            if (a==b && b==c)
            {
                System.out.println("It is an equilateral triangle.");
            }
            else
            {
                if(a==b||b==c||c==a)
                {
                    System.out.println("It is an isoscales triangle.");
                }
                else
                {
                    System.out.println("It is a scalar triangle.");
                }
            }
        }
        scn.close();
    }
}
