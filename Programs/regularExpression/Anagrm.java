package regularExpression;

import java.util.Scanner;

public class Anagrm {
	static String sort(String s)
	{
		char []arr=s.toCharArray();
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
		return new String(arr);
	}

	public static void main(String[] args) {
//		Scanner ip=new Scanner(System.in);
//		System.out.println("enter the string");
//		String s1=ip.next();
//		String s2=ip.next();
//		s1=sort(s1);
//		s2=sort(s2);
//		if(s1.equals(s2))
//		{
//			System.out.println("anagram");
//		}
//		else
//		{
//			System.out.println("not");
//		}
//		
		
		
		
		
		
	}
}
