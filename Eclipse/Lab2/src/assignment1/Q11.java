package assignment1;

public class Q11 {
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			if((a+b)== c)
				System.out.println("The first condition is satisfied: " + a + " + " + b + " = " + c);
			else if(a==(b-c))
				System.out.println("The second condition is satisfied: " + a + " = " + b + " - " + c);
			else if((a*b)==c)
				System.out.println("The third condition is satisfied: " + a + " = " + b + " * " + c);
			else
				System.out.println("None of the conditions are satisfied.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You forgot to enter a number as an argument.");
		}
	}
}
