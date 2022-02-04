package com.vehicledekho.data;

public abstract class Vehicle {
	private String model;
	private String type;
	private int price;
	private int mileage;
	
	public int getmileage() {
		return mileage;
	}
	public void setmileage(int mileage) {
		this.mileage = mileage;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
}
	
	

