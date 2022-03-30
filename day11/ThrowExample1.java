package day11;

import java.util.Scanner;

public class ThrowExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		validate(age);
		System.out.println("Rest of the code");
	}

	public static void validate(int a) {
		if(a<18)
		{
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else
		{
			System.out.println("Person is eligible to vote");
		}
		
	}

}
