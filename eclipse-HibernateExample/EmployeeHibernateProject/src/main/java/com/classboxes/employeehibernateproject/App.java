package com.classboxes.employeehibernateproject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.employeehibernateproject.entity.Employee;
import com.classboxes.employeehibernateproject.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee("Tina", 20, 10000.23f);
        Employee employee1 = new Employee("Tuna",22, 23456.78f);
        
        Transaction transaction = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
        	transaction = session.beginTransaction();
        	session.save(employee);
        	session.save(employee1);
        	transaction.commit();
        }
        catch(Exception e)
        {
        	if (transaction!= null)
        		transaction.rollback();
        	e.printStackTrace();
        }
        
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
        	List<Employee> employees = session.createQuery("from Employee",Employee.class).list();
        	
        	employees.forEach(emp -> System.out.println(emp.getName()));
        }
        catch(Exception e)
        {
        	if (transaction != null)
        		transaction.rollback();
        	e.printStackTrace();
        }
    }
    
}
