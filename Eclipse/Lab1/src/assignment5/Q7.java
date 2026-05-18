package assignment5;


public class Q7 {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 1; i<=5; i++) {
			char ch = 'A';
			for(int j = 1; j<=i; j++) {
				System.out.print(ch + " ");
				ch += 1;
			}
			System.out.println();
		}
		System.out.println();
	
	
	}

}
