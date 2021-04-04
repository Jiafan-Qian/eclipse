package ca.library;

import java.util.ArrayList;
import java.util.Scanner;

import ca.booksdvd.BooksAndDVD;
import ca.computers.Computers;
import ca.patron.Patron;
import ca.room.Room;

public class Library
{
	private int librarianID = 1;
	private String librarianName = "Tina";
	private long librarianContact = 12345678;
	private ArrayList<BooksAndDVD> booksDVDList = new ArrayList<BooksAndDVD>();
	private ArrayList<Patron> registeredPatron = new ArrayList< Patron>();
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private ArrayList<Computers> computers = new ArrayList<Computers>();
	Scanner sc = new Scanner(System.in);
	
	
	public int getLibrarianID() {
		return librarianID;
	}

	public void setLibrarianID(int librarianID) {
		this.librarianID = librarianID;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public long getLibrarianContact() {
		return librarianContact;
	}

	public void setLibrarianContact(long librarianContact) {
		this.librarianContact = librarianContact;
	}

	//initialize all the books and DVDs in the library
	//initialize all the registered patrons map with their library card No.
	public void start()
	{
		//10 books and DVDs
		BooksAndDVD bd1 = new BooksAndDVD(1,"In Search of Lost Time","Marcel Prooust");
		BooksAndDVD bd2 = new BooksAndDVD(2,"Ulysses","James Joyce");
		BooksAndDVD bd3 = new BooksAndDVD(3,"Don Quixote","Miguel de Cervantes");
		BooksAndDVD bd4 = new BooksAndDVD(4,"One Hundred Years of Solitude","Gabriel Garcia Marquez");
		BooksAndDVD bd5 = new BooksAndDVD(5,"The Great Gatsby","F. Scott Fitzgerald");
		BooksAndDVD bd6 = new BooksAndDVD(6,"Mulan","Walt Disney");
		BooksAndDVD bd7 = new BooksAndDVD(7,"Last Christmas","Universal Pictures");
		BooksAndDVD bd8 = new BooksAndDVD(8,"Frozen 2","Walt Disney");
		BooksAndDVD bd9 = new BooksAndDVD(9,"Elf","Warner Home Video");
		BooksAndDVD bd10 = new BooksAndDVD(10,"Finding Jack Charlton","Noah Spirit");
		
		//add into arrayList
		booksDVDList.add(bd1);
		booksDVDList.add(bd2);
		booksDVDList.add(bd3);
		booksDVDList.add(bd4);
		booksDVDList.add(bd5);
		booksDVDList.add(bd6);
		booksDVDList.add(bd7);
		booksDVDList.add(bd8);
		booksDVDList.add(bd9);
		booksDVDList.add(bd10);
		
		
		//5 patrons
		Patron p1 = new Patron(001, "Olivia", "San Francisco, CA", "803-414-3318");
		Patron p2 = new Patron(002, "Liam", "Denver, CO", "303-559-7528");
		Patron p3 = new Patron(003, "Emma", "Rochester, NY", "585-974-5711");
		Patron p4 = new Patron(004, "Noah", "Pawtucket, RI", "401-617-6766");
		Patron p5 = new Patron(005, "Ava", "678-544-5656", "678-544-5656");
		
		//add into arrayList
		registeredPatron.add(p1);
		registeredPatron.add(p2);
		registeredPatron.add(p3);
		registeredPatron.add(p4);
		registeredPatron.add(p5);
		
		//5 rooms
		Room r1 = new Room(1, 1);
		Room r2 = new Room(2, 4);
		Room r3 = new Room(3, 10);
		Room r4 = new Room(4, 2);
		Room r5 = new Room(5, 5);
		
		//add into arrayList
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
		rooms.add(r4);
		rooms.add(r5);
		
		
		//add 3 computers
		Computers c1 = new Computers(1);
		Computers c2 = new Computers(2);
		Computers c3 = new Computers(3);
		
		//add into arrayList
		computers.add(c1);
		computers.add(c2);
		computers.add(c3);
		
	}
	
	//display all the books and DVD in library
	public void displayBooksAndDVDs()
	{
		for(BooksAndDVD bd : booksDVDList)
			System.out.println(bd);
	}
	
	public void issueLibraryCards(int patronID)
	{
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		System.out.println("Enter your contact number");
		String phone = sc.next();
		
		Patron p = new Patron(patronID, name, address, phone);
		
		//add to the registeredList
		registeredPatron.add(p);
		
		System.out.println("library card is issued.");
		
	}
	
	
	public int allocateComputers()
	{
		int i = (int)(Math.random()*3);
		computers.get(i).setAnyActiveSessions(true);
		System.out.println("Computer is allocated. The machineID is " + computers.get(i).getMachineID());
		return computers.get(i).getMachineID();
	}

	public void issueBooksAndDVD(Patron patron, int itemID) 
	{
		// TODO Auto-generated method stub
		
		// find the book that the patron want to borrow
		BooksAndDVD bd = null;
		for (BooksAndDVD b: booksDVDList)
		{
			if (b.getItemID() == itemID)
				bd = b;
		}
		
		// add the book to the patron's borrow list
		patron.getBorrowed().add(bd);
		
		System.out.println("The book is issued. ");
		
	}

	//find the corresponding patron object
	public Patron findPatron(int patronID) 
	{
		// TODO Auto-generated method stub
		for (Patron p : registeredPatron)
		{
			if (p.getPatronID() == patronID)
				return p;
		}
		
		return null; //return null if not found
	}

	public void returnBooksAndDVD(Patron patron, int itemID) 
	{
		// TODO Auto-generated method stub
		
		// find the book that the patron want to borrow
		for (int i=0; i<patron.getBorrowed().size(); i++)
		{
			if (patron.getBorrowed().get(i).getItemID() == itemID)
					patron.getBorrowed().remove(i);
		}
				
		System.out.println("The book is returned. ");
		
	}

	public void reserveRoom(Patron patron) 
	{
		// TODO Auto-generated method stub
		System.out.println("The available rooms are: ");
		for (Room r : rooms)
			System.out.println("RoomID: " + r.getRoomID() + "   Capacity: " + r.getCapacity());
		
		System.out.println("Enter the roomID for the room you want to reserve: ");
		int roomID = sc.nextInt();
		System.out.println("Enter the startTime: ");
		String startTime = sc.next();
		System.out.println("Enter the endTime: ");
		String endTime = sc.next();

		patron.reserveRoom(roomID, startTime, endTime);
	}

	public void deallocateComputer(int machineID) 
	{
		// TODO Auto-generated method stub
		computers.get(machineID).setAnyActiveSessions(false);
		System.out.println("The comuter for machineID " + machineID + " is deallocated.");
		
		
	}

	public void addBooksAndDVDs() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the itemID: ");
		int itemId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the itemName: ");
		String itemName = sc.nextLine();
		
		System.out.println("Enter the author: ");
		String author = sc.nextLine();
		
		BooksAndDVD booksAndDVD = new BooksAndDVD(itemId,itemName,author);
		booksDVDList.add(booksAndDVD);
		
		
	}

	public void removeBooksAndDVDs() {
		// TODO Auto-generated method stub
		System.out.println("Enter the itemId: ");
		int itemID = sc.nextInt();
		
		boolean found = false;
		for (int i = 0; i<booksDVDList.size(); i++)
		{
			if (booksDVDList.get(i).getItemID() == itemID)
			{
				booksDVDList.remove(i);
				found = true;
				System.out.println("item removed");
			}
		}
		if (found == false)
			System.out.println("item not found");
		
	}

	public void updateBooksAndDVDs() {
		// TODO Auto-generated method stub
		System.out.println("Give item information you want to update: ");
		System.out.println("Enter itemID: ");
		int itemId = sc.nextInt();
		sc.nextLine();
		boolean exist = false;
		for (BooksAndDVD bd : booksDVDList)
		{
			if (bd.getItemID() == itemId)
			{
				System.out.println("Give the updated information: ");
				System.out.println("Enter itemName: ");
				String itemName = sc.nextLine();
				System.out.println("Enter author: ");
				String author = sc.nextLine();
				bd.setItemName(itemName);
				bd.setAuthor(author);
				System.out.println("item updated");
				exist = true;
			}
		}
		
		if (exist == false)
			System.out.println("item not found");
	}

	public void displayComputers() {
		// TODO Auto-generated method stub
		System.out.println("the list of computers: ");
		for (int i = 0; i<computers.size();i++)
			System.out.println(computers.get(i));
		
	}

	public void displayRooms() {
		// TODO Auto-generated method stub
		System.out.println("the list of rooms: ");
		for (Room r : rooms)
			System.out.println(r);
	}

	public void displayPatrons() {
		// TODO Auto-generated method stub
		System.out.println("the list of patrons: ");
		for (Patron p : registeredPatron)
			System.out.println(p);
	}

	public void patronRequest() {
		// TODO Auto-generated method stub
		
		int itemID;
		System.out.println("Enter patron's id: ");
		int patronID = sc.nextInt();
		Patron patron = findPatron(patronID);
		if (patron == null)
		{
			System.out.println("Sorry, you are not registered in the library.");
			System.out.println("Do you want to issue a library card? (y/n)");
			char answer = sc.next().toLowerCase().charAt(0);
			if (answer == 'y')
			{
				issueLibraryCards(patronID);
				patron = findPatron(patronID);
			}
		}
		else
		{
			System.out.println("Enter the patron's choice: ");
			System.out.println("1. issue/borrow Books & DVDs");
			System.out.println("2. return Books & DVDs");
			System.out.println("3. Display borrowed books & DVDs list");
			System.out.println("4. Personal Information");
			System.out.println("5. Reserve a room");
			System.out.println("6. Check the reserved room");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the itemID: ");
				itemID = sc.nextInt();
				issueBooksAndDVD(patron,itemID);
				break;
			case 2:
				System.out.println("Enter the itemID: ");
				itemID = sc.nextInt();
				returnBooksAndDVD(patron,itemID);
				break;
			case 3:
				patron.displayBorrowedList();
				break;
			case 4:
				System.out.println(patron.toString());
				break;
			case 5:
				System.out.println("Enter the roomID:");
				int rI = sc.nextInt();
				System.out.println("Enter the start time:");
				String sT = sc.next();
				System.out.println("Enter the end time: ");
				String eT = sc.next();
				patron.reserveRoom(rI, sT, eT);
				break;
			case 6:
				patron.displayReservedRoom();
				break;
			}
		}
		
		
	}
	
	
}
