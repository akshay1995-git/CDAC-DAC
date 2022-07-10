package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.pojos.Department;
import com.app.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao{

	@Autowired
	private EntityManager manager;
	@Override
	public String hireEmployee(Employee empDetails, int deptId) {
		System.out.println("in dao: emp");
		String mesg ="Employee hiring failed";
		Department dept = manager.find(Department.class,deptId);
		if(dept !=null){
			dept.addEmployee(empDetails);
			mesg = "Employee hired";
		}
		return mesg;
		
	}

	
}
