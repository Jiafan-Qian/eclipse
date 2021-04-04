package javaioexample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class JavaFileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileInputStream fileInput = new FileInputStream("textnote.txt");
			int i = 0;
			System.out.println("Using fileInputStream");
			while((i = fileInput.read()) != -1)
			//int i = fileInput.read();
				System.out.print((char)i);
			fileInput.close();
			
			
			FileInputStream fileInput1 = new FileInputStream("textnote.txt");
			BufferedInputStream bInput = new BufferedInputStream(fileInput1);
			i = 0;
			System.out.println("Using bufferedInputStream");
			while((i = bInput.read()) != -1)
			//int i = fileInput.read();
				System.out.print((char)i);
			fileInput1.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
