package com.learning.ds;

public class linear_search {

	public static int linear_search(int arr[], int terget) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == terget)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,9,11,13,15,17,19};
		int terget = 19;
		int index =linear_search(arr,terget);
		if(index == -1)
			System.out.println("Value doesn't present in the list");
		else
			System.out.println("Terget values found at index : "+index);
	}

}
