package cals;
import java.io.*;
public class AnotherInput 
{
    public static void main(String[] args) throws Exception
    {
        float p,r,si;
        int n;
        InputStreamReader isr;
        BufferedReader br;
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        System.out.println("Enter the values of p,n and r:");
        p = Float.parseFloat(br.readLine());
        n = Integer.parseInt(br.readLine());
        r = Float.parseFloat(br.readLine());
        si = (p*n*r)/100;
        System.out.println("Simple Interest = $ " + si);
    }
}
