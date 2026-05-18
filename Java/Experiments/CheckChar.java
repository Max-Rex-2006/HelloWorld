package ARC.Gitdemo.helloworld.Java.Experiments;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your character: ");
        char ch = scn.next().charAt(0);
        switch(ch)
        {
            case 'a':
                System.out.println(ch + " is a vowel.");
                break;
            case 'e':
                System.out.println(ch + " is a vowel.");
                break;
            case 'i':
                System.out.println(ch + " is a vowel.");
                break;
            case 'o':
                System.out.println(ch + " is a vowel.");
                break;
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonent.");
                break;
        }
        scn.close();
    }
}
