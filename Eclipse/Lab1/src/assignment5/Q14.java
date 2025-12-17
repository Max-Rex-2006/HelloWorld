package assignment5;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scn.nextInt();
        double n = Math.toRadians(x);
        double sum = x, term = n, i = 2;
        while(Math.abs(term)>=Math.pow(10, -6)) {
        	i += 2;
        	term = -(term*(n*n)/(i*i-1));
        	sum += term;
        }
        
        System.out.println("Cos(x) = " + sum);
        scn.close();
	}

}
