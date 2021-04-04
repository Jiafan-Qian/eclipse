package abstractclsdemo;

public class Simple 
{
	private int r,s;
	// a normal parameterized constructor
	public Simple(int r, int s)
	{
		this.r = r;
		this.s = s;
		
	}
	
	//copy Constructor 
	
	public Simple(Simple si)
	{
		System.out.println("copy constructor called");
		r = si.r;
		s = si.s;
	}

	@Override
	public String toString() {
		return "Simple [r=" + r + ", s=" + s + "]";
	}
	
	
}
