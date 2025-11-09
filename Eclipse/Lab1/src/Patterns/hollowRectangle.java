package Patterns;
import java.util.Scanner;
public class hollowRectangle {

	public static void main(String[] args) {
		int r,c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		r = scn.nextInt();
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//outer loop
		for (count=1; count <= c; count++) {
			//inner loop
			for (row =1; row <= r; row++) {
				//cell -> (c,r)
				if(count==1 || row==1 || count==c || row==r) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
		scn.close();
	}
}
