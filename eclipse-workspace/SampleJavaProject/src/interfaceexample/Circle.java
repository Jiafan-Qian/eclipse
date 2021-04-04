package interfaceexample;


public class Circle implements Shape
{
	public void area()
	{
		int r = readValueOfRadius();
		System.out.println(Math.PI*Math.pow(r,2));
		
	}
	
	public void perimeter()
	{
		int r = readValueOfRadius();
		System.out.println(2*Math.PI*r);
	}
	
	

}
