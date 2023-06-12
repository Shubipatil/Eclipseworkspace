package regularExpression;

public class Largwor {

	public static void main(String[] args) {
	String s="welcome bye hi hello";
	String [] arr=s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
		{
			String temp=arr[i];
			String rev="";
			for(int j=0;j<temp.length();j++)
			{
				rev=temp.charAt(j)+rev;		
			}
			System.out.print(rev+" ");
		}
		else
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	
	
	}

}
