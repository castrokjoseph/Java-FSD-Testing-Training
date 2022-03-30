package day18;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void merge(int[] larr,int[] rarr, int[] arr,int lsize, int rsize) {
		 int i=0,l=0,r = 0;
	      //The while loops check the conditions for merging
	      while(l<lsize && r<rsize){
	          
	          if(larr[l]<rarr[r]){
	              arr[i++] = larr[l++];
	          }
	          else{
	              arr[i++] = rarr[r++];
	          }
	      }
	      while(l<lsize){
	          arr[i++] = larr[l++];
	      }
	      while(r<rsize){
	        arr[i++] = rarr[r++];
	      }
	  }
		
	public static void mergeSort(int [] arr, int len){
	      if (len < 2){return;}
	      
	      int mid = len / 2;
	      int [] larr = new int[mid];
	      int [] rarr = new int[len-mid];
	      
	    
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              larr[i] = arr[i];
	          }
	          else{
	              rarr[k] = arr[i];
	              k = k+1;
	          }
	          
	      }
	      mergeSort(larr,mid);
	      mergeSort(rarr,len-mid);
	      merge(larr,rarr,arr,mid,len-mid);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the limit:");
		int size=sc.nextInt();
		int []array=new int[size];
		System.out.println(" Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			array[i] =sc.nextInt();
		}

		mergeSort(array,array.length);
        for(int i =0; i< size;i++){
            System.out.print(array[i]+ " ");
        }
	}

}
