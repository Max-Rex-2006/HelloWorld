package ARC.Gitdemo.helloworld.Java;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int m = scn.nextInt();
        char grade;
        switch(m/10)
        {
            case 9: 
                grade = 'O';
                break;
            case 8:
                grade = 'S';
                break;
            case 7:
                grade = 'A';
                break;
            case 6:
                grade = 'B';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("Your grade is " + grade);
        scn.close();
    }
}
