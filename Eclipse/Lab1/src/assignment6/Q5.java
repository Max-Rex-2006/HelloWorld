package assignment6;

import java.util.Scanner;

public class Q5 {

		public static int collatzlength(int n) 
		{ 
		int count = 0;
		while(n!=1)
			{
				if(n%2==0)
					n = n/2;
				else
					n = 3*n + 1;
				count += 1;

			}
		return count;
		}
		public static void main(String[] args) 
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n = scn.nextInt();
			int res = collatzlength(n);
			System.out.println("Length: " + res);
			scn.close();
		}

}
