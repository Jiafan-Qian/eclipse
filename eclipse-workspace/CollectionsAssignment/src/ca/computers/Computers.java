package ca.computers;


public class Computers
{
	private int machineID;
	private boolean anyActiveSessions = false;
	
	
	
	public Computers(int machineID) {
		super();
		this.machineID = machineID;
	}



	public int getMachineID() {
		return machineID;
	}



	public void setMachineID(int machineID) {
		this.machineID = machineID;
	}



	public boolean isAnyActiveSessions() {
		return anyActiveSessions;
	}



	public void setAnyActiveSessions(boolean anyActiveSessions) {
		this.anyActiveSessions = anyActiveSessions;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (anyActiveSessions ? 1231 : 1237);
		result = prime * result + machineID;
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
		Computers other = (Computers) obj;
		if (anyActiveSessions != other.anyActiveSessions)
			return false;
		if (machineID != other.machineID)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Computers [machineID=" + machineID + ", anyActiveSessions=" + anyActiveSessions + "]";
	}

	
	

}
