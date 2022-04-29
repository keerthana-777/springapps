package com.springapps.springcore.constructorinjection;

public class Address {
	int housenumber;
	String street;
	String city;

	public Address(int hnum, String street, String city) {
		this.housenumber = hnum;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", street=" + street + ", city=" + city + "]";
	}

}
