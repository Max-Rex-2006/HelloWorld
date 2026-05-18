package Practice;

public class stringMethods {

	public static void main(String[] args) {
		String s1 = "This is a book";
		String s2 = "You wanna buy it?";
		System.out.println(s1.length() + " " + s2.length());
		for(int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i) + " ");
		}
		System.out.println();
	}

}
