package assignment1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the person's weight in kg: ");
		float kg = scn.nextFloat();
		System.out.println("Enter the person's height in m: ");
		float m = scn.nextFloat();
		if ((kg/(m*m))<18.5)
			System.out.println("The person is underweight.");
		else if ((kg/(m*m))>=18.5&&(kg/(m*m))<=24.9)
			System.out.println("The person has normal weight.");
		else if ((kg/(m*m))>=25.0&&(kg/(m*m))<=29.9)
			System.out.println("The person is overweight.");
		else
			System.out.println("The peron is obese.");
		scn.close();
	}

}
