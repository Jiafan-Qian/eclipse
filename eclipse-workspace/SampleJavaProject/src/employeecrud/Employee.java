package employeecrud;

import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private float empSalary;
	private int experience;
	
	
	
	public Employee(int empId, String empName, float empSalary, int experience) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.experience = experience;
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


	public float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + Float.floatToIntBits(empSalary);
		result = prime * result + experience;
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
		if (Float.floatToIntBits(empSalary) != Float.floatToIntBits(other.empSalary))
			return false;
		if (experience != other.experience)
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", experience="
				+ experience + "]";
	}


	@Override
	public int compareTo(Employee emp)
	{
		return empName.compareTo(emp.getEmpName());
	}

	
	
}
