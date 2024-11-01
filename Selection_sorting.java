package com.learning.ds;

public class Selection_sorting {

	public static void main(String[] args) {
		
		int arr[] = {6,5,2,8,9,4};
		int size = arr.length;
		int temp = 0;
		int minindex = 0;
		
		System.out.println("Before sorting");
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		
		
		for(int i =0; i<size-1;i++)
		{
			minindex = i;
			for(int j=i+1 ;j<size;j++)
			{
				if(arr[minindex]>arr[j])
				{
					minindex=j;
				}
			}
			temp = arr[minindex];
			arr[minindex]= arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println("\nAfter sorting");
		for(int n :arr) {
			
			System.out.print(n+" ");
		}
		

	}

}
