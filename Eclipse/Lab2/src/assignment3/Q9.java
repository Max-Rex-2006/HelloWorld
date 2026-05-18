package assignment3;

public class Q9 {
	public static void reverse(int n) {
		if(n<10)
			System.out.println(n);
		else {
			System.out.print(n%10);
			reverse(n/10);
		}
	}

	public static void main(String[] args) {
		System.out.println("The reverse of 12345 is:");
		reverse(12345);
	}

}
