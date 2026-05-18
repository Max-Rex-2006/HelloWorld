package ARC.Gitdemo.helloworld.Java.Experiments;

public class Unique2 {
    public static void main(String[] args) {
        float a = 0.7f;
        if (a<0.7)
            System.out.println("Hello");
        else
            System.out.println("ITER");
    }
}

/*

Variable Declaration and Assignment:

float a = 0.7f;:

Declares a variable a of type float (a 32-bit floating-point number, suitable
for decimal values with moderate precision).

Assigns 0.7f to it. The f suffix specifies it's a float literal (without it,
0.7 would default to a double).

Floats store approximations of real numbers due to binary representation. 0.7
cannot be exactly represented in binary (it's a repeating fraction: 
0.101100110011... in binary), so a holds a value very close to 0.7 but 
slightly less (approximately 0.699999988079071 in decimal).


Conditional Statement (If-Else):

if (a < 0.7): This checks if a (a float) is less than 0.7.

0.7 here is a double literal (64-bit floating-point, higher precision than 
float).

Due to the precision difference:

a (float) ≈ 0.699999988079071
0.7 (double) is a more accurate approximation of 0.7.

Thus, a < 0.7 evaluates to true because the float value is indeed less than 
the double value.

If true, it executes System.out.println("Hello");, printing "Hello" to the 
console.

The else branch (System.out.println("ITER");) would print "ITER" if the 
condition were false, but it's not executed here.

*/