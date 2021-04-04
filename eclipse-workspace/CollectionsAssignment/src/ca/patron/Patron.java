package ca.patron;

import java.util.ArrayList;

import ca.booksdvd.BooksAndDVD;
import ca.roomreservation.RoomReservation;

public class Patron 
{
	private int patronID;
	private String userName;
	private String address;
	private String contactNo;
	private ArrayList<BooksAndDVD> borrowed = new ArrayList<BooksAndDVD>();
	private RoomReservation rr = null;
	
	public Patron(int patronID, String userName, String address, String contactNo) {
		super();
		this.patronID = patronID;
		this.userName = userName;
		this.address = address;
		this.contactNo = contactNo;
	}

	public Patron() {
		super();
	}

	public int getPatronID() {
		return patronID;
	}

	public void setPatronID(int patronID) {
		this.patronID = patronID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	
	public RoomReservation getRr() {
		return rr;
	}

	public void setRr(RoomReservation rr) {
		this.rr = rr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + patronID;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patron other = (Patron) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (patronID != other.patronID)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patron [patronID=" + patronID + ", userName=" + userName + ", address=" + address + ", contactNo="
				+ contactNo + "]";
	}

	public void displayBorrowedList() 
	{
		// TODO Auto-generated method stub
		System.out.println("The borrowed book list is: ");
		
		for (BooksAndDVD bd : getBorrowed())
			System.out.println(bd);
		
	}

	public void reserveRoom(int rI, String sT, String eT) 
	{
		// TODO Auto-generated method stub
		
		rr = new RoomReservation();
		int reservationID = (int)(Math.random() * 100);
		rr.setReservationID(reservationID);
		rr.setRoomID(rI);
		rr.setStartTime(sT);
		rr.setEndTime(eT);
		rr.setPatronID(patronID);;
		
		System.out.println("The room is reserved.");
		
	}

	public void displayReservedRoom() 
	{
		// TODO Auto-generated method stub
		if (rr == null)
			System.out.println("you don't have any reserved room.");
		else
		{
			System.out.println("Your reserved room information: ");
			System.out.println("reservationID: " + rr.getReservationID());
			System.out.println("roomID: " + rr.getRoomID());
			System.out.println("start time: " + rr.getStartTime());
			System.out.println("end time: " + rr.getEndTime());
			
		}
		
	}

	public ArrayList<BooksAndDVD> getBorrowed() {
		return borrowed;
	}


	
	
	
	
	
	

}
