package day16;

public class SelectionSort {

		void sort(int arr[])
		{  			//1,2,3,4,6,9	
			int n = arr.length; //6

			// One by one move boundary of unsorted subarray
			for (int i = 0; i < n-1; i++) 
			{
				// Find the minimum element in unsorted array
				int min_idx = i;//
				for (int j = i+1; j < n; j++) 
				{
						if (arr[min_idx] > arr[j])
						min_idx = j;//5
				}

				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp; /*
				for (int k=0; k<n; ++k)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();  */

			}

		}

		// Prints the array
		void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}

		// Driver code to test above
		public static void main(String args[])
		{
			SelectionSort ob = new SelectionSort();
			int arr[] = {4,1,9,2,3,6};
			ob.sort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
		}
}
