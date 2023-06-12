package interviewprogram;

public class Sum_Of_Num_In_Str {

	public static void main(String[] args) {
		String s="hi 12 bye 200 hello 50";
		String  arr[]=s.split(" ");
		int sum=0;
		String s1="";
		for(int i=0;i<arr.length;i++)
		{
			
			String temp=""+arr[i];
			
			for(int j=0;j<temp.length();j++)
			{
				if(temp.charAt(j)>='0' && temp.charAt(j)<='9' )
				{
					s1=s1+temp.charAt(j);
				}
				
			else
			{
				if(!s1.equals(""))
					sum=sum+Integer.parseInt(s1);
					s1="";
			}   
		}
			sum=sum+Integer.parseInt(s1);
	}
		System.out.println(sum);
}
	}
