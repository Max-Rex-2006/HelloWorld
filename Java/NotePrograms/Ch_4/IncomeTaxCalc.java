package ARC.Gitdemo.helloworld.Java.NotePrograms.Ch_4;
import java.util.Scanner;
public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float income;
        System.out.println("Please enter your income in Lakhs: ");
        income = scn.nextFloat();
        if (income<2.5)
            System.out.println("You don't have to pay any tax.");
        else if ((income>=2.5)&&(income<5.0))
            System.out.println("You have to pay 5% tax.");
        else if ((income>=5.0)&&(income<10.0))
            System.out.println("You have to pay 20% tax.");
        else 
            System.out.println("You have to pay 30% tax");
        scn.close();
    }
}
