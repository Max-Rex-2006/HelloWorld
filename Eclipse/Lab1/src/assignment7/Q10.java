package assignment7;

import java.util.Scanner;

public class Q10 {
    public static int[] eliminateDuplicates(int[] list) {
        int temp[] = new int[10];  // Temporary array to hold unique elements (size 10 is sufficient since input is 10 elements)
        int c = 0;  // Counter for unique elements
        
        for (int i = 0; i < list.length; i++) {
            boolean dup = false;
            // Check if list[i] is already in temp
            for (int j = 0; j < c; j++) {
                if (list[i] == temp[j]) {
                    dup = true;
                    break;  // No need to check further if duplicate found
                }
            }
            // If not a duplicate, add it to temp
            if (!dup) {
                temp[c++] = list[i];
            }
        }
        
        // Create result array of exact size
        int[] result = new int[c];
        for (int j = 0; j < c; j++) {
            result[j] = temp[j];
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] ar = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
        int[] distinct = eliminateDuplicates(ar);
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i] + " ");
        }
        scn.close();
    }
}