package Patterns;
import java.util.Scanner;
public class fighterjet {

	public static void main(String[] args) {
		int i,j,n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of jet:");
		n = scn.nextInt();
		
		//for upper part
		for (i=1; i<=n; i++) {
			//for underscore
			for (j=1;j<=n;j++) {
				int temp = i%3;
				if (temp==0) {
					System.out.print("~");
				}
				else {
					System.out.print("_");
				}
			}
			//for pattern 1
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			//for space
			for (j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for pattern 2
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//for lower part
		for (i=1; i<=n; i++) {
			//for underscore
			for (j=1;j<=n;j++) {
				int temp = i%3;
				if (temp==0) {
					System.out.print("~");
				}
				else {
					System.out.print("_");
				}
			}
			//for pattern 1
			for (j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			//for space
			for (j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//for pattern 2
			for (j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scn.close();
		
	}

}
