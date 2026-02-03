package assignment1;

public class Q1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int c = 0;
		System.out.println("The positive integer greater than 2 from command line argument is " + n);
		while(n>2) {
			n/=2;
			c++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + c);
	}

}
