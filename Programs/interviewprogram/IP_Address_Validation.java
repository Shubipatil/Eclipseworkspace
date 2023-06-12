package interviewprogram;

public class IP_Address_Validation {
   static boolean ipaddress(int n)
   {
	   if(n>=0 && n<=255)
	   {
		   return true;	   
	   }
	   return false;
   }
	public static void main(String[] args)
	{ 
		String s="246.250.058.479";
		String s1="";
		int num=0;
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				 s1=s1+ch;
			}
			else
			{
				num=Integer.parseInt(s1);
				s1="";
				if(ipaddress(num)==false)
				{
					flag=false;
					break;
				}
				num=0;
			}				
		}

		if(flag==true)
		{
			System.out.println("Valid Ip address");
		}
		else
		{
			System.out.println("Invalid Ip address");
		}
	}

}
