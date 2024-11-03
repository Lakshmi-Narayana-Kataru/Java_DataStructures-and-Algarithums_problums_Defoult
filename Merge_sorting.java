package com.learning.ds;

public class Merge_sorting {
	
	
	public static void MergeSorting(int arr[], int l, int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			
			MergeSorting(arr,l,mid);
			MergeSorting(arr,mid+1,r);
			
			MergeSort(arr,l,mid,r);
		}
		
	}
	
	private static void MergeSort(int[] arr, int l, int mid, int r) {
		
		int n1 = mid - l + 1;
		int n2 = r-mid;
		int larr[] = new int[n1];
		int rarr[] = new int[n2];
		
		for(int x =0;x<n1;x++)
		{
			larr[x] = arr[l+x];
		}
		for(int x =0;x<n2;x++)
		{
			rarr[x] = arr[mid+1+x];
		}
		
		int i=0;
		int j =0;
		int k=l;  
		while(i<n1 && j<n2)
		{
			if(larr[i] <= rarr[j])
			{
				arr[k] = larr[i];
				i++;
			}
			else
			{
				arr[k] = rarr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k]= larr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]= rarr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		
		int arr [] = {6,50,25,8,19,41};
		System.out.println("Before Sorting");
		for(int n :arr) {
			System.out.print(n+" ");
		}

		MergeSorting(arr,0,arr.length-1);  //O(n log(n))
		
		System.out.println("\nAfter sorting");
		for(int n :arr) {
			System.out.print(n+" ");
		}

	}

}
