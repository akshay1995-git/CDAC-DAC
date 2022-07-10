package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDepartmentDao;
import com.app.pojos.Department;

@Service
@Transactional
public class DepartmentServImpl implements IDepartmentServ{
	
	@Autowired
	private IDepartmentDao departmentDao;

	@Override
	public List<Department> getAllDepartment() {
		System.out.println("in serv layer : get all dept");
		return departmentDao.getAllDepartment();
		
	}

}
