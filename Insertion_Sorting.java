package com.learning.ds;

public class Insertion_Sorting {

	public static void main(String[] args) {
		
		int arr[] = {6,5,2,8,9,4};
		int size = arr.length;
		
		System.out.println("Before sorting");
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		
		for(int i=1;i<size;i++)
		{
			int key = arr[i];
			int j = i-1;
			
			while( j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.println("\nAfter sorting");
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		

	}

}
