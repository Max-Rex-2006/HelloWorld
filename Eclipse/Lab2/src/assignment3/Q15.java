package assignment3;

public class Q15 {
    String reverse(String s) {
        if (s.length()==0) 
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String s = args[0];
        Q15 q = new Q15();
        System.out.println("The reverse of " + s + " is: " + q.reverse(s));
    }
}
