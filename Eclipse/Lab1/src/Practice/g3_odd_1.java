package Practice;

import java.util.Scanner;

public class g3_odd_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the bill: ");
		int bill = scn.nextInt();
		if(bill<=1000) {
			if(bill%20<10) {
				System.out.println("Cashier needs to return:" + (1000 - (bill - bill%20)));
				System.out.println("Discount:" + (bill%20));
			}
			else {
				System.out.println("Cashier needs to return:" + (1000 - (bill + (20 - bill%20))));
				System.out.println("Tip:" + (bill%20));
			}
			
		}
		scn.close();
	}
}
