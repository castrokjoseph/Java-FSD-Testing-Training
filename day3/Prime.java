package day3;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int i=2,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		while(i<n)
	      {
	         if(n%i == 0)
	         {
	            count++;
	            break;
	         }
	         i++;
	      }
	      
	      if(count==0)
	         System.out.println( +n+ " is a Prime Number.");
	      else
	         System.out.println( +n+ " is not a Prime Number.");
	   }
	}
	//}

