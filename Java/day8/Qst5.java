package day8;

import java.util.Scanner;

public class Qst5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the string:");
		String s1=sc.nextLine();
		char[] ch=s1.toCharArray();
		int len=ch.length;
		System.out.println(" string array:");
		for(int i=0;i<len;i++)
		{
			System.out.print(ch[i]+" ");
			
		}
		int flag=0;
		for(int i=0;i<len/2&&len!=0;i++)
		{
			if(ch[i]!=ch[len -i -1])
			{
				flag=1;
			break;
			}
		}
		if(flag == 1)
			System.out.println(" the array is not palindrome");
		else
			System.out.println("the array is palindrome");
	}

}
