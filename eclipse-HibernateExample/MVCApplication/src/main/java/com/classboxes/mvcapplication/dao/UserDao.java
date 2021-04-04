package com.classboxes.mvcapplication.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.classboxes.mvcapplication.entity.User;
import com.classboxes.mvcapplication.util.HibernateUtility;

public class UserDao 
{
	
	public void saveUser(User user)
	{
		Transaction transaction = null;
		
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			//start the transaction
			transaction = session.beginTransaction();
			
			//save the instructor object
			session.save(user);
			
			//commit transaction
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}

	} //close saveUser
	
;	public User updateUser(User user)
	{
		Transaction transaction = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			//start the transaction
			transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		
		return user;
	}//close of updateUser
	
	public void deleteUser(int id)
	{
		Transaction transaction = null;
		User user = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			user = session.get(User.class, id);
			if (user != null)
			{
				session.delete(user);
				System.out.println("User deleted");
			}
			transaction.commit();
					
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}//deleteUser close
	
	public User getUser(int id)
	{
		Transaction transaction = null;
		User user = null; //instructor reference variable
		
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			user = session.get(User.class, id);
			transaction.commit();
			
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		
		return user;
		
	}//getUser close
	
	//getallUser method to list all the user in the database
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUser()
	{
		Transaction transaction = null;
		List<User> listOfUser = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			//start a transaction
			transaction = session.beginTransaction();
			
			//get a list of user object
			listOfUser = session.createCriteria(User.class).list();
			
			//commit transaction
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		
		return listOfUser;
	}
	
	//check whether the user's email and password matches the record
	public User checkUser(String email, String password)
	{
		Transaction transaction = null;
		User user = null;
		try(Session session = HibernateUtility.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			//get an user object
			user = (User) session.createQuery("FROM User U where U.email = :email").setParameter("email", email).uniqueResult();
			if ((user!=null) && (user.getPassword().equals(password)))
				return user;
			transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
		return null;
	}
}
