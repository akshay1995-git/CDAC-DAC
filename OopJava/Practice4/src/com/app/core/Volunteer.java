package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
//Write a program to read binary file of volunteers atleast 10.
public class Volunteer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8162788715152258297L;
	/* volunteerId:int,
               vName:String,
               Hobbies:List<String>
               isAvailable:boolean
               DOB:Date or LocalDate*/
	private int volunteerId;
	private String vNAme;
	private boolean isAvailable; 
	private LocalDate date;
	private ArrayList<Hobbies> hobbies;
	private static int counter;
	static {
		counter =1;
	}
	public Volunteer(ArrayList<Hobbies> hobbies) {
		super();
		this.hobbies = hobbies;
	}
	public Volunteer(String vNAme, LocalDate date, ArrayList<Hobbies> hobbies) {
		super();
		this.volunteerId = counter++;
		this.vNAme = vNAme;
		this.isAvailable = isAvailable;
		this.date = date;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Volunteer [vNAme=" + vNAme + ", isAvailable=" + isAvailable + ", date=" + date + ", hobbies=" + hobbies
				+ "]";
	}
	public int getVolunteerId() {
		return volunteerId;
	}
	public String getvNAme() {
		return vNAme;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public LocalDate getDate() {
		return date;
	}
	public ArrayList<Hobbies> getHobbies() {
		return hobbies;
	}
	public void setVolunteerId(int volunteerId) {
		this.volunteerId = volunteerId;
	}
	public void setvNAme(String vNAme) {
		this.vNAme = vNAme;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setHobbies(ArrayList<Hobbies> hobbies) {
		this.hobbies = hobbies;
	}

	
}
