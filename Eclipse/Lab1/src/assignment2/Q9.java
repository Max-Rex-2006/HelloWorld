package assignment2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
    /*
Write a Java Program that reads an integer between 0 and 1000 and adds all the digits 
in the integer. 
For example, if an integer is 932, the sum of all its digits is 14. 
    */
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000: ");
    int num = scn.nextInt();
    int dig = num%10;
    int sum = dig;
    num = num/10;
    dig = num%10;
    sum += dig;
    num = num/10;
    dig = num%10;
    sum += dig;
    System.out.println("The sum of the digits is " + sum);
    scn.close();
    }
}
