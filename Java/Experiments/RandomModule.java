package ARC.Gitdemo.helloworld.Java.Experiments;

public class RandomModule {
    public static void main(String[] args) {
        int min = 1, max = 6;
		int a = min + (int)(Math.random()*(max-min+1));
		int b = min + (int)(Math.random()*(max-min+1));
		System.out.println("1st number:" + a);
		System.out.println("2nd number:" + b);
		System.out.println("Their sum:" + (a+b));
    }
}
