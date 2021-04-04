package com.classboxes.hibernateonetomany.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.classboxes.hibernateonetomany.entity.Course;
import com.classboxes.hibernateonetomany.entity.Instructor;

public class HibernateUtility {

	public static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if (sessionFactory == null)
		{
			try
			{
				Configuration configuration = new Configuration();
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/practice");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "Qjf33161136!");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Instructor.class);
				configuration.addAnnotatedClass(Course.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java Config ServiceRegistry created");
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
