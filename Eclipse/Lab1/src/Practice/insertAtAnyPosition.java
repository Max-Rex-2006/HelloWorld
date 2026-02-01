package Practice;

import java.util.Scanner;

public class insertAtAnyPosition {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[11];
        for(int i=0; i<arr.length; i++)
            arr[i] = (int)(Math.random()*(10+1-1)+1);
        System.out.println("Current Array: ");
        for(int i=0; i<arr.length-1; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Enter your element: ");
        int n = scn.nextInt();
        System.out.println("Enter its position:");
        int pos = scn.nextInt();
        for(int i=arr.length-1; i>=pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos]=n;
        System.out.println("Changed Array: ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        scn.close();
	}
}
