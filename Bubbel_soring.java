package com.learning.ds;

public class Bubbel_soring {

	public static void main(String[] args) {
		
		int arr[] = {9,2,12,3,18,1};
		int size = arr.length;
		int temp = 0;
		
		System.out.println("Before sorting");
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		for(int i =0;i<size;i++) 
		{
			for(int j=0;j<size-1-i;j++) 
			{
				if(arr[j]> arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println();
			for(int n :arr) {
				
				System.out.print(+n+" ");
			}
		}
		System.out.println("\nAfter sorting");
		for(int n :arr) {
			
			System.out.print(n+" ");
		}
	}

}
