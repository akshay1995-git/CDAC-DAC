
package com.app.org;

public class Employee {
		private int Id;
		private String name;
		private double salary;
		
		public Employee(int Id , String name , double salary) 
		{
			this.Id = Id ;
			this.name = name ;
			this.salary = salary ;
		}
 
@Override
	public String toString() 
 	{
		return "Employee Id " +Id+" Name: "+name+" Salary: "+salary;
 	}
}
