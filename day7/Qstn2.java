package day7;

import java.util.Scanner;

public class Qstn2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the array limit\n");
		int size=sc.nextInt();
		int temp=0,i;
		int arr[]=new int[size];
		
		System.out.println("enter the array elemnts\n");
		for(i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println(" elements are :");
			for( i=0;i<size;i++)
			{ 
				System.out.println(arr[i]);
			}
			System.out.println("largest element is:");
			for (i=0;i<size;i++) {
				
				for(int j=i+1;j<size;j++)
				{
					if(arr[i]>arr[j])
					{
						
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(temp);
}
}
