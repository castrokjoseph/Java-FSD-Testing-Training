package day17;
import java.util.*;
public class LinearSrch {
	public static int linearSearch(int arr[], int srch)
	{
		for (int i = 0; i < arr.length; i++) {
	         if (arr[i] == srch) {
	            return i;
	         }
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the limit:");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println(" Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("enter the elemnt to be searched");
		int srch=sc.nextInt();
		
		int index = linearSearch(arr, srch);
	      if (index != -1) {
	         System.out.println(srch + " present at index: " +index);
	      } else {
	         System.out.println(srch + " is not present.");
	      }
		
		
	      sc.close();
	
	}

}
