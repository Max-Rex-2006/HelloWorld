package assignment1;

public class Q10 {

	public static void main(String[] args) {
		/*
Assume a string variable ruler1 contains “1” initially i.e. String ruler1= “1” 
Write a Java program to print the following output using string concatenation. 
(You can take extra string variables)

1
1 2 1 
1 2 1 3 1 2 1 
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1

		 */
		String ruler = "1";
		System.out.println(ruler);
		ruler = ruler + "2" + ruler;
		System.out.println(ruler);
		ruler = ruler + "3" + ruler;
		System.out.println(ruler);
		ruler = ruler + "4" + ruler;
		System.out.println(ruler);
	}

}
