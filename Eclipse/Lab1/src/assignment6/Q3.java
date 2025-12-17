package assignment6;


public class Q3 {
	public static int getpentagonal(int n) 
	{
		int res = (n*(3*n-1))/2;
		return res;
	}
	public static void main(String[] args) {
		int res;
		for(int i=1; i<=100; i++) {
			res = getpentagonal(i);
			System.out.print(res + "\t");
			if (i%10==0)
			System.out.println();
		}
	}

}
