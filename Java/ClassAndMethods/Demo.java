package ARC.Gitdemo.helloworld.Java.ClassAndMethods;

class Computer {
    
    public void start() {
        System.out.println("Computer is starting...");
    }
    public String Dialogue(int speech){
        return "This is a computer dialogue method.";
    }
}



public class Demo {
    public static void main(String a[]) {
        Computer comp = new Computer();
        comp.start();
    }
}
