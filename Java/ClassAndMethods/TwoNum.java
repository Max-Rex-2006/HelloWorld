import java.util.Scanner;

class Operations{
    public double add(double a, double b){
        double sum = a + b;
        return sum;
    }
    public double sub(double a, double b){
        double diff = a - b;
        return diff;
    }
    public double mult(double a, double b){
        double pdt = a*b;
        return pdt;
    }
    public double div(double a, double b){
        double quo = a/b;
        return quo;
    }
    public double mod(double a, double b){
        double rem = a % b;
        return rem;
    }
}



public class TwoNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        double num1 = scn.nextDouble();
        double num2 = scn.nextDouble();
        System.out.print("Please choose any one to calculate: \n 1->Add \n 2->Subtract \n 3->Multiply \n 4->Divide \n 5->Remainder \n Exit");
        int opt = scn.nextInt();
        Operations op = new Operations();
        double res;
        switch(opt){
            case 1: res = op.add(num1, num2); System.out.println(res); break;
            case 2: res = op.sub(num1, num2); System.out.println(res); break;
            case 3: res = op.mult(num1, num2); System.out.println(res); break;
            case 4: res = op.div(num1, num2); System.out.println(res); break;
            case 5: res = op.mod(num1, num2); System.out.println(res); break;
            default: System.out.println("Exiting the program now...");
        }
        scn.close();
    }
}
