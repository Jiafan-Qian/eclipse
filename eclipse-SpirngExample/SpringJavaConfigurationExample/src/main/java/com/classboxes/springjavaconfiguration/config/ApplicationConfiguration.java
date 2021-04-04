package com.classboxes.springjavaconfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.classboxes.springjavaconfiguration.bean.Capital;
import com.classboxes.springjavaconfiguration.bean.Country;

@Configuration
public class ApplicationConfiguration {

	@Bean(name = "countryObject")
	public Country getCountry()
	{
		return new Country("UK");
	}
	
	@Bean(name = "capitalObject")
	public Capital getCapital()
	{
		return new Capital("London");
	}
}
