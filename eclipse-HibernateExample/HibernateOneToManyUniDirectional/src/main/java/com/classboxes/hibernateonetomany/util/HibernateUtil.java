package com.classboxes.hibernateonetomany.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	
	private static StandardServiceRegistry registry;
	//the above line registers the services like connection pool and transaction management for the application
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		try
		{
			if (sessionFactory == null)
			{
				//create registry
				registry = new StandardServiceRegistryBuilder().configure().build();
				
				//Create MetadataSources
				MetadataSources sources  = new MetadataSources(registry);
				
				//create MetaData
				Metadata metadata = sources.getMetadataBuilder().build();
				
				//creating SessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if (registry!= null)
				StandardServiceRegistryBuilder.destroy(registry);
		}
		
		return sessionFactory;
		
		
			
	}//method getSessionFactory closed
	
	public static void shutdown()
	{
		if (registry!=null)
			StandardServiceRegistryBuilder.destroy(registry);
	}
}

