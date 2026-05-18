package assignment3;

public class Q16 {
    boolean isPalindrome(String s) {
        if (s.length() <= 1) 
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) 
            return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        String s = args[0];
        Q16 q = new Q16();
        System.out.println("Is " + s + " a palindrome? " + q.isPalindrome(s));
    }
}
