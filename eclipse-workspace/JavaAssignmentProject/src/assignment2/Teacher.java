package assignment2;

//sub class
public class Teacher extends Person
{
	//instance variables
	int numCourses = 0;
	String[] courses = {};

	//methods
	Teacher(String n, String addr)
	{
		super(n,addr);
	}
	
	public boolean addCourse(String course)
	{
		for(int i = 0; i<courses.length;i++)
		{
			if (courses[i] == course)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	public boolean removeCourse(String course)
	{
		for (int i = 0; i<courses.length; i++)
		{
			if (courses[i] == course)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		return ("Teacher: " + name + "(" + address + ")");
	}
	
	
}
