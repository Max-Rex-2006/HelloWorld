package ARC.Gitdemo.helloworld.Java.NotePrograms.Ch_5;
import java.util.Scanner;
public class FirstnNumbers {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num=1,n;
    System.out.println("Please enter the limit to be uploaded:");
    n = scn.nextInt();
    do {
        System.out.println(num);
        num++;
    } while(num<=n);
    scn.close();
    }
}
