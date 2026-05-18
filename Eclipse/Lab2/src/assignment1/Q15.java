package assignment1;

public class Q15 {
    public static void printArr(Integer [] [] matrix){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printRow(Integer [] [] matrix){
        int c = 0;
        int row = 0;
        int col = 0;
        int i,j;
        for(i=0; i<4; i++){
            int crow = 0;
            int ccol = 0;
            for(j=0; j<4; j++){
                if(matrix[i][j] == 1){
                    crow++;
                }
                if(matrix[j][i] == 1){
                    ccol++;
                }
            }
            if(crow>c){
                c = crow;
                row = i;
            }
            if(ccol>c){
                c = ccol;
                col = i;
            }
        }
        System.out.println("The largest row index: " + (row+1));
        System.out.println("The largest column index: " + (col+1));
    }
    public static void main(String[] args) {
        Integer [] [] matrix = new Integer[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        printArr(matrix);
        printRow(matrix);
    }
}
