package com.vehicledekho.data;

public class Bike extends Vehicle {
	int power;
	String numberofGears;
	String brakes;
	
	public String getBrakes() {
		return brakes;
	}
	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}
	public int getpower() {
		return power;
	}
	public void setpower(int power) {
		this.power = power;
	}
	public String getnumberOfGears() {
		return numberofGears;
	}
	public void setnumberOfGears(String numberofgears) {
		this.numberofGears = numberofgears;
	}
	
	}

