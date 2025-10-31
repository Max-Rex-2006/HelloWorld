package ARC.Gitdemo.helloworld.Java;

public class Unique {
    public static void main(String[] args) {
        int a = 10;
        if (10L==a)
            System.out.println("10L");
        if (10==a)
            System.out.println("10");
        else
            System.out.println("0");
    }
}



/* 

First Conditional Statement (if):

if (10L == a): This is an if-statement that checks a condition. 
If the condition is true, it executes the code inside the 
braces.

10L is a long literal. The L suffix indicates it's a long 
(64-bit signed integer, ranging from -9,223,372,036,854,775,808 to
9,223,372,036,854,775,807). Without the L, 10 would be an int.

a is an int with value 10.

The comparison == checks for equality. Since 10L (long) and a 
(int) are different types, Java performs numeric promotion 
(widening conversion): the int is automatically promoted to long 
for the comparison. So, 10L == 10L evaluates to true.

If true, System.out.println("10L"); executes. System.out.println()
is a method that prints to the console followed by a newline. So, 
it prints: 10L.

*/