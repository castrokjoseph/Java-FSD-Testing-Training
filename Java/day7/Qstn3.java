package day7;

import java.util.Scanner;

public class Qstn3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array\n");
		int size=sc.nextInt();
		int i,j,count=0;
		int[] arr=new int[size];
		System.out.println("enter the elemnts of array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the elements that needs to be checked");
		int occ=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(arr[i]==occ)
			{
				count++;
			}
		}
		System.out.println(count+"times");
	}

}
