 package regularExpression;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//String s="hihel60loku120bye20h";
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=ip.nextLine();
		char[]arr=s.toCharArray();
		String temp="";
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='0' && arr[i]<='9')
			{
				temp=temp+arr[i];				
			}
			else
			{
				if(!temp.equals("")) {
				sum=sum+Integer.parseInt(temp);
				temp="";
				}
			}
		}
		sum=sum+Integer.parseInt(temp);
		System.out.println("Sum of number in string:"+sum);
	}
}
