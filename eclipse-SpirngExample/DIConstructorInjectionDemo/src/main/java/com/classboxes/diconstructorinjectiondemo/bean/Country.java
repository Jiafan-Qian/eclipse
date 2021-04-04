package com.classboxes.diconstructorinjectiondemo.bean;

public class Country 
{

	private String countryName;
	//Capital capital;
	
	/*
	public Country(String countryName, Capital capital) {
		super();
		this.countryName = countryName;
		this.capital = capital;
	}
	*/
	public String getCountryName() {
		return countryName;
	}
	
	/*
	public Capital getCapital() {
		return capital;
	}
	*/
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/*
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	*/
	
	
}
