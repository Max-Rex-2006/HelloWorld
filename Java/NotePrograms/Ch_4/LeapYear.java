package ARC.Gitdemo.helloworld.Java.NotePrograms.Ch_4;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year,div4,div100,div400;
        System.out.println("Please enter the year: ");
        year = scn.nextInt();
        div4 = year%4;
        div100 = year%100;
        div400 = year%400;
        if (div4==0){
            if (div100 == 0){
                if (div400 == 0){
                    System.out.println(year + " is a leap year");
                }
                else{
                    System.out.println(year + " is not a leap year");
                }
            }
            else{
                System.out.println(year + " is a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        scn.close();
    }
}
