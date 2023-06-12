package regularExpression;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//op=2,3,6,7
		int [] a= {1,2,3,4,5};
		int [] b= {1,4,6,7,5};
		
		//		for(int ele:a)
		//		{
		//			boolean flag = false;
		//			for(int i=0;i<b.length;i++)
		//			{
		//				if(b[i]==ele)
		//				{
		//					
		//					flag=true;
		//					//break;
		//				}
		//				
		//			}
		//			if(flag==false)
		//			{
		//				System.out.print(ele+" ");
		//			}
		//			
		//		}
		//		
		//		for(int ele:b)
		//		{
		//			boolean flag = false;
		//			for(int i=0;i<a.length;i++)
		//			{
		//				if(a[i]==ele)
		//				{
		//					flag=true;
		//				}
		//				
		//			}
		//			if(flag==false)
		//			{
		//				System.out.print(ele+" ");
		//			}
		//			
		//		}
		//		
		//		
		//		
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					b[j]='\0';
					c++;
				}
				if(c==1)
				{
					a[i]='\0';
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='\0')
			{
				System.out.println(a[i]);
			}
		}

		for(int i=0;i<b.length;i++)
		{
			if(b[i]!='\0')
			{
				System.out.println(b[i]);
			}
		}



	}}
