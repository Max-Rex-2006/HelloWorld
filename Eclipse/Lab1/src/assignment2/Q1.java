package assignment2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    /*
    Write a Java Program that reads a Celsius degree in a double 
    value from the console, then converts it to Fahrenheit and displays 
    the result. 
    The formula for the conversion is as follows:
    fahrenheit = (9 / 5) * celsius + 32  
    */
        Scanner scn = new Scanner(System.in);
        double cel,fahrenheit;
        System.out.println("Please enter the temperature in Celsius:");
        cel = scn.nextDouble();
        fahrenheit = (1.8*cel) + 32;
        System.out.println("The temperature in fahrenheit is " + fahrenheit + " F");
        scn.close();
    }
}
