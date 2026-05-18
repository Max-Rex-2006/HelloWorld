package assignment1;

import java.util.Scanner;

public class Q13 {
    public static int[]inputarr(int n){
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the size of the arrays: ");
            int n = scn.nextInt();
            int[] a = inputarr(n);
            int[] b = inputarr(n);
            int[] c = new int[a.length];
            System.out.println("The dot product of the two arrays is: ");
            for(int i = 0; i < a.length; i++){
                c[i] = a[i] * b[i];
                System.out.print(c[i] + " ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Can't access the element of the array. Please make sure to enter the correct size of the array and the elements.");
        }
    }
}
