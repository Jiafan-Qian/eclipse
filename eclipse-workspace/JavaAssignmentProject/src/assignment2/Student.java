package assignment2;

//subclass
public class Student extends Person
{
	// instance variables
	int numCourses = 0;
	String[] courses = {};
	int[] grades = {};
	
	// methods
    Student(String n, String addr)
	{
    	super(n, addr);
	}
    
    public void addCourseGrade(String course, int grade)
    {
    	numCourses++;
    	String[] newCourses = new String[numCourses];
    	int[] newGrades = new int[numCourses];
    	
    	for (int i = 0; i<courses.length;i++)
    	{
    		newCourses[i] = courses[i];
    		newGrades[i] = grades[i];
    	}
    	
    	newCourses[numCourses-1] = course;
    	newGrades[numCourses-1] = grade;
    	
    	courses = newCourses;
    	grades = newGrades;
    }
    
    public void printGrades()
    {
    	for (int i = 0; i<grades.length;i++)
    	{
    		System.out.println(grades[i]);
    	}
    }
    
    public double getAverageGrade()
    {
    	double sum = 0;
    	for (int i = 0; i<grades.length;i++)
    	{
    		sum += grades[i];
    	}
    	
    	return (sum/grades.length);
    }
    
    public String toString()
    {
    	return ("Student: " + name + "(" + address + ")");
    }
}