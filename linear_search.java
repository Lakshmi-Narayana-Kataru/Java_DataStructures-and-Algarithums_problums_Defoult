package com.learning.ds;

public class linear_search {

	public static int linear_search(int arr[], int terget) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == terget)
				return i;
		}
		return -1;
	}
	
  public static int binary_search(int arr[], int terget,int left,int right) {
	  
	  for(int i =left ; i<right;i++){
		int mid = (left +right)/2;
		if(arr[mid]==terget)
		{
			return mid;
		}
		else if(arr[mid] > terget) {
			right = mid -1;
			
		}
		else if(arr[mid] < terget) {
			left = mid+1;
		}
		else
			return -1;
	}
		return -1;
  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,9,11,13,15,17,19};
		int terget = 19;
		int left =0;
		int right =arr.length;
		int index =binary_search(arr,terget,left,right);
		if(index == -1)
			System.out.println("Value doesn't present in the list");
		else
			System.out.println("Terget values found at index : "+index);
	}

}
