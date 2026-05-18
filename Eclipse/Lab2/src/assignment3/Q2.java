package assignment3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		try{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the size:");
			int size = scn.nextInt();
			String [] colors = new String[size];
			System.out.println("Enter the colors:");
			for(int i=0; i<size; i++) {
				colors[i] = scn.next();
			}
			System.out.println("\nSelect ur prefered color:");
			int fav = scn.nextInt();
			System.out.println(colors[fav]);
			scn.close();
			colors = null; //just for using nullpointer
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Bro, u good in the head?");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Oh my god bruh");
		}
		catch(NullPointerException e) {
			System.out.println("Just exit Earth bro");
		}
	}

}
