package assignment7;

public class Q8 {
	public static void fillArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2 + (int)(Math.random()*(30-2+1));
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static boolean isPrime(int num) {
		boolean prime = true;
		for(int i=2; i*i<=num;i++) {
			if((num%i)==0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	public static int countPrimes(int[] arr) {
		int c=0;
		for(int i=0; i<arr.length; i++) {
			if (isPrime(arr[i])==true)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		int[] ar = new int[10];
		fillArray(ar);
		printArray(ar);
		System.out.println();
		System.out.println("No. of primes in the array: " + countPrimes(ar));
	}

}
