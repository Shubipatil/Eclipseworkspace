package interviewprogram;

public class SumOfDuplicateElementInInterger {

	static boolean primeno(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int [] arr1= {10,20,10,10,2,3,3,7,2,1,5,7};
		int [] arr2= {10,20,10,10,2,3,3,7,2,1,5,7};
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{			int c=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					c++;
					arr2[j]=-1;
				}
			}
			if(c>1)
			{
				sum=sum+arr1[i];
			}
		}
		if(primeno(sum))
		{
			System.out.println(sum+" is  prime no");
		}
		else
		{
			System.out.println(sum+" is Not a prime no");
		}

		
	}

}
