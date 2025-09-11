package ARC.Gitdemo.helloworld.cals;
import java.util.*;
public class SIbyreceivingInput 
{
    public static void main (String[] args )
    {   
        float p,r,si;
        int n;
        System.out.println("Enter the values of principal, rate and time:-");
        Scanner sc = new Scanner(System.in);
        p = sc.nextFloat();
        n = sc.nextInt();
        r = sc.nextFloat();
        si = (p*n*r)/100;
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}


