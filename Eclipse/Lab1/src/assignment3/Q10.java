package assignment3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
		/*
A University conducts a 100-mark exam for its student and grades them as follows. 
Assigns a grade based on the value of the marks. Write a Java Program to print the 
grade according to the mark secured by the student. [Use switch-case].
Grading Criteria:
Marks Range     Grade
≥ 90            O
≥ 80 and < 90   A
≥ 70 and < 80   B
≥ 60 and < 70   C
≥ 50 and < 60   D
≥ 40 and < 50   E
< 40            F
Display an appropriate message if the marks are invalid (less than 0 or greater than 
100).

		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter marks:");
		int mark = scn.nextInt();
        char grade = 'F';
		switch(mark/10)
        {
            case (9): grade = 'O'; break;
            case (8): grade = 'A'; break;
            case (7): grade = 'B'; break;
            case (6): grade = 'C'; break;
            case (5): grade = 'D'; break;
            case (4): grade = 'E'; break;
            case (3): grade = 'F'; break;
            case (2): grade = 'F'; break;
            case (1): grade = 'F'; break;
            case (0): grade = 'F'; break;
            default: System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
        }
        System.out.println("Grade: " + grade);
        scn.close();
	}
}
