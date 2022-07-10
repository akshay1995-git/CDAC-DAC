package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;

@Repository
public class DepartmentDaoImpl implements IDepartmentDao {

	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Department> getAllDepartment() {
		System.out.println("in dao : get all dept");
		String jpql="select d from Department d";
		return manager.createQuery(jpql, Department.class).getResultList();
	}

}
