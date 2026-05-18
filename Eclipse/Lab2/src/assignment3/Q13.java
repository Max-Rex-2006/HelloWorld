package assignment3;

public class Q13 {
    void toBinary(int n) {
        if (n > 0) {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Q13 q = new Q13();
        System.out.print("The binary representation of " + n + " is: ");
        q.toBinary(n);
    }
}
