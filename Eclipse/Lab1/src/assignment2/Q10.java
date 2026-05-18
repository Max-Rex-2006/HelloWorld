package assignment2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
    /*
The distance between two cities (in km.) is input through the keyboard. Write a Java 
Program to convert and print this distance in meters, feet, inches and centimetres. 
    */
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the distance in kilometers: ");
    int km = scn.nextInt();
    int m = km*1000;
    int cm = km*100000;
    double inch = km*39370.0787;
    double feet = km*3280.8399;
    System.out.println(" km is " + m + " m");
    System.out.println(" km is " + feet + " feet");
    System.out.println(" km is " + inch + " inch");
    System.out.println(" km is " + cm + " cm");
    scn.close();
    }
}
