package assignment3;

public class Q6 {

	public static <T> int count(T[] array, T item) {
		int count=0;
		for(T element: array) {
			if(element==item)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String [] strArr = {"Hi", "Hi", "Hi", "Hello", "Hello"};
		Integer [] intArr = {10, 20, 30, 10, 20, 30};
		System.out.println("Count of Hi in string array:" + count(strArr, "Hi"));
		System.out.println("Count of 10 in string array:" + count(intArr, 10));
	}

}
