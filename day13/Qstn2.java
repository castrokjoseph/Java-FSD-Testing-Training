package day13;
import java.util.*;
public class Qstn2 {
		
	public static void main(String[] args) {
		
		List < Integer > list = new ArrayList < Integer > ();
		     
	    list.add(10);
	    list.add(90);
	    list.add(30);
	    list.add(40);
	    list.add(70);
	    list.add(100);
	    list.add(60);
	     
	    System.out.println("Elements in List : " + list);
	    Integer a[] = new Integer[list.size()];
        list.toArray(a);
        System.out.print("Elements in List : ");
       
        for (Integer obj : a) {
            System.out.print(obj + " ");
        }
        int sum = sumOfArray(a, a.length - 1);
        System.out.println();
        
        // Print the sum returned above
        System.out.println("Sum of elements  : " + sum);
        int avg;
        avg=sum/2;
        System.out.println("Average:"+ avg);
	}

	public static int sumOfArray(Integer[] a, int n) {
		if (n == 0)
			return a[n];
		else
			return a[n]+sumOfArray(a, n - 1);
			
	}
	

}
