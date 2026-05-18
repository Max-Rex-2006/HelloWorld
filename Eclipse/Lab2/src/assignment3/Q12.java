package assignment3;

import java.util.Scanner;

public class Q12 {
    public static int binsearch(int[] arr, int left, int right, int key){
        if(left>right)
            return -1;
        else{
            int mid = (left + right)/2;
            if(key>arr[mid])
                return binsearch(arr, mid+1, right, key);
            else if(key<arr[mid])
                return binsearch(arr, left, mid-1, key);
            else
                return mid;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = scn.nextInt();
        int result = binsearch(arr, 0, arr.length-1, key);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

    }
}
