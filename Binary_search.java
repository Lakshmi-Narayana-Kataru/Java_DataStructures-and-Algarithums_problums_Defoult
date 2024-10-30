package com.learning.ds;

public class Binary_search {

	public static void main(String[] args) {
		int arr[] = {7,9,11,13,15,17,19};
		int target =19;
		int left =0;
		int right=arr.length-1;
		int index = Binary_Search(arr,target,left,right);
		if(index==-1) {
			System.out.println("Entered target value not avilavel");
		}
		else {
			System.out.println("Target found at the indef of : "+index);
		}
	}

	private static int Binary_Search(int[] arr, int target, int left, int right) {
		int mid=0;
		
		while(left<=right) {
			mid = (left+right)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		return -1;
	}

}
