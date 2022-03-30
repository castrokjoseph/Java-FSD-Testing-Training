package day10;

import java.util.Scanner;

public class Qstn1
{

	public static void main(String[] args) 
	{
		String str=null;
		try {
			System.out.println("question 1:");
		
			try 
				{
					if (str.equals("abc"))
						System.out.print("Same");
					else 
						System.out.print("Not Same");
				}
			catch(NullPointerException e)
				{
					System.out.print("NullPointerException Caught");
				}
		try 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("\n");
				System.out.println("enter a valid integer:");
				int a=sc.nextInt();
				System.out.println(a);
				sc.close();
			}
		catch(NumberFormatException e)
			{
				System.out.println("Number Format Exception Occured");
				
			}
		}
		catch(Exception e)
		{
			System.out.println(" Exception in outer try");
		}
	}

}
