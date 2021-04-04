package exceptionhandling;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//nested try
		try 
		{
			int result = 100/0; //runtime
			
			try
			{
				String s = null;
				System.out.println(s);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			String s = null;
			System.out.println(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			char[] ch = new char[3];
			System.out.println(ch[3]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a value");
		try
		{
			String str = br.readLine();
			int result = 100/0;
			String s = null;
			System.out.println(s.charAt(0));
		}
		catch(IOException | ArithmeticException e)
		{
			//e.printStackTrace();
			e.getMessage();
			
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block gets executed if exception or not exception");
		}
		
		
		System.out.println("rest of the program");
		

	}

}
