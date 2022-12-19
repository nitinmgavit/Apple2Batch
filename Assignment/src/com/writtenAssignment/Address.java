package com.writtenAssignment;

  // by using getter setter

public class Address {

	private String city, state, country;
	private Person per;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Address: \nCity = " + city + "\nState = " + state + "\nCountry = " + country + "\nPer = " + per;
	}

}
