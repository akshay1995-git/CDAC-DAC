package com.app.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IEmployeeDao;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServImpl implements IEmployeeServ{

	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	public String hireEmployee(Employee empDetails, int deptId) {
		System.out.println("in serv layer : emp");
		if(empDetails.getSalary()>30000 && empDetails.getSalary()<40000) {
			if(empDetails.getDob().isBefore(LocalDate.parse("1996-01-01")) && empDetails.getDob().isAfter(LocalDate.parse("1986-01-01"))){
				return employeeDao.hireEmployee(empDetails, deptId);
					
					}
		}
			return "emp cannot be hired(age should be between 25 and 35 and salary between 30k to 40k)";
		
	}

	
}
