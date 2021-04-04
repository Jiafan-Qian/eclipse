package wrapperclassdemo;

public class AutoBoxing 
{
	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		int j = 20;
		Integer i = new Integer(30);
		System.out.println(i.intValue());
		
		Float f = new Float(j);
		System.out.println(f.floatValue());
		
		Character ch = new Character('c');
		System.out.println(ch.charValue());
	}
}
