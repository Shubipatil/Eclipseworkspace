package regularExpression;

public class NOofocc {

	public static void main(String[] args) {
		String s="welcome";
		char[] arr1=s.toCharArray();
		char[] arr2=s.toCharArray();
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			int c=0;
			temp=c;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					c++;
					arr2[j]='\0';
				}
			}
			if(c>1)
			{
				System.out.println(arr1[i]+" ->"+ c);
			}
			
		}
		}
}
