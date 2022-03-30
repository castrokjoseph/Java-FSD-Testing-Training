package day2;
import java.util.Scanner;

public class Arithemetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		double c;
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		c=a+b;
		System.out.println("Addition       :"+c);
		c=a-b;
		System.out.println("Subtraction    :"+c);
		c=a*b;
		System.out.println("Multiplication :"+c);
		c=a/b;
		System.out.println("Division       :" +c);
		c=a%b;
		System.out.println("Remainder      :" +c);
	}

}
