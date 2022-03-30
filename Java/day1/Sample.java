package day1;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		double a,b,c,res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		res=(a*b*c)/3;
		System.out.println("RESULT="+res);


	}

}
