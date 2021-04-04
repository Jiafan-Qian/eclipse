package ca.room;


public class Room
{
	private int roomID;
	private int capacity;
	
	public Room() {
		super();
	}

	public Room(int roomID, int capacity) {
		super();
		this.roomID = roomID;
		this.capacity = capacity;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + roomID;
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
		Room other = (Room) obj;
		if (capacity != other.capacity)
			return false;
		if (roomID != other.roomID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", capacity=" + capacity + "]";
	}
	
	
	
}
