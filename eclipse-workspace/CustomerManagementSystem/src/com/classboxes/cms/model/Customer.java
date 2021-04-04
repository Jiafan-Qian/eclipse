package com.classboxes.cms.model;

//bean class or pojo class
public class Customer 
{
	private int custId;
	private String custName;
	private int phoneNo;
	private String location;
	
	
	
	public Customer(int custId, String custName, int phoneNo, String location) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.location = location;
	}
	public Customer() {
		super();
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + phoneNo;
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
		Customer other = (Customer) obj;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", phoneNo=" + phoneNo + ", location="
				+ location + "]";
	}
	
	
	
}
