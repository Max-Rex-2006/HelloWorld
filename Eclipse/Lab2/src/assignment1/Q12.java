package assignment1;

import java.util.Scanner;

public class Q12 {
    public static void reverse(String str){
        String [] words = str.split(" ");
        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line = scn.nextLine();
        System.out.println("Reversed line: ");
        reverse(line);
    }
}
