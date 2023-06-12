package com;

public class BracketBalance {
	static char[] stack;
	static int top=-1;
	
	public static void push()
	{
		top++;
		stack[top]='(';
	}
	
	static void pop()
	{
		top--;
	}
	
	public static void main(String[] args) {

		String s=")((()(";
		 stack= new char[s.length()-1];
		if(s.length()%2!=0 && s.charAt(0)==')') 
		{
			System.out.println("Unbalanced-->");
		}
		else
		{
			boolean flag=true;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(')
				{
					push();
				}
				else if(top!=-1)
				{
					pop();
				}
				else
				{
					flag=false;
					break;
				}
			}
			if(top==-1 && flag==true)
			{
				System.out.println("Balanced");
			}
			else
			{
				System.out.println("Unbalanced");
			}
			
		}
/*
			boolean flag=true;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(')
				{
					push();
				}
				else if(s.charAt(i)==')' && top!=-1)
				{
					pop();
				}
				else
				{
					flag=false;
					break;
				}

			*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
