package day7;

import java.util.Scanner;

public class Qstn1 {

	public static void main(String[] args) {
		int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit array\n");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array elemnts\n");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
		System.out.println(" the duplicate elemnts is\n");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(" "+arr[i]);
				}
				else
				{
					System.out.println("no duplicate element");
				}
			}
		}
		
	}

}
