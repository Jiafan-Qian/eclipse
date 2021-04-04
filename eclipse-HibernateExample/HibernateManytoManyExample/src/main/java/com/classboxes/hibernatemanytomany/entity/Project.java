package com.classboxes.hibernatemanytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {
	
	@Id
	@GeneratedValue
	private Long projctId;
	private String projectName;
	
	@ManyToMany(mappedBy = "projects",cascade = {CascadeType.ALL})
	private Set<Employee> employees = new HashSet<Employee>();

	public Project() {
		super();
	}

	public Project(Long projctId, String projectName, Set<Employee> employees) {
		super();
		this.projctId = projctId;
		this.projectName = projectName;
		this.employees = employees;
	}

	public Long getProjctId() {
		return projctId;
	}

	public void setProjctId(Long projctId) {
		this.projctId = projctId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	

}
