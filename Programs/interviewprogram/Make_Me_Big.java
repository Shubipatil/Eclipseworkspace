package interviewprogram;

import java.util.Scanner;

public class Make_Me_Big {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		//System.out.println(n);
		String s=n+"";		
		int arr[]=new int[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			int rem=n%10;
			arr[i]=rem;
			n=n/10;
			//System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] <arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			num=(num*10)+arr[i];
			
		}
		System.out.println("Make me big number is:"+num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
