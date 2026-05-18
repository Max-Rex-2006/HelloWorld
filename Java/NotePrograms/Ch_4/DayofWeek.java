package ARC.Gitdemo.helloworld.Java.NotePrograms.Ch_4;
import java.util.Scanner;
public class DayofWeek {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Please enter the number: ");
        num = scn.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("It is Monday.");
                break;
            case 2:
                System.out.println("It is Tuesday.");
                break;
            case 3:
                System.out.println("it is Wednesday.");
                break;
            case 4:
                System.out.println("It is Thursday.");
                break;
            case 5:
                System.out.println("It is Friday.");
                break;
            case 6:
                System.out.println("It is Saturday.");
                break;
            case 7:
                System.out.println("It is Sunday.");
                break;
        }
        scn.close();
    }
}
