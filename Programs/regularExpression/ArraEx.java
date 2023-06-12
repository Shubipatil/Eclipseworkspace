package regularExpression;

public class ArraEx {

	public static void main(String[] args) {
		
		int[] arr1= {3,2,7,1,8};
		int[] arr2= {15,16,10,3,22};
		int c=0;
		
		
		for(int i=1;;i++)
		{
			boolean flag=false;
		for(int j=0;j<arr1.length;j++)
		{			
			if(arr2[j] > arr1[j])
			{
				arr2[j]=arr2[j]-arr1[j];
				System.out.print(arr2[j]+" ");
				flag=true;				
			}
			
		}
		System.out.println();
		   c++;
			if(flag==false)
			{
				break;
			}
			
		}
		
		System.out.println("count"+c);

	}

}
