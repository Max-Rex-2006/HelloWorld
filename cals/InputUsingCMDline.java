// Calculation of simple interest

package cals;
public class InputUsingCMDline 
{
    public static void main ( String[] args )
    {

        if (args.length < 3) 
        {
            System.out.println("Usage: java InputUsingCMDline <principal> <years> <rate>");
            System.out.println("Example: java InputUsingCMDline 1000 2 5.5");
            return;
        }
        float p, r, si ;
        int n ;
        p = Float.parseFloat ( args[ 0 ] ) ;
        n = Integer.parseInt ( args[ 1 ] ) ;
        r = Float.parseFloat ( args[ 2 ] ) ;
        si = (p * n * r) / 100 ;
        System.out.println ( "Simple interest = Rs. " + si ) ;
    }
}


