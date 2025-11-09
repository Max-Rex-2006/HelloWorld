package Patterns;
import java.util.Scanner;
public class butterfly {

	public static void main(String[] args) {
		int i,n;
		float j;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of the butterfly:");
		n = scn.nextInt();
		
		//for upper part
		for (i=1; i<=n; i++) {
			//for pattern 1
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for spaces
			for (j=1;j<=n-i;j+=0.5f) {
				System.out.print(" ");
			}
			//for pattern 2
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//for lower part
		for (i=1; i<=n; i++) {
			//for pattern 1
			for (j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			//for spaces
			for (j=1;j<=i;j+=0.5f) {
				System.out.print(" ");
			}
			//for pattern 2
			for (j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scn.close();
	}
}
