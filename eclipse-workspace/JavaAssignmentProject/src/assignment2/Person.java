package assignment2;

//super class
public class Person 
{
	// instance variables
	String name;
	String address;
	
	//methods
	
	Person(String n, String addr)
	{
		this.name = n;
		this.address = addr;
	}
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String addr)
	{
		address = addr;
	}
	
	public String toStrng()
	{
		return (name + "(" + address + ")");
	}
}
