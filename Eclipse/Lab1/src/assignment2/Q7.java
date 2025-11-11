package assignment2;

public class Q7 {
    public static void main(String[] args) {
    /*
Write a Java Program that displays the following table. Cast floating-point numbers 
into integers. 
 a  b   pow (a, b)
 1  2   1
 2  3   8
 3  4   81
 4  5   1024
 5  6   15625	
	*/
        System.out.println("a" + "\t" + "b" + "\t" + "pow(a,b)");
		int a = 1, b = 2;
        System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a,b));
        System.out.println(++a + "\t" + ++b + "\t" + (int)Math.pow(a,b));
        System.out.println(++a + "\t" + ++b + "\t" + (int)Math.pow(a,b));
        System.out.println(++a + "\t" + ++b + "\t" + (int)Math.pow(a,b));
        System.out.println(++a + "\t" + ++b + "\t" + (int)Math.pow(a,b));
    }
}
