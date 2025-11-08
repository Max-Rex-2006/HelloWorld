package ARC.Gitdemo.helloworld.Java.NotePrograms.Ch_4;
import java.util.Scanner;
public class PassorFail {
    public static void main(String[] args) {
        float sub1,sub2,sub3,avg;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the marks of your 3 subjects: ");
        sub1 = scn.nextFloat();
        sub2 = scn.nextFloat();
        sub3 = scn.nextFloat();
        avg = (sub1 + sub2 + sub3)/3;
        if (avg>=40){
            if (sub1<=33)
                System.out.println("You have failed.");
            else if (sub2<=33)
                System.out.println("You have failed.");
            else if (sub3<=33)
                System.out.println("You have failed.");
            else
                System.out.println("You have passed.");
        }
        else {
            System.out.println("You have failed");
        }
        scn.close();
    }
}
