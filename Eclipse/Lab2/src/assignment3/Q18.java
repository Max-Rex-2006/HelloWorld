package assignment3;

public class Q18 {
    void solveHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solveHanoi(n - 1, aux, to, from);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Q18 q = new Q18();
        System.out.println("The sequence of moves to solve the Tower of Hanoi with " + n + " disks is:");
        q.solveHanoi(n, 'A', 'C', 'B');
    }
}
