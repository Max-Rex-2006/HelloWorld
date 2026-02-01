package Practice;

public class stringMethods {

	public static void main(String[] args) {
		String s1 = "This is a book";
		String s2 = "You wanna buy it?";
		System.out.println(s1.length() + " " + s2.length());
		for(int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i) + " ");
		}
		String s3 = "this is a book";
		System.out.println();
	}

}
