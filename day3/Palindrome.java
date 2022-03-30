package day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int n=sc.nextInt();
		int temp=n;
			while(n>0)
				{
					r=n%10;
					sum=(sum*10)+r;
					n=n/10;
				}
			if(temp==sum)
			{
				System.out.println(" its palindrome");
			}
				else
			{
					System.out.println("not a palindrome");
			}
	}

}
