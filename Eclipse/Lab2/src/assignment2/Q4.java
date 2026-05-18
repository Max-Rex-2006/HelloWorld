package assignment2;

class Deposit{
	private long principal;
	private int time;
	private double rate;
	static double Total_amt;
	public Deposit() {
		principal = 10000;
		time = 1;
		rate = 4.5;
	}
	public Deposit(long principal, int time, double rate) {
		this.principal = principal;
		this.time = time;
		this.rate = rate;
	}
	public Deposit(long principal, int time) {
		this.principal = principal;
		this.time = time;
		rate = 4.5;
	}
	public Deposit(long principal, double rate) {
		this.principal = principal;
		time = 1;
		this.rate = rate;
	}
	public void display() {
		System.out.println("Principal: Rs." + principal + "; Time: " + time + " year(s); Rate: " + rate + "%");
	}
	public void calc_amt() {
		Total_amt = principal + (principal * time * rate)/100;
		System.out.println("Total Amount: Rs." + Total_amt);
	}
}

public class Q4 {
	public static void main(String[] args) {
		Deposit D1 = new Deposit();
		Deposit D2 = new Deposit(87654321,5,5.0);
		Deposit D3 = new Deposit(87654321, 5);
		Deposit D4 = new Deposit(87654321, 5.0);
		D1.display();
		D1.calc_amt();
		D2.display();
		D2.calc_amt();
		D3.display();
		D3.calc_amt();
		D4.display();
		D4.calc_amt();
	}
}
