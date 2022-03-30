package day7;
import java.util.Scanner;

public class Qstn4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int i,j;
		String[] arr=new String[size];
		System.out.println("enter the elemnts to array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.next();
					
		}
		System.out.println(" The elemnts of string are");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("elemnts in reverse order");
		for(i=size-1;i>-0;i--)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
