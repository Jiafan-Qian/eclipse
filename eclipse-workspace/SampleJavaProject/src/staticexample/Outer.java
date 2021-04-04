package staticexample;

public class Outer 
{
	private static int value = 45;
	//private datamembers can be used by creating nested class
	public static class Inner
	{
		public void display()
		{
			System.out.println(value);
		}
	}
}
