package assignment4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		/*
Write a Java Program to print the following output using for loop. Where, input is the number of rows in output pattern.  
 
For input, N = 4. 
1 
121 
1213121 
121312141213121 
 
Sample run:  
Enter number of rows: 5 
1 
121 
1213121 
121312141213121 
12131214121312151213121413121213121
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int r = scn.nextInt();
		String s = "1";
		for (int i=1; i<=r; i++) 
		{
			System.out.println(s);
			s = s + (i+1) + s;
		}
		scn.close();	
		
	}

}
