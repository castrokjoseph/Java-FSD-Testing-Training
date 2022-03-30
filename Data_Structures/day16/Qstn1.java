package day16;

import java.util.Scanner;


public class Qstn1 {
	static void bubbleSort(int[] arr)
	{
		int temp=0,j=0,i;
		for ( i = 0; i < ( arr.length - 1 ); i++) 
		{
		      for (j = 0; j < arr.length - i - 1; j++)
		      {
		        if (arr[j] > arr[j+1]) 
		        {
		           temp = arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1] = temp;
		        }
		      }  
		}
		
	}
	 static void selectionSort(int[] arr)
	{
		for (int i=0;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j]<arr[index]) {
					index=j;
				}
			int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	      System.out.println("Enter the array range");  
	      int size = sc.nextInt();  
	      int[] arr = new int[size];  
	      System.out.println("Enter the elements of the array:"); 
	      for(int i=0; i<size; i++)
	      {  
	         arr[i] = sc.nextInt();  
	      }  
	      
	      	System.out.println("Array elements before sorting:");
	      	for(int i=0;i<size;i++)
	      	{
	      		System.out.print(arr[i]+ " ");  
	      	}
	      
	      bubbleSort(arr);
	      System.out.println();
	      System.out.println("After Bubble Sort");
	      for(int i=0;i<size;i++)
	      {
	    	  System.out.print(arr[i]+" ");
	      }
	     
	      
	      selectionSort(arr);
	      System.out.println();
	      System.out.println("After Selection Sort");
	      for(int i=0;i<size;i++)
	      {
	    	  System.out.print(arr[i]+" ");
	      }
	 
	      sc.close();
	}
	
	
	
}
