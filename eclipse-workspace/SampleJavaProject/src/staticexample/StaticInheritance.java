package staticexample;

public class StaticInheritance {
	
	public static void main(String[] a)
	{
		Parent p = new Child();
		System.out.println(p instanceof Parent);
		p.display();
		p.display1();
	}

}
