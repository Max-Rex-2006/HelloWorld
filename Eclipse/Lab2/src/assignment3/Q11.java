package assignment3;

public class Q11 {
    public static int gcd(int m, int n){
        if(m%n==0)
            return n;
        else{
            return gcd(n, m%n);
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(37, 18));
    }
}
