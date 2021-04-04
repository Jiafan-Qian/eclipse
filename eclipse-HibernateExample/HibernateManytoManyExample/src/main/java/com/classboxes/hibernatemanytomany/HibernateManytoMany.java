package com.classboxes.hibernatemanytomany;

import org.hibernate.Session;

//import com.classboxes.hibernatemanytomany.dao.EmployeeDao;
import com.classboxes.hibernatemanytomany.entity.Employee;
import com.classboxes.hibernatemanytomany.entity.Project;
import com.classboxes.hibernatemanytomany.util.HibernateUtility;

public class HibernateManytoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		
		//create an employee
		Employee employee = new Employee();
		employee.setEmployeeName("tina");
		employee.setDepartment("IT");
		employee.setSalary(350000);
		//employee.setEmpJdate(empJdate);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("tuna");
		employee1.setDepartment("Math");
		employee1.setSalary(300000);
		
		//create a project
		Project project = new Project();
		project.setProjectName("Customer Management System");
		
		Project project1 = new Project();
		project1.setProjectName("Canteen Management System");
		
		//adding projects to employee
		employee.getProjects().add(project);
		employee.getProjects().add(project1);
		employee1.getProjects().add(project);
		employee1.getProjects().add(project1);
		
		//adding employee references tp the project
		project.getEmployees().add(employee);
		project.getEmployees().add(employee1);
		project1.getEmployees().add(employee);
		project1.getEmployees().add(employee1);
		
		//EmployeeDao edao = new EmployeeDao();
		//edao.saveEmployee(employee);
		
		session.save(employee);
		//session.save(employee1);
		
		session.getTransaction().commit();
		
	}

}
