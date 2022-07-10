package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Employee;
import com.app.service.IEmployeeServ;

@Controller
@RequestMapping("/employee")//mapping of web req
public class EmployeeController {
	//autowiring dependencies
	@Autowired
	private IEmployeeServ employeeServ;
	
	public EmployeeController() {
		System.out.println("in employee controller..");
	}
	@GetMapping("/hire")
	public String showHireEmployee(Employee emp,HttpSession session,@RequestParam int deptId) {
		System.out.println("in employee show form..."+emp+" "+deptId);
		session.setAttribute("dept_id", deptId);
		return "/employee/hire";
	}
	
	@PostMapping("/hire")
	public String processHireEmployee(Employee empdetails,RedirectAttributes flashMap,Model map,HttpSession session) {
		System.out.println("in emp process form");
		int deptId = (int) session.getAttribute("dept_id");
		System.out.println(empdetails+" "+deptId);
		flashMap.addFlashAttribute(employeeServ.hireEmployee(empdetails, deptId));
		map.addAttribute("message", "Employee hired");
		return "redirect:/department/list";
	}

}
