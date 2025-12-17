package assignment6;

public class Q2 {
	public static int countDigits(int n) {
		int count = 0;
		while(n!=0) {
			count+=1;
			n/=10;
		}
		return count;
	}
	public static int power(int a, int b) {
		return (int)(Math.pow(a, b));
	}
	
	public static boolean isArmstrong(int n) {
		int sum = 0, temp=n;
		while(temp>0) {
			sum += power(temp%10,countDigits(n));
			temp /= 10;
		}
		if (sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i=100; i<10000; i++) {
			if(isArmstrong(i)==true) {
				System.out.println(i);
				total++;
			}
		}
		System.out.println("Total no.of Armstrong numbers found: " + total);
		
	}

}
