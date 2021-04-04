package com.classboxes.springjavaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classboxes.springjavaconfiguration.bean.Capital;
import com.classboxes.springjavaconfiguration.bean.Country;
import com.classboxes.springjavaconfiguration.config.ApplicationConfiguration;

public class SpringJavaConfigurationMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Country contObj = (Country) appContext.getBean("countryObject");
		//contObj.countryDetails();
		
		String countryName = contObj.getCountryName();
		
		Capital capitalObj = (Capital) appContext.getBean("capitalObject");
		//String capitalName = contObj.getCapital().getCapitalName();
		String capitalName = capitalObj.getCapitalName();
		System.out.println(capitalName + " is capital of " + countryName);
		

	}

}
