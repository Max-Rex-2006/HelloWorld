package ARC.Gitdemo.Java.Ch_1;

import java.util.Scanner;

public class HelloScan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("Hello "+ str + ", have a good day.");
        scn.close();
    }
    
}
