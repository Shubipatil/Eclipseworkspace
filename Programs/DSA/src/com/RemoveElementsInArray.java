package com;

public class RemoveElementsInArray {
	
	static int removeElement(int[] nums,int val) {
	int c=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[c]=nums[i];
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[] arr= {0,1,2,2,3,0,4,2};
		int ele=removeElement(arr,2);
		System.out.println(ele);
		for(int e:arr)
		{
			System.out.println(e);
		}
	

	}

}
