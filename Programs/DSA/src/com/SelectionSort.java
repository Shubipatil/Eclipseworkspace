package com;

public class SelectionSort {

	static int[] sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[index]>arr[j])
				{
					index=j;
					System.out.println("INDEX: "+index);
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			System.out.println("arr[i]:"+arr[i]);
			System.out.println("arr[index]:"+arr[index]);
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = {6,18,3,5,4};
		sort(arr);
		for(int ele:arr)
		{
			System.out.println(ele);
		}
		
		
	}
}













