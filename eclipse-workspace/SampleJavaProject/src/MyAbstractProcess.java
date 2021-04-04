
public abstract class MyAbstractProcess 
{
	MyAbstractProcess()
	{
		System.out.println("abstract class constructor");
	}
	
	public void process()
	{
		
	}
	
	public void stepBefore()
	{
		//implemented by abstract class
	}
	
	public abstract void action(); //implemented by subclass
	
	public void stepAfter()
	{
		//implemented by abstract class
	}
}
