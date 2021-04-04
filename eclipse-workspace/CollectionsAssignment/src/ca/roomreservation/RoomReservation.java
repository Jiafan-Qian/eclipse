package ca.roomreservation;

public class RoomReservation
{
	private int reservationID;
	private int roomID;
	private String startTime;
	private String endTime;
	private int patronID;
	
	public int getReservationID() {
		return reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getPatronID() {
		return patronID;
	}
	public void setPatronID(int patronID) {
		this.patronID = patronID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + patronID;
		result = prime * result + reservationID;
		result = prime * result + roomID;
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		RoomReservation other = (RoomReservation) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (patronID != other.patronID)
			return false;
		if (reservationID != other.reservationID)
			return false;
		if (roomID != other.roomID)
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RoomReservation [reservationID=" + reservationID + ", roomID=" + roomID + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", patronID=" + patronID + "]";
	}
	
	
	
	
	
	
	
}
