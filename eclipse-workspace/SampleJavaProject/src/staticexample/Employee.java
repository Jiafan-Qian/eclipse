package staticexample;

public class Employee 
{
	static
	{
		System.out.println("This is the static block");
	}
	Employee()
	{
		System.out.println("constructor of employee");
	}
	int eid;
	String ename;
	static String companyName = "Microsoft";
	
	public void display()
	{
		System.out.println("emp details");
		System.out.println("hashcode of companyName " + companyName.hashCode());
	}
	
	static public void calculateSalary()
	{
		System.out.println("common method for calculating the salary of employees");
	}
}
