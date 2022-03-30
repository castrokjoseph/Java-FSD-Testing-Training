package day3;
import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		int a,b,c;
		int max,min;
		Scanner sc =new Scanner(System.in);
		System.out.println("read the 3 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println( "max value" + max);
		min = (a <b) ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("min value"+ min);
	}

}
