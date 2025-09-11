package ARC.Gitdemo.Java.Ch_2;
import java.util.Scanner;
public class GreaterorNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 70, b;
        System.out.println("Please enter the integer: ");
        b = scn.nextInt();
        if (b>a){
            System.out.println("Yes!! You have the larger integer: " + b);
        }
        else {
            System.out.println("No, Your integer was smaller: " + b);
            System.out.println("70 was my number");
        }
        scn.close();
    }
}
