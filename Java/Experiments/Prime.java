import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        boolean is_prime = true;
        for (int i=2; i<=(num-1); i++){
            if (num%i==0)
            is_prime = false;
        }
        int rev=0, temp=num, dig;
        while (temp!=0){
            dig = temp%10;
            rev = rev*10 + dig;
            temp = temp/10;
        }
        for (int i=2; i<=(rev-1); i++){
            if (rev%i==0)
            is_prime = false;
        }
        if (is_prime==true)
        System.out.println("The number is a twisted prime.");
        else
        System.out.println("The number is not a twisted prime.");
        scn.close();
    }
}
