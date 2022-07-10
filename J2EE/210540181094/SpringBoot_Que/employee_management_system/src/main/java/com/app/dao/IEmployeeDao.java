package com.app.dao;

import com.app.pojos.Employee;

public interface IEmployeeDao {
	String hireEmployee(Employee empDetails,int deptId);
}
