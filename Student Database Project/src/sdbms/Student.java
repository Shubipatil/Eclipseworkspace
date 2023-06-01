package sdbms;
//Bean Class
public class Student {

	private  String id;
	private int age;
	private String name;
	private int marks;
	private static int count=101;

	public Student(int age,String name,int marks)
	{
		this.id="JSP"+count;
		count++;
		this.age=age;
		this.name=name;
		this.marks=marks;
		
	}


	public String getId()
	{
		return id;
	}
	
	
	
	public void setAge(int age)
	{
		this.age=age;
	}

	public int getAge()
	{
		return age;
	}


	public void setName(String name)
	{
		this.name=name;
	}

	
	public String getName()
	{
		return name;
	}
	

	public void setMarks(int marks)
	{
		this.marks=marks;
	}

	public int getMarks()
	{
		return marks;
	}

	public String toString()
	{
		return "Id:"+id+ " Age:"+age +" Name:"+name+" Marks:"+marks;
	}

}
