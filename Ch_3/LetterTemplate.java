package ARC.Gitdemo.Java.Ch_3;
import java.util.Scanner;
public class LetterTemplate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name...");
        name = scn.nextLine();
        System.out.println("Dear " + name + ", Thanks a lot!!");
        scn.close();
    }    
}
