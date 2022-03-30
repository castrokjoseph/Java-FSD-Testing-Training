package day3;
import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		int q,r,fact=1,result=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int n=sc.nextInt();
			q=n;
			while(q!=0)
				{
					r=q%10;
					for(int i=1;i<=r;i++)
					{
					fact=fact*i;	
					}
					result=result+fact;
					fact=1;
					q=q/10;
				}
			if(result==n)
				System.out.println(+n + "is a strong number");
			else
				System.out.println(+n +" is not a strong number");
	}

}
