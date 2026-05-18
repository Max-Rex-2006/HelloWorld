package assignment2;

class Complex{
	int real;
	int imag;
	public Complex() {
		real = 0;
		imag = 0;
	}
	public void setData(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	public void display() {
		System.out.println(real + "+" + imag + "i");
	}
	public Complex add(Complex C1, Complex C2) {
		Complex C = new Complex();
		C.real = C1.real + C2.real;
		C.imag = C1.imag + C2.imag;
		return C;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		c1.real = 2; c1.imag = 3;
		c2.real = 4; c2.imag = 7;
		System.out.println("First number:");
		c1.display();
		System.out.println("Second number:");
		c2.display();
		System.out.println("Their addition:");
		c3 = c3.add(c1,c2);
		c3.display();
	}

}
