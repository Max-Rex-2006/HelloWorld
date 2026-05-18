package assignment1;

public class Q4 {

	public static void main(String[] args) {
	/* 
Write a Java program to store the following details of a student in variables and display them in a formatted sentence:
• Name (String)
• Roll Number (int)
• CGPA (double)
• Grade (char)
Sample Run:
"My name is Rohan; my roll number is 45.
My CGPA is 8.72, and I got A grade in ICP."
	*/
		String name = "Rohan";
		int roll = 45;
		double cgpa = 8.72;
		char grd = 'A';
		System.out.print("\"My name is " + name + "; ");
		System.out.println("my roll number is " + roll + ".");
		System.out.println("My CGPA is " + cgpa + ", and I got " + grd + " grade in ICP.\"");
	}

}
