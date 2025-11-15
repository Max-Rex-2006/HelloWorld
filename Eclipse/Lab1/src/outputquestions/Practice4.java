package outputquestions;

public class Practice4 {

	public static void main(String[] args) {
		int i = 0; 
		 for ( String s="a"; s.compareTo("aaa") !=0 ; s = s + "a" ) 
		 System.out.print(s);
		
		System.out.println();
		System.out.println();
		
		
		
//		for (i = 0; i < 1; System.out.println("HI")) 
//			 System.out.print("HELLO");
		
		
		
		
		
		for ( i = 0; true & ++i<2; i++) 
			 System.out.print(i);
		
		System.out.println();
		System.out.println();
		
		
		
		boolean b=false;
		 for ( i = 0; b | ++i<2; i++) 
		{
		 System.out.print(i);
		 b=!b;
		}
		
		System.out.println();
		System.out.println();
		
		
		
		i=0;
		for( ; ; )
		 {
		if(i>5)
		 break;
		else
		 i=i+2;
		System.out.println(i);
		}
		
		System.out.println();
		
		
		
		int x,y;
		for(x=6,y=4;x<=24;x=x+6)
		 {
		if(x%y==0)
		 break;
		System.out.println(x);
		}
		
		System.out.println();
		
		
		

		 for(x = 1, y = 4; x < y; x++, y--)
		 {
		 System.out.println("a = " + x);
		 System.out.println("b = " + y);
		 }
		 
		 System.out.println();
		 
		 
		 
		 i=0;
		 for(i=100; i<=0; i=i-10)
		  {
		 System.out.print(i+",");
		 }
		 
		 System.out.println();
		 
		 
		 
//		int n = 6;
//		i=0;
//		while (Math.pow(2,i)<=n);
//		System.out.println(i);
		 
		 
		 
		 int n = 6;
		 int j;
		 for (i=0,j=0; i<n; i++,j++)
		 
		System.out.println(i+" "+j);
		 
		System.out.println();
		
		
		
		do
		 {
		 System.out.println(i);
		 } while (i <= 5 );
		
		System.out.println();
		
		
		
//		do
//		 {
//		 while (true) 
//		System.out.println("HELLO"); 
//		 }while (false);
		
		do 
		 { 
		 System.out.print(1); 
		 do 
		 { 
		 System.out.print(2); 
		 } while (false); 
		 } while (false);
		
		System.out.println();
		
		
		
//		x = 30;
//		y = 50; 
//		 if (x < y) 
//		int w = 40; 
//		 else 
//		 { 
//		 System.out.println("BYE"); 
//		 }
		 
		 System.out.println();
		
		 
		 
//		 i=2;
//		 for( ; ; )
//		 {
//		 System.out.println("Hi");
//		 }
		 
		 System.out.println();
		 
		 
		 
		 for(i = 0; i<5; i++)
		 {
		 System.out.println("Hello");
		 i++;
		 i--;
		 }
		 
		 System.out.println();
		 
		 
		 
		 for(i = 0; i<5; i=5 )
		 {
		 System.out.println("Hello");
		 }
		 
		 System.out.println();
		 
		 
		 
		 String s = "School";
		 x = 0;
		 do
		 {
		 System.out.print(s.charAt(x));
		 x++ ;
		 } while (x < 2);
		 
		 System.out.println();
		 System.out.println();
		 
		 
		 
		 i=0;
		 for(i=1; i<=6;i++)
		  {
		  if(i%3==0)
		  continue;
		  
		 System.out.print(i+",");
		  }
		 
		 System.out.println();
		 System.out.println();
		 
		 
		 
//		 n = 6;
//		 do
//		 { 
//		 System.out.println(Math.abs (-n));
//		 } while (n != 0);
//		 
//		 System.out.println();
		 
		 
		 
		 System.out.println(Math.abs(-8));
	}

}
