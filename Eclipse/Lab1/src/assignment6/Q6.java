package assignment6;

import java.util.Scanner;

public class Q6 {
  public static int sumOfDivisors(int n){
    int sum = 0;
    for(int i=1; i<n; i++){
      if(n%i==0)
        sum += i;
    }
    return sum;
  }
  public static Boolean isFriendlyPair(int a, int b){
    int x = sumOfDivisors(a);
    int y = sumOfDivisors(b);
    if ((x/a)==(y/b))
      return true;
    else
      return false;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1 = scn.nextInt();
    System.out.println("Enter second number:");
    int num2 = scn.nextInt();
    System.out.println("Sum of proper divisors of " + num1 + " = " + sumOfDivisors(num1));
    System.out.println("Sum of proper divisors of " + num2 + " = " + sumOfDivisors(num2));
    boolean res = isFriendlyPair(num1, num2);
    if (res==true)
      System.out.println(num1 + " and " + num2 + " are a Friendly Pair.");
    else
      System.out.println(num1 + " and " + num2 + " are not a Friendly Pair.");
    scn.close();
  }
}