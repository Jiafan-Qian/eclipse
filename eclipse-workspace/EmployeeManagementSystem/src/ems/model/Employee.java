package ems.model;

public class Employee 
{
	private int empId;
	private String empName;
	private long phoneNo;
	private String location;
	private double salary;
	
	public Employee(int empId, String empName, int phoneNo, String location, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phoneNo = phoneNo;
		this.location = location;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phone) {
		this.phoneNo = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneNo=" + phoneNo + ", location=" + location
				+ ", salary=" + salary + "]";
	}

	
	
	

}
