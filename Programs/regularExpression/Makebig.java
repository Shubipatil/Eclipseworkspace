package regularExpression;

import java.util.Scanner;

public class Makebig {

	public static void main(String[] args) {

		Scanner ip=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ip.nextInt();
		String s=n+"";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}		
		}
	}
		String s1=new String(arr);
		int n1=Integer.parseInt(s1);
		System.out.println("the bigest num is");
		System.out.println(n1);


		
//		String s="125.56";
//		System.out.println(s);
//		double d=Double.parseDouble(s);
//		System.out.println(d);
//		
		
	}

}
