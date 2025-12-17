package assignment6;

public class Q7 {
	public static int numberOfDaysInAYear(int year){
	    int days;
	    if(year%4==0 && year%100!=0)
	      days = 366;
	    else if(year%400==0)
	      days = 366;
	    else
	      days = 365;
	    return days;
	}
	public static void main(String[] args) {
		System.out.println("Year" + "\t" + "Days");
	    for(int i=2000;i<=2020;i++)
	      System.out.println(i + "\t" + numberOfDaysInAYear(i));
	}
}