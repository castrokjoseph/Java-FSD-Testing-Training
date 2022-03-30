package day3;
import java.util.Scanner;

public class ArthOp {

	public static void main(String[] args) {
		int a,b;
		double res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values for a  and b");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a+b;
		System.out.println(" result of addition      :" +res);
		res=a-b;
		System.out.println(" result of subtraction   :" +res);
		res=a/b;
		System.out.println(" result of division      :" +res);
		res=a*b;
		System.out.println(" result of mutiplication :" +res);
		res=a%b;
		System.out.println(" result of reminder      :" +res);
	}

}
