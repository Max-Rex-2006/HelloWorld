package assignment2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
    /*
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This 
is essentially the definition of the / and % operators for integers.) 
Write a Java Program that asks the user how many eggs she has and then tells the user 
how many dozen eggs she has and how many extra eggs are left over. 
A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user 
how many gross, how many dozen, and how many left over eggs she has. 
    */
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter number of eggs: ");
    int eggs = scn.nextInt();
    int remain = eggs%144;
    int gross = eggs/144;
    int left = remain%12;
    int dozen = remain/12;
    System.out.println("Total number of eggs is " + gross + " gross, " + dozen + " dozen and " + left);
    scn.close();
    }
}
