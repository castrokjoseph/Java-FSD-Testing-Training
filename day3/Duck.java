package day3;
import java.util.Scanner;

public class Duck {

	public static void main(String[] args) {
		int n,temp,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			if(n%10==0)
			{
				flag=1;
				break;
			}
			n=n/10;
		}
		if(temp>0 && flag==1)
		{
			System.out.println("the givem no is Duck Number");
		}
		else
		{
			System.out.println("not a Duck Number");
		}
	}

}
