package assignment1;

public class Q14 {
    public static double[] [] addMatrix(double[] [] a, double[] [] b){
        double[] [] c = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        double[] [] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[] [] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        double[] [] c = addMatrix(a, b);
        System.out.println("The sum of the two matrices is: ");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
