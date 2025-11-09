package Patterns;
import java.util.Scanner;
public class solidRectangle {

	public static void main(String[] args) {
		int r,c,count,row;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		r = scn.nextInt();
		System.out.println("Please enter the number of columns:");
		c = scn.nextInt();
		//outer loop for each line
		for(count=1;count<=c;count += 1) {
			//inner loop for pattern inside lines
			//no use of System.out.println()
			for(row=1; row <=r; row += 1) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scn.close();
	}

}
