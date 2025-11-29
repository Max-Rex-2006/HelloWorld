package assignment3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*
Write a Java Program to calculate the monthly electricity bill for a consumer based 
on the following tariff:

Unit Range 		Rate per Unit
First 50 units 	₹3.00
51–200 units 	₹4.80
201–400 units 	₹5.80
Above 400 units ₹6.20

After calculating the total bill, ask the consumer whether they want to pay the bill 
online.
If the consumer pays online, they get a 3% discount on the total amount.


		*/
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter the number of units consumed: ");
				int unit = scn.nextInt();
				float bill=0;
				float discount = 0;
				System.out.println("Do you want to pay your bill online? (Y/N): ");
				char opinion = scn.next().charAt(0);
				
				if (opinion=='Y')
				{
					if (unit<=50){
						bill = unit*3.00f;
					}
					else if (unit>50 && unit<=200){
						bill = (50*3.0f) + (unit-50)*4.80f;
					}
					else if (unit>200 && unit<=400){
						bill = (50*3.0f) + (150*4.80f) + (unit-200)*5.80f;
					}
					else{
						bill = (50*3.0f) + (150*4.80f) + (200*5.80f) + (unit-400)*6.20f;
					}
					discount = bill*0.03f;
				}
				else
				{
					if (unit<=50){
						bill = unit*3.00f;
					}
					else if (unit>50 && unit<=200){
						bill = (50*3.0f) + (unit-50)*4.80f;
					}
					else if (unit>200 && unit<=400){
						bill = (50*3.0f) + (150*4.80f) + (unit-200)*5.80f;
					}
					else{
						bill = (50*3.0f) + (150*4.80f) + (200*5.80f) + (unit-400)*6.20f;
					}
				}
				double total_amount = bill;
				double pay_amount = bill-discount;
				System.out.println("Total Electricity Bill: Rs. " + total_amount);
				System.out.println("Amount Payable: Rs. " + pay_amount);
				scn.close();
	}

}
