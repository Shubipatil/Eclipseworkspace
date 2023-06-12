package interviewprogram;

public class Replace_the_Letter_Rightside_and_Leftside {

	public static void main(String[] args) 
	{	
		String s="hello";
		System.out.println(s);
		int lp=0;
		int rp=s.length()-1;
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				rp--;
			}
			else
			{
				lp++;
			}
		
		String temp="";
		for(int j=lp;j<=rp;j++)
		{
			temp=temp+s.charAt(j);
		}
		System.out.println(temp);
		}
	}

}
