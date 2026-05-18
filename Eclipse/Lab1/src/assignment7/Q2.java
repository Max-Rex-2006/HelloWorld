package assignment7;

import java.util.Scanner;

public class Q2 {
	public static void readInput(int[] counts) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter integers between 1 and 100: ");
        int num = 1;
        while (num!=0) {
            num = scn.nextInt();
            if (num >= 1 && num <= 100)
                counts[num]++;
        }
        scn.close();
    }

	
    public static void displayCounts(int[] counts) {
        for (int i = 1; i <= 100; i++) {
        	if (counts[i] > 0) {
        		if (counts[i] >= 2) 
        			System.out.println(i + " occurs " + counts[i] + " times");
        		else
        			System.out.println(i + " occurs 1 time");
        	}
        }
	}
    
    
    public static void main(String[] args) {
        int[] counts = new int[101];
        readInput(counts);
        displayCounts(counts);
    }
}
