package day8;
import java.util.*;

public class Qstn1 {

	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			String s1,s2;
			int i,freq=0,flag=0;
			System.out.println("Enter the first String");
			s1=sc.nextLine();
			System.out.println("Enter the second string");
			s2=sc.nextLine();
			
				for(i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)==s2.charAt(0)) 
					{
						flag=1;
						System.out.println("At position "+(i+1));
						freq++;
						
					}
				}
			if(flag==1)
				System.out.println("characters " +s2+" occcured "+freq+" times");
				
			else
				System.out.println("not a substring");
	}

}
