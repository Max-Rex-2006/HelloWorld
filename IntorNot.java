package ARC.Gitdemo.Java.Ch_1;

import java.util.Scanner;

public class IntorNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Please enter the number:");
        n = scn.nextInt();
        if (scn.hasNextInt() == true){
            System.out.println("You have entered a valid integer: " + n);
        }
        else {
            System.out.println("The number you have entered is not an integer.");
        }
        scn.close();
    }
}
