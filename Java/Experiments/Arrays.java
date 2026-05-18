package ARC.Gitdemo.helloworld.Java.Experiments;

public class Arrays {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 110;
        myArray[3] = 70;
        myArray[4] = 90;
        System.out.println(myArray);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars.length);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        
        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[0]);
    }
    
}
