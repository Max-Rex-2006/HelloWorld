package outputquestions;

public class Practice2 {

	public static void main(String[] args) {
		int a=2,b=5,c;
		a=a*a++ - --a;
		c=b++ - b--;
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println(a++ + ++a * a--);
		System.out.println(b=b++ * b--);
		System.out.println("a="+a+",b="+b+",c="+c);
		
		System.out.println();
		
		System.out.println(011+ 1.94 + "C" + "S");
		
		System.out.println();
		
		System.out.println(2+3+"bc"+'c'+'a');
		System.out.println('c'+'a'+2+3+"bc");
		System.out.println("bc"+'c'+'a'+2+3);
		System.out.println("bc"+('c'+'a')+(2)+3);
		
		System.out.println();
		
		int x = - 4; 
		System.out.println(x>>1); 
		int y = 4; 
		System.out.println(y>>1);
		
		System.out.println();
		
		byte m = 10;
		m++;
		System.out.println(m);
		
		System.out.println();
		
		int i = 4;
		int j = 21;
		int k = ++i*7 + 2 - j--;
		System.out.println("k = " + k);
		
		System.out.println();
		
		x=12; y=7; 
		int z=9;
		z = (x<y)? (x > z ? z: x) : (y < z ? z: y);
		System.out.println(z);

		System.out.println();

		System.out.println(10<<2); 
		System.out.println(10<<3); 
		System.out.println(20<<2);
		System.out.println(15<<4);
		
		System.out.println();

		System.out.println(10>>2); 
		System.out.println(20>>2); 
		System.out.println(20>>3); 

		System.out.println();

		a=10;
		b=5;
		c=20;
		System.out.println(a < b && a < c);
		System.out.println(a < b & a < c);

		System.out.println();

		a = 10;
		b = 6;
		c = 30;
		System.out.println(a > b || a < c);
		System.out.println(a > b | a < c);
		System.out.println(a > b || a++ < c);
		System.out.println(a);
		System.out.println(a > b | a++ < c);
		System.out.println(a);

		System.out.println();

a=4;
b=5;
x=(a++ < b)?a:b; //5 : 5
y=a+b-x;
System.out.println("x="+x);
System.out.println("y="+y);

System.out.println();

a=10;
a+=3;
System.out.println(a);
a-=4;
System.out.println(a);
a*=2;
System.out.println(a);
a/=2;
System.out.println(a);
a%=2;
System.out.println(a);
	}

}
