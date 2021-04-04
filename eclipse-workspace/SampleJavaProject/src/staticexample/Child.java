package staticexample;

public class Child extends Parent
{
	public static void display()
	{
		System.out.println("overriden static method");
	}
	
	public void display1()
	{
		System.out.println("non static methods are overriden");
	}
}
