package day2;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("enter the weight");
			int weight=sc.nextInt();
			if(weight>50)
			{
				System.out.println("you are eligible to donate blood");
			}
			else
			{
				System.out.println("you are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("Age must be greater than 18");
		}
	}

}
