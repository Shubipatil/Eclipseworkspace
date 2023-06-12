package regularExpression;

public class Sum_string {

	public static void main(String[] args) {

		String s="hi bye 12 good 200 hell 500";
		String temp="";   
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(s.charAt(i)))
			{
				temp=temp+s.charAt(i);
				
//				if(i==s.length()-1)
//				{
//					sum=sum+Integer.parseInt(temp);
//				}
			}		
			else
			{   
				if(!temp.equals("")) 
				{
					sum=sum+Integer.parseInt(temp);
					temp="";
				}			
			}
			
		}
		sum=sum+Integer.parseInt(temp);
		System.out.println(sum);
		

		




	}
}
