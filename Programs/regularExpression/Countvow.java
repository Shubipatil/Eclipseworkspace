package regularExpression;

public class Countvow {

	public static void main(String[] args) {
		
		String s="hello";
		s=s.toLowerCase();
		char[] arr= {'a','e','i','o','u'};
		
		for(char ele:arr)
		{
			boolean flag=false;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch==ele)
				{
					//System.out.println("ch ->"+ch);
					flag=true;
					break;
				}
				System.out.println(ch);
			}
			//System.out.println(ch);
			if(flag==false)
			{
				//System.out.println(ele);
			}
		}

	}

}
