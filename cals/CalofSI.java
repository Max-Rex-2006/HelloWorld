// Calculation of simple interest
package ARC.Gitdemo.helloworld.cals;
public class CalofSI
{
    public static void main (String[] args)
    {
        float p,r,si;
        int n;
        p = 1000.50f;
        n = 3;
        r = 15.5f;
        si = (p*n*r)/100;
        System.out.println ( "Simple interest = Rs. " + si ) ;
        System.out.println ( "Principal = " + p + " Rate = " + r ) ;

    }
}