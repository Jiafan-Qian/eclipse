package interfaceexample;

public class Calculator implements MathematicalOperations, GeometricalOperations
{
	@Override
	public void add()
	{
		// TODO Auto-generated method
		
		int a = readValueOfA();
		int b = readValueOfB();
		System.out.println(a+b);
	}
	
	@Override
	public void sub()
	{
		// TODO Auto-generated method
		
		int a = readValueOfA();
		int b = readValueOfB();
		System.out.println(a-b);
	}
	
	@Override
	public void mul()
	{
		// TODO Auto-generated method
		
		int a = readValueOfA();
		int b = readValueOfB();
		System.out.println(a*b);
	}
	
	@Override
	public void div()
	{
		// TODO Auto-generated method
		
		int a = readValueOfA();
		int b = readValueOfB();
		System.out.println(a/b);
	}
	
	@Override
	public void sin()
	{
		// TODO Auto-generated method
		
		int a = readValueOfA();
		int b = readValueOfB();
		System.out.println(Math.sin(a));
	}
}
