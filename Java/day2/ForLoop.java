package day2;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}

	}

}
