package day8;
import java.util.*;
public class Qstn4 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s1;
			int count =0;
			System.out.println(" enter the string");
			s1=sc.nextLine();
			//s1=s1.replace(" ","");
			System.out.println("enter the element to be searched with count");
			char c = sc.next().charAt(0);
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==c)
					count++;
			}
			System.out.println(" "+c+" apears "+count+" times");
			
	}

}
