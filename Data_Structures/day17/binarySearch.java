package day17;
import java.util.*;
public class binarySearch {
	public static int binarySearch(int arr[],int first,int last, int srch)
	{
		if (last>=first){  //last=2,first=2,
            int mid = (first + last)/2;//2+2/2=2
            if (arr[mid] == srch){  // is arr[mid]=arr[2]=8
            return mid;  
            }  
            if (arr[mid] > srch){//6>8
            return binarySearch(arr, first, mid-1, srch);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, srch);//search in right subarray  
            }  
        }  
        return -1;  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit of array");
		int s=sc.nextInt();
		int []arr=new int[s];
		System.out.println(" read the elements");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("read the eleemnt to be searched");
		int srch=sc.nextInt();
		int last=arr.length-1;
		
			int res=binarySearch(arr,0,last,srch);
				if(res==-1)
					System.out.println("Element is not found!");
				else
					System.out.println("Element is found at index:" +res);
		sc.close();
	}

}
