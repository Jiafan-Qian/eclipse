package javaioexample;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fileOut = null;
		BufferedOutputStream bout = null;
		
		try {
			
			DataInputStream dis = new DataInputStream(System.in);
			fileOut = new FileOutputStream("textnote.txt", true);
			//fileOut.write(65);
			//fileOut.close();
			//System.out.println(fileOut);
			bout = new BufferedOutputStream(fileOut,1024);
			//System.out.println("success...");
			System.out.println("Enter text(@ at the end): ");
			char ch;
			while ((ch=(char)dis.read()) != '@')
				//bout.write(ch)
				fileOut.write(ch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
		}
		

	}

}
