package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.pojos.Department;
import com.app.service.IDepartmentServ;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired//autowired Service layer
	private IDepartmentServ departmentServ;
	
	
//in dept controller
	public DepartmentController() {
		System.out.println("in dept. cont.");
	}
	
	@GetMapping("/list")
	public String showDepartmentList(Department dept,HttpSession session) {
		System.out.println("In  show department....");
		System.out.println(dept);
		List<Department> deps=  new ArrayList<>();
		//getting all department list from dept table
		deps =departmentServ.getAllDepartment();
		session.setAttribute("dept_list", deps);
		return "/department/list";//WEB_INF/views/departments/list
	}
	
	@PostMapping("/list")//postMapping of request
	public String processDepartmentList(Department dept,HttpSession session,Model modelMap) {
		System.out.println("In  show process department...");
		System.out.println(dept);
		List<Department> deps=  new ArrayList<>();
		deps =departmentServ.getAllDepartment();
		session.setAttribute("dept_list", deps);
		return "redirect:/department/hire";//WEB_INF/views/departments/hire
	}
	
}
