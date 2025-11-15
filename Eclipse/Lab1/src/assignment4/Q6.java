package assignment4;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        /*
Write a Java Program that takes an integer as input and reverses its digits using a 
while loop.
After reversing, the program should check whether the number is a palindrome.
A palindrome number is one that remains the same when its digits are reversed.
For example, 121 and 1221 are palindrome numbers, but 123 is not
		 */
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        int rev=0, dig, temp = num;
        while(temp!=0)
        {
            dig = temp%10;
            rev = rev*10 + dig;
            temp = temp/10;
        }
        System.out.println("Reversed number: " + rev);
        if (num==rev)
        System.out.println(num + " is a palindrome number");
        else
        System.out.println(num + " is not a palindrome number");
        scn.close();
    }
}
