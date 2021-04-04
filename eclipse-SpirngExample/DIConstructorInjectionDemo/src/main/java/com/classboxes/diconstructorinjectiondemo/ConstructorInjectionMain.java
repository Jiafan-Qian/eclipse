package com.classboxes.diconstructorinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classboxes.diconstructorinjectiondemo.bean.Country;

public class ConstructorInjectionMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Country cObj = (Country) appContext.getBean("CountryBean");
		cObj.setCountryName("USA");
		String countryName = cObj.getCountryName();
		//String capitalName = cObj.getCapital().getCapitalName();
		//System.out.println(capitalName + " is capital of " + countryName);
		System.out.println("Country Name: " + cObj.getCountryName());
		
		//get bean method will be called second time
		Country cObj1 = (Country) appContext.getBean("CountryBean");
		System.out.println("Country Name: " + cObj1.getCountryName());

	}

}
