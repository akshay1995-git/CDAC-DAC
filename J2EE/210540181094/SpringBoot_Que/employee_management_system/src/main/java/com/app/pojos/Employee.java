package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "emp_tbl")
public class Employee extends BaseEntity{

	@Column(length = 30)
	private String name;
	@Column(length = 30, unique = true)
	private String email;
	@Column
	private double salary;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	//association 
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department empdept;//obj of Department pojo
	
	public Employee() {
		System.out.println("in const. of " +getClass().getName());
	}

	public Employee(String name, String email, double salary, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Department getEmpdept() {
		return empdept;
	}

	public void setEmpdept(Department empdept) {
		this.empdept = empdept;
	}

	@Override
	public String toString() {
		return "Employee [id = "+getId()+"name=" + name + ", email=" + email + ", salary=" + salary + ", dob=" + dob + "]";
	}
	
	
}
