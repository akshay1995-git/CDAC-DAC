package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept_tbl")
public class Department extends BaseEntity{

	@Column(name = "dept_name",length=30)
	private String deptName;
	@Column(length = 30)
	private String location;
	@Column
	private int strength;
	//association from dept to emp
	@OneToMany(mappedBy = "empdept",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
	List<Employee> emps = new ArrayList<>();
	
			
	public Department() {
		System.out.println("in const. of " +getClass().getName());
	}

	public Department(String deptName, String location, int strength) {
		super();
		this.deptName = deptName;
		this.location = location;
		this.strength = strength;
	}
//all setters and getter
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	//helper methods
	public void addEmployee(Employee employee) {
		emps.add(employee);
		employee.setEmpdept(this);
	}
	public void remEmployee(Employee employee) {
		emps.remove(employee);
		employee.setEmpdept(null);
	}

	@Override
	public String toString() {
		return "Department [id ="+getId()+"deptName=" + deptName + ", location=" + location + ", strength=" + strength + "]";
	}
	
	
	
	
}
