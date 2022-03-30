package day7;

import java.util.Scanner;

public class Qstn5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of Employees\n");
		int n=sc.nextInt();
		System.out.println("ENTER Employee Name, Salary,DOJ(dd/mm/yyyy)");
		String[] name=new String[n];
		double[] salary=new double[n];
		String[] Doj=new String[n];
		for(int i=-0;i<n;i++) 
		{
			name[i]=sc.next();
			salary[i]=sc.nextDouble();
			Doj[i]=sc.next();
			
		}
		System.out.println("*****EMPLOYEE DETAILS*********");
		System.out.println(" EMPLOYEE NAME | EMPLOYEE DOJ | EMPLOYEE SALARY |");
		for(int i=0;i<n;i++)
		{
		System.out.println(" " +name[i]+  "      |"+" " +Doj[i]+"    |" + " "+salary[i]+"        |");
		}
		
	}

}
