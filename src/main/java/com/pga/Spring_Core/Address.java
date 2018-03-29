package com.pga.Spring_Core;

public class Address {
	private String city;
	private String area;
	private int pincode;

	public Address() {}
	public Address(String city, String area, int pincode) {
		this.city = city;
		this.area = area;
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + ", pincode=" + pincode + "]";
	}
}
