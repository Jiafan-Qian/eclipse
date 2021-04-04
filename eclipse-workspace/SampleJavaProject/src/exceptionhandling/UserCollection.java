package exceptionhandling;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCollection
{
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> userNames = new ArrayList<String>();
	public void addUserNames()
	{
		userNames.add("Tina");
		userNames.add("Tinu");
		userNames.add("Tinku");
		userNames.add("Tania");
	}
	
	public void searchUser()
	{
		boolean found = false;
		System.out.println("Enter the name of the user to search");
		String searchUserName = sc.next();
		for (String name: userNames)
		{
			if (name.equalsIgnoreCase(searchUserName))
			{
				System.out.println("user found");
				found = true;
			}
		}
		
		if (found == false)
		{
			try
			{
				throw new UserNotFoundException("user does not exist");
			}
			catch(UserNotFoundException e)
			{
				e.printStackTrace();
			}
		}
	}

}
