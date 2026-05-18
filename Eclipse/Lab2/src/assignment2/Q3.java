package assignment2;

class Book{
	private int bookId;
	private double price;
	private int quantity;
	static double totalAmount;
	public Book(int bookId, double price, int quantity) {
		this.bookId = bookId;
		this.price = price;
		this.quantity = quantity;
	}
	public void displayDetails() {
		System.out.println("Book ID: " + bookId + "; Price: Rs." + price + "; Quantity: " + quantity);
	}
	public double Cost() {
		double C = price*quantity;
		totalAmount += C;
		return C;
	}
}

public class Q3 {

	public static void main(String[] args) {
		Book B1 = new Book(1, 500.0, 4);
		Book B2 = new Book(2, 1500.0, 1);
		Book B3 = new Book(15, 600.0, 2);
		Book B4 = new Book(25, 760.0, 5);
		Book B5 = new Book(40, 200.0, 5);
		System.out.println("The following are the details for each book:");
		B1.displayDetails();
		B2.displayDetails();
		B3.displayDetails();
		B4.displayDetails();
		B5.displayDetails();
		B1.Cost();
		B2.Cost();
		B3.Cost();
		B4.Cost();
		B5.Cost();
		System.out.println("The total amount spent: Rs." + Book.totalAmount);
	}

}
