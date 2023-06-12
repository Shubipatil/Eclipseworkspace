package com;

public class BinarySearch {

	static int search(int arr[],int key)
	{
		int beg=0,end=arr.length-1;
		while(beg<=end)
		{
			int mid=(beg+end)/2;

			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>=key)
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
		}
		return -1;

	}
	public static void main(String[] args) {

		 int arr[] = { 8, 24, 26, 34, 57, 60, 68, 78, 86, 90, 98 };
		int x = search(arr, 98);
		System.out.println(x);
	}

}
