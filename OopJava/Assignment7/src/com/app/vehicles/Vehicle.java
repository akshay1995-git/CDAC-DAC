package com.app.vehicles;

//import com.app.core.Vehicle;

public class Vehicle {

	private String regNo;
	private String color;
	private double price;

	public Vehicle(String regNo, String color, double price) {
		this.regNo = regNo;
		this.color = color;
		this.price = price;
	}

	public String toSting() {
		return "Reg No : " + this.regNo + " Color : " + this.color + " Price : " + this.price;
	}

	@Override
	public boolean equals(Object anotherVehicle) {
		System.out.println("in vehicle's eq");
		if (anotherVehicle instanceof Vehicle)
			return regNo.equals(((Vehicle) anotherVehicle).regNo);// ClasscastExc : string --->X --> Vehicle
		return false;
	}
}
