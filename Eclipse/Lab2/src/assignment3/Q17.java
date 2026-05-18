package assignment3;

public class Q17 {
    void rearrange(int[] A, int k, int low, int high) {
        if (low >= high) return;
        if (A[low] <= k) rearrange(A, k, low + 1, high);
        else {
            int temp = A[low]; A[low] = A[high]; A[high] = temp;
            rearrange(A, k, low, high - 1);
        }
    }
    public static void main(String[] args) {
        int[] A = {1, 5, 3, 2, 4};
        int k = 3;
        Q17 q = new Q17();
        q.rearrange(A, k, 0, A.length - 1);
        System.out.print("The rearranged array is: ");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
