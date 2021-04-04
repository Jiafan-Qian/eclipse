package ca;

import java.util.Scanner;

import ca.library.Library;
import ca.patron.Patron;

public class CollectionsAssignment 
{
	public static void main(String[] args)
	{
		// create the library
		Library library = new Library();
		library.start();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the library, librarian " + library.getLibrarianName());
		System.out.println("Your login id is: " + library.getLibrarianID());
		System.out.println("Allocate a computer for you...");
		int machineID = library.allocateComputers();
		char ch = 'y';
		while (ch == 'y')
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. Display books & DVDs in library");
			System.out.println("2. Add books & DVDs");
			System.out.println("3. Remove books & DVDs");
			System.out.println("4. Update books & DVDs");
			System.out.println("5. Display Computer list");
			System.out.println("6. Display Room list");
			System.out.println("7. Display Patron list");
			System.out.println("8. Patron's request");
			System.out.println("9. Exit");
			
			int choice = sc.nextInt();
			if (choice == 9)
				break;
			
			switch(choice)
			{
			case 1:
				library.displayBooksAndDVDs();
				break;
			case 2:
				library.addBooksAndDVDs();
				break;
			case 3:
				library.removeBooksAndDVDs();
				break;
			case 4:
				library.updateBooksAndDVDs();
				break;
			case 5:
				library.displayComputers();
				break;
			case 6:
				library.displayRooms();
				break;
			case 7:
				library.displayPatrons();
				break;
			case 8:
				library.patronRequest();
				break;
			default:
				System.out.println("Please enter a number between 1 and 8");
				break;
			}
			
			System.out.println("Do you want to continue? (y/n)");
			ch = sc.next().toLowerCase().charAt(0);
		}
		
		System.out.println("Exit.");
		
		System.out.println("Deallocate computer...");
		library.deallocateComputer(machineID);
		
		
		
	}
}
