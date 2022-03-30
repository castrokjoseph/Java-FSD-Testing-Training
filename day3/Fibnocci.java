package day3;
import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		int n, firstTerm = 0, secondTerm = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}

}
