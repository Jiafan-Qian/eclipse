package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadExample {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		fis = new FileInputStream("d:/myfile.txt");
	}

}
