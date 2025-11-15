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
				double bill=0;
				double discount = 0;
				System.out.println("Do you want to pay your bill online? (Y/N): ");
				char opinion = scn.next().charAt(0);
				
				if (opinion=='Y')
				{
						if (unit<50)
						{
							bill = unit*3.0;
						}
						else
						{
							if (unit<200)
							{
							int	bill1 = unit - 50;
							int bill2 = unit -bill1;
								bill = (bill1*4.8)+(bill2*3.0);
							}
							else
							{
								if (unit<400)
								{
									int	bill1 = unit - 200;
									int bill2 = unit - 50;
									int bill3 = unit - (bill1 + bill2);
										bill = (bill1*5.8)+(bill2*4.8)+(bill3*3.0);
								}
								else
								{
									int	bill1 = unit - 50;
									int bill2 = unit - 150;
									int bill3 = unit - 150;
									int bill4 = unit - (bill1 + bill2 + bill3);
										bill = (bill1*4.8)+(bill2*3.0)+(bill3*5.8)+(bill4*6.2);
								}
							}
						}
				discount = bill*0.03;
				System.out.println("You received a 3% online payment discount of Rs. " + discount);
				}
				else
				{
					if (unit<50)
					{
						bill = unit*3.0;
					}
					else
					{
						if (unit<200)
						{
						int	bill1 = unit - 50;
						int bill2 = unit -bill1;
							bill = (bill1*4.8)+(bill2*3.0);
						}
						else
						{
							if (unit<400)
							{
								int	bill1 = unit - 200;
								int bill2 = unit - 50;
								int bill3 = unit - (bill1 + bill2);
									bill = (bill1*5.8)+(bill2*4.8)+(bill3*3.0);
							}
							else
							{
								int	bill1 = unit - 50;
								int bill2 = unit - 150;
								int bill3 = unit - 150;
								int bill4 = unit - (bill1 + bill2 + bill3);
									bill = (bill1*4.8)+(bill2*3.0)+(bill3*5.8)+(bill4*6.2);
							}
						}
					}
				}
				double total_amount = bill;
				double pay_amount = bill-discount;
				System.out.println("Total Electricity Bill: Rs. " + total_amount);
				System.out.println("Amount Payable: Rs. " + pay_amount);
				scn.close();
	}

}
