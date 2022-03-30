package day1;
import java.util.Scanner;

public class Basic {
	static int samp=125;


	public static void main(String[] args) {
		double a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		a=s.nextDouble();
		System.out.println("enter the Second value");
		b=s.nextDouble();
		c=a+b;
		System.out.println("sum="+c);
		showsample();

	}
	public static void showsample()
	{
		int x=15;
		System.out.println(samp);
	}


}
