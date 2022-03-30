package day8;
import java.util.*;


public class Qstn3 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,strings="";
		System.out.println("enter the string");
		s=sc.nextLine();
		char[] ch=s.toCharArray();
		int len=ch.length;
		System.out.println(" char array are:");
			for(int i=0;i<len;i++)
			{
				System.out.println(ch[i]+"");
			}
				System.out.println(" ");
				System.out.println(" reversed char array:");
					for(int i=len-1;i>=0;i--)
					{
						System.out.println(ch[i]+" ");
					}
		System.out.println("reversed char array as string:");
					for(int i=0;i<len;i++)
					{
						System.out.println(ch[i]+"");
					}
						System.out.println("char array as string:");
						String string=new String(ch);
						System.out.println("string");
		
	} 

	
}
