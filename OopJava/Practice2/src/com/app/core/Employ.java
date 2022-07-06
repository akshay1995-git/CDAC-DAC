package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employ implements Comparable<Employ> {
	private String id;
	private String name;
	private Date dob;
	private Date hiredate;
	private double salary;
	private String dept;

	public static SimpleDateFormat sdf;

	static  {
		 sdf=new SimpleDateFormat("dd-MM-yyyy");
	}

	public Employ(String id, String name, Date dob, Date hiredate, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.hiredate = hiredate;
		this.salary = salary;
		this.dept = dept;
	}

	public Employ(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employ) {
			return this.id.equals(((Employ)obj).id);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employ [ID=" + id + ",name=" + name + ", dob=" + sdf.format(dob) + ", hiredate=" + sdf.format(hiredate)
				+ ", salary=" + salary + ", dept=" + dept + "]";
	}


	@Override
	public int compareTo(Employ o) {

		if (hiredate.before(o.hiredate)) {
			return -1;
		} else if (hiredate.after(o.hiredate)) {
			return 1;
		} else {
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	

	public Date getDob() {
		return dob;
	}



}
