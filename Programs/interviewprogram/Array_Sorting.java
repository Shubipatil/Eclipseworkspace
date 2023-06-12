package interviewprogram;

public class Array_Sorting {

	public static void main(String[] args) {
		
		String s="helloiyswajkh";
		char [] arr1=s.toCharArray();
		//int [] arr= {10,6,8,6,38,56,12,};		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					char temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;								
				}
			}
			
		}
		for(char ele:arr1)
		{
			System.out.print(ele+" ");
		}
	}

}
