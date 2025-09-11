package Java;

public class StringExperiments {
    public static void main(String[] args) {
        // String is a reference type in Java and here are some common methods
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.charAt(4));
        System.out.println(s3.indexOf("o"));    
        System.out.println(s3.substring(0, 5));
        System.out.println(s3.replace("World", "Java"));
        System.out.println(s3.contains("Hello"));
        System.out.println(s3.equals("Hello World"));
        System.out.println(s3.equalsIgnoreCase("hello world"));
        System.out.println(s3.trim());
    }
    
}
