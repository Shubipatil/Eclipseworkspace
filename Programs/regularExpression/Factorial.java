package regularExpression;

public class Factorial {
	static int n1=0,n2=1,n3;
	static void fibno(int n)
	{
		
		if(n1>=0)
		{
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;			
			fibno(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		fibno(10);
	System.out.println("End");

	}

}
