package assignment3;

public class Q5 {
	public static < E > void printArray( E[] inputArray) {
		for(E element: inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String [] strArr = {"Hi", "Hello", "How are you?"};
		Integer [] intArr = {10, 20, 30};
		System.out.println("Array of Strings:");
		printArray(strArr);
		System.out.println("Array of Integers:");
		printArray(intArr);
	}

}
