package com.CollectionMap.Country;

/*
Program :- Pojo Class of Country 
@Author :- Abhishek Sharma
Date :-25/10/2022
*/
public class CountryInformation {

	private String countryName;
	private int countryCode;
	private String capital;

	public CountryInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryInformation(String countryName, int countryCode, String capital) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.capital = capital;
	}

	public String getcountryName() {
		return countryName;
	}

	public void setcountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getcountryCode() {
		return countryCode;
	}

	public void setcountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCode=" + countryCode + ", capital=" + capital + "]";
	}

}
