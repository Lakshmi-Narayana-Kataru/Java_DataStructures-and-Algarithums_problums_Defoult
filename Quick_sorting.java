package com.learning.ds;

public class Quick_sorting {
	
		public static void QuickSort(int[] arr, int low, int high) 
		{
			if(low<high) {
				int pi = partition(arr,low,high);
				
				QuickSort(arr,low,pi-1);
				QuickSort(arr,pi+1,high);
				
			}
		}

	private static int partition(int[] arr, int low, int high) {
		
		int pivit = arr[high];
		int i=low-1;
		for(int j =low;j<high;j++)
		{
			if(arr[j]<pivit) {
				i++;
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
			}
			
		}
		int temp = arr[i+1];
		arr[i+1]= arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	

	public static void main(String[] args) {
		
		int arr [] = {6,50,25,8,19,41};
		System.out.println("Before Sorting");
		for(int n :arr) {
			System.out.print(n+" ");
		}

		QuickSort(arr,0,arr.length-1);  //O(n log(n))
		
		System.out.println("\nAfter sorting");
		for(int n :arr) {
			System.out.print(n+" ");
		}
	}

}
