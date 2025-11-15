package outputquestions;

public class Practice3 {

	public static void main(String[] args) {
		boolean i=false,x=false,y=true;
		if(i=(x=i=y)) 
		 System.out.println("bye");
		else
		 System.out.println("hello");
		 System.out.println("hi");
		 
		System.out.println();
		
		
		
		i=false;
		if(!i && i==true) 
		 System.out.println("bye");
		else
		 System.out.println("hello");
		 System.out.println(i);
		 
		 System.out.println();
		 
		 
		 
		 if (true) {
			 System.out.println("Hello");
			 } 
		 int a=2,b=2;
		 int z;
		  if (a>2) {
		  if(b>2){
		  z=a+b;
		  System.out.println("z="+z);
		  }
		  }
		  else
		  System.out.println("x="+a);
		  
		  System.out.println();
		  
		  
		  
		  float f = 75.0f;
		  double d = 75.0;
		  int k = 75;
		  if( f == d )
		  {
		  if( f == k )
		  {
		  System.out.println("f, d and i are equal");
		  }
		  else
		  {
		  System.out.println("f, d are equal but i is not equal");
		  }
		  }
		  else
		  {
		  System.out.println("f and d are not equal");
		  }
		  
		  System.out.println();
		  
		  
		  
		  int xm = 10; 
		  if (++xm < 10 && (xm / 0 > 10)) { 
		  System.out.println("Hello"); 
		  } else { 
		  System.out.println("HIIII"); 
		  }
		  
		  System.out.println();
		  
		  
		  
		  int m = 65;
		  switch (m) {
		  default :
		  System.out.print("Website");
		  case 65 :
		  System.out.print("Merit");
		  case 'm' :
		  System.out.print("Campus");
		  case 'j' :
		  System.out.print("Java");
		  break;
		  }
		 
		 System.out.println();
		 System.out.println();
		  
		  
		  
		  x = true;
		  y = false;
		  if ((x && y)|(x||y)) {
		  System.out.println(true);
		  } else {
		  System.out.println(false);
		  }
		  
		  System.out.println();
		  
		  
		  
		  a = 7;
		  if ( a*2==a<<33 ) {
		   System.out.print( "Yup" );
		   }
		   else {
		   System.out.print( "Nope!" );
		   }
		  
		  System.out.println();
		  System.out.println();
		  
		  
		  
		  
		  x = true; 
		  if (x = false) { 
		  System.out.println("HELLO"); 
		  } else { 
		  System.out.println("BYE"); 
		  } 
		  
		  System.out.println();
		  
		  
		  
		  x = true;
		  y = false;
		  if (x && y) {
		  System.out.println(true);
		  } else {
		  System.out.println(false);
		  }
		  
		  System.out.println();
		  
		  
		  
		  a = 10;
		  b = 9;
		  if (a > b)
		   System.out.println("a is greater");
		  System.out.println("I am not in if block");
		  
		  System.out.println();
		  
		  
		  
		  float fl = 5.3f;
		  if (fl == 5.3)
		  System.out.println("Both are equal");
		  else
		  System.out.println("Both are not equal");
		  
		  System.out.println();
		  
		  
		  
		  int l = 10, s=0;
		  if (l < 10)
		  s = 1;
		  if (l >= 10)
		  s=2;
		  System.out.println("y is " + s); 
	}

}
