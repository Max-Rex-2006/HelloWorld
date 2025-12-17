package assignment5;

public class Q10 {

	public static void main(String[] args) {
		int c=2, d=0, i, j;
		for(i = 5; i>=1; i--)
		{
			for(j= 5; j>=c; j--) {
				System.out.print(j+ " ");
			}
			System.out.print("* ");
			
			for(j= d; j>=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			c++;
			d++;
		}
	
	}
}
