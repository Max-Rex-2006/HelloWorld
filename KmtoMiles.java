package ARC.Gitdemo.Java.Ch_1;

import java.util.Scanner;

public class KmtoMiles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double km,ml;
        System.out.println("Please enter how many kilometres: ");
        km = scn.nextDouble();
        ml = km*0.621371;
        System.out.println("The number of miles is " + ml);
        scn.close();
    }    
}
