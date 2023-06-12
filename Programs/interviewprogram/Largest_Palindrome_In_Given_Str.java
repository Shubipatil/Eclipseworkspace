package interviewprogram;

public class Largest_Palindrome_In_Given_Str {

	static boolean isPalindrome(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
		{
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		
		String s="skjdhaabbaall";
		String ans="";
		for(int i=0;i<s.length();i++)
		{    String temp=""+s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				temp=temp+s.charAt(j);
				if(isPalindrome(temp))
				{
					if(ans.length()<temp.length())
					{
						ans=temp;
					}
				}
			}
		}
		System.out.println("largest palindrome "+ans);

	}

}
