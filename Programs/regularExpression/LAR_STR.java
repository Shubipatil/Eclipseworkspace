package regularExpression;

import java.util.Scanner;

public class LAR_STR {

	static boolean pal(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		if(s.equals(s1))
		{
			return true;
		}
		else 
		{
		return false;
		}
	}
	public static void main(String[] args) {
//		Scanner ip= new Scanner(System.in);
//		System.out.println("enter");
		//String s=ip.next();
		String s="level";
		String ans="";
		char [] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			String temp=""+arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				temp=temp+arr[j];
				if(pal(temp))
				{
					if(ans.length()<temp.length())
					{
						ans=temp;
					}
				}
				
			}
			
		}
		System.out.println(ans);
	}

}
