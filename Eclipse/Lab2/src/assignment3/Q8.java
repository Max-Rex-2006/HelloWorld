package assignment3;

public class Q8 {
	public static int power(double x, int n) {
		if(n==0)
			return 1;
		if(x==1)
			return n;
		else {
			x--;
			return n*power(x,n);
		}
	}

	public static void main(String[] args) {
		System.out.println("5 to the power 4 is:" + power(4.0,5));
		System.out.println("4 to the power 5 is:" + power(5.0,4));
	}
}
