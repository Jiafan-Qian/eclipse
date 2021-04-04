package com.classboxes.springjavaconfiguration.bean;

public class Country 
{
	private String countryName;
	Capital capital;
	/*
	private String countryCapital;
	
	
	public Country(String countryName, String countryCapital) {
		super();
		this.countryName = countryName;
		this.countryCapital = countryCapital;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	public void countryDetails()
	{
		System.out.println(countryName + " capital is " + countryCapital);
	}
	*/

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	
	
	
}
