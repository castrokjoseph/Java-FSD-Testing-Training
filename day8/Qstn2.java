package day8;
import java.util.*;
public class Qstn2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1;
		
		System.out.println("enter the string");
		s1=sc.next();
		System.out.println("enter the limit char");
		int size=sc.nextInt();
		System.out.println("enter the characters");
		 char[] a=new char[size]; 
		 for(int i=0;i<size;i++)
		 {
			 a[i]=sc.next().charAt(0);
			 System.out.println(a[i]);
		 }
				 System.out.print("char are :");
				 for(int i=0;i<size;i++)
				 {
						System.out.println(a[i]);
				 }
				 System.out.println(" ");
				 for(int i=0;i<s1.length();i++)
				 {
					 char ch=s1.charAt(i);
					 for(int j=0;j<size;j++)
					 {
						 if(a[j]==ch)
						 {
							 System.out.println("character "+a[j]+" found in the string "+s1);
						 
						 }
						 
					 }
				 }

	}

}
