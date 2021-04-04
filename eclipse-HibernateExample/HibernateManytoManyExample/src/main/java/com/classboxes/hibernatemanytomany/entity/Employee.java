package com.classboxes.hibernatemanytomany.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	private String employeeName;
	private String department;
	private double salary;
	private Date empJdate; //employee join date
	
	public Employee() {
		super();
	}

	public Employee(String employeeName, String department, double salary, Date empJdate) {
		super();
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
		this.empJdate = empJdate;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getEmpJdate() {
		return empJdate;
	}

	public void setEmpJdate(Date empJdate) {
		this.empJdate = empJdate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", salary=" + salary + ", empJdate=" + empJdate + "]";
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "employee_projects", joinColumns = {@JoinColumn(name = "employeeId")},
														  inverseJoinColumns = {@JoinColumn(name = "projetId")})
	Set<Project> projects = new HashSet<Project>();

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	
}
