package day8;

import java.util.Scanner;

public class Qstn5 {
	public static boolean checkpalindrome(String str)
	{
		int len =str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1))
				return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int n=arr.length;
		for(int i=0;i<n;i++)
			if(Qstn5.checkpalindrome(arr[i])) {
				System.out.println(arr[i]+" is palindrome");
			}
			else
				System.out.println(arr[i]+" is not a palindrome");
	}

}
