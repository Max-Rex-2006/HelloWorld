package assignment3;

public class Q14 {
    int product(int a, int b) {
        if (b == 0) 
            return 0;
        return a + product(a, b - 1);
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Q14 q = new Q14();
        System.out.println("The product of " + a + " and " + b + " is: " + q.product(a, b));
    }
}
