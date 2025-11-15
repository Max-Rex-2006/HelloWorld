package outputquestions;

public class Practice5 {
	public static void main(String[] args) {
		int x=Integer.MAX_VALUE;
		System.out.println(x>>28);
		
		System.out.println();
		
		x=10;
		int y=5;
		System.out.println(x++^++y|(x=y)&101);
		x = 10;
		
		System.out.println();
		
		x=-4;
		y=4;
		System.out.println((x>>>30)+" "+(y>>1));
		x=-4;
		System.out.println((x>>29)+" ");



	}
}
